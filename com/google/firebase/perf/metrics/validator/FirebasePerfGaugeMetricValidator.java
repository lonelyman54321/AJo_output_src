/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.protobuf.GeneratedMessageLite;

final class FirebasePerfGaugeMetricValidator
extends PerfMetricValidator {
    private final GaugeMetric gaugeMetric;

    public FirebasePerfGaugeMetricValidator(GaugeMetric gaugeMetric) {
        this.gaugeMetric = gaugeMetric;
    }

    /*
     * WARNING - void declaration
     */
    public boolean isValidPerfMetric() {
        void var2_9;
        boolean bl2;
        boolean bl3;
        int n3;
        int n4;
        GeneratedMessageLite generatedMessageLite = this.gaugeMetric;
        boolean n32 = ((GaugeMetric)generatedMessageLite).hasSessionId();
        if (n32 && ((n4 = ((GaugeMetric)(generatedMessageLite = this.gaugeMetric)).getCpuMetricReadingsCount()) > 0 || (n3 = ((GaugeMetric)(generatedMessageLite = this.gaugeMetric)).getAndroidMemoryReadingsCount()) > 0 || (bl3 = ((GaugeMetric)(generatedMessageLite = this.gaugeMetric)).hasGaugeMetadata()) && (bl2 = ((GaugeMetadata)(generatedMessageLite = this.gaugeMetric.getGaugeMetadata())).hasMaxAppJavaHeapMemoryKb()))) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            generatedMessageLite = null;
        }
        return (boolean)var2_9;
    }
}

