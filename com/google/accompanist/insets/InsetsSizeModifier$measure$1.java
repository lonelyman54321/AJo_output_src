/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class InsetsSizeModifier$measure$1
extends Lambda
implements Function1 {
    final /* synthetic */ Ns2 $placeable;

    public InsetsSizeModifier$measure$1(Ns2 ns2) {
        this.$placeable = ns2;
        super(1);
    }

    public final void invoke(Ns2$a ns2$a) {
        Intrinsics.checkNotNullParameter(ns2$a, "$this$layout");
        Ns2 ns2 = this.$placeable;
        Ns2$a.d(ns2$a, ns2, 0, 0);
    }
}

