/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;
import com.google.android.play.core.assetpacks.p;

public final class u
implements as {
    private final p a;

    public u(p p2) {
        this.a = p2;
    }

    public static Context c(p p2) {
        p2 = p2.a();
        ar.a(p2);
        return p2;
    }

    public final /* synthetic */ Object a() {
        return u.c(this.a);
    }

    public final Context b() {
        return u.c(this.a);
    }
}

