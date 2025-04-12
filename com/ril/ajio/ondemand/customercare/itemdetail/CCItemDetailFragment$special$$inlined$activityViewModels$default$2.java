/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.itemdetail;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class CCItemDetailFragment$special$$inlined$activityViewModels$default$2
extends Lambda
implements Function0 {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ Fragment $this_activityViewModels;

    public CCItemDetailFragment$special$$inlined$activityViewModels$default$2(Function0 function0, Fragment fragment) {
        this.$extrasProducer = function0;
        this.$this_activityViewModels = fragment;
        super(0);
    }

    public final Wd0 invoke() {
        Object object = this.$extrasProducer;
        if (object == null || (object = (Wd0)object.invoke()) == null) {
            object = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        }
        return object;
    }
}

