/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 */
package com.jio.jioads.native;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public final String a;
    public byte[] b;
    public ImageView c;
    public final int d;
    public final int e;
    public final boolean f;

    public h(String string2, int n3, int n4, boolean bl2) {
        this.a = string2;
        this.f = bl2;
        this.d = n3;
        this.e = n4;
    }

    public final ImageView a() {
        ImageView imageView = this.c;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageView");
        return null;
    }
}

