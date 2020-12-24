package com.newbee.homework.Controller;

import com.newbee.homework.Imp.IChoicesService;
import com.newbee.homework.entity.Choices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(value = "/choices")
public class ChoicesController {

    @Autowired
    private IChoicesService choicesService;

    @GetMapping("/getChoicesById/{id}")
    @ResponseBody
    public Choices getChoicesById(@PathVariable("id") int id) {
        return choicesService.getChoicesById(id);
    }

    @DeleteMapping("/deleteChoicesById/{id}")
    public Boolean deleteChoicesById(@PathVariable("id") int id) {
        return choicesService.deleteChoicesById(id);
    }

    @PostMapping("/addChoices")
    public Boolean addChoices(HttpServletRequest request) {
        return choicesService.addChoices(request);
    }

    @PostMapping("/updateChoices")
    public Boolean updateChoices(HttpServletRequest request) {
        return choicesService.updateChoices(request);
    }

    @GetMapping("/getChoicesByVideoId/{videoId}")
    @ResponseBody
    public List<Choices> getChoicesByVideoId(@PathVariable("videoId") int videoId) {
        return choicesService.getChoicesByVideoId(videoId);
    }
}
