/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.interceptors;

import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ExceptionInterceptor
implements nj1_2 {
    private final String getErrorMsg(Exception object) {
        DataError dataError = new DataError();
        dataError.isException = true;
        DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
        object = ((Throwable)object).getMessage();
        dataError$ErrorMessage.setMessage((String)object);
        object = new ArrayList();
        dataError.errors = object;
        object.add(dataError$ErrorMessage);
        object = new Gson();
        object = ((Gson)object).toJson(dataError);
        Intrinsics.checkNotNullExpressionValue(object, "toJson(...)");
        return object;
    }

    public cl2_2 intercept(nj1$a object) {
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request();
        try {
            object = object.a((kj2_2)object2);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            cl2$a_0 cl2$a_0 = new cl2$a_0();
            String string2 = "request";
            Intrinsics.checkNotNullParameter(object2, string2);
            cl2$a_0.a = object2;
            object2 = ib2_2.HTTP_2;
            cl2$a_0.d((ib2_2)((Object)object2));
            cl2$a_0.c = 0;
            object2 = exception.getMessage();
            if (object2 == null) {
                object2 = "";
            }
            string2 = "message";
            Intrinsics.checkNotNullParameter(object2, string2);
            cl2$a_0.d = object2;
            object = this.getErrorMsg(exception);
            object2 = null;
            cl2$a_0.g = object = iL2$b.a((String)object, null);
            object = cl2$a_0.a();
        }
        return object;
    }
}

