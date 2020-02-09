package life.wz.community.community.controller;

import life.wz.community.community.Service.CommentService;
import life.wz.community.community.Service.QuestionService;
import life.wz.community.community.dto.CommentDTO;
import life.wz.community.community.dto.QuestionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model){
        List<CommentDTO> comments = commentService.listByQuestionId(id);
        questionService.incView(id);
        QuestionDTO questionDTO=questionService.getById(id);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        return "question";
    }
}
