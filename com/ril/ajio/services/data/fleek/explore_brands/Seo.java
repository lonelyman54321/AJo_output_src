/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Seo {
    private String bottomDescription;
    private String canonicalUrl;
    private String metaDescription;
    private String metaKeyword;
    private String pageTitle;
    private String pageUrl;
    private String seoTitle;
    private String topBrands;
    private String topDescription;
    private String topSearches;
    private String twitterDescription;
    private String twitterKeyword;
    private String twitterTitle;

    public Seo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public Seo(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        this.bottomDescription = string2;
        this.canonicalUrl = string3;
        this.metaDescription = string4;
        this.metaKeyword = string5;
        this.pageTitle = string6;
        this.pageUrl = string7;
        this.seoTitle = string8;
        this.topBrands = string9;
        this.topDescription = string10;
        this.topSearches = string11;
        this.twitterDescription = string12;
        this.twitterKeyword = string13;
        this.twitterTitle = string14;
    }

    public /* synthetic */ Seo(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
        String string26 = null;
        if (n7 != 0) {
            n7 = 0;
            string25 = null;
        } else {
            string25 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string24 = null;
        } else {
            string24 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string23 = null;
        } else {
            string23 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string22 = null;
        } else {
            string22 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string21 = null;
        } else {
            string21 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string20 = null;
        } else {
            string20 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string19 = null;
        } else {
            string19 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string18 = null;
        } else {
            string18 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string17 = null;
        } else {
            string17 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string16 = null;
        } else {
            string16 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string15 = null;
        } else {
            string15 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string14 = null;
        } else {
            string14 = string12;
        }
        if ((n4 &= 0x1000) == 0) {
            string26 = string13;
        }
        object = this;
        string2 = string25;
        string3 = string24;
        string4 = string23;
        string5 = string22;
        string6 = string21;
        string7 = string20;
        string8 = string19;
        string9 = string18;
        string10 = string17;
        string11 = string16;
        string12 = string15;
        string13 = string14;
        this(string25, string24, string23, string22, string21, string20, string19, string18, string17, string16, string15, string14, string26);
    }

    public static /* synthetic */ Seo copy$default(Seo seo, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, int n3, Object object) {
        Seo seo2 = seo;
        int n4 = n3;
        int n7 = n3 & 1;
        String string15 = n7 != 0 ? seo.bottomDescription : string2;
        int n8 = n4 & 2;
        String string16 = n8 != 0 ? seo2.canonicalUrl : string3;
        int n10 = n4 & 4;
        String string17 = n10 != 0 ? seo2.metaDescription : string4;
        int n14 = n4 & 8;
        String string18 = n14 != 0 ? seo2.metaKeyword : string5;
        int n15 = n4 & 0x10;
        String string19 = n15 != 0 ? seo2.pageTitle : string6;
        int n16 = n4 & 0x20;
        String string20 = n16 != 0 ? seo2.pageUrl : string7;
        int n17 = n4 & 0x40;
        String string21 = n17 != 0 ? seo2.seoTitle : string8;
        int n18 = n4 & 0x80;
        String string22 = n18 != 0 ? seo2.topBrands : string9;
        int n19 = n4 & 0x100;
        String string23 = n19 != 0 ? seo2.topDescription : string10;
        int n20 = n4 & 0x200;
        String string24 = n20 != 0 ? seo2.topSearches : string11;
        int n21 = n4 & 0x400;
        String string25 = n21 != 0 ? seo2.twitterDescription : string12;
        int n22 = n4 & 0x800;
        String string26 = n22 != 0 ? seo2.twitterKeyword : string13;
        String string27 = (n4 &= 0x1000) != 0 ? seo2.twitterTitle : string14;
        string2 = string15;
        string3 = string16;
        string4 = string17;
        string5 = string18;
        string6 = string19;
        string7 = string20;
        string8 = string21;
        string9 = string22;
        string10 = string23;
        string11 = string24;
        string12 = string25;
        string13 = string26;
        string14 = string27;
        return seo.copy(string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27);
    }

    public final String component1() {
        return this.bottomDescription;
    }

    public final String component10() {
        return this.topSearches;
    }

    public final String component11() {
        return this.twitterDescription;
    }

    public final String component12() {
        return this.twitterKeyword;
    }

    public final String component13() {
        return this.twitterTitle;
    }

    public final String component2() {
        return this.canonicalUrl;
    }

    public final String component3() {
        return this.metaDescription;
    }

    public final String component4() {
        return this.metaKeyword;
    }

    public final String component5() {
        return this.pageTitle;
    }

    public final String component6() {
        return this.pageUrl;
    }

    public final String component7() {
        return this.seoTitle;
    }

    public final String component8() {
        return this.topBrands;
    }

    public final String component9() {
        return this.topDescription;
    }

    public final Seo copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        Seo seo = new Seo(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14);
        return seo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Seo;
        if (!bl3) {
            return false;
        }
        object = (Seo)object;
        String string2 = this.bottomDescription;
        String string3 = ((Seo)object).bottomDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.canonicalUrl;
        string3 = ((Seo)object).canonicalUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.metaDescription;
        string3 = ((Seo)object).metaDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.metaKeyword;
        string3 = ((Seo)object).metaKeyword;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pageTitle;
        string3 = ((Seo)object).pageTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pageUrl;
        string3 = ((Seo)object).pageUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.seoTitle;
        string3 = ((Seo)object).seoTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.topBrands;
        string3 = ((Seo)object).topBrands;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.topDescription;
        string3 = ((Seo)object).topDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.topSearches;
        string3 = ((Seo)object).topSearches;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.twitterDescription;
        string3 = ((Seo)object).twitterDescription;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.twitterKeyword;
        string3 = ((Seo)object).twitterKeyword;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.twitterTitle;
        object = ((Seo)object).twitterTitle;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBottomDescription() {
        return this.bottomDescription;
    }

    public final String getCanonicalUrl() {
        return this.canonicalUrl;
    }

    public final String getMetaDescription() {
        return this.metaDescription;
    }

    public final String getMetaKeyword() {
        return this.metaKeyword;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getSeoTitle() {
        return this.seoTitle;
    }

    public final String getTopBrands() {
        return this.topBrands;
    }

    public final String getTopDescription() {
        return this.topDescription;
    }

    public final String getTopSearches() {
        return this.topSearches;
    }

    public final String getTwitterDescription() {
        return this.twitterDescription;
    }

    public final String getTwitterKeyword() {
        return this.twitterKeyword;
    }

    public final String getTwitterTitle() {
        return this.twitterTitle;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.bottomDescription;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.canonicalUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.metaDescription;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.metaKeyword;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pageTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pageUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.seoTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.topBrands;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.topDescription;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.topSearches;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.twitterDescription;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.twitterKeyword;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.twitterTitle;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBottomDescription(String string2) {
        this.bottomDescription = string2;
    }

    public final void setCanonicalUrl(String string2) {
        this.canonicalUrl = string2;
    }

    public final void setMetaDescription(String string2) {
        this.metaDescription = string2;
    }

    public final void setMetaKeyword(String string2) {
        this.metaKeyword = string2;
    }

    public final void setPageTitle(String string2) {
        this.pageTitle = string2;
    }

    public final void setPageUrl(String string2) {
        this.pageUrl = string2;
    }

    public final void setSeoTitle(String string2) {
        this.seoTitle = string2;
    }

    public final void setTopBrands(String string2) {
        this.topBrands = string2;
    }

    public final void setTopDescription(String string2) {
        this.topDescription = string2;
    }

    public final void setTopSearches(String string2) {
        this.topSearches = string2;
    }

    public final void setTwitterDescription(String string2) {
        this.twitterDescription = string2;
    }

    public final void setTwitterKeyword(String string2) {
        this.twitterKeyword = string2;
    }

    public final void setTwitterTitle(String string2) {
        this.twitterTitle = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.bottomDescription;
        String string3 = this.canonicalUrl;
        String string4 = this.metaDescription;
        String string5 = this.metaKeyword;
        String string6 = this.pageTitle;
        String string7 = this.pageUrl;
        String string8 = this.seoTitle;
        String string9 = this.topBrands;
        String string10 = this.topDescription;
        String string11 = this.topSearches;
        String string12 = this.twitterDescription;
        String string13 = this.twitterKeyword;
        String string14 = this.twitterTitle;
        object = og_1.a("Seo(bottomDescription=", string2, ", canonicalUrl=", string3, ", metaDescription=");
        X50.a((StringBuilder)object, string4, ", metaKeyword=", string5, ", pageTitle=");
        X50.a((StringBuilder)object, string6, ", pageUrl=", string7, ", seoTitle=");
        X50.a((StringBuilder)object, string8, ", topBrands=", string9, ", topDescription=");
        X50.a((StringBuilder)object, string10, ", topSearches=", string11, ", twitterDescription=");
        X50.a((StringBuilder)object, string12, ", twitterKeyword=", string13, ", twitterTitle=");
        return h30_0.a((StringBuilder)object, string14, ")");
    }
}

