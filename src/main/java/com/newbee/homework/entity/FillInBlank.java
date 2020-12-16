package com.newbee.homework.entity;

import com.newbee.homework.other.MyRequestUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletRequest;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FillInBlank {
    private int id;
    private int videoId;
    private String question;
    private String answer;

    public static FillInBlank ReqToFillInBlank(HttpServletRequest request) {
        return MyRequestUtil.getParameterObject(request, FillInBlank.class);
    }
}
