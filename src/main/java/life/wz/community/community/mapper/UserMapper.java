package life.wz.community.community.mapper;

import life.wz.community.community.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into USER (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void inset(User user);

    @Select("select * from USER where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from USER where id = #{creator}")
    User findById(@Param("creator") Integer creator);

    @Select("select * from user where account_id=#{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update user set name=#{name},token=#{token},gmt_modified=#{gmtModified},avatar_url=#{avatarUrl} where account_id = #{accountId}")
    void update(User dbuser);
}
