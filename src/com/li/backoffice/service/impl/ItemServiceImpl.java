package com.li.backoffice.service.impl;

import com.li.backoffice.mapper.ItemsMapper;
import com.li.backoffice.model.Items;
import com.li.backoffice.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements IItemService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {
        if (items.getId() == null){
            itemsMapper.insert(items);
//            int i=10/0;
        }else {
            itemsMapper.updateByPrimaryKeySelective(items);
        }
    }

    @Override
    public void deleteById(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
