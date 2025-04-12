/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralFAQ {
    private ArrayList topicsList;

    public ReferralFAQ(ArrayList arrayList) {
        this.topicsList = arrayList;
    }

    public static /* synthetic */ ReferralFAQ copy$default(ReferralFAQ referralFAQ, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = referralFAQ.topicsList;
        }
        return referralFAQ.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.topicsList;
    }

    public final ReferralFAQ copy(ArrayList arrayList) {
        ReferralFAQ referralFAQ = new ReferralFAQ(arrayList);
        return referralFAQ;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralFAQ;
        if (!bl3) {
            return false;
        }
        object = (ReferralFAQ)object;
        ArrayList arrayList = this.topicsList;
        object = ((ReferralFAQ)object).topicsList;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getTopicsList() {
        return this.topicsList;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.topicsList;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setTopicsList(ArrayList arrayList) {
        this.topicsList = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.topicsList;
        StringBuilder stringBuilder = new StringBuilder("ReferralFAQ(topicsList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

