/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics;

import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HttpMetric
implements FirebasePerformanceAttributable {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Map customAttributesMap;
    private boolean isDisabled;
    private boolean isStopped;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final Timer timer;

    public HttpMetric(String string2, String object, TransportManager object2, Timer objectArray) {
        ConcurrentHashMap concurrentHashMap;
        int n3 = 1;
        this.isStopped = false;
        this.isDisabled = false;
        this.customAttributesMap = concurrentHashMap = new ConcurrentHashMap();
        this.timer = objectArray;
        object2 = NetworkRequestMetricBuilder.builder((TransportManager)object2).setUrl(string2);
        this.networkMetricBuilder = object = ((NetworkRequestMetricBuilder)object2).setHttpMethod((String)object);
        ((NetworkRequestMetricBuilder)object).setManualNetworkRequestMetric();
        object = ConfigResolver.getInstance();
        boolean bl2 = ((ConfigResolver)object).isPerformanceMonitoringEnabled();
        if (!bl2) {
            object = logger;
            object2 = "HttpMetric feature is disabled. URL %s";
            objectArray = new Object[n3];
            objectArray[0] = string2;
            ((AndroidLogger)object).info((String)object2, objectArray);
            this.isDisabled = n3;
        }
    }

    public HttpMetric(URL object, String string2, TransportManager transportManager, Timer timer) {
        object = ((URL)object).toString();
        this((String)object, string2, transportManager, timer);
    }

    private void checkAttribute(String object, String object2) {
        int n3 = this.isStopped;
        if (n3 == 0) {
            int n4;
            Map map2 = this.customAttributesMap;
            n3 = map2.containsKey(object);
            if (n3 == 0 && (n3 = (map2 = this.customAttributesMap).size()) >= (n4 = 5)) {
                object2 = Locale.ENGLISH;
                object = new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                throw object;
            }
            PerfMetricValidator.validateAttribute((String)object, (String)object2);
            return;
        }
        object = new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        throw object;
    }

    public String getAttribute(String string2) {
        return (String)this.customAttributesMap.get(string2);
    }

    public Map getAttributes() {
        Map map2 = this.customAttributesMap;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public void markRequestComplete() {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToRequestCompletedMicros(l2);
    }

    public void markResponseStart() {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        networkRequestMetricBuilder.setTimeToResponseInitiatedMicros(l2);
    }

    public void putAttribute(String string2, String string3) {
        Object object;
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        string2 = string2.trim();
        string3 = string3.trim();
        this.checkAttribute(string2, string3);
        AndroidLogger androidLogger = logger;
        Object object2 = "Setting attribute '%s' to %s on network request '%s'";
        Object object3 = this.networkMetricBuilder;
        object3 = ((NetworkRequestMetricBuilder)object3).getUrl();
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        objectArray[n7] = string3;
        objectArray[n3] = object3;
        try {
            androidLogger.debug((String)object2, objectArray);
        }
        catch (Exception exception) {
            object2 = logger;
            String string4 = exception.getMessage();
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = string2;
            objectArray2[n7] = string3;
            objectArray2[n3] = string4;
            object = "Cannot set attribute '%s' with value '%s' (%s)";
            ((AndroidLogger)object2).error((String)object, objectArray2);
            n7 = 0;
        }
        if (n7 != 0) {
            object = this.customAttributesMap;
            object.put(string2, string3);
        }
    }

    public void removeAttribute(String string2) {
        boolean bl2 = this.isStopped;
        if (bl2) {
            logger.error("Can't remove a attribute from a HttpMetric that's stopped.");
            return;
        }
        this.customAttributesMap.remove(string2);
    }

    public void setHttpResponseCode(int n3) {
        this.networkMetricBuilder.setHttpResponseCode(n3);
    }

    public void setRequestPayloadSize(long l2) {
        this.networkMetricBuilder.setRequestPayloadBytes(l2);
    }

    public void setResponseContentType(String string2) {
        this.networkMetricBuilder.setResponseContentType(string2);
    }

    public void setResponsePayloadSize(long l2) {
        this.networkMetricBuilder.setResponsePayloadBytes(l2);
    }

    public void start() {
        this.timer.reset();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l2 = this.timer.getMicros();
        networkRequestMetricBuilder.setRequestStartTimeMicros(l2);
    }

    public void stop() {
        boolean bl2 = this.isDisabled;
        if (bl2) {
            return;
        }
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l2 = this.timer.getDurationMicros();
        networkRequestMetricBuilder = networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l2);
        Map map2 = this.customAttributesMap;
        networkRequestMetricBuilder.setCustomAttributes(map2).build();
        this.isStopped = true;
    }
}

