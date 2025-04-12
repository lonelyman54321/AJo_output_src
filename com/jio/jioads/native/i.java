/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instreamads.vastparser.listener.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.native.k;
import kotlin.jvm.internal.Intrinsics;

public final class i
implements c {
    public final /* synthetic */ k a;

    public i(k k2) {
        this.a = k2;
    }

    public final void a(m m2) {
        this.a.invoke(m2);
    }

    public final void b(JioAdError jioAdError, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        this.a.invoke(null);
    }
}

