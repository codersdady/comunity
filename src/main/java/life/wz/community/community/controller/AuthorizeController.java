package life.wz.community.community.controller;

import life.wz.community.community.dto.AccessTokenDTO;
import life.wz.community.community.dto.GithubUser;
import life.wz.community.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;


    @GetMapping("/callback")
    public String cllback(@RequestParam(name="code") String code,
                          @RequestParam(name="state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id("b0c8b7fd0f978f2e3843");
        accessTokenDTO.setClient_secret("c8a2682bdc3cd565f21890021a3625a2f2ab85b3");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);

        return "index";
    }
}
