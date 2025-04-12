/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$PriceRevealMetaInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$Subcomponent
implements Serializable {
    private final String description;
    private List media;
    private final String postType;
    private final PostsResponse$Component$Subcomponent$PriceRevealMetaInfo priceRevealMetaInfo;
    private final List resources;
    private final String subTitle;

    public PostsResponse$Component$Subcomponent(String string2, List list, String string3, PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo, List list2, String string4) {
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(list, "media");
        Intrinsics.checkNotNullParameter(string3, "postType");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$PriceRevealMetaInfo, "priceRevealMetaInfo");
        Intrinsics.checkNotNullParameter(list2, "resources");
        Intrinsics.checkNotNullParameter(string4, "subTitle");
        this.description = string2;
        this.media = list;
        this.postType = string3;
        this.priceRevealMetaInfo = postsResponse$Component$Subcomponent$PriceRevealMetaInfo;
        this.resources = list2;
        this.subTitle = string4;
    }

    public static /* synthetic */ PostsResponse$Component$Subcomponent copy$default(PostsResponse$Component$Subcomponent postsResponse$Component$Subcomponent, String string2, List object, String string3, PostsResponse$Component$Subcomponent$PriceRevealMetaInfo object2, List object3, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$Subcomponent.description;
        }
        if ((n4 = n3 & 2) != 0) {
            object = postsResponse$Component$Subcomponent.media;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = postsResponse$Component$Subcomponent.postType;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = postsResponse$Component$Subcomponent.priceRevealMetaInfo;
        }
        PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = postsResponse$Component$Subcomponent.resources;
        }
        List list = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = postsResponse$Component$Subcomponent.subTitle;
        }
        String string5 = object4;
        object = postsResponse$Component$Subcomponent;
        string3 = string2;
        object2 = object5;
        object3 = string4;
        object4 = postsResponse$Component$Subcomponent$PriceRevealMetaInfo;
        object5 = string5;
        return postsResponse$Component$Subcomponent.copy(string2, (List)object2, string4, postsResponse$Component$Subcomponent$PriceRevealMetaInfo, list, string5);
    }

    public final String component1() {
        return this.description;
    }

    public final List component2() {
        return this.media;
    }

    public final String component3() {
        return this.postType;
    }

    public final PostsResponse$Component$Subcomponent$PriceRevealMetaInfo component4() {
        return this.priceRevealMetaInfo;
    }

    public final List component5() {
        return this.resources;
    }

    public final String component6() {
        return this.subTitle;
    }

    public final PostsResponse$Component$Subcomponent copy(String string2, List list, String string3, PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo, List list2, String string4) {
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(list, "media");
        Intrinsics.checkNotNullParameter(string3, "postType");
        Intrinsics.checkNotNullParameter(postsResponse$Component$Subcomponent$PriceRevealMetaInfo, "priceRevealMetaInfo");
        Intrinsics.checkNotNullParameter(list2, "resources");
        Intrinsics.checkNotNullParameter(string4, "subTitle");
        PostsResponse$Component$Subcomponent postsResponse$Component$Subcomponent = new PostsResponse$Component$Subcomponent(string2, list, string3, postsResponse$Component$Subcomponent$PriceRevealMetaInfo, list2, string4);
        return postsResponse$Component$Subcomponent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$Subcomponent;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$Subcomponent)object;
        Object object2 = this.description;
        Object object3 = ((PostsResponse$Component$Subcomponent)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.media;
        object3 = ((PostsResponse$Component$Subcomponent)object).media;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postType;
        object3 = ((PostsResponse$Component$Subcomponent)object).postType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceRevealMetaInfo;
        object3 = ((PostsResponse$Component$Subcomponent)object).priceRevealMetaInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resources;
        object3 = ((PostsResponse$Component$Subcomponent)object).resources;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subTitle;
        object = ((PostsResponse$Component$Subcomponent)object).subTitle;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List getMedia() {
        return this.media;
    }

    public final String getPostType() {
        return this.postType;
    }

    public final PostsResponse$Component$Subcomponent$PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public final List getResources() {
        return this.resources;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        int n3 = this.description.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.media;
        n3 = ne_0.a(n3, n4, (List)object);
        object = this.postType;
        n3 = zy_2.b(n3, n4, (String)object);
        int n7 = (this.priceRevealMetaInfo.hashCode() + n3) * 31;
        List list = this.resources;
        n3 = ne_0.a(n7, n4, list);
        return this.subTitle.hashCode() + n3;
    }

    public final void setMedia(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.media = list;
    }

    public String toString() {
        String string2 = this.description;
        List list = this.media;
        String string3 = this.postType;
        PostsResponse$Component$Subcomponent$PriceRevealMetaInfo postsResponse$Component$Subcomponent$PriceRevealMetaInfo = this.priceRevealMetaInfo;
        List list2 = this.resources;
        String string4 = this.subTitle;
        StringBuilder stringBuilder = new StringBuilder("Subcomponent(description=");
        stringBuilder.append(string2);
        stringBuilder.append(", media=");
        stringBuilder.append(list);
        stringBuilder.append(", postType=");
        stringBuilder.append(string3);
        stringBuilder.append(", priceRevealMetaInfo=");
        stringBuilder.append(postsResponse$Component$Subcomponent$PriceRevealMetaInfo);
        stringBuilder.append(", resources=");
        stringBuilder.append(list2);
        stringBuilder.append(", subTitle=");
        stringBuilder.append(string4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

