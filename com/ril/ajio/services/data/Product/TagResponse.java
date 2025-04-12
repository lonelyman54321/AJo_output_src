/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.Status;
import com.ril.ajio.services.data.Product.Tag;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class TagResponse
implements Serializable {
    private final Status status;
    private final Tag tag;

    public TagResponse(Status status, Tag tag) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.tag = tag;
    }

    public static /* synthetic */ TagResponse copy$default(TagResponse tagResponse, Status status, Tag tag, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            status = tagResponse.status;
        }
        if ((n3 &= 2) != 0) {
            tag = tagResponse.tag;
        }
        return tagResponse.copy(status, tag);
    }

    public final Status component1() {
        return this.status;
    }

    public final Tag component2() {
        return this.tag;
    }

    public final TagResponse copy(Status status, Tag tag) {
        Intrinsics.checkNotNullParameter(status, "status");
        TagResponse tagResponse = new TagResponse(status, tag);
        return tagResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TagResponse;
        if (!bl3) {
            return false;
        }
        object = (TagResponse)object;
        Object object2 = this.status;
        Status status = ((TagResponse)object).status;
        bl3 = Intrinsics.areEqual(object2, status);
        if (!bl3) {
            return false;
        }
        object2 = this.tag;
        object = ((TagResponse)object).tag;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Tag getTag() {
        return this.tag;
    }

    public int hashCode() {
        int n3;
        Status status = this.status;
        int n4 = status.hashCode() * 31;
        Tag tag = this.tag;
        if (tag == null) {
            n3 = 0;
            tag = null;
        } else {
            n3 = tag.hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        Status status = this.status;
        Tag tag = this.tag;
        StringBuilder stringBuilder = new StringBuilder("TagResponse(status=");
        stringBuilder.append(status);
        stringBuilder.append(", tag=");
        stringBuilder.append(tag);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

