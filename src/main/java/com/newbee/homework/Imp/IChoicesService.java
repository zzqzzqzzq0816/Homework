package com.newbee.homework.Imp;

import com.newbee.homework.entity.Choices;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IChoicesService {
    Choices getChoicesById(int id);

    Boolean deleteChoicesById(int id);

    Boolean addChoices(HttpServletRequest request);

    Boolean updateChoices(HttpServletRequest request);

    List<Choices> getChoicesByVideoId(int videoId);

}
