/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LpStoredCardBalanceList {
    private ArrayList responseList;

    public LpStoredCardBalanceList() {
        this(null, 1, null);
    }

    public LpStoredCardBalanceList(ArrayList arrayList) {
        this.responseList = arrayList;
    }

    public /* synthetic */ LpStoredCardBalanceList(ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            arrayList = null;
        }
        this(arrayList);
    }

    public static /* synthetic */ LpStoredCardBalanceList copy$default(LpStoredCardBalanceList lpStoredCardBalanceList, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = lpStoredCardBalanceList.responseList;
        }
        return lpStoredCardBalanceList.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.responseList;
    }

    public final LpStoredCardBalanceList copy(ArrayList arrayList) {
        LpStoredCardBalanceList lpStoredCardBalanceList = new LpStoredCardBalanceList(arrayList);
        return lpStoredCardBalanceList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LpStoredCardBalanceList;
        if (!bl3) {
            return false;
        }
        object = (LpStoredCardBalanceList)object;
        ArrayList arrayList = this.responseList;
        object = ((LpStoredCardBalanceList)object).responseList;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getResponseList() {
        return this.responseList;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.responseList;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setResponseList(ArrayList arrayList) {
        this.responseList = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.responseList;
        StringBuilder stringBuilder = new StringBuilder("LpStoredCardBalanceList(responseList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

