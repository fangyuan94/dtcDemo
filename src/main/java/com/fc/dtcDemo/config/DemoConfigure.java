package com.fc.dtcDemo.config;

import com.fc.dtc.bean.DictionaryBean;
import com.fc.dtc.cache.DictionaryJDBCActuator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Configuration
public class DemoConfigure {

    @Bean
    public DictionaryJDBCActuator dictionaryJDBCActuator(){

        return new DictionaryJDBCActuator() {
            //
            @Override
            public List<DictionaryBean> execute(JdbcTemplate jdbcTemplate) {

                String sql = "select  type,name,code,item_order as item_order from dictionary where status =1";

                Object[] param = new Object[0];

                return jdbcTemplate.query(sql,param, new BeanPropertyRowMapper<>(DictionaryBean.class));

            }
        };
    }

}
