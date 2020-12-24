package com.newbee.homework.Impl;

import com.newbee.homework.Imp.IFillInBlankService;
import com.newbee.homework.entity.FillInBlank;
import com.newbee.homework.tools.MyRequestUtil;
import com.newbee.homework.tools.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("FillInBlankService")
public class FillInBlankServiceImpl implements IFillInBlankService {
    static SqlSession session = SqlSessionFactoryUtil.openSqlSession();

    @Override
    public FillInBlank getFillInBlankById(int id) {
        FillInBlank fillInBlank = session.selectOne("getFillInBlankById", id);
        return fillInBlank;
    }

    @Override
    public Boolean deleteFillInBlankById(int id) {
        FillInBlank fillInBlank = session.selectOne("getFillInBlankById", id);
        if (fillInBlank != null) {
            session.delete("deleteFillInBlankById", id);
            session.commit();
            return true;
        }
        return false;
    }

    @Override
    public Boolean addFillInBlank(HttpServletRequest request) {
        FillInBlank fillInBlank = MyRequestUtil.ReqToFillInBlank(request);
        session.insert("addFillInBlank", fillInBlank);
        session.commit();
        return true;
    }

    @Override
    public Boolean updateFillInBlank(HttpServletRequest request) {
        FillInBlank fillInBlank = MyRequestUtil.ReqToFillInBlank(request);
        session.update("updateFillInBlank", fillInBlank);
        session.commit();
        return true;
    }

    @Override
    public List<FillInBlank> getFillInBlankByVideoId(int videoId) {
        List<FillInBlank> fillInBlankList = session.selectList("getFillInBlankByVideoId", videoId);
        return fillInBlankList;
    }
}
