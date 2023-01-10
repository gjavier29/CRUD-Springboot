package com.javi.crudspring.controller;

import com.javi.crudspring.model.ApiResultModel;
import com.javi.crudspring.model.Item;
import com.javi.crudspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public ApiResultModel getAll() {
        return ApiResultModel.builder()
                .Message("Item List")
                .ResultData(itemService.getItemList())
                .IsSuccess(true)
                .build();
    }
//    @GetMapping
//    public List<Item> getAll() {
//        return itemService.getItemList();
//    }
}
