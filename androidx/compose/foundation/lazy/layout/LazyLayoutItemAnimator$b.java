/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.c;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class LazyLayoutItemAnimator$b {
    public Gr1[] a;
    public c60 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ LazyLayoutItemAnimator h;

    public LazyLayoutItemAnimator$b(LazyLayoutItemAnimator gr1Array) {
        this.h = gr1Array;
        gr1Array = Pr1.a;
        this.a = gr1Array;
        this.e = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(LazyLayoutItemAnimator$b lazyLayoutItemAnimator$b, gs1_0 gs1_02, c80 c802, T01 t01, int n3, int n4) {
        lazyLayoutItemAnimator$b.h.getClass();
        long l2 = gs1_02.l(0);
        int n7 = gs1_02.f();
        if (n7 == 0) {
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
        } else {
            n7 = 32;
            l2 >>= n7;
        }
        int n8 = (int)l2;
        lazyLayoutItemAnimator$b.a(gs1_02, c802, t01, n3, n4, n8);
    }

    public final void a(gs1_0 gs1_02, c80 c802, T01 t01, int n3, int n4, int n7) {
        int n8;
        Object object;
        block11: {
            object = this.a;
            int n10 = ((Gr1[])object).length;
            n8 = 0;
            for (int i3 = 0; i3 < n10; ++i3) {
                boolean bl2;
                boolean bl3;
                Gr1 gr1 = object[i3];
                if (gr1 == null || (bl3 = gr1.g) != (bl2 = true)) {
                    continue;
                }
                break block11;
            }
            this.f = n3;
            this.g = n4;
        }
        Object object2 = this.a;
        n4 = ((Gr1[])object2).length;
        for (n3 = gs1_02.c(); n3 < n4; ++n3) {
            object = this.a[n3];
            if (object == null) continue;
            ((Gr1)object).c();
        }
        Gr1[] gr1Array = this.a;
        n3 = gr1Array.length;
        n4 = gs1_02.c();
        if (n3 != n4) {
            gr1Array = this.a;
            n4 = gs1_02.c();
            gr1Array = Arrays.copyOf(gr1Array, n4);
            object2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(gr1Array, (String)object2);
            this.a = gr1Array;
        }
        long l2 = gs1_02.b();
        this.b = object = new c60(l2);
        this.c = n7;
        this.d = n3 = gs1_02.m();
        this.e = n3 = gs1_02.d();
        n3 = gs1_02.c();
        while (n8 < n3) {
            object2 = gs1_02.j(n8);
            n7 = object2 instanceof ar1_1;
            object = null;
            if (n7 != 0) {
                object2 = (ar1_1)object2;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 == null) {
                object2 = this.a[n8];
                if (object2 != null) {
                    ((Gr1)object2).c();
                }
                object2 = this.a;
                object2[n8] = null;
            } else {
                object2 = this.a[n8];
                if (object2 == null) {
                    LazyLayoutItemAnimator lazyLayoutItemAnimator = this.h;
                    Gr1[] gr1Array2 = new c(lazyLayoutItemAnimator);
                    object2 = new Gr1(c802, t01, (c)gr1Array2);
                    gr1Array2 = this.a;
                    gr1Array2[n8] = object2;
                }
                ((Gr1)object2).d = null;
                ((Gr1)object2).e = null;
                ((Gr1)object2).f = null;
            }
            ++n8;
        }
    }
}

