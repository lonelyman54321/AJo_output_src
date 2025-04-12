/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.referrer;

import com.affise.attribution.referrer.ReferrerKey;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerKeyKt {
    public static final ReferrerKey toReferrerKey(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return ReferrerKey.Companion.from(string2);
    }
}

