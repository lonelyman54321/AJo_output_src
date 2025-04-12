/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import com.ril.ajio.services.data.ajiocash.AWPaginationDetails;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ACPointsData {
    private ArrayList activePointHistoryResponses;
    private AWPaginationDetails paginationDetails;
    private AWPaginationDetails paginationRequest;
    private ArrayList pendingPointHistoryResponses;
    private ArrayList spendPointHistoryResponses;
    private Double totalBalance;
    private ArrayList walletHistoryResponses;

    public ACPointsData(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, AWPaginationDetails aWPaginationDetails, AWPaginationDetails aWPaginationDetails2, Double d2, ArrayList arrayList4) {
        this.activePointHistoryResponses = arrayList;
        this.pendingPointHistoryResponses = arrayList2;
        this.spendPointHistoryResponses = arrayList3;
        this.paginationDetails = aWPaginationDetails;
        this.paginationRequest = aWPaginationDetails2;
        this.totalBalance = d2;
        this.walletHistoryResponses = arrayList4;
    }

    public static /* synthetic */ ACPointsData copy$default(ACPointsData aCPointsData, ArrayList arrayList, ArrayList object, ArrayList arrayList2, AWPaginationDetails object2, AWPaginationDetails object3, Double object4, ArrayList object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = aCPointsData.activePointHistoryResponses;
        }
        if ((n4 = n3 & 2) != 0) {
            object = aCPointsData.pendingPointHistoryResponses;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            arrayList2 = aCPointsData.spendPointHistoryResponses;
        }
        ArrayList arrayList3 = arrayList2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = aCPointsData.paginationDetails;
        }
        AWPaginationDetails aWPaginationDetails = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = aCPointsData.paginationRequest;
        }
        AWPaginationDetails aWPaginationDetails2 = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = aCPointsData.totalBalance;
        }
        Double d2 = object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = aCPointsData.walletHistoryResponses;
        }
        ArrayList arrayList4 = object5;
        object = aCPointsData;
        arrayList2 = arrayList;
        object2 = object6;
        object3 = arrayList3;
        object4 = aWPaginationDetails;
        object5 = aWPaginationDetails2;
        object6 = arrayList4;
        return aCPointsData.copy(arrayList, (ArrayList)object2, arrayList3, aWPaginationDetails, aWPaginationDetails2, d2, arrayList4);
    }

    public final ArrayList component1() {
        return this.activePointHistoryResponses;
    }

    public final ArrayList component2() {
        return this.pendingPointHistoryResponses;
    }

    public final ArrayList component3() {
        return this.spendPointHistoryResponses;
    }

    public final AWPaginationDetails component4() {
        return this.paginationDetails;
    }

    public final AWPaginationDetails component5() {
        return this.paginationRequest;
    }

    public final Double component6() {
        return this.totalBalance;
    }

    public final ArrayList component7() {
        return this.walletHistoryResponses;
    }

    public final ACPointsData copy(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, AWPaginationDetails aWPaginationDetails, AWPaginationDetails aWPaginationDetails2, Double d2, ArrayList arrayList4) {
        ACPointsData aCPointsData = new ACPointsData(arrayList, arrayList2, arrayList3, aWPaginationDetails, aWPaginationDetails2, d2, arrayList4);
        return aCPointsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ACPointsData;
        if (!bl3) {
            return false;
        }
        object = (ACPointsData)object;
        Object object2 = this.activePointHistoryResponses;
        Object object3 = ((ACPointsData)object).activePointHistoryResponses;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pendingPointHistoryResponses;
        object3 = ((ACPointsData)object).pendingPointHistoryResponses;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.spendPointHistoryResponses;
        object3 = ((ACPointsData)object).spendPointHistoryResponses;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paginationDetails;
        object3 = ((ACPointsData)object).paginationDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paginationRequest;
        object3 = ((ACPointsData)object).paginationRequest;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalBalance;
        object3 = ((ACPointsData)object).totalBalance;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.walletHistoryResponses;
        object = ((ACPointsData)object).walletHistoryResponses;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getActivePointHistoryResponses() {
        return this.activePointHistoryResponses;
    }

    public final AWPaginationDetails getPaginationDetails() {
        return this.paginationDetails;
    }

    public final AWPaginationDetails getPaginationRequest() {
        return this.paginationRequest;
    }

    public final ArrayList getPendingPointHistoryResponses() {
        return this.pendingPointHistoryResponses;
    }

    public final ArrayList getSpendPointHistoryResponses() {
        return this.spendPointHistoryResponses;
    }

    public final Double getTotalBalance() {
        return this.totalBalance;
    }

    public final ArrayList getWalletHistoryResponses() {
        return this.walletHistoryResponses;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.activePointHistoryResponses;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        Object object = this.pendingPointHistoryResponses;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.spendPointHistoryResponses;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paginationDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AWPaginationDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paginationRequest;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AWPaginationDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalBalance;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.walletHistoryResponses;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setActivePointHistoryResponses(ArrayList arrayList) {
        this.activePointHistoryResponses = arrayList;
    }

    public final void setPaginationDetails(AWPaginationDetails aWPaginationDetails) {
        this.paginationDetails = aWPaginationDetails;
    }

    public final void setPaginationRequest(AWPaginationDetails aWPaginationDetails) {
        this.paginationRequest = aWPaginationDetails;
    }

    public final void setPendingPointHistoryResponses(ArrayList arrayList) {
        this.pendingPointHistoryResponses = arrayList;
    }

    public final void setSpendPointHistoryResponses(ArrayList arrayList) {
        this.spendPointHistoryResponses = arrayList;
    }

    public final void setTotalBalance(Double d2) {
        this.totalBalance = d2;
    }

    public final void setWalletHistoryResponses(ArrayList arrayList) {
        this.walletHistoryResponses = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.activePointHistoryResponses;
        ArrayList arrayList2 = this.pendingPointHistoryResponses;
        ArrayList arrayList3 = this.spendPointHistoryResponses;
        AWPaginationDetails aWPaginationDetails = this.paginationDetails;
        AWPaginationDetails aWPaginationDetails2 = this.paginationRequest;
        Double d2 = this.totalBalance;
        ArrayList arrayList4 = this.walletHistoryResponses;
        StringBuilder stringBuilder = new StringBuilder("ACPointsData(activePointHistoryResponses=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", pendingPointHistoryResponses=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", spendPointHistoryResponses=");
        stringBuilder.append(arrayList3);
        stringBuilder.append(", paginationDetails=");
        stringBuilder.append(aWPaginationDetails);
        stringBuilder.append(", paginationRequest=");
        stringBuilder.append(aWPaginationDetails2);
        stringBuilder.append(", totalBalance=");
        stringBuilder.append(d2);
        stringBuilder.append(", walletHistoryResponses=");
        stringBuilder.append(arrayList4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

