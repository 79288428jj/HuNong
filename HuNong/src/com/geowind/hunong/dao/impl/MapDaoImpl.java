package com.geowind.hunong.dao.impl;

import com.geowind.hunong.dao.MapDao;
import com.geowind.hunong.util.DBHelper;

import java.util.Map;

/**
 * Created by Kui on 2016/7/21.
 */
public class MapDaoImpl implements MapDao {
    @Override
    public Map<String, Object> selectFarmlandInfo(String userId) {
        String sql = "select * from Farmland where uname=?";
        return DBHelper.doQueryOne(sql, userId);
    }
}
