/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$SubcomponentsOwner;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component
implements Serializable {
    private final String brandID;
    private final String postID;
    private final List subcomponent;
    private final PostsResponse$Component$SubcomponentsOwner subcomponentsOwner;
    private final String tenant;

    public PostsResponse$Component(String string2, String string3, List list, PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner, String string4) {
        Intrinsics.checkNotNullParameter(string2, "brandID");
        Intrinsics.checkNotNullParameter(string3, "postID");
        Intrinsics.checkNotNullParameter(list, "subcomponent");
        Intrinsics.checkNotNullParameter(postsResponse$Component$SubcomponentsOwner, "subcomponentsOwner");
        Intrinsics.checkNotNullParameter(string4, "tenant");
        this.brandID = string2;
        this.postID = string3;
        this.subcomponent = list;
        this.subcomponentsOwner = postsResponse$Component$SubcomponentsOwner;
        this.tenant = string4;
    }

    public static /* synthetic */ PostsResponse$Component copy$default(PostsResponse$Component postsResponse$Component, String string2, String object, List object2, PostsResponse$Component$SubcomponentsOwner object3, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component.brandID;
        }
        if ((n4 = n3 & 2) != 0) {
            object = postsResponse$Component.postID;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = postsResponse$Component.subcomponent;
        }
        List list = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = postsResponse$Component.subcomponentsOwner;
        }
        PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = postsResponse$Component.tenant;
        }
        String string3 = object4;
        object = postsResponse$Component;
        object2 = string2;
        object3 = object5;
        object4 = list;
        object5 = string3;
        return postsResponse$Component.copy(string2, (String)object3, list, postsResponse$Component$SubcomponentsOwner, string3);
    }

    public final String component1() {
        return this.brandID;
    }

    public final String component2() {
        return this.postID;
    }

    public final List component3() {
        return this.subcomponent;
    }

    public final PostsResponse$Component$SubcomponentsOwner component4() {
        return this.subcomponentsOwner;
    }

    public final String component5() {
        return this.tenant;
    }

    public final PostsResponse$Component copy(String string2, String string3, List list, PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner, String string4) {
        Intrinsics.checkNotNullParameter(string2, "brandID");
        Intrinsics.checkNotNullParameter(string3, "postID");
        Intrinsics.checkNotNullParameter(list, "subcomponent");
        Intrinsics.checkNotNullParameter(postsResponse$Component$SubcomponentsOwner, "subcomponentsOwner");
        Intrinsics.checkNotNullParameter(string4, "tenant");
        PostsResponse$Component postsResponse$Component = new PostsResponse$Component(string2, string3, list, postsResponse$Component$SubcomponentsOwner, string4);
        return postsResponse$Component;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component)object;
        Object object2 = this.brandID;
        Object object3 = ((PostsResponse$Component)object).brandID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.postID;
        object3 = ((PostsResponse$Component)object).postID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponent;
        object3 = ((PostsResponse$Component)object).subcomponent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subcomponentsOwner;
        object3 = ((PostsResponse$Component)object).subcomponentsOwner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object = ((PostsResponse$Component)object).tenant;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandID() {
        return this.brandID;
    }

    public final String getPostID() {
        return this.postID;
    }

    public final List getSubcomponent() {
        return this.subcomponent;
    }

    public final PostsResponse$Component$SubcomponentsOwner getSubcomponentsOwner() {
        return this.subcomponentsOwner;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        int n3 = this.brandID.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.postID;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.subcomponent;
        n3 = ne_0.a(n3, n4, (List)object);
        int n7 = (this.subcomponentsOwner.hashCode() + n3) * 31;
        return this.tenant.hashCode() + n7;
    }

    public String toString() {
        CharSequence charSequence = this.brandID;
        String string2 = this.postID;
        List list = this.subcomponent;
        PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner = this.subcomponentsOwner;
        String string3 = this.tenant;
        charSequence = og_1.a("Component(brandID=", (String)charSequence, ", postID=", string2, ", subcomponent=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", subcomponentsOwner=");
        ((StringBuilder)charSequence).append(postsResponse$Component$SubcomponentsOwner);
        ((StringBuilder)charSequence).append(", tenant=");
        return h30_0.a((StringBuilder)charSequence, string3, ")");
    }
}

