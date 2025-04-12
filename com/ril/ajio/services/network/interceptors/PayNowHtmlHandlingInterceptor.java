/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.interceptors;

import com.google.gson.Gson;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.network.NetworkUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class PayNowHtmlHandlingInterceptor
implements nj1_2 {
    public cl2_2 intercept(nj1$a nj1$a) {
        Object object = nj1$a;
        Intrinsics.checkNotNullParameter(nj1$a, "chain");
        Object object2 = nj1$a.request();
        Object object3 = NetworkUtil.INSTANCE;
        Object object4 = ((kj2_2)object2).c;
        boolean bl2 = ((NetworkUtil)object3).isPayNowReq((m41_0)object4);
        if (bl2) {
            object = nj1$a.a((kj2_2)object2);
            boolean bl3 = ((cl2_2)object).d();
            if (bl3 && (object2 = ((m41_0)(object3 = ((cl2_2)object).f)).a("Content-Type")) != null) {
                object3 = null;
                object4 = "text/html";
                bl3 = StringsKt.F((CharSequence)object2, (CharSequence)object4, false);
                if (bl3 == (bl2 = true)) {
                    bl3 = false;
                    object2 = null;
                    object3 = ((cl2_2)object).g;
                    object4 = object3 != null ? ((il2_2)object3).d() : null;
                    if (object3 != null) {
                        object2 = ((il2_2)object3).k();
                    }
                    if (object2 != null) {
                        Object object5 = object3;
                        int n3 = 0x1FFFFF;
                        object3 = new PayNowResponse(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
                        object5 = Boolean.TRUE;
                        ((PayNowResponse)object3).setHtml((Boolean)object5);
                        ((PayNowResponse)object3).setHtml((String)object2);
                        object2 = new Gson();
                        object2 = ((Gson)object2).toJson(object3);
                        Intrinsics.checkNotNull(object2);
                        object2 = iL2$b.a((String)object2, (jn1_0)object4);
                        object = ((cl2_2)object).h();
                        ((cl2$a_0)object).g = object2;
                        object = ((cl2$a_0)object).a();
                    }
                }
            }
        } else {
            object = nj1$a.a((kj2_2)object2);
        }
        return object;
    }
}

