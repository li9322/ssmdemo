package com.li.backoffice.service;

import com.li.backoffice.model.Items;

import java.util.List;

public interface IItemService {
    public List<Items> findAllItems();
    public Items findById(Integer id);
    public void saveOrUpdate(Items items);
    public void deleteById(Integer id);
}
