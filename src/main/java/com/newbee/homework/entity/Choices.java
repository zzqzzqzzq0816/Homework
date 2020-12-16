package com.newbee.homework.entity;

import com.newbee.homework.other.MyRequestUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choices {
    private int id;
    private int videoId;
    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String answer;

    public static Choices ReqToChoices(HttpServletRequest request) {
        return MyRequestUtil.getParameterObject(request, Choices.class);
    }
}
