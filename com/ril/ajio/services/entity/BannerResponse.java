/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.Component;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerResponse {
    private final Component component;

    public BannerResponse() {
        this(null, 1, null);
    }

    public BannerResponse(Component component) {
        this.component = component;
    }

    public /* synthetic */ BannerResponse(Component component, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            component = null;
        }
        this(component);
    }

    public static /* synthetic */ BannerResponse copy$default(BannerResponse bannerResponse, Component component, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            component = bannerResponse.component;
        }
        return bannerResponse.copy(component);
    }

    public final Component component1() {
        return this.component;
    }

    public final BannerResponse copy(Component component) {
        BannerResponse bannerResponse = new BannerResponse(component);
        return bannerResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerResponse;
        if (!bl3) {
            return false;
        }
        object = (BannerResponse)object;
        Component component = this.component;
        object = ((BannerResponse)object).component;
        boolean bl4 = Intrinsics.areEqual(component, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Component getComponent() {
        return this.component;
    }

    public int hashCode() {
        int n3;
        Component component = this.component;
        if (component == null) {
            n3 = 0;
            component = null;
        } else {
            n3 = component.hashCode();
        }
        return n3;
    }

    public String toString() {
        Component component = this.component;
        StringBuilder stringBuilder = new StringBuilder("BannerResponse(component=");
        stringBuilder.append(component);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

