/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import kotlin.Unit;

final class CCViewModel$getCCFaqs$1$2
implements fs0_2 {
    final /* synthetic */ CCViewModel this$0;

    public CCViewModel$getCCFaqs$1$2(CCViewModel cCViewModel) {
        this.this$0 = cCViewModel;
    }

    public final Object emit(DataCallback dataCallback, f80_0 f80_02) {
        CCViewModel.access$getCcFaqsMLD$p(this.this$0).k(dataCallback);
        return Unit.a;
    }
}

