/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpHost
 *  org.apache.http.HttpMessage
 *  org.apache.http.HttpRequest
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.ResponseHandler
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.protocol.HttpContext
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrumentApacheHttpResponseHandler;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    public static Object execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpHost, httpRequest, responseHandler, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block3: {
            long l2;
            Object object;
            block2: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    object = new StringBuilder();
                    String string2 = httpHost.toURI();
                    ((StringBuilder)object).append(string2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getUri();
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    object = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getMethod();
                    ((NetworkRequestMetricBuilder)object).setHttpMethod(string2);
                    object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpRequest);
                    if (object == null) break block2;
                    l2 = (Long)object;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block3;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            object = new InstrumentApacheHttpResponseHandler(responseHandler, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
            return httpClient2.execute(httpHost, httpRequest, (ResponseHandler)object);
        }
        long l3 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static Object execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpHost, httpRequest, responseHandler, httpContext, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block3: {
            long l2;
            Object object;
            block2: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    object = new StringBuilder();
                    String string2 = httpHost.toURI();
                    ((StringBuilder)object).append(string2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getUri();
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    object = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getMethod();
                    ((NetworkRequestMetricBuilder)object).setHttpMethod(string2);
                    object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpRequest);
                    if (object == null) break block2;
                    l2 = (Long)object;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block3;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            object = new InstrumentApacheHttpResponseHandler(responseHandler, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
            return httpClient2.execute(httpHost, httpRequest, (ResponseHandler)object, httpContext);
        }
        long l3 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static Object execute(HttpClient httpClient2, HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpUriRequest, responseHandler, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object execute(HttpClient httpClient2, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block3: {
            long l2;
            Object object;
            block2: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    object = httpUriRequest.getURI();
                    object = ((URI)object).toString();
                    object = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
                    String string2 = httpUriRequest.getMethod();
                    ((NetworkRequestMetricBuilder)object).setHttpMethod(string2);
                    object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpUriRequest);
                    if (object == null) break block2;
                    l2 = (Long)object;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block3;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            object = new InstrumentApacheHttpResponseHandler(responseHandler, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
            return httpClient2.execute(httpUriRequest, (ResponseHandler)object);
        }
        long l3 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static Object execute(HttpClient httpClient2, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpUriRequest, responseHandler, httpContext, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object execute(HttpClient httpClient2, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block3: {
            long l2;
            Object object;
            block2: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    object = httpUriRequest.getURI();
                    object = ((URI)object).toString();
                    object = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
                    String string2 = httpUriRequest.getMethod();
                    ((NetworkRequestMetricBuilder)object).setHttpMethod(string2);
                    object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpUriRequest);
                    if (object == null) break block2;
                    l2 = (Long)object;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block3;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            object = new InstrumentApacheHttpResponseHandler(responseHandler, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
            return httpClient2.execute(httpUriRequest, (ResponseHandler)object, httpContext);
        }
        long l3 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static HttpResponse execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpHost, httpRequest, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse execute(HttpClient httpClient2, HttpHost object, HttpRequest httpRequest, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block5: {
            long l2;
            block4: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    Object object2 = new StringBuilder();
                    String string2 = object.toURI();
                    ((StringBuilder)object2).append(string2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getUri();
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    object2 = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getMethod();
                    ((NetworkRequestMetricBuilder)object2).setHttpMethod(string2);
                    object2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpRequest);
                    if (object2 == null) break block4;
                    l2 = (Long)object2;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            httpClient2 = httpClient2.execute((HttpHost)object, httpRequest);
            long l3 = timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
            object = httpClient2.getStatusLine();
            int n3 = object.getStatusCode();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setHttpResponseCode(n3);
            object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpClient2);
            if (object != null) {
                l3 = (Long)object;
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponsePayloadBytes(l3);
            }
            if ((object = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType((HttpResponse)httpClient2)) != null) {
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponseContentType((String)object);
            }
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).build();
            return httpClient2;
        }
        long l4 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l4);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static HttpResponse execute(HttpClient httpClient2, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpHost, httpRequest, httpContext, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse execute(HttpClient httpClient2, HttpHost object, HttpRequest httpRequest, HttpContext httpContext, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block5: {
            long l2;
            block4: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    Object object2 = new StringBuilder();
                    String string2 = object.toURI();
                    ((StringBuilder)object2).append(string2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getUri();
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    object2 = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object2);
                    string2 = httpRequest.getRequestLine();
                    string2 = string2.getMethod();
                    ((NetworkRequestMetricBuilder)object2).setHttpMethod(string2);
                    object2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpRequest);
                    if (object2 == null) break block4;
                    l2 = (Long)object2;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            httpClient2 = httpClient2.execute((HttpHost)object, httpRequest, httpContext);
            long l3 = timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
            object = httpClient2.getStatusLine();
            int n3 = object.getStatusCode();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setHttpResponseCode(n3);
            object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpClient2);
            if (object != null) {
                l3 = (Long)object;
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponsePayloadBytes(l3);
            }
            if ((object = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType((HttpResponse)httpClient2)) != null) {
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponseContentType((String)object);
            }
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).build();
            return httpClient2;
        }
        long l4 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l4);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static HttpResponse execute(HttpClient httpClient2, HttpUriRequest httpUriRequest) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpUriRequest, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse execute(HttpClient httpClient2, HttpUriRequest object, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block5: {
            long l2;
            block4: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    Object object2 = object.getURI();
                    object2 = ((URI)object2).toString();
                    object2 = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object2);
                    String string2 = object.getMethod();
                    ((NetworkRequestMetricBuilder)object2).setHttpMethod(string2);
                    object2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)object);
                    if (object2 == null) break block4;
                    l2 = (Long)object2;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            httpClient2 = httpClient2.execute((HttpUriRequest)object);
            l2 = timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l2);
            object = httpClient2.getStatusLine();
            int n3 = object.getStatusCode();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setHttpResponseCode(n3);
            object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpClient2);
            if (object != null) {
                l2 = (Long)object;
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponsePayloadBytes(l2);
            }
            if ((object = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType((HttpResponse)httpClient2)) != null) {
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponseContentType((String)object);
            }
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).build();
            return httpClient2;
        }
        long l3 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static HttpResponse execute(HttpClient httpClient2, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        Timer timer = new Timer();
        TransportManager transportManager = TransportManager.getInstance();
        return FirebasePerfHttpClient.execute(httpClient2, httpUriRequest, httpContext, timer, transportManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse execute(HttpClient httpClient2, HttpUriRequest object, HttpContext httpContext, Timer timer, TransportManager appStateMonitor$AppStateCallback) {
        IOException iOException2;
        block5: {
            long l2;
            block4: {
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    Object object2 = object.getURI();
                    object2 = ((URI)object2).toString();
                    object2 = ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object2);
                    String string2 = object.getMethod();
                    ((NetworkRequestMetricBuilder)object2).setHttpMethod(string2);
                    object2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)object);
                    if (object2 == null) break block4;
                    l2 = (Long)object2;
                    ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestPayloadBytes(l2);
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            timer.reset();
            l2 = timer.getMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
            httpClient2 = httpClient2.execute((HttpUriRequest)object, httpContext);
            long l3 = timer.getDurationMicros();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l3);
            object = httpClient2.getStatusLine();
            int n3 = object.getStatusCode();
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setHttpResponseCode(n3);
            object = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength((HttpMessage)httpClient2);
            if (object != null) {
                l3 = (Long)object;
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponsePayloadBytes(l3);
            }
            if ((object = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType((HttpResponse)httpClient2)) != null) {
                ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setResponseContentType((String)object);
            }
            ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).build();
            return httpClient2;
        }
        long l4 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l4);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }
}

