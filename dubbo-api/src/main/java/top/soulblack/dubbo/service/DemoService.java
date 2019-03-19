package top.soulblack.dubbo.service;

import java.util.List;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/19 10:10
 * @Version 1.0
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
