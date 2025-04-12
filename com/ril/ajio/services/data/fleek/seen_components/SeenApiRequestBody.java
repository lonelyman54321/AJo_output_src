/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SeenApiRequestBody {
    private ArrayList post;
    private ArrayList story;

    public SeenApiRequestBody() {
        this(null, null, 3, null);
    }

    public SeenApiRequestBody(ArrayList arrayList, ArrayList arrayList2) {
        this.post = arrayList;
        this.story = arrayList2;
    }

    public /* synthetic */ SeenApiRequestBody(ArrayList arrayList, ArrayList arrayList2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n3 &= 2) != 0) {
            arrayList2 = null;
        }
        this(arrayList, arrayList2);
    }

    public static /* synthetic */ SeenApiRequestBody copy$default(SeenApiRequestBody seenApiRequestBody, ArrayList arrayList, ArrayList arrayList2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = seenApiRequestBody.post;
        }
        if ((n3 &= 2) != 0) {
            arrayList2 = seenApiRequestBody.story;
        }
        return seenApiRequestBody.copy(arrayList, arrayList2);
    }

    public final ArrayList component1() {
        return this.post;
    }

    public final ArrayList component2() {
        return this.story;
    }

    public final SeenApiRequestBody copy(ArrayList arrayList, ArrayList arrayList2) {
        SeenApiRequestBody seenApiRequestBody = new SeenApiRequestBody(arrayList, arrayList2);
        return seenApiRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SeenApiRequestBody;
        if (!bl3) {
            return false;
        }
        object = (SeenApiRequestBody)object;
        ArrayList arrayList = this.post;
        ArrayList arrayList2 = ((SeenApiRequestBody)object).post;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.story;
        object = ((SeenApiRequestBody)object).story;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getPost() {
        return this.post;
    }

    public final ArrayList getStory() {
        return this.story;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.post;
        int n4 = 0;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList2 = this.story;
        if (arrayList2 != null) {
            n4 = arrayList2.hashCode();
        }
        return n3 + n4;
    }

    public final void setPost(ArrayList arrayList) {
        this.post = arrayList;
    }

    public final void setStory(ArrayList arrayList) {
        this.story = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.post;
        ArrayList arrayList2 = this.story;
        StringBuilder stringBuilder = new StringBuilder("SeenApiRequestBody(post=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", story=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

