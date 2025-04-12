/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FleekSesConfigs$Triggers {
    private Boolean onlaunch;
    private Boolean tabSwitch;
    private Integer threshold;

    public FleekSesConfigs$Triggers() {
        this(null, null, null, 7, null);
    }

    public FleekSesConfigs$Triggers(Boolean bl2, Boolean bl3, Integer n3) {
        this.onlaunch = bl2;
        this.tabSwitch = bl3;
        this.threshold = n3;
    }

    public /* synthetic */ FleekSesConfigs$Triggers(Boolean bl2, Boolean bl3, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            bl3 = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = null;
        }
        this(bl2, bl3, n3);
    }

    public static /* synthetic */ FleekSesConfigs$Triggers copy$default(FleekSesConfigs$Triggers fleekSesConfigs$Triggers, Boolean bl2, Boolean bl3, Integer n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = fleekSesConfigs$Triggers.onlaunch;
        }
        if ((n7 = n4 & 2) != 0) {
            bl3 = fleekSesConfigs$Triggers.tabSwitch;
        }
        if ((n4 &= 4) != 0) {
            n3 = fleekSesConfigs$Triggers.threshold;
        }
        return fleekSesConfigs$Triggers.copy(bl2, bl3, n3);
    }

    public final Boolean component1() {
        return this.onlaunch;
    }

    public final Boolean component2() {
        return this.tabSwitch;
    }

    public final Integer component3() {
        return this.threshold;
    }

    public final FleekSesConfigs$Triggers copy(Boolean bl2, Boolean bl3, Integer n3) {
        FleekSesConfigs$Triggers fleekSesConfigs$Triggers = new FleekSesConfigs$Triggers(bl2, bl3, n3);
        return fleekSesConfigs$Triggers;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FleekSesConfigs$Triggers;
        if (!bl3) {
            return false;
        }
        object = (FleekSesConfigs$Triggers)object;
        Comparable<Boolean> comparable = this.onlaunch;
        Boolean bl4 = ((FleekSesConfigs$Triggers)object).onlaunch;
        bl3 = Intrinsics.areEqual(comparable, bl4);
        if (!bl3) {
            return false;
        }
        comparable = this.tabSwitch;
        bl4 = ((FleekSesConfigs$Triggers)object).tabSwitch;
        bl3 = Intrinsics.areEqual(comparable, bl4);
        if (!bl3) {
            return false;
        }
        comparable = this.threshold;
        object = ((FleekSesConfigs$Triggers)object).threshold;
        boolean bl5 = Intrinsics.areEqual(comparable, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getOnlaunch() {
        return this.onlaunch;
    }

    public final Boolean getTabSwitch() {
        return this.tabSwitch;
    }

    public final Integer getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.onlaunch;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Comparable<Boolean> comparable = this.tabSwitch;
        if (comparable == null) {
            n3 = 0;
            comparable = null;
        } else {
            n3 = comparable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        comparable = this.threshold;
        if (comparable != null) {
            n7 = comparable.hashCode();
        }
        return n4 + n7;
    }

    public final void setOnlaunch(Boolean bl2) {
        this.onlaunch = bl2;
    }

    public final void setTabSwitch(Boolean bl2) {
        this.tabSwitch = bl2;
    }

    public final void setThreshold(Integer n3) {
        this.threshold = n3;
    }

    public String toString() {
        Boolean bl2 = this.onlaunch;
        Boolean bl3 = this.tabSwitch;
        Integer n3 = this.threshold;
        StringBuilder stringBuilder = new StringBuilder("Triggers(onlaunch=");
        stringBuilder.append(bl2);
        stringBuilder.append(", tabSwitch=");
        stringBuilder.append(bl3);
        stringBuilder.append(", threshold=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

