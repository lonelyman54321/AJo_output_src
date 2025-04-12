/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ThirdPartyBannerConfig {
    private String clientId;
    private Integer pageSize;
    private float timeout;

    public ThirdPartyBannerConfig() {
        this(null, null, 0.0f, 7, null);
    }

    public ThirdPartyBannerConfig(String string2, Integer n3, float f5) {
        this.clientId = string2;
        this.pageSize = n3;
        this.timeout = f5;
    }

    public /* synthetic */ ThirdPartyBannerConfig(String string2, Integer n3, float f5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = null;
        }
        if ((n4 &= 4) != 0) {
            f5 = 1.0f;
        }
        this(string2, n3, f5);
    }

    public static /* synthetic */ ThirdPartyBannerConfig copy$default(ThirdPartyBannerConfig thirdPartyBannerConfig, String string2, Integer n3, float f5, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = thirdPartyBannerConfig.clientId;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = thirdPartyBannerConfig.pageSize;
        }
        if ((n4 &= 4) != 0) {
            f5 = thirdPartyBannerConfig.timeout;
        }
        return thirdPartyBannerConfig.copy(string2, n3, f5);
    }

    public final String component1() {
        return this.clientId;
    }

    public final Integer component2() {
        return this.pageSize;
    }

    public final float component3() {
        return this.timeout;
    }

    public final ThirdPartyBannerConfig copy(String string2, Integer n3, float f5) {
        ThirdPartyBannerConfig thirdPartyBannerConfig = new ThirdPartyBannerConfig(string2, n3, f5);
        return thirdPartyBannerConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThirdPartyBannerConfig;
        if (!bl3) {
            return false;
        }
        object = (ThirdPartyBannerConfig)object;
        Object object2 = this.clientId;
        Object object3 = ((ThirdPartyBannerConfig)object).clientId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageSize;
        object3 = ((ThirdPartyBannerConfig)object).pageSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        float f5 = this.timeout;
        float f6 = ((ThirdPartyBannerConfig)object).timeout;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final float getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        int n3;
        String string2 = this.clientId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Integer n7 = this.pageSize;
        if (n7 != null) {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        return Float.floatToIntBits(this.timeout) + n3;
    }

    public final void setClientId(String string2) {
        this.clientId = string2;
    }

    public final void setPageSize(Integer n3) {
        this.pageSize = n3;
    }

    public final void setTimeout(float f5) {
        this.timeout = f5;
    }

    public String toString() {
        String string2 = this.clientId;
        Integer n3 = this.pageSize;
        float f5 = this.timeout;
        StringBuilder stringBuilder = new StringBuilder("ThirdPartyBannerConfig(clientId=");
        stringBuilder.append(string2);
        stringBuilder.append(", pageSize=");
        stringBuilder.append(n3);
        stringBuilder.append(", timeout=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

