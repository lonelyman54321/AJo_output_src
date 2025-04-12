/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView;
import kotlin.jvm.internal.Intrinsics;

public final class JioVmapAdsLoader$Companion {
    public final JioAdView a;

    public JioVmapAdsLoader$Companion(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter(jioAdView, "container");
        this.a = jioAdView;
    }

    public static /* synthetic */ JioVmapAdsLoader$Companion copy$default(JioVmapAdsLoader$Companion jioVmapAdsLoader$Companion, JioAdView jioAdView, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            jioAdView = jioVmapAdsLoader$Companion.a;
        }
        return jioVmapAdsLoader$Companion.copy(jioAdView);
    }

    public final JioAdView component1() {
        return this.a;
    }

    public final JioVmapAdsLoader$Companion copy(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter(jioAdView, "container");
        JioVmapAdsLoader$Companion jioVmapAdsLoader$Companion = new JioVmapAdsLoader$Companion(jioAdView);
        return jioVmapAdsLoader$Companion;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof JioVmapAdsLoader$Companion;
        if (!bl3) {
            return false;
        }
        object = (JioVmapAdsLoader$Companion)object;
        JioAdView jioAdView = this.a;
        object = ((JioVmapAdsLoader$Companion)object).a;
        boolean bl4 = Intrinsics.areEqual(jioAdView, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final JioAdView getContainer() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Companion(container=");
        JioAdView jioAdView = this.a;
        stringBuilder.append(jioAdView);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

