package com.newbee.homework.Controller;

import com.newbee.homework.Imp.IFillInBlankService;
import com.newbee.homework.entity.FillInBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/fillInBlank")
public class FillInBlankController {

    @Autowired
    private IFillInBlankService fillInBlankService;

    @GetMapping("/getFillInBlankById/{id}")
    @ResponseBody
    public FillInBlank getFillInBlankById(@PathVariable("id") int id){
        return fillInBlankService.getFillInBlankById(id);
    }

    @DeleteMapping("/deleteFillInBlankById/{id}")
    public Boolean deleteFillInBlankById(@PathVariable("id")int id){
        return fillInBlankService.deleteFillInBlankById(id);
    }

    @PostMapping("/addFillInBlank")
    public Boolean addFillInBlank(HttpServletRequest request){
        return fillInBlankService.addFillInBlank(request);
    }

    @PostMapping("/updateFillInBlank")
    public Boolean updateFillInBlank(HttpServletRequest request){
        return fillInBlankService.updateFillInBlank(request);
    }

    @GetMapping("/getFillInBlankByVideoId/{videoId}")
    @ResponseBody
    public List<FillInBlank> getFillInBlankByVideoId(@PathVariable("videoId") int videoId){
        return fillInBlankService.getFillInBlankByVideoId(videoId);
    }
}
