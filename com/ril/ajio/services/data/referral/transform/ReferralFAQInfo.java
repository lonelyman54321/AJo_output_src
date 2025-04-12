/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralFAQInfo {
    private String ans;
    private boolean isExpanded;
    private String ques;

    public ReferralFAQInfo() {
        this(null, null, false, 7, null);
    }

    public ReferralFAQInfo(String string2, String string3, boolean bl2) {
        this.ques = string2;
        this.ans = string3;
        this.isExpanded = bl2;
    }

    public /* synthetic */ ReferralFAQInfo(String string2, String string3, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        this(string2, string3, bl2);
    }

    public static /* synthetic */ ReferralFAQInfo copy$default(ReferralFAQInfo referralFAQInfo, String string2, String string3, boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = referralFAQInfo.ques;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = referralFAQInfo.ans;
        }
        if ((n3 &= 4) != 0) {
            bl2 = referralFAQInfo.isExpanded;
        }
        return referralFAQInfo.copy(string2, string3, bl2);
    }

    public final String component1() {
        return this.ques;
    }

    public final String component2() {
        return this.ans;
    }

    public final boolean component3() {
        return this.isExpanded;
    }

    public final ReferralFAQInfo copy(String string2, String string3, boolean bl2) {
        ReferralFAQInfo referralFAQInfo = new ReferralFAQInfo(string2, string3, bl2);
        return referralFAQInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralFAQInfo;
        if (!bl3) {
            return false;
        }
        object = (ReferralFAQInfo)object;
        String string2 = this.ques;
        String string3 = ((ReferralFAQInfo)object).ques;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.ans;
        string3 = ((ReferralFAQInfo)object).ans;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isExpanded;
        boolean bl4 = ((ReferralFAQInfo)object).isExpanded;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAns() {
        return this.ans;
    }

    public final String getQues() {
        return this.ques;
    }

    public int hashCode() {
        int n3;
        String string2 = this.ques;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.ans;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isExpanded ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setAns(String string2) {
        this.ans = string2;
    }

    public final void setExpanded(boolean bl2) {
        this.isExpanded = bl2;
    }

    public final void setQues(String string2) {
        this.ques = string2;
    }

    public String toString() {
        CharSequence charSequence = this.ques;
        String string2 = this.ans;
        boolean bl2 = this.isExpanded;
        charSequence = og_1.a("ReferralFAQInfo(ques=", charSequence, ", ans=", string2, ", isExpanded=");
        return Vm.a(")", bl2, (StringBuilder)charSequence);
    }
}

