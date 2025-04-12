/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseSubscriptionError$ProductNotFound
extends Exception {
    private final List ids;

    public AffiseSubscriptionError$ProductNotFound(List list) {
        Intrinsics.checkNotNullParameter(list, "ids");
        CharSequence charSequence = new StringBuilder("product not found [");
        String string2 = CollectionsKt.R(list, ", ", null, null, null, 62);
        charSequence = ui0_1.a(charSequence, string2, ']');
        super((String)charSequence);
        this.ids = list;
    }

    public final List getIds() {
        return this.ids;
    }
}

