/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse$Component$SubcomponentsOwner
implements Serializable {
    private final String id;
    private final String imageUrl;
    private final String name;
    private final String type;

    public PostsResponse$Component$SubcomponentsOwner(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "name");
        Intrinsics.checkNotNullParameter(string5, "type");
        this.id = string2;
        this.imageUrl = string3;
        this.name = string4;
        this.type = string5;
    }

    public static /* synthetic */ PostsResponse$Component$SubcomponentsOwner copy$default(PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = postsResponse$Component$SubcomponentsOwner.id;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = postsResponse$Component$SubcomponentsOwner.imageUrl;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = postsResponse$Component$SubcomponentsOwner.name;
        }
        if ((n3 &= 8) != 0) {
            string5 = postsResponse$Component$SubcomponentsOwner.type;
        }
        return postsResponse$Component$SubcomponentsOwner.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.type;
    }

    public final PostsResponse$Component$SubcomponentsOwner copy(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "name");
        Intrinsics.checkNotNullParameter(string5, "type");
        PostsResponse$Component$SubcomponentsOwner postsResponse$Component$SubcomponentsOwner = new PostsResponse$Component$SubcomponentsOwner(string2, string3, string4, string5);
        return postsResponse$Component$SubcomponentsOwner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse$Component$SubcomponentsOwner;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse$Component$SubcomponentsOwner)object;
        String string2 = this.id;
        String string3 = ((PostsResponse$Component$SubcomponentsOwner)object).id;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageUrl;
        string3 = ((PostsResponse$Component$SubcomponentsOwner)object).imageUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.name;
        string3 = ((PostsResponse$Component$SubcomponentsOwner)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((PostsResponse$Component$SubcomponentsOwner)object).type;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3 = this.id.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.imageUrl;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.name;
        n3 = zy_2.b(n3, n4, string2);
        return this.type.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.id;
        String string3 = this.imageUrl;
        String string4 = this.name;
        String string5 = this.type;
        return ko_0.a(og_1.a("SubcomponentsOwner(id=", string2, ", imageUrl=", string3, ", name="), string4, ", type=", string5, ")");
    }
}

