/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i$b;

public final class k$a {
    public int a;
    public Fragment b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public i$b h;
    public i$b i;

    public k$a() {
    }

    public k$a(Fragment object, int n3) {
        this.a = n3;
        this.b = object;
        this.c = false;
        object = i$b.RESUMED;
        this.h = object;
        this.i = object;
    }

    public k$a(Fragment object, int n3, int n4) {
        this.a = n3;
        this.b = object;
        this.c = true;
        object = i$b.RESUMED;
        this.h = object;
        this.i = object;
    }
}

