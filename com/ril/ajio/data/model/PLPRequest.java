/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PLPRequest
implements Serializable {
    public static final int $stable;
    private final int currentPage;
    private final String prevProductListsOffset;

    public PLPRequest(String string2, int n3) {
        this.prevProductListsOffset = string2;
        this.currentPage = n3;
    }

    public static /* synthetic */ PLPRequest copy$default(PLPRequest pLPRequest, String string2, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = pLPRequest.prevProductListsOffset;
        }
        if ((n4 &= 2) != 0) {
            n3 = pLPRequest.currentPage;
        }
        return pLPRequest.copy(string2, n3);
    }

    public final String component1() {
        return this.prevProductListsOffset;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final PLPRequest copy(String string2, int n3) {
        PLPRequest pLPRequest = new PLPRequest(string2, n3);
        return pLPRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PLPRequest;
        if (n3 == 0) {
            return false;
        }
        object = (PLPRequest)object;
        String string2 = this.prevProductListsOffset;
        String string3 = ((PLPRequest)object).prevProductListsOffset;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.currentPage;
        int n4 = ((PLPRequest)object).currentPage;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getPrevProductListsOffset() {
        return this.prevProductListsOffset;
    }

    public int hashCode() {
        int n3;
        String string2 = this.prevProductListsOffset;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = this.currentPage;
        return (n3 *= 31) + n4;
    }

    public String toString() {
        String string2 = this.prevProductListsOffset;
        int n3 = this.currentPage;
        StringBuilder stringBuilder = new StringBuilder("PLPRequest(prevProductListsOffset=");
        stringBuilder.append(string2);
        stringBuilder.append(", currentPage=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

