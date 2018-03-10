package controller;

import domain.User;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.SignInService;
import service.impl.LoginServiceImpl;

@Controller
public class Homecontroller {

    @Autowired
    private SignInService signInService;

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("user",loginService.list());
        return "login";
    }
    @RequestMapping("zhuce")
    public String zhuce(){
        return "zhucezhanghu";
    }




    @RequestMapping("toSignIn")
    public String toSignIn(){
        return "signIn";
    }


    @RequestMapping("signIn")
    public String  signId(User user){

     signInService.signIn(user);
        return "login";

    }

}
