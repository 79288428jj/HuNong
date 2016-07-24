package com.geowind.hunong.dao;

import java.util.Map;

/**
 * Created by Kui on 2016/7/21.
 */
public interface MapDao {

    public Map<String, Object> selectFarmlandInfo(String userId);
}
