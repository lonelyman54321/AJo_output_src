/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.viewinterop.a$a;

public final class a {
    public static final a$a a;

    static {
        a$a a$a;
        a = a$a = new Object();
    }

    public static final void a(ViewFactoryHolder viewFactoryHolder, xp1_0 xp1_02) {
        long l2 = xp1_02.y.b.a0(0L);
        int n3 = Math.round(e72.d(l2));
        int n4 = Math.round(e72.e(l2));
        int n7 = viewFactoryHolder.getMeasuredWidth() + n3;
        int n8 = viewFactoryHolder.getMeasuredHeight() + n4;
        viewFactoryHolder.layout(n3, n4, n7, n8);
    }
}

