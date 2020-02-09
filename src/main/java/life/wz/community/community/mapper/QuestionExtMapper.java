package life.wz.community.community.mapper;

import life.wz.community.community.model.Question;

public interface QuestionExtMapper {


   int incView(Question record);
   int incCommentCount(Question record);

}