/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.b_0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mg2
 */
public final class mg2_0
implements iv1_0 {
    public final us2_0 a;
    public final us2_0 b;
    public final iv1_0 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public mg2_0(us2_0 us2_02, pk2_0 pk2_02, b_0 b_02) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(us2_02, "oldList");
        Intrinsics.checkNotNullParameter(pk2_02, "newList");
        Intrinsics.checkNotNullParameter(b_02, "callback");
        this.a = us2_02;
        this.b = pk2_02;
        this.c = b_02;
        this.d = n4 = us2_02.b();
        this.e = n4 = us2_02.c();
        this.f = n3 = us2_02.a();
        this.g = n3 = 1;
        this.h = n3;
    }

    public final void a(int n3, int n4) {
        int n7 = this.f;
        int n8 = 3;
        int n10 = 2;
        iv1_0 iv1_02 = this.c;
        if (n3 < n7 || (n7 = this.h) == n10) {
            if (n3 > 0 || (n7 = this.g) == n10) {
                n7 = this.d;
                iv1_02.a(n3 += n7, n4);
            } else {
                n3 = this.d;
                if ((n3 = Math.min(n4, n3)) > 0) {
                    this.g = n8;
                    n7 = 0 - n3;
                    n8 = this.d;
                    tq0 tq02 = tq0.PLACEHOLDER_TO_ITEM;
                    iv1_02.c(n7 += n8, n3, (Object)tq02);
                    this.d = n7 = this.d - n3;
                }
                if ((n3 = n4 - n3) > 0) {
                    n7 = this.d;
                    iv1_02.a(n7, n3);
                }
            }
        } else {
            n7 = this.e;
            if ((n7 = Math.min(n4, n7)) > 0) {
                this.h = n8;
                n8 = this.d + n3;
                tq0 tq03 = tq0.PLACEHOLDER_TO_ITEM;
                iv1_02.c(n8, n7, (Object)tq03);
                this.e = n8 = this.e - n7;
            }
            if ((n8 = n4 - n7) > 0) {
                n3 += n7;
                n7 = this.d;
                iv1_02.a(n3 += n7, n8);
            }
        }
        this.f = n3 = this.f + n4;
    }

    public final void b(int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = this.f;
        int n10 = 2;
        us2_0 us2_02 = this.b;
        int n14 = 3;
        int n15 = 0;
        iv1_0 iv1_02 = this.c;
        if (n7 < n8 || (n7 = this.h) == n14) {
            if (n3 > 0 || (n7 = this.g) == n14) {
                n7 = this.d;
                iv1_02.b(n3 += n7, n4);
            } else {
                n3 = us2_02.b();
                n7 = this.d;
                if ((n3 = Math.min(n3 - n7, n4)) >= 0) {
                    n15 = n3;
                }
                n3 = n4 - n15;
                if (n3 > 0) {
                    n7 = this.d;
                    iv1_02.b(n7, n3);
                }
                if (n15 > 0) {
                    this.g = n10;
                    n3 = this.d;
                    tq0 tq02 = tq0.ITEM_TO_PLACEHOLDER;
                    iv1_02.c(n3, n15, (Object)tq02);
                    this.d = n3 = this.d + n15;
                }
            }
        } else {
            n7 = us2_02.c();
            n8 = this.e;
            if ((n7 = Math.min(n7 - n8, n4)) >= 0) {
                n15 = n7;
            }
            n7 = n4 - n15;
            if (n15 > 0) {
                this.h = n10;
                n8 = this.d + n3;
                tq0 tq03 = tq0.ITEM_TO_PLACEHOLDER;
                iv1_02.c(n8, n15, (Object)tq03);
                this.e = n8 = this.e + n15;
            }
            if (n7 > 0) {
                n3 += n15;
                n8 = this.d;
                iv1_02.b(n3 += n8, n7);
            }
        }
        this.f = n3 = this.f - n4;
    }

    public final void c(int n3, int n4, Object object) {
        int n7 = this.d;
        this.c.c(n3 += n7, n4, object);
    }

    public final void d(int n3, int n4) {
        int n7 = this.d;
        this.c.d(n3 += n7, n4 += n7);
    }
}

