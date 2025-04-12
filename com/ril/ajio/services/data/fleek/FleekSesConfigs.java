/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek;

import com.ril.ajio.services.data.fleek.FleekSesConfigs$Triggers;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FleekSesConfigs {
    private FleekSesConfigs$Triggers triggers;

    public FleekSesConfigs() {
        this(null, 1, null);
    }

    public FleekSesConfigs(FleekSesConfigs$Triggers fleekSesConfigs$Triggers) {
        this.triggers = fleekSesConfigs$Triggers;
    }

    public /* synthetic */ FleekSesConfigs(FleekSesConfigs$Triggers fleekSesConfigs$Triggers, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            fleekSesConfigs$Triggers = null;
        }
        this(fleekSesConfigs$Triggers);
    }

    public static /* synthetic */ FleekSesConfigs copy$default(FleekSesConfigs fleekSesConfigs, FleekSesConfigs$Triggers fleekSesConfigs$Triggers, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            fleekSesConfigs$Triggers = fleekSesConfigs.triggers;
        }
        return fleekSesConfigs.copy(fleekSesConfigs$Triggers);
    }

    public final FleekSesConfigs$Triggers component1() {
        return this.triggers;
    }

    public final FleekSesConfigs copy(FleekSesConfigs$Triggers fleekSesConfigs$Triggers) {
        FleekSesConfigs fleekSesConfigs = new FleekSesConfigs(fleekSesConfigs$Triggers);
        return fleekSesConfigs;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FleekSesConfigs;
        if (!bl3) {
            return false;
        }
        object = (FleekSesConfigs)object;
        FleekSesConfigs$Triggers fleekSesConfigs$Triggers = this.triggers;
        object = ((FleekSesConfigs)object).triggers;
        boolean bl4 = Intrinsics.areEqual(fleekSesConfigs$Triggers, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final FleekSesConfigs$Triggers getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        int n3;
        FleekSesConfigs$Triggers fleekSesConfigs$Triggers = this.triggers;
        if (fleekSesConfigs$Triggers == null) {
            n3 = 0;
            fleekSesConfigs$Triggers = null;
        } else {
            n3 = fleekSesConfigs$Triggers.hashCode();
        }
        return n3;
    }

    public final void setTriggers(FleekSesConfigs$Triggers fleekSesConfigs$Triggers) {
        this.triggers = fleekSesConfigs$Triggers;
    }

    public String toString() {
        FleekSesConfigs$Triggers fleekSesConfigs$Triggers = this.triggers;
        StringBuilder stringBuilder = new StringBuilder("FleekSesConfigs(triggers=");
        stringBuilder.append(fleekSesConfigs$Triggers);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

