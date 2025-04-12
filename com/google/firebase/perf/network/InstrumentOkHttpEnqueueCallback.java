/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;

public class InstrumentOkHttpEnqueueCallback
implements wj_2 {
    private final wj_2 callback;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final long startTimeMicros;
    private final Timer timer;

    public InstrumentOkHttpEnqueueCallback(wj_2 object, TransportManager transportManager, Timer timer, long l2) {
        this.callback = object;
        this.networkMetricBuilder = object = NetworkRequestMetricBuilder.builder(transportManager);
        this.startTimeMicros = l2;
        this.timer = timer;
    }

    public void onFailure(ij_2 ij_22, IOException iOException) {
        Object object = ij_22.request();
        if (object != null) {
            Object object2 = ((kj2_2)object).a;
            if (object2 != null) {
                NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
                object2 = ((ob1_1)object2).k().toString();
                networkRequestMetricBuilder.setUrl((String)object2);
            }
            if ((object = ((kj2_2)object).b) != null) {
                object2 = this.networkMetricBuilder;
                ((NetworkRequestMetricBuilder)object2).setHttpMethod((String)object);
            }
        }
        object = this.networkMetricBuilder;
        long l2 = this.startTimeMicros;
        ((NetworkRequestMetricBuilder)object).setRequestStartTimeMicros(l2);
        object = this.networkMetricBuilder;
        l2 = this.timer.getDurationMicros();
        ((NetworkRequestMetricBuilder)object).setTimeToResponseCompletedMicros(l2);
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        this.callback.onFailure(ij_22, iOException);
    }

    public void onResponse(ij_2 ij_22, cl2_2 cl2_22) {
        long l2 = this.timer.getDurationMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.networkMetricBuilder;
        long l3 = this.startTimeMicros;
        FirebasePerfOkHttpClient.sendNetworkMetric(cl2_22, networkRequestMetricBuilder, l3, l2);
        this.callback.onResponse(ij_22, cl2_22);
    }
}

