/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f_0;

/*
 * Renamed from androidx.datastore.preferences.protobuf.e
 */
public abstract class e_0 {
    public int a;
    public final int b;
    public final int c = -1 >>> 1;
    public f_0 d;

    public e_0() {
        this.b = 100;
    }

    public static long b(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }

    public abstract void a(int var1);

    public abstract int c();

    public abstract boolean d();

    public abstract void e(int var1);

    public abstract int f(int var1);

    public abstract boolean g();

    public abstract DF$e h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int var1);
}

