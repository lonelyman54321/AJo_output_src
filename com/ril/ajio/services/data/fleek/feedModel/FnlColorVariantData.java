/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FnlColorVariantData {
    private String brandName;
    private String colorGroup;
    private String outfitPictureURL;
    private String thumbnailPictureURL;

    public FnlColorVariantData() {
        this(null, null, null, null, 15, null);
    }

    public FnlColorVariantData(String string2, String string3, String string4, String string5) {
        this.brandName = string2;
        this.colorGroup = string3;
        this.outfitPictureURL = string4;
        this.thumbnailPictureURL = string5;
    }

    public /* synthetic */ FnlColorVariantData(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ FnlColorVariantData copy$default(FnlColorVariantData fnlColorVariantData, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fnlColorVariantData.brandName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = fnlColorVariantData.colorGroup;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = fnlColorVariantData.outfitPictureURL;
        }
        if ((n3 &= 8) != 0) {
            string5 = fnlColorVariantData.thumbnailPictureURL;
        }
        return fnlColorVariantData.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.brandName;
    }

    public final String component2() {
        return this.colorGroup;
    }

    public final String component3() {
        return this.outfitPictureURL;
    }

    public final String component4() {
        return this.thumbnailPictureURL;
    }

    public final FnlColorVariantData copy(String string2, String string3, String string4, String string5) {
        FnlColorVariantData fnlColorVariantData = new FnlColorVariantData(string2, string3, string4, string5);
        return fnlColorVariantData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FnlColorVariantData;
        if (!bl3) {
            return false;
        }
        object = (FnlColorVariantData)object;
        String string2 = this.brandName;
        String string3 = ((FnlColorVariantData)object).brandName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.colorGroup;
        string3 = ((FnlColorVariantData)object).colorGroup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.outfitPictureURL;
        string3 = ((FnlColorVariantData)object).outfitPictureURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.thumbnailPictureURL;
        object = ((FnlColorVariantData)object).thumbnailPictureURL;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getColorGroup() {
        return this.colorGroup;
    }

    public final String getOutfitPictureURL() {
        return this.outfitPictureURL;
    }

    public final String getThumbnailPictureURL() {
        return this.thumbnailPictureURL;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.colorGroup;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.outfitPictureURL;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.thumbnailPictureURL;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setColorGroup(String string2) {
        this.colorGroup = string2;
    }

    public final void setOutfitPictureURL(String string2) {
        this.outfitPictureURL = string2;
    }

    public final void setThumbnailPictureURL(String string2) {
        this.thumbnailPictureURL = string2;
    }

    public String toString() {
        String string2 = this.brandName;
        String string3 = this.colorGroup;
        String string4 = this.outfitPictureURL;
        String string5 = this.thumbnailPictureURL;
        return ko_0.a(og_1.a("FnlColorVariantData(brandName=", string2, ", colorGroup=", string3, ", outfitPictureURL="), string4, ", thumbnailPictureURL=", string5, ")");
    }
}

