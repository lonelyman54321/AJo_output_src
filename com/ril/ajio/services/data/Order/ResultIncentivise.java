/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.ProfileHealth;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ResultIncentivise
implements Serializable {
    private final ProfileHealth EXCHANGE_NUDGE;
    private final ProfileHealth POST_ORDER_RETURN_FEE;

    public ResultIncentivise() {
        this(null, null, 3, null);
    }

    public ResultIncentivise(ProfileHealth profileHealth, ProfileHealth profileHealth2) {
        this.EXCHANGE_NUDGE = profileHealth;
        this.POST_ORDER_RETURN_FEE = profileHealth2;
    }

    public /* synthetic */ ResultIncentivise(ProfileHealth profileHealth, ProfileHealth profileHealth2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            profileHealth = null;
        }
        if ((n3 &= 2) != 0) {
            profileHealth2 = null;
        }
        this(profileHealth, profileHealth2);
    }

    public static /* synthetic */ ResultIncentivise copy$default(ResultIncentivise resultIncentivise, ProfileHealth profileHealth, ProfileHealth profileHealth2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            profileHealth = resultIncentivise.EXCHANGE_NUDGE;
        }
        if ((n3 &= 2) != 0) {
            profileHealth2 = resultIncentivise.POST_ORDER_RETURN_FEE;
        }
        return resultIncentivise.copy(profileHealth, profileHealth2);
    }

    public final ProfileHealth component1() {
        return this.EXCHANGE_NUDGE;
    }

    public final ProfileHealth component2() {
        return this.POST_ORDER_RETURN_FEE;
    }

    public final ResultIncentivise copy(ProfileHealth profileHealth, ProfileHealth profileHealth2) {
        ResultIncentivise resultIncentivise = new ResultIncentivise(profileHealth, profileHealth2);
        return resultIncentivise;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ResultIncentivise;
        if (!bl3) {
            return false;
        }
        object = (ResultIncentivise)object;
        ProfileHealth profileHealth = this.EXCHANGE_NUDGE;
        ProfileHealth profileHealth2 = ((ResultIncentivise)object).EXCHANGE_NUDGE;
        bl3 = Intrinsics.areEqual(profileHealth, profileHealth2);
        if (!bl3) {
            return false;
        }
        profileHealth = this.POST_ORDER_RETURN_FEE;
        object = ((ResultIncentivise)object).POST_ORDER_RETURN_FEE;
        boolean bl4 = Intrinsics.areEqual(profileHealth, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ProfileHealth getEXCHANGE_NUDGE() {
        return this.EXCHANGE_NUDGE;
    }

    public final ProfileHealth getPOST_ORDER_RETURN_FEE() {
        return this.POST_ORDER_RETURN_FEE;
    }

    public int hashCode() {
        int n3;
        ProfileHealth profileHealth = this.EXCHANGE_NUDGE;
        int n4 = 0;
        if (profileHealth == null) {
            n3 = 0;
            profileHealth = null;
        } else {
            n3 = profileHealth.hashCode();
        }
        n3 *= 31;
        ProfileHealth profileHealth2 = this.POST_ORDER_RETURN_FEE;
        if (profileHealth2 != null) {
            n4 = profileHealth2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        ProfileHealth profileHealth = this.EXCHANGE_NUDGE;
        ProfileHealth profileHealth2 = this.POST_ORDER_RETURN_FEE;
        StringBuilder stringBuilder = new StringBuilder("ResultIncentivise(EXCHANGE_NUDGE=");
        stringBuilder.append(profileHealth);
        stringBuilder.append(", POST_ORDER_RETURN_FEE=");
        stringBuilder.append(profileHealth2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

