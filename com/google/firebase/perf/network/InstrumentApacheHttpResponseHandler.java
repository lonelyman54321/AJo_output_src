/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpMessage
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.ResponseHandler
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class InstrumentApacheHttpResponseHandler
implements ResponseHandler {
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final ResponseHandler responseHandlerDelegate;
    private final Timer timer;

    public InstrumentApacheHttpResponseHandler(ResponseHandler responseHandler, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.responseHandlerDelegate = responseHandler;
        this.timer = timer;
        this.networkMetricBuilder = networkRequestMetricBuilder;
    }

    public Object handleResponse(HttpResponse httpResponse) {
        Object object = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l2);
        object = this.networkMetricBuilder;
        Object object2 = httpResponse.getStatusLine();
        int n3 = object2.getStatusCode();
        ((NetworkRequestMetricBuilder)object).setHttpResponseCode(n3);
        object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpResponse);
        if (object != null) {
            object2 = this.networkMetricBuilder;
            long l3 = (Long)object;
            ((NetworkRequestMetricBuilder)object2).setResponsePayloadBytes(l3);
        }
        if ((object = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(httpResponse)) != null) {
            object2 = this.networkMetricBuilder;
            ((NetworkRequestMetricBuilder)object2).setResponseContentType((String)object);
        }
        this.networkMetricBuilder.build();
        return this.responseHandlerDelegate.handleResponse(httpResponse);
    }
}

