/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Fs3
implements eI0 {
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final Xm2 e;
    public final SparseIntArray f;
    public final Gs3$c g;
    public final vf3$a_0 h;
    public final SparseArray i;
    public final SparseBooleanArray j;
    public final SparseBooleanArray k;
    public final Es3 l;
    public Ds3 m;
    public gi0_0 n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Gs3 s;
    public int t;
    public int u;

    public Fs3(int n3, int n4, vf3$a_0 vf3$a_0, On3 object, qn0_0 qn0_02, int n7) {
        Object object2;
        this.g = qn0_02;
        this.c = n7;
        this.a = n3;
        this.b = n4;
        this.h = vf3$a_0;
        n4 = 1;
        if (n3 != n4 && n3 != (n4 = 2)) {
            this.d = object2 = new ArrayList();
            ((ArrayList)object2).add(object);
        } else {
            object2 = Collections.singletonList(object);
            this.d = object2;
        }
        n4 = 9400;
        Object object3 = new byte[n4];
        vf3$a_0 = null;
        this.e = object2 = new Xm2((byte[])object3, 0);
        object2 = new SparseBooleanArray();
        this.j = object2;
        object3 = new SparseBooleanArray;
        this.k = (SparseBooleanArray)object3;
        object3 = new SparseArray;
        super();
        this.i = (SparseArray)object3;
        super();
        this.f = object;
        this.l = object = new Es3(n7);
        this.n = object = gi0_0.c0;
        this.u = -1;
        object2.clear();
        object3.clear();
        object2 = new SparseArray();
        int n8 = object2.size();
        qn0_02 = null;
        for (int i3 = 0; i3 < n8; ++i3) {
            n7 = object2.keyAt(i3);
            Gs3 gs3 = (Gs3)object2.valueAt(i3);
            object3.put(n7, (Object)gs3);
        }
        object = new Fs3$a(this);
        object2 = new vw2_0((UW2)object);
        object3.put(0, object2);
        this.s = null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        boolean bl2;
        int n3;
        int n4;
        long l2;
        long l3;
        int n7;
        int n8;
        Object object;
        Fs3 fs3;
        block54: {
            int n10;
            Object object2;
            int n14;
            block53: {
                Object object3;
                void var19_34;
                SparseArray sparseArray;
                Object var22_48;
                int n15;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                fs3 = this;
                object = pw2;
                Object object8 = fi0_02;
                long l4 = ((il0_0)fi0_02).c;
                n8 = 0;
                object8 = null;
                n14 = 1;
                int n16 = this.a;
                int n17 = 2;
                boolean bl3 = n16 == n17;
                n7 = fs3.p;
                int n18 = 71;
                l3 = -1;
                if (n7 != 0) {
                    boolean bl4;
                    object7 = fs3.l;
                    Object object9 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                    if (object9 != false && !bl3 && !(bl4 = ((Es3)object7).d)) {
                        int n19 = fs3.u;
                        if (n19 <= 0) {
                            object = fi0_02;
                            object = (il0_0)fi0_02;
                            ((Es3)object7).a((il0_0)object);
                            return n8;
                        }
                        boolean bl5 = ((Es3)object7).f;
                        Xm2 xm2 = ((Es3)object7).c;
                        int n20 = ((Es3)object7).a;
                        if (!bl5) {
                            long l7;
                            block51: {
                                Object object10 = fi0_02;
                                object10 = (il0_0)fi0_02;
                                long l8 = n20;
                                long l12 = ((il0_0)object10).c;
                                l8 = Math.min(l8, l12);
                                n17 = (int)l8;
                                l7 = n17;
                                l7 = ((il0_0)object10).d;
                                long l14 = l7 - (l12 -= l7);
                                n20 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                                if (n20 != 0) {
                                    ((Pw2)object).a = l12;
                                    return 1;
                                }
                                xm2.F(n17);
                                ((il0_0)object10).f = 0;
                                object = xm2.a;
                                ((il0_0)object10).b((byte[])object, 0, n17, false);
                                int n21 = xm2.b;
                                n7 = xm2.c;
                                block1: for (int i3 = n7 + -188; i3 >= n21; i3 += -1) {
                                    Object object11;
                                    object10 = xm2.a;
                                    n17 = 0;
                                    Object var31_65 = null;
                                    for (n20 = -4; n20 <= (object11 = 4); ++n20) {
                                        object11 = n20 * 188 + i3;
                                        if (object11 >= n21 && object11 < n7 && (object11 = (Object)object10[object11]) == n18) {
                                            object11 = 5;
                                            if ((n17 += n14) != object11) continue;
                                            l8 = Hs3.a(xm2, i3, n19);
                                            long l15 = l8 - (l12 = -9223372036854775807L);
                                            Object object12 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                            if (object12 == false) continue block1;
                                            l7 = l8;
                                            break block51;
                                        }
                                        n17 = 0;
                                        var31_65 = null;
                                    }
                                }
                                l7 = -9223372036854775807L;
                            }
                            ((Es3)object7).h = l7;
                            ((Es3)object7).f = n14;
                            return n8;
                        }
                        long l16 = ((Es3)object7).h;
                        long l17 = -9223372036854775807L;
                        long l18 = l16 - l17;
                        Object object13 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                        if (object13 == false) {
                            object = fi0_02;
                            object = (il0_0)fi0_02;
                            ((Es3)object7).a((il0_0)object);
                            return n8;
                        }
                        n7 = (int)(((Es3)object7).e ? 1 : 0);
                        if (n7 == 0) {
                            block52: {
                                void var29_58;
                                l16 = n20;
                                fi0_0 fi0_03 = fi0_02;
                                fi0_03 = (il0_0)fi0_02;
                                long l19 = ((il0_0)fi0_03).c;
                                l16 = Math.min(l16, l19);
                                int n22 = (int)l16;
                                l19 = ((il0_0)fi0_03).d;
                                l17 = 0;
                                long l20 = l19 - l17;
                                n7 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
                                if (n7 != 0) {
                                    ((Pw2)object).a = l17;
                                    return 1;
                                }
                                xm2.F(n22);
                                ((il0_0)fi0_03).f = 0;
                                object = xm2.a;
                                ((il0_0)fi0_03).b((byte[])object, 0, n22, false);
                                int n24 = xm2.b;
                                n7 = xm2.c;
                                while (var29_58 < n7) {
                                    long l21;
                                    byte[] byArray = xm2.a;
                                    n22 = byArray[var29_58];
                                    if (n22 == n18 && (n22 = (int)((l21 = (l19 = Hs3.a(xm2, (int)var29_58, n19)) - (l17 = -9223372036854775807L)) == 0L ? 0 : (l21 < 0L ? -1 : 1))) != 0) {
                                        l16 = l19;
                                        break block52;
                                    }
                                    ++var29_58;
                                }
                                l16 = -9223372036854775807L;
                            }
                            ((Es3)object7).g = l16;
                            ((Es3)object7).e = n14;
                            return n8;
                        }
                        l16 = ((Es3)object7).g;
                        long l22 = -9223372036854775807L;
                        long l23 = l16 - l22;
                        Object object14 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                        if (object14 == false) {
                            object = fi0_02;
                            object = (il0_0)fi0_02;
                            ((Es3)object7).a((il0_0)object);
                            return n8;
                        } else {
                            object = ((Es3)object7).b;
                            l16 = ((On3)object).b(l16);
                            l22 = ((Es3)object7).h;
                            ((Es3)object7).i = l22 = ((On3)object).c(l22) - l16;
                            object = fi0_02;
                            object = (il0_0)fi0_02;
                            ((Es3)object7).a((il0_0)object);
                        }
                        return n8;
                    }
                    n7 = fs3.q;
                    if (n7 == 0) {
                        fs3.q = n14;
                        long l24 = ((Es3)object7).i;
                        long l25 = -9223372036854775807L;
                        long l26 = l24 - l25;
                        Object object15 = l26 == 0L ? 0 : (l26 < 0L ? -1 : 1);
                        if (object15 != false) {
                            n7 = fs3.u;
                            object6 = new Object();
                            n17 = fs3.c;
                            object7 = ((Es3)object7).b;
                            Ds3$a ds3$a = new Ds3$a(n7, (On3)object7, n17);
                            long l27 = l24 + 1L;
                            int n25 = 940;
                            long l28 = 188L;
                            object5 = object2;
                            object7 = ds3$a;
                            object4 = object2;
                            object8 = object2;
                            long l29 = 0L;
                            n15 = n16;
                            long l30 = l4;
                            l2 = l4;
                            l4 = l28;
                            fs3.m = object2 = new Kx((Kx$d)object6, ds3$a, l24, l27, l29, l30, l28, n25);
                            object5 = fs3.n;
                            object8 = ((Kx)object2).a;
                            object5.h((dx2_1)object8);
                        } else {
                            n15 = n16;
                            l2 = l4;
                            object8 = fs3.n;
                            object5 = new dX2$b;
                            ((dX2$b)object5)(l24);
                            object8.h((dx2_1)object5);
                        }
                    } else {
                        n15 = n16;
                        l2 = l4;
                    }
                    n8 = fs3.r;
                    if (n8 != 0) {
                        n8 = 0;
                        object8 = null;
                        fs3.r = false;
                        long l31 = 0L;
                        fs3.c(l31, l31);
                        object6 = fi0_02;
                        object6 = (il0_0)fi0_02;
                        long l34 = ((il0_0)object6).d;
                        long l35 = l34 == l31 ? 0 : (l34 < l31 ? -1 : 1);
                        if (l35 != false) {
                            ((Pw2)object).a = l31;
                            return 1;
                        }
                    }
                    n8 = 1;
                    object5 = fs3.m;
                    if (object5 != null && (object6 = ((Kx)object5).c) != null) {
                        object8 = fi0_02;
                        object8 = (il0_0)fi0_02;
                        return ((Kx)object5).a((il0_0)object8, (Pw2)object);
                    }
                } else {
                    n15 = n16;
                    l2 = l4;
                    n8 = 1;
                }
                object = fs3.e;
                object5 = ((Xm2)object).a;
                n4 = ((Xm2)object).b;
                n3 = 188;
                if ((n4 = 9400 - n4) < n3) {
                    n4 = ((Xm2)object).a();
                    if (n4 > 0) {
                        int n26 = ((Xm2)object).b;
                        boolean bl6 = false;
                        var22_48 = null;
                        System.arraycopy(object5, n26, object5, 0, n4);
                    }
                    ((Xm2)object).G(n4, (byte[])object5);
                }
                while (true) {
                    int n27;
                    n4 = ((Xm2)object).a();
                    sparseArray = fs3.i;
                    if (n4 >= n3) break;
                    n4 = ((Xm2)object).c;
                    int n28 = 9400 - n4;
                    object2 = fi0_02;
                    object2 = (il0_0)fi0_02;
                    if ((n28 = ((il0_0)object2).read((byte[])object5, n4, n28)) == (n27 = -1)) {
                        void var29_61;
                        boolean bl7 = false;
                        object = null;
                        while (var29_61 < (n7 = sparseArray.size())) {
                            object5 = (Gs3)sparseArray.valueAt((int)var29_61);
                            n4 = object5 instanceof rr2_0;
                            if (n4 != 0) {
                                object5 = (rr2_0)object5;
                                n4 = ((rr2_0)object5).c;
                                n3 = 3;
                                if (!(n4 != n3 || (n4 = ((rr2_0)object5).j) != n27 || bl3 && (n4 = (object6 = ((rr2_0)object5).a) instanceof d21) != 0)) {
                                    object6 = new Xm2();
                                    ((rr2_0)object5).a(n8, (Xm2)object6);
                                }
                            }
                            ++var29_61;
                        }
                        return n27;
                    }
                    ((Xm2)object).H(n4 += n28);
                }
                n7 = ((Xm2)object).b;
                n4 = ((Xm2)object).c;
                object7 = ((Xm2)object).a;
                int n29 = n7;
                while (var19_34 < n4 && (object3 = object7[var19_34]) != (n10 = 71)) {
                    ++var19_34;
                }
                ((Xm2)object).I((int)var19_34);
                n3 = var19_34 + 188;
                boolean bl8 = false;
                object2 = null;
                if (n3 > n4) {
                    n4 = fs3.t;
                    void var19_35 = var19_34 - n7 + n4;
                    fs3.t = var19_35;
                    n7 = n15;
                    n4 = 2;
                    if (n15 == n4) {
                        n10 = 376;
                        if (var19_35 > n10) throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                    boolean bl9 = false;
                    var22_48 = null;
                } else {
                    n7 = n15;
                    n4 = 2;
                    boolean bl10 = false;
                    var22_48 = null;
                    fs3.t = 0;
                }
                n10 = ((Xm2)object).c;
                if (n3 > n10) {
                    return 0;
                }
                n17 = ((Xm2)object).i();
                n18 = 0x800000 & n17;
                if (n18 != 0) {
                    ((Xm2)object).I(n3);
                    return 0;
                }
                int n30 = 0x400000 & n17;
                n14 = n30 != 0 ? 1 : 0;
                int n32 = (0x1FFF00 & n17) >> 8;
                n18 = n17 & 0x20;
                n18 = n18 != 0 ? 1 : 0;
                int n34 = n17 & 0x10;
                if (n34 != 0) {
                    Object object16;
                    object2 = object16 = sparseArray.get(n32);
                    object2 = (Gs3)object16;
                }
                if (object2 == null) {
                    ((Xm2)object).I(n3);
                    return 0;
                }
                boolean bl11 = false;
                Object var55_89 = null;
                if (n7 != n4) {
                    SparseIntArray sparseIntArray = fs3.f;
                    int n35 = (n17 &= 0xF) + -1;
                    n35 = sparseIntArray.get(n32, n35);
                    sparseIntArray.put(n32, n17);
                    if (n35 == n17) {
                        ((Xm2)object).I(n3);
                        return 0;
                    }
                    int n36 = (n35 += n8) & 0xF;
                    if (n17 != n36) {
                        object2.c();
                    }
                }
                if (n18 != 0) {
                    int n37 = ((Xm2)object).w();
                    n17 = ((Xm2)object).w() & 0x40;
                    if (n17 != 0) {
                        n17 = 2;
                    } else {
                        n17 = 0;
                        object4 = null;
                    }
                    n14 |= n17;
                    int n38 = n37 - n8;
                    ((Xm2)object).J(n38);
                }
                bl2 = fs3.p;
                if (n7 == n4 || bl2) break block53;
                object4 = fs3.k;
                n18 = 0;
                boolean bl12 = object4.get(n32, false);
                if (bl12) break block54;
            }
            ((Xm2)object).H(n3);
            object2.a(n14, (Xm2)object);
            ((Xm2)object).H(n10);
        }
        if (n7 != n4 && !bl2 && (n7 = (int)(fs3.p ? 1 : 0)) != 0 && (n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1))) != 0) {
            fs3.r = n8;
        }
        ((Xm2)object).I(n3);
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        int n3;
        byte[] byArray = this.e.a;
        fi0_02 = (il0_0)fi0_02;
        ((il0_0)fi0_02).b(byArray, 0, 940, false);
        block0: for (int i3 = 0; i3 < (n3 = 188); ++i3) {
            int n4;
            for (n3 = 0; n3 < (n4 = 5); ++n3) {
                n4 = n3 * 188 + i3;
                int n7 = 71;
                if ((n4 = byArray[n4]) == n7) continue;
                continue block0;
            }
            ((il0_0)fi0_02).j(i3);
            return true;
        }
        return false;
    }

    public final void c(long l2, long l3) {
        Object object;
        int n3;
        long l4;
        Object object2;
        int n4 = this.a;
        int n7 = 2;
        if (n4 != n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        ct3.f(n4 != 0);
        object2 = this.d;
        n7 = object2.size();
        int n8 = 0;
        while (true) {
            long l7;
            l4 = 0L;
            if (n8 >= n7) break;
            On3 on3 = (On3)object2.get(n8);
            long l8 = on3.e();
            long l12 = l8 - (l7 = -9223372036854775807L);
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            boolean bl2 = object3 == false;
            if (!bl2) {
                long l14;
                long l15;
                l8 = on3.d();
                long l16 = l8 - l7;
                object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                bl2 = object3 != false && (l15 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1)) != false && (l14 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1)) != false;
            }
            if (bl2) {
                on3.g(l3);
            }
            ++n8;
        }
        n4 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
        if (n4 != 0 && (object2 = this.m) != null) {
            ((Kx)object2).c(l3);
        }
        this.e.F(0);
        this.f.clear();
        object2 = null;
        for (n4 = 0; n4 < (n3 = (object = this.i).size()); ++n4) {
            object = (Gs3)object.valueAt(n4);
            object.c();
        }
        this.t = 0;
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        int n3 = this.b & 1;
        if (n3 == 0) {
            vf3$a_0 vf3$a_0 = this.h;
            wf3_1 wf3_12 = new wf3_1(gi0_02, vf3$a_0);
            gi0_02 = wf3_12;
        }
        this.n = gi0_02;
    }

    public final void release() {
    }
}

