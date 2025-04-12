/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
package androidx.core.view;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$e;

public class f$c
extends f$e {
    public final WindowInsets.Builder c;

    public f$c() {
        WindowInsets.Builder builder;
        this.c = builder = wa3_1.a();
    }

    public f$c(f f5) {
        super(f5);
        f5 = f5.g();
        f5 = f5 != null ? DG3.b((WindowInsets)f5) : wa3_1.a();
        this.c = f5;
    }

    public f b() {
        this.a();
        Object object = ua3_0.a(this.c);
        object = f.h(null, object);
        ei1[] ei1Array = this.b;
        object.a.p(ei1Array);
        return object;
    }

    public void d(ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        ei12 = ei12.d();
        BG3.a(builder, (Insets)ei12);
    }

    public void e(ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        ei12 = ei12.d();
        zg3_1.a(builder, (Insets)ei12);
    }

    public void f(ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        ei12 = ei12.d();
        AG3.a(builder, (Insets)ei12);
    }

    public void g(ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        ei12 = ei12.d();
        yg3_0.a(builder, (Insets)ei12);
    }

    public void h(ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        ei12 = ei12.d();
        CG3.a(builder, (Insets)ei12);
    }
}

