package com.newbee.homework.Imp;

import com.newbee.homework.entity.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IStudentService {
    Boolean commitHomework(HttpServletRequest request);
    Student getHomeworkByQid(int sid, int qid);
    Boolean updateHomework(HttpServletRequest request);
    List<Student> getHomeworkList(int sid);
}
