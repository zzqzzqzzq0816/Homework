package com.newbee.homework.Impl;

import com.newbee.homework.Imp.IChoicesService;
import com.newbee.homework.entity.Choices;
import com.newbee.homework.tools.MyRequestUtil;
import com.newbee.homework.tools.OSSService;
import com.newbee.homework.tools.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Service("ChoicesService")
public class ChoicesServiceImpl implements IChoicesService {

    static SqlSession session = SqlSessionFactoryUtil.openSqlSession();

    @Override
    public Choices getChoicesById(int id) {
        Choices choices = session.selectOne("getChoicesById", id);
        return choices;
    }

    @Override
    public Boolean deleteChoicesById(int id) {
        Choices choices = session.selectOne("getChoicesById", id);
        if (choices != null) {
            session.delete("deleteChoicesById", id);
            session.commit();
            return true;
        }
        return false;
    }

    @Override
    public Boolean addChoices(HttpServletRequest request) {
        Choices choices = MyRequestUtil.ReqToChoices(request);
        session.insert("addChoices", choices);
        session.commit();
        return true;
    }

    @Override
    public Boolean updateChoices(HttpServletRequest request) {
        Choices choices = MyRequestUtil.ReqToChoices(request);
        session.update("updateChoices", choices);
        session.commit();
        return true;
    }

    @Override
    public List<Choices> getChoicesByVideoId(int videoId) {
        List<Choices> choicesList = session.selectList("getChoicesByVideoId", videoId);
        return choicesList;
    }
}
