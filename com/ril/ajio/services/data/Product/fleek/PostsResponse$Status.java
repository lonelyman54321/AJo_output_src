/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;

public final class PostsResponse$Status
implements Serializable {
    private final int statusCode;

    public PostsResponse$Status(int n3) {
        this.statusCode = n3;
    }

    public static /* synthetic */ PostsResponse$Status copy$default(PostsResponse$Status postsResponse$Status, int n3, int n4, Object object) {
        if ((n4 &= 1) != 0) {
            n3 = postsResponse$Status.statusCode;
        }
        return postsResponse$Status.copy(n3);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final PostsResponse$Status copy(int n3) {
        PostsResponse$Status postsResponse$Status = new PostsResponse$Status(n3);
        return postsResponse$Status;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PostsResponse$Status;
        if (n3 == 0) {
            return false;
        }
        object = (PostsResponse$Status)object;
        n3 = this.statusCode;
        int n4 = ((PostsResponse$Status)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.statusCode;
    }

    public String toString() {
        return Gj0.b(this.statusCode, "Status(statusCode=", ")");
    }
}

