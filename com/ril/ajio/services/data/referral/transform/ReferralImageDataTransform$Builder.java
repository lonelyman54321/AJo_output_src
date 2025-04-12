/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.data.Home.HomeContentData;
import com.ril.ajio.services.data.Home.NewPageDetails;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ReferralImageDataTransform$Builder {
    private final String COMPONENT_REFERRAL_BANNER;

    public ReferralImageDataTransform$Builder() {
        this.COMPONENT_REFERRAL_BANNER = "referralBannerComponent";
    }

    public final ReferralImageDataTransform build(HomeContentData object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "homeContentData");
        object = ((HomeContentData)object).getPageDetails();
        boolean bl2 = false;
        Object object3 = null;
        Float f5 = Float.valueOf(0.0f);
        if (object != null) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                Object object4;
                object3 = (NewPageDetails)object.next();
                object2 = this.COMPONENT_REFERRAL_BANNER;
                Object object5 = null;
                object4 = object3 != null && (object4 = ((NewPageDetails)object3).getBanner()) != null ? ((BannerDetails)object4).getUId() : null;
                boolean bl4 = b.i((String)object2, (String)object4, bl3 = true);
                if (!bl4) continue;
                object4 = object3 != null && (object2 = ((NewPageDetails)object3).getBanner()) != null ? (object2 = ((BannerDetails)object2).getImageUrl()) : null;
                if (object3 != null && (object3 = ((NewPageDetails)object3).getBanner()) != null) {
                    object3 = ((BannerDetails)object3).getHeadLine();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object2 = object;
                object5 = object4;
                object4 = object3;
                object = new ReferralImageDataTransform((String)object5, (String)object3, null, f5, f5);
                return object;
            }
        }
        object2 = object;
        object = new ReferralImageDataTransform(null, null, null, f5, f5);
        return object;
    }

    public final String getCOMPONENT_REFERRAL_BANNER() {
        return this.COMPONENT_REFERRAL_BANNER;
    }
}

