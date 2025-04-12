/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.j;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public final class j$c
extends x3 {
    public bk_1 a = null;
    public final String b;
    public final /* synthetic */ j c;

    public j$c(j j3, String string2) {
        this.c = j3;
        this.b = string2;
    }

    public final Intent a(Context context, Object object) {
        String string2;
        object = (Collection)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "permissions");
        Object object2 = new yy1((Collection)object);
        object = this.c;
        LoginClient$Request loginClient$Request = ((j)object).a((yy1)object2);
        object2 = this.b;
        if (object2 != null) {
            string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            loginClient$Request.e = object2;
        }
        j.g(context, loginClient$Request);
        object2 = j.b(loginClient$Request);
        string2 = FacebookSdk.a().getPackageManager();
        LoginClient$Result$a loginClient$Result$a = null;
        string2 = string2.resolveActivity((Intent)object2, 0);
        if (string2 != null) {
            return object2;
        }
        object2 = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        loginClient$Result$a = LoginClient$Result$a.ERROR;
        object.getClass();
        string2 = context;
        j.c(context, loginClient$Result$a, null, (FacebookException)object2, false, loginClient$Request);
        throw object2;
    }

    public final Object c(int n3, Intent intent) {
        Object object = j.j;
        this.c.h(n3, intent, null);
        object = dK$c.Login;
        int n4 = ((dK$c)((Object)object)).toRequestCode();
        Object object2 = this.a;
        if (object2 != null) {
            object2.onActivityResult(n4, n3, intent);
        }
        object2 = new bK$a(n4, n3, intent);
        return object2;
    }
}

