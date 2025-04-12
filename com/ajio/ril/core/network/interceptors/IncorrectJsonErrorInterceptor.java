/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.interceptors;

import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class IncorrectJsonErrorInterceptor
implements nj1_2 {
    public cl2_2 intercept(nj1$a object) {
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request();
        object = object.a((kj2_2)object2);
        int n3 = 500;
        int n4 = ((cl2_2)object).d;
        if (n3 <= n4 && n4 < (n3 = 600)) {
            n3 = 0;
            object2 = null;
            Object object3 = ((cl2_2)object).g;
            jn1_0 jn1_02 = object3 != null ? ((il2_2)object3).d() : null;
            if (object3 != null) {
                object2 = ((il2_2)object3).k();
            }
            if (object2 != null) {
                object3 = new DataError();
                DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
                String string2 = "Please try after some time.";
                dataError$ErrorMessage.setMessage(string2);
                dataError$ErrorMessage.setLogMessage((String)object2);
                object2 = new ArrayList();
                ((DataError)object3).errors = object2;
                ((ArrayList)object2).add(dataError$ErrorMessage);
                object2 = new Gson();
                object2 = ((Gson)object2).toJson(object3);
                Intrinsics.checkNotNull(object2);
                object2 = iL2$b.a((String)object2, jn1_02);
                object = ((cl2_2)object).h();
                ((cl2$a_0)object).g = object2;
                object = ((cl2$a_0)object).a();
            }
        }
        return object;
    }
}

