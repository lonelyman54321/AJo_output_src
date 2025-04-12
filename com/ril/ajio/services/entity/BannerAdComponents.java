/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.BannerResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdComponents {
    private final BannerResponse data;

    public BannerAdComponents() {
        this(null, 1, null);
    }

    public BannerAdComponents(BannerResponse bannerResponse) {
        this.data = bannerResponse;
    }

    public /* synthetic */ BannerAdComponents(BannerResponse bannerResponse, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            bannerResponse = null;
        }
        this(bannerResponse);
    }

    public static /* synthetic */ BannerAdComponents copy$default(BannerAdComponents bannerAdComponents, BannerResponse bannerResponse, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            bannerResponse = bannerAdComponents.data;
        }
        return bannerAdComponents.copy(bannerResponse);
    }

    public final BannerResponse component1() {
        return this.data;
    }

    public final BannerAdComponents copy(BannerResponse bannerResponse) {
        BannerAdComponents bannerAdComponents = new BannerAdComponents(bannerResponse);
        return bannerAdComponents;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerAdComponents;
        if (!bl3) {
            return false;
        }
        object = (BannerAdComponents)object;
        BannerResponse bannerResponse = this.data;
        object = ((BannerAdComponents)object).data;
        boolean bl4 = Intrinsics.areEqual(bannerResponse, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final BannerResponse getData() {
        return this.data;
    }

    public int hashCode() {
        int n3;
        BannerResponse bannerResponse = this.data;
        if (bannerResponse == null) {
            n3 = 0;
            bannerResponse = null;
        } else {
            n3 = bannerResponse.hashCode();
        }
        return n3;
    }

    public String toString() {
        BannerResponse bannerResponse = this.data;
        StringBuilder stringBuilder = new StringBuilder("BannerAdComponents(data=");
        stringBuilder.append(bannerResponse);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

