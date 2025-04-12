/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import com.affise.attribution.metrics.MetricsEvent;
import java.util.List;

public interface MetricsStorage {
    public void clear();

    public void deleteMetrics(String var1, String var2);

    public MetricsEvent getMetricsEvent(String var1, String var2);

    public List getMetricsEvents(String var1, String var2);

    public boolean hasMetrics(String var1, String var2);

    public void saveMetricsEvent(String var1, String var2, MetricsEvent var3);
}

