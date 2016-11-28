/**
 * 
 */
package com.ifelze.lms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifelze.lms.web.rest.vm.ManagedUserVM;

/**
 * @author nithya
 *
 */
@Controller
public class HomeController {
	@RequestMapping("start")
    public String getIndex(Model model){
        return "start";
    }
}
