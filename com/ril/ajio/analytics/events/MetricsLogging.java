/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MetricsLogging {
    public static final int $stable = 8;
    private Boolean appsflyerFirebaseLoggingEnable;
    private Boolean appsflyerGaLoggingEnable;

    public MetricsLogging() {
        this(null, null, 3, null);
    }

    public MetricsLogging(Boolean bl2, Boolean bl3) {
        this.appsflyerFirebaseLoggingEnable = bl2;
        this.appsflyerGaLoggingEnable = bl3;
    }

    public /* synthetic */ MetricsLogging(Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n3 &= 2) != 0) {
            bl3 = Boolean.FALSE;
        }
        this(bl2, bl3);
    }

    public static /* synthetic */ MetricsLogging copy$default(MetricsLogging metricsLogging, Boolean bl2, Boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = metricsLogging.appsflyerFirebaseLoggingEnable;
        }
        if ((n3 &= 2) != 0) {
            bl3 = metricsLogging.appsflyerGaLoggingEnable;
        }
        return metricsLogging.copy(bl2, bl3);
    }

    public final Boolean component1() {
        return this.appsflyerFirebaseLoggingEnable;
    }

    public final Boolean component2() {
        return this.appsflyerGaLoggingEnable;
    }

    public final MetricsLogging copy(Boolean bl2, Boolean bl3) {
        MetricsLogging metricsLogging = new MetricsLogging(bl2, bl3);
        return metricsLogging;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MetricsLogging;
        if (!bl3) {
            return false;
        }
        object = (MetricsLogging)object;
        Boolean bl4 = this.appsflyerFirebaseLoggingEnable;
        Boolean bl5 = ((MetricsLogging)object).appsflyerFirebaseLoggingEnable;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.appsflyerGaLoggingEnable;
        object = ((MetricsLogging)object).appsflyerGaLoggingEnable;
        boolean bl6 = Intrinsics.areEqual(bl4, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAppsflyerFirebaseLoggingEnable() {
        return this.appsflyerFirebaseLoggingEnable;
    }

    public final Boolean getAppsflyerGaLoggingEnable() {
        return this.appsflyerGaLoggingEnable;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.appsflyerFirebaseLoggingEnable;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        Boolean bl3 = this.appsflyerGaLoggingEnable;
        if (bl3 != null) {
            n4 = ((Object)bl3).hashCode();
        }
        return n3 + n4;
    }

    public final void setAppsflyerFirebaseLoggingEnable(Boolean bl2) {
        this.appsflyerFirebaseLoggingEnable = bl2;
    }

    public final void setAppsflyerGaLoggingEnable(Boolean bl2) {
        this.appsflyerGaLoggingEnable = bl2;
    }

    public String toString() {
        Boolean bl2 = this.appsflyerFirebaseLoggingEnable;
        Boolean bl3 = this.appsflyerGaLoggingEnable;
        StringBuilder stringBuilder = new StringBuilder("MetricsLogging(appsflyerFirebaseLoggingEnable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", appsflyerGaLoggingEnable=");
        stringBuilder.append(bl3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

