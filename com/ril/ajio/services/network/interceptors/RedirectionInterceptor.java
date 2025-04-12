/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class RedirectionInterceptor
implements nj1_2 {
    private final Context context;

    public RedirectionInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isRedirectionResponse(int n3) {
        int n4 = 301;
        n3 = n3 != n4 && n3 != (n4 = 302) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean shouldShowRedirection(String string2) {
        Object object;
        boolean bl2 = false;
        try {
            object = z40_0.Companion;
        }
        catch (Exception exception) {
            return bl2;
        }
        String[] stringArray = this.context;
        object.getClass();
        object = z40$a.a((Context)stringArray);
        object = ((z40_0)object).a;
        stringArray = "redirection_whitelisting_request_ids";
        object = ((ao0_0)object).b((String)stringArray);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            return false;
        }
        stringArray = ",";
        stringArray = new String[]{stringArray};
        int n3 = 6;
        object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
        return object.contains(string2);
    }

    public cl2_2 intercept(nj1$a object) {
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request();
        Object object3 = ((kj2_2)object2).c;
        String string2 = "RequestId";
        String string3 = ((m41_0)object3).a(string2);
        int n3 = ((m41_0)object3).size();
        if (n3 > 0 && string3 != null) {
            object2 = ((kj2_2)object2).c();
            ((KJ2$a)object2).f(string2);
            object2 = ((KJ2$a)object2).b();
            object = object.a((kj2_2)object2);
            int n4 = ((cl2_2)object).d;
            n4 = (int)(this.isRedirectionResponse(n4) ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(this.shouldShowRedirection(string3) ? 1 : 0)) != 0) {
                int n7;
                object2 = new Intent("network_redirection");
                object3 = cl2_2.c((cl2_2)object, "location");
                if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                    string2 = "redirection_path";
                    object2.putExtra(string2, (String)object3);
                    object3 = Xv1.a(this.context);
                    ((Xv1)object3).c((Intent)object2);
                }
            }
        } else {
            object = object.a((kj2_2)object2);
        }
        return object;
    }
}

