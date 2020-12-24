package com.newbee.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class General {
    private int id;
    private int videoId;
    private String topic;
    private int times;
    private String picPath;
    private String filePath;
    private Timestamp deadline;
    private String question;
    private String answer;
}
