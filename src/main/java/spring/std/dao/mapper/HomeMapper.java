package spring.std.dao.mapper;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import spring.std.vo.Stadium;

@Mapper
public interface HomeMapper {

    List<Stadium> home();
}
