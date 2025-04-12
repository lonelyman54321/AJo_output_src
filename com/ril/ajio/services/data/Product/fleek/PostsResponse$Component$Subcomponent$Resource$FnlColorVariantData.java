/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData
implements Serializable {
    private final String brandName;
    private final String colorGroup;
    private final String outfitPictureURL;
    private final String thumbnailPictureURL;

    public PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "brandName");
        Intrinsics.checkNotNullParameter(string3, "colorGroup");
        Intrinsics.checkNotNullParameter(string4, "outfitPictureURL");
        Intrinsics.checkNotNullParameter(string5, "thumbnailPictureURL");
        this.brandName = string2;
        this.colorGroup = string3;
        this.outfitPictureURL = string4;
        this.thumbnailPictureURL = string5;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData copy$default(PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData.brandName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData.colorGroup;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData.outfitPictureURL;
        }
        if ((n3 &= 8) != 0) {
            string5 = postsResponse$Component$Subcomponent$Resource$FnlColorVariantData.thumbnailPictureURL;
        }
        return postsResponse$Component$Subcomponent$Resource$FnlColorVariantData.copy(string2, string3, string4, string5);
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

    public final PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData copy(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "brandName");
        Intrinsics.checkNotNullParameter(string3, "colorGroup");
        Intrinsics.checkNotNullParameter(string4, "outfitPictureURL");
        Intrinsics.checkNotNullParameter(string5, "thumbnailPictureURL");
        PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData postsResponse$Component$Subcomponent$Resource$FnlColorVariantData = new PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData(string2, string3, string4, string5);
        return postsResponse$Component$Subcomponent$Resource$FnlColorVariantData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData)object;
        String string2 = this.brandName;
        String string3 = ((PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData)object).brandName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.colorGroup;
        string3 = ((PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData)object).colorGroup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.outfitPictureURL;
        string3 = ((PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData)object).outfitPictureURL;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.thumbnailPictureURL;
        object = ((PostsResponse$Component$Subcomponent$Resource$FnlColorVariantData)object).thumbnailPictureURL;
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
        int n3 = this.brandName.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.colorGroup;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.outfitPictureURL;
        n3 = zy_2.b(n3, n4, string2);
        return this.thumbnailPictureURL.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.brandName;
        String string3 = this.colorGroup;
        String string4 = this.outfitPictureURL;
        String string5 = this.thumbnailPictureURL;
        return ko_0.a(og_1.a("FnlColorVariantData(brandName=", string2, ", colorGroup=", string3, ", outfitPictureURL="), string4, ", thumbnailPictureURL=", string5, ")");
    }
}

