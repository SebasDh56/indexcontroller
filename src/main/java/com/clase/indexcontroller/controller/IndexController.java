package com.clase.indexcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @PostMapping("/welcome")
    @ResponseBody
    public String welcome(
            @RequestParam(required = false, name = "param") String[] paramArray) {
        String msg = "";
        int i = 0;
        if (paramArray == null) {
            msg = "El array esta vacio";
        } else {
            for (String paramArrayItem : paramArray) {
                if (paramArrayItem == null) {
                    msg += "param[" + i + "]null\n";
                } else {
                    if (i == 0 && paramArrayItem.length() > 0) {
                        String firstCapital =
                            paramArrayItem.substring(0, 1).toUpperCase()
                            + paramArrayItem.substring(1);
                        msg += "param[" + i + "]" + firstCapital + "\n";
                    } else {
                        msg += "param[" + i + "]" + paramArrayItem + "\n";
                    }
                }
                i++;
            }
        }
        return msg;
    }
}
