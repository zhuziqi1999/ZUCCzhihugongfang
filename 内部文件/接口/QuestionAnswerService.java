package com.core.service;


import com.core.po.Answer;
import com.core.po.Question;
import com.core.po.ResultList;

import java.util.List;

/**
 * 问答模块Service层接口
 */
public interface QuestionAnswerService {
    /*显示问题列表*/
    List<Question> showQuestionList();

    /*发布问题*/
    void appendQuestion(String QuestionTitle,String QuestionContent,String QuestionImage);

    /*显示问题及回答及评论*/
    List<ResultList> showQuestion(String QuestionId);

    /*查询单个问题*/
    Question searchSingleQuestion(String QuestionId);

    /*修改单个问题*/
    boolean alterSingleQuestion(String questionId, String QuestionTitle, String QuestionContent, String QuestionImage);

    /*删除问题*/
    boolean deleteQuestion(String questionId);

    /*删除回答*/
    boolean DeleteAnswer(String answerId);

    /*发布评论*/
    boolean appendComment(String questionId, String answerId, String answerContent, String replyCommentId, String replyUserId);

    /*删除评论*/
    boolean DeleteCommnet(String commentId);

    /*发布回答*/
    boolean appendAnswer(String answerId,String answerTitle, String answerContent, String AnswerImage);

    /*查询单个回答*/
    Answer searchSingleAnswer(String answerId);

    /*修改单个回答*/
    boolean alterSingleAnswer(String answerId, String answerTitle, String answerContent, String answerImage);
}
