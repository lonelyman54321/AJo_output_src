/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;

public final class f21$a {
    public final wp3 a;
    public final boolean b;
    public final boolean c;
    public final SparseArray d;
    public final SparseArray e;
    public final Ym2 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public f21$a$a m;
    public f21$a$a n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;

    public f21$a(wp3 object, boolean bl2, boolean bl3) {
        Ym2 ym2;
        this.a = object;
        this.b = bl2;
        this.c = bl3;
        this.d = object;
        super();
        this.e = object;
        this.m = object = new Object();
        this.n = object = new Object();
        object = new byte[128];
        this.g = (byte[])object;
        this.f = ym2 = new Ym2((byte[])object, 0, 0);
        this.k = false;
        this.o = false;
        object = this.n;
        ((f21$a$a)object).b = false;
        ((f21$a$a)object).a = false;
    }

    public final void a() {
        int n3;
        int n4 = this.b;
        int n7 = 0;
        int n8 = 1;
        if (n4 != 0) {
            f21$a$a f21$a$a = this.n;
            n3 = f21$a$a.b;
            if (n3 != 0 && ((n4 = f21$a$a.e) == (n3 = 7) || n4 == (n3 = 2))) {
                n4 = 1;
            } else {
                n4 = 0;
                f21$a$a = null;
            }
        } else {
            n4 = this.s;
        }
        n3 = this.r;
        int n10 = this.i;
        int n14 = 5;
        if (n10 == n14 || n4 != 0 && n10 == n8) {
            n7 = 1;
        }
        n4 = n3 | n7;
        this.r = n4;
    }
}

