package com.li.backoffice.web.controller;

import com.li.backoffice.model.Items;
import com.li.backoffice.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private IItemService itemService;

    @RequestMapping("list")
    public String list(){
        System.out.println("list");
        List<Items> list=itemService.findAllItems();
        for (Items item:list)
            System.out.println(item.getName() + ":" + item.getPrice());
        return "user/list";
    }
}
