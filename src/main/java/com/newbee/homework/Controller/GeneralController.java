package com.newbee.homework.Controller;

import com.newbee.homework.Imp.IGeneralService;
import com.newbee.homework.entity.General;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    private IGeneralService generalService;

    @GetMapping("/getGeneralById/{id}")
    @ResponseBody
    public General getGeneralById(@PathVariable("id") int id){
        return generalService.getGeneralById(id);
    }

    @DeleteMapping("/deleteGeneralById/{id}")
    public Boolean deleteGeneralById(@PathVariable("id") int id){
        return generalService.deleteGeneralById(id);
    }

    @PostMapping("/addGeneral")
    public Boolean addGeneral(HttpServletRequest request){
        return generalService.addGeneral(request);
    }

    @PostMapping("/updateGeneral")
    public Boolean updateGeneral(HttpServletRequest request){
        return generalService.updateGeneral(request);
    }

    @GetMapping("/getGeneralByVideoId/{videoId}")
    @ResponseBody
    public List<General> getGeneralByVideoId(@PathVariable("videoId") int videoId){
        return generalService.getGeneralByVideoId(videoId);
    }
}
