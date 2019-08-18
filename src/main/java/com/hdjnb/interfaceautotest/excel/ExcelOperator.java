package com.hdjnb.interfaceautotest.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.hdjnb.interfaceautotest.constant.AppConfig;
import com.hdjnb.interfaceautotest.model.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class ExcelOperator {
    private Logger logger = LoggerFactory.getLogger(ExcelOperator.class);
    @Autowired
    private AppConfig appConfig;

    private List<Request> requests = new ArrayList<>();

    public void readRows() {
        try (InputStream is = new FileInputStream(appConfig.getExcelFileName())) {
            AnalysisEventListener listener = new ExcelListener(requests);
            ExcelReader reader = new ExcelReader(is, null, listener);
            reader.read();
        } catch (IOException e) {
            logger.error("read excel file error", e);
        }
    }

    public List<Request> getRequests() {
        return requests;
    }
}
