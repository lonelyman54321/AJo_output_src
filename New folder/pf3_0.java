/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Renamed from Pf3
 */
public final class pf3_0
implements eI0 {
    public final vf3_0 a;
    public final Te0 b;
    public final d c;
    public final ArrayList d;
    public final Xm2 e;
    public byte[] f;
    public wp3 g;
    public int h;
    public int i;
    public long[] j;
    public long k;

    public pf3_0(vf3_0 object, d object2) {
        int n3;
        String string2;
        Object object3;
        this.a = object;
        this.b = object3;
        object3 = gz3.f;
        this.f = (byte[])object3;
        this.e = object3 = new Xm2();
        object3 = ((d)object2).a();
        ((d$a)object3).n = string2 = ip1_0.l("application/x-media3-cues");
        ((d$a)object3).j = object2 = ((d)object2).o;
        ((d$a)object3).I = n3 = object.c();
        this.c = object = new d((d$a)object3);
        object = new ArrayList();
        this.d = object;
        this.i = 0;
        object = gz3.g;
        this.j = (long[])object;
        this.k = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        long l2;
        Object object;
        Object object2;
        int n3;
        pf3_0 pf3_02 = this;
        int n4 = this.i;
        int n7 = 1;
        if (n4 != 0 && n4 != (n3 = 5)) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        ct3.f(n4 != 0);
        n4 = pf3_02.i;
        n3 = 2;
        int n8 = 1024;
        long l3 = -1;
        if (n4 == n7) {
            object2 = fi0_02;
            object2 = (il0_0)fi0_02;
            long l4 = ((il0_0)object2).c;
            long l7 = l4 - l3;
            n4 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n4 != 0) {
                object2 = fi0_02;
                object2 = (il0_0)fi0_02;
                l4 = ((il0_0)object2).c;
                n4 = Ints.checkedCast(l4);
            } else {
                n4 = 1024;
            }
            object = pf3_02.f;
            int n10 = ((Object)object).length;
            if (n4 > n10) {
                object2 = new byte[n4];
                pf3_02.f = (byte[])object2;
            }
            pf3_02.h = 0;
            pf3_02.i = n3;
        }
        n4 = pf3_02.i;
        object = pf3_02.d;
        long l8 = -9223372036854775807L;
        int n14 = 4;
        int n15 = -1;
        if (n4 == n3) {
            long l12;
            long l14;
            long l15;
            long l16;
            object2 = pf3_02.f;
            n3 = ((Object)object2).length;
            int n16 = pf3_02.h;
            if (n3 == n16) {
                n3 = ((Object)object2).length + n8;
                object2 = Arrays.copyOf((byte[])object2, n3);
                pf3_02.f = (byte[])object2;
            }
            object2 = pf3_02.f;
            n3 = pf3_02.h;
            n16 = ((Object)object2).length - n3;
            fi0_0 fi0_03 = fi0_02;
            fi0_03 = (il0_0)fi0_02;
            n4 = ((il0_0)fi0_03).read((byte[])object2, n3, n16);
            if (n4 != n15) {
                pf3_02.h = n3 = pf3_02.h + n4;
            }
            if ((n3 = (int)((l16 = (l15 = ((il0_0)fi0_03).c) - l3) == 0L ? 0 : (l16 < 0L ? -1 : 1))) != 0 && (n3 = (int)((l14 = (l12 = (long)pf3_02.h) - l15) == 0L ? 0 : (l14 < 0L ? -1 : 1))) == 0 || n4 == n15) {
                try {
                    l2 = pf3_02.k;
                    n4 = (int)(l2 == l8 ? 0 : (l2 < l8 ? -1 : 1));
                    object2 = n4 != 0 ? new Vf3$b(l2, n7 != 0) : Vf3$b.c;
                    Object object3 = object2;
                    object2 = pf3_02.a;
                    Object[] objectArray = pf3_02.f;
                    n8 = pf3_02.h;
                    of3_0 of3_02 = new of3_0(pf3_02, 0);
                    object2.b((byte[])objectArray, 0, n8, (Vf3$b)object3, of3_02);
                    Collections.sort(object);
                    n4 = ((ArrayList)object).size();
                    object2 = new long[n4];
                    pf3_02.j = (long[])object2;
                    object2 = null;
                    for (n4 = 0; n4 < (n3 = ((ArrayList)object).size()); ++n4) {
                        objectArray = pf3_02.j;
                        Object object4 = ((ArrayList)object).get(n4);
                        object4 = (Pf3$a)object4;
                        l12 = ((Pf3$a)object4).a;
                        objectArray[n4] = (byte)l12;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ParserException.a("SubtitleParser failed.", runtimeException);
                }
                object2 = gz3.f;
                pf3_02.f = (byte[])object2;
                pf3_02.i = n14;
            }
        }
        if ((n4 = pf3_02.i) == (n3 = 3)) {
            object2 = fi0_02;
            object2 = (il0_0)fi0_02;
            l2 = ((il0_0)object2).c;
            l3 = -1;
            long l17 = l2 - l3;
            n4 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
            if (n4 != 0) {
                object2 = fi0_02;
                object2 = (il0_0)fi0_02;
                l2 = ((il0_0)object2).c;
                n8 = Ints.checkedCast(l2);
            } else {
                n8 = 1024;
            }
            object2 = fi0_02;
            object2 = (il0_0)fi0_02;
            n4 = ((il0_0)object2).p(n8);
            if (n4 == n15) {
                l2 = pf3_02.k;
                long l18 = l2 - l8;
                n4 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                if (n4 == 0) {
                    n4 = 0;
                    object2 = null;
                } else {
                    object2 = pf3_02.j;
                    n4 = gz3.d((long[])object2, l2, n7 != 0);
                }
                while (n4 < (n7 = ((ArrayList)object).size())) {
                    Pf3$a pf3$a = (Pf3$a)((ArrayList)object).get(n4);
                    pf3_02.d(pf3$a);
                    ++n4;
                }
                pf3_02.i = n14;
            }
        }
        if ((n4 = pf3_02.i) != n14) return 0;
        return n15;
    }

    public final boolean b(fi0_0 fi0_02) {
        return true;
    }

    public final void c(long l2, long l3) {
        int n3;
        int n4 = this.i;
        int n7 = 1;
        n4 = n4 != 0 && n4 != (n3 = 5) ? 1 : 0;
        ct3.f(n4 != 0);
        this.k = l3;
        n4 = this.i;
        int n8 = 2;
        if (n4 == n8) {
            this.i = n7;
        }
        if ((n4 = this.i) == (n7 = 4)) {
            this.i = n4 = 3;
        }
    }

    public final void d(Pf3$a pf3$a) {
        ct3.h(this.g);
        byte[] byArray = pf3$a.b;
        int n3 = byArray.length;
        Object object = this.e;
        object.getClass();
        int n4 = byArray.length;
        ((Xm2)object).G(n4, byArray);
        this.g.f(n3, (Xm2)object);
        object = this.g;
        long l2 = pf3$a.a;
        object.a(l2, 1, n3, 0, null);
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    /*
     * WARNING - void declaration
     */
    public final void k(gi0_0 gi0_02) {
        void var2_5;
        Object object;
        int bl2 = this.i;
        int n3 = 1;
        if (bl2 == 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        ct3.f((boolean)var2_5);
        object = gi0_02.n(0, 3);
        this.g = object;
        d d2 = this.c;
        object.d(d2);
        gi0_02.j();
        long l2 = 0L;
        long[] lArray = new long[n3];
        lArray[0] = l2;
        long[] lArray2 = new long[n3];
        lArray2[0] = l2;
        object = new hg1_0(lArray, lArray2, -9223372036854775807L);
        gi0_02.h((dx2_1)object);
        this.i = n3;
    }

    public final void release() {
        int n3 = this.i;
        int n4 = 5;
        if (n3 == n4) {
            return;
        }
        this.a.reset();
        this.i = n4;
    }
}

