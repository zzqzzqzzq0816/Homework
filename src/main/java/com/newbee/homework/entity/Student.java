package com.newbee.homework.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int sid;
    private int qid;
    private String answer;
    private String picPath;
    private String filePath;
    private Timestamp commitTime;
    private String  score;
    private String teacherAdvice;
}
