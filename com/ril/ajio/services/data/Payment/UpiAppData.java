/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UpiAppData
implements Serializable {
    private final String display_name;
    private final String icon_url;
    private final boolean is_active;
    private final String package_name;
    private final int priority;
    private final String uri_prefix;

    public UpiAppData(int n3, boolean bl2, String string2, String string3, String string4, String string5) {
        this.priority = n3;
        this.is_active = bl2;
        this.package_name = string2;
        this.uri_prefix = string3;
        this.display_name = string4;
        this.icon_url = string5;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ UpiAppData(int n3, boolean bl2, String string2, String string3, String string4, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var6_11;
        void var5_10;
        void var4_9;
        void var3_8;
        boolean bl3;
        void var7_12;
        int n7 = var7_12 & 2;
        if (n7 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n8 = var7_12 & 4;
        n7 = 0;
        Object object = n8 != 0 ? null : var3_8;
        int n10 = var7_12 & 8;
        Object object2 = n10 != 0 ? null : var4_9;
        int n14 = var7_12 & 0x10;
        Object object3 = n14 != 0 ? null : var5_10;
        int n15 = var7_12 & 0x20;
        Object object4 = n15 != 0 ? null : var6_11;
        this(n3, bl3, (String)object, (String)object2, (String)object3, (String)object4);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ UpiAppData copy$default(UpiAppData upiAppData, int n3, boolean bl2, String string2, String string3, String string4, String string5, int n4, Object object) {
        String string6;
        String string7;
        String string8;
        String string9;
        boolean bl3;
        void var7_12;
        int n7 = var7_12 & 1;
        if (n7) {
            n3 = upiAppData.priority;
        }
        if (n7 = var7_12 & 2) {
            bl3 = upiAppData.is_active;
        }
        n7 = bl3;
        int n8 = var7_12 & 4;
        if (n8 != 0) {
            string9 = upiAppData.package_name;
        }
        void var10_15 = string9;
        int n10 = var7_12 & 8;
        if (n10 != 0) {
            string8 = upiAppData.uri_prefix;
        }
        void var11_16 = string8;
        int n14 = var7_12 & 0x10;
        if (n14 != 0) {
            string7 = upiAppData.display_name;
        }
        void var12_17 = string7;
        int n15 = var7_12 & 0x20;
        if (n15 != 0) {
            string6 = upiAppData.icon_url;
        }
        void var13_18 = string6;
        string7 = var10_15;
        string6 = var11_16;
        return upiAppData.copy(n3, n7 != 0, (String)var10_15, (String)var11_16, (String)var12_17, (String)var13_18);
    }

    public final int component1() {
        return this.priority;
    }

    public final boolean component2() {
        return this.is_active;
    }

    public final String component3() {
        return this.package_name;
    }

    public final String component4() {
        return this.uri_prefix;
    }

    public final String component5() {
        return this.display_name;
    }

    public final String component6() {
        return this.icon_url;
    }

    public final UpiAppData copy(int n3, boolean bl2, String string2, String string3, String string4, String string5) {
        UpiAppData upiAppData = new UpiAppData(n3, bl2, string2, string3, string4, string5);
        return upiAppData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof UpiAppData;
        if (n3 == 0) {
            return false;
        }
        object = (UpiAppData)object;
        n3 = this.priority;
        int n4 = ((UpiAppData)object).priority;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.is_active ? 1 : 0);
        n4 = (int)(((UpiAppData)object).is_active ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        String string2 = this.package_name;
        String string3 = ((UpiAppData)object).package_name;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.uri_prefix;
        string3 = ((UpiAppData)object).uri_prefix;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.display_name;
        string3 = ((UpiAppData)object).display_name;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.icon_url;
        object = ((UpiAppData)object).icon_url;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getPackage_name() {
        return this.package_name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getUri_prefix() {
        return this.uri_prefix;
    }

    public int hashCode() {
        int n3 = this.priority * 31;
        int n4 = this.is_active;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        String string2 = this.package_name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        string2 = this.uri_prefix;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        string2 = this.display_name;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        string2 = this.icon_url;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n3 + n7;
    }

    public final boolean is_active() {
        return this.is_active;
    }

    public String toString() {
        int n3 = this.priority;
        boolean bl2 = this.is_active;
        String string2 = this.package_name;
        String string3 = this.uri_prefix;
        String string4 = this.display_name;
        String string5 = this.icon_url;
        StringBuilder stringBuilder = new StringBuilder("UpiAppData(priority=");
        stringBuilder.append(n3);
        stringBuilder.append(", is_active=");
        stringBuilder.append(bl2);
        stringBuilder.append(", package_name=");
        X50.a(stringBuilder, string2, ", uri_prefix=", string3, ", display_name=");
        return ko_0.a(stringBuilder, string4, ", icon_url=", string5, ")");
    }
}

