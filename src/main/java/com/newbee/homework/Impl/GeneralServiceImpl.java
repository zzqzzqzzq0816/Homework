package com.newbee.homework.Impl;

import com.newbee.homework.Imp.IGeneralService;
import com.newbee.homework.entity.General;
import com.newbee.homework.tools.MyRequestUtil;
import com.newbee.homework.tools.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("GeneralService")
public class GeneralServiceImpl implements IGeneralService {
    SqlSession session = SqlSessionFactoryUtil.openSqlSession();

    @Override
    public General getGeneralById(int id) {
        General general = session.selectOne("getGeneralById", id);
        return general;
    }

    @Override
    public Boolean deleteGeneralById(int id) {
        General general = session.selectOne("getGeneralById", id);
        if (general != null) {
            session.delete("deleteGeneralById", id);
            session.commit();
            return true;
        }
        return false;
    }

    @Override
    public Boolean addGeneral(HttpServletRequest request) {
        General general = MyRequestUtil.ReqToGeneral(request);
        session.insert("addGeneral", general);
        session.commit();
        return true;
    }

    @Override
    public Boolean updateGeneral(HttpServletRequest request) {
        General general = MyRequestUtil.ReqToGeneral(request);
        session.update("updateGeneral", general);
        session.commit();
        return true;
    }

    @Override
    public List<General> getGeneralByVideoId(int videoId) {
        List<General> generalList = session.selectList("getGeneralByVideoId", videoId);
        return generalList;
    }
}
