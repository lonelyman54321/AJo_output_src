/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.l$c;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import java.util.ArrayList;

public final class l$a
implements k,
b {
    public final l$c a;
    public final /* synthetic */ l b;

    public l$a(l l2, l$c l$c) {
        this.b = l2;
        this.a = l$c;
    }

    public final void I(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            un1_0 un1_02 = new un1_0(this, pair, iv1, jm1_02);
            object.i(un1_02);
        }
    }

    public final void J(int n3, j$b object, jm1_0 jm1_02) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            int n4 = 1;
            kl1_2 kl1_22 = new kl1_2(this, n4, pair, jm1_02);
            object.i(kl1_22);
        }
    }

    public final void L(int n3, j$b object) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            vn1_0 vn1_02 = new vn1_0(this, pair);
            object.i(vn1_02);
        }
    }

    public final void N(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            xn1_0 xn1_02 = new xn1_0(this, pair, iv1, jm1_02);
            object.i(xn1_02);
        }
    }

    public final void O(int n3, j$b object, int n4) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            zn1_1 zn1_12 = new zn1_1(this, pair, n4);
            object.i(zn1_12);
        }
    }

    public final void R(int n3, j$b object) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            BN1 bN1 = new BN1(0, this, pair);
            object.i(bN1);
        }
    }

    public final void S(int n3, j$b object, Exception exception) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            wn1_1 wn1_12 = new wn1_1(this, pair, exception);
            object.i(wn1_12);
        }
    }

    public final Pair a(int n3, j$b j$b) {
        int n4;
        l$c l$c = this.a;
        j$b j$b2 = null;
        if (j$b != null) {
            block3: {
                Object object;
                int n7;
                Object object2 = null;
                for (int i3 = 0; i3 < (n7 = ((ArrayList)(object = l$c.c)).size()); ++i3) {
                    object = (j$b)l$c.c.get(i3);
                    long l2 = ((j$b)object).d;
                    long l3 = j$b.d;
                    long l4 = l2 - l3;
                    Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 != false) continue;
                    object2 = l$c.b;
                    n7 = H0.e;
                    object = j$b.a;
                    object2 = Pair.create((Object)object2, (Object)object);
                    j$b = j$b.a(object2);
                    break block3;
                }
                n4 = 0;
                j$b = null;
            }
            if (j$b == null) {
                return null;
            }
            j$b2 = j$b;
        }
        n4 = l$c.d;
        return Pair.create((Object)(n3 + n4), j$b2);
    }

    public final void b0(int n3, j$b object) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            CN1 cN1 = new CN1(this, pair);
            object.i(cN1);
        }
    }

    public final void i0(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            H21 h21 = this.b.i;
            object = new AN1(this, pair, iv1, jm1_02, iOException, bl2);
            h21.i((Runnable)object);
        }
    }

    public final void l0(int n3, j$b object) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            int n4 = 2;
            J61 j61 = new J61(n4, this, pair);
            object.i(j61);
        }
    }

    public final void n0(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02) {
        Pair pair = this.a(n3, (j$b)object);
        if (pair != null) {
            object = this.b.i;
            yn1_0 yn1_02 = new yn1_0(this, pair, iv1, jm1_02);
            object.i(yn1_02);
        }
    }
}

