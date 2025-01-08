package com.wyh;

import com.wyh.dao.SaleDao;
import com.wyh.po.SalesRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MmeberSystemApplicationTests {

    @Autowired
    public SaleDao saleDao;

    @Test
    void contextLoads(){
    }

}
