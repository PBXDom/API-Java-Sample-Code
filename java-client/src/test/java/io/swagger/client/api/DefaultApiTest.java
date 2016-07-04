package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse200;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Gets &#x60;Calls&#x60; info. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsGetTest() throws ApiException {
        Double rptType = null;
        Double rptId = null;
        BigDecimal start = null;
        BigDecimal limit = null;
        String sortBy = null;
        String sortType = null;
        String fromDate = null;
        String toDate = null;
        BigDecimal duration = null;
        String phone = null;
        String phone1 = null;
        String co = null;
        String ext = null;
        BigDecimal pbxId = null;
        BigDecimal callSource = null;
        BigDecimal callType = null;
        BigDecimal direction = null;
        String callerName = null;
        String did = null;
        String dnis = null;
        String acc = null;
        BigDecimal ring = null;
        BigDecimal cost = null;
        BigDecimal group = null;
        // List<InlineResponse200> response = api.callsGet(rptType, rptId, start, limit, sortBy, sortType, fromDate, toDate, duration, phone, phone1, co, ext, pbxId, callSource, callType, direction, callerName, did, dnis, acc, ring, cost, group);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets &#x60;Charts&#x60; list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void featuresChartsGetTest() throws ApiException {
        // List<InlineResponse200> response = api.featuresChartsGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets &#x60;Reports&#x60; list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void featuresReportsGetTest() throws ApiException {
        // List<InlineResponse200> response = api.featuresReportsGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets &#x60;Widgets&#x60; list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void featuresWidgetGetTest() throws ApiException {
        // List<InlineResponse200> response = api.featuresWidgetGet();

        // TODO: test validations
    }
    
}
