package com.hdjnb.interfaceautotest.excel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class ExcelOperatorTest extends BaseTest {
    @Autowired
    private ExcelOperator excelOperator;

    @Test
    public void readRows() {
        excelOperator.readRows();
        Assert.assertEquals(excelOperator.getRequests().size(), 2);
    }
}
