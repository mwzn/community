package life.majiang.community.mapper;

import life.majiang.community.model.Question;

public interface QuestionExtMapper {
    int incViews(Question record);
    int incCommentCount(Question record);
}