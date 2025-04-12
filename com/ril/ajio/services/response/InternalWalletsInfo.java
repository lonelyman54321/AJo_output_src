/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.response;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InternalWalletsInfo {
    private ArrayList internalWallets;
    private String loyaltyPointsInfo;
    private Boolean valid;

    public InternalWalletsInfo() {
        this(null, null, null, 7, null);
    }

    public InternalWalletsInfo(Boolean bl2, ArrayList arrayList, String string2) {
        this.valid = bl2;
        this.internalWallets = arrayList;
        this.loyaltyPointsInfo = string2;
    }

    public /* synthetic */ InternalWalletsInfo(Boolean bl2, ArrayList arrayList, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = null;
        }
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        this(bl2, arrayList, string2);
    }

    public static /* synthetic */ InternalWalletsInfo copy$default(InternalWalletsInfo internalWalletsInfo, Boolean bl2, ArrayList arrayList, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = internalWalletsInfo.valid;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = internalWalletsInfo.internalWallets;
        }
        if ((n3 &= 4) != 0) {
            string2 = internalWalletsInfo.loyaltyPointsInfo;
        }
        return internalWalletsInfo.copy(bl2, arrayList, string2);
    }

    public final Boolean component1() {
        return this.valid;
    }

    public final ArrayList component2() {
        return this.internalWallets;
    }

    public final String component3() {
        return this.loyaltyPointsInfo;
    }

    public final InternalWalletsInfo copy(Boolean bl2, ArrayList arrayList, String string2) {
        InternalWalletsInfo internalWalletsInfo = new InternalWalletsInfo(bl2, arrayList, string2);
        return internalWalletsInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InternalWalletsInfo;
        if (!bl3) {
            return false;
        }
        object = (InternalWalletsInfo)object;
        Object object2 = this.valid;
        Serializable serializable = ((InternalWalletsInfo)object).valid;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.internalWallets;
        serializable = ((InternalWalletsInfo)object).internalWallets;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.loyaltyPointsInfo;
        object = ((InternalWalletsInfo)object).loyaltyPointsInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getInternalWallets() {
        return this.internalWallets;
    }

    public final String getLoyaltyPointsInfo() {
        return this.loyaltyPointsInfo;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.valid;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.internalWallets;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.loyaltyPointsInfo;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setInternalWallets(ArrayList arrayList) {
        this.internalWallets = arrayList;
    }

    public final void setLoyaltyPointsInfo(String string2) {
        this.loyaltyPointsInfo = string2;
    }

    public final void setValid(Boolean bl2) {
        this.valid = bl2;
    }

    public String toString() {
        Boolean bl2 = this.valid;
        ArrayList arrayList = this.internalWallets;
        String string2 = this.loyaltyPointsInfo;
        StringBuilder stringBuilder = new StringBuilder("InternalWalletsInfo(valid=");
        stringBuilder.append(bl2);
        stringBuilder.append(", internalWallets=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", loyaltyPointsInfo=");
        return h30_0.a(stringBuilder, string2, ")");
    }
}

