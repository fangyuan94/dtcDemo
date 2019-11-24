package com.fc.dtcDemo.config;

import com.fc.dtc.bean.DisctionaryBean;
import com.fc.dtc.cache.DisctionaryJDBCActuator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Configuration
public class DemoConfigure {

    @Bean
    public DisctionaryJDBCActuator disctionaryJDBCActuator(){

        return new DisctionaryJDBCActuator() {
            //
            @Override
            public List<DisctionaryBean> execute(JdbcTemplate jdbcTemplate) {

                String sql = "select dictionary_code as type,name,code,item_order as item_order from dictionary_item where status =1";

                Object[] param = new Object[0];

                return jdbcTemplate.query(sql,param, new BeanPropertyRowMapper<>(DisctionaryBean.class));

            }
        };
    }

}
