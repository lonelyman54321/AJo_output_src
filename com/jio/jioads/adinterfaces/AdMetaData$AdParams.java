/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.instreamads.vastparser.model.CtaUrl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AdMetaData$AdParams {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public CtaUrl n;
    public String o;

    public AdMetaData$AdParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Short.MAX_VALUE, null);
    }

    public AdMetaData$AdParams(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, CtaUrl ctaUrl, String string15) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
        this.g = string8;
        this.h = string9;
        this.i = string10;
        this.j = string11;
        this.k = string12;
        this.l = string13;
        this.m = string14;
        this.n = ctaUrl;
        this.o = string15;
    }

    public /* synthetic */ AdMetaData$AdParams(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, CtaUrl object2, String object3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        CtaUrl ctaUrl;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        int n4 = n3;
        int n7 = n3 & 1;
        Object object4 = n7 != 0 ? "Visit Advertiser" : object;
        int n8 = n4 & 2;
        String string26 = null;
        if (n8 != 0) {
            n8 = 0;
            string25 = null;
        } else {
            string25 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string24 = null;
        } else {
            string24 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string23 = null;
        } else {
            string23 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string22 = null;
        } else {
            string22 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string21 = null;
        } else {
            string21 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string20 = null;
        } else {
            string20 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string19 = null;
        } else {
            string19 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string18 = null;
        } else {
            string18 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string17 = null;
        } else {
            string17 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string16 = null;
        } else {
            string16 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string15 = null;
        } else {
            string15 = string12;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string14 = null;
        } else {
            string14 = string13;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            ctaUrl = null;
        } else {
            ctaUrl = object2;
        }
        if ((n4 &= 0x4000) == 0) {
            string26 = object3;
        }
        object = this;
        string2 = object4;
        string3 = string25;
        string4 = string24;
        string5 = string23;
        string6 = string22;
        string7 = string21;
        string8 = string20;
        string9 = string19;
        string10 = string18;
        string11 = string17;
        string12 = string16;
        string13 = string15;
        object2 = string14;
        object3 = ctaUrl;
        this((String)object4, string25, string24, string23, string22, string21, string20, string19, string18, string17, string16, string15, string14, ctaUrl, string26);
    }

    public static /* synthetic */ AdMetaData$AdParams copy$default(AdMetaData$AdParams adMetaData$AdParams, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, CtaUrl ctaUrl, String string15, int n3, Object object) {
        AdMetaData$AdParams adMetaData$AdParams2 = adMetaData$AdParams;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = n7 != 0 ? adMetaData$AdParams.a : string2;
        int n8 = n4 & 2;
        String string17 = n8 != 0 ? adMetaData$AdParams2.b : string3;
        int n10 = n4 & 4;
        String string18 = n10 != 0 ? adMetaData$AdParams2.c : string4;
        int n14 = n4 & 8;
        String string19 = n14 != 0 ? adMetaData$AdParams2.d : string5;
        int n15 = n4 & 0x10;
        String string20 = n15 != 0 ? adMetaData$AdParams2.e : string6;
        int n16 = n4 & 0x20;
        String string21 = n16 != 0 ? adMetaData$AdParams2.f : string7;
        int n17 = n4 & 0x40;
        String string22 = n17 != 0 ? adMetaData$AdParams2.g : string8;
        int n18 = n4 & 0x80;
        String string23 = n18 != 0 ? adMetaData$AdParams2.h : string9;
        int n19 = n4 & 0x100;
        String string24 = n19 != 0 ? adMetaData$AdParams2.i : string10;
        int n20 = n4 & 0x200;
        String string25 = n20 != 0 ? adMetaData$AdParams2.j : string11;
        int n21 = n4 & 0x400;
        String string26 = n21 != 0 ? adMetaData$AdParams2.k : string12;
        int n22 = n4 & 0x800;
        String string27 = n22 != 0 ? adMetaData$AdParams2.l : string13;
        int n24 = n4 & 0x1000;
        String string28 = n24 != 0 ? adMetaData$AdParams2.m : string14;
        int n25 = n4 & 0x2000;
        CtaUrl ctaUrl2 = n25 != 0 ? adMetaData$AdParams2.n : ctaUrl;
        String string29 = (n4 &= 0x4000) != 0 ? adMetaData$AdParams2.o : string15;
        string2 = string16;
        string3 = string17;
        string4 = string18;
        string5 = string19;
        string6 = string20;
        string7 = string21;
        string8 = string22;
        string9 = string23;
        string10 = string24;
        string11 = string25;
        string12 = string26;
        string13 = string27;
        string14 = string28;
        ctaUrl = ctaUrl2;
        string15 = string29;
        return adMetaData$AdParams.copy(string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, ctaUrl2, string29);
    }

    public final String component1() {
        return this.a;
    }

    public final String component10() {
        return this.j;
    }

    public final String component11() {
        return this.k;
    }

    public final String component12() {
        return this.l;
    }

    public final String component13() {
        return this.m;
    }

    public final CtaUrl component14() {
        return this.n;
    }

    public final String component15() {
        return this.o;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final String component8() {
        return this.h;
    }

    public final String component9() {
        return this.i;
    }

    public final AdMetaData$AdParams copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, CtaUrl ctaUrl, String string15) {
        AdMetaData$AdParams adMetaData$AdParams = new AdMetaData$AdParams(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, ctaUrl, string15);
        return adMetaData$AdParams;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdMetaData$AdParams;
        if (!bl3) {
            return false;
        }
        object = (AdMetaData$AdParams)object;
        Object object2 = this.a;
        Object object3 = ((AdMetaData$AdParams)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((AdMetaData$AdParams)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((AdMetaData$AdParams)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((AdMetaData$AdParams)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((AdMetaData$AdParams)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((AdMetaData$AdParams)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((AdMetaData$AdParams)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.h;
        object3 = ((AdMetaData$AdParams)object).h;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.i;
        object3 = ((AdMetaData$AdParams)object).i;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.j;
        object3 = ((AdMetaData$AdParams)object).j;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.k;
        object3 = ((AdMetaData$AdParams)object).k;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.l;
        object3 = ((AdMetaData$AdParams)object).l;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.m;
        object3 = ((AdMetaData$AdParams)object).m;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.n;
        object3 = ((AdMetaData$AdParams)object).n;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.o;
        object = ((AdMetaData$AdParams)object).o;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAdDescription() {
        return this.f;
    }

    public final String getAdTitle() {
        return this.c;
    }

    public final CtaUrl getCtaUrl() {
        return this.n;
    }

    public final String getDescriptionTextColor() {
        return this.h;
    }

    public final String getIconUrl() {
        return this.e;
    }

    public final String getOpenInApp() {
        return this.o;
    }

    public final String getSecondaryCtaButtonColor() {
        return this.k;
    }

    public final String getSecondaryCtaText() {
        return this.i;
    }

    public final String getSecondaryCtaTextColor() {
        return this.j;
    }

    public final String getSecondaryCtaUrl() {
        return this.l;
    }

    public final String getSecondaryCtaUrlTracker() {
        return this.m;
    }

    public final String getTitleTextColor() {
        return this.g;
    }

    public final String getVideoButtonColor() {
        return this.b;
    }

    public final String getVideoCtaColor() {
        return this.d;
    }

    public final String getVideoCtaText() {
        return this.a;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.n;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CtaUrl)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.o;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAdDescription(String string2) {
        this.f = string2;
    }

    public final void setAdTitle(String string2) {
        this.c = string2;
    }

    public final void setCtaUrl(CtaUrl ctaUrl) {
        this.n = ctaUrl;
    }

    public final void setDescriptionTextColor(String string2) {
        this.h = string2;
    }

    public final void setIconUrl(String string2) {
        this.e = string2;
    }

    public final void setOpenInApp(String string2) {
        this.o = string2;
    }

    public final void setSecondaryCtaButtonColor(String string2) {
        this.k = string2;
    }

    public final void setSecondaryCtaText(String string2) {
        this.i = string2;
    }

    public final void setSecondaryCtaTextColor(String string2) {
        this.j = string2;
    }

    public final void setSecondaryCtaUrl(String string2) {
        this.l = string2;
    }

    public final void setSecondaryCtaUrlTracker(String string2) {
        this.m = string2;
    }

    public final void setTitleTextColor(String string2) {
        this.g = string2;
    }

    public final void setVideoButtonColor(String string2) {
        this.b = string2;
    }

    public final void setVideoCtaColor(String string2) {
        this.d = string2;
    }

    public final void setVideoCtaText(String string2) {
        this.a = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdParams(videoCtaText=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoButtonColor=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adTitle=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", videoCtaColor=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", iconUrl=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", adDescription=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", titleTextColor=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", descriptionTextColor=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(", secondaryCtaText=");
        object = this.i;
        stringBuilder.append((String)object);
        stringBuilder.append(", secondaryCtaTextColor=");
        object = this.j;
        stringBuilder.append((String)object);
        stringBuilder.append(", secondaryCtaButtonColor=");
        object = this.k;
        stringBuilder.append((String)object);
        stringBuilder.append(", secondaryCtaUrl=");
        object = this.l;
        stringBuilder.append((String)object);
        stringBuilder.append(", secondaryCtaUrlTracker=");
        object = this.m;
        stringBuilder.append((String)object);
        stringBuilder.append(", ctaUrl=");
        object = this.n;
        stringBuilder.append(object);
        stringBuilder.append(", openInApp=");
        object = this.o;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

