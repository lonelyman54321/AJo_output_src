/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class DisplayMessageInfo {
    public static final DisplayMessageInfo$Companion Companion;
    private final Integer availableCoins;
    private final String message;
    private final Integer neededCoins;
    private final String title;

    static {
        DisplayMessageInfo$Companion displayMessageInfo$Companion;
        Companion = displayMessageInfo$Companion = new DisplayMessageInfo$Companion(null);
    }

    public DisplayMessageInfo() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DisplayMessageInfo(int n3, String string2, Integer n4, Integer n7, String string3, a03_0 a03_02) {
        int n8 = n3 & 1;
        this.title = n8 == 0 ? null : string2;
        int n10 = n3 & 2;
        this.availableCoins = n10 == 0 ? null : n4;
        n10 = n3 & 4;
        this.neededCoins = n10 == 0 ? null : n7;
        this.message = (n3 &= 8) == 0 ? null : string3;
    }

    public DisplayMessageInfo(String string2, Integer n3, Integer n4, String string3) {
        this.title = string2;
        this.availableCoins = n3;
        this.neededCoins = n4;
        this.message = string3;
    }

    public /* synthetic */ DisplayMessageInfo(String string2, Integer n3, Integer n4, String string3, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            string2 = null;
        }
        if ((n8 = n7 & 2) != 0) {
            n3 = null;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = null;
        }
        if ((n7 &= 8) != 0) {
            string3 = null;
        }
        this(string2, n3, n4, string3);
    }

    public static /* synthetic */ DisplayMessageInfo copy$default(DisplayMessageInfo displayMessageInfo, String string2, Integer n3, Integer n4, String string3, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            string2 = displayMessageInfo.title;
        }
        if ((n8 = n7 & 2) != 0) {
            n3 = displayMessageInfo.availableCoins;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = displayMessageInfo.neededCoins;
        }
        if ((n7 &= 8) != 0) {
            string3 = displayMessageInfo.message;
        }
        return displayMessageInfo.copy(string2, n3, n4, string3);
    }

    public static final /* synthetic */ void write$Self$shared_release(DisplayMessageInfo object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((DisplayMessageInfo)object).title) != null) {
            object3 = pe3_2.a;
            object2 = ((DisplayMessageInfo)object).title;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((DisplayMessageInfo)object).availableCoins) != null) {
            object3 = yi1_2.a;
            object2 = ((DisplayMessageInfo)object).availableCoins;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((DisplayMessageInfo)object).neededCoins) != null) {
            object3 = yi1_2.a;
            object2 = ((DisplayMessageInfo)object).neededCoins;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((DisplayMessageInfo)object).message) != null) {
            object3 = pe3_2.a;
            object = ((DisplayMessageInfo)object).message;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final Integer component2() {
        return this.availableCoins;
    }

    public final Integer component3() {
        return this.neededCoins;
    }

    public final String component4() {
        return this.message;
    }

    public final DisplayMessageInfo copy(String string2, Integer n3, Integer n4, String string3) {
        DisplayMessageInfo displayMessageInfo = new DisplayMessageInfo(string2, n3, n4, string3);
        return displayMessageInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DisplayMessageInfo;
        if (!bl3) {
            return false;
        }
        object = (DisplayMessageInfo)object;
        Object object2 = this.title;
        Object object3 = ((DisplayMessageInfo)object).title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.availableCoins;
        object3 = ((DisplayMessageInfo)object).availableCoins;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.neededCoins;
        object3 = ((DisplayMessageInfo)object).neededCoins;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object = ((DisplayMessageInfo)object).message;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getAvailableCoins() {
        return this.availableCoins;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getNeededCoins() {
        return this.neededCoins;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.availableCoins;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.neededCoins;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.title;
        Integer n3 = this.availableCoins;
        Integer n4 = this.neededCoins;
        String string3 = this.message;
        StringBuilder stringBuilder = new StringBuilder("DisplayMessageInfo(title=");
        stringBuilder.append(string2);
        stringBuilder.append(", availableCoins=");
        stringBuilder.append(n3);
        stringBuilder.append(", neededCoins=");
        stringBuilder.append(n4);
        stringBuilder.append(", message=");
        stringBuilder.append(string3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

