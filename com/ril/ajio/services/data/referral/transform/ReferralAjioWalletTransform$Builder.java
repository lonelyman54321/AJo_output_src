/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import com.ril.ajio.services.data.referral.ReferralAjioWallet;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralAjioWalletTransform$Builder {
    public final ReferralAjioWalletTransform build(ReferralAjioWallet object) {
        Intrinsics.checkNotNullParameter(object, "referralAjioWallet");
        object = ((ReferralAjioWallet)object).getAmount();
        ReferralAjioWalletTransform referralAjioWalletTransform = new ReferralAjioWalletTransform((Float)object);
        return referralAjioWalletTransform;
    }
}

