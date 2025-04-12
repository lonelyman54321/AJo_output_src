/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 *  org.json.JSONObject
 */
package com.jio.jioads.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class o
extends Lambda
implements Function0 {
    public final /* synthetic */ Context c;

    public o(Context context) {
        this.c = context;
        super(0);
    }

    public final Object invoke() {
        int n3;
        Context context = this.c;
        Utility.access$setMUserAgent$p(WebSettings.getDefaultUserAgent((Context)context));
        Object object = Utility.access$getMUserAgent$p();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = Utility.INSTANCE;
            String string2 = Utility.access$getMUserAgent$p();
            if (string2 == null) {
                string2 = "";
            }
            long l2 = System.currentTimeMillis();
            Object object2 = new m(string2, l2);
            Intrinsics.checkNotNullParameter(object2, "userAgentHolder");
            object2 = new JSONObject();
            String string3 = "user_agent";
            object2.put(string3, (Object)string2);
            object2.put("saveTime", l2);
            object2 = object2.toString();
            string2 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            Utility.access$saveUserAgentIntoPref((Utility)object, context, (String)object2);
        }
        return Unit.a;
    }
}

