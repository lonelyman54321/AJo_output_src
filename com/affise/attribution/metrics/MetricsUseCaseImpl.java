/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.metrics;

import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.metrics.MetricsClickData;
import com.affise.attribution.metrics.MetricsData;
import com.affise.attribution.metrics.MetricsRepository;
import com.affise.attribution.metrics.MetricsUseCase;
import com.affise.attribution.network.CloudConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class MetricsUseCaseImpl
implements MetricsUseCase {
    private final ExecutorServiceProvider executorServiceProvider;
    private final MetricsRepository metricsRepository;

    public MetricsUseCaseImpl(ExecutorServiceProvider executorServiceProvider, MetricsRepository metricsRepository2) {
        Intrinsics.checkNotNullParameter(executorServiceProvider, "executorServiceProvider");
        Intrinsics.checkNotNullParameter(metricsRepository2, "metricsRepository");
        this.executorServiceProvider = executorServiceProvider;
        this.metricsRepository = metricsRepository2;
    }

    public static /* synthetic */ void a(MetricsUseCaseImpl metricsUseCaseImpl, String string2, long l2) {
        MetricsUseCaseImpl.addOpenActivityTime$lambda$1(metricsUseCaseImpl, string2, l2);
    }

    private static final void addClickOnActivity$lambda$4(MetricsUseCaseImpl object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$data");
        Intrinsics.checkNotNullParameter(string2, "$activityName");
        MetricsClickData metricsClickData = new MetricsClickData();
        metricsClickData.setName((String)object2);
        int n3 = 1;
        metricsClickData.setCount(n3);
        MetricsData metricsData = new MetricsData();
        metricsData.setActivityName(string2);
        object2 = new MetricsClickData[n3];
        object2[0] = metricsClickData;
        object2 = xx_2.j(object2);
        metricsData.setClicksData((List)object2);
        object = ((MetricsUseCaseImpl)object).metricsRepository;
        object2 = CloudConfig.INSTANCE.getUrls();
        object.addMetricsData(metricsData, (List)object2);
    }

    private static final void addOpenActivityTime$lambda$1(MetricsUseCaseImpl object, String object2, long l2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$activityName");
        MetricsData metricsData = new MetricsData();
        metricsData.setActivityName((String)object2);
        metricsData.setOpenTime(l2);
        object = ((MetricsUseCaseImpl)object).metricsRepository;
        object2 = CloudConfig.INSTANCE.getUrls();
        object.addMetricsData(metricsData, (List)object2);
    }

    public static /* synthetic */ void b(MetricsUseCaseImpl metricsUseCaseImpl, String string2, String string3) {
        MetricsUseCaseImpl.addClickOnActivity$lambda$4(metricsUseCaseImpl, string2, string3);
    }

    public void addClickOnActivity(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "activityName");
        Intrinsics.checkNotNullParameter(string3, "data");
        ExecutorService executorService = this.executorServiceProvider.provideExecutorService();
        VO1 vO1 = new VO1(this, string3, string2);
        executorService.execute(vO1);
    }

    public void addOpenActivityTime(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "activityName");
        ExecutorService executorService = this.executorServiceProvider.provideExecutorService();
        WO1 wO1 = new WO1(this, string2, l2);
        executorService.execute(wO1);
    }
}

