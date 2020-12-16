package com.newbee.homework.entity;

import com.newbee.homework.other.MyRequestUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletRequest;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class General {
    private int id;
    private int videoId;
    private String question;
    private String answer;

    public static General ReqToGeneral(HttpServletRequest request) {
        return MyRequestUtil.getParameterObject(request, General.class);
    }
}
