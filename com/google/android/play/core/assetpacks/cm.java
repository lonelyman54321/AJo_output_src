/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.a;
import com.google.android.play.core.assetpacks.cl;
import com.google.android.play.core.assetpacks.cn;
import com.google.android.play.core.assetpacks.p;

public final class cm {
    private p a;

    private cm() {
        throw null;
    }

    public /* synthetic */ cm(cn cn2) {
    }

    public final a a() {
        Object object = this.a;
        if (object != null) {
            cl cl2 = new cl((p)object, null);
            return cl2;
        }
        String string2 = String.valueOf(p.class.getCanonicalName()).concat(" must be set");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final cm b(p p2) {
        this.a = p2;
        return this;
    }
}

