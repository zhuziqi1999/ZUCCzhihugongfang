package com.core.po;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private String id;                  /*id*/
    private String title;               /*标题*/
    private String image;               /*图片*/
    private String time;                /*发布时间*/
    private String userNickname;        /*用户昵称*/
    private String userAvatar;          /*用户头像*/
    private String likenum;             /*点赞数*/
    private String replyNumber;         /*回答数*/
}
