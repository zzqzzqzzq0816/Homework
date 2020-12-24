package com.newbee.homework.Controller;

import com.newbee.homework.Imp.IStudentService;
import com.newbee.homework.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    static IStudentService studentService;

    @PostMapping("/commitHomework")
    public Boolean commitHomework(HttpServletRequest request){
        return studentService.commitHomework(request);
    }

    @GetMapping("/getHomeworkByQid/{sid}/{qid}")
    @ResponseBody
    public Student getHomeworkByQid(@PathVariable("sid") int sid,@PathVariable("qid")int qid){
        return studentService.getHomeworkByQid(sid,qid);
    }

    @PostMapping("/updateHomework")
    public Boolean updateHomework(HttpServletRequest request){
        return studentService.updateHomework(request);
    }

    @GetMapping("/getHomeworkList/{sid}")
    @ResponseBody
    public List<Student> getHomeworkList(@PathVariable("sid") int sid){
        return studentService.getHomeworkList(sid);
    }
}
