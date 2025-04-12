/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.InsetsKt;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class CalculatedWindowInsetsType$animatedInsets$2
extends Lambda
implements Function0 {
    final /* synthetic */ WindowInsets$Type[] $types;

    public CalculatedWindowInsetsType$animatedInsets$2(WindowInsets$Type[] windowInsets$TypeArray) {
        this.$types = windowInsets$TypeArray;
        super(0);
    }

    public final Insets invoke() {
        WindowInsets$Type[] windowInsets$TypeArray = this.$types;
        Insets insets = Insets.Companion.getEmpty();
        for (WindowInsets$Type windowInsets$Type : windowInsets$TypeArray) {
            insets = InsetsKt.coerceEachDimensionAtLeast(insets, windowInsets$Type);
        }
        return insets;
    }
}

