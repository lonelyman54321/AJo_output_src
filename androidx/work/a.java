/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package androidx.work;

import android.os.Build;
import androidx.work.a$a;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final ExecutorService a;
    public final wm0_2 b;
    public final ExecutorService c;
    public final xj2_2 d;
    public final Un0 e;
    public final M32 f;
    public final Sm0 g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final S40 m;

    public a(a$a object) {
        Intrinsics.checkNotNullParameter(object, "builder");
        this.a = object = T40.a(false);
        this.b = object = ir0_2.a;
        boolean bl2 = true;
        Object object2 = T40.a(bl2);
        this.c = object2;
        this.d = object2 = new Object();
        this.e = object2 = Un0.a;
        this.f = object2 = M32.a;
        this.g = object2 = new Sm0();
        this.h = 4;
        this.i = -1 >>> 1;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 == n4 ? 10 : 20;
        this.k = n3;
        this.j = 8;
        this.l = bl2;
        this.m = object = new Object();
    }
}

