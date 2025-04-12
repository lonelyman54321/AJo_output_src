/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.init;

import com.affise.attribution.network.CloudConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AffiseInitProperties {
    private final String affiseAppId;
    private final String appToken;
    private final List autoCatchingClickEvents;
    private final String domain;
    private final boolean enabledMetrics;
    private final boolean isProduction;
    private final String partParamName;
    private final String partParamNameToken;
    private final String secretKey;

    public AffiseInitProperties(String string2) {
        this(string2, false, null, null, null, null, null, false, null, 510, null);
    }

    public AffiseInitProperties(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "affiseAppId");
        Intrinsics.checkNotNullParameter(string3, "secretKey");
        string2 = ((Object)StringsKt.m0(string2)).toString();
        string3 = ((Object)StringsKt.m0(string3)).toString();
        this(string2, string3, true);
    }

    public AffiseInitProperties(String string2, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "affiseAppId");
        Intrinsics.checkNotNullParameter(string3, "secretKey");
        String string4 = ((Object)StringsKt.m0(string2)).toString();
        String string5 = ((Object)StringsKt.m0(string3)).toString();
        this(string4, bl2, null, null, null, string5, null, false, "https://tracking.affattr.com/");
    }

    public AffiseInitProperties(String string2, boolean bl2) {
        this(string2, bl2, null, null, null, null, null, false, null, 508, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3) {
        this(string2, bl2, string3, null, null, null, null, false, null, 504, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4) {
        this(string2, bl2, string3, string4, null, null, null, false, null, 496, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5) {
        this(string2, bl2, string3, string4, string5, null, null, false, null, 480, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5, String string6) {
        this(string2, bl2, string3, string4, string5, string6, null, false, null, 448, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5, String string6, List list) {
        this(string2, bl2, string3, string4, string5, string6, list, false, null, 384, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5, String string6, List list, boolean bl3) {
        this(string2, bl2, string3, string4, string5, string6, list, bl3, null, 256, null);
    }

    public AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5, String string6, List list, boolean bl3, String string7) {
        this.affiseAppId = string2;
        this.isProduction = bl2;
        this.partParamName = string3;
        this.partParamNameToken = string4;
        this.appToken = string5;
        this.secretKey = string6;
        this.autoCatchingClickEvents = list;
        this.enabledMetrics = bl3;
        this.domain = string7;
        CloudConfig.INSTANCE.setupDomain$attribution_release(string7);
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ AffiseInitProperties(String string2, boolean bl2, String string3, String string4, String string5, String string6, List object, boolean bl3, String object2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var23_28;
        String string7;
        String string8;
        String string9;
        String string10;
        int n4 = n3;
        int n7 = n3 & 2;
        n7 = n7 != 0 ? 1 : (int)(bl2 ? 1 : 0);
        int n8 = n4 & 4;
        Object object3 = null;
        if (n8 != 0) {
            n8 = 0;
            string10 = null;
        } else {
            string10 = string3;
        }
        int n10 = n4 & 8;
        if (n10 != 0) {
            n10 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n14 = n4 & 0x10;
        if (n14 != 0) {
            n14 = 0;
            string8 = null;
        } else {
            string8 = string5;
        }
        int n15 = n4 & 0x20;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        int n16 = n4 & 0x40;
        if (n16 == 0) {
            object3 = object;
        }
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl3;
        }
        Object object4 = (n4 &= 0x100) != 0 ? "https://tracking.affattr.com/" : object2;
        string3 = string2;
        string5 = string10;
        string6 = string9;
        object = string8;
        object2 = object3;
        void var10_11 = var23_28;
        this(string2, n7 != 0, string10, string9, string8, string7, (List)object3, (boolean)var23_28, (String)object4);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ AffiseInitProperties copy$default(AffiseInitProperties affiseInitProperties, String string2, boolean bl2, String string3, String string4, String string5, String string6, List list, boolean bl3, String string7, int n3, Object object) {
        void var27_33;
        void var16_19;
        AffiseInitProperties affiseInitProperties2 = affiseInitProperties;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = n7 != 0 ? affiseInitProperties.affiseAppId : string2;
        int bl4 = n4 & 2;
        if (bl4 != 0) {
            boolean bl5 = affiseInitProperties2.isProduction;
        } else {
            boolean bl6 = bl2;
        }
        int n8 = n4 & 4;
        String string9 = n8 != 0 ? affiseInitProperties2.partParamName : string3;
        int n10 = n4 & 8;
        String string10 = n10 != 0 ? affiseInitProperties2.partParamNameToken : string4;
        int n14 = n4 & 0x10;
        String string11 = n14 != 0 ? affiseInitProperties2.appToken : string5;
        int n15 = n4 & 0x20;
        String string12 = n15 != 0 ? affiseInitProperties2.secretKey : string6;
        int n16 = n4 & 0x40;
        List list2 = n16 != 0 ? affiseInitProperties2.autoCatchingClickEvents : list;
        int n17 = n4 & 0x80;
        if (n17 != 0) {
            boolean bl7 = affiseInitProperties2.enabledMetrics;
        } else {
            boolean bl8 = bl3;
        }
        String string13 = (n4 &= 0x100) != 0 ? affiseInitProperties2.domain : string7;
        string2 = string8;
        bl2 = var16_19;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        list = list2;
        bl3 = var27_33;
        string7 = string13;
        return affiseInitProperties.copy(string8, (boolean)var16_19, string9, string10, string11, string12, list2, (boolean)var27_33, string13);
    }

    public final String component1() {
        return this.affiseAppId;
    }

    public final boolean component2() {
        return this.isProduction;
    }

    public final String component3() {
        return this.partParamName;
    }

    public final String component4() {
        return this.partParamNameToken;
    }

    public final String component5() {
        return this.appToken;
    }

    public final String component6() {
        return this.secretKey;
    }

    public final List component7() {
        return this.autoCatchingClickEvents;
    }

    public final boolean component8() {
        return this.enabledMetrics;
    }

    public final String component9() {
        return this.domain;
    }

    public final AffiseInitProperties copy(String string2, boolean bl2, String string3, String string4, String string5, String string6, List list, boolean bl3, String string7) {
        AffiseInitProperties affiseInitProperties = new AffiseInitProperties(string2, bl2, string3, string4, string5, string6, list, bl3, string7);
        return affiseInitProperties;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiseInitProperties;
        if (!bl3) {
            return false;
        }
        object = (AffiseInitProperties)object;
        Object object2 = this.affiseAppId;
        Object object3 = ((AffiseInitProperties)object).affiseAppId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isProduction;
        boolean bl4 = ((AffiseInitProperties)object).isProduction;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.partParamName;
        object3 = ((AffiseInitProperties)object).partParamName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.partParamNameToken;
        object3 = ((AffiseInitProperties)object).partParamNameToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appToken;
        object3 = ((AffiseInitProperties)object).appToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.secretKey;
        object3 = ((AffiseInitProperties)object).secretKey;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autoCatchingClickEvents;
        object3 = ((AffiseInitProperties)object).autoCatchingClickEvents;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.enabledMetrics;
        bl4 = ((AffiseInitProperties)object).enabledMetrics;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.domain;
        object = ((AffiseInitProperties)object).domain;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAffiseAppId() {
        return this.affiseAppId;
    }

    public final String getAppToken() {
        return this.appToken;
    }

    public final List getAutoCatchingClickEvents() {
        return this.autoCatchingClickEvents;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final boolean getEnabledMetrics() {
        return this.enabledMetrics;
    }

    public final String getPartParamName() {
        return this.partParamName;
    }

    public final String getPartParamNameToken() {
        return this.partParamNameToken;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var4_20;
        void var4_17;
        void var4_14;
        void var4_11;
        void var4_8;
        int n3;
        int n32;
        String string2 = this.affiseAppId;
        int n4 = 0;
        if (string2 == null) {
            n32 = 0;
            string2 = null;
        } else {
            n32 = string2.hashCode();
        }
        n32 *= 31;
        boolean n7 = this.isProduction;
        int n8 = 1;
        if (n7) {
            n3 = 1;
        }
        n32 = (n32 + n3) * 31;
        Object object = this.partParamName;
        if (object == null) {
            boolean bl2 = false;
            object = null;
        } else {
            int n10 = ((String)object).hashCode();
        }
        n32 = (n32 + var4_8) * 31;
        object = this.partParamNameToken;
        if (object == null) {
            boolean bl3 = false;
            object = null;
        } else {
            int n14 = ((String)object).hashCode();
        }
        n32 = (n32 + var4_11) * 31;
        object = this.appToken;
        if (object == null) {
            boolean bl4 = false;
            object = null;
        } else {
            int n15 = ((String)object).hashCode();
        }
        n32 = (n32 + var4_14) * 31;
        object = this.secretKey;
        if (object == null) {
            boolean bl5 = false;
            object = null;
        } else {
            int n16 = ((String)object).hashCode();
        }
        n32 = (n32 + var4_17) * 31;
        object = this.autoCatchingClickEvents;
        if (object == null) {
            boolean bl6 = false;
            object = null;
        } else {
            int n17 = object.hashCode();
        }
        n32 = (n32 + var4_20) * 31;
        int n18 = this.enabledMetrics;
        if (n18 == 0) {
            n8 = n18;
        }
        n32 = (n32 + n8) * 31;
        object = this.domain;
        if (object != null) {
            n4 = ((String)object).hashCode();
        }
        return n32 + n4;
    }

    public final boolean isProduction() {
        return this.isProduction;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseInitProperties(affiseAppId=");
        Object object = this.affiseAppId;
        stringBuilder.append((String)object);
        stringBuilder.append(", isProduction=");
        boolean bl2 = this.isProduction;
        stringBuilder.append(bl2);
        stringBuilder.append(", partParamName=");
        object = this.partParamName;
        stringBuilder.append((String)object);
        stringBuilder.append(", partParamNameToken=");
        object = this.partParamNameToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", appToken=");
        object = this.appToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", secretKey=");
        object = this.secretKey;
        stringBuilder.append((String)object);
        stringBuilder.append(", autoCatchingClickEvents=");
        object = this.autoCatchingClickEvents;
        stringBuilder.append(object);
        stringBuilder.append(", enabledMetrics=");
        bl2 = this.enabledMetrics;
        stringBuilder.append(bl2);
        stringBuilder.append(", domain=");
        object = this.domain;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

