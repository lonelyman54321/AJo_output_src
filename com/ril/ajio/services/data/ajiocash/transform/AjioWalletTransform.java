/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash.transform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AjioWalletTransform {
    private float activePoints;
    private String cashInfo;
    private Boolean isGiftCardLive;
    private float nonTransferableCash;
    private float pendingPoints;
    private String pointsInfo;
    private String tncURL;
    private float topExpiringPointAmount;
    private String topExpiringPointDate;
    private float totalCash;
    private float totalPoints;
    private float totalWalletBalance;
    private float transferableCash;
    private String walletType;

    public AjioWalletTransform() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 16383, null);
    }

    public AjioWalletTransform(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, String string2, String string3, String string4, String string5, Boolean bl2, String string6) {
        this.totalWalletBalance = f5;
        this.totalCash = f6;
        this.totalPoints = f7;
        this.transferableCash = f8;
        this.nonTransferableCash = f11;
        this.activePoints = f12;
        this.pendingPoints = f14;
        this.topExpiringPointAmount = f15;
        this.topExpiringPointDate = string2;
        this.cashInfo = string3;
        this.pointsInfo = string4;
        this.tncURL = string5;
        this.isGiftCardLive = bl2;
        this.walletType = string6;
    }

    public /* synthetic */ AjioWalletTransform(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, String string2, String string3, String string4, String string5, Boolean object, String object2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        String string7;
        String string8;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f22;
        float f23;
        int n4 = n3;
        int n7 = n3 & 1;
        float f24 = 0.0f;
        if (n7 != 0) {
            n7 = 0;
            f23 = 0.0f;
        } else {
            f23 = f5;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            f22 = 0.0f;
        } else {
            f22 = f6;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            f20 = 0.0f;
        } else {
            f20 = f7;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            f19 = 0.0f;
        } else {
            f19 = f8;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            f18 = 0.0f;
        } else {
            f18 = f11;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            f17 = 0.0f;
        } else {
            f17 = f12;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            f16 = 0.0f;
        } else {
            f16 = f14;
        }
        int n18 = n4 & 0x80;
        if (n18 == 0) {
            f24 = f15;
        }
        n18 = n4 & 0x100;
        String string9 = null;
        if (n18 != 0) {
            n18 = 0;
            string8 = null;
        } else {
            string8 = string2;
        }
        int n19 = n4 & 0x200;
        if (n19 != 0) {
            n19 = 0;
            string7 = null;
        } else {
            string7 = string3;
        }
        int n20 = n4 & 0x400;
        if (n20 != 0) {
            n20 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n21 = n4 & 0x800;
        if (n21 == 0) {
            string9 = string5;
        }
        n21 = n4 & 0x1000;
        Object object3 = n21 != 0 ? Boolean.FALSE : object;
        Object object4 = (n4 &= 0x2000) != 0 ? "AJIO Wallet" : object2;
        f6 = f23;
        f7 = f22;
        f8 = f20;
        f11 = f19;
        f12 = f18;
        f14 = f17;
        f15 = f16;
        string3 = string8;
        string4 = string7;
        string5 = string6;
        object = string9;
        object2 = object3;
        this(f23, f22, f20, f19, f18, f17, f16, f24, string8, string7, string6, string9, (Boolean)object3, (String)object4);
    }

    public static /* synthetic */ AjioWalletTransform copy$default(AjioWalletTransform ajioWalletTransform, float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, String string2, String string3, String string4, String string5, Boolean bl2, String string6, int n3, Object object) {
        AjioWalletTransform ajioWalletTransform2 = ajioWalletTransform;
        int n4 = n3;
        int n7 = n3 & 1;
        float f16 = n7 != 0 ? ajioWalletTransform.totalWalletBalance : f5;
        int n8 = n4 & 2;
        float f17 = n8 != 0 ? ajioWalletTransform2.totalCash : f6;
        int n10 = n4 & 4;
        float f18 = n10 != 0 ? ajioWalletTransform2.totalPoints : f7;
        int n14 = n4 & 8;
        float f19 = n14 != 0 ? ajioWalletTransform2.transferableCash : f8;
        int n15 = n4 & 0x10;
        float f20 = n15 != 0 ? ajioWalletTransform2.nonTransferableCash : f11;
        int n16 = n4 & 0x20;
        float f22 = n16 != 0 ? ajioWalletTransform2.activePoints : f12;
        int n17 = n4 & 0x40;
        float f23 = n17 != 0 ? ajioWalletTransform2.pendingPoints : f14;
        int n18 = n4 & 0x80;
        float f24 = n18 != 0 ? ajioWalletTransform2.topExpiringPointAmount : f15;
        int n19 = n4 & 0x100;
        String string7 = n19 != 0 ? ajioWalletTransform2.topExpiringPointDate : string2;
        int n20 = n4 & 0x200;
        String string8 = n20 != 0 ? ajioWalletTransform2.cashInfo : string3;
        int n21 = n4 & 0x400;
        String string9 = n21 != 0 ? ajioWalletTransform2.pointsInfo : string4;
        int n22 = n4 & 0x800;
        String string10 = n22 != 0 ? ajioWalletTransform2.tncURL : string5;
        int n24 = n4 & 0x1000;
        Boolean bl3 = n24 != 0 ? ajioWalletTransform2.isGiftCardLive : bl2;
        String string11 = (n4 &= 0x2000) != 0 ? ajioWalletTransform2.walletType : string6;
        f5 = f16;
        f6 = f17;
        f7 = f18;
        f8 = f19;
        f11 = f20;
        f12 = f22;
        f14 = f23;
        f15 = f24;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        bl2 = bl3;
        string6 = string11;
        return ajioWalletTransform.copy(f16, f17, f18, f19, f20, f22, f23, f24, string7, string8, string9, string10, bl3, string11);
    }

    public final float component1() {
        return this.totalWalletBalance;
    }

    public final String component10() {
        return this.cashInfo;
    }

    public final String component11() {
        return this.pointsInfo;
    }

    public final String component12() {
        return this.tncURL;
    }

    public final Boolean component13() {
        return this.isGiftCardLive;
    }

    public final String component14() {
        return this.walletType;
    }

    public final float component2() {
        return this.totalCash;
    }

    public final float component3() {
        return this.totalPoints;
    }

    public final float component4() {
        return this.transferableCash;
    }

    public final float component5() {
        return this.nonTransferableCash;
    }

    public final float component6() {
        return this.activePoints;
    }

    public final float component7() {
        return this.pendingPoints;
    }

    public final float component8() {
        return this.topExpiringPointAmount;
    }

    public final String component9() {
        return this.topExpiringPointDate;
    }

    public final AjioWalletTransform copy(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, String string2, String string3, String string4, String string5, Boolean bl2, String string6) {
        AjioWalletTransform ajioWalletTransform = new AjioWalletTransform(f5, f6, f7, f8, f11, f12, f14, f15, string2, string3, string4, string5, bl2, string6);
        return ajioWalletTransform;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AjioWalletTransform;
        if (n3 == 0) {
            return false;
        }
        object = (AjioWalletTransform)object;
        float f5 = this.totalWalletBalance;
        float f6 = ((AjioWalletTransform)object).totalWalletBalance;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.totalCash;
        f6 = ((AjioWalletTransform)object).totalCash;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.totalPoints;
        f6 = ((AjioWalletTransform)object).totalPoints;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.transferableCash;
        f6 = ((AjioWalletTransform)object).transferableCash;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.nonTransferableCash;
        f6 = ((AjioWalletTransform)object).nonTransferableCash;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.activePoints;
        f6 = ((AjioWalletTransform)object).activePoints;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.pendingPoints;
        f6 = ((AjioWalletTransform)object).pendingPoints;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.topExpiringPointAmount;
        f6 = ((AjioWalletTransform)object).topExpiringPointAmount;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        Object object2 = this.topExpiringPointDate;
        Object object3 = ((AjioWalletTransform)object).topExpiringPointDate;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cashInfo;
        object3 = ((AjioWalletTransform)object).cashInfo;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.pointsInfo;
        object3 = ((AjioWalletTransform)object).pointsInfo;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.tncURL;
        object3 = ((AjioWalletTransform)object).tncURL;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isGiftCardLive;
        object3 = ((AjioWalletTransform)object).isGiftCardLive;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.walletType;
        object = ((AjioWalletTransform)object).walletType;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final float getActivePoints() {
        return this.activePoints;
    }

    public final String getCashInfo() {
        return this.cashInfo;
    }

    public final float getNonTransferableCash() {
        return this.nonTransferableCash;
    }

    public final float getPendingPoints() {
        return this.pendingPoints;
    }

    public final String getPointsInfo() {
        return this.pointsInfo;
    }

    public final String getTncURL() {
        return this.tncURL;
    }

    public final float getTopExpiringPointAmount() {
        return this.topExpiringPointAmount;
    }

    public final String getTopExpiringPointDate() {
        return this.topExpiringPointDate;
    }

    public final float getTotalCash() {
        return this.totalCash;
    }

    public final float getTotalPoints() {
        return this.totalPoints;
    }

    public final float getTotalWalletBalance() {
        return this.totalWalletBalance;
    }

    public final float getTransferableCash() {
        return this.transferableCash;
    }

    public final String getWalletType() {
        return this.walletType;
    }

    public int hashCode() {
        int n3;
        float f5 = this.totalWalletBalance;
        int n4 = Float.floatToIntBits(f5);
        int n7 = 31;
        n4 *= 31;
        n4 = UR0.a(this.totalCash, n4, n7);
        n4 = UR0.a(this.totalPoints, n4, n7);
        n4 = UR0.a(this.transferableCash, n4, n7);
        n4 = UR0.a(this.nonTransferableCash, n4, n7);
        n4 = UR0.a(this.activePoints, n4, n7);
        n4 = UR0.a(this.pendingPoints, n4, n7);
        float f6 = this.topExpiringPointAmount;
        n4 = UR0.a(f6, n4, n7);
        Object object = this.topExpiringPointDate;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cashInfo;
        if (object == null) {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pointsInfo;
        if (object == null) {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tncURL;
        if (object == null) {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isGiftCardLive;
        if (object == null) {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        String string2 = this.walletType;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public final Boolean isGiftCardLive() {
        return this.isGiftCardLive;
    }

    public final void setActivePoints(float f5) {
        this.activePoints = f5;
    }

    public final void setCashInfo(String string2) {
        this.cashInfo = string2;
    }

    public final void setGiftCardLive(Boolean bl2) {
        this.isGiftCardLive = bl2;
    }

    public final void setNonTransferableCash(float f5) {
        this.nonTransferableCash = f5;
    }

    public final void setPendingPoints(float f5) {
        this.pendingPoints = f5;
    }

    public final void setPointsInfo(String string2) {
        this.pointsInfo = string2;
    }

    public final void setTncURL(String string2) {
        this.tncURL = string2;
    }

    public final void setTopExpiringPointAmount(float f5) {
        this.topExpiringPointAmount = f5;
    }

    public final void setTopExpiringPointDate(String string2) {
        this.topExpiringPointDate = string2;
    }

    public final void setTotalCash(float f5) {
        this.totalCash = f5;
    }

    public final void setTotalPoints(float f5) {
        this.totalPoints = f5;
    }

    public final void setTotalWalletBalance(float f5) {
        this.totalWalletBalance = f5;
    }

    public final void setTransferableCash(float f5) {
        this.transferableCash = f5;
    }

    public final void setWalletType(String string2) {
        this.walletType = string2;
    }

    public String toString() {
        float f5 = this.totalWalletBalance;
        float f6 = this.totalCash;
        float f7 = this.totalPoints;
        float f8 = this.transferableCash;
        float f11 = this.nonTransferableCash;
        float f12 = this.activePoints;
        float f14 = this.pendingPoints;
        float f15 = this.topExpiringPointAmount;
        String string2 = this.topExpiringPointDate;
        String string3 = this.cashInfo;
        String string4 = this.pointsInfo;
        String string5 = this.tncURL;
        Boolean bl2 = this.isGiftCardLive;
        String string6 = this.walletType;
        StringBuilder stringBuilder = new StringBuilder("AjioWalletTransform(totalWalletBalance=");
        stringBuilder.append(f5);
        stringBuilder.append(", totalCash=");
        stringBuilder.append(f6);
        stringBuilder.append(", totalPoints=");
        stringBuilder.append(f7);
        stringBuilder.append(", transferableCash=");
        stringBuilder.append(f8);
        stringBuilder.append(", nonTransferableCash=");
        stringBuilder.append(f11);
        stringBuilder.append(", activePoints=");
        stringBuilder.append(f12);
        stringBuilder.append(", pendingPoints=");
        stringBuilder.append(f14);
        stringBuilder.append(", topExpiringPointAmount=");
        stringBuilder.append(f15);
        stringBuilder.append(", topExpiringPointDate=");
        X50.a(stringBuilder, string2, ", cashInfo=", string3, ", pointsInfo=");
        X50.a(stringBuilder, string4, ", tncURL=", string5, ", isGiftCardLive=");
        stringBuilder.append(bl2);
        stringBuilder.append(", walletType=");
        stringBuilder.append(string6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

