/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog$c;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.WebViewLoginMethodHandler;
import kotlin.jvm.internal.Intrinsics;

public final class WebViewLoginMethodHandler$c
implements WebDialog$c {
    public final /* synthetic */ WebViewLoginMethodHandler a;
    public final /* synthetic */ LoginClient$Request b;

    public WebViewLoginMethodHandler$c(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient$Request loginClient$Request) {
        this.a = webViewLoginMethodHandler;
        this.b = loginClient$Request;
    }

    public final void a(Bundle bundle, FacebookException facebookException) {
        WebViewLoginMethodHandler webViewLoginMethodHandler = this.a;
        webViewLoginMethodHandler.getClass();
        LoginClient$Request loginClient$Request = this.b;
        Intrinsics.checkNotNullParameter(loginClient$Request, "request");
        webViewLoginMethodHandler.o(loginClient$Request, bundle, facebookException);
    }
}

