package com.newbee.homework.Impl;

import com.newbee.homework.Imp.ITeacherService;
import com.newbee.homework.entity.Student;
import com.newbee.homework.tools.MyRequestUtil;
import com.newbee.homework.tools.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


public class TeacherServiceImpl implements ITeacherService {
    static SqlSession session = SqlSessionFactoryUtil.openSqlSession();

    @Override
    public Boolean checkHomework(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        Map<String, Object> map=new HashMap<>();
        map.put("sid",httpSession.getAttribute("sid"));
        map.put("qid",httpSession.getAttribute("qid"));
        map.put("score", httpSession.getAttribute("score"));
        map.put("teacherAdvice", httpSession.getAttribute("teacherAdvice"));
        session.update("checkHomework", map);
        session.commit();
        return true;
    }
}
