/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CcApiRepo$getCCComplaintList$$inlined$map$1$2;
import kotlin.Unit;

public final class CcApiRepo$getCCComplaintList$$inlined$map$1
implements es0_2 {
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CcApiRepo$getCCComplaintList$$inlined$map$1(es0_2 es0_22) {
        this.$this_unsafeTransform$inlined = es0_22;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        CcApiRepo$getCCComplaintList$$inlined$map$1$2 ccApiRepo$getCCComplaintList$$inlined$map$1$2 = new CcApiRepo$getCCComplaintList$$inlined$map$1$2((fs0_2)object);
        if ((object = es0_22.collect(ccApiRepo$getCCComplaintList$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

