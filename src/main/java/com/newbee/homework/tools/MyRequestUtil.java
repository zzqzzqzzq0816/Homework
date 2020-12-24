package com.newbee.homework.tools;

import com.newbee.homework.entity.Choices;
import com.newbee.homework.entity.FillInBlank;
import com.newbee.homework.entity.General;
import com.newbee.homework.entity.Student;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

public class MyRequestUtil {
    public static Choices ReqToChoices(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        String picPath = null;
        String filePath = null;
        MultipartFile picture = (MultipartFile) httpSession.getAttribute("picture");
        MultipartFile file = (MultipartFile) httpSession.getAttribute("file");
        if(picture!=null){
            picPath = OSSService.uploadFileAvatar(picture);
        }
        if(file!=null){
            filePath = OSSService.uploadFileAvatar(file);
        }
        Choices choices = new Choices(
                (int)httpSession.getAttribute("id"),(int)httpSession.getAttribute("videoId"),
                (String)httpSession.getAttribute("topic"), (int)httpSession.getAttribute("times"),
                picPath,filePath,(Timestamp)httpSession.getAttribute("deadline"),
                (String)httpSession.getAttribute("question"),(String)httpSession.getAttribute("choiceA"),
                (String)httpSession.getAttribute("choiceB"), (String)httpSession.getAttribute("choiceC"),
                (String)httpSession.getAttribute("choiceD"),(String)httpSession.getAttribute("answer"));
        return choices;
    }
    public static FillInBlank ReqToFillInBlank(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        String picPath = null;
        String filePath = null;
        MultipartFile picture = (MultipartFile) httpSession.getAttribute("picture");
        MultipartFile file = (MultipartFile) httpSession.getAttribute("file");
        if(picture!=null){
            picPath = OSSService.uploadFileAvatar(picture);
        }
        if(file!=null){
            filePath = OSSService.uploadFileAvatar(file);
        }
        FillInBlank fillInBlank = new FillInBlank(
                (int)httpSession.getAttribute("id"),(int)httpSession.getAttribute("videoId"),
                (String)httpSession.getAttribute("topic"), (int)httpSession.getAttribute("times"),
                picPath,filePath,(Timestamp)httpSession.getAttribute("deadline"),
                (String)httpSession.getAttribute("question"),(String)httpSession.getAttribute("answer"));
        return fillInBlank;
    }
    public static General ReqToGeneral(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        String picPath = null;
        String filePath = null;
        MultipartFile picture = (MultipartFile) httpSession.getAttribute("picture");
        MultipartFile file = (MultipartFile) httpSession.getAttribute("file");
        if(picture!=null){
            picPath = OSSService.uploadFileAvatar(picture);
        }
        if(file!=null){
            filePath = OSSService.uploadFileAvatar(file);
        }
        General general = new General(
                (int)httpSession.getAttribute("id"),(int)httpSession.getAttribute("videoId"),
                (String)httpSession.getAttribute("topic"), (int)httpSession.getAttribute("times"),
                picPath,filePath,(Timestamp)httpSession.getAttribute("deadline"),
                (String)httpSession.getAttribute("question"),(String)httpSession.getAttribute("answer"));
        return general;
    }
    public static Student ReqToStudent(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        String picPath = null;
        String filePath = null;
        MultipartFile picture = (MultipartFile) httpSession.getAttribute("picture");
        MultipartFile file = (MultipartFile) httpSession.getAttribute("file");
        if(picture!=null){
            picPath = OSSService.uploadFileAvatar(picture);
        }
        if(file!=null){
            filePath = OSSService.uploadFileAvatar(file);
        }
        Student student = new Student(
                (int)httpSession.getAttribute("sid"), (int)httpSession.getAttribute("qid"),
                (String)httpSession.getAttribute("answer"),picPath,filePath,
                (Timestamp)httpSession.getAttribute("commitTime"), null, null);
        return student;
    }
}
