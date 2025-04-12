/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class CustomerCareFragment$special$$inlined$activityViewModels$default$1
extends Lambda
implements Function0 {
    final /* synthetic */ Fragment $this_activityViewModels;

    public CustomerCareFragment$special$$inlined$activityViewModels$default$1(Fragment fragment) {
        this.$this_activityViewModels = fragment;
        super(0);
    }

    public final rd3_0 invoke() {
        return this.$this_activityViewModels.requireActivity().getViewModelStore();
    }
}

