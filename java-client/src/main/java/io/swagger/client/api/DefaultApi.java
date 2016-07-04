package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse200;
import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-25T14:19:40.535Z")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Gets &#x60;Calls&#x60; info. 
   * @param rptType Report type. (0 report, 1 widget, 2 chart). (required)
   * @param rptId Report id. (required)
   * @param start Start offset. (optional)
   * @param limit Number of results to return. Max 10K. (optional)
   * @param sortBy Sort column. (optional)
   * @param sortType Sort mode asc/desc. (optional)
   * @param fromDate Start date time. (optional)
   * @param toDate End date time. (optional)
   * @param duration Duration range. (optional)
   * @param phone List of caller phone. (optional)
   * @param phone1 List of dialled phones. (optional)
   * @param co List of trunk/co. (optional)
   * @param ext list of extensions. (optional)
   * @param pbxId list of PBX Ids. (optional)
   * @param callSource list of callsource. (optional)
   * @param callType list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls) (optional)
   * @param direction list of direction.(0 incoming, 1 outgoing, 2 internal) (optional)
   * @param callerName list of caller name. (optional)
   * @param did list of did. (optional)
   * @param dnis list of dnis. (optional)
   * @param acc list of account code. (optional)
   * @param ring Ring range.Seconds unit. (optional)
   * @param cost Cost range. (optional)
   * @param group Department/Group id. (optional)
   * @return List<InlineResponse200>
   * @throws ApiException if fails to make API call
   */
  public List<InlineResponse200> callsGet(Double rptType, Double rptId, BigDecimal start, BigDecimal limit, String sortBy, String sortType, String fromDate, String toDate, BigDecimal duration, String phone, String phone1, String co, String ext, BigDecimal pbxId, BigDecimal callSource, BigDecimal callType, BigDecimal direction, String callerName, String did, String dnis, String acc, BigDecimal ring, BigDecimal cost, BigDecimal group) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'rptType' is set
    if (rptType == null) {
      throw new ApiException(400, "Missing the required parameter 'rptType' when calling callsGet");
    }
    
    // verify the required parameter 'rptId' is set
    if (rptId == null) {
      throw new ApiException(400, "Missing the required parameter 'rptId' when calling callsGet");
    }
    
    // create path and map variables
    String localVarPath = "/Calls".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rptType", rptType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rptId", rptId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortType", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromDate", fromDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toDate", toDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone", phone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone1", phone1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "co", co));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ext", ext));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pbxId", pbxId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "callSource", callSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "callType", callType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "callerName", callerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dnis", dnis));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "acc", acc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ring", ring));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cost", cost));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group", group));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<InlineResponse200>> localVarReturnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Gets &#x60;Charts&#x60; list. 
   * @return List<InlineResponse200>
   * @throws ApiException if fails to make API call
   */
  public List<InlineResponse200> featuresChartsGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Features/charts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<InlineResponse200>> localVarReturnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Gets &#x60;Reports&#x60; list. 
   * @return List<InlineResponse200>
   * @throws ApiException if fails to make API call
   */
  public List<InlineResponse200> featuresReportsGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Features/reports".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<InlineResponse200>> localVarReturnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Gets &#x60;Widgets&#x60; list. 
   * @return List<InlineResponse200>
   * @throws ApiException if fails to make API call
   */
  public List<InlineResponse200> featuresWidgetGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Features/widget".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<InlineResponse200>> localVarReturnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
