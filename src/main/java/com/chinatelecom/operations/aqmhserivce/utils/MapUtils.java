
package com.chinatelecom.operations.aqmhserivce.utils;

import java.util.HashMap;


/**
 * Map工具类(链式调用)
 *
 * @author sunhu
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
