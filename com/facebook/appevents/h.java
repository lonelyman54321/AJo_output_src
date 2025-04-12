/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.j;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public final g a;

    public h(Context context) {
        g g3 = new g(context, null);
        this(g3);
    }

    public h(g g3) {
        Intrinsics.checkNotNullParameter(g3, "loggerImpl");
        this.a = g3;
    }

    public final void a(Bundle bundle, String string2) {
        Object object = FacebookSdk.a;
        boolean bl2 = j.c();
        if (bl2) {
            object = this.a;
            ((g)object).h(bundle, string2);
        }
    }
}

