package life.wz.community.community.mapper;

import life.wz.community.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {


   int incView(Question record);
   int incCommentCount(Question record);
   List<Question> selectRelated(Question question);

}