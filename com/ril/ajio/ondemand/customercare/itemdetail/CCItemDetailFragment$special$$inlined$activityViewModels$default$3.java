/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.itemdetail;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class CCItemDetailFragment$special$$inlined$activityViewModels$default$3
extends Lambda
implements Function0 {
    final /* synthetic */ Fragment $this_activityViewModels;

    public CCItemDetailFragment$special$$inlined$activityViewModels$default$3(Fragment fragment) {
        this.$this_activityViewModels = fragment;
        super(0);
    }

    public final E$b invoke() {
        return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
    }
}

