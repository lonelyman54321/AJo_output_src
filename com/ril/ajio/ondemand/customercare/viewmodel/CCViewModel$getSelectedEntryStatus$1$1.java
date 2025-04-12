/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import kotlin.Unit;

final class CCViewModel$getSelectedEntryStatus$1$1
extends qg3_2
implements gx0_2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CCViewModel this$0;

    public CCViewModel$getSelectedEntryStatus$1$1(CCViewModel cCViewModel, f80_0 f80_02) {
        this.this$0 = cCViewModel;
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable object2, f80_0 f80_02) {
        CCViewModel cCViewModel = this.this$0;
        object = new CCViewModel$getSelectedEntryStatus$1$1(cCViewModel, f80_02);
        ((CCViewModel$getSelectedEntryStatus$1$1)object).L$0 = object2;
        object2 = Unit.a;
        return ((CCViewModel$getSelectedEntryStatus$1$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object3 = object = this.L$0;
            object3 = (Throwable)object;
            object = CCViewModel.access$getCcCartEntryStatusMLD$p(this.this$0);
            object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object3, "cc_item_status", false, null, null, 28, null);
            ((LiveData)object).k(object2);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

