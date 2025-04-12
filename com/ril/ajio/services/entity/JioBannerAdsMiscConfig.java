/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class JioBannerAdsMiscConfig {
    private float timeout;

    public JioBannerAdsMiscConfig() {
        this(0.0f, 1, null);
    }

    public JioBannerAdsMiscConfig(float f5) {
        this.timeout = f5;
    }

    public /* synthetic */ JioBannerAdsMiscConfig(float f5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            f5 = 1.0f;
        }
        this(f5);
    }

    public static /* synthetic */ JioBannerAdsMiscConfig copy$default(JioBannerAdsMiscConfig jioBannerAdsMiscConfig, float f5, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            f5 = jioBannerAdsMiscConfig.timeout;
        }
        return jioBannerAdsMiscConfig.copy(f5);
    }

    public final float component1() {
        return this.timeout;
    }

    public final JioBannerAdsMiscConfig copy(float f5) {
        JioBannerAdsMiscConfig jioBannerAdsMiscConfig = new JioBannerAdsMiscConfig(f5);
        return jioBannerAdsMiscConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof JioBannerAdsMiscConfig;
        if (!bl3) {
            return false;
        }
        object = (JioBannerAdsMiscConfig)object;
        float f5 = this.timeout;
        float f6 = ((JioBannerAdsMiscConfig)object).timeout;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final float getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.timeout);
    }

    public final void setTimeout(float f5) {
        this.timeout = f5;
    }

    public String toString() {
        return g9_0.a(this.timeout, "JioBannerAdsMiscConfig(timeout=", ")");
    }
}

