package com.geowind.hunong.service.impl;

import com.geowind.hunong.dao.MapDao;
import com.geowind.hunong.dao.impl.MapDaoImpl;
import com.geowind.hunong.entity.Farmland;
import com.geowind.hunong.service.MapService;

import java.util.Map;

/**
 * Created by Kui on 2016/7/21.
 */
public class MapServiceImpl implements MapService {

    private MapDao mapDao;

    public MapServiceImpl() {
        mapDao = new MapDaoImpl();
    }

    @Override
    public String getMapInfo(String userId) {
        Map<String, Object> result = mapDao.selectFarmlandInfo(userId);
        Farmland farmland = new Farmland();
        //farmland.setArea(result.get(""));
        return  "";
    }
}
