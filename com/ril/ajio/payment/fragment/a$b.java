/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.fragment;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public a$b(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getViewModelStore();
    }
}

