/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
import android.text.Layout;

public final class Ms3 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public String l;
    public int m;
    public int n;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public int q;
    public Uj3 r;
    public float s;

    public Ms3() {
        int n3;
        this.f = n3 = -1;
        this.g = n3;
        this.h = n3;
        this.i = n3;
        this.j = n3;
        this.m = n3;
        this.n = n3;
        this.q = n3;
        this.s = Float.MAX_VALUE;
    }

    public final void a(Ms3 ms3) {
        if (ms3 != null) {
            int n3;
            float f5;
            float f6;
            float f7;
            Object object;
            int n4;
            int n7 = this.c;
            boolean bl2 = true;
            if (n7 == 0 && (n7 = ms3.c) != 0) {
                this.b = n7 = ms3.b;
                this.c = bl2;
            }
            if ((n7 = this.h) == (n4 = -1)) {
                this.h = n7 = ms3.h;
            }
            if ((n7 = this.i) == n4) {
                this.i = n7 = ms3.i;
            }
            if ((object = this.a) == null && (object = ms3.a) != null) {
                this.a = object;
            }
            if ((n7 = this.f) == n4) {
                this.f = n7 = ms3.f;
            }
            if ((n7 = this.g) == n4) {
                this.g = n7 = ms3.g;
            }
            if ((n7 = this.n) == n4) {
                this.n = n7 = ms3.n;
            }
            if ((object = this.o) == null && (object = ms3.o) != null) {
                this.o = object;
            }
            if ((object = this.p) == null && (object = ms3.p) != null) {
                this.p = object;
            }
            if ((n7 = this.q) == n4) {
                this.q = n7 = ms3.q;
            }
            if ((n7 = this.j) == n4) {
                this.j = n7 = ms3.j;
                this.k = f7 = ms3.k;
            }
            if ((object = this.r) == null) {
                this.r = object = ms3.r;
            }
            if ((n7 = (int)((f6 = (f7 = this.s) - (f5 = Float.MAX_VALUE)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) == 0) {
                this.s = f7 = ms3.s;
            }
            if ((n7 = (int)(this.e ? 1 : 0)) == 0 && (n7 = (int)(ms3.e ? 1 : 0)) != 0) {
                this.d = n7 = ms3.d;
                this.e = bl2;
            }
            if ((n7 = this.m) == n4 && (n3 = ms3.m) != n4) {
                this.m = n3;
            }
        }
    }
}

