/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric$Builder;
import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod;
import com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkRequestMetricBuilder
extends AppStateUpdateHandler
implements SessionAwareObject {
    private static final char HIGHEST_ASCII_CHAR = '\u007f';
    private static final char HIGHEST_CONTROL_CHAR = '\u001f';
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final NetworkRequestMetric$Builder builder;
    private final GaugeManager gaugeManager;
    private boolean isManualNetworkRequestMetric;
    private boolean isReportSent;
    private final List sessions;
    private final TransportManager transportManager;
    private String userAgent;
    private final WeakReference weakReference;

    private NetworkRequestMetricBuilder(TransportManager transportManager) {
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this(transportManager, appStateMonitor, gaugeManager);
    }

    public NetworkRequestMetricBuilder(TransportManager list, AppStateMonitor weakReference, GaugeManager gaugeManager) {
        super((AppStateMonitor)((Object)weakReference));
        weakReference = NetworkRequestMetric.newBuilder();
        this.builder = weakReference;
        this.weakReference = weakReference = new WeakReference<NetworkRequestMetricBuilder>(this);
        this.transportManager = list;
        this.gaugeManager = gaugeManager;
        list = new List();
        this.sessions = list = Collections.synchronizedList(list);
        this.registerForAppState();
    }

    public static NetworkRequestMetricBuilder builder(TransportManager transportManager) {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(transportManager);
        return networkRequestMetricBuilder;
    }

    private boolean hasStarted() {
        return this.builder.hasClientStartTimeUs();
    }

    private boolean isStopped() {
        return this.builder.hasTimeToResponseCompletedUs();
    }

    private static boolean isValidContentType(String string2) {
        int n3;
        int n4 = string2.length();
        if (n4 > (n3 = 128)) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = string2.length()); ++n4) {
            int n7;
            n3 = string2.charAt(n4);
            if (n3 > (n7 = 31) && n3 <= (n7 = 127)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public NetworkRequestMetric build() {
        Object object = SessionManager.getInstance();
        Object object2 = this.weakReference;
        object.unregisterForSessionUpdates((WeakReference)object2);
        this.unregisterForAppState();
        object = PerfSession.buildAndSort(this.getSessions());
        if (object != null) {
            object2 = this.builder;
            object = Arrays.asList(object);
            ((NetworkRequestMetric$Builder)object2).addAllPerfSessions((Iterable)object);
        }
        object = (NetworkRequestMetric)this.builder.build();
        object2 = this.userAgent;
        boolean bl2 = NetworkRequestMetricBuilderUtil.isAllowedUserAgent((String)object2);
        if (!bl2) {
            logger.debug("Dropping network request from a 'User-Agent' that is not allowed");
            return object;
        }
        bl2 = this.isReportSent;
        if (!bl2) {
            object2 = this.transportManager;
            ApplicationProcessState applicationProcessState = this.getAppState();
            ((TransportManager)object2).log((NetworkRequestMetric)object, applicationProcessState);
            this.isReportSent = true;
            return object;
        }
        bl2 = this.isManualNetworkRequestMetric;
        if (bl2) {
            object2 = logger;
            String string2 = "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response";
            ((AndroidLogger)object2).debug(string2);
        }
        return object;
    }

    public void clearBuilderFields() {
        this.builder.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getSessions() {
        List list = this.sessions;
        synchronized (list) {
            try {
                List list2 = new List();
                Object object = this.sessions;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        return Collections.unmodifiableList(list2);
                    }
                    Object object2 = object.next();
                    if ((object2 = (PerfSession)object2) == null) continue;
                    ((ArrayList)list2).add(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public long getTimeToResponseInitiatedMicros() {
        return this.builder.getTimeToResponseInitiatedUs();
    }

    public String getUrl() {
        return this.builder.getUrl();
    }

    public boolean hasHttpResponseCode() {
        return this.builder.hasHttpResponseCode();
    }

    public boolean isReportSent() {
        return this.isReportSent;
    }

    public NetworkRequestMetricBuilder setCustomAttributes(Map map2) {
        this.builder.clearCustomAttributes().putAllCustomAttributes(map2);
        return this;
    }

    public NetworkRequestMetricBuilder setHttpMethod(String object) {
        if (object != null) {
            Object object2 = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN;
            object = ((String)object).toUpperCase();
            object.getClass();
            int n3 = -1;
            int n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 2012838315: {
                    String string2 = "DELETE";
                    boolean bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 8;
                    break;
                }
                case 1669334218: {
                    String string3 = "CONNECT";
                    boolean bl3 = ((String)object).equals(string3);
                    if (!bl3) break;
                    n3 = 7;
                    break;
                }
                case 80083237: {
                    String string4 = "TRACE";
                    boolean bl4 = ((String)object).equals(string4);
                    if (!bl4) break;
                    n3 = 6;
                    break;
                }
                case 75900968: {
                    String string5 = "PATCH";
                    boolean bl5 = ((String)object).equals(string5);
                    if (!bl5) break;
                    n3 = 5;
                    break;
                }
                case 2461856: {
                    String string6 = "POST";
                    boolean bl6 = ((String)object).equals(string6);
                    if (!bl6) break;
                    n3 = 4;
                    break;
                }
                case 2213344: {
                    String string7 = "HEAD";
                    boolean bl7 = ((String)object).equals(string7);
                    if (!bl7) break;
                    n3 = 3;
                    break;
                }
                case 79599: {
                    String string8 = "PUT";
                    boolean bl8 = ((String)object).equals(string8);
                    if (!bl8) break;
                    n3 = 2;
                    break;
                }
                case 70454: {
                    String string9 = "GET";
                    boolean bl9 = ((String)object).equals(string9);
                    if (!bl9) break;
                    n3 = 1;
                    break;
                }
                case -531492226: {
                    String string10 = "OPTIONS";
                    boolean bl10 = ((String)object).equals(string10);
                    if (!bl10) break;
                    n3 = 0;
                    object2 = null;
                }
            }
            switch (n3) {
                default: {
                    object = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
                }
                case 8: {
                    object = NetworkRequestMetric$HttpMethod.DELETE;
                    break;
                }
                case 7: {
                    object = NetworkRequestMetric$HttpMethod.CONNECT;
                    break;
                }
                case 6: {
                    object = NetworkRequestMetric$HttpMethod.TRACE;
                    break;
                }
                case 5: {
                    object = NetworkRequestMetric$HttpMethod.PATCH;
                    break;
                }
                case 4: {
                    object = NetworkRequestMetric$HttpMethod.POST;
                    break;
                }
                case 3: {
                    object = NetworkRequestMetric$HttpMethod.HEAD;
                    break;
                }
                case 2: {
                    object = NetworkRequestMetric$HttpMethod.PUT;
                    break;
                }
                case 1: {
                    object = NetworkRequestMetric$HttpMethod.GET;
                    break;
                }
                case 0: {
                    object = NetworkRequestMetric$HttpMethod.OPTIONS;
                }
            }
            object2 = this.builder;
            ((NetworkRequestMetric$Builder)object2).setHttpMethod((NetworkRequestMetric$HttpMethod)object);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setHttpResponseCode(int n3) {
        this.builder.setHttpResponseCode(n3);
        return this;
    }

    public void setManualNetworkRequestMetric() {
        this.isManualNetworkRequestMetric = true;
    }

    public NetworkRequestMetricBuilder setNetworkClientErrorReason() {
        NetworkRequestMetric$Builder networkRequestMetric$Builder = this.builder;
        NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason = NetworkRequestMetric$NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
        networkRequestMetric$Builder.setNetworkClientErrorReason(networkRequestMetric$NetworkClientErrorReason);
        return this;
    }

    public void setReportSent() {
        this.isReportSent = true;
    }

    public NetworkRequestMetricBuilder setRequestPayloadBytes(long l2) {
        this.builder.setRequestPayloadBytes(l2);
        return this;
    }

    public NetworkRequestMetricBuilder setRequestStartTimeMicros(long l2) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        Object object = SessionManager.getInstance();
        WeakReference weakReference = this.weakReference;
        ((SessionManager)object).registerForSessionUpdates(weakReference);
        object = this.builder;
        ((NetworkRequestMetric$Builder)object).setClientStartTimeUs(l2);
        this.updateSession(perfSession);
        boolean bl2 = perfSession.isGaugeAndEventCollectionEnabled();
        if (bl2) {
            GaugeManager gaugeManager = this.gaugeManager;
            Timer timer = perfSession.getTimer();
            gaugeManager.collectGaugeMetricOnce(timer);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setResponseContentType(String string2) {
        if (string2 == null) {
            this.builder.clearResponseContentType();
            return this;
        }
        boolean bl2 = NetworkRequestMetricBuilder.isValidContentType(string2);
        if (bl2) {
            NetworkRequestMetric$Builder networkRequestMetric$Builder = this.builder;
            networkRequestMetric$Builder.setResponseContentType(string2);
        } else {
            AndroidLogger androidLogger = logger;
            String string3 = "The content type of the response is not a valid content-type:";
            string2 = string3.concat(string2);
            androidLogger.warn(string2);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setResponsePayloadBytes(long l2) {
        this.builder.setResponsePayloadBytes(l2);
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToRequestCompletedMicros(long l2) {
        this.builder.setTimeToRequestCompletedUs(l2);
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToResponseCompletedMicros(long l2) {
        NetworkRequestMetric$Builder networkRequestMetric$Builder = this.builder;
        networkRequestMetric$Builder.setTimeToResponseCompletedUs(l2);
        Object object = SessionManager.getInstance().perfSession();
        boolean bl2 = ((PerfSession)object).isGaugeAndEventCollectionEnabled();
        if (bl2) {
            object = this.gaugeManager;
            Timer timer = SessionManager.getInstance().perfSession().getTimer();
            ((GaugeManager)object).collectGaugeMetricOnce(timer);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToResponseInitiatedMicros(long l2) {
        this.builder.setTimeToResponseInitiatedUs(l2);
        return this;
    }

    public NetworkRequestMetricBuilder setUrl(String string2) {
        if (string2 != null) {
            string2 = Utils.stripSensitiveInfo(string2);
            NetworkRequestMetric$Builder networkRequestMetric$Builder = this.builder;
            int n3 = 2000;
            string2 = Utils.truncateURL(string2, n3);
            networkRequestMetric$Builder.setUrl(string2);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setUserAgent(String string2) {
        this.userAgent = string2;
        return this;
    }

    public void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            logger.warn("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        boolean bl2 = this.hasStarted();
        if (bl2 && !(bl2 = this.isStopped())) {
            List list = this.sessions;
            list.add(perfSession);
        }
    }
}

