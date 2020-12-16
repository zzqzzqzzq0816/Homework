package com.newbee.homework.Imp;

import com.newbee.homework.entity.FillInBlank;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IFillInBlankService {
    FillInBlank getFillInBlankById(int id);

    Boolean deleteFillInBlankById(int id);

    Boolean addFillInBlank(HttpServletRequest request);

    Boolean updateFillInBlank(HttpServletRequest request);

    List<FillInBlank> getFillInBlankByVideoId(int videoId);
}