package com.springsource.roo.productimport.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/producttypes")
@Controller
@RooWebScaffold(path = "producttypes", formBackingObject = ProductType.class)
public class ProductTypeController {
}
