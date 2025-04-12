/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.rto.entity;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RtoFirebaseData {
    public static final int $stable = 8;
    private String defaultReason;
    private String description;
    private Boolean isDialogCancelable;
    private Boolean isRTOEnabled;
    private String reasonNotListedText;
    private ArrayList reasons;
    private String subTitle;
    private String title;
    private int visibilityThreshold;

    public RtoFirebaseData() {
        this(null, null, null, null, null, null, null, null, 0, 511, null);
    }

    public RtoFirebaseData(String string2, String string3, String string4, ArrayList arrayList, String string5, String string6, Boolean bl2, Boolean bl3, int n3) {
        Intrinsics.checkNotNullParameter(arrayList, "reasons");
        this.subTitle = string2;
        this.title = string3;
        this.description = string4;
        this.reasons = arrayList;
        this.defaultReason = string5;
        this.reasonNotListedText = string6;
        this.isRTOEnabled = bl2;
        this.isDialogCancelable = bl3;
        this.visibilityThreshold = n3;
    }

    public /* synthetic */ RtoFirebaseData(String object, String string2, String string3, ArrayList object2, String object3, String string4, Boolean object4, Boolean bl2, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        String string6;
        String string7;
        String string8;
        int n7 = n4;
        int n8 = n4 & 1;
        String string9 = null;
        if (n8 != 0) {
            n8 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n15 = n7 & 8;
        Object object5 = n15 != 0 ? new Object() : object2;
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string5 = null;
        } else {
            string5 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 == 0) {
            string9 = string4;
        }
        n17 = n7 & 0x40;
        Object object6 = n17 != 0 ? Boolean.FALSE : object4;
        int n18 = n7 & 0x80;
        Boolean bl3 = n18 != 0 ? Boolean.TRUE : bl2;
        n7 = (n7 &= 0x100) != 0 ? 3 : n3;
        object = this;
        string2 = string8;
        string3 = string7;
        object2 = string6;
        object3 = object5;
        string4 = string5;
        object4 = string9;
        bl2 = object6;
        n4 = n7;
        this(string8, string7, string6, (ArrayList)object5, string5, string9, (Boolean)object6, bl3, n7);
    }

    public static /* synthetic */ RtoFirebaseData copy$default(RtoFirebaseData rtoFirebaseData, String string2, String string3, String string4, ArrayList arrayList, String string5, String string6, Boolean bl2, Boolean bl3, int n3, int n4, Object object) {
        RtoFirebaseData rtoFirebaseData2 = rtoFirebaseData;
        int n7 = n4;
        int n8 = n4 & 1;
        String string7 = n8 != 0 ? rtoFirebaseData.subTitle : string2;
        int n10 = n7 & 2;
        String string8 = n10 != 0 ? rtoFirebaseData2.title : string3;
        int n14 = n7 & 4;
        String string9 = n14 != 0 ? rtoFirebaseData2.description : string4;
        int n15 = n7 & 8;
        ArrayList arrayList2 = n15 != 0 ? rtoFirebaseData2.reasons : arrayList;
        int n16 = n7 & 0x10;
        String string10 = n16 != 0 ? rtoFirebaseData2.defaultReason : string5;
        int n17 = n7 & 0x20;
        String string11 = n17 != 0 ? rtoFirebaseData2.reasonNotListedText : string6;
        int n18 = n7 & 0x40;
        Boolean bl4 = n18 != 0 ? rtoFirebaseData2.isRTOEnabled : bl2;
        int n19 = n7 & 0x80;
        Boolean bl5 = n19 != 0 ? rtoFirebaseData2.isDialogCancelable : bl3;
        n7 = (n7 &= 0x100) != 0 ? rtoFirebaseData2.visibilityThreshold : n3;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        arrayList = arrayList2;
        string5 = string10;
        string6 = string11;
        bl2 = bl4;
        bl3 = bl5;
        n3 = n7;
        return rtoFirebaseData.copy(string7, string8, string9, arrayList2, string10, string11, bl4, bl5, n7);
    }

    public final String component1() {
        return this.subTitle;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final ArrayList component4() {
        return this.reasons;
    }

    public final String component5() {
        return this.defaultReason;
    }

    public final String component6() {
        return this.reasonNotListedText;
    }

    public final Boolean component7() {
        return this.isRTOEnabled;
    }

    public final Boolean component8() {
        return this.isDialogCancelable;
    }

    public final int component9() {
        return this.visibilityThreshold;
    }

    public final RtoFirebaseData copy(String string2, String string3, String string4, ArrayList arrayList, String string5, String string6, Boolean bl2, Boolean bl3, int n3) {
        Intrinsics.checkNotNullParameter(arrayList, "reasons");
        RtoFirebaseData rtoFirebaseData = new RtoFirebaseData(string2, string3, string4, arrayList, string5, string6, bl2, bl3, n3);
        return rtoFirebaseData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof RtoFirebaseData;
        if (n3 == 0) {
            return false;
        }
        object = (RtoFirebaseData)object;
        Object object2 = this.subTitle;
        Object object3 = ((RtoFirebaseData)object).subTitle;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.title;
        object3 = ((RtoFirebaseData)object).title;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.description;
        object3 = ((RtoFirebaseData)object).description;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.reasons;
        object3 = ((RtoFirebaseData)object).reasons;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.defaultReason;
        object3 = ((RtoFirebaseData)object).defaultReason;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.reasonNotListedText;
        object3 = ((RtoFirebaseData)object).reasonNotListedText;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isRTOEnabled;
        object3 = ((RtoFirebaseData)object).isRTOEnabled;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isDialogCancelable;
        object3 = ((RtoFirebaseData)object).isDialogCancelable;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.visibilityThreshold;
        int n4 = ((RtoFirebaseData)object).visibilityThreshold;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getDefaultReason() {
        return this.defaultReason;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getReasonNotListedText() {
        return this.reasonNotListedText;
    }

    public final ArrayList getReasons() {
        return this.reasons;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        int n3;
        int n4;
        Object object = this.subTitle;
        int n7 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n4 *= 31;
        Object object2 = this.title;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.description;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.reasons;
        n3 = (((ArrayList)object2).hashCode() + n4) * 31;
        object = this.defaultReason;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.reasonNotListedText;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.isRTOEnabled;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.isDialogCancelable;
        if (object != null) {
            n7 = object.hashCode();
        }
        n3 = (n3 + n7) * 31;
        n4 = this.visibilityThreshold;
        return n3 + n4;
    }

    public final Boolean isDialogCancelable() {
        return this.isDialogCancelable;
    }

    public final Boolean isRTOEnabled() {
        return this.isRTOEnabled;
    }

    public final void setDefaultReason(String string2) {
        this.defaultReason = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDialogCancelable(Boolean bl2) {
        this.isDialogCancelable = bl2;
    }

    public final void setRTOEnabled(Boolean bl2) {
        this.isRTOEnabled = bl2;
    }

    public final void setReasonNotListedText(String string2) {
        this.reasonNotListedText = string2;
    }

    public final void setReasons(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.reasons = arrayList;
    }

    public final void setSubTitle(String string2) {
        this.subTitle = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setVisibilityThreshold(int n3) {
        this.visibilityThreshold = n3;
    }

    public String toString() {
        CharSequence charSequence = this.subTitle;
        String string2 = this.title;
        String string3 = this.description;
        ArrayList arrayList = this.reasons;
        String string4 = this.defaultReason;
        String string5 = this.reasonNotListedText;
        Boolean bl2 = this.isRTOEnabled;
        Boolean bl3 = this.isDialogCancelable;
        int n3 = this.visibilityThreshold;
        charSequence = og_1.a("RtoFirebaseData(subTitle=", (String)charSequence, ", title=", string2, ", description=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", reasons=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", defaultReason=");
        X50.a((StringBuilder)charSequence, string4, ", reasonNotListedText=", string5, ", isRTOEnabled=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", isDialogCancelable=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", visibilityThreshold=");
        return g30.a(n3, ")", (StringBuilder)charSequence);
    }
}

