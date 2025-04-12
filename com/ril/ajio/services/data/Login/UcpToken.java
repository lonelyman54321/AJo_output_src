/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class UcpToken {
    private final List data;
    private final boolean isReferralCodeValid;

    public UcpToken(List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
        this.isReferralCodeValid = bl2;
    }

    public static /* synthetic */ UcpToken copy$default(UcpToken ucpToken, List list, boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = ucpToken.data;
        }
        if ((n3 &= 2) != 0) {
            bl2 = ucpToken.isReferralCodeValid;
        }
        return ucpToken.copy(list, bl2);
    }

    public final List component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.isReferralCodeValid;
    }

    public final UcpToken copy(List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(list, "data");
        UcpToken ucpToken = new UcpToken(list, bl2);
        return ucpToken;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UcpToken;
        if (!bl3) {
            return false;
        }
        object = (UcpToken)object;
        List list = this.data;
        List list2 = ((UcpToken)object).data;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        bl3 = this.isReferralCodeValid;
        boolean bl4 = ((UcpToken)object).isReferralCodeValid;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final List getData() {
        return this.data;
    }

    public int hashCode() {
        List list = this.data;
        int n3 = ((Object)list).hashCode() * 31;
        int n4 = this.isReferralCodeValid;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final boolean isReferralCodeValid() {
        return this.isReferralCodeValid;
    }

    public String toString() {
        List list = this.data;
        boolean bl2 = this.isReferralCodeValid;
        StringBuilder stringBuilder = new StringBuilder("UcpToken(data=");
        stringBuilder.append(list);
        stringBuilder.append(", isReferralCodeValid=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

