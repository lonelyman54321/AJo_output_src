/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrHttpURLConnection;
import com.google.firebase.perf.network.InstrHttpsURLConnection;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object getContent(URLWrapper object, TransportManager appStateMonitor$AppStateCallback, Timer timer) {
        IOException iOException2;
        long l2;
        block6: {
            URLConnection uRLConnection;
            block5: {
                timer.reset();
                l2 = timer.getMicros();
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    uRLConnection = ((URLWrapper)object).openConnection();
                }
                catch (IOException iOException2) {}
                boolean bl2 = uRLConnection instanceof HttpsURLConnection;
                if (bl2) {
                    uRLConnection = (HttpsURLConnection)uRLConnection;
                    InstrHttpsURLConnection instrHttpsURLConnection = new InstrHttpsURLConnection((HttpsURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                    return instrHttpsURLConnection.getContent();
                }
                bl2 = uRLConnection instanceof HttpURLConnection;
                if (!bl2) break block5;
                uRLConnection = (HttpURLConnection)uRLConnection;
                InstrHttpURLConnection instrHttpURLConnection = new InstrHttpURLConnection((HttpURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                return instrHttpURLConnection.getContent();
                break block6;
            }
            return uRLConnection.getContent();
        }
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
        l2 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l2);
        object = ((URLWrapper)object).toString();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object getContent(URLWrapper object, Class[] classArray, TransportManager appStateMonitor$AppStateCallback, Timer timer) {
        IOException iOException2;
        long l2;
        block6: {
            URLConnection uRLConnection;
            block5: {
                timer.reset();
                l2 = timer.getMicros();
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    uRLConnection = ((URLWrapper)object).openConnection();
                }
                catch (IOException iOException2) {}
                boolean bl2 = uRLConnection instanceof HttpsURLConnection;
                if (bl2) {
                    uRLConnection = (HttpsURLConnection)uRLConnection;
                    InstrHttpsURLConnection instrHttpsURLConnection = new InstrHttpsURLConnection((HttpsURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                    return instrHttpsURLConnection.getContent(classArray);
                }
                bl2 = uRLConnection instanceof HttpURLConnection;
                if (!bl2) break block5;
                uRLConnection = (HttpURLConnection)uRLConnection;
                InstrHttpURLConnection instrHttpURLConnection = new InstrHttpURLConnection((HttpURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                return instrHttpURLConnection.getContent(classArray);
                break block6;
            }
            return uRLConnection.getContent(classArray);
        }
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
        l2 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l2);
        object = ((URLWrapper)object).toString();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static Object getContent(URL object) {
        URLWrapper uRLWrapper = new URLWrapper((URL)object);
        object = TransportManager.getInstance();
        Timer timer = new Timer();
        return FirebasePerfUrlConnection.getContent(uRLWrapper, (TransportManager)object, timer);
    }

    public static Object getContent(URL object, Class[] classArray) {
        URLWrapper uRLWrapper = new URLWrapper((URL)object);
        object = TransportManager.getInstance();
        Timer timer = new Timer();
        return FirebasePerfUrlConnection.getContent(uRLWrapper, classArray, (TransportManager)object, timer);
    }

    public static Object instrument(Object object) {
        boolean bl2 = object instanceof HttpsURLConnection;
        if (bl2) {
            object = (HttpsURLConnection)object;
            Timer timer = new Timer();
            NetworkRequestMetricBuilder networkRequestMetricBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
            InstrHttpsURLConnection instrHttpsURLConnection = new InstrHttpsURLConnection((HttpsURLConnection)object, timer, networkRequestMetricBuilder);
            return instrHttpsURLConnection;
        }
        bl2 = object instanceof HttpURLConnection;
        if (bl2) {
            object = (HttpURLConnection)object;
            Timer timer = new Timer();
            NetworkRequestMetricBuilder networkRequestMetricBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
            InstrHttpURLConnection instrHttpURLConnection = new InstrHttpURLConnection((HttpURLConnection)object, timer, networkRequestMetricBuilder);
            return instrHttpURLConnection;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream openStream(URLWrapper object, TransportManager appStateMonitor$AppStateCallback, Timer timer) {
        IOException iOException2;
        long l2;
        block7: {
            URLConnection uRLConnection;
            block6: {
                TransportManager transportManager = TransportManager.getInstance();
                boolean bl2 = transportManager.isInitialized();
                if (!bl2) {
                    return ((URLWrapper)object).openConnection().getInputStream();
                }
                timer.reset();
                l2 = timer.getMicros();
                appStateMonitor$AppStateCallback = NetworkRequestMetricBuilder.builder((TransportManager)appStateMonitor$AppStateCallback);
                try {
                    uRLConnection = ((URLWrapper)object).openConnection();
                }
                catch (IOException iOException2) {}
                boolean bl3 = uRLConnection instanceof HttpsURLConnection;
                if (bl3) {
                    uRLConnection = (HttpsURLConnection)uRLConnection;
                    InstrHttpsURLConnection instrHttpsURLConnection = new InstrHttpsURLConnection((HttpsURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                    return instrHttpsURLConnection.getInputStream();
                }
                bl3 = uRLConnection instanceof HttpURLConnection;
                if (!bl3) break block6;
                uRLConnection = (HttpURLConnection)uRLConnection;
                InstrHttpURLConnection instrHttpURLConnection = new InstrHttpURLConnection((HttpURLConnection)uRLConnection, timer, (NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
                return instrHttpURLConnection.getInputStream();
                break block7;
            }
            return uRLConnection.getInputStream();
        }
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setRequestStartTimeMicros(l2);
        l2 = timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setTimeToResponseCompletedMicros(l2);
        object = ((URLWrapper)object).toString();
        ((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback).setUrl((String)object);
        NetworkRequestMetricBuilderUtil.logError((NetworkRequestMetricBuilder)appStateMonitor$AppStateCallback);
        throw iOException2;
    }

    public static InputStream openStream(URL object) {
        URLWrapper uRLWrapper = new URLWrapper((URL)object);
        object = TransportManager.getInstance();
        Timer timer = new Timer();
        return FirebasePerfUrlConnection.openStream(uRLWrapper, (TransportManager)object, timer);
    }
}

