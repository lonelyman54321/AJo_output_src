/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrumentOkHttpEnqueueCallback;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;

public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    public static void enqueue(ij_2 ij_22, wj_2 wj_22) {
        Timer timer = new Timer();
        long l2 = timer.getMicros();
        TransportManager transportManager = TransportManager.getInstance();
        InstrumentOkHttpEnqueueCallback instrumentOkHttpEnqueueCallback = new InstrumentOkHttpEnqueueCallback(wj_22, transportManager, timer, l2);
        ij_22.c(instrumentOkHttpEnqueueCallback);
    }

    public static cl2_2 execute(ij_2 object) {
        Object object2;
        cl2_2 cl2_22;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
        Timer timer = new Timer();
        long l2 = timer.getMicros();
        try {
            cl2_22 = object.execute();
        }
        catch (IOException iOException) {
            object = object.request();
            if (object != null) {
                object2 = ((kj2_2)object).a;
                if (object2 != null) {
                    object2 = ((ob1_1)object2).k().toString();
                    networkRequestMetricBuilder.setUrl((String)object2);
                }
                if ((object = ((kj2_2)object).b) != null) {
                    networkRequestMetricBuilder.setHttpMethod((String)object);
                }
            }
            networkRequestMetricBuilder.setRequestStartTimeMicros(l2);
            long l3 = timer.getDurationMicros();
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l3);
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilder);
            throw iOException;
        }
        long l4 = timer.getDurationMicros();
        cl2_2 cl2_23 = cl2_22;
        object2 = networkRequestMetricBuilder;
        FirebasePerfOkHttpClient.sendNetworkMetric(cl2_22, networkRequestMetricBuilder, l2, l4);
        return cl2_22;
    }

    public static void sendNetworkMetric(cl2_2 cl2_22, NetworkRequestMetricBuilder networkRequestMetricBuilder, long l2, long l3) {
        long l4;
        long l7;
        long l8;
        Object object = cl2_22.a;
        if (object == null) {
            return;
        }
        String string2 = ((kj2_2)object).a.k().toString();
        networkRequestMetricBuilder.setUrl(string2);
        string2 = ((kj2_2)object).b;
        networkRequestMetricBuilder.setHttpMethod(string2);
        long l12 = -1;
        object = ((kj2_2)object).d;
        if (object != null && (l8 = (l7 = (l4 = ((pj2_2)object).contentLength()) - l12) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            networkRequestMetricBuilder.setRequestPayloadBytes(l4);
        }
        if ((object = cl2_22.g) != null) {
            l4 = ((il2_2)object).c();
            long l14 = l4 - l12;
            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object2 != false) {
                networkRequestMetricBuilder.setResponsePayloadBytes(l4);
            }
            if ((object = ((il2_2)object).d()) != null) {
                object = ((jn1_0)object).a;
                networkRequestMetricBuilder.setResponseContentType((String)object);
            }
        }
        int n3 = cl2_22.d;
        networkRequestMetricBuilder.setHttpResponseCode(n3);
        networkRequestMetricBuilder.setRequestStartTimeMicros(l2);
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(l3);
        networkRequestMetricBuilder.build();
    }
}

