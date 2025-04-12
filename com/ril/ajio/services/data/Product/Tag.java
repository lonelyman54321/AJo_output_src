/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Tag
implements Serializable {
    private final List categoryTags;

    public Tag(List list) {
        this.categoryTags = list;
    }

    public static /* synthetic */ Tag copy$default(Tag tag, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = tag.categoryTags;
        }
        return tag.copy(list);
    }

    public final List component1() {
        return this.categoryTags;
    }

    public final Tag copy(List list) {
        Tag tag = new Tag(list);
        return tag;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Tag;
        if (!bl3) {
            return false;
        }
        object = (Tag)object;
        List list = this.categoryTags;
        object = ((Tag)object).categoryTags;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getCategoryTags() {
        return this.categoryTags;
    }

    public int hashCode() {
        int n3;
        List list = this.categoryTags;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public String toString() {
        List list = this.categoryTags;
        StringBuilder stringBuilder = new StringBuilder("Tag(categoryTags=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

