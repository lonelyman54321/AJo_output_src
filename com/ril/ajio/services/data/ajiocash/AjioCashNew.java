/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import com.ril.ajio.services.data.ajiocash.GiftCard;
import com.ril.ajio.services.data.ajiocash.WalletTotal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AjioCashNew {
    private GiftCard egiftCard;
    private List extraResponseParams;
    private List moneys;
    private List topExpiringPoints;
    private WalletTotal totalWalletBalance;

    public AjioCashNew(List list, List list2, List list3, WalletTotal walletTotal, GiftCard giftCard) {
        this.moneys = list;
        this.topExpiringPoints = list2;
        this.extraResponseParams = list3;
        this.totalWalletBalance = walletTotal;
        this.egiftCard = giftCard;
    }

    public static /* synthetic */ AjioCashNew copy$default(AjioCashNew ajioCashNew, List list, List object, List list2, WalletTotal object2, GiftCard object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = ajioCashNew.moneys;
        }
        if ((n4 = n3 & 2) != 0) {
            object = ajioCashNew.topExpiringPoints;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            list2 = ajioCashNew.extraResponseParams;
        }
        List list3 = list2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = ajioCashNew.totalWalletBalance;
        }
        WalletTotal walletTotal = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = ajioCashNew.egiftCard;
        }
        GiftCard giftCard = object3;
        object = ajioCashNew;
        list2 = list;
        object2 = object4;
        object3 = list3;
        object4 = giftCard;
        return ajioCashNew.copy(list, (List)object2, list3, walletTotal, giftCard);
    }

    public final List component1() {
        return this.moneys;
    }

    public final List component2() {
        return this.topExpiringPoints;
    }

    public final List component3() {
        return this.extraResponseParams;
    }

    public final WalletTotal component4() {
        return this.totalWalletBalance;
    }

    public final GiftCard component5() {
        return this.egiftCard;
    }

    public final AjioCashNew copy(List list, List list2, List list3, WalletTotal walletTotal, GiftCard giftCard) {
        AjioCashNew ajioCashNew = new AjioCashNew(list, list2, list3, walletTotal, giftCard);
        return ajioCashNew;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjioCashNew;
        if (!bl3) {
            return false;
        }
        object = (AjioCashNew)object;
        Object object2 = this.moneys;
        Object object3 = ((AjioCashNew)object).moneys;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.topExpiringPoints;
        object3 = ((AjioCashNew)object).topExpiringPoints;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.extraResponseParams;
        object3 = ((AjioCashNew)object).extraResponseParams;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalWalletBalance;
        object3 = ((AjioCashNew)object).totalWalletBalance;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.egiftCard;
        object = ((AjioCashNew)object).egiftCard;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final GiftCard getEgiftCard() {
        return this.egiftCard;
    }

    public final List getExtraResponseParams() {
        return this.extraResponseParams;
    }

    public final List getMoneys() {
        return this.moneys;
    }

    public final List getTopExpiringPoints() {
        return this.topExpiringPoints;
    }

    public final WalletTotal getTotalWalletBalance() {
        return this.totalWalletBalance;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.moneys;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        Object object = this.topExpiringPoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extraResponseParams;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalWalletBalance;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((WalletTotal)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.egiftCard;
        if (object != null) {
            n7 = ((GiftCard)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setEgiftCard(GiftCard giftCard) {
        this.egiftCard = giftCard;
    }

    public final void setExtraResponseParams(List list) {
        this.extraResponseParams = list;
    }

    public final void setMoneys(List list) {
        this.moneys = list;
    }

    public final void setTopExpiringPoints(List list) {
        this.topExpiringPoints = list;
    }

    public final void setTotalWalletBalance(WalletTotal walletTotal) {
        this.totalWalletBalance = walletTotal;
    }

    public String toString() {
        List list = this.moneys;
        List list2 = this.topExpiringPoints;
        List list3 = this.extraResponseParams;
        WalletTotal walletTotal = this.totalWalletBalance;
        GiftCard giftCard = this.egiftCard;
        StringBuilder stringBuilder = new StringBuilder("AjioCashNew(moneys=");
        stringBuilder.append(list);
        stringBuilder.append(", topExpiringPoints=");
        stringBuilder.append(list2);
        stringBuilder.append(", extraResponseParams=");
        stringBuilder.append(list3);
        stringBuilder.append(", totalWalletBalance=");
        stringBuilder.append(walletTotal);
        stringBuilder.append(", egiftCard=");
        stringBuilder.append(giftCard);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

