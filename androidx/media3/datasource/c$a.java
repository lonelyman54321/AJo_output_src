/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.c;

public final class c$a
implements DataSource$Factory {
    public final Ca1 a;
    public Kq3 b;
    public String c;
    public final int d;
    public final int e;

    public c$a() {
        int n3;
        Ca1 ca1;
        this.a = ca1 = new Ca1();
        this.d = n3 = 8000;
        this.e = n3;
    }

    public final DataSource a() {
        Object object = this.c;
        int n3 = this.d;
        int n4 = this.e;
        Ca1 ca1 = this.a;
        c c2 = new c((String)object, n3, n4, ca1);
        object = this.b;
        if (object != null) {
            c2.g((Kq3)object);
        }
        return c2;
    }

    public final void b(Kq3 kq3) {
        this.b = kq3;
    }

    public final void c(String string2) {
        this.c = string2;
    }
}

