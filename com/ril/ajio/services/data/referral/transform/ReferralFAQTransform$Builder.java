/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import com.ril.ajio.services.data.referral.QAInfo;
import com.ril.ajio.services.data.referral.ReferralFAQ;
import com.ril.ajio.services.data.referral.Topic;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo$Builder;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralFAQTransform$Builder {
    private final ArrayList faqList;

    public ReferralFAQTransform$Builder() {
        ArrayList arrayList;
        this.faqList = arrayList = new ArrayList();
    }

    public final ReferralFAQTransform build(ReferralFAQ iterator) {
        Intrinsics.checkNotNullParameter(iterator, "referralFAQ");
        Object object = this.faqList;
        ((ArrayList)object).clear();
        iterator = ((ReferralFAQ)((Object)iterator)).getTopicsList();
        if (iterator != null) {
            boolean bl2;
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                object = (Topic)iterator.next();
                if (object == null || (object = ((Topic)object).getQuestionAnswerList()) == null) continue;
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    Object object2 = (QAInfo)object.next();
                    if (object2 == null) continue;
                    ArrayList arrayList = this.faqList;
                    ReferralFAQInfo$Builder referralFAQInfo$Builder = new ReferralFAQInfo$Builder();
                    object2 = referralFAQInfo$Builder.build((QAInfo)object2);
                    arrayList.add(object2);
                }
            }
        }
        object = this.faqList;
        iterator = new Iterator((ArrayList)object);
        return iterator;
    }
}

