/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.h
 */
public final class h_0 {
    public final ArrayList a;
    public final ArrayList b;

    public h_0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof h_0;
        if (!bl3) {
            return false;
        }
        object = (h_0)object;
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = ((h_0)object).a;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList2 = this.b;
        object = ((h_0)object).b;
        boolean bl4 = Intrinsics.areEqual(arrayList2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            n4 = arrayList2.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SkippedAdAndCamp(camp=");
        ArrayList arrayList = this.a;
        stringBuilder.append(arrayList);
        stringBuilder.append(", ad=");
        arrayList = this.b;
        stringBuilder.append(arrayList);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

