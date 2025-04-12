/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from j30
 */
public final class j30_0
implements b30_0 {
    public int A;
    public boolean B;
    public final k30_0 C;
    public final gb3_1 D;
    public boolean E;
    public k73 F;
    public l73 G;
    public q73 H;
    public boolean I;
    public rq2_1 J;
    public zr_1 K;
    public final d30_0 L;
    public Ae M;
    public wo0_0 N;
    public boolean O;
    public int P;
    public final mp a;
    public final A30 b;
    public final l73 c;
    public final Set d;
    public final zr_1 e;
    public final zr_1 f;
    public final k80 g;
    public final gb3_1 h;
    public rq2_0 i;
    public int j;
    public int k;
    public int l;
    public final fj1 m;
    public int[] n;
    public rr1_0 o;
    public boolean p;
    public boolean q;
    public final ArrayList r;
    public final fj1 s;
    public rq2_1 t;
    public Pi1 u;
    public boolean v;
    public final fj1 w;
    public boolean x;
    public int y;
    public int z;

    public j30_0(ru3 object, A30 object2, l73 l732, pr1$a_0 pr1$a_0, zr_1 zr_12, zr_1 zr_13, k80 k802) {
        boolean bl2;
        this.a = object;
        this.b = object2;
        this.c = l732;
        this.d = pr1$a_0;
        this.e = zr_12;
        this.f = zr_13;
        this.g = k802;
        this.h = object = new gb3_1();
        this.m = object = new fj1();
        object = new ArrayList();
        this.r = object;
        this.s = object = new fj1();
        this.t = object = qq2_0.g;
        this.w = object = new fj1();
        this.y = -1;
        boolean bl3 = ((A30)object2).f();
        boolean bl4 = true;
        zr_13 = null;
        if (!bl3 && !(bl3 = ((A30)object2).d())) {
            bl3 = false;
            object = null;
        } else {
            bl3 = true;
        }
        this.B = bl3;
        this.C = object = new k30_0(this);
        this.D = object = new gb3_1();
        object = l732.h();
        ((k73)object).c();
        this.F = object;
        object = new l73();
        boolean bl5 = ((A30)object2).f();
        if (bl5) {
            ((l73)object).g();
        }
        if (bl2 = ((A30)object2).d()) {
            ((l73)object).j = object2 = new tr1_1();
        }
        this.G = object;
        object = ((l73)object).i();
        ((q73)object).e(bl4);
        this.H = object;
        this.L = object = new d30_0(this, zr_12);
        object = this.G.h();
        try {
            object2 = ((k73)object).a(0);
            this.M = object2;
            this.N = object = new wo0_0();
            return;
        }
        finally {
            ((k73)object).c();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void M(j30_0 var0, tq1_0 var1_1, rq2_1 var2_3, Object var3_4) {
        block6: {
            block5: {
                var4_5 = 126665345;
                var0.z(var4_5, var1_1);
                var0.e0();
                var0.B0(var3_4);
                var5_6 = var0.P;
                try {
                    var0.P = var4_5;
                    var4_5 = (int)var0.O;
                    if (var4_5 == 0) break block5;
                    var6_7 = var0.H;
                    q73.u((q73)var6_7);
                }
                catch (Throwable var1_2) {
                    break block6;
                }
            }
            var4_5 = (int)var0.O;
            var7_8 = true;
            if (var4_5 != 0) ** GOTO lbl-1000
            var6_7 = var0.F;
            var4_5 = (int)Intrinsics.areEqual(var6_7 = var6_7.e(), var2_3);
            if (var4_5 == 0) {
                var4_5 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var4_5 = 0;
                var6_7 = null;
            }
            if (var4_5 != 0) {
                var0.k0(var2_3);
            }
            var8_9 = p30_0.c;
            var9_10 = 202;
            var0.q0(var8_9, var9_10, 0, var2_3);
            var0.J = null;
            var10_11 = var0.v;
            var0.v = var4_5;
            var6_7 = new n30_0((tq1_0)var1_1, var3_4);
            var11_12 = 316014703;
            var1_1 = new u10(var11_12, var6_7, var7_8);
            zn0_2.c(var0, (Function2)var1_1);
            var0.v = var10_11;
            var0.T(false);
            var0.J = null;
            var0.P = var5_6;
            var0.T(false);
            return;
        }
        var0.T(false);
        var0.J = null;
        var0.P = var5_6;
        var0.T(false);
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final int n0(j30_0 j30_02, int n3, boolean bl2, int n4) {
        int n7;
        int n8;
        Object object;
        Object object2 = j30_02;
        int n10 = n3;
        int n14 = n4;
        Object object3 = j30_02.F;
        int[] nArray = ((k73)object3).b;
        int n15 = n3 * 5;
        int n16 = n15 + 1;
        n16 = nArray[n16] & 0x8000000;
        int n17 = 0;
        int n18 = 1;
        if (n16 != 0) {
            n16 = 1;
        } else {
            n16 = 0;
            object = null;
        }
        d30_0 d30_02 = ((j30_0)object2).L;
        if (n16 != 0) {
            Object object4;
            n16 = nArray[n15];
            Object object5 = ((k73)object3).j(nArray, n10);
            int n19 = 126665345;
            A30 a30 = ((j30_0)object2).b;
            if (n16 == n19 && (n19 = object5 instanceof tq1_0) != 0) {
                int n20;
                String string2;
                Object object6;
                Object object7;
                Object object8 = object5;
                object8 = (tq1_0)object5;
                Object object9 = ((k73)object3).g(n10, 0);
                Ae ae2 = ((k73)object3).a(n10);
                int n21 = nArray[n15 += 3] + n10;
                Object object10 = ((j30_0)object2).r;
                object = new ArrayList();
                int n22 = p30_0.f(n10, (List)object10);
                if (n22 < 0) {
                    n22 = -(n22 + 1);
                }
                while (n22 < (n19 = ((ArrayList)object10).size())) {
                    object7 = (hk1)((ArrayList)object10).get(n22);
                    int n24 = ((hk1)object7).b;
                    if (n24 >= n21) break;
                    ((ArrayList)object).add(object7);
                    ++n22;
                }
                n15 = ((ArrayList)object).size();
                object3 = new ArrayList(n15);
                n15 = ((ArrayList)object).size();
                object5 = null;
                for (n22 = 0; n22 < n15; ++n22) {
                    object7 = (hk1)((ArrayList)object).get(n22);
                    object6 = ((hk1)object7).a;
                    object7 = ((hk1)object7).c;
                    Pair pair = new Pair(object6, object7);
                    ((ArrayList)object3).add(pair);
                }
                rq2_1 rq2_12 = j30_02.Q(n3);
                object = ((j30_0)object2).g;
                object5 = ((j30_0)object2).c;
                object6 = object10;
                object10 = new vQ1((tq1_0)object8, object9, (k80)object, (l73)object5, ae2, (List)object3, rq2_12);
                a30.b((vQ1)object10);
                d30_02.i();
                object3 = d30_02.b;
                object3.getClass();
                object = I92$v.c;
                object3 = ((zr_1)object3).a;
                ((R92)object3).X((I92)object);
                object2 = ((j30_0)object2).g;
                R92$b.b((R92)object3, 0, object2);
                R92$b.b((R92)object3, n18, a30);
                R92$b.b((R92)object3, 2, object10);
                int n25 = ((R92)object3).g;
                n15 = ((I92)object).a;
                n22 = R92.Q((R92)object3, n15);
                int n26 = ((I92)object).b;
                if (n25 == n22 && (n25 = ((R92)object3).h) == (n22 = R92.Q((R92)object3, n26))) {
                    if (!bl2) {
                        return n73.j(nArray, n10);
                    }
                    d30_02.g();
                    d30_02.f();
                    object2 = d30_02.a;
                    object3 = ((j30_0)object2).F.b;
                    n21 = (int)(n73.h((int[])object3, n10) ? 1 : 0);
                    if (n21 == 0) {
                        object2 = ((j30_0)object2).F.b;
                        n18 = n73.j((int[])object2, n10);
                    }
                    if (n18 <= 0) return n17;
                    d30_02.j(n14, n18);
                    return n17;
                }
                object2 = new StringBuilder();
                n10 = 0;
                CharSequence charSequence = null;
                n14 = 0;
                Object var32_48 = null;
                while (true) {
                    string2 = ", ";
                    if (n10 >= n15) break;
                    n20 = n18 << n10;
                    n22 = ((R92)object3).g;
                    if ((n20 &= n22) != 0) {
                        if (n14 > 0) {
                            ((StringBuilder)object2).append(string2);
                        }
                        String string3 = ((I92)object).b(n10);
                        ((StringBuilder)object2).append(string3);
                        ++n14;
                    }
                    ++n10;
                }
                object2 = ((StringBuilder)object2).toString();
                charSequence = "StringBuilder().apply(builderAction).toString()";
                object10 = g30.b((String)object2, (String)charSequence);
                n20 = 0;
                d30_02 = null;
                while (true) {
                    if (n17 >= n26) {
                        object3 = ((StringBuilder)object10).toString();
                        Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                        charSequence = new StringBuilder("Error while pushing ");
                        ((StringBuilder)charSequence).append(object);
                        ((StringBuilder)charSequence).append(". Not all arguments were provided. Missing ");
                        h30_0.b((StringBuilder)charSequence, n14, " int arguments (", (String)object2, ") and ");
                        i30_0.a((StringBuilder)charSequence, n20, " object arguments (", (String)object3, ").");
                        throw null;
                    }
                    n22 = n18 << n17;
                    n19 = ((R92)object3).h;
                    if ((n22 &= n19) != 0) {
                        if (n14 > 0) {
                            ((StringBuilder)object10).append(string2);
                        }
                        object5 = ((I92$v)object).c(n17);
                        ((StringBuilder)object10).append((String)object5);
                        ++n20;
                    }
                    ++n17;
                }
            }
            boolean bl3 = false;
            object2 = null;
            n14 = 206;
            if (n16 == n14 && (n14 = (int)(Intrinsics.areEqual(object5, object4 = p30_0.e) ? 1 : 0)) != 0) {
                Object object11;
                object4 = ((k73)object3).g(n10, 0);
                boolean bl4 = object4 instanceof j30$a;
                if (bl4) {
                    object11 = object4;
                    object11 = (j30$a)object4;
                } else {
                    boolean bl5 = false;
                    object11 = null;
                }
                if (object11 == null) return n73.j(nArray, n10);
                object2 = ((j30$a)object11).a.e.iterator();
                while ((n14 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object4 = (j30_0)object2.next();
                    ((j30_0)object4).m0();
                    object4 = ((j30_0)object4).g;
                    a30.o((k80)object4);
                }
                return n73.j(nArray, n10);
            }
            bl3 = n73.h(nArray, n10);
            if (bl3) return 1;
            return n73.j(nArray, n10);
        }
        n16 = (int)(n73.c(nArray, n10) ? 1 : 0);
        if (n16 != 0) {
            n15 += 3;
            n15 = nArray[n15] + n10;
            n8 = 0;
            Object var15_20 = null;
        } else {
            boolean bl6 = n73.h(nArray, n10);
            if (bl6) return 1;
            return n73.j(nArray, n10);
        }
        for (n16 = n10 + 1; n16 < n15; n16 += n7) {
            int n27;
            int n28;
            ArrayList arrayList;
            Object object12;
            n7 = n73.h(nArray, n16);
            if (n7 != 0) {
                d30_02.g();
                object12 = ((k73)object3).i(n16);
                d30_02.g();
                arrayList = d30_02.h.a;
                arrayList.add(object12);
            }
            if (n7 == 0 && !bl2) {
                n28 = 0;
                object12 = null;
            } else {
                n28 = 1;
            }
            if (n7 != 0) {
                n27 = 0;
                arrayList = null;
            } else {
                n27 = n14 + n8;
            }
            n28 = j30_0.n0((j30_0)object2, n16, n28 != 0, n27);
            n8 += n28;
            if (n7 != 0) {
                d30_02.g();
                d30_02.e();
            }
            n7 = n16 * 5 + 3;
            n7 = nArray[n7];
        }
        boolean bl7 = n73.h(nArray, n10);
        if (bl7) return 1;
        return n8;
    }

    public final void A() {
        this.q0(null, 125, 2, null);
        this.q = true;
    }

    public final void A0(int n3, int n4) {
        int n7 = this.C0(n3);
        if (n7 != n4) {
            int n8;
            n4 -= n7;
            gb3_1 gb3_12 = this.h;
            ArrayList arrayList = gb3_12.a;
            int n10 = arrayList.size() + -1;
            while (n3 != (n8 = -1)) {
                int n14 = this.C0(n3) + n4;
                this.z0(n3, n14);
                for (int i3 = n10; n8 < i3; i3 += -1) {
                    boolean bl2;
                    rq2_0 rq2_02 = (rq2_0)gb3_12.a.get(i3);
                    if (rq2_02 == null || !(bl2 = rq2_02.a(n3, n14))) continue;
                    n10 = i3 += -1;
                    break;
                }
                if (n3 < 0) {
                    k73 k732 = this.F;
                    n3 = k732.i;
                    continue;
                }
                int[] nArray = this.F.b;
                n8 = (int)(n73.h(nArray, n3) ? 1 : 0);
                if (n8 != 0) break;
                nArray = this.F.b;
                n3 = n73.l(nArray, n3);
            }
        }
    }

    public final void B(BF2 bF2) {
        int n3 = bF2 instanceof CF2;
        if ((bF2 = n3 != 0 ? (CF2)bF2 : null) != null) {
            ((CF2)bF2).a = n3 = ((CF2)bF2).a | 1;
        }
    }

    public final void B0(Object object) {
        int n3;
        int n4;
        int n7;
        int n8;
        String string2;
        int n10;
        i92$b_0 i92$b_0;
        int n14;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Object object2;
        int n15;
        Object object3;
        Object object4;
        Object object5;
        block29: {
            block27: {
                block28: {
                    int n16;
                    block26: {
                        object5 = this;
                        object4 = object;
                        n16 = this.O;
                        if (n16 == 0) break block26;
                        q73 q732 = this.H;
                        q732.O(object);
                        break block27;
                    }
                    object3 = this.F;
                    int n17 = ((k73)object3).n;
                    n15 = 1;
                    object2 = this.L;
                    string10 = ").";
                    string9 = " object arguments (";
                    string8 = ") and ";
                    string7 = " int arguments (";
                    string6 = ". Not all arguments were provided. Missing ";
                    string5 = "Error while pushing ";
                    string4 = "StringBuilder().apply(builderAction).toString()";
                    string3 = ", ";
                    n14 = 0;
                    if (n17 == 0) break block28;
                    n17 = ((k73)object3).l;
                    Object object6 = ((k73)object3).b;
                    n16 = ((k73)object3).i;
                    n16 = n73.m((int[])object6, n16);
                    n17 = n17 - n16 - n15;
                    object3 = ((d30_0)object2).a.F;
                    n16 = ((k73)object3).i;
                    int n18 = ((d30_0)object2).f;
                    if ((n16 -= n18) < 0) {
                        object3 = this.F;
                        n18 = ((k73)object3).i;
                        object3 = ((k73)object3).a(n18);
                        object6 = ((d30_0)object2).b;
                        object2 = I92$D.c;
                        object6 = ((zr_1)object6).a;
                        ((R92)object6).X((I92)object2);
                        R92$b.b((R92)object6, 0, object);
                        R92$b.b((R92)object6, n15, object3);
                        R92$b.a((R92)object6, 0, n17);
                        int n19 = ((R92)object6).g;
                        n16 = R92.Q((R92)object6, n15);
                        n17 = 2;
                        if (n19 != n16 || (n19 = ((R92)object6).h) != (n16 = R92.Q((R92)object6, n17))) {
                            CharSequence charSequence;
                            String string11;
                            int n20;
                            object4 = new StringBuilder();
                            object3 = null;
                            for (n16 = 0; n16 < n15; ++n16) {
                                n20 = n15 << n16;
                                n15 = ((R92)object6).g;
                                if ((n15 = n20 & n15) != 0) {
                                    if (n14 > 0) {
                                        ((StringBuilder)object4).append(string3);
                                    }
                                    string11 = ((I92$D)object2).b(n16);
                                    ((StringBuilder)object4).append(string11);
                                    ++n14;
                                }
                                n15 = 1;
                            }
                            object4 = ((StringBuilder)object4).toString();
                            object3 = g30.b((String)object4, string4);
                            int n21 = 0;
                            object5 = null;
                            string11 = null;
                            for (n15 = 0; n15 < n17; ++n15) {
                                int n22 = 1;
                                n20 = n22 << n15;
                                n17 = ((R92)object6).h;
                                if ((n17 = n20 & n17) != 0) {
                                    if (n14 > 0) {
                                        ((StringBuilder)object3).append(string3);
                                    }
                                    charSequence = ((I92$D)object2).c(n15);
                                    ((StringBuilder)object3).append((String)charSequence);
                                    ++n21;
                                }
                                n17 = 2;
                            }
                            object3 = ((StringBuilder)object3).toString();
                            Intrinsics.checkNotNullExpressionValue(object3, string4);
                            charSequence = new StringBuilder(string5);
                            charSequence.append(object2);
                            charSequence.append(string6);
                            h30_0.b(charSequence, n14, string7, (String)object4, string8);
                            i30_0.a(charSequence, n21, string9, (String)object3, string10);
                            throw null;
                        }
                    } else {
                        boolean bl2 = true;
                        ((d30_0)object2).h(bl2);
                        object5 = ((d30_0)object2).b;
                        object3 = I92$G.c;
                        object5 = ((zr_1)object5).a;
                        ((R92)object5).X((I92)object3);
                        object6 = null;
                        R92$b.b((R92)object5, 0, object);
                        R92$b.a((R92)object5, 0, n17);
                        int n24 = ((R92)object5).g;
                        n17 = 1;
                        n18 = R92.Q((R92)object5, n17);
                        if (n24 != n18 || (n24 = ((R92)object5).h) != (n18 = R92.Q((R92)object5, n17))) {
                            CharSequence charSequence;
                            int n25;
                            object4 = new StringBuilder();
                            object6 = null;
                            n15 = 0;
                            Object var22_29 = null;
                            for (n18 = 0; n18 < n17; ++n18) {
                                n25 = n17 << n18;
                                if ((n17 = ((R92)object5).g & n25) != 0) {
                                    if (n15 > 0) {
                                        ((StringBuilder)object4).append(string3);
                                    }
                                    charSequence = ((I92$G)object3).b(n18);
                                    ((StringBuilder)object4).append((String)charSequence);
                                    ++n15;
                                }
                                n17 = 1;
                            }
                            object4 = ((StringBuilder)object4).toString();
                            charSequence = g30.b((String)object4, string4);
                            n18 = 0;
                            object6 = null;
                            n25 = 1;
                            for (n14 = 0; n14 < n25; ++n14) {
                                int n26 = n25 << n14;
                                n25 = ((R92)object5).h;
                                if ((n25 = n26 & n25) != 0) {
                                    if (n15 > 0) {
                                        ((StringBuilder)charSequence).append(string3);
                                    }
                                    object2 = ((I92$G)object3).c(n14);
                                    ((StringBuilder)charSequence).append((String)object2);
                                    ++n18;
                                }
                                n25 = 1;
                            }
                            object5 = ((StringBuilder)charSequence).toString();
                            Intrinsics.checkNotNullExpressionValue(object5, string4);
                            charSequence = new StringBuilder(string5);
                            ((StringBuilder)charSequence).append(object3);
                            ((StringBuilder)charSequence).append(string6);
                            h30_0.b((StringBuilder)charSequence, n15, string7, (String)object4, string8);
                            i30_0.a((StringBuilder)charSequence, n18, string9, (String)object5, string10);
                            throw null;
                        }
                    }
                    break block27;
                }
                int n27 = ((k73)object3).i;
                object5 = ((k73)object3).a(n27);
                object3 = ((d30_0)object2).b;
                object3.getClass();
                i92$b_0 = i92$b_0.c;
                object3 = ((zr_1)object3).a;
                ((R92)object3).X(i92$b_0);
                n10 = 0;
                string2 = null;
                R92$b.b((R92)object3, 0, object5);
                R92$b.b((R92)object3, 1, object);
                n27 = ((R92)object3).g;
                n8 = i92$b_0.a;
                n15 = R92.Q((R92)object3, n8);
                n7 = i92$b_0.b;
                if (n27 != n15 || (n27 = ((R92)object3).h) != (n15 = R92.Q((R92)object3, n7))) break block29;
            }
            return;
        }
        object5 = new StringBuilder();
        Object var22_30 = null;
        n14 = 0;
        for (n15 = 0; n15 < n8; ++n15) {
            n4 = 1;
            n3 = n4 << n15;
            n10 = ((R92)object3).g;
            if ((n10 = n3 & n10) != 0) {
                if (n14 > 0) {
                    ((StringBuilder)object5).append(string3);
                }
                string2 = i92$b_0.b(n15);
                ((StringBuilder)object5).append(string2);
                ++n14;
            }
            n10 = 0;
            string2 = null;
        }
        object5 = ((StringBuilder)object5).toString();
        object4 = g30.b((String)object5, string4);
        string2 = null;
        n15 = 0;
        var22_30 = null;
        for (n10 = 0; n10 < n7; ++n10) {
            n4 = 1;
            n3 = n4 << n10;
            int n28 = n7;
            n7 = ((R92)object3).h;
            if ((n7 = n3 & n7) != 0) {
                if (n14 > 0) {
                    ((StringBuilder)object4).append(string3);
                }
                object2 = i92$b_0.c(n10);
                ((StringBuilder)object4).append((String)object2);
                ++n15;
            }
            n7 = n28;
        }
        object4 = ((StringBuilder)object4).toString();
        Intrinsics.checkNotNullExpressionValue(object4, string4);
        object3 = new StringBuilder(string5);
        ((StringBuilder)object3).append(i92$b_0);
        ((StringBuilder)object3).append(string6);
        h30_0.b((StringBuilder)object3, n14, string7, (String)object5, string8);
        i30_0.a((StringBuilder)object3, n15, string9, (String)object4, string10);
        throw null;
    }

    public final void C(Function0 function0) {
        Object object = this;
        boolean bl2 = this.q;
        if (bl2) {
            bl2 = false;
            String string2 = null;
            this.q = false;
            int n3 = this.O;
            if (n3 != 0) {
                Object object2 = this.m;
                Object object3 = ((fj1)object2).a;
                n3 = ((fj1)object2).b;
                int n4 = 1;
                n3 -= n4;
                n3 = object3[n3];
                object3 = this.H;
                int n7 = ((q73)object3).v;
                object3 = ((q73)object3).b(n7);
                this.k = n7 = this.k + n4;
                wo0_0 wo0_02 = this.N;
                I92$n i92$n = I92$n.c;
                R92 r92 = wo0_02.a;
                r92.X(i92$n);
                Object object4 = function0;
                R92$b.b(r92, 0, function0);
                R92$b.a(r92, 0, n3);
                R92$b.b(r92, n4, object3);
                int n8 = r92.g;
                int n10 = R92.Q(r92, n4);
                int n14 = 2;
                if (n8 == n10 && (n8 = r92.h) == (n10 = R92.Q(r92, n14))) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object4 = null;
                }
                String string3 = ").";
                String string4 = " object arguments (";
                String string5 = ") and ";
                String string6 = " int arguments (";
                String string7 = ". Not all arguments were provided. Missing ";
                string2 = "Error while pushing ";
                CharSequence charSequence = "StringBuilder().apply(builderAction).toString()";
                String string8 = ", ";
                if (n8 == 0) {
                    String string9;
                    object2 = new StringBuilder();
                    object3 = null;
                    n7 = 0;
                    wo0_02 = null;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        n8 = n4 << i3;
                        if ((n4 = r92.g & n8) != 0) {
                            if (n7 > 0) {
                                ((StringBuilder)object2).append(string8);
                            }
                            string9 = i92$n.b(i3);
                            ((StringBuilder)object2).append(string9);
                            ++n7;
                        }
                        n4 = 1;
                    }
                    object2 = ((StringBuilder)object2).toString();
                    object3 = g30.b((String)object2, (String)charSequence);
                    int n15 = 2;
                    string9 = null;
                    n8 = 0;
                    object4 = null;
                    for (n4 = 0; n4 < n15; ++n4) {
                        int n16 = 1;
                        int n17 = n16 << n4;
                        n15 = r92.h;
                        if ((n15 = n17 & n15) != 0) {
                            if (n7 > 0) {
                                ((StringBuilder)object3).append(string8);
                            }
                            object = i92$n.c(n4);
                            ((StringBuilder)object3).append((String)object);
                            ++n8;
                        }
                        n15 = 2;
                    }
                    object = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append(i92$n);
                    ((StringBuilder)charSequence).append(string7);
                    h30_0.b((StringBuilder)charSequence, n7, string6, (String)object2, string5);
                    i30_0.a((StringBuilder)charSequence, n8, string4, (String)object, string3);
                    throw null;
                }
                object = I92$u.c;
                R92 r922 = wo0_02.b;
                r922.X((I92)object);
                n7 = 0;
                wo0_02 = null;
                R92$b.a(r922, 0, n3);
                R92$b.b(r922, 0, object3);
                n3 = r922.g;
                int n18 = 1;
                int n19 = R92.Q(r922, n18);
                if (n3 == n19 && (n3 = r922.h) == (n19 = R92.Q(r922, n18))) {
                    return;
                }
                object2 = new StringBuilder();
                i92$n = null;
                int n20 = 0;
                r92 = null;
                for (n19 = 0; n19 < n18; ++n19) {
                    n8 = n18 << n19;
                    if ((n18 = r922.g & n8) != 0) {
                        if (n20 > 0) {
                            ((StringBuilder)object2).append(string8);
                        }
                        object3 = ((I92$u)object).b(n19);
                        ((StringBuilder)object2).append((String)object3);
                        ++n20;
                    }
                    n18 = 1;
                }
                object2 = ((StringBuilder)object2).toString();
                object3 = g30.b((String)object2, (String)charSequence);
                n19 = 0;
                i92$n = null;
                while (n7 < (n8 = 1)) {
                    int n21 = n8 << n7;
                    n8 = r922.h;
                    if ((n8 = n21 & n8) != 0) {
                        if (n20 > 0) {
                            ((StringBuilder)object3).append(string8);
                        }
                        object4 = ((I92$u)object).c(n7);
                        ((StringBuilder)object3).append((String)object4);
                        ++n19;
                    }
                    ++n7;
                }
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(object);
                ((StringBuilder)charSequence).append(string7);
                h30_0.b((StringBuilder)charSequence, n20, string6, (String)object2, string5);
                i30_0.a((StringBuilder)charSequence, n19, string4, (String)object3, string3);
                throw null;
            }
            p30_0.c("createNode() can only be called when inserting");
            throw null;
        }
        p30_0.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw null;
    }

    public final int C0(int n3) {
        int n4;
        if (n3 < 0) {
            int n7;
            rr1_0 rr1_02 = this.o;
            int n8 = 0;
            if (rr1_02 != null && (n7 = rr1_02.a(n3)) >= 0) {
                n8 = rr1_02.b(n3);
            }
            return n8;
        }
        int[] nArray = this.n;
        if (nArray != null && (n4 = nArray[n3]) >= 0) {
            return n4;
        }
        return n73.j(this.F.b, n3);
    }

    public final void D() {
        int n3 = this.k;
        if (n3 == 0) {
            Object object = this.b0();
            if (object != null) {
                int n4;
                ((CF2)object).a = n4 = ((CF2)object).a | 0x10;
            }
            if ((n3 = (int)(((ArrayList)(object = this.r)).isEmpty() ? 1 : 0)) != 0) {
                this.p0();
            } else {
                this.i0();
            }
            return;
        }
        p30_0.c("No nodes can be emitted before calling skipAndEndGroup");
        throw null;
    }

    public final void D0() {
        boolean bl2 = this.q ^ true;
        if (bl2) {
            return;
        }
        p30_0.c("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final void E() {
        this.T(false);
    }

    public final int F() {
        return this.P;
    }

    public final j30$b G() {
        Object object;
        Object object2 = p30_0.e;
        int n3 = 206;
        this.s0(n3, (F92)object2);
        boolean bl2 = this.O;
        if (bl2) {
            object2 = this.H;
            q73.u((q73)object2);
        }
        object2 = this.e0();
        n3 = object2 instanceof j30$a;
        P30 p30 = null;
        if (n3 != 0) {
            object2 = (j30$a)object2;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null) {
            int n4 = this.P;
            boolean bl3 = this.p;
            boolean bl4 = this.B;
            Object object3 = this.g;
            boolean bl5 = object3 instanceof F30;
            object3 = bl5 ? (F30)object3 : null;
            if (object3 != null) {
                p30 = ((F30)object3).r;
            }
            object3 = object;
            object = new j30$b(this, n4, bl3, bl4, p30);
            object2 = new j30$a((j30$b)object);
            this.B0(object2);
        }
        object = this.P();
        object2 = ((j30$a)object2).a;
        ((j30$b)object2).f.setValue(object);
        this.T(false);
        return object2;
    }

    public final void H() {
        this.T(false);
    }

    public final void I() {
        this.T(false);
    }

    public final boolean J(Object object) {
        boolean bl2;
        Object object2 = this.e0();
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            this.B0(object);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void K(int n3) {
        Ae ae2;
        Object object;
        int n4;
        Object object2 = this.i;
        if (object2 != null) {
            this.q0(null, n3, 0, null);
            return;
        }
        this.D0();
        int n7 = this.l;
        int n8 = this.P;
        int n10 = 3;
        n8 = Integer.rotateLeft(Integer.rotateLeft(n8, n10) ^ n3, n10);
        this.P = n7 ^= n8;
        n7 = this.l;
        n8 = 1;
        this.l = n7 += n8;
        object2 = this.F;
        n10 = (int)(this.O ? 1 : 0);
        b30$a$a b30$a$a = b30$a.a;
        if (n10 != 0) {
            ((k73)object2).k = n10 = ((k73)object2).k + n8;
            this.H.M(b30$a$a, n3, b30$a$a, false);
            this.Z(false, null);
            return;
        }
        n10 = ((k73)object2).f();
        if (n10 == n3 && ((n10 = ((k73)object2).g) >= (n4 = ((k73)object2).h) || (n10 = (int)(n73.g(object = ((k73)object2).b, n10) ? 1 : 0)) == 0)) {
            ((k73)object2).n();
            this.Z(false, null);
            return;
        }
        n10 = ((k73)object2).k;
        if (n10 <= 0 && (n10 = ((k73)object2).g) != (n4 = ((k73)object2).h)) {
            n4 = this.j;
            this.j0();
            int n14 = ((k73)object2).l();
            d30_0 d30_02 = this.L;
            d30_02.j(n4, n14);
            object = this.r;
            n14 = ((k73)object2).g;
            p30_0.a(n10, n14, (List)object);
        }
        ((k73)object2).k = n10 = ((k73)object2).k + n8;
        this.O = n8;
        this.J = null;
        object2 = this.H;
        n7 = (int)(((q73)object2).w ? 1 : 0);
        if (n7 != 0) {
            this.H = object2 = this.G.i();
            ((q73)object2).H();
            this.I = false;
            this.J = null;
        }
        object2 = this.H;
        ((q73)object2).d();
        n8 = ((q73)object2).t;
        ((q73)object2).M(b30$a$a, n3, b30$a$a, false);
        this.M = ae2 = ((q73)object2).b(n8);
        this.Z(false, null);
    }

    public final void L() {
        int n3;
        this.N();
        this.h.a.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        Object object = this.N;
        R92 r92 = ((wo0_0)object).b;
        r92.R();
        ((wo0_0)object).a.R();
        this.P = 0;
        this.z = 0;
        this.q = false;
        this.O = false;
        this.x = false;
        this.E = false;
        this.y = n3 = -1;
        object = this.F;
        boolean bl2 = ((k73)object).f;
        if (!bl2) {
            ((k73)object).c();
        }
        object = this.H;
        n3 = (int)(((q73)object).w ? 1 : 0);
        if (n3 == 0) {
            this.a0();
        }
    }

    public final void N() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.P = 0;
        this.q = false;
        d30_0 d30_02 = this.L;
        d30_02.c = false;
        d30_02.d.b = 0;
        d30_02.f = 0;
        this.D.a.clear();
        this.n = null;
        this.o = null;
    }

    public final int O(int n3, int n4, int n7, int n8) {
        if (n3 != n7) {
            int n10;
            Object object = this.F;
            int[] nArray = ((k73)object).b;
            int n14 = n73.g(nArray, n3);
            int n15 = 126665345;
            Object object2 = ((k73)object).b;
            if (n14 != 0) {
                if ((object = ((k73)object).j((int[])object2, n3)) != null) {
                    n14 = object instanceof Enum;
                    if (n14 != 0) {
                        object = (Enum)object;
                        n10 = ((Enum)object).ordinal();
                    } else {
                        n14 = object instanceof tq1_0;
                        n10 = n14 != 0 ? 126665345 : object.hashCode();
                    }
                } else {
                    n10 = 0;
                    object = null;
                }
            } else {
                boolean bl2;
                n14 = n3 * 5;
                int n16 = 207;
                if ((n14 = object2[n14]) == n16 && (object = ((k73)object).b((int[])object2, n3)) != null && !(bl2 = Intrinsics.areEqual(object, object2 = (Object)b30$a.a))) {
                    n14 = object.hashCode();
                }
                n10 = n14;
            }
            if (n10 == n15) {
                n8 = n10;
            } else {
                nArray = this.F.b;
                n14 = n73.l(nArray, n3);
                if (n14 != n7) {
                    n15 = this.f0(n14);
                    n8 = this.O(n14, n15, n7, n8);
                }
                int[] nArray2 = this.F.b;
                n3 = (int)(n73.g(nArray2, n3) ? 1 : 0);
                if (n3 != 0) {
                    n4 = 0;
                }
                n3 = 3;
                n7 = Integer.rotateLeft(n8, n3) ^ n10;
                n8 = n3 = Integer.rotateLeft(n7, n3) ^ n4;
            }
        }
        return n8;
    }

    public final rq2_1 P() {
        rq2_1 rq2_12 = this.J;
        if (rq2_12 != null) {
            return rq2_12;
        }
        int n3 = this.F.i;
        return this.Q(n3);
    }

    public final rq2_1 Q(int n3) {
        rq2_1 rq2_12;
        int n4;
        int[] nArray;
        Object object;
        int n7 = this.O;
        Object[] objectArray = p30_0.c;
        String string2 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap";
        int n8 = 202;
        if (n7 != 0 && (n7 = this.I) != 0) {
            object = this.H;
            n7 = ((q73)object).v;
            while (n7 > 0) {
                Object object2 = this.H;
                nArray = object2.b;
                n4 = object2.p(n7) * 5;
                if ((n4 = nArray[n4]) == n8) {
                    Object[] objectArray2 = object2.b;
                    object2 = this.H;
                    int n10 = object2.p(n7);
                    boolean bl2 = n73.g(objectArray2, n10);
                    if (bl2) {
                        objectArray2 = object2.c;
                        n4 = n73.k(object2.b, n10);
                        object2 = objectArray2[n4];
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    n4 = (int)(Intrinsics.areEqual(object2, objectArray) ? 1 : 0);
                    if (n4 != 0) {
                        Object object3;
                        objectArray = ((q73)object3).b;
                        object3 = this.H;
                        boolean bl3 = n73.f((int[])objectArray, n7 = ((q73)object3).p(n7));
                        if (bl3) {
                            objectArray = ((q73)object3).c;
                            int[] nArray2 = ((q73)object3).b;
                            n3 = ((q73)object3).f(nArray2, n7);
                            n7 = n7 * 5 + 1;
                            n7 = n73.p(nArray2[n7] >> 29) + n3;
                            object3 = objectArray[n7];
                        } else {
                            object3 = b30$a.a;
                        }
                        Intrinsics.checkNotNull(object3, string2);
                        this.J = object3 = (rq2_1)object3;
                        return object3;
                    }
                }
                object2 = this.H;
                nArray = object2.b;
                n7 = object2.A(nArray, n7);
            }
        }
        object = this.F;
        n7 = ((k73)object).c;
        if (n7 > 0) {
            while (n3 > 0) {
                object = this.F;
                n4 = n3 * 5;
                nArray = ((k73)object).b;
                if ((n4 = nArray[n4]) == n8 && (n7 = (int)(Intrinsics.areEqual(object = ((k73)object).j(nArray, n3), objectArray) ? 1 : 0)) != 0) {
                    object = this.u;
                    if (object == null || (object = (rq2_1)((Pi1)object).a.get(n3)) == null) {
                        object = this.F;
                        objectArray = ((k73)object).b;
                        Object object4 = ((k73)object).b((int[])objectArray, n3);
                        Intrinsics.checkNotNull(object4, string2);
                        object = object4;
                        object = (rq2_1)object4;
                    }
                    this.J = object;
                    return object;
                }
                object = this.F.b;
                n3 = n73.l((int[])object, n3);
            }
        }
        this.J = rq2_12 = this.t;
        return rq2_12;
    }

    /*
     * Exception decompiling
     */
    public final void R(vt2_0 var1_1, u10 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [22 : 430->433)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void S(int n3, int n4) {
        if (n3 > 0 && n3 != n4) {
            int[] nArray = this.F.b;
            int n7 = n73.l(nArray, n3);
            this.S(n7, n4);
            Object object = this.F.b;
            n4 = (int)(n73.h((int[])object, n3) ? 1 : 0);
            if (n4 != 0) {
                Object object2 = this.F.i(n3);
                object = this.L;
                ((d30_0)object).g();
                object = ((d30_0)object).h.a;
                ((ArrayList)object).add(object2);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void T(boolean bl2) {
        void var2_17;
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7;
        int n8;
        Object object3;
        Object object4;
        int n10;
        String string2;
        Object object5;
        Object object6;
        int n14;
        Object object7;
        Object[] objectArray;
        fj1 fj12;
        int n15;
        Object[] objectArray2;
        Object object8;
        int n16;
        int n17;
        int n18;
        Object object9;
        int n19;
        Object object10;
        Object[] objectArray3;
        int n20;
        int n21;
        int n22;
        int n24;
        Object object11;
        block87: {
            void var24_132;
            int n25;
            block86: {
                fj1 fj13;
                j30_0 j30_02;
                block81: {
                    int n26;
                    block85: {
                        block83: {
                            block84: {
                                block78: {
                                    block82: {
                                        block79: {
                                            block80: {
                                                j30_02 = this;
                                                fj13 = this.m;
                                                object11 = fj13.a;
                                                n24 = fj13.b;
                                                n22 = 2;
                                                n21 = object11[n24 -= n22];
                                                n24 = 1;
                                                n21 -= n24;
                                                n20 = this.O;
                                                objectArray3 = b30$a.a;
                                                n26 = 3;
                                                n25 = 207;
                                                if (n20 == 0) break block78;
                                                object10 = this.H;
                                                n19 = ((q73)object10).v;
                                                object9 = ((q73)object10).b;
                                                n20 = ((q73)object10).p(n19) * 5;
                                                n20 = object9[n20];
                                                int[] nArray = ((q73)object9).b;
                                                object9 = this.H;
                                                n18 = ((q73)object9).p(n19);
                                                n17 = n73.g(nArray, n18);
                                                if (n17 != 0) {
                                                    Object[] objectArray4 = ((q73)object9).c;
                                                    n16 = n73.k(((q73)object9).b, n18);
                                                    object9 = objectArray4[n16];
                                                } else {
                                                    n16 = 0;
                                                    object9 = null;
                                                }
                                                object8 = j30_02.H;
                                                n19 = ((q73)object8).p(n19);
                                                int[] nArray2 = ((q73)object8).b;
                                                n17 = n73.f(nArray2, n19);
                                                if (n17 != 0) {
                                                    Object[] objectArray5 = ((q73)object8).c;
                                                    int[] nArray3 = ((q73)object8).b;
                                                    n18 = ((q73)object8).f(nArray3, n19);
                                                    n19 = n19 * 5 + n24;
                                                    n19 = n73.p(nArray3[n19] >> 29) + n18;
                                                    objectArray2 = objectArray5[n19];
                                                } else {
                                                    objectArray2 = objectArray3;
                                                }
                                                if (object9 != null) break block79;
                                                if (objectArray2 == null || n20 != n25 || (n15 = (int)(Intrinsics.areEqual(objectArray2, objectArray3) ? 1 : 0)) != 0) break block80;
                                                n20 = objectArray2.hashCode();
                                                n15 = j30_02.P;
                                                j30_02.P = n21 = Integer.rotateRight(Integer.rotateRight(n21 ^ n15, n26) ^ n20, n26);
                                                break block81;
                                            }
                                            n15 = j30_02.P;
                                            n21 = Integer.rotateRight(n21 ^ n15, n26) ^ n20;
                                            break block82;
                                        }
                                        n21 = object9 instanceof Enum;
                                        if (n21 != 0) {
                                            object9 = (Enum)object9;
                                            n21 = ((Enum)object9).ordinal();
                                        } else {
                                            n21 = object9.hashCode();
                                        }
                                        n20 = Integer.rotateRight(j30_02.P, n26);
                                        n21 ^= n20;
                                    }
                                    j30_02.P = n21 = Integer.rotateRight(n21, n26);
                                    break block81;
                                }
                                object10 = this.F;
                                n19 = ((k73)object10).i;
                                n16 = n19 * 5;
                                object8 = ((k73)object10).b;
                                n16 = object8[n16];
                                object10 = ((k73)object10).j((int[])object8, n19);
                                object8 = this.F;
                                int[] nArray = ((k73)object8).b;
                                objectArray2 = ((k73)object8).b(nArray, n19);
                                if (object10 != null) break block83;
                                if (objectArray2 == null || n16 != n25 || (n20 = (int)(Intrinsics.areEqual(objectArray2, objectArray3) ? 1 : 0)) != 0) break block84;
                                n20 = objectArray2.hashCode();
                                n15 = this.P;
                                this.P = n21 = Integer.rotateRight(Integer.rotateRight(n21 ^ n15, n26) ^ n20, n26);
                                break block81;
                            }
                            n20 = j30_02.P;
                            n21 = Integer.rotateRight(n21 ^ n20, n26) ^ n16;
                            break block85;
                        }
                        n21 = object10 instanceof Enum;
                        if (n21 != 0) {
                            object10 = (Enum)object10;
                            n21 = ((Enum)object10).ordinal();
                        } else {
                            n21 = object10.hashCode();
                        }
                        n20 = Integer.rotateRight(j30_02.P, n26);
                        n21 ^= n20;
                    }
                    j30_02.P = n21 = Integer.rotateRight(n21, n26);
                }
                n21 = j30_02.k;
                object10 = j30_02.i;
                objectArray3 = j30_02.r;
                objectArray2 = j30_02.L;
                if (object10 != null && (n18 = (object9 = ((rq2_0)object10).a).size()) > 0) break block86;
                fj12 = fj13;
                objectArray = objectArray3;
                object7 = objectArray2;
                break block87;
            }
            object8 = ((rq2_0)object10).d;
            n14 = ((ArrayList)object8).size();
            HashSet<Object> hashSet = new HashSet<Object>(n14);
            n14 = object8.size();
            boolean bl3 = false;
            object6 = null;
            while (var24_132 < n14) {
                object5 = object8.get((int)var24_132);
                hashSet.add(object5);
                ++var24_132;
                n24 = 1;
            }
            object5 = new LinkedHashSet();
            n14 = ((ArrayList)object8).size();
            int n27 = object9.size();
            n22 = 0;
            object7 = null;
            boolean bl4 = false;
            string2 = null;
            n10 = 0;
            object4 = null;
            while (true) {
                Object object12;
                Object[] objectArray6;
                do1_0 do1_02;
                int n28;
                Object object13;
                void var10_70;
                tr1_1 tr1_12;
                void var34_160;
                int n29;
                block76: {
                    Object object14;
                    long l2;
                    void var56_178;
                    long l3;
                    Object object15;
                    void var47_172;
                    long l4;
                    block102: {
                        block101: {
                            void var3_29;
                            block88: {
                                block92: {
                                    block93: {
                                        do1_0 do1_03;
                                        block94: {
                                            block95: {
                                                block100: {
                                                    block99: {
                                                        block96: {
                                                            block98: {
                                                                block97: {
                                                                    block91: {
                                                                        block90: {
                                                                            block89: {
                                                                                void var2_3;
                                                                                void var16_89;
                                                                                if (n10 >= n29) break block88;
                                                                                fj12 = object9.get(n10);
                                                                                object3 = fj12;
                                                                                object3 = (do1_0)((Object)fj12);
                                                                                boolean bl5 = var16_89.contains(object3);
                                                                                var34_160 = var16_89;
                                                                                tr1_12 = ((rq2_0)object10).e;
                                                                                n8 = n29;
                                                                                n29 = ((rq2_0)object10).b;
                                                                                if (bl5) break block89;
                                                                                fj12 = var3_29;
                                                                                n7 = ((do1_0)object3).c;
                                                                                O11 o11 = (O11)tr1_12.c(n7);
                                                                                n7 = o11 != null ? o11.b : -1;
                                                                                n17 = ((do1_0)object3).d;
                                                                                objectArray2.j(n7 += n29, n17);
                                                                                n7 = ((do1_0)object3).c;
                                                                                ((rq2_0)object10).a(n7, 0);
                                                                                n25 = objectArray2.f;
                                                                                k73 k732 = objectArray2.a.F;
                                                                                n17 = k732.g;
                                                                                objectArray2.f = n17 = n7 - n17 + n25;
                                                                                var2_3.F.k(n7);
                                                                                this.j0();
                                                                                var2_3.F.l();
                                                                                object3 = var2_3.F.b;
                                                                                n25 = n73.e((int[])object3, n7) + n7;
                                                                                p30_0.a(n7, n25, (List)objectArray3);
                                                                                break block90;
                                                                            }
                                                                            fj12 = var3_29;
                                                                            n7 = (int)(object5.contains(object3) ? 1 : 0);
                                                                            if (n7 == 0) break block91;
                                                                        }
                                                                        ++n10;
                                                                        break block92;
                                                                    }
                                                                    if (var10_70 >= n14) break block93;
                                                                    do1_03 = (do1_0)((ArrayList)object8).get((int)var10_70);
                                                                    if (do1_03 == object3) break block94;
                                                                    n25 = do1_03.c;
                                                                    object3 = (O11)tr1_12.c(n25);
                                                                    n25 = object3 != null ? ((O11)object3).b : -1;
                                                                    object5.add(do1_03);
                                                                    if (n25 == n22) break block95;
                                                                    object2 = object5;
                                                                    n24 = do1_03.c;
                                                                    object5 = (O11)tr1_12.c(n24);
                                                                    n24 = object5 != null ? ((O11)object5).c : do1_03.d;
                                                                    object = object10;
                                                                    n20 = n25 + n29;
                                                                    n29 += n22;
                                                                    if (n24 <= 0) break block96;
                                                                    object13 = object8;
                                                                    n18 = objectArray2.l;
                                                                    if (n18 <= 0) break block97;
                                                                    n28 = n14;
                                                                    n14 = objectArray2.j;
                                                                    objectArray = objectArray3;
                                                                    n15 = n20 - n18;
                                                                    if (n14 != n15 || (n15 = objectArray2.k) != (n14 = n29 - n18)) break block98;
                                                                    objectArray2.l = n18 += n24;
                                                                    break block99;
                                                                }
                                                                objectArray = objectArray3;
                                                                n28 = n14;
                                                            }
                                                            objectArray2.g();
                                                            objectArray2.j = n20;
                                                            objectArray2.k = n29;
                                                            objectArray2.l = n24;
                                                            break block99;
                                                        }
                                                        objectArray = objectArray3;
                                                        object13 = object8;
                                                        n28 = n14;
                                                        objectArray2.getClass();
                                                    }
                                                    n18 = 7;
                                                    l4 = -9187201950435737472L;
                                                    if (n25 <= n22) break block100;
                                                    objectArray3 = tr1_12.c;
                                                    long[] lArray = tr1_12.a;
                                                    n29 = lArray.length;
                                                    n4 = 2;
                                                    if ((n29 += -2) >= 0) break block101;
                                                    do1_02 = do1_03;
                                                    objectArray6 = objectArray2;
                                                    object12 = object9;
                                                    break block76;
                                                }
                                                do1_02 = do1_03;
                                                objectArray6 = objectArray2;
                                                object12 = object9;
                                                if (n22 <= n25) break block76;
                                                Object[] objectArray7 = tr1_12.c;
                                                long[] lArray = tr1_12.a;
                                                n20 = lArray.length;
                                                n15 = 2;
                                                if ((n20 -= n15) < 0) break block76;
                                                break block102;
                                            }
                                            do1_02 = do1_03;
                                            object2 = object5;
                                            object = object10;
                                            objectArray = objectArray3;
                                            objectArray6 = objectArray2;
                                            object12 = object9;
                                            object13 = object8;
                                            n28 = n14;
                                            break block76;
                                        }
                                        do1_02 = do1_03;
                                        object2 = object5;
                                        object = object10;
                                        objectArray = objectArray3;
                                        objectArray6 = objectArray2;
                                        object12 = object9;
                                        object13 = object8;
                                        n28 = n14;
                                        ++n10;
                                        break block76;
                                    }
                                    j30_0 j30_03 = this;
                                }
                                fj1 fj14 = fj12;
                                void var16_93 = var34_160;
                                n29 = n8;
                                continue;
                            }
                            fj12 = var3_29;
                            objectArray = objectArray3;
                            objectArray6 = objectArray2;
                            object12 = object9;
                            objectArray2.g();
                            n3 = object9.size();
                            if (n3 > 0) {
                                j30_0 j30_04 = this;
                                k73 k733 = this.F;
                                n24 = k733.h;
                                object7 = objectArray2;
                                n20 = objectArray2.f;
                                objectArray3 = objectArray2.a.F;
                                n15 = objectArray3.g;
                                objectArray2.f = n24 = n24 - n15 + n20;
                                k733.m();
                                break;
                            } else {
                                j30_0 j30_05 = this;
                                object7 = objectArray2;
                                break;
                            }
                        }
                        objectArray6 = objectArray2;
                        object12 = object9;
                        n20 = 0;
                        object10 = null;
                        while (true) {
                            block104: {
                                void var20_115;
                                block103: {
                                    void var3_34;
                                    void var20_114;
                                    var47_172 = var20_114[n20];
                                    do1_02 = var3_34;
                                    void var50_174 = (var47_172 ^ (long)-1) << n18 & var47_172 & l4;
                                    void cfr_temp_0 = var50_174 - l4;
                                    object15 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    if (object15 != 0) break block103;
                                    Object[] objectArray8 = objectArray3;
                                    void var62_204 = var20_114;
                                    break block104;
                                }
                                n3 = ~(n20 - n29) >>> 31;
                                n3 = 8 - n3;
                                Object var3_35 = null;
                                for (n7 = 0; n7 < n3; var47_172 >>= n15, ++n7) {
                                    void var62_201;
                                    void var61_185;
                                    block106: {
                                        block105: {
                                            Object object16;
                                            l3 = 255L;
                                            var56_178 = var47_172 & l3;
                                            l2 = 128L;
                                            void cfr_temp_1 = var56_178 - l2;
                                            object14 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                            if (object14 >= 0) break block105;
                                            object15 = (n20 << 3) + n7;
                                            object8 = object16 = objectArray3[object15];
                                            object8 = (O11)object16;
                                            Object[] objectArray9 = objectArray3;
                                            n15 = ((O11)object8).b;
                                            void var62_200 = var20_115;
                                            if (n25 <= n15 && n15 < (n14 = n25 + n24)) {
                                                ((O11)object8).b = n15 = n15 - n25 + n22;
                                                break block106;
                                            } else if (n22 <= n15 && n15 < n25) {
                                                ((O11)object8).b = n15 += n24;
                                            }
                                            break block106;
                                        }
                                        Object[] objectArray10 = objectArray3;
                                        void var62_202 = var20_115;
                                    }
                                    n15 = 8;
                                    objectArray3 = var61_185;
                                    void var20_116 = var62_201;
                                    n18 = 7;
                                }
                                Object[] objectArray11 = objectArray3;
                                void var62_203 = var20_115;
                                n15 = 8;
                                if (n3 != n15) break block76;
                            }
                            if (n20 != n29) {
                                void var62_205;
                                void var61_189;
                                ++n20;
                                j30_0 j30_06 = this;
                                do1_0 do1_04 = do1_02;
                                objectArray3 = var61_189;
                                void var20_117 = var62_205;
                                n18 = 7;
                                continue;
                            }
                            break block76;
                            break;
                        }
                    }
                    n15 = 0;
                    objectArray3 = null;
                    while (true) {
                        void var62_212;
                        void var61_197;
                        block108: {
                            void var3_40;
                            void var2_8;
                            block107: {
                                void var2_7;
                                void var3_39;
                                var47_172 = var3_39[n15];
                                void var63_213 = var47_172 ^ (long)-1;
                                n18 = 7;
                                void cfr_temp_2 = (var63_213 = var63_213 << n18 & var47_172 & l4) - l4;
                                object15 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                if (object15 != 0) break block107;
                                void var61_196 = var2_7;
                                void var62_211 = var3_39;
                                n3 = 8;
                                l2 = 128L;
                                l3 = 255L;
                                break block108;
                            }
                            n14 = ~(n15 - n20) >>> 31;
                            n14 = 8 - n14;
                            object6 = null;
                            for (n29 = 0; n29 < n14; var47_172 >>= n3, ++n29) {
                                void var62_208;
                                void var61_193;
                                block110: {
                                    block109: {
                                        l3 = 255L;
                                        var56_178 = var47_172 & l3;
                                        l2 = 128L;
                                        void cfr_temp_3 = var56_178 - l2;
                                        object14 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                        if (object14 >= 0) break block109;
                                        object15 = (n15 << 3) + n29;
                                        void var61_191 = var2_8[object15];
                                        object8 = var61_191;
                                        object8 = (O11)var61_191;
                                        void var61_192 = var2_8;
                                        n3 = ((O11)object8).b;
                                        void var62_207 = var3_40;
                                        if (n25 <= n3 && n3 < (n7 = n25 + n24)) {
                                            ((O11)object8).b = n3 = n3 - n25 + n22;
                                            break block110;
                                        } else {
                                            n7 = n25 + 1;
                                            if (n7 <= n3 && n3 < n22) {
                                                ((O11)object8).b = n3 -= n24;
                                            }
                                        }
                                        break block110;
                                    }
                                    void var61_194 = var2_8;
                                    void var62_209 = var3_40;
                                }
                                n3 = 8;
                                void var2_9 = var61_193;
                                void var3_41 = var62_208;
                                n18 = 7;
                            }
                            void var61_195 = var2_8;
                            void var62_210 = var3_40;
                            n3 = 8;
                            l2 = 128L;
                            l3 = 255L;
                            if (n14 != n3) break;
                        }
                        if (n15 == n20) break;
                        ++n15;
                        void var2_10 = var61_197;
                        void var3_42 = var62_212;
                    }
                }
                ++var10_70;
                do1_0 do1_05 = do1_02;
                n3 = do1_02.c;
                O11 o11 = (O11)tr1_12.c(n3);
                n3 = o11 != null ? o11.c : do1_02.d;
                n22 += n3;
                j30_0 j30_07 = this;
                fj1 fj15 = fj12;
                void var16_94 = var34_160;
                n29 = n8;
                object5 = object2;
                object10 = object;
                object8 = object13;
                n14 = n28;
                objectArray3 = objectArray;
                objectArray2 = objectArray6;
                object9 = object12;
            }
        }
        n7 = var2_17.j;
        while (true) {
            object5 = var2_17.F;
            n20 = ((k73)object5).k;
            if (n20 > 0 || (n20 = ((k73)object5).g) == (n24 = ((k73)object5).h)) {
                int n30;
                n7 = (int)(var2_17.O ? 1 : 0);
                object5 = ", ";
                object10 = "StringBuilder().apply(builderAction).toString()";
                objectArray3 = "Error while pushing ";
                string2 = ". Not all arguments were provided. Missing ";
                object4 = " int arguments (";
                object3 = ") and ";
                objectArray2 = " object arguments (";
                object9 = ").";
                if (n7 != 0) {
                    int n32;
                    Object[] objectArray12;
                    if (bl2) {
                        int n34;
                        object11 = var2_17.N;
                        object8 = ((wo0_0)object11).b;
                        n17 = ((R92)object8).U();
                        if (n17 == 0) {
                            p30_0.c("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw null;
                        }
                        n17 = ((R92)object8).T();
                        if (n17 != 0) {
                            NoSuchElementException noSuchElementException = new NoSuchElementException("Cannot pop(), because the stack is empty.");
                            throw noSuchElementException;
                        }
                        I92[] i92Array = ((R92)object8).a;
                        ((R92)object8).b = n14 = ((R92)object8).b + -1;
                        I92 i92 = i92Array[n14];
                        Intrinsics.checkNotNull(i92);
                        I92[] i92Array2 = ((R92)object8).a;
                        int n35 = ((R92)object8).b;
                        i92Array2[n35] = null;
                        object11 = ((wo0_0)object11).a;
                        ((R92)object11).X(i92);
                        n14 = ((R92)object8).f;
                        int n36 = ((R92)object11).f;
                        n30 = n7;
                        objectArray12 = objectArray2;
                        Object var3_48 = null;
                        for (n7 = 0; n7 < (n19 = i92.b); ++n7) {
                            n32 = -1;
                            objectArray2 = ((R92)object11).e;
                            object2 = object9;
                            object9 = ((R92)object8).e;
                            objectArray2[var24_137 += -1] = object = object9[n14 += -1];
                            n19 = 0;
                            objectArray2 = null;
                            object9[n14] = null;
                            object9 = object2;
                        }
                        object2 = object9;
                        n7 = ((R92)object8).d;
                        n16 = ((R92)object11).d;
                        Object var20_119 = null;
                        for (n14 = 0; n14 < (n34 = i92.a); ++n14) {
                            n32 = -1;
                            object6 = ((R92)object11).c;
                            object = object11;
                            object11 = ((R92)object8).c;
                            int n37 = object11[n7 += -1];
                            object6[n16 += -1] = n37;
                            n34 = 0;
                            object6 = null;
                            object11[n7] = 0;
                            object11 = object;
                        }
                        ((R92)object8).f = n7 = ((R92)object8).f - n19;
                        ((R92)object8).d = n7 = ((R92)object8).d - n34;
                        n21 = 1;
                    } else {
                        n30 = n7;
                        objectArray12 = objectArray2;
                        object2 = object9;
                    }
                    k73 k734 = var2_17.F;
                    n19 = k734.k;
                    if (n19 <= 0) {
                        sn2.b("Unbalanced begin/end empty");
                        throw null;
                    }
                    int n38 = -1;
                    k734.k = n19 += n38;
                    q73 q732 = var2_17.H;
                    n19 = q732.v;
                    q732.i();
                    k73 k735 = var2_17.F;
                    n7 = k735.k;
                    if (n7 <= 0) {
                        n7 = -2 - n19;
                        var2_17.H.j();
                        var2_17.H.e(true);
                        objectArray2 = var2_17.M;
                        object9 = var2_17.N.a;
                        n16 = (int)(((R92)object9).T() ? 1 : 0);
                        if (n16 != 0) {
                            object9 = var2_17.G;
                            ((d30_0)object7).f();
                            n18 = 0;
                            ((d30_0)object7).h(false);
                            ((d30_0)object7).i();
                            ((d30_0)object7).g();
                            object7 = ((d30_0)object7).b;
                            object7.getClass();
                            object8 = I92$o.c;
                            object7 = ((zr_1)object7).a;
                            ((R92)object7).X((I92)object8);
                            Object var16_99 = null;
                            R92$b.b((R92)object7, 0, objectArray2);
                            R92$b.b((R92)object7, 1, object9);
                            n19 = ((R92)object7).g;
                            n16 = ((I92)object8).a;
                            n17 = R92.Q((R92)object7, n16);
                            n14 = ((I92)object8).b;
                            if (n19 != n17 || (n19 = ((R92)object7).h) != (n17 = R92.Q((R92)object7, n14))) {
                                StringBuilder stringBuilder = new StringBuilder();
                                object11 = null;
                                n19 = 0;
                                objectArray2 = null;
                                for (n21 = 0; n21 < n16; ++n21) {
                                    int n39 = 1 << n21;
                                    n17 = ((R92)object7).g & n39;
                                    if (n17 == 0) continue;
                                    if (n19 > 0) {
                                        stringBuilder.append((String)object5);
                                    }
                                    String string3 = ((I92)object8).b(n21);
                                    stringBuilder.append(string3);
                                    ++n19;
                                }
                                String string4 = stringBuilder.toString();
                                object11 = g30.b(string4, (String)object10);
                                n16 = 0;
                                object9 = null;
                                n17 = 0;
                                Object var16_102 = null;
                                while (true) {
                                    if (n16 >= n14) {
                                        object11 = ((StringBuilder)object11).toString();
                                        Intrinsics.checkNotNullExpressionValue(object11, (String)object10);
                                        object5 = new StringBuilder((String)objectArray3);
                                        ((StringBuilder)object5).append(object8);
                                        ((StringBuilder)object5).append(string2);
                                        h30_0.b((StringBuilder)object5, n19, (String)object4, string4, (String)object3);
                                        object9 = objectArray12;
                                        object8 = object2;
                                        i30_0.a((StringBuilder)object5, n17, (String)objectArray12, (String)object11, (String)object2);
                                        throw null;
                                    }
                                    n32 = 1 << n16;
                                    int n41 = ((R92)object7).h;
                                    if ((n41 = n32 & n41) != 0) {
                                        if (n19 > 0) {
                                            ((StringBuilder)object11).append((String)object5);
                                        }
                                        object6 = ((I92$o)object8).c(n16);
                                        ((StringBuilder)object11).append((String)object6);
                                        ++n17;
                                    }
                                    ++n16;
                                }
                            }
                        } else {
                            object9 = objectArray12;
                            object8 = object2;
                            l73 l732 = var2_17.G;
                            wo0_0 wo0_02 = var2_17.N;
                            ((d30_0)object7).f();
                            boolean bl6 = false;
                            ((d30_0)object7).h(false);
                            ((d30_0)object7).i();
                            ((d30_0)object7).g();
                            object7 = ((d30_0)object7).b;
                            object7.getClass();
                            object6 = I92$p.c;
                            object7 = ((zr_1)object7).a;
                            ((R92)object7).X((I92)object6);
                            object9 = null;
                            R92$b.b((R92)object7, 0, objectArray2);
                            R92$b.b((R92)object7, 1, l732);
                            R92$b.b((R92)object7, 2, wo0_02);
                            n19 = ((R92)object7).g;
                            n16 = ((I92)object6).a;
                            n17 = R92.Q((R92)object7, n16);
                            n14 = ((I92)object6).b;
                            if (n19 != n17 || (n19 = ((R92)object7).h) != (n17 = R92.Q((R92)object7, n14))) {
                                StringBuilder stringBuilder = new StringBuilder();
                                object11 = null;
                                n19 = 0;
                                objectArray2 = null;
                                for (n21 = 0; n21 < n16; ++n21) {
                                    n32 = 1 << n21;
                                    n17 = ((R92)object7).g;
                                    if ((n17 = n32 & n17) == 0) continue;
                                    if (n19 > 0) {
                                        stringBuilder.append((String)object5);
                                    }
                                    String string5 = ((I92)object6).b(n21);
                                    stringBuilder.append(string5);
                                    ++n19;
                                }
                                String string6 = stringBuilder.toString();
                                object11 = g30.b(string6, (String)object10);
                                n16 = 0;
                                object9 = null;
                                n17 = 0;
                                Object var16_106 = null;
                                while (true) {
                                    if (n16 >= n14) {
                                        object11 = ((StringBuilder)object11).toString();
                                        Intrinsics.checkNotNullExpressionValue(object11, (String)object10);
                                        object5 = new StringBuilder((String)objectArray3);
                                        ((StringBuilder)object5).append(object6);
                                        ((StringBuilder)object5).append(string2);
                                        h30_0.b((StringBuilder)object5, n19, (String)object4, string6, (String)object3);
                                        Object[] objectArray13 = objectArray12;
                                        i30_0.a((StringBuilder)object5, n17, (String)objectArray12, (String)object11, (String)object8);
                                        throw null;
                                    }
                                    int n42 = 1;
                                    n32 = n42 << n16;
                                    n4 = n14;
                                    n14 = ((R92)object7).h;
                                    if ((n14 = n32 & n14) != 0) {
                                        if (n19 > 0) {
                                            ((StringBuilder)object11).append((String)object5);
                                        }
                                        String string7 = ((I92$p)object6).c(n16);
                                        ((StringBuilder)object11).append(string7);
                                        ++n17;
                                    }
                                    ++n16;
                                    n14 = n4;
                                }
                            }
                            var2_17.N = object5 = new wo0_0();
                        }
                        n24 = 0;
                        object5 = null;
                        var2_17.O = false;
                        object7 = var2_17.c;
                        n22 = ((l73)object7).b;
                        if (n22 != 0) {
                            var2_17.z0(n7, 0);
                            var2_17.A0(n7, n21);
                        }
                    }
                    n24 = n21;
                    object11 = var2_17;
                } else {
                    void var10_74;
                    void var24_150;
                    n30 = n7;
                    Object[] objectArray14 = objectArray2;
                    object8 = object9;
                    int n43 = -1;
                    if (bl2) {
                        ((d30_0)object7).e();
                    }
                    objectArray2 = var2_17.F;
                    n16 = objectArray2.m;
                    n19 = objectArray2.l;
                    if ((n16 -= n19) > 0) {
                        if (n16 > 0) {
                            int n44;
                            n19 = 0;
                            ((d30_0)object7).h(false);
                            ((d30_0)object7).i();
                            objectArray2 = ((d30_0)object7).b;
                            objectArray2.getClass();
                            I92$C i92$C = I92$C.c;
                            objectArray2 = objectArray2.a;
                            objectArray2.X(i92$C);
                            Object var20_124 = null;
                            R92$b.a((R92)objectArray2, 0, n16);
                            n16 = objectArray2.g;
                            n14 = i92$C.a;
                            int n45 = R92.Q((R92)objectArray2, n14);
                            n4 = n21;
                            n21 = i92$C.b;
                            if (n16 != n45 || (n16 = objectArray2.h) != (n44 = R92.Q((R92)objectArray2, n21))) {
                                void var24_147;
                                int n46;
                                int n47;
                                object7 = new StringBuilder();
                                object9 = null;
                                boolean bl7 = false;
                                object6 = null;
                                for (n16 = 0; n16 < n14; ++n16) {
                                    n47 = 1;
                                    n46 = n47 << n16;
                                    n8 = n14;
                                    n14 = objectArray2.g;
                                    if ((n14 = n46 & n14) != 0) {
                                        if (var24_147 > 0) {
                                            ((StringBuilder)object7).append((String)object5);
                                        }
                                        String string8 = i92$C.b(n16);
                                        ((StringBuilder)object7).append(string8);
                                        ++var24_147;
                                    }
                                    n14 = n8;
                                }
                                object7 = ((StringBuilder)object7).toString();
                                object9 = g30.b((String)object7, (String)object10);
                                n3 = 0;
                                Object var2_18 = null;
                                n14 = 0;
                                Object var20_127 = null;
                                while (true) {
                                    if (n14 >= n21) {
                                        object11 = ((StringBuilder)object9).toString();
                                        Intrinsics.checkNotNullExpressionValue(object11, (String)object10);
                                        object5 = new StringBuilder((String)objectArray3);
                                        ((StringBuilder)object5).append(i92$C);
                                        ((StringBuilder)object5).append(string2);
                                        h30_0.b((StringBuilder)object5, (int)var24_147, (String)object4, (String)object7, (String)object3);
                                        i30_0.a((StringBuilder)object5, n3, (String)objectArray14, (String)object11, (String)object8);
                                        throw null;
                                    }
                                    n47 = 1;
                                    n46 = n47 << n14;
                                    n8 = n21;
                                    n21 = objectArray2.h;
                                    if ((n21 = n46 & n21) != 0) {
                                        if (var24_147 > 0) {
                                            ((StringBuilder)object9).append((String)object5);
                                        }
                                        object11 = i92$C.c(n14);
                                        ((StringBuilder)object9).append((String)object11);
                                        ++n3;
                                    }
                                    ++n14;
                                    n21 = n8;
                                }
                            }
                        } else {
                            n4 = n21;
                            object7.getClass();
                        }
                    } else {
                        n4 = n21;
                    }
                    k73 k736 = ((d30_0)object7).a.F;
                    n3 = k736.i;
                    fj1 fj16 = ((d30_0)object7).d;
                    n21 = fj16.b;
                    if (n21 > 0) {
                        object5 = fj16.a;
                        n20 = n21 + -1;
                        Object object17 = object5[n20];
                    } else {
                        int n48 = -1;
                    }
                    if (var24_150 > n3) {
                        object11 = this;
                        p30_0.c("Missed recording an endGroup");
                        throw null;
                    }
                    if (n21 > 0) {
                        object5 = fj16.a;
                        n20 = 1;
                        Object object18 = object5[n21 -= n20];
                    } else {
                        int n49 = -1;
                    }
                    if (var10_74 == n3) {
                        n3 = 0;
                        ((d30_0)object7).h(false);
                        fj16.a();
                        zr_1 zr_12 = ((d30_0)object7).b;
                        zr_12.getClass();
                        I92$j i92$j = I92$j.c;
                        R92 r92 = zr_12.a;
                        r92.W(i92$j);
                    }
                    object11 = this;
                    k73 k737 = this.F;
                    n3 = k737.i;
                    n7 = this.C0(n3);
                    n24 = n4;
                    if (n4 != n7) {
                        this.A0(n3, n4);
                    }
                    if (bl2) {
                        n24 = 1;
                    }
                    k73 k738 = ((j30_0)object11).F;
                    k738.d();
                    ((d30_0)object7).g();
                }
                ArrayList arrayList = ((j30_0)object11).h.a;
                n7 = arrayList.size();
                n15 = 1;
                rq2_0 rq2_02 = (rq2_0)arrayList.remove(n7 -= n15);
                if (rq2_02 != null && n30 == 0) {
                    rq2_02.c = n7 = rq2_02.c + n15;
                }
                ((j30_0)object11).i = rq2_02;
                ((j30_0)object11).j = n3 = fj12.a() + n24;
                ((j30_0)object11).l = n3 = fj12.a();
                ((j30_0)object11).k = n3 = fj12.a() + n24;
                return;
            }
            n24 = n21;
            n15 = 1;
            boolean bl8 = false;
            string2 = null;
            n19 = 2;
            object11 = var2_17;
            n3 = 0;
            this.j0();
            n10 = var2_17.F.l();
            ((d30_0)object7).j(n7, n10);
            object4 = var2_17.F;
            n10 = ((k73)object4).g;
            object3 = objectArray;
            p30_0.a(n20, n10, (List)objectArray);
        }
    }

    public final void U() {
        int n3;
        int n4;
        this.T(false);
        CF2 cF2 = this.b0();
        if (cF2 != null && (n4 = (n3 = cF2.a) & 1) != 0) {
            cF2.a = n3 |= 2;
        }
    }

    public final void V() {
        boolean bl2 = false;
        this.T(false);
        this.T(false);
        fj1 fj12 = this.w;
        int n3 = fj12.a();
        if (n3 != 0) {
            bl2 = true;
        }
        this.v = bl2;
        this.J = null;
    }

    public final void W() {
        boolean bl2 = false;
        this.T(false);
        this.T(false);
        fj1 fj12 = this.w;
        int n3 = fj12.a();
        if (n3 != 0) {
            bl2 = true;
        }
        this.v = bl2;
        this.J = null;
    }

    /*
     * WARNING - void declaration
     */
    public final CF2 X() {
        Object object;
        int n3;
        Object object2;
        int n4;
        int n7;
        j30_0 j30_02 = this;
        Object object3 = this.D;
        Object object4 = ((gb3_1)object3).a;
        boolean bl2 = ((ArrayList)object4).isEmpty();
        bl2 = bl2 ^ (n7 = 1);
        if (bl2) {
            object3 = ((gb3_1)object3).a;
            int n8 = ((ArrayList)object3).size() - n7;
            object3 = (CF2)((ArrayList)object3).remove(n8);
        } else {
            object3 = null;
        }
        if (object3 != null) {
            int n10;
            ((CF2)object3).a = n10 = ((CF2)object3).a & 0xFFFFFFF7;
        }
        boolean bl3 = false;
        object4 = null;
        if (object3 != null) {
            String string2;
            int n14;
            int n15;
            Object object5;
            Object[] objectArray;
            int n16;
            Object object6;
            block25: {
                n4 = j30_02.A;
                object6 = ((CF2)object3).f;
                if (object6 != null && (n16 = ((CF2)object3).a & 0x10) == 0) {
                    objectArray = ((i62)object6).b;
                    int[] nArray = ((i62)object6).c;
                    object5 = ((i62)object6).a;
                    n15 = ((long[])object5).length + -2;
                    if (n15 >= 0) {
                        n14 = 0;
                        string2 = null;
                        while (true) {
                            long l2 = object5[n14];
                            long l3 = l2 ^ (long)-1;
                            int n17 = 7;
                            l3 = l3 << n17 & l2;
                            long l4 = -9187201950435737472L;
                            long l7 = (l3 &= l4) - l4;
                            Object object7 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object7 != false) {
                                int n18 = ~(n14 - n15) >>> 31;
                                int n19 = 8;
                                n18 = 8 - n18;
                                object2 = null;
                                for (n3 = 0; n3 < n18; ++n3) {
                                    long l8 = l2 & 0xFFL;
                                    long l12 = 128L;
                                    long l14 = l8 - l12;
                                    Object object8 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object8 < 0) {
                                        int n20 = (n14 << 3) + n3;
                                        Object cfr_ignored_2 = objectArray[n20];
                                        n7 = nArray[n20];
                                        if (n7 != n4) {
                                            object = new DF2((CF2)object3, n4, (gr1_1)object6);
                                            break block25;
                                        }
                                    }
                                    l2 >>= n19;
                                    n7 = 1;
                                }
                                if (n18 != n19) break;
                            }
                            if (n14 == n15) break;
                            ++n14;
                            n7 = 1;
                        }
                    }
                }
                n7 = 0;
                object = null;
            }
            if (object != null) {
                object2 = j30_02.L.b;
                object2.getClass();
                i92$i_0 i92$i_0 = i92$i_0.c;
                object2 = ((zr_1)object2).a;
                ((R92)object2).X(i92$i_0);
                R92$b.b((R92)object2, 0, object);
                object = j30_02.g;
                R92$b.b((R92)object2, 1, object);
                n7 = ((R92)object2).g;
                int n21 = i92$i_0.a;
                n16 = R92.Q((R92)object2, n21);
                int n22 = i92$i_0.b;
                if (n7 == n16 && (n7 = ((R92)object2).h) == (n16 = R92.Q((R92)object2, n22))) {
                } else {
                    void var4_9;
                    object3 = new StringBuilder();
                    n7 = 0;
                    object = null;
                    n16 = 0;
                    objectArray = null;
                    while (true) {
                        object5 = ", ";
                        if (n7 >= n21) break;
                        n14 = 1 << n7;
                        n15 = ((R92)object2).g & n14;
                        if (n15 != 0) {
                            if (n16 > 0) {
                                ((StringBuilder)object3).append((String)object5);
                            }
                            object5 = i92$i_0.b(n7);
                            ((StringBuilder)object3).append((String)object5);
                            ++n16;
                        }
                        ++n7;
                    }
                    object3 = ((StringBuilder)object3).toString();
                    object = "StringBuilder().apply(builderAction).toString()";
                    object6 = g30.b((String)object3, (String)object);
                    n15 = 0;
                    while (var4_9 < n22) {
                        int n24 = 1 << var4_9;
                        n14 = ((R92)object2).h & n24;
                        if (n14 != 0) {
                            if (n16 > 0) {
                                ((StringBuilder)object6).append((String)object5);
                            }
                            string2 = i92$i_0.c((int)var4_9);
                            ((StringBuilder)object6).append(string2);
                            ++n15;
                        }
                        ++var4_9;
                    }
                    object4 = ((StringBuilder)object6).toString();
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object);
                    object = new StringBuilder("Error while pushing ");
                    ((StringBuilder)object).append(i92$i_0);
                    ((StringBuilder)object).append(". Not all arguments were provided. Missing ");
                    h30_0.b((StringBuilder)object, n16, " int arguments (", (String)object3, ") and ");
                    i30_0.a((StringBuilder)object, n15, " object arguments (", (String)object4, ").");
                    throw null;
                }
            }
        }
        n7 = 0;
        object = null;
        if (object3 != null && (n4 = (n3 = ((CF2)object3).a) & 0x10) == 0 && ((n3 &= (n4 = 1)) != 0 || (n3 = (int)(j30_02.p ? 1 : 0)) != 0)) {
            object = ((CF2)object3).c;
            if (object == null) {
                n7 = (int)(j30_02.O ? 1 : 0);
                if (n7 != 0) {
                    object = j30_02.H;
                    n3 = ((q73)object).v;
                    object = ((q73)object).b(n3);
                } else {
                    object = j30_02.F;
                    n3 = ((k73)object).i;
                    object = ((k73)object).a(n3);
                }
                ((CF2)object3).c = object;
            }
            ((CF2)object3).a = n7 = ((CF2)object3).a & 0xFFFFFFFB;
            object2 = object3;
        } else {
            n3 = 0;
            object2 = null;
        }
        j30_02.T(false);
        return object2;
    }

    public final void Y() {
        I92$j i92$j;
        boolean bl2 = false;
        this.T(false);
        this.b.c();
        this.T(false);
        Object object = this.L;
        boolean bl3 = ((d30_0)object).c;
        if (bl3) {
            ((d30_0)object).h(false);
            ((d30_0)object).h(false);
            i0_0 i0_02 = ((d30_0)object).b;
            i0_02.getClass();
            i92$j = I92$j.c;
            i0_02 = ((zr_1)i0_02).a;
            ((R92)i0_02).W(i92$j);
            ((d30_0)object).c = false;
        }
        ((d30_0)object).f();
        object = ((d30_0)object).d;
        int n3 = ((fj1)object).b;
        bl3 = true;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        i92$j = null;
        if (n3 != 0) {
            object = this.h.a;
            n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n3 != 0) {
                this.N();
                this.F.c();
                object = this.w;
                n3 = ((fj1)object).a();
                if (n3 != 0) {
                    bl2 = true;
                }
                this.v = bl2;
                return;
            }
            p30_0.c("Start/end imbalance");
            throw null;
        }
        p30_0.c("Missed recording an endGroup()");
        throw null;
    }

    public final void Z(boolean bl2, rq2_0 rq2_02) {
        Object object = this.i;
        ArrayList arrayList = this.h.a;
        arrayList.add(object);
        this.i = rq2_02;
        int n3 = this.k;
        object = this.m;
        ((fj1)object).b(n3);
        n3 = this.l;
        ((fj1)object).b(n3);
        n3 = this.j;
        ((fj1)object).b(n3);
        n3 = 0;
        rq2_02 = null;
        if (bl2) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final boolean a(boolean bl2) {
        boolean bl3;
        Object object = this.e0();
        boolean bl4 = object instanceof Boolean;
        if (bl4 && bl2 == (bl3 = ((Boolean)(object = (Boolean)object)).booleanValue())) {
            return false;
        }
        Boolean bl5 = bl2;
        this.B0(bl5);
        return true;
    }

    public final void a0() {
        Object object;
        Object object2 = new l73();
        boolean bl2 = this.B;
        if (bl2) {
            ((l73)object2).g();
        }
        if (bl2 = ((A30)(object = this.b)).d()) {
            ((l73)object2).j = object = new tr1_1();
        }
        this.G = object2;
        object2 = ((l73)object2).i();
        ((q73)object2).e(true);
        this.H = object2;
    }

    public final boolean b(float f5) {
        float f6;
        float f7;
        float f8;
        Object object = this.e0();
        boolean bl2 = object instanceof Float;
        if (bl2 && (f8 = (f7 = f5 - (f6 = ((Number)(object = (Number)object)).floatValue())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) == false) {
            return false;
        }
        Float f11 = Float.valueOf(f5);
        this.B0(f11);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CF2 b0() {
        int n3 = this.z;
        if (n3 != 0) return null;
        Object object = this.D;
        ArrayList arrayList = ((gb3_1)object).a;
        boolean bl2 = arrayList.isEmpty();
        int n4 = 1;
        if (!(bl2 ^= n4)) return null;
        object = ((gb3_1)object).a;
        return (CF2)pp_0.a(n4, (ArrayList)object);
    }

    public final boolean c(int n3) {
        int n4;
        Object object = this.e0();
        boolean bl2 = object instanceof Integer;
        if (bl2 && n3 == (n4 = ((Number)(object = (Number)object)).intValue())) {
            return false;
        }
        Integer n7 = n3;
        this.B0(n7);
        return true;
    }

    public final boolean c0() {
        CF2 cF2;
        int n3 = this.h();
        if (n3 != 0 && (n3 = this.v) == 0 && ((cF2 = this.b0()) == null || (n3 = cF2.a & 4) == 0)) {
            n3 = 0;
            cF2 = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final boolean d(long l2) {
        long l3;
        long l4;
        long l7;
        Object object = this.e0();
        boolean bl2 = object instanceof Long;
        if (bl2 && (l7 = (l4 = l2 - (l3 = ((Number)(object = (Number)object)).longValue())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            return false;
        }
        Long l8 = l2;
        this.B0(l8);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d0(ArrayList var1_1) {
        block57: {
            var2_2 = this;
            var3_3 = this.c;
            var4_22 = this.b;
            var5_23 = this.f;
            var6_24 = this.L;
            var7_25 = var6_24.b;
            var6_24.b = var5_23;
            var5_23.getClass();
            var8_26 = I92$z.c;
            var5_23 = var5_23.a;
            var5_23.W((I92)var8_26);
            var9_27 = var1_1.size();
            var10_28 = null;
            var11_29 = 0;
            var12_30 = null;
            while (var11_29 < var9_27) {
                block63: {
                    block62: {
                        block61: {
                            block59: {
                                block56: {
                                    block55: {
                                        block54: {
                                            block53: {
                                                block51: {
                                                    block58: {
                                                        block52: {
                                                            var13_31 = var1_1;
                                                            var5_23 = var1_1.get(var11_29);
                                                            var5_23 = (Pair)var5_23;
                                                            var8_26 = var5_23.a;
                                                            var8_26 = (vQ1)var8_26;
                                                            var5_23 = var5_23.b;
                                                            var5_23 = (vQ1)var5_23;
                                                            var14_32 = var8_26.e;
                                                            var15_33 = var8_26.d;
                                                            var16_34 = var15_33.d((Ae)var14_32);
                                                            var17_35 = new Xi1(0);
                                                            var6_24.c(var17_35, (Ae)var14_32);
                                                            if (var5_23 != null) break block51;
                                                            try {
                                                                var5_23 = var2_2.G;
                                                                var18_36 = Intrinsics.areEqual(var15_33, var5_23);
                                                                if (var18_36) {
                                                                    var5_23 = var2_2.H;
                                                                    var18_36 = var5_23.w;
                                                                    p30_0.h(var18_36);
                                                                    this.a0();
                                                                }
                                                                var19_37 = var15_33.h();
                                                            }
                                                            catch (Throwable var3_4) {}
                                                            var19_37.k(var16_34);
                                                            var6_24.f = var16_34;
                                                            var20_38 = new zr_1();
                                                            var15_33 = new l30_0(var2_2, (zr_1)var20_38, (k73)var19_37, (vQ1)var8_26);
                                                            var21_39 = mz0_2.a;
                                                            var22_40 = 0;
                                                            var14_32 = null;
                                                            var8_26 = null;
                                                            var5_23 = this;
                                                            var23_41 = var15_33;
                                                            var24_42 = 0;
                                                            var15_33 = null;
                                                            var10_28 = var20_38;
                                                            var20_38 = var21_39;
                                                            var21_39 = var19_37;
                                                            var19_37 = var23_41;
                                                            this.h0(null, null, null, (List)var20_38, (Function0)var23_41);
                                                            var6_24.d((zr_1)var10_28, var17_35);
                                                            var5_23 = Unit.a;
                                                            {
                                                                catch (Throwable var3_5) {
                                                                    break block52;
                                                                }
                                                            }
                                                            break block58;
                                                            catch (Throwable var3_6) {
                                                                var21_39 = var19_37;
                                                            }
                                                        }
                                                        var21_39.c();
                                                        throw var3_7;
                                                    }
                                                    var21_39.c();
                                                    var25_43 = var3_3;
                                                    var3_3 = var4_22;
                                                    var23_41 = var7_25;
                                                    var26_44 = var9_27;
                                                    var27_45 = var11_29;
                                                    ** GOTO lbl189
                                                }
                                                var20_38 = var4_22.l((vQ1)var5_23);
                                                if (var20_38 == null) break block53;
                                                var19_37 = var20_38.a;
                                                if (var19_37 != null) break block54;
                                            }
                                            var19_37 = var5_23.d;
                                        }
                                        if (var20_38 == null) break block55;
                                        var10_28 = var20_38.a;
                                        if (var10_28 == null) break block55;
                                        var26_44 = var9_27;
                                        var9_27 = 0;
                                        var28_46 = null;
                                        if ((var10_28 = var10_28.c(0)) == null) {
                                            break block56;
                                        }
                                        ** GOTO lbl110
                                        var5_23 = var7_25;
                                        break block57;
                                    }
                                    var26_44 = var9_27;
                                }
                                var10_28 = var5_23.e;
lbl110:
                                // 2 sources

                                var28_46 = new ArrayList();
                                var13_31 = var19_37.h();
                                var23_41 = var7_25;
                                var29_47 = var19_37.d((Ae)var10_28);
                                p30_0.b((k73)var13_31, var28_46, var29_47);
                                var7_25 = Unit.a;
                                try {
                                    var13_31.c();
                                    var29_47 = var28_46.isEmpty() ^ 1;
                                    if (var29_47 != 0) {
                                        var6_24.a((ArrayList)var28_46, var17_35);
                                        var24_42 = Intrinsics.areEqual(var15_33, var3_3);
                                        if (var24_42 != 0) {
                                            var22_40 = var3_3.d((Ae)var14_32);
                                            var24_42 = var2_2.C0(var22_40);
                                            var29_47 = var28_46.size();
                                            var2_2.z0(var22_40, var24_42 += var29_47);
                                        }
                                    }
                                    var6_24.b((uq1_0)var20_38, (A30)var4_22, (vQ1)var5_23, (vQ1)var8_26);
                                    var7_25 = var19_37.h();
                                }
                                catch (Throwable var3_8) {}
                                var28_46 = var2_2.F;
                                var13_31 = var2_2.n;
                                var20_38 = var2_2.u;
                                var22_40 = 0;
                                var14_32 = null;
                                var2_2.n = null;
                                var2_2.u = null;
                                var2_2.F = var7_25;
                                var22_40 = var19_37.d((Ae)var10_28);
                                var7_25.k(var22_40);
                                var6_24.f = var22_40;
                                var10_28 = new zr_1();
                                var19_37 = var6_24.b;
                                var6_24.b = var10_28;
                                var24_42 = (int)var6_24.e;
                                var22_40 = 0;
                                var14_32 = null;
                                var6_24.e = false;
                                var14_32 = var5_23.c;
                                var25_43 = var3_3;
                                var3_3 = var8_26.c;
                                var27_45 = var24_42;
                                var24_42 = var7_25.g;
                                var15_33 = var24_42;
                                var5_23 = var5_23.f;
                                var30_48 = var19_37;
                                var19_37 = new m30_0(var2_2, (vQ1)var8_26);
                                var31_49 = var5_23;
                                var5_23 = this;
                                var8_26 = var14_32;
                                var14_32 = var3_3;
                                var3_3 = var4_22;
                                var32_50 = var27_45;
                                var27_45 = var11_29;
                                var12_30 = var20_38;
                                var20_38 = var31_49;
                                var31_49 = var7_25;
                                var7_25 = var30_48;
                                this.h0((k80)var8_26, (k80)var14_32, (Integer)var15_33, (List)var20_38, (Function0)var19_37);
                                var6_24.e = var32_50;
                                var6_24.b = var30_48;
                                var6_24.d((zr_1)var10_28, var17_35);
                                var2_2.F = var28_46;
                                var2_2.n = (int[])var13_31;
                                var2_2.u = var12_30;
                                var31_49.c();
lbl189:
                                // 2 sources

                                var5_23 = var6_24.b;
                                var5_23.getClass();
                                var8_26 = I92$B.c;
                                var5_23 = var5_23.a;
                                var5_23.W((I92)var8_26);
                                var11_29 = var27_45 + 1;
                                var4_22 = var3_3;
                                var9_27 = var26_44;
                                var7_25 = var23_41;
                                var3_3 = var25_43;
                                var10_28 = null;
                                continue;
                                catch (Throwable var3_11) {}
                                break block59;
                                catch (Throwable var3_12) {
                                    var12_30 = var20_38;
                                    var31_49 = var7_25;
                                    var32_50 = var27_45;
                                    var7_25 = var30_48;
                                }
                                break block59;
                                catch (Throwable var3_13) {
                                    block60: {
                                        var12_30 = var20_38;
                                        var31_49 = var7_25;
                                        var32_50 = var27_45;
                                        break block60;
                                        catch (Throwable var3_14) {
                                            var32_50 = var24_42;
                                            var12_30 = var20_38;
                                            var31_49 = var7_25;
                                        }
                                    }
                                    var7_25 = var19_37;
                                }
                            }
                            try {
                                var6_24.e = var32_50;
                                throw var3_3;
                            }
                            catch (Throwable var3_15) {}
                            break block61;
                            catch (Throwable var3_16) {
                                var12_30 = var20_38;
                                var31_49 = var7_25;
                                var7_25 = var19_37;
                            }
                        }
                        try {
                            var6_24.b = var7_25;
                            throw var3_3;
                        }
                        catch (Throwable var3_10) {}
                        break block62;
                        catch (Throwable var3_17) {
                            var12_30 = var20_38;
                            var31_49 = var7_25;
                        }
                    }
                    try {
                        var2_2.F = var28_46;
                        var2_2.n = (int[])var13_31;
                        var2_2.u = var12_30;
                        throw var3_3;
                    }
                    catch (Throwable var3_18) {}
                    break block63;
                    catch (Throwable var3_19) {
                        var31_49 = var7_25;
                    }
                }
                var31_49.c();
                throw var3_3;
                ** GOTO lbl-1000
                catch (Throwable var3_20) {
                    var13_31.c();
                    throw var3_20;
                }
                catch (Throwable var3_21) {
                    var23_41 = var7_25;
                }
lbl-1000:
                // 2 sources

                {
                    var5_23 = var23_41;
                    break block57;
                }
            }
            var23_41 = var7_25;
            var3_3 = var6_24.b;
            var3_3.getClass();
            var5_23 = I92$k.c;
            var3_3 = var3_3.a;
            var3_3.W((I92)var5_23);
            var3_3 = null;
            var6_24.f = 0;
            var5_23 = var7_25;
            var6_24.b = var7_25;
            return;
        }
        var6_24.b = var5_23;
        throw var3_9;
    }

    public final boolean e() {
        return this.O;
    }

    public final Object e0() {
        boolean bl2 = this.O;
        Object object = b30$a.a;
        if (bl2) {
            this.D0();
        } else {
            Object object2 = this.F.h();
            boolean bl3 = this.x;
            if (!bl3 || (bl3 = object2 instanceof vO2)) {
                object = object2;
            }
        }
        return object;
    }

    public final void f(boolean bl2) {
        int n3 = this.k;
        Object object = null;
        if ((n3 = n3 == 0 ? 1 : 0) != 0) {
            n3 = (int)(this.O ? 1 : 0);
            if (n3 == 0) {
                if (!bl2) {
                    this.p0();
                    return;
                }
                k73 k732 = this.F;
                n3 = k732.g;
                int n4 = k732.h;
                Object object2 = this.L;
                object2.getClass();
                ((d30_0)object2).h(false);
                object = ((d30_0)object2).b;
                object.getClass();
                object2 = i92$f_0.c;
                ((zr_1)object).a.W((I92)object2);
                object = this.r;
                p30_0.a(n3, n4, (List)object);
                k732 = this.F;
                k732.m();
            }
            return;
        }
        p30_0.c("No nodes can be emitted before calling dactivateToEndGroup");
        throw null;
    }

    public final int f0(int n3) {
        int n4;
        int[] nArray = this.F.b;
        int n7 = 0;
        for (int i3 = n73.l(nArray, n3) + 1; i3 < n3; i3 += n4) {
            int[] nArray2 = this.F.b;
            n4 = n73.g(nArray2, i3);
            if (n4 == 0) {
                ++n7;
            }
            nArray2 = this.F.b;
            n4 = n73.e(nArray2, i3);
        }
        return n7;
    }

    /*
     * Unable to fully structure code
     */
    public final j30_0 g(int var1_1) {
        block10: {
            block9: {
                this.K(var1_1);
                var1_1 = (int)this.O;
                var2_2 = this.D;
                var3_3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl";
                var4_4 = this.g;
                if (var1_1 == 0) break block9;
                Intrinsics.checkNotNull(var4_4, var3_3);
                var4_4 = (F30)var4_4;
                var5_5 = new CF2((EF2)var4_4);
                var2_2 = var2_2.a;
                var2_2.add(var5_5);
                this.B0(var5_5);
                var5_5.e = var6_7 = this.A;
                var5_5.a = var6_7 = var5_5.a & -17;
                break block10;
            }
            var5_6 = this.r;
            var7_8 = this.F;
            var8_9 = p30_0.f(var7_8.i, (List)var5_6);
            if (var8_9 >= 0) {
                var5_6 = (hk1)var5_6.remove(var8_9);
            } else {
                var1_1 = 0;
                var5_6 = null;
            }
            var7_8 = this.F.h();
            var9_10 = b30$a.a;
            var10_11 = Intrinsics.areEqual(var7_8, var9_10);
            if (var10_11) {
                Intrinsics.checkNotNull(var4_4, var3_3);
                var4_4 = (F30)var4_4;
                var7_8 = new CF2((EF2)var4_4);
                this.B0(var7_8);
            } else {
                var3_3 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl";
                Intrinsics.checkNotNull(var7_8, var3_3);
                var7_8 = (CF2)var7_8;
            }
            if (var5_6 != null) ** GOTO lbl-1000
            var1_1 = var7_8.a;
            var11_12 = var1_1 & 64;
            if (var11_12 != 0) {
                var11_12 = 1;
            } else {
                var11_12 = 0;
                var3_3 = null;
            }
            if (var11_12 != 0) {
                var7_8.a = var1_1 &= -65;
            }
            if (var11_12 == 0) {
                var7_8.a = var1_1 = var7_8.a & -9;
            } else lbl-1000:
            // 2 sources

            {
                var7_8.a = var1_1 = var7_8.a | 8;
            }
            var5_6 = var2_2.a;
            var5_6.add(var7_8);
            var7_8.e = var1_1 = this.A;
            var7_8.a = var1_1 = var7_8.a & -17;
        }
        return this;
    }

    public final boolean g0(vt2_0 vt2_02) {
        zr_1 zr_12 = this.e;
        Object object = zr_12.a;
        boolean n3 = ((R92)object).T();
        if (n3) {
            boolean bl2;
            object = vt2_02.a;
            int n4 = ((dt2_0)object).e;
            if (n4 <= 0 && !(bl2 = ((ArrayList)(object = this.r)).isEmpty() ^ true)) {
                return false;
            }
            this.R(vt2_02, null);
            return zr_12.a.U();
        }
        p30_0.c("Expected applyChanges() to have been called");
        throw null;
    }

    public final boolean h() {
        CF2 cF2;
        int n3 = this.O;
        if (n3 == 0 && (n3 = this.x) == 0 && (n3 = this.v) == 0 && (cF2 = this.b0()) != null && (n3 = cF2.a & 8) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            cF2 = null;
        }
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object h0(k80 object, k80 k802, Integer n3, List list, Function0 function0) {
        int n4;
        int n7;
        int n8;
        int n10;
        boolean bl2;
        block5: {
            bl2 = this.E;
            n10 = this.j;
            n8 = 1;
            try {
                this.E = n8;
                this.j = 0;
                n7 = list.size();
                break block5;
            }
            catch (Throwable throwable) {}
            this.E = bl2;
            this.j = n10;
            throw throwable;
        }
        for (n8 = 0; n8 < n7; ++n8) {
            Object object2 = list.get(n8);
            object2 = (Pair)object2;
            Object object3 = ((Pair)object2).a;
            object3 = (CF2)object3;
            object2 = ((Pair)object2).b;
            if (object2 != null) {
                this.y0((CF2)object3, object2);
                continue;
            }
            object2 = null;
            this.y0((CF2)object3, null);
        }
        if (object == null || (object = object.d(k802, n4 = n3 != null ? n3 : -1, function0)) == null) {
            object = function0.invoke();
        }
        this.E = bl2;
        this.j = n10;
        return object;
    }

    public final mp i() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i0() {
        block59: {
            block58: {
                var1_1 = this;
                var2_2 = this.E;
                this.E = var3_3 = 1;
                var4_4 = this.F;
                var5_5 = var4_4.i;
                var4_4 = var4_4.b;
                var6_6 = n73.e((int[])var4_4, var5_5) + var5_5;
                var7_7 = this.j;
                var8_8 = this.P;
                var9_9 = this.k;
                var10_10 = this.l;
                var11_11 = this.r;
                var12_12 /* !! */  = this.F;
                var13_13 = p30_0.f(var12_12 /* !! */ .g, (List)var11_11);
                if (var13_13 < 0) {
                    var13_13 = -(var13_13 + 1);
                }
                if (var13_13 >= (var14_14 = var11_11.size())) break block58;
                var12_12 /* !! */  = (hk1)var11_11.get(var13_13);
                var14_14 = var12_12 /* !! */ .b;
                if (var14_14 < var6_6) break block59;
            }
            var13_13 = 0;
            var12_12 /* !! */  = null;
        }
        var15_15 = var5_5;
        var16_16 = false;
        while (var12_12 /* !! */  != null) {
            block63: {
                block68: {
                    block64: {
                        block57: {
                            block56: {
                                block60: {
                                    block61: {
                                        block62: {
                                            block54: {
                                                var17_17 = var12_12 /* !! */ .b;
                                                var14_14 = p30_0.f(var17_17, (List)var11_11);
                                                if (var14_14 >= 0) {
                                                    var18_18 = (hk1)var11_11.remove(var14_14);
                                                }
                                                var18_18 = var12_12 /* !! */ .c;
                                                var19_19 = 128L;
                                                var21_20 = 255L;
                                                var23_21 = -9187201950435737472L;
                                                var25_22 = 7;
                                                var12_12 /* !! */  = var12_12 /* !! */ .a;
                                                if (var18_18 == null) {
                                                    var12_12 /* !! */ .getClass();
lbl41:
                                                    // 3 sources

                                                    while (true) {
                                                        var26_23 = var2_2;
                                                        var27_24 = var7_7;
                                                        var28_25 = var8_8;
                                                        var29_26 = var10_10;
                                                        var30_27 = var11_11;
                                                        var31_28 = var12_12 /* !! */ ;
                                                        while (true) {
                                                            var3_3 = 1;
                                                            break block54;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                var32_29 = var12_12 /* !! */ .g;
                                                if (var32_29 == null) ** GOTO lbl41
                                                var3_3 = var18_18 instanceof np0_0;
                                                if (var3_3 != 0) {
                                                    var18_18 = (np0_0)var18_18;
                                                    var3_3 = CF2.a((np0_0)var18_18, var32_29);
                                                    var26_23 = var2_2;
                                                    var27_24 = var7_7;
                                                    var28_25 = var8_8;
                                                    var29_26 = var10_10;
                                                    var30_27 = var11_11;
                                                    var31_28 = var12_12 /* !! */ ;
                                                } else {
                                                    block55: {
                                                        var3_3 = var18_18 instanceof ft2_0;
                                                        if (var3_3 != 0) ** break;
                                                        ** continue;
                                                        var3_3 = (var18_18 = (ft2_0)var18_18).c();
                                                        if (var3_3 != 0) {
                                                            var33_30 /* !! */  = var18_18.b;
                                                            var18_18 = var18_18.a;
                                                            var26_23 = var2_2;
                                                            var2_2 = ((Object)var18_18).length + -2;
                                                            if (var2_2 >= 0) {
                                                                var29_26 = var10_10;
                                                                var30_27 = var11_11;
                                                                var31_28 = var12_12 /* !! */ ;
                                                                var10_10 = 0;
                                                                var34_31 = null;
                                                                while (true) {
                                                                    var35_32 = var18_18[var10_10];
                                                                    var27_24 = var7_7;
                                                                    var28_25 = var8_8;
                                                                    var37_33 = (var35_32 ^ (long)-1) << var25_22 & var35_32 & var23_21;
                                                                    cfr_temp_0 = var37_33 - var23_21;
                                                                    var39_34 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                    if (var39_34 != false) {
                                                                        var7_7 = ~(var10_10 - var2_2) >>> 31;
                                                                        var7_7 = 8 - var7_7;
                                                                        var40_35 = null;
                                                                        for (var8_8 = 0; var8_8 < var7_7; ++var8_8) {
                                                                            var41_36 = var35_32 & var21_20;
                                                                            cfr_temp_1 = var41_36 - var19_19;
                                                                            var43_37 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                            if (var43_37 < 0) {
                                                                                var39_34 = (var10_10 << 3) + var8_8;
                                                                                var44_38 = var18_18;
                                                                                var18_18 = var33_30 /* !! */ [var39_34];
                                                                                var45_39 /* !! */  = var33_30 /* !! */ ;
                                                                                if ((var3_3 = var18_18 instanceof np0_0) == 0 || (var3_3 = (int)CF2.a((np0_0)(var18_18 = (np0_0)var18_18), var32_29)) != 0) ** continue;
lbl100:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var45_39 /* !! */  = var33_30 /* !! */ ;
                                                                            var44_38 = var18_18;
                                                                            ** continue;
                                                                            var3_3 = 8;
                                                                            var35_32 >>= var3_3;
                                                                            var33_30 /* !! */  = var45_39 /* !! */ ;
                                                                            var18_18 = var44_38;
                                                                        }
                                                                        var45_39 /* !! */  = var33_30 /* !! */ ;
                                                                        var44_38 = var18_18;
                                                                        var3_3 = 8;
                                                                        if (var7_7 != var3_3) break block55;
                                                                    } else {
                                                                        var45_39 /* !! */  = var33_30 /* !! */ ;
                                                                        var44_38 = var18_18;
                                                                    }
                                                                    if (var10_10 != var2_2) {
                                                                        ++var10_10;
                                                                        var7_7 = var27_24;
                                                                        var8_8 = var28_25;
                                                                        var33_30 /* !! */  = var45_39 /* !! */ ;
                                                                        var18_18 = var44_38;
                                                                        continue;
                                                                    }
                                                                    break block55;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            var26_23 = var2_2;
                                                        }
                                                        var27_24 = var7_7;
                                                        var28_25 = var8_8;
                                                        var29_26 = var10_10;
                                                        var30_27 = var11_11;
                                                        var31_28 = var12_12 /* !! */ ;
                                                    }
                                                    var3_3 = 0;
                                                    var33_30 /* !! */  = null;
                                                }
                                            }
                                            if (var3_3 == 0) break block60;
                                            var1_1.F.k(var17_17);
                                            var46_40 = var1_1.F;
                                            var2_2 = var46_40.g;
                                            var1_1.l0(var15_15, var2_2, var5_5);
                                            var33_30 /* !! */  = var1_1.F.b;
                                            var3_3 = n73.l((int[])var33_30 /* !! */ , var2_2);
                                            while (var3_3 != var5_5 && (var7_7 = (int)n73.h((int[])(var47_42 /* !! */  = (Object[])var1_1.F.b), var3_3)) == 0) {
                                                var47_42 /* !! */  = var1_1.F.b;
                                                var3_3 = n73.l((int[])var47_42 /* !! */ , var3_3);
                                            }
                                            var47_42 /* !! */  = var1_1.F.b;
                                            var7_7 = (int)n73.h((int[])var47_42 /* !! */ , var3_3);
                                            if (var7_7 != 0) {
                                                var7_7 = 0;
                                                var47_42 /* !! */  = null;
                                            } else {
                                                var7_7 = var27_24;
                                            }
                                            if (var3_3 != var2_2) {
                                                var8_8 = var1_1.C0(var3_3);
                                                var34_31 = var1_1.F.b;
                                                var10_10 = n73.j((int[])var34_31, var2_2);
                                                var8_8 = var8_8 - var10_10 + var7_7;
                                                block16: while (var7_7 < var8_8 && var3_3 != var17_17) {
                                                    ++var3_3;
                                                    while (var3_3 < var17_17) {
                                                        var34_31 = var1_1.F.b;
                                                        var10_10 = n73.e((int[])var34_31, var3_3) + var3_3;
                                                        if (var17_17 < var10_10) continue block16;
                                                        var11_11 = var1_1.F.b;
                                                        var48_43 = (int)n73.h((int[])var11_11, var3_3);
                                                        var3_3 = var48_43 != 0 ? 1 : var1_1.C0(var3_3);
                                                        var7_7 += var3_3;
                                                        var3_3 = var10_10;
                                                    }
                                                    break block16;
                                                }
                                            }
                                            var1_1.j = var7_7;
                                            var1_1.l = var3_3 = var1_1.f0(var2_2);
                                            var3_3 = n73.l(var1_1.F.b, var2_2);
                                            var7_7 = var1_1.f0(var3_3);
                                            var8_8 = var28_25;
                                            var1_1.P = var3_3 = var1_1.O(var3_3, var7_7, var5_5, var28_25);
                                            var3_3 = 0;
                                            var33_30 /* !! */  = null;
                                            var1_1.J = null;
                                            var47_42 /* !! */  = var31_28;
                                            var47_42 /* !! */  = var31_28.d;
                                            if (var47_42 /* !! */  != null) {
                                                var10_10 = 1;
                                                var11_11 = var10_10;
                                                var47_42 /* !! */ .invoke(var1_1, var11_11);
                                                var49_44 = Unit.a;
                                            } else {
                                                var49_44 = null;
                                            }
                                            if (var49_44 == null) break block61;
                                            var1_1.J = null;
                                            var33_30 /* !! */  = var1_1.F;
                                            var47_42 /* !! */  = var33_30 /* !! */ .b;
                                            var7_7 = n73.e((int[])var47_42 /* !! */ , var5_5) + var5_5;
                                            var10_10 = var33_30 /* !! */ .g;
                                            if (var10_10 >= var5_5 && var10_10 <= var7_7) {
                                                var48_43 = 1;
                                            } else {
                                                var48_43 = 0;
                                                var11_11 = null;
                                            }
                                            if (var48_43 == 0) break block62;
                                            var33_30 /* !! */ .i = var5_5;
                                            var33_30 /* !! */ .h = var7_7;
                                            var47_42 /* !! */  = null;
                                            var33_30 /* !! */ .l = 0;
                                            var33_30 /* !! */ .m = 0;
                                            var15_15 = var2_2;
                                            var33_30 /* !! */  = var1_1;
                                            var28_25 = var8_8;
                                            var50_45 = var9_9;
                                            var1_1 = null;
                                            var7_7 = 1;
                                            var16_16 = true;
                                            break block63;
                                        }
                                        var46_40 = new StringBuilder("Index ");
                                        var46_40.append(var5_5);
                                        var46_40.append(" is not a parent of ");
                                        var46_40.append(var10_10);
                                        p30_0.c(var46_40.toString());
                                        throw null;
                                    }
                                    var33_30 /* !! */  = "Invalid restart scope".toString();
                                    var46_40 = new IllegalStateException((String)var33_30 /* !! */ );
                                    throw var46_40;
                                }
                                var47_42 /* !! */  = var31_28;
                                var8_8 = var28_25;
                                var2_2 = 0;
                                var46_40 = null;
                                var33_30 /* !! */  = var1_1.D;
                                var33_30 /* !! */ .a.add(var31_28);
                                var34_31 = var31_28.b;
                                if (var34_31 == null || (var11_11 = var31_28.f) == null) break block64;
                                var13_13 = 1;
                                var31_28.e((boolean)var13_13);
                                var12_12 /* !! */  = var11_11.b;
                                var18_18 = var11_11.c;
                                var11_11 = var11_11.a;
                                var51_46 = ((Object)var11_11).length + -2;
                                if (var51_46 < 0) break block56;
                                var17_17 = 0;
                                while (true) {
                                    block67: {
                                        block65: {
                                            var52_47 = var11_11[var17_17];
                                            var28_25 = var8_8;
                                            var50_45 = var9_9;
                                            var54_48 = (var52_47 ^ (long)-1) << var25_22 & var52_47 & var23_21;
                                            var39_34 = var54_48 == var23_21 ? 0 : (var54_48 < var23_21 ? -1 : 1);
                                            if (var39_34 == false) break block65;
                                            var8_8 = ~(var17_17 - var51_46) >>> 31;
                                            var8_8 = 8 - var8_8;
                                            for (var9_9 = 0; var9_9 < var8_8; ++var9_9) {
                                                block66: {
                                                    var41_36 = var52_47 & var21_20;
                                                    cfr_temp_2 = var41_36 - var19_19;
                                                    var43_37 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                    if (var43_37 < 0) {
                                                        var39_34 = (var17_17 << 3) + var9_9;
                                                        var44_38 = var11_11;
                                                        var11_11 = var12_12 /* !! */ [var39_34];
                                                        var39_34 = var18_18[var39_34];
                                                        var34_31.b(var11_11);
lbl274:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    break block66;
                                                    catch (Throwable var46_41) {
                                                        var1_1 = null;
                                                    }
                                                    break block57;
                                                }
                                                var44_38 = var11_11;
                                                ** continue;
                                                var48_43 = 8;
                                                var52_47 >>= var48_43;
                                                var11_11 = var44_38;
                                            }
                                            var44_38 = var11_11;
                                            var48_43 = 8;
                                            if (var8_8 != var48_43) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            break block67;
                                        }
                                        var44_38 = var11_11;
                                        var48_43 = 8;
                                    }
                                    if (var17_17 == var51_46) ** GOTO lbl-1000
                                    ++var17_17;
                                    var9_9 = var50_45;
                                    var8_8 = var28_25;
                                    var11_11 = var44_38;
                                }
                            }
                            var50_45 = var9_9;
                            ** continue;
                            var1_1 = null;
                            var47_42 /* !! */ .e(false);
                            break block68;
                        }
                        var47_42 /* !! */ .e(false);
                        throw var46_41;
                    }
                    var28_25 = var8_8;
                    var50_45 = var9_9;
                    var1_1 = null;
                }
                var46_40 = var33_30 /* !! */ .a;
                var3_3 = var46_40.size();
                var7_7 = 1;
                var46_40.remove(var3_3 -= var7_7);
                var33_30 /* !! */  = this;
            }
            var46_40 = var33_30 /* !! */ .F;
            var2_2 = var46_40.g;
            var40_35 = var30_27;
            var2_2 = p30_0.f(var2_2, var30_27);
            if (var2_2 < 0) {
                var2_2 = -(var2_2 + 1);
            }
            if (var2_2 >= (var9_9 = var40_35.size())) ** GOTO lbl-1000
            var46_40 = (hk1)var40_35.get(var2_2);
            var9_9 = var46_40.b;
            if (var9_9 < var6_6) {
                var12_12 /* !! */  = var46_40;
            } else lbl-1000:
            // 2 sources

            {
                var13_13 = 0;
                var12_12 /* !! */  = null;
            }
            var1_1 = var33_30 /* !! */ ;
            var11_11 = var40_35;
            var2_2 = var26_23;
            var10_10 = var29_26;
            var9_9 = var50_45;
            var7_7 = var27_24;
            var8_8 = var28_25;
            var3_3 = 1;
        }
        var26_23 = var2_2;
        var33_30 /* !! */  = var1_1;
        var27_24 = var7_7;
        var28_25 = var8_8;
        var50_45 = var9_9;
        var29_26 = var10_10;
        if (var16_16) {
            var1_1.l0(var15_15, var5_5, var5_5);
            var46_40 = var1_1.F;
            var46_40.m();
            var2_2 = var1_1.C0(var5_5);
            var1_1.j = var7_7 += var2_2;
            var1_1.k = var9_9 += var2_2;
            var2_2 = var10_10;
            var1_1.l = var10_10;
lbl362:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        this.p0();
        ** while (true)
        var2_2 = var28_25;
        var33_30 /* !! */ .P = var28_25;
        var2_2 = var26_23;
        var33_30 /* !! */ .E = var26_23;
    }

    public final Object j(H30 h30) {
        return N30.a(this.P(), h30);
    }

    public final void j0() {
        int n3 = this.F.g;
        j30_0.n0(this, n3, false, 0);
        d30_0 d30_02 = this.L;
        d30_02.g();
        d30_02.h(false);
        d30_02.i();
        zr_1 zr_12 = d30_02.b;
        zr_12.getClass();
        Object object = I92$x.c;
        zr_12.a.W((I92)object);
        int n4 = d30_02.f;
        object = d30_02.a.F;
        int[] nArray = ((k73)object).b;
        int n7 = ((k73)object).g;
        d30_02.f = n7 = n73.e(nArray, n7) + n4;
    }

    public final void k(Object object, Function2 function2) {
        int n3;
        int n4;
        int n7;
        int n8;
        I92$F i92$F;
        Object object2;
        int n10;
        String string2;
        int n14;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Object object3;
        Object object4;
        Object object5;
        block19: {
            block18: {
                block17: {
                    object5 = this;
                    object4 = object;
                    object3 = function2;
                    boolean bl2 = this.O;
                    string10 = ").";
                    string9 = " object arguments (";
                    string8 = ") and ";
                    string7 = " int arguments (";
                    string6 = ". Not all arguments were provided. Missing ";
                    string5 = "Error while pushing ";
                    string4 = "StringBuilder().apply(builderAction).toString()";
                    string3 = ", ";
                    n14 = 2;
                    string2 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>";
                    n10 = 0;
                    if (!bl2) break block17;
                    Object object6 = this.N;
                    object6.getClass();
                    I92$F i92$F2 = I92$F.c;
                    object6 = ((wo0_0)object6).a;
                    ((R92)object6).X(i92$F2);
                    R92$b.b((R92)object6, 0, object);
                    Intrinsics.checkNotNull(function2, string2);
                    object4 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, n14);
                    R92$b.b((R92)object6, 1, object4);
                    int n15 = ((R92)object6).g;
                    int n16 = i92$F2.a;
                    n14 = R92.Q((R92)object6, n16);
                    int n17 = i92$F2.b;
                    if (n15 != n14 || (n15 = ((R92)object6).h) != (n14 = R92.Q((R92)object6, n17))) {
                        int n18;
                        int n19;
                        object4 = new StringBuilder();
                        for (n14 = 0; n14 < n16; ++n14) {
                            n19 = 1;
                            n18 = n19 << n14;
                            int n20 = n16;
                            n16 = ((R92)object6).g;
                            if ((n16 = n18 & n16) != 0) {
                                if (n10 > 0) {
                                    ((StringBuilder)object4).append(string3);
                                }
                                object3 = i92$F2.b(n14);
                                ((StringBuilder)object4).append((String)object3);
                                ++n10;
                            }
                            n16 = n20;
                        }
                        object4 = ((StringBuilder)object4).toString();
                        object3 = g30.b((String)object4, string4);
                        int n21 = 0;
                        object5 = null;
                        for (n14 = 0; n14 < n17; ++n14) {
                            n19 = 1;
                            int n22 = n19 << n14;
                            n18 = n17;
                            n17 = ((R92)object6).h;
                            if ((n17 = n22 & n17) != 0) {
                                if (n10 > 0) {
                                    ((StringBuilder)object3).append(string3);
                                }
                                string2 = i92$F2.c(n14);
                                ((StringBuilder)object3).append(string2);
                                ++n21;
                            }
                            n17 = n18;
                        }
                        object3 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        object6 = new StringBuilder(string5);
                        ((StringBuilder)object6).append(i92$F2);
                        ((StringBuilder)object6).append(string6);
                        h30_0.b((StringBuilder)object6, n10, string7, (String)object4, string8);
                        i30_0.a((StringBuilder)object6, n21, string9, (String)object3, string10);
                        throw null;
                    }
                    break block18;
                }
                object2 = this.L;
                ((d30_0)object2).f();
                object2 = ((d30_0)object2).b;
                object2.getClass();
                i92$F = I92$F.c;
                object2 = ((zr_1)object2).a;
                ((R92)object2).X(i92$F);
                n10 = 0;
                R92$b.b((R92)object2, 0, object);
                Intrinsics.checkNotNull(function2, string2);
                object4 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, n14);
                R92$b.b((R92)object2, 1, object4);
                int n24 = ((R92)object2).g;
                n8 = i92$F.a;
                n14 = R92.Q((R92)object2, n8);
                n7 = i92$F.b;
                if (n24 != n14 || (n24 = ((R92)object2).h) != (n14 = R92.Q((R92)object2, n7))) break block19;
            }
            return;
        }
        object4 = new StringBuilder();
        for (n14 = 0; n14 < n8; ++n14) {
            n4 = 1;
            n3 = n4 << n14;
            int n25 = ((R92)object2).g;
            if ((n25 = n3 & n25) != 0) {
                if (n10 > 0) {
                    ((StringBuilder)object4).append(string3);
                }
                object5 = i92$F.b(n14);
                ((StringBuilder)object4).append((String)object5);
                ++n10;
            }
            object5 = this;
        }
        object5 = ((StringBuilder)object4).toString();
        object4 = g30.b((String)object5, string4);
        object3 = null;
        n14 = 0;
        for (n8 = 0; n8 < n7; ++n8) {
            n4 = 1;
            int n26 = n4 << n8;
            n3 = n7;
            n7 = ((R92)object2).h;
            if ((n7 = n26 & n7) != 0) {
                if (n10 > 0) {
                    ((StringBuilder)object4).append(string3);
                }
                string2 = i92$F.c(n8);
                ((StringBuilder)object4).append(string2);
                ++n14;
            }
            n7 = n3;
        }
        object4 = ((StringBuilder)object4).toString();
        Intrinsics.checkNotNullExpressionValue(object4, string4);
        object3 = new StringBuilder(string5);
        ((StringBuilder)object3).append(i92$F);
        ((StringBuilder)object3).append(string6);
        h30_0.b((StringBuilder)object3, n10, string7, (String)object5, string8);
        i30_0.a((StringBuilder)object3, n14, string9, (String)object4, string10);
        throw null;
    }

    public final void k0(rq2_1 rq2_12) {
        int n3;
        Pi1 pi1 = this.u;
        if (pi1 == null) {
            n3 = 0;
            this.u = pi1 = new Pi1(0);
        }
        n3 = this.F.g;
        pi1.a.put(n3, (Object)rq2_12);
    }

    public final CoroutineContext l() {
        return this.b.i();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void l0(int var1_1, int var2_2, int var3_3) {
        var4_4 = this.F;
        if (var1_1 == var2_2) {
            while (true) {
                var3_3 /* !! */  = var1_1;
                break;
            }
        } else if (var1_1 != var3_3 /* !! */  && var2_2 != var3_3 /* !! */ ) {
            var5_5 /* !! */  = var4_4.b;
            var6_6 = n73.l(var5_5 /* !! */ , var1_1);
            if (var6_6 == var2_2) {
                var3_3 /* !! */  = var2_2;
            } else {
                if ((var7_7 /* !! */  = n73.l(var5_5 /* !! */  = var4_4.b, var2_2)) == var1_1) ** continue;
                var7_7 /* !! */  = var1_1 * 5 + 2;
                var7_7 /* !! */  = (int)var5_5 /* !! */ [var7_7 /* !! */ ];
                var8_8 /* !! */  = var2_2 * 5 + 2;
                if (var7_7 /* !! */  == (var8_8 /* !! */  = (int)var5_5 /* !! */ [var8_8 /* !! */ ])) {
                    var3_3 /* !! */  = var7_7 /* !! */ ;
                } else {
                    var7_7 /* !! */  = 0;
                    var8_8 /* !! */  = var1_1;
                    var9_9 = 0;
                    while (var8_8 /* !! */  > 0 && var8_8 /* !! */  != var3_3 /* !! */ ) {
                        var8_8 /* !! */  = n73.l(var5_5 /* !! */ , var8_8 /* !! */ );
                        ++var9_9;
                    }
                    var8_8 /* !! */  = var2_2;
                    var10_10 = 0;
                    while (var8_8 /* !! */  > 0 && var8_8 /* !! */  != var3_3 /* !! */ ) {
                        var8_8 /* !! */  = n73.l(var5_5 /* !! */ , var8_8 /* !! */ );
                        ++var10_10;
                    }
                    var3_3 /* !! */  = var9_9 - var10_10;
                    var11_11 /* !! */  = var1_1;
                    for (var8_8 /* !! */  = 0; var8_8 /* !! */  < var3_3 /* !! */ ; ++var8_8 /* !! */ ) {
                        var11_11 /* !! */  = var11_11 /* !! */  * 5 + 2;
                        var11_11 /* !! */  = (int)var5_5 /* !! */ [var11_11 /* !! */ ];
                    }
                    var10_10 -= var9_9;
                    var3_3 /* !! */  = var2_2;
                    while (var7_7 /* !! */  < var10_10) {
                        var3_3 /* !! */  = var3_3 /* !! */  * 5 + 2;
                        var3_3 /* !! */  = (int)var5_5 /* !! */ [var3_3 /* !! */ ];
                        ++var7_7 /* !! */ ;
                    }
                    var7_7 /* !! */  = var3_3 /* !! */ ;
                    var3_3 /* !! */  = var11_11 /* !! */ ;
                    while (var3_3 /* !! */  != var7_7 /* !! */ ) {
                        var3_3 /* !! */  = var3_3 /* !! */  * 5 + 2;
                        var3_3 /* !! */  = (int)var5_5 /* !! */ [var3_3 /* !! */ ];
                        var7_7 /* !! */  = var7_7 /* !! */  * 5 + 2;
                        var7_7 /* !! */  = (int)var5_5 /* !! */ [var7_7 /* !! */ ];
                    }
                }
            }
        }
        while (var1_1 > 0 && var1_1 != var3_3 /* !! */ ) {
            var5_5 /* !! */  = var4_4.b;
            var6_6 = (int)n73.h(var5_5 /* !! */ , var1_1);
            if (var6_6 != 0) {
                var5_5 /* !! */  = (int[])this.L;
                var5_5 /* !! */ .e();
            }
            var5_5 /* !! */  = var4_4.b;
            var1_1 = n73.l(var5_5 /* !! */ , var1_1);
        }
        this.S(var2_2, var3_3 /* !! */ );
    }

    public final rq2_1 m() {
        return this.P();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m0() {
        Throwable throwable3;
        Throwable throwable22;
        zr_1 zr_12;
        Object object;
        block7: {
            Object object2;
            block6: {
                object2 = this.L;
                object = this.c;
                int n3 = ((l73)object).b;
                if (n3 <= 0) return;
                Object object3 = ((l73)object).a;
                n3 = (int)(n73.c(object3, 0) ? 1 : 0);
                if (n3 == 0) return;
                object3 = new zr_1;
                object3();
                this.K = object3;
                object = ((l73)object).h();
                try {
                    this.F = object;
                    zr_12 = ((d30_0)object2).b;
                }
                catch (Throwable throwable22) {}
                try {
                    ((d30_0)object2).b = object3;
                    j30_0.n0(this, 0, false, 0);
                    ((d30_0)object2).g();
                    ((d30_0)object2).f();
                    n3 = (int)(((d30_0)object2).c ? 1 : 0);
                    if (n3 == 0) break block6;
                    object3 = ((d30_0)object2).b;
                    object3.getClass();
                    I92 i92 = I92$B.c;
                    object3 = object3.a;
                    object3.W(i92);
                    n3 = (int)(((d30_0)object2).c ? 1 : 0);
                    if (n3 == 0) break block6;
                    ((d30_0)object2).h(false);
                    ((d30_0)object2).h(false);
                    object3 = ((d30_0)object2).b;
                    object3.getClass();
                    i92 = I92$j.c;
                    object3 = object3.a;
                    object3.W(i92);
                    ((d30_0)object2).c = false;
                }
                catch (Throwable throwable3) {
                    break block7;
                }
            }
            ((d30_0)object2).b = zr_12;
            object2 = Unit.a;
            ((k73)object).c();
            return;
        }
        ((d30_0)object2).b = zr_12;
        throw throwable3;
        ((k73)object).c();
        throw throwable22;
    }

    public final void n() {
        boolean bl2 = this.q;
        int n3 = 0;
        Object object = null;
        if (bl2) {
            Object object2 = null;
            this.q = false;
            bl2 = this.O ^ true;
            if (bl2) {
                object2 = this.F;
                n3 = ((k73)object2).i;
                object2 = ((k73)object2).i(n3);
                object = this.L;
                ((d30_0)object).g();
                ArrayList arrayList = ((d30_0)object).h.a;
                arrayList.add(object2);
                boolean bl3 = this.x;
                if (bl3 && (bl3 = object2 instanceof C20)) {
                    ((d30_0)object).f();
                    object = ((d30_0)object).b;
                    object.getClass();
                    bl2 = object2 instanceof C20;
                    if (bl2) {
                        object2 = I92$I.c;
                        object = ((zr_1)object).a;
                        ((R92)object).W((I92)object2);
                    }
                }
                return;
            }
            p30_0.c("useNode() called while inserting");
            throw null;
        }
        p30_0.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw null;
    }

    public final void o(Object object) {
        int n3 = object instanceof ti2_0;
        if (n3 != 0) {
            int n4;
            Object object2;
            Object object3;
            n3 = this.O;
            int n7 = 0;
            Object object4 = null;
            int n8 = 1;
            if (n3 != 0) {
                object3 = object;
                object3 = (ti2_0)object;
                object2 = this.L.b;
                object2.getClass();
                I92$w i92$w = I92$w.c;
                object2 = ((zr_1)object2).a;
                ((R92)object2).X(i92$w);
                n4 = 0;
                R92$b.b((R92)object2, 0, object3);
                n3 = ((R92)object2).g;
                int n10 = i92$w.a;
                int n14 = R92.Q((R92)object2, n10);
                int n15 = i92$w.b;
                if (n3 != n14 || (n3 = ((R92)object2).h) != (n14 = R92.Q((R92)object2, n15))) {
                    int n16;
                    int n17;
                    String string2;
                    object = new StringBuilder();
                    n3 = 0;
                    object3 = null;
                    n14 = 0;
                    while (true) {
                        string2 = ", ";
                        if (n3 >= n10) break;
                        n17 = n8 << n3;
                        n16 = ((R92)object2).g;
                        if ((n17 &= n16) != 0) {
                            if (n14 > 0) {
                                ((StringBuilder)object).append(string2);
                            }
                            string2 = i92$w.b(n3);
                            ((StringBuilder)object).append(string2);
                            ++n14;
                        }
                        ++n3;
                    }
                    object = ((StringBuilder)object).toString();
                    object3 = "StringBuilder().apply(builderAction).toString()";
                    StringBuilder stringBuilder = g30.b((String)object, (String)object3);
                    n17 = 0;
                    while (n4 < n15) {
                        n16 = n8 << n4;
                        int n18 = ((R92)object2).h;
                        if ((n16 &= n18) != 0) {
                            if (n14 > 0) {
                                stringBuilder.append(string2);
                            }
                            String string3 = i92$w.c(n4);
                            stringBuilder.append(string3);
                            ++n17;
                        }
                        ++n4;
                    }
                    String string4 = stringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
                    object3 = new StringBuilder("Error while pushing ");
                    ((StringBuilder)object3).append(i92$w);
                    ((StringBuilder)object3).append(". Not all arguments were provided. Missing ");
                    h30_0.b((StringBuilder)object3, n14, " int arguments (", (String)object, ") and ");
                    i30_0.a((StringBuilder)object3, n17, " object arguments (", string4, ").");
                    throw null;
                }
            }
            this.d.add(object);
            object = (ti2_0)object;
            int n19 = this.O;
            if (n19 != 0) {
                object2 = this.H;
                int n20 = ((q73)object2).t;
                n4 = ((q73)object2).v + n8;
                if (n20 > n4) {
                    q73 q732;
                    object4 = ((q73)object2).b;
                    n7 = ((q73)object2).A((int[])object4, n20 -= n8);
                    while (true) {
                        int n21 = n20;
                        n20 = n7;
                        n7 = n21;
                        q732 = this.H;
                        n19 = q732.v;
                        if (n20 == n19 || n20 < 0) break;
                        object4 = q732.b;
                        n7 = q732.A((int[])object4, n20);
                    }
                    object4 = q732.b(n7);
                }
            } else {
                object2 = this.F;
                int n22 = ((k73)object2).g;
                n4 = ((k73)object2).i + n8;
                if (n22 > n4) {
                    k73 k732;
                    object4 = ((k73)object2).b;
                    n7 = n73.l(object4, n22 -= n8);
                    while (true) {
                        int n24 = n22;
                        n22 = n7;
                        n7 = n24;
                        k732 = this.F;
                        n19 = k732.i;
                        if (n22 == n19 || n22 < 0) break;
                        object4 = k732.b;
                        n7 = n73.l(object4, n22);
                    }
                    object4 = k732.a(n7);
                }
            }
            object3 = new Object();
            ((ui2_0)object3).a = object;
            ((ui2_0)object3).b = object4;
            object = object3;
        }
        this.B0(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o0() {
        int n3;
        int n4;
        int n7;
        b30$a$a b30$a$a;
        int n8;
        Object object;
        Object object2;
        int[] nArray;
        int n10;
        int n14;
        Object object3;
        block12: {
            block13: {
                block10: {
                    block11: {
                        object3 = this.r;
                        n14 = ((ArrayList)object3).isEmpty();
                        if (n14 != 0) {
                            int n15;
                            n14 = this.k;
                            k73 k732 = this.F;
                            this.k = n15 = k732.l() + n14;
                            return;
                        }
                        object3 = this.F;
                        n10 = ((k73)object3).f();
                        int n16 = ((k73)object3).g;
                        int n17 = ((k73)object3).h;
                        nArray = ((k73)object3).b;
                        if (n16 < n17) {
                            object2 = ((k73)object3).j(nArray, n16);
                        } else {
                            n16 = 0;
                            object2 = null;
                        }
                        object = ((k73)object3).e();
                        n8 = this.l;
                        b30$a$a = b30$a.a;
                        n7 = 207;
                        n4 = 3;
                        if (object2 != null) break block10;
                        if (object == null || n10 != n7 || (n3 = (int)(Intrinsics.areEqual(object, b30$a$a) ? 1 : 0)) != 0) break block11;
                        n3 = object.hashCode();
                        int n18 = Integer.rotateLeft(this.P, n4);
                        this.P = n3 = Integer.rotateLeft(n3 ^ n18, n4) ^ n8;
                        break block12;
                    }
                    n3 = Integer.rotateLeft(Integer.rotateLeft(this.P, n4) ^ n10, n4) ^ n8;
                    break block13;
                }
                n3 = object2 instanceof Enum;
                if (n3 != 0) {
                    Object object4 = object2;
                    object4 = (Enum)object2;
                    n3 = ((Enum)object4).ordinal();
                } else {
                    n3 = object2.hashCode();
                }
                int n19 = Integer.rotateLeft(this.P, n4);
                n3 = Integer.rotateLeft(n3 ^ n19, n4);
            }
            this.P = n3;
        }
        n3 = ((k73)object3).g;
        boolean bl2 = n73.h(nArray, n3);
        this.w0(null, bl2);
        this.i0();
        ((k73)object3).d();
        if (object2 == null) {
            if (object != null && n10 == n7 && (n14 = (int)(Intrinsics.areEqual(object, b30$a$a) ? 1 : 0)) == 0) {
                n14 = object.hashCode();
                n10 = Integer.rotateRight(this.P ^ n8, n4);
                this.P = n14 = Integer.rotateRight(n14 ^ n10, n4);
                return;
            }
            n14 = Integer.rotateRight(this.P ^ n8, n4) ^ n10;
        } else {
            n14 = object2 instanceof Enum;
            if (n14 != 0) {
                object2 = (Enum)object2;
                n14 = ((Enum)object2).ordinal();
            } else {
                n14 = object2.hashCode();
            }
            n10 = Integer.rotateRight(this.P, n4);
            n14 ^= n10;
        }
        this.P = n14 = Integer.rotateRight(n14, n4);
    }

    public final void p() {
        this.T(true);
    }

    public final void p0() {
        int n3;
        Object object = this.F;
        int n4 = ((k73)object).i;
        if (n4 >= 0) {
            object = ((k73)object).b;
            n3 = n73.j((int[])object, n4);
        } else {
            n3 = 0;
            object = null;
        }
        this.k = n3;
        this.F.m();
    }

    public final void q(Function0 object) {
        int n3;
        String string2;
        int n4;
        Object object2 = this.L.b;
        object2.getClass();
        I92$A i92$A = I92$A.c;
        object2 = ((zr_1)object2).a;
        ((R92)object2).X(i92$A);
        int n7 = 0;
        StringBuilder stringBuilder = null;
        R92$b.b((R92)object2, 0, object);
        int n8 = ((R92)object2).g;
        int n10 = i92$A.a;
        int n14 = R92.Q((R92)object2, n10);
        int n15 = i92$A.b;
        if (n8 == n14 && (n8 = ((R92)object2).h) == (n14 = R92.Q((R92)object2, n15))) {
            return;
        }
        object = new StringBuilder();
        n14 = 0;
        StringBuilder stringBuilder2 = null;
        int n16 = 0;
        while (true) {
            n4 = 1;
            string2 = ", ";
            if (n14 >= n10) break;
            n4 <<= n14;
            n3 = ((R92)object2).g;
            if ((n4 &= n3) != 0) {
                if (n16 > 0) {
                    ((StringBuilder)object).append(string2);
                }
                String string3 = i92$A.b(n14);
                ((StringBuilder)object).append(string3);
                ++n16;
            }
            ++n14;
        }
        object = ((StringBuilder)object).toString();
        String string4 = "StringBuilder().apply(builderAction).toString()";
        stringBuilder2 = g30.b((String)object, string4);
        n3 = 0;
        while (n7 < n15) {
            int n17 = n4 << n7;
            int n18 = ((R92)object2).h;
            if ((n17 &= n18) != 0) {
                if (n16 > 0) {
                    stringBuilder2.append(string2);
                }
                String string5 = i92$A.c(n7);
                stringBuilder2.append(string5);
                ++n3;
            }
            ++n7;
        }
        object2 = stringBuilder2.toString();
        Intrinsics.checkNotNullExpressionValue(object2, string4);
        stringBuilder = new StringBuilder("Error while pushing ");
        stringBuilder.append(i92$A);
        stringBuilder.append(". Not all arguments were provided. Missing ");
        h30_0.b(stringBuilder, n16, " int arguments (", (String)object, ") and ");
        i30_0.a(stringBuilder, n3, " object arguments (", (String)object2, ").");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void q0(Object var1_1, int var2_2, int var3_3, Object var4_4) {
        block69: {
            block67: {
                block65: {
                    block70: {
                        block68: {
                            block66: {
                                block64: {
                                    var5_5 = this;
                                    var6_6 = var1_1;
                                    var7_7 = var2_2;
                                    var8_8 = var3_3;
                                    var9_9 = var4_4;
                                    this.D0();
                                    var10_10 = this.l;
                                    var11_11 /* !! */  = b30$a.a;
                                    var12_12 = 3;
                                    if (var1_1 != null) ** GOTO lbl23
                                    if (var4_4 != null && var2_2 == (var13_13 = 207) && (var13_13 = (int)Intrinsics.areEqual(var4_4, var11_11 /* !! */ )) == 0) {
                                        var13_13 = var4_4.hashCode();
                                        var14_14 = Integer.rotateLeft(this.P, var12_12);
                                        var12_12 = Integer.rotateLeft(var13_13 ^= var14_14, var12_12);
                                        this.P = var10_10 ^= var12_12;
                                    } else {
                                        var13_13 = Integer.rotateLeft(var5_5.P, var12_12) ^ var7_7;
                                        var12_12 = Integer.rotateLeft(var13_13, var12_12);
                                        var10_10 ^= var12_12;
lbl20:
                                        // 2 sources

                                        while (true) {
                                            var5_5.P = var10_10;
                                            break block64;
                                            break;
                                        }
lbl23:
                                        // 1 sources

                                        var10_10 = var1_1 instanceof Enum;
                                        if (var10_10 != 0) {
                                            var15_15 = var1_1;
                                            var15_15 = (Enum)var1_1;
                                            var10_10 = var15_15.ordinal();
lbl28:
                                            // 2 sources

                                            while (true) {
                                                var13_13 = Integer.rotateLeft(var5_5.P, var12_12);
                                                var10_10 = Integer.rotateLeft(var10_10 ^ var13_13, var12_12);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var10_10 = var1_1.hashCode();
                                        ** continue;
                                    }
                                }
                                var10_10 = 1;
                                if (var6_6 == null) {
                                    var5_5.l = var12_12 = var5_5.l + var10_10;
                                }
                                var12_12 = 0;
                                var16_16 = null;
                                if (var8_8 != 0) {
                                    var13_13 = 1;
                                } else {
                                    var13_13 = 0;
                                    var17_17 = null;
                                }
                                var14_14 = (int)var5_5.O;
                                var18_18 = 0;
                                var19_19 = null;
                                var20_20 = -1;
                                if (var14_14 != 0) {
                                    var21_21 = var5_5.F;
                                    var21_21.k = var14_14 = var21_21.k + var10_10;
                                    var21_21 = var5_5.H;
                                    var14_14 = var21_21.t;
                                    if (var13_13 != 0) {
                                        var21_21.M(var11_11 /* !! */ , var7_7, var11_11 /* !! */ , (boolean)var10_10);
                                    } else if (var9_9 != null) {
                                        if (var6_6 == null) {
                                            var6_6 = var11_11 /* !! */ ;
                                        }
                                        var21_21.M(var6_6, var7_7, var9_9, false);
                                    } else {
                                        if (var6_6 == null) {
                                            var6_6 = var11_11 /* !! */ ;
                                        }
                                        var21_21.M(var6_6, var7_7, var11_11 /* !! */ , false);
                                    }
                                    var6_6 = var5_5.i;
                                    if (var6_6 != null) {
                                        var9_9 = var20_20;
                                        var10_10 = -2 - var14_14;
                                        var21_21 = new do1_0(var7_7, var9_9, var10_10, var20_20);
                                        var7_7 = var5_5.j;
                                        var22_23 = var6_6.b;
                                        var9_9 = new O11(var20_20, var7_7 -= var22_23, 0);
                                        var23_25 = var6_6.e;
                                        var23_25.i(var10_10, var9_9);
                                        var6_6 = var6_6.d;
                                        var6_6.add(var21_21);
                                    }
                                    var5_5.Z((boolean)var13_13, null);
                                    return;
                                }
                                if (var8_8 == var10_10 && (var8_8 = (int)var5_5.x) != 0) {
                                    var8_8 = 1;
                                } else {
                                    var8_8 = 0;
                                    var21_22 = null;
                                }
                                var24_27 = var5_5.i;
                                if (var24_27 != null) break block66;
                                var24_27 = var5_5.F;
                                var14_14 = var24_27.f();
                                if (var8_8 != 0 || var14_14 != var7_7) ** GOTO lbl-1000
                                var24_27 = var5_5.F;
                                var25_28 = var24_27.g;
                                var26_29 = var24_27.h;
                                if (var25_28 < var26_29) {
                                    var27_30 /* !! */  = var24_27.b;
                                    var24_27 = var24_27.j((int[])var27_30 /* !! */ , var25_28);
                                } else {
                                    var14_14 = 0;
                                    var24_27 = null;
                                }
                                var14_14 = (int)Intrinsics.areEqual(var6_6, var24_27);
                                if (var14_14 != 0) {
                                    var5_5.w0(var9_9, (boolean)var13_13);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var28_31 = var5_5.F;
                                    var28_31.getClass();
                                    var27_30 /* !! */  = new ArrayList();
                                    var29_32 = var28_31.k;
                                    if (var29_32 <= 0) {
                                        for (var29_32 = var28_31.g; var29_32 < (var30_33 = var28_31.h); var29_32 += var10_10) {
                                            var32_35 = var29_32 * 5;
                                            var33_36 /* !! */  = var28_31.b;
                                            var18_18 = var33_36 /* !! */ [var32_35];
                                            var15_15 = var28_31.j(var33_36 /* !! */ , var29_32);
                                            var34_37 /* !! */  = n73.h(var33_36 /* !! */ , var29_32);
                                            var12_12 = var34_37 /* !! */  != 0 ? 1 : (var34_37 /* !! */  = n73.j(var33_36 /* !! */ , var29_32));
                                            var31_34 = new do1_0(var18_18, var15_15, var29_32, var12_12);
                                            var27_30 /* !! */ .add(var31_34);
                                            var10_10 = var33_36 /* !! */ [var32_35 += 3];
                                            var10_10 = 1;
                                            var12_12 = 0;
                                            var16_16 = null;
                                            var18_18 = 0;
                                            var19_19 = null;
                                            var20_20 = -1;
                                        }
                                    }
                                    var10_10 = var5_5.j;
                                    var5_5.i = var24_27 = new rq2_0(var10_10, (ArrayList)var27_30 /* !! */ );
                                }
                            }
                            if ((var15_15 = var5_5.i) == null) break block67;
                            if (var6_6 != null) {
                                var24_27 = var2_2;
                                var16_16 = new hl1_0((Integer)var24_27, var6_6);
                            } else {
                                var16_16 = var2_2;
                            }
                            var24_27 = ((OR1)var15_15.f.getValue()).a;
                            var19_19 = var24_27.b(var16_16);
                            if (var19_19 != null) {
                                var20_20 = (int)TypeIntrinsics.isMutableList(var19_19);
                                if (var20_20 != 0) {
                                    var19_19 = TypeIntrinsics.asMutableList(var19_19);
                                    var20_20 = 0;
                                    var33_36 /* !! */  = null;
                                    var28_31 = var19_19.remove(0);
                                    var18_18 = (int)var19_19.isEmpty();
                                    if (var18_18 != 0) {
                                        var24_27.g(var16_16);
                                    }
                                } else {
                                    var24_27.g(var16_16);
                                    var28_31 = var19_19;
                                }
                                var16_16 = "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1";
                                Intrinsics.checkNotNull(var28_31, (String)var16_16);
                            } else {
                                var25_28 = 0;
                                var28_31 = null;
                            }
                            var28_31 = (do1_0)var28_31;
                            var16_16 = var15_15.d;
                            var24_27 = var15_15.e;
                            var18_18 = var15_15.b;
                            if (var8_8 == 0 && var28_31 != null) break block68;
                            var21_22 = var5_5.F;
                            var10_10 = var21_22.k;
                            var20_20 = 1;
                            var21_22.k = var10_10 += var20_20;
                            var5_5.O = var20_20;
                            var5_5.J = null;
                            var21_22 = var5_5.H;
                            var8_8 = (int)var21_22.w;
                            if (var8_8 != 0) {
                                var5_5.H = var21_22 = var5_5.G.i();
                                var21_22.H();
                                var5_5.I = false;
                                var8_8 = 0;
                                var21_22 = null;
                                var5_5.J = null;
                            }
                            var5_5.H.d();
                            var21_22 = var5_5.H;
                            var10_10 = var21_22.t;
                            if (var13_13 != 0) {
                                var20_20 = 1;
                                var21_22.M(var11_11 /* !! */ , var7_7, var11_11 /* !! */ , (boolean)var20_20);
                            } else if (var9_9 != null) {
                                if (var6_6 == null) {
                                    var6_6 = var11_11 /* !! */ ;
                                }
                                var20_20 = 0;
                                var33_36 /* !! */  = null;
                                var21_22.M(var6_6, var7_7, var9_9, false);
                            } else {
                                var20_20 = 0;
                                var33_36 /* !! */  = null;
                                if (var6_6 == null) {
                                    var6_6 = var11_11 /* !! */ ;
                                }
                                var21_22.M(var6_6, var7_7, var11_11 /* !! */ , false);
                            }
                            var6_6 = var5_5.H.b(var10_10);
                            var5_5.M = var6_6;
                            var8_8 = -1;
                            var9_9 = var8_8;
                            var10_10 = -2 - var10_10;
                            var6_6 = new do1_0(var7_7, var9_9, var10_10, var8_8);
                            var7_7 = var5_5.j - var18_18;
                            var57_53 = false;
                            var11_11 /* !! */  = null;
                            var9_9 = new O11(var8_8, var7_7, 0);
                            var24_27.i(var10_10, var9_9);
                            var16_16.add(var6_6);
                            var6_6 = new ArrayList();
                            if (var13_13 != 0) {
                                var12_12 = 0;
                                var16_16 = null;
                            } else {
                                var12_12 = var5_5.j;
                            }
                            var19_19 = new rq2_0(var12_12, (ArrayList)var6_6);
                            break block69;
                        }
                        var16_16.add(var28_31);
                        var35_38 = var28_31.c;
                        var23_26 = (O11)var24_27.c(var35_38);
                        var7_7 = var23_26 != null ? var23_26.b : -1;
                        var5_5.j = var7_7 += var18_18;
                        var23_26 = (O11)var24_27.c(var35_38);
                        var20_20 = var23_26 != null ? var23_26.a : -1;
                        var7_7 = var15_15.c;
                        var8_8 = var20_20 - var7_7;
                        var12_12 = 7;
                        if (var20_20 <= var7_7) break block70;
                        var15_15 = var24_27.c;
                        var11_11 /* !! */  = var24_27.a;
                        var14_14 = var11_11 /* !! */ .length + -2;
                        if (var14_14 >= 0) {
                            var3_3 = var20_20;
                            var25_28 = 0;
                            var28_31 = null;
                            while (true) {
                                var36_39 = var11_11 /* !! */ [var25_28];
                                var38_40 = (var36_39 ^ (long)-1) << var12_12 & var36_39;
                                var40_41 = -9187201950435737472L;
                                cfr_temp_0 = (var38_40 &= var40_41) - var40_41;
                                var34_37 /* !! */  = (int)(cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1));
                                if (var34_37 /* !! */  != 0) {
                                    var26_29 = ~(var25_28 - var14_14) >>> 31;
                                    var30_33 = 8 - var26_29;
                                    for (var29_32 = 0; var29_32 < var30_33; ++var29_32) {
                                        var42_42 = 255L;
                                        var44_43 = var36_39 & var42_42;
                                        var46_44 = 128L;
                                        cfr_temp_1 = var44_43 - var46_44;
                                        var34_37 /* !! */  = (int)(cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1));
                                        if (var34_37 /* !! */  < 0) {
                                            var34_37 /* !! */  = (var25_28 << 3) + var29_32;
                                            var48_45 = var15_15[var34_37 /* !! */ ];
                                            var27_30 /* !! */  = var48_45;
                                            var27_30 /* !! */  = (O11)var48_45;
                                            var12_12 = var27_30 /* !! */ .a;
                                            var49_46 = var15_15;
                                            var10_10 = var3_3;
                                            if (var12_12 == var3_3) {
                                                var27_30 /* !! */ .a = var7_7;
                                            } else if (var7_7 <= var12_12 && var12_12 < var3_3) {
                                                var27_30 /* !! */ .a = ++var12_12;
                                            }
lbl266:
                                            // 5 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var49_46 = var15_15;
                                        var10_10 = var3_3;
                                        ** continue;
                                        var12_12 = 8;
                                        var36_39 >>= var12_12;
                                        var3_3 = var10_10;
                                        var15_15 = var49_46;
                                        var12_12 = 7;
                                    }
                                    var49_46 = var15_15;
                                    var12_12 = 8;
                                    var10_10 = var3_3;
                                    if (var30_33 != var12_12) break block65;
                                } else {
                                    var49_46 = var15_15;
                                    var10_10 = var3_3;
                                }
                                if (var25_28 != var14_14) {
                                    ++var25_28;
                                    var3_3 = var10_10;
                                    var15_15 = var49_46;
                                    var12_12 = 7;
                                    continue;
                                }
                                break block65;
                                break;
                            }
                        }
                        break block65;
                    }
                    var10_10 = var20_20;
                    if (var7_7 <= var20_20) break block65;
                    var11_11 /* !! */  = var24_27.c;
                    var16_16 = var24_27.a;
                    var14_14 = ((Object)var16_16).length + -2;
                    if (var14_14 < 0) break block65;
                    var18_18 = 0;
                    var19_19 = null;
                    while (true) {
                        block72: {
                            block71: {
                                var50_47 = var16_16[var18_18];
                                var52_48 = var50_47 ^ (long)-1;
                                var34_37 /* !! */  = 7;
                                var52_48 = var52_48 << var34_37 /* !! */  & var50_47;
                                var40_41 = -9187201950435737472L;
                                cfr_temp_2 = (var52_48 &= var40_41) - var40_41;
                                var54_49 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                if (var54_49 == false) break block71;
                                var29_32 = ~(var18_18 - var14_14) >>> 31;
                                var26_29 = 8;
                                var29_32 = 8 - var29_32;
                                var31_34 = null;
                                for (var30_33 = 0; var30_33 < var29_32; ++var30_33) {
                                    var42_42 = 255L;
                                    var44_43 = var50_47 & var42_42;
                                    var46_44 = 128L;
                                    cfr_temp_3 = var44_43 - var46_44;
                                    var55_50 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                    if (var55_50 >= 0) ** GOTO lbl335
                                    var54_49 = (var18_18 << 3) + var30_33;
                                    var27_30 /* !! */  = var56_51 /* !! */  = var11_11 /* !! */ [var54_49];
                                    var27_30 /* !! */  = (O11)var56_51 /* !! */ ;
                                    var56_51 /* !! */  = var11_11 /* !! */ ;
                                    var57_52 = var27_30 /* !! */ .a;
                                    if (var57_52 == var10_10) {
                                        var27_30 /* !! */ .a = var7_7;
                                    } else {
                                        var49_46 = var16_16;
                                        var12_12 = var10_10 + 1;
                                        if (var12_12 <= var57_52 && var57_52 < var7_7) {
                                            var27_30 /* !! */ .a = var57_52 += -1;
                                        }
lbl333:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl335:
                                        // 1 sources

                                        var56_51 /* !! */  = var11_11 /* !! */ ;
                                    }
                                    var49_46 = var16_16;
                                    ** continue;
                                    var57_52 = 8;
                                    var50_47 >>= var57_52;
                                    var11_11 /* !! */  = var56_51 /* !! */ ;
                                    var16_16 = var49_46;
                                }
                                var56_51 /* !! */  = var11_11 /* !! */ ;
                                var49_46 = var16_16;
                                var57_52 = 8;
                                var42_42 = 255L;
                                var46_44 = 128L;
                                if (var29_32 != var57_52) break;
                                break block72;
                            }
                            var56_51 /* !! */  = var11_11 /* !! */ ;
                            var49_46 = var16_16;
                            var57_52 = 8;
                            var42_42 = 255L;
                            var46_44 = 128L;
                        }
                        if (var18_18 == var14_14) break;
                        ++var18_18;
                        var11_11 /* !! */  = var56_51 /* !! */ ;
                        var16_16 = var49_46;
                    }
                }
                var23_26 = var5_5.L;
                var10_10 = var23_26.f;
                var11_11 /* !! */  = var23_26.a.F;
                var57_52 = var11_11 /* !! */ .g;
                var23_26.f = var57_52 = var35_38 - var57_52 + var10_10;
                var15_15 = var5_5.F;
                var15_15.k(var35_38);
                if (var8_8 > 0) {
                    var35_38 = 0;
                    var23_26.h(false);
                    var23_26.i();
                    var6_6 = var23_26.b;
                    var6_6.getClass();
                    var23_26 = I92$r.c;
                    var6_6 = var6_6.a;
                    var6_6.X((I92)var23_26);
                    var15_15 = null;
                    R92$b.a((R92)var6_6, 0, var8_8);
                    var8_8 = var6_6.g;
                    var10_10 = var23_26.a;
                    var57_52 = R92.Q((R92)var6_6, var10_10);
                    var12_12 = var23_26.b;
                    if (var8_8 != var57_52 || (var8_8 = var6_6.h) != (var57_52 = R92.Q((R92)var6_6, var12_12))) {
                        var21_22 = new StringBuilder();
                        var22_24 = 0;
                        var9_9 = null;
                        var57_52 = 0;
                        var11_11 /* !! */  = null;
                        while (true) {
                            var17_17 = ", ";
                            if (var22_24 >= var10_10) break;
                            var18_18 = 1 << var22_24;
                            var14_14 = var6_6.g & var18_18;
                            if (var14_14 != 0) {
                                if (var57_52 > 0) {
                                    var21_22.append(var17_17);
                                }
                                var17_17 = var23_26.b(var22_24);
                                var21_22.append(var17_17);
                                ++var57_52;
                            }
                            ++var22_24;
                        }
                        var21_22 = var21_22.toString();
                        var9_9 = "StringBuilder().apply(builderAction).toString()";
                        var15_15 = g30.b((String)var21_22, (String)var9_9);
                        var24_27 = null;
                        var18_18 = 0;
                        var19_19 = null;
                        for (var14_14 = 0; var14_14 < var12_12; ++var14_14) {
                            var25_28 = 1 << var14_14;
                            var20_20 = var6_6.h & var25_28;
                            if (var20_20 == 0) continue;
                            if (var57_52 > 0) {
                                var15_15.append(var17_17);
                            }
                            var33_36 /* !! */  = (int[])var23_26.c(var14_14);
                            var15_15.append((String)var33_36 /* !! */ );
                            ++var18_18;
                        }
                        var6_6 = var15_15.toString();
                        Intrinsics.checkNotNullExpressionValue(var6_6, (String)var9_9);
                        var9_9 = new StringBuilder("Error while pushing ");
                        var9_9.append(var23_26);
                        var9_9.append(". Not all arguments were provided. Missing ");
                        h30_0.b((StringBuilder)var9_9, var57_52, " int arguments (", (String)var21_22, ") and ");
                        i30_0.a((StringBuilder)var9_9, var18_18, " object arguments (", (String)var6_6, ").");
                        throw null;
                    }
                }
                var5_5.w0(var9_9, (boolean)var13_13);
            }
            var8_8 = 0;
            var21_22 = null;
            var18_18 = 0;
            var19_19 = null;
        }
        var5_5.Z((boolean)var13_13, (rq2_0)var19_19);
    }

    public final void r() {
        HashMap hashMap;
        boolean bl2;
        this.p = bl2 = true;
        this.B = bl2;
        this.c.g();
        this.G.g();
        q73 q732 = this.H;
        Object object = q732.a;
        q732.e = hashMap = ((l73)object).i;
        q732.f = object = ((l73)object).j;
    }

    public final void r0() {
        this.q0(null, -127, 0, null);
    }

    public final CF2 s() {
        return this.b0();
    }

    public final void s0(int n3, F92 f92) {
        this.q0(f92, n3, 0, null);
    }

    public final void t() {
        int n3 = this.x;
        if (n3 != 0) {
            k73 k732 = this.F;
            n3 = k732.i;
            int n4 = this.y;
            if (n3 == n4) {
                this.y = n3 = -1;
                this.x = false;
            }
        }
        this.T(false);
    }

    public final void t0() {
        int n3 = 1;
        this.q0(null, 125, n3, null);
        this.q = n3;
    }

    public final void u(int n3) {
        this.q0(null, n3, 0, null);
    }

    /*
     * Unable to fully structure code
     */
    public final void u0(MB2 var1_1) {
        block12: {
            block13: {
                block15: {
                    block14: {
                        var2_2 = this.P();
                        var3_3 = p30_0.b;
                        this.s0(201, (F92)var3_3);
                        var3_3 = this.v();
                        var4_4 = b30$a.a;
                        var5_5 = Intrinsics.areEqual(var3_3, var4_4);
                        if (var5_5) {
                            var6_6 = false;
                            var3_3 = null;
                        } else {
                            var4_4 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>";
                            Intrinsics.checkNotNull(var3_3, (String)var4_4);
                            var3_3 = (pa3_0)var3_3;
                        }
                        var4_4 = var1_1.a;
                        var7_7 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>";
                        Intrinsics.checkNotNull(var4_4, var7_7);
                        Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                        var8_8 = var4_4.b((MB2)var1_1, (pa3_0)var3_3);
                        var6_6 = Intrinsics.areEqual(var8_8, var3_3);
                        var9_9 = true;
                        if (var6_6 ^= var9_9) {
                            this.o(var8_8);
                        }
                        if (!(var10_10 = this.O)) break block13;
                        var11_11 = (int)var1_1.h;
                        if (var11_11 != 0) break block14;
                        Intrinsics.checkNotNull(var4_4, var7_7);
                        var11_11 = var2_2.containsKey(var4_4);
                        if (var11_11 != 0) break block15;
                    }
                    var2_2 = var2_2.u((H30)var4_4, var8_8);
                }
                this.I = var9_9;
lbl33:
                // 2 sources

                while (true) {
                    var9_9 = false;
                    break block12;
                    break;
                }
            }
            var12_12 = this.F;
            var13_13 = var12_12.g;
            var14_14 = var12_12.b;
            var12_12 = var12_12.b(var14_14, var13_13);
            var15_15 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap";
            Intrinsics.checkNotNull(var12_12, var15_15);
            var12_12 = (rq2_1)var12_12;
            var13_13 = (int)this.h();
            if (var13_13 != 0 && !var6_6) ** GOTO lbl-1000
            var11_11 = (int)var1_1.h;
            if (var11_11 == 0) {
                Intrinsics.checkNotNull(var4_4, var7_7);
                var11_11 = (int)var2_2.containsKey(var4_4);
                ** if (var11_11 == 0) goto lbl-1000
            }
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                var2_2 = var12_12;
                ** GOTO lbl55
            }
lbl-1000:
            // 2 sources

            {
                var2_2 = var1_1 = var2_2.u((H30)var4_4, var8_8);
            }
lbl55:
            // 2 sources

            ** while ((var11_11 = (int)this.x) == 0 && var12_12 == var2_2)
        }
        if (var9_9 && (var11_11 = this.O) == 0) {
            this.k0((rq2_1)var2_2);
        }
        var11_11 = this.v;
        this.w.b(var11_11);
        this.v = var9_9;
        this.J = var2_2;
        var1_1 = p30_0.c;
        this.q0(var1_1, 202, 0, var2_2);
    }

    public final Object v() {
        boolean bl2 = this.O;
        Object object = b30$a.a;
        if (bl2) {
            this.D0();
        } else {
            Object object2 = this.F.h();
            boolean bl3 = this.x;
            if (!bl3 || (bl3 = object2 instanceof vO2)) {
                boolean bl4 = object2 instanceof ui2_0;
                if (bl4) {
                    object2 = (ui2_0)object2;
                    object = ((ui2_0)object2).a;
                } else {
                    object = object2;
                }
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void v0(MB2[] mB2Array) {
        int n3;
        int n4;
        Object object;
        block7: {
            block5: {
                rq2_1 rq2_12;
                F92 f92;
                int n7;
                Object object2;
                block6: {
                    int n8;
                    block4: {
                        object = this.P();
                        object2 = p30_0.b;
                        this.s0(201, (F92)object2);
                        boolean bl2 = this.O;
                        n7 = 204;
                        f92 = p30_0.d;
                        n4 = 1;
                        if (!bl2) break block4;
                        object2 = qq2_0.g;
                        rq2_1 rq2_13 = N30.b(mB2Array, (rq2_1)object, (rq2_1)object2);
                        object = object.b();
                        ((Uq2)object).putAll((Map)rq2_13);
                        object = ((Qq2$a)object).i();
                        this.s0(n7, f92);
                        this.e0();
                        this.B0(object);
                        this.e0();
                        this.B0(rq2_13);
                        this.T(false);
                        this.I = n4;
                        break block5;
                    }
                    object2 = this.F;
                    int n10 = ((k73)object2).g;
                    object2 = ((k73)object2).g(n10, 0);
                    String string2 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap";
                    Intrinsics.checkNotNull(object2, string2);
                    object2 = (rq2_1)object2;
                    Object object3 = this.F;
                    int n14 = ((k73)object3).g;
                    object3 = ((k73)object3).g(n14, n4);
                    Intrinsics.checkNotNull(object3, string2);
                    object3 = (rq2_1)object3;
                    rq2_12 = N30.b(mB2Array, (rq2_1)object, (rq2_1)object3);
                    n10 = (int)(this.h() ? 1 : 0);
                    if (n10 == 0 || (n10 = (int)(this.x ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object3, rq2_12) ? 1 : 0)) == 0) break block6;
                    n3 = this.k;
                    this.k = n8 = this.F.l() + n3;
                    object = object2;
                    break block5;
                }
                object = object.b();
                ((Uq2)object).putAll((Map)rq2_12);
                object = ((Qq2$a)object).i();
                this.s0(n7, f92);
                this.e0();
                this.B0(object);
                this.e0();
                this.B0(rq2_12);
                this.T(false);
                n3 = (int)(this.x ? 1 : 0);
                if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0)) == 0) break block7;
            }
            n4 = 0;
        }
        if (n4 != 0 && (n3 = this.O) == 0) {
            this.k0((rq2_1)object);
        }
        n3 = this.v;
        this.w.b(n3);
        this.v = n4;
        this.J = object;
        F92 f92 = p30_0.c;
        this.q0(f92, 202, 0, object);
    }

    public final l73 w() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w0(Object object, boolean n3) {
        Object object2;
        if (n3 != 0) {
            object = this.F;
            n3 = ((k73)object).k;
            if (n3 > 0) return;
            int[] nArray = ((k73)object).b;
            int n4 = ((k73)object).g;
            n3 = (int)(n73.h(nArray, n4) ? 1 : 0);
            if (n3 != 0) {
                ((k73)object).n();
                return;
            }
            sn2.b("Expected a node group");
            throw null;
        }
        if (object != null && (object2 = this.F.e()) != object) {
            object2 = this.L;
            object2.getClass();
            int n7 = 0;
            StringBuilder stringBuilder = null;
            ((d30_0)object2).h(false);
            object2 = ((d30_0)object2).b;
            object2.getClass();
            I92$E i92$E = I92$E.c;
            object2 = ((zr_1)object2).a;
            ((R92)object2).X(i92$E);
            R92$b.b((R92)object2, 0, object);
            int n8 = ((R92)object2).g;
            int n10 = i92$E.a;
            int n14 = R92.Q((R92)object2, n10);
            int n15 = i92$E.b;
            if (n8 != n14 || (n8 = ((R92)object2).h) != (n14 = R92.Q((R92)object2, n15))) {
                int n16;
                String string2;
                int n17;
                object = new StringBuilder();
                n14 = 0;
                StringBuilder stringBuilder2 = null;
                int n18 = 0;
                while (true) {
                    n17 = 1;
                    string2 = ", ";
                    if (n14 >= n10) break;
                    n17 <<= n14;
                    n16 = ((R92)object2).g;
                    if ((n17 &= n16) != 0) {
                        if (n18 > 0) {
                            ((StringBuilder)object).append(string2);
                        }
                        String string3 = i92$E.b(n14);
                        ((StringBuilder)object).append(string3);
                        ++n18;
                    }
                    ++n14;
                }
                object = ((StringBuilder)object).toString();
                String string4 = "StringBuilder().apply(builderAction).toString()";
                stringBuilder2 = g30.b((String)object, string4);
                n16 = 0;
                while (true) {
                    if (n7 >= n15) {
                        object2 = stringBuilder2.toString();
                        Intrinsics.checkNotNullExpressionValue(object2, string4);
                        stringBuilder = new StringBuilder("Error while pushing ");
                        stringBuilder.append(i92$E);
                        stringBuilder.append(". Not all arguments were provided. Missing ");
                        h30_0.b(stringBuilder, n18, " int arguments (", (String)object, ") and ");
                        i30_0.a(stringBuilder, n16, " object arguments (", (String)object2, ").");
                        throw null;
                    }
                    int n19 = n17 << n7;
                    int n20 = ((R92)object2).h;
                    if ((n19 &= n20) != 0) {
                        if (n18 > 0) {
                            stringBuilder2.append(string2);
                        }
                        String string5 = i92$E.c(n7);
                        stringBuilder2.append(string5);
                        ++n16;
                    }
                    ++n7;
                }
            }
        }
        object = this.F;
        ((k73)object).n();
    }

    public final boolean x(Object object) {
        boolean bl2;
        Object object2 = this.e0();
        if (object2 != object) {
            this.B0(object);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void x0() {
        boolean bl2;
        boolean bl3;
        this.l = 0;
        l73 l732 = this.c;
        Object object = l732.h();
        this.F = object;
        int n3 = 100;
        this.q0(null, n3, 0, null);
        object = this.b;
        ((A30)object).p();
        Object object2 = ((A30)object).g();
        this.t = object2;
        int n4 = this.v;
        Object object3 = this.w;
        ((fj1)object3).b(n4);
        object2 = this.t;
        this.v = bl3 = this.J(object2);
        this.J = null;
        boolean bl4 = this.p;
        if (!bl4) {
            boolean bl5;
            this.p = bl5 = ((A30)object).e();
        }
        if (!(bl2 = this.B)) {
            boolean bl6;
            this.B = bl6 = ((A30)object).f();
        }
        object2 = this.t;
        object3 = li1_0.a;
        if ((object2 = (Set)N30.a((rq2_1)object2, (H30)object3)) != null) {
            object2.add(l732);
            ((A30)object).m((Set)object2);
        }
        int n7 = ((A30)object).h();
        this.q0(null, n7, 0, null);
    }

    public final void y(Object object) {
        Object object2;
        int n3 = this.O;
        int n4 = 207;
        if (n3 == 0 && (n3 = ((k73)(object2 = this.F)).f()) == n4 && (n3 = (int)(Intrinsics.areEqual(object2 = this.F.e(), object) ? 1 : 0)) == 0 && (n3 = this.y) < 0) {
            object2 = this.F;
            this.y = n3 = ((k73)object2).g;
            n3 = 1;
            this.x = n3;
        }
        this.q0(null, n4, 0, object);
    }

    public final boolean y0(CF2 object, Object object2) {
        Object object3 = ((CF2)object).c;
        int n3 = 0;
        Object object4 = null;
        if (object3 == null) {
            return false;
        }
        Object[] objectArray = this.F.a;
        int n4 = objectArray.d((Ae)object3);
        int n7 = this.E;
        if (n7 != 0) {
            objectArray = this.F;
            n7 = objectArray.g;
            if (n4 >= n7) {
                object4 = this.r;
                n7 = p30_0.f(n4, (List)object4);
                int n8 = 1;
                Object[] objectArray2 = null;
                if (n7 < 0) {
                    n7 = -(n7 + n8);
                    boolean bl2 = object2 instanceof np0_0;
                    if (!bl2) {
                        object2 = null;
                    }
                    objectArray2 = new hk1((CF2)object, n4, object2);
                    ((ArrayList)object4).add(n7, objectArray2);
                } else {
                    object = (hk1)((ArrayList)object4).get(n7);
                    n4 = object2 instanceof np0_0;
                    if (n4 != 0) {
                        object3 = ((hk1)object).c;
                        if (object3 == null) {
                            ((hk1)object).c = object2;
                        } else {
                            n3 = object3 instanceof pr1_1;
                            if (n3 != 0) {
                                object3 = (pr1_1)object3;
                                ((pr1_1)object3).d(object2);
                            } else {
                                n3 = gt2_1.a;
                                object4 = new pr1_1(2);
                                n7 = ((pr1_1)object4).f(object3);
                                objectArray2 = ((ft2_0)object4).b;
                                objectArray2[n7] = object3;
                                n4 = ((pr1_1)object4).f(object2);
                                objectArray = ((ft2_0)object4).b;
                                objectArray[n4] = object2;
                                ((hk1)object).c = object4;
                            }
                        }
                    } else {
                        ((hk1)object).c = null;
                    }
                }
                return n8 != 0;
            }
        }
        return false;
    }

    public final void z(int n3, Object object) {
        this.q0(object, n3, 0, null);
    }

    public final void z0(int n3, int n4) {
        int n7 = this.C0(n3);
        if (n7 != n4) {
            if (n3 < 0) {
                rr1_0 rr1_02 = this.o;
                if (rr1_02 == null) {
                    this.o = rr1_02 = new rr1_0();
                }
                rr1_02.g(n3, n4);
            } else {
                int[] nArray = this.n;
                if (nArray == null) {
                    n7 = this.F.c;
                    nArray = new int[n7];
                    int n8 = -1;
                    rp_1.p(nArray, n8);
                    this.n = nArray;
                }
                nArray[n3] = n4;
            }
        }
    }
}

