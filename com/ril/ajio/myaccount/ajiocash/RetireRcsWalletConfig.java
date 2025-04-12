/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RetireRcsWalletConfig {
    public static final int $stable = 8;
    private String ajioWalletDesc;
    private int commonLedgerTxnLimitThreshold;
    private boolean isEnabled;
    private int refundFailureHomePageCount;

    public RetireRcsWalletConfig() {
        this(false, null, 0, 0, 15, null);
    }

    public RetireRcsWalletConfig(boolean bl2, String string2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "ajioWalletDesc");
        this.isEnabled = bl2;
        this.ajioWalletDesc = string2;
        this.refundFailureHomePageCount = n3;
        this.commonLedgerTxnLimitThreshold = n4;
    }

    public /* synthetic */ RetireRcsWalletConfig(boolean bl2, String string2, int n3, int n4, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            bl2 = false;
        }
        if ((n8 = n7 & 2) != 0) {
            string2 = "";
        }
        if ((n8 = n7 & 4) != 0) {
            n3 = 5;
        }
        if ((n7 &= 8) != 0) {
            n4 = 50;
        }
        this(bl2, string2, n3, n4);
    }

    public static /* synthetic */ RetireRcsWalletConfig copy$default(RetireRcsWalletConfig retireRcsWalletConfig, boolean bl2, String string2, int n3, int n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            bl2 = retireRcsWalletConfig.isEnabled;
        }
        if ((n8 = n7 & 2) != 0) {
            string2 = retireRcsWalletConfig.ajioWalletDesc;
        }
        if ((n8 = n7 & 4) != 0) {
            n3 = retireRcsWalletConfig.refundFailureHomePageCount;
        }
        if ((n7 &= 8) != 0) {
            n4 = retireRcsWalletConfig.commonLedgerTxnLimitThreshold;
        }
        return retireRcsWalletConfig.copy(bl2, string2, n3, n4);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.ajioWalletDesc;
    }

    public final int component3() {
        return this.refundFailureHomePageCount;
    }

    public final int component4() {
        return this.commonLedgerTxnLimitThreshold;
    }

    public final RetireRcsWalletConfig copy(boolean bl2, String string2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "ajioWalletDesc");
        RetireRcsWalletConfig retireRcsWalletConfig = new RetireRcsWalletConfig(bl2, string2, n3, n4);
        return retireRcsWalletConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof RetireRcsWalletConfig;
        if (n3 == 0) {
            return false;
        }
        object = (RetireRcsWalletConfig)object;
        n3 = this.isEnabled;
        int n4 = ((RetireRcsWalletConfig)object).isEnabled;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.ajioWalletDesc;
        String string3 = ((RetireRcsWalletConfig)object).ajioWalletDesc;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.refundFailureHomePageCount;
        n4 = ((RetireRcsWalletConfig)object).refundFailureHomePageCount;
        if (n3 != n4) {
            return false;
        }
        n3 = this.commonLedgerTxnLimitThreshold;
        int n7 = ((RetireRcsWalletConfig)object).commonLedgerTxnLimitThreshold;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final String getAjioWalletDesc() {
        return this.ajioWalletDesc;
    }

    public final int getCommonLedgerTxnLimitThreshold() {
        return this.commonLedgerTxnLimitThreshold;
    }

    public final int getRefundFailureHomePageCount() {
        return this.refundFailureHomePageCount;
    }

    public int hashCode() {
        int n3 = this.isEnabled;
        n3 = n3 != 0 ? 1231 : 1237;
        n3 *= 31;
        String string2 = this.ajioWalletDesc;
        n3 = zy_2.b(n3, 31, string2);
        int n4 = this.refundFailureHomePageCount;
        n3 = (n3 + n4) * 31;
        int n7 = this.commonLedgerTxnLimitThreshold;
        return n3 + n7;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setAjioWalletDesc(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.ajioWalletDesc = string2;
    }

    public final void setCommonLedgerTxnLimitThreshold(int n3) {
        this.commonLedgerTxnLimitThreshold = n3;
    }

    public final void setEnabled(boolean bl2) {
        this.isEnabled = bl2;
    }

    public final void setRefundFailureHomePageCount(int n3) {
        this.refundFailureHomePageCount = n3;
    }

    public String toString() {
        boolean bl2 = this.isEnabled;
        String string2 = this.ajioWalletDesc;
        int n3 = this.refundFailureHomePageCount;
        int n4 = this.commonLedgerTxnLimitThreshold;
        StringBuilder stringBuilder = new StringBuilder("RetireRcsWalletConfig(isEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", ajioWalletDesc=");
        stringBuilder.append(string2);
        stringBuilder.append(", refundFailureHomePageCount=");
        stringBuilder.append(n3);
        stringBuilder.append(", commonLedgerTxnLimitThreshold=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

