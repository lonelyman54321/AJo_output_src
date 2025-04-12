/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import com.ril.ajio.data.repo.CcApiRepo;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createTicket$1$1;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createTicket$1$2;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CCViewModel$createTicket$1
extends qg3_2
implements Function2 {
    final /* synthetic */ CCTicketCreateQuery $query;
    int label;
    final /* synthetic */ CCViewModel this$0;

    public CCViewModel$createTicket$1(CCViewModel cCViewModel, CCTicketCreateQuery cCTicketCreateQuery, f80_0 f80_02) {
        this.this$0 = cCViewModel;
        this.$query = cCTicketCreateQuery;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CCViewModel cCViewModel = this.this$0;
        CCTicketCreateQuery cCTicketCreateQuery = this.$query;
        object = new CCViewModel$createTicket$1(cCViewModel, cCTicketCreateQuery, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (CCViewModel$createTicket$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CCViewModel$createTicket$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = CCViewModel.access$getCcApiRepo$p(this.this$0);
            Object object2 = this.$query;
            object = ((CcApiRepo)object).createCCTicket((CCTicketCreateQuery)object2);
            Object object3 = this.this$0;
            object2 = new CCViewModel$createTicket$1$1((CCViewModel)object3, null);
            object3 = new at0_1((es0_2)object, (gx0_2)object2);
            object2 = this.this$0;
            object = new CCViewModel$createTicket$1$2((CCViewModel)object2);
            this.label = n4;
            object = ((at0_1)object3).collect((fs0_2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

