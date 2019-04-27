package com.li.backoffice.web.controller;

import com.li.backoffice.model.Items;
import com.li.backoffice.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private IItemService itemService;

    @RequestMapping("list")
    public String list(Model model) {
        System.out.println("list");
        List<Items> list = itemService.findAllItems();
        for (Items item : list)
            System.out.println(item.getName() + ":" + item.getPrice());
        model.addAttribute("itemsList", list);
        return "items/list";
    }

    @RequestMapping("save")
    public String save() {
        Items items = new Items();
        items.setName("iphone x");
        items.setPrice(5439f);
        items.setDetail("挺好使的");
        items.setCreatetime(new Date());

        itemService.saveOrUpdate(items);
        return "/items/list";
    }

    @RequestMapping("delete")
    public String delete(Integer id, Model model) {

        itemService.deleteById(id);
        return "forward:list.do";
    }

    @RequestMapping("edit")
    public String edit(Integer id, Model model) {
        System.out.println("id:"+id);
        Items items = itemService.findById(id);
        if (items != null)
            model.addAttribute("items",items);
        return "items/edit";
    }

    @RequestMapping("update")
    public String update(Items items, Model model) {

        System.out.println(items );
        items.setCreatetime(new Date());
        itemService.saveOrUpdate(items);
        return "forward:list.do";
    }
}
