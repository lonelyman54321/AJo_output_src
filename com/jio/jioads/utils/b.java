/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.AnimatedImageDrawable
 *  android.graphics.drawable.Drawable
 */
package com.jio.jioads.utils;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.jio.jioads.native.d;
import com.jio.jioads.utils.a;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements Runnable {
    public final /* synthetic */ Drawable a;

    public /* synthetic */ b(Drawable drawable2) {
        this.a = drawable2;
    }

    public final void run() {
        int n3 = com.jio.jioads.utils.a.b;
        String string2 = "$finalImgDrawable";
        Drawable drawable2 = this.a;
        Intrinsics.checkNotNullParameter(drawable2, string2);
        n3 = (int)(yd1.a(drawable2) ? 1 : 0);
        if (n3 != 0) {
            string2 = zd1.a(drawable2);
            d.a((AnimatedImageDrawable)string2);
        }
    }
}

