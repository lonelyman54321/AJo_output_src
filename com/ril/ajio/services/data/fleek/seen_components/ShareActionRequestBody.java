/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ShareActionRequestBody {
    private ArrayList data;

    public ShareActionRequestBody() {
        this(null, 1, null);
    }

    public ShareActionRequestBody(ArrayList arrayList) {
        this.data = arrayList;
    }

    public /* synthetic */ ShareActionRequestBody(ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            arrayList = null;
        }
        this(arrayList);
    }

    public static /* synthetic */ ShareActionRequestBody copy$default(ShareActionRequestBody shareActionRequestBody, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = shareActionRequestBody.data;
        }
        return shareActionRequestBody.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.data;
    }

    public final ShareActionRequestBody copy(ArrayList arrayList) {
        ShareActionRequestBody shareActionRequestBody = new ShareActionRequestBody(arrayList);
        return shareActionRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ShareActionRequestBody;
        if (!bl3) {
            return false;
        }
        object = (ShareActionRequestBody)object;
        ArrayList arrayList = this.data;
        object = ((ShareActionRequestBody)object).data;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getData() {
        return this.data;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.data;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setData(ArrayList arrayList) {
        this.data = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.data;
        StringBuilder stringBuilder = new StringBuilder("ShareActionRequestBody(data=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

