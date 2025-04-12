/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.metrics;

import com.affise.attribution.metrics.MetricsData;
import java.util.List;

public interface MetricsRepository {
    public void addMetricsData(MetricsData var1, List var2);

    public void clear();

    public void deleteMetrics(String var1);

    public List getMetrics(String var1);

    public boolean hasMetrics(String var1);
}

