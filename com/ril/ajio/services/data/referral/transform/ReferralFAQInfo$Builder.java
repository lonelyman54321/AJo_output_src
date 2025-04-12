/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import com.ril.ajio.services.data.referral.QAInfo;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralFAQInfo$Builder {
    public final ReferralFAQInfo build(QAInfo object) {
        Intrinsics.checkNotNullParameter(object, "qaInfo");
        String string2 = ((QAInfo)object).getQuestion();
        object = ((QAInfo)object).getAnswer();
        ReferralFAQInfo referralFAQInfo = new ReferralFAQInfo(string2, (String)object, false);
        return referralFAQInfo;
    }
}

