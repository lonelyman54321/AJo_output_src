/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.AnimatedImageDrawable
 *  android.graphics.drawable.Drawable
 */
package com.jio.jioads.native;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.jio.jioads.native.a;
import com.jio.jioads.native.d;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements Runnable {
    public final /* synthetic */ Drawable a;

    public /* synthetic */ e(Drawable drawable2) {
        this.a = drawable2;
    }

    public final void run() {
        int n3 = com.jio.jioads.native.a.b;
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

