/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import kotlin.jvm.internal.Intrinsics;

public final class PreviewUrl {
    public static final int $stable;
    private final String prodExploreBrandsFleek;
    private final String prodFeedFleek;
    private final String prodHome;
    private final String prodJioAd;
    private final String prodNav;
    private final String prodStores;
    private final String prodStoresV2;
    private final String prodStoresV3;
    private final String uatExploreBrandsFleek;
    private final String uatFeedFleek;
    private final String uatHome;
    private final String uatJioAd;
    private final String uatNav;
    private final String uatStores;
    private final String uatStoresv2;
    private final String uatStoresv3;

    public PreviewUrl(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17) {
        Intrinsics.checkNotNullParameter(string2, "prodStores");
        Intrinsics.checkNotNullParameter(string3, "uatStores");
        Intrinsics.checkNotNullParameter(string4, "prodStoresV2");
        Intrinsics.checkNotNullParameter(string5, "uatStoresv2");
        Intrinsics.checkNotNullParameter(string6, "prodStoresV3");
        Intrinsics.checkNotNullParameter(string7, "uatStoresv3");
        Intrinsics.checkNotNullParameter(string8, "prodNav");
        Intrinsics.checkNotNullParameter(string9, "uatNav");
        Intrinsics.checkNotNullParameter(string10, "prodHome");
        Intrinsics.checkNotNullParameter(string11, "uatHome");
        Intrinsics.checkNotNullParameter(string12, "prodJioAd");
        Intrinsics.checkNotNullParameter(string13, "uatJioAd");
        Intrinsics.checkNotNullParameter(string14, "uatFeedFleek");
        Intrinsics.checkNotNullParameter(string15, "prodFeedFleek");
        Intrinsics.checkNotNullParameter(string16, "uatExploreBrandsFleek");
        Intrinsics.checkNotNullParameter(string17, "prodExploreBrandsFleek");
        this.prodStores = string2;
        this.uatStores = string3;
        this.prodStoresV2 = string4;
        this.uatStoresv2 = string5;
        this.prodStoresV3 = string6;
        this.uatStoresv3 = string7;
        this.prodNav = string8;
        this.uatNav = string9;
        this.prodHome = string10;
        this.uatHome = string11;
        this.prodJioAd = string12;
        this.uatJioAd = string13;
        this.uatFeedFleek = string14;
        this.prodFeedFleek = string15;
        this.uatExploreBrandsFleek = string16;
        this.prodExploreBrandsFleek = string17;
    }

    public static /* synthetic */ PreviewUrl copy$default(PreviewUrl previewUrl, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, int n3, Object object) {
        PreviewUrl previewUrl2 = previewUrl;
        int n4 = n3;
        int n7 = n3 & 1;
        String string18 = n7 != 0 ? previewUrl.prodStores : string2;
        int n8 = n4 & 2;
        String string19 = n8 != 0 ? previewUrl2.uatStores : string3;
        int n10 = n4 & 4;
        String string20 = n10 != 0 ? previewUrl2.prodStoresV2 : string4;
        int n14 = n4 & 8;
        String string21 = n14 != 0 ? previewUrl2.uatStoresv2 : string5;
        int n15 = n4 & 0x10;
        String string22 = n15 != 0 ? previewUrl2.prodStoresV3 : string6;
        int n16 = n4 & 0x20;
        String string23 = n16 != 0 ? previewUrl2.uatStoresv3 : string7;
        int n17 = n4 & 0x40;
        String string24 = n17 != 0 ? previewUrl2.prodNav : string8;
        int n18 = n4 & 0x80;
        String string25 = n18 != 0 ? previewUrl2.uatNav : string9;
        int n19 = n4 & 0x100;
        String string26 = n19 != 0 ? previewUrl2.prodHome : string10;
        int n20 = n4 & 0x200;
        String string27 = n20 != 0 ? previewUrl2.uatHome : string11;
        int n21 = n4 & 0x400;
        String string28 = n21 != 0 ? previewUrl2.prodJioAd : string12;
        int n22 = n4 & 0x800;
        String string29 = n22 != 0 ? previewUrl2.uatJioAd : string13;
        int n24 = n4 & 0x1000;
        String string30 = n24 != 0 ? previewUrl2.uatFeedFleek : string14;
        int n25 = n4 & 0x2000;
        String string31 = n25 != 0 ? previewUrl2.prodFeedFleek : string15;
        string15 = string31;
        n25 = n4 & 0x4000;
        string31 = n25 != 0 ? previewUrl2.uatExploreBrandsFleek : string16;
        int n26 = 32768;
        String string32 = (n4 &= n26) != 0 ? previewUrl2.prodExploreBrandsFleek : string17;
        string2 = string18;
        string3 = string19;
        string4 = string20;
        string5 = string21;
        string6 = string22;
        string7 = string23;
        string8 = string24;
        string9 = string25;
        string10 = string26;
        string11 = string27;
        string12 = string28;
        string13 = string29;
        string14 = string30;
        string16 = string31;
        string17 = string32;
        return previewUrl.copy(string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string15, string31, string32);
    }

