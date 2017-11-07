package spring.std.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import spring.std.dao.mapper.HomeMapper;
import spring.std.vo.Stadium;

@Service
public class HomeService extends EgovAbstractServiceImpl{

    @Resource
    HomeMapper homeMapper; 

    public List<Stadium> home() {
        return homeMapper.home();
    }

}
