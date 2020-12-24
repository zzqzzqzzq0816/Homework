package com.newbee.homework.Controller;

import com.newbee.homework.Imp.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    static ITeacherService teacherService;

    @PostMapping("/checkHomework")
    public Boolean checkHomework(HttpServletRequest request){
        return teacherService.checkHomework(request);
    }
}
