/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.gson.Gson;
import com.ril.ajio.services.network.NetworkUtil;
import com.ril.ajio.services.network.data.ResponseError;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class HTMLExceptionInterceptor
implements nj1_2 {
    private final Context context;

    public HTMLExceptionInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final String getErrorMsg(cl2_2 object, kj2_2 object2) {
        Object object3 = ((cl2_2)object).g;
        object3 = object3 != null ? ((il2_2)object3).k() : null;
        this.logExceptionInCrashlytics((String)object3, (kj2_2)object2);
        object2 = this.getSupportID((String)object3);
        object3 = "HTML Response";
        DataError dataError = new DataError();
        DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
        Gson gson = new Gson();
        int n3 = ((cl2_2)object).d;
        ResponseError responseError = new ResponseError(n3, (String)object3, (String)object2);
        object = gson.toJson(responseError);
        dataError$ErrorMessage.setMessage((String)object);
        object = new ArrayList();
        dataError.errors = object;
        object.add(dataError$ErrorMessage);
        object = new Gson();
        try {
            object3 = ((Gson)object).toJson(dataError);
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception);
        }
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String getSupportID(String string2) {
        if (string2 == null) return "";
        int n3 = string2.length();
        if (n3 == 0) return "";
        String string3 = "support ID is:";
        int n4 = 0;
        String string4 = null;
        boolean bl2 = StringsKt.F(string2, string3, false);
        if (!bl2) return "";
        bl2 = true;
        n3 = StringsKt.L(0, string2, string3, bl2) + 14;
        string4 = "<br>";
        n4 = StringsKt.L(n3, string2, string4, bl2);
        string2 = string2.substring(n3, n4);
        string3 = "substring(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        return ((Object)StringsKt.m0(string2)).toString();
    }

    private final void logExceptionInCrashlytics(String object, kj2_2 object2) {
        String string2 = "error in parsing response for url ";
        yn3$a yn3$a = yn3_0.a;
        object2 = object2.a;
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object2);
        object2 = " and exact response is ";
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = null;
        object2 = new Object[]{};
        yn3$a.d((String)object, object2);
        object2 = "HTML parsing exception";
        object = new Exception((String)object2);
        try {
            yn3$a.e((Throwable)object);
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            object2.e(exception);
        }
    }

    public cl2_2 intercept(nj1$a object) {
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request();
        Object object3 = NetworkUtil.INSTANCE;
        Object object4 = ((kj2_2)object2).c;
        boolean bl2 = ((NetworkUtil)object3).isPayNowReq((m41_0)object4);
        object4 = z40_0.Companion;
        Object object5 = this.context;
        object4.getClass();
        object4 = z40$a.a((Context)object5).a;
        object5 = "enableAppRedirection";
        boolean bl3 = ((ao0_0)object4).a((String)object5);
        if (!bl3) {
            object2 = ((kj2_2)object2).c();
            object4 = "RequestId";
            ((KJ2$a)object2).f((String)object4);
            object2 = ((KJ2$a)object2).b();
        }
        if (bl2) {
            object = object.a((kj2_2)object2);
        } else {
            object = object.a((kj2_2)object2);
            object4 = ((cl2_2)object).f;
            object3 = ((m41_0)object4).a("Content-Type");
            if (object3 != null) {
                object4 = null;
                object5 = "text/html";
                bl2 = StringsKt.F((CharSequence)object3, (CharSequence)object5, false);
                if (bl2 == (bl3 = true)) {
                    int n3;
                    object2 = this.getErrorMsg((cl2_2)object, (kj2_2)object2);
                    object3 = ((cl2_2)object).h();
                    ((cl2$a_0)object3).c = n3 = ((cl2_2)object).d * 100;
                    n3 = 0;
                    ((cl2$a_0)object3).g = object = iL2$b.a((String)object2, null);
                    object = ((cl2$a_0)object3).a();
                }
            }
        }
        return object;
    }
}

