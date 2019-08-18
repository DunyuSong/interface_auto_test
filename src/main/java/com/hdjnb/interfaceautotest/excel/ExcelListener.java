package com.hdjnb.interfaceautotest.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.hdjnb.interfaceautotest.model.Request;

import java.util.ArrayList;
import java.util.List;
import static com.hdjnb.interfaceautotest.utils.RequestUtils.*;

public class ExcelListener extends AnalysisEventListener {
    private int lineNumber = 0;

    private List<Request> requests;

    public ExcelListener(List<Request> requests) {
        this.requests = requests;
    }

    /** read single excel row, transfer to {@link Request}
        columns' order: [id, name, url, type, headers, params, body
      @param 
    */
    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Object o, AnalysisContext analysisContext) {
        List<Object> columns = (ArrayList<Object>)o;
        if (lineNumber > 0) {
            Request request = buildRequest(columns);
            if (request != null) {
                requests.add(request);
            }
        }

        lineNumber++;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }


}
