/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.viewmodel;

import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.viewmodel.HomeVM;
import java.io.PrintStream;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

public final class HomeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1
extends a
implements c90_0 {
    final /* synthetic */ HomeVM this$0;

    public HomeVM$fetchHomeData$$inlined$CoroutineExceptionHandler$1(C90$a c90$a, HomeVM homeVM) {
        this.this$0 = homeVM;
        super(c90$a);
    }

    public void handleException(CoroutineContext object, Throwable throwable) {
        object = System.out;
        ((PrintStream)object).println((Object)"kmm exception");
        ((PrintStream)object).println(throwable);
        object = HomeVM.access$getHomeDataMSF$p(this.this$0);
        ResponseStatusType responseStatusType = ResponseStatusType.API_EXCEPTION;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, null, null, throwable, null, null, 48, null);
        object.setValue(baseResponse);
    }
}