    public final String component1() {
        return this.prodStores;
    }

    public final String component10() {
        return this.uatHome;
    }

    public final String component11() {
        return this.prodJioAd;
    }

    public final String component12() {
        return this.uatJioAd;
    }

    public final String component13() {
        return this.uatFeedFleek;
    }

    public final String component14() {
        return this.prodFeedFleek;
    }

    public final String component15() {
        return this.uatExploreBrandsFleek;
    }

    public final String component16() {
        return this.prodExploreBrandsFleek;
    }

    public final String component2() {
        return this.uatStores;
    }

    public final String component3() {
        return this.prodStoresV2;
    }

    public final String component4() {
        return this.uatStoresv2;
    }

    public final String component5() {
        return this.prodStoresV3;
    }

    public final String component6() {
        return this.uatStoresv3;
    }

    public final String component7() {
        return this.prodNav;
    }

    public final String component8() {
        return this.uatNav;
    }

    public final String component9() {
        return this.prodHome;
    }

    public final PreviewUrl copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17) {
        Intrinsics.checkNotNullParameter(string2, "prodStores");
        Intrinsics.checkNotNullParameter(string3, "uatStores");
        Intrinsics.checkNotNullParameter(string4, "prodStoresV2");
        Intrinsics.checkNotNullParameter(string5, "uatStoresv2");
        Intrinsics.checkNotNullParameter(string6, "prodStoresV3");
        Intrinsics.checkNotNullParameter(string7, "uatStoresv3");
        Intrinsics.checkNotNullParameter(string8, "prodNav");
        Intrinsics.checkNotNullParameter(string9, "uatNav");
        Intrinsics.checkNotNullParameter(string10, "prodHome");
        Intrinsics.checkNotNullParameter(string11, "uatHome");
        Intrinsics.checkNotNullParameter(string12, "prodJioAd");
        Intrinsics.checkNotNullParameter(string13, "uatJioAd");
        Intrinsics.checkNotNullParameter(string14, "uatFeedFleek");
        Intrinsics.checkNotNullParameter(string15, "prodFeedFleek");
        Intrinsics.checkNotNullParameter(string16, "uatExploreBrandsFleek");
        Intrinsics.checkNotNullParameter(string17, "prodExploreBrandsFleek");
        PreviewUrl previewUrl = new PreviewUrl(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17);
        return previewUrl;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PreviewUrl;
        if (!bl3) {
            return false;
        }
        object = (PreviewUrl)object;
        String string2 = this.prodStores;
        String string3 = ((PreviewUrl)object).prodStores;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatStores;
        string3 = ((PreviewUrl)object).uatStores;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodStoresV2;
        string3 = ((PreviewUrl)object).prodStoresV2;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatStoresv2;
        string3 = ((PreviewUrl)object).uatStoresv2;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodStoresV3;
        string3 = ((PreviewUrl)object).prodStoresV3;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatStoresv3;
        string3 = ((PreviewUrl)object).uatStoresv3;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodNav;
        string3 = ((PreviewUrl)object).prodNav;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatNav;
        string3 = ((PreviewUrl)object).uatNav;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodHome;
        string3 = ((PreviewUrl)object).prodHome;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatHome;
        string3 = ((PreviewUrl)object).uatHome;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodJioAd;
        string3 = ((PreviewUrl)object).prodJioAd;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatJioAd;
        string3 = ((PreviewUrl)object).uatJioAd;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatFeedFleek;
        string3 = ((PreviewUrl)object).uatFeedFleek;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodFeedFleek;
        string3 = ((PreviewUrl)object).prodFeedFleek;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uatExploreBrandsFleek;
        string3 = ((PreviewUrl)object).uatExploreBrandsFleek;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.prodExploreBrandsFleek;
        object = ((PreviewUrl)object).prodExploreBrandsFleek;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getProdExploreBrandsFleek() {
        return this.prodExploreBrandsFleek;
    }

    public final String getProdFeedFleek() {
        return this.prodFeedFleek;
    }

    public final String getProdHome() {
        return this.prodHome;
    }

    public final String getProdJioAd() {
        return this.prodJioAd;
    }

    public final String getProdNav() {
        return this.prodNav;
    }

    public final String getProdStores() {
        return this.prodStores;
    }

    public final String getProdStoresV2() {
        return this.prodStoresV2;
    }

    public final String getProdStoresV3() {
        return this.prodStoresV3;
    }

    public final String getUatExploreBrandsFleek() {
        return this.uatExploreBrandsFleek;
    }

    public final String getUatFeedFleek() {
        return this.uatFeedFleek;
    }

    public final String getUatHome() {
        return this.uatHome;
    }

    public final String getUatJioAd() {
        return this.uatJioAd;
    }

    public final String getUatNav() {
        return this.uatNav;
    }

    public final String getUatStores() {
        return this.uatStores;
    }

    public final String getUatStoresv2() {
        return this.uatStoresv2;
    }

    public final String getUatStoresv3() {
        return this.uatStoresv3;
    }

    public int hashCode() {
        int n3 = this.prodStores.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.uatStores;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodStoresV2;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatStoresv2;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodStoresV3;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatStoresv3;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodNav;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatNav;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodHome;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatHome;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodJioAd;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatJioAd;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatFeedFleek;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.prodFeedFleek;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.uatExploreBrandsFleek;
        n3 = zy_2.b(n3, n4, string2);
        return this.prodExploreBrandsFleek.hashCode() + n3;
    }

    public String toString() {
        Object object = this;
        String string2 = this.prodStores;
        String string3 = this.uatStores;
        String string4 = this.prodStoresV2;
        String string5 = this.uatStoresv2;
        String string6 = this.prodStoresV3;
        String string7 = this.uatStoresv3;
        String string8 = this.prodNav;
        String string9 = this.uatNav;
        String string10 = this.prodHome;
        String string11 = this.uatHome;
        String string12 = this.prodJioAd;
        String string13 = this.uatJioAd;
        String string14 = this.uatFeedFleek;
        String string15 = this.prodFeedFleek;
        String string16 = this.uatExploreBrandsFleek;
        String string17 = this.prodExploreBrandsFleek;
        object = og_1.a("PreviewUrl(prodStores=", string2, ", uatStores=", string3, ", prodStoresV2=");
        X50.a((StringBuilder)object, string4, ", uatStoresv2=", string5, ", prodStoresV3=");
        X50.a((StringBuilder)object, string6, ", uatStoresv3=", string7, ", prodNav=");
        X50.a((StringBuilder)object, string8, ", uatNav=", string9, ", prodHome=");
        X50.a((StringBuilder)object, string10, ", uatHome=", string11, ", prodJioAd=");
        X50.a((StringBuilder)object, string12, ", uatJioAd=", string13, ", uatFeedFleek=");
        string4 = string14;
        X50.a((StringBuilder)object, string14, ", prodFeedFleek=", string15, ", uatExploreBrandsFleek=");
        string4 = string16;
        string5 = string17;
        return ko_0.a((StringBuilder)object, string16, ", prodExploreBrandsFleek=", string17, ")");
    }
}

