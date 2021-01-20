package com.ivoronline.springboot_security_authorization_roles.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @Secured("ROLE_ADMIN")
  @RequestMapping("/OnlyAdmin")
    public String onlyAdmin() {
    return "Only ROLE_ADMIN";
  }

  @ResponseBody
  @Secured({"ROLE_ADMIN","ROLE_USER"})
  @RequestMapping("/AdminAndUser")
  public String adminAndUser() {
    return "ROLE_ADMIN and ROLE_USER";
  }

}
