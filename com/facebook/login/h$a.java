/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.facebook.login;

import android.view.View;
import com.facebook.login.LoginClient$a;
import com.facebook.login.h;
import kotlin.jvm.internal.Intrinsics;

public final class h$a
implements LoginClient$a {
    public final /* synthetic */ h a;

    public h$a(h h3) {
        this.a = h3;
    }

    public final void a() {
        View view = this.a.e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            view = null;
        }
        view.setVisibility(0);
    }

    public final void b() {
        View view = this.a.e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            view = null;
        }
        view.setVisibility(8);
    }
}

