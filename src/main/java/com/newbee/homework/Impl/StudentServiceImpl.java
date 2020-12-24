package com.newbee.homework.Impl;

import com.newbee.homework.Imp.IStudentService;
import com.newbee.homework.entity.Student;
import com.newbee.homework.tools.MyRequestUtil;
import com.newbee.homework.tools.SqlSessionFactoryUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements IStudentService {

    static SqlSession session = SqlSessionFactoryUtil.openSqlSession();
    @Override
    public Boolean commitHomework(HttpServletRequest request) {
        Student student = MyRequestUtil.ReqToStudent(request);
        session.insert("commitHomework", student);
        session.commit();
        return true;
    }

    @Override
    public Student getHomeworkByQid( int sid,  int qid) {
        Map<String,Integer> map = new HashMap<>();
        map.put("sid",sid);
        map.put("qid",qid);
        Student student = session.selectOne("getHomeworkByQid",map);
        return student;
    }

    @Override
    public Boolean updateHomework(HttpServletRequest request) {
        Student student = MyRequestUtil.ReqToStudent(request);
        session.update("updateHomework", student);
        session.commit();
        return true;
    }

    @Override
    public List<Student> getHomeworkList(int sid) {
        List<Student> studentList = session.selectList("getHomeworkList", sid);
        return studentList;
    }
}
