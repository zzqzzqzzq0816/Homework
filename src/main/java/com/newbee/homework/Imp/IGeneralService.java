package com.newbee.homework.Imp;

import com.newbee.homework.entity.General;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IGeneralService {
    General getGeneralById(int id);

    Boolean deleteGeneralById(int id);

    Boolean addGeneral(HttpServletRequest request);

    Boolean updateGeneral(HttpServletRequest request);

    List<General> getGeneralByVideoId(int videoId);
}
