/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook.applinks;

import android.content.Context;
import com.facebook.applinks.a;
import com.facebook.applinks.a$a;

class AppLinkData$1
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a$a c;

    public AppLinkData$1(Context context, String string2, W9 w9) {
        this.a = context;
        this.b = string2;
        this.c = w9;
    }

    public final void run() {
        Context context;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            context = this.a;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        String string2 = this.b;
        a$a a$a = this.c;
        a$a = (W9)a$a;
        com.facebook.applinks.a.a(context, string2, (W9)a$a);
    }
}

