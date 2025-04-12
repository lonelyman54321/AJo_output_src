/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog$a;
import com.facebook.internal.WebDialog$c;
import kotlin.jvm.internal.Intrinsics;

public final class WebViewLoginMethodHandler$a
extends WebDialog$a {
    public String e;
    public uy1 f;
    public LA1 g;
    public boolean h;
    public boolean i;
    public String j;
    public String k;

    public final WebDialog a() {
        WebDialog webDialog;
        int n3;
        Bundle bundle = this.d;
        Intrinsics.checkNotNull(bundle, "null cannot be cast to non-null type android.os.Bundle");
        String string2 = this.e;
        bundle.putString("redirect_uri", string2);
        string2 = this.b;
        bundle.putString("client_id", string2);
        Object object = this.j;
        string2 = null;
        Object object2 = "e2e";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object2);
            n3 = 0;
            object = null;
        }
        bundle.putString(object2, object);
        object = this.g;
        object2 = LA1.INSTAGRAM;
        object = object == object2 ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain";
        bundle.putString("response_type", object);
        object2 = "true";
        bundle.putString("return_scopes", object2);
        object = this.k;
        if (object != null) {
            string2 = object;
        } else {
            object = "authType";
            Intrinsics.throwUninitializedPropertyAccessException(object);
        }
        bundle.putString("auth_type", string2);
        object = this.f.name();
        string2 = "login_behavior";
        bundle.putString(string2, object);
        n3 = this.h;
        if (n3 != 0) {
            object = this.g.toString();
            string2 = "fx_app";
            bundle.putString(string2, object);
        }
        if ((n3 = this.i) != 0) {
            object = "skip_dedupe";
            bundle.putString(object, object2);
        }
        n3 = WebDialog.m;
        string2 = this.a;
        Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type android.content.Context");
        LA1 lA1 = this.g;
        WebDialog$c webDialog$c = this.c;
        Intrinsics.checkNotNullParameter(string2, "context");
        Intrinsics.checkNotNullParameter((Object)lA1, "targetApp");
        WebDialog.b((Context)string2);
        object = webDialog;
        webDialog = new WebDialog((Context)string2, "oauth", bundle, lA1, webDialog$c);
        return webDialog;
    }
}

