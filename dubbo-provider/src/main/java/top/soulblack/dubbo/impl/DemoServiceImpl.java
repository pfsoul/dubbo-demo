package top.soulblack.dubbo.impl;

import top.soulblack.dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/19 10:12
 * @Version 1.0
 */
public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(Long id) {
        List<String> list = new ArrayList<String>();
        list.add(String.format("Permission_%d", id - 1));
        list.add(String.format("Permission_%d", id ));
        list.add(String.format("Permission_%d", id + 1));
        return list;
    }

}
