/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.play.core.assetpacks.internal.as;

public final class ap
implements as {
    private as a;

    public static void b(as object, as as2) {
        object = (ap)object;
        as as4 = ((ap)object).a;
        if (as4 == null) {
            ((ap)object).a = as2;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }

    public final Object a() {
        Object object = this.a;
        if (object != null) {
            return object.a();
        }
        object = new IllegalStateException();
        throw object;
    }
}

