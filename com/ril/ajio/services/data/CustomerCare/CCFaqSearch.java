/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CCFaqSearch {
    private final ArrayList results;

    public CCFaqSearch(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "results");
        this.results = arrayList;
    }

    public static /* synthetic */ CCFaqSearch copy$default(CCFaqSearch cCFaqSearch, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = cCFaqSearch.results;
        }
        return cCFaqSearch.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.results;
    }

    public final CCFaqSearch copy(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "results");
        CCFaqSearch cCFaqSearch = new CCFaqSearch(arrayList);
        return cCFaqSearch;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CCFaqSearch;
        if (!bl3) {
            return false;
        }
        object = (CCFaqSearch)object;
        ArrayList arrayList = this.results;
        object = ((CCFaqSearch)object).results;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public String toString() {
        ArrayList arrayList = this.results;
        StringBuilder stringBuilder = new StringBuilder("CCFaqSearch(results=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

