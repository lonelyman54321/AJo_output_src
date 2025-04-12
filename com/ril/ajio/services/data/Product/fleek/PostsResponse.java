/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.PostsResponse$Status;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PostsResponse
implements Serializable {
    private List components;
    private final PostsResponse$Status status;

    public PostsResponse(List list, PostsResponse$Status postsResponse$Status) {
        Intrinsics.checkNotNullParameter(list, "components");
        Intrinsics.checkNotNullParameter(postsResponse$Status, "status");
        this.components = list;
        this.status = postsResponse$Status;
    }

    public static /* synthetic */ PostsResponse copy$default(PostsResponse postsResponse, List list, PostsResponse$Status postsResponse$Status, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = postsResponse.components;
        }
        if ((n3 &= 2) != 0) {
            postsResponse$Status = postsResponse.status;
        }
        return postsResponse.copy(list, postsResponse$Status);
    }

    public final List component1() {
        return this.components;
    }

    public final PostsResponse$Status component2() {
        return this.status;
    }

    public final PostsResponse copy(List list, PostsResponse$Status postsResponse$Status) {
        Intrinsics.checkNotNullParameter(list, "components");
        Intrinsics.checkNotNullParameter(postsResponse$Status, "status");
        PostsResponse postsResponse = new PostsResponse(list, postsResponse$Status);
        return postsResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostsResponse;
        if (!bl3) {
            return false;
        }
        object = (PostsResponse)object;
        Object object2 = this.components;
        List list = ((PostsResponse)object).components;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((PostsResponse)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getComponents() {
        return this.components;
    }

    public final PostsResponse$Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3 = ((Object)this.components).hashCode() * 31;
        return this.status.hashCode() + n3;
    }

    public final void setComponents(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.components = list;
    }

    public String toString() {
        List list = this.components;
        PostsResponse$Status postsResponse$Status = this.status;
        StringBuilder stringBuilder = new StringBuilder("PostsResponse(components=");
        stringBuilder.append(list);
        stringBuilder.append(", status=");
        stringBuilder.append(postsResponse$Status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

