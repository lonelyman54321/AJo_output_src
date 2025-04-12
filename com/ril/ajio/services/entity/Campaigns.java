/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.Cmps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Campaigns {
    private Cmps campaigns;

    public Campaigns() {
        this(null, 1, null);
    }

    public Campaigns(Cmps cmps) {
        this.campaigns = cmps;
    }

    public /* synthetic */ Campaigns(Cmps cmps, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            cmps = null;
        }
        this(cmps);
    }

    public static /* synthetic */ Campaigns copy$default(Campaigns campaigns, Cmps cmps, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            cmps = campaigns.campaigns;
        }
        return campaigns.copy(cmps);
    }

    public final Cmps component1() {
        return this.campaigns;
    }

    public final Campaigns copy(Cmps cmps) {
        Campaigns campaigns = new Campaigns(cmps);
        return campaigns;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Campaigns;
        if (!bl3) {
            return false;
        }
        object = (Campaigns)object;
        Cmps cmps = this.campaigns;
        object = ((Campaigns)object).campaigns;
        boolean bl4 = Intrinsics.areEqual(cmps, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Cmps getCampaigns() {
        return this.campaigns;
    }

    public int hashCode() {
        int n3;
        Cmps cmps = this.campaigns;
        if (cmps == null) {
            n3 = 0;
            cmps = null;
        } else {
            n3 = cmps.hashCode();
        }
        return n3;
    }

    public final void setCampaigns(Cmps cmps) {
        this.campaigns = cmps;
    }

    public String toString() {
        Cmps cmps = this.campaigns;
        StringBuilder stringBuilder = new StringBuilder("Campaigns(campaigns=");
        stringBuilder.append(cmps);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

