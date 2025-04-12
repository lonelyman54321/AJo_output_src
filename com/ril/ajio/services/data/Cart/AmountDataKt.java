/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.COHORT;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class AmountDataKt {
    public static final boolean isFeeCharged(String string2) {
        if (string2 == null) {
            return false;
        }
        Object object = Locale.ROOT;
        string2 = string2.toUpperCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
        object = ((Object)((Object)COHORT.BAD)).toString();
        return Intrinsics.areEqual(string2, object);
    }
}

