/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import kotlin.jvm.internal.Intrinsics;

public final class PreviewConfig {
    public static final int $stable;
    private final int adBuffer;
    private final String adspotID;

    public PreviewConfig(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "adspotID");
        this.adBuffer = n3;
        this.adspotID = string2;
    }

    public static /* synthetic */ PreviewConfig copy$default(PreviewConfig previewConfig, int n3, String string2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = previewConfig.adBuffer;
        }
        if ((n4 &= 2) != 0) {
            string2 = previewConfig.adspotID;
        }
        return previewConfig.copy(n3, string2);
    }

    public final int component1() {
        return this.adBuffer;
    }

    public final String component2() {
        return this.adspotID;
    }

    public final PreviewConfig copy(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "adspotID");
        PreviewConfig previewConfig = new PreviewConfig(n3, string2);
        return previewConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PreviewConfig;
        if (n3 == 0) {
            return false;
        }
        object = (PreviewConfig)object;
        n3 = this.adBuffer;
        int n4 = ((PreviewConfig)object).adBuffer;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.adspotID;
        object = ((PreviewConfig)object).adspotID;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int getAdBuffer() {
        return this.adBuffer;
    }

    public final String getAdspotID() {
        return this.adspotID;
    }

    public int hashCode() {
        int n3 = this.adBuffer * 31;
        return this.adspotID.hashCode() + n3;
    }

    public String toString() {
        int n3 = this.adBuffer;
        String string2 = this.adspotID;
        StringBuilder stringBuilder = new StringBuilder("PreviewConfig(adBuffer=");
        stringBuilder.append(n3);
        stringBuilder.append(", adspotID=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

