/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AndroidComposeView$r;
import java.util.AbstractCollection;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class YK1 {
    public final xp1_0 a;
    public final jp0 b;
    public boolean c;
    public boolean d;
    public final R82 e;
    public final WR1 f;
    public final long g;
    public final WR1 h;
    public c60 i;

    public YK1(xp1_0 object) {
        this.a = object;
        this.b = object = new jp0();
        this.e = object = new R82();
        int n3 = 16;
        Object[] objectArray = new Sg2$a[n3];
        this.f = object = new WR1(objectArray);
        this.g = 1L;
        Object[] objectArray2 = new YK1$a[n3];
        this.h = object = new WR1(objectArray2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean b(xp1_0 var0, c60 var1_1) {
        block10: {
            var2_2 = var0.c;
            if (var2_2 == null) {
                return false;
            }
            var3_3 /* !! */  = var0.z;
            if (var1_1 == null) ** GOTO lbl16
            if (var2_2 != null) {
                var2_2 = var3_3 /* !! */ .s;
                Intrinsics.checkNotNull(var2_2);
                var4_4 = var1_1.a;
                var6_6 = var2_2.z0(var4_4);
            } else {
                while (true) {
                    var6_6 = false;
                    var1_1 = null;
                    break block10;
                    break;
                }
lbl16:
                // 1 sources

                if ((var3_3 /* !! */  = (var1_1 = var3_3 /* !! */ .s) != null ? var1_1.m : null) == null || var2_2 == null) ** continue;
                Intrinsics.checkNotNull(var1_1);
                var4_5 = var3_3 /* !! */ .a;
                var6_6 = var1_1.z0(var4_5);
            }
        }
        var2_2 = var0.A();
        if (var6_6 && var2_2 != null) {
            var3_3 /* !! */  = var2_2.c;
            var7_7 = 3;
            if (var3_3 /* !! */  == null) {
                xp1_0.Z((xp1_0)var2_2, false, var7_7);
            } else {
                var3_3 /* !! */  = var0.y();
                if (var3_3 /* !! */  == (var8_8 = Xp1$f.InMeasureBlock)) {
                    xp1_0.X((xp1_0)var2_2, false, var7_7);
                } else if ((var0 = var0.y()) == (var3_3 /* !! */  = Xp1$f.InLayoutBlock)) {
                    var2_2.W(false);
                }
            }
        }
        return var6_6;
    }

    public static boolean c(xp1_0 object, c60 c602) {
        boolean bl2 = c602 != null ? object.R(c602) : xp1_0.S(object);
        xp1_0 xp1_02 = object.A();
        if (bl2 && xp1_02 != null) {
            object = object.z.r.k;
            Xp1$f xp1$f = Xp1$f.InMeasureBlock;
            if (object == xp1$f) {
                int n3 = 3;
                xp1_0.Z(xp1_02, false, n3);
            } else {
                xp1$f = Xp1$f.InLayoutBlock;
                if (object == xp1$f) {
                    xp1_02.Y(false);
                }
            }
        }
        return bl2;
    }

    public static boolean h(xp1_0 xp1_02) {
        boolean bl2;
        bq1 bq12 = xp1_02.z;
        boolean bl3 = bq12.d;
        if (bl3 && (bl2 = YK1.i(xp1_02))) {
            bl2 = true;
        } else {
            bl2 = false;
            xp1_02 = null;
        }
        return bl2;
    }

    public static boolean i(xp1_0 object) {
        boolean bl2;
        object = ((xp1_0)object).z.r;
        Xp1$f xp1$f = ((bq1$b)object).k;
        Xp1$f xp1$f2 = Xp1$f.InMeasureBlock;
        if (xp1$f != xp1$f2 && !(bl2 = ((Sc)(object = ((bq1$b)object).u)).f())) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void a(boolean n3) {
        int n4;
        Object object;
        Object object2;
        R82 r82 = this.e;
        int n7 = 1;
        if (n3 != 0) {
            object2 = r82.a;
            ((WR1)object2).g();
            object = this.a;
            ((WR1)object2).b(object);
            ((xp1_0)object).H = n7;
        }
        object2 = Q82.a;
        object = r82.a;
        ((WR1)object).p((Comparator)object2);
        n3 = ((WR1)object).c;
        xp1_0[] xp1_0Array = r82.b;
        if (xp1_0Array == null || (n4 = xp1_0Array.length) < n3) {
            int n8 = Math.max(16, n3);
            xp1_0Array = new xp1_0[n8];
        }
        r82.b = null;
        for (n4 = 0; n4 < n3; ++n4) {
            Object object3;
            xp1_0Array[n4] = object3 = ((WR1)object).a[n4];
        }
        ((WR1)object).g();
        n3 -= n7;
        while ((n7 = -1) < n3) {
            xp1_0 xp1_02 = xp1_0Array[n3];
            Intrinsics.checkNotNull(xp1_02);
            boolean bl2 = xp1_02.H;
            if (bl2) {
                R82.a(xp1_02);
            }
            n3 += -1;
        }
        r82.b = xp1_0Array;
    }

    public final void d() {
        WR1 wR1 = this.h;
        int n3 = wR1.l();
        if (n3 != 0) {
            n3 = wR1.c;
            if (n3 > 0) {
                Object[] objectArray = wR1.a;
                int n4 = 0;
                do {
                    Object object = (YK1$a)objectArray[n4];
                    xp1_0 xp1_02 = ((YK1$a)object).a;
                    boolean bl2 = xp1_02.e();
                    if (!bl2) continue;
                    bl2 = ((YK1$a)object).b;
                    int n7 = 2;
                    boolean bl3 = ((YK1$a)object).c;
                    object = ((YK1$a)object).a;
                    if (!bl2) {
                        xp1_0.Z((xp1_0)object, bl3, n7);
                        continue;
                    }
                    xp1_0.X((xp1_0)object, bl3, n7);
                } while (++n4 < n3);
            }
            wR1.g();
        }
    }

    public final void e(xp1_0 objectArray) {
        objectArray = objectArray.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                Boolean bl2;
                xp1_0 xp1_02;
                Object object;
                boolean bl3;
                if (!(bl3 = Intrinsics.areEqual(object = (xp1_02 = (xp1_0)objectArray[n4]).M(), bl2 = Boolean.TRUE)) || (bl3 = xp1_02.I)) continue;
                object = this.b;
                boolean bl4 = true;
                bl3 = ((jp0)object).b(xp1_02, bl4);
                if (bl3) {
                    xp1_02.N();
                }
                this.e(xp1_02);
            } while (++n4 < n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(xp1_0 xp1_02, boolean bl2) {
        Object object = this.b;
        object = bl2 ? ((jp0)object).a : ((jp0)object).b;
        object = ((ip0_0)object).c;
        boolean bl3 = ((AbstractCollection)object).isEmpty();
        if (bl3) {
            return;
        }
        bl3 = this.c;
        if (!bl3) {
            bh1_1.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (bl2) {
            object = xp1_02.z;
            bl3 = ((bq1)object).g;
        } else {
            object = xp1_02.z;
            bl3 = ((bq1)object).d;
        }
        if (bl3 ^= true) {
            this.g(xp1_02, bl2);
            return;
        }
        bh1_1.b("node not yet measured");
        throw null;
    }

    public final void g(xp1_0 xp1_02, boolean bl2) {
        Object object = xp1_02.D();
        int n3 = object.c;
        jp0 jp02 = this.b;
        if (n3 > 0) {
            object = object.a;
            int n4 = 0;
            do {
                Object object2;
                Object object3;
                boolean bl3;
                xp1_0 xp1_03 = (xp1_0)object[n4];
                boolean bl4 = true;
                if ((bl2 || !(bl3 = YK1.i(xp1_03))) && (!bl2 || (object3 = xp1_03.y()) != (object2 = Xp1$f.InMeasureBlock) && ((object3 = xp1_03.z.s) == null || (object3 = ((bq1$a_0)object3).r) == null || (bl3 = ((Sc)object3).f()) != bl4))) continue;
                bl3 = iq1_1.b(xp1_03);
                object2 = xp1_03.z;
                if (bl3 && !bl2) {
                    bl3 = ((bq1)object2).g;
                    if (bl3 && (bl3 = jp02.b(xp1_03, bl4))) {
                        this.m(xp1_03, bl4, false);
                    } else {
                        this.f(xp1_03, bl4);
                    }
                }
                bl4 = bl2 ? ((bq1)object2).g : ((bq1)object2).d;
                if (bl4 && (bl4 = jp02.b(xp1_03, bl2))) {
                    this.m(xp1_03, bl2, false);
                }
                if (bl4 = bl2 ? ((bq1)object2).g : ((bq1)object2).d) continue;
                this.g(xp1_03, bl2);
            } while (++n4 < n3);
        }
        object = xp1_02.z;
        boolean bl5 = bl2 ? object.g : object.d;
        if (bl5 && (bl5 = jp02.b(xp1_02, bl2))) {
            this.m(xp1_02, bl2, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(AndroidComposeView$r var1_1) {
        block15: {
            block16: {
                block14: {
                    block17: {
                        var2_3 = this.b;
                        var3_4 = this.a;
                        var4_5 = var3_4.e();
                        var5_6 = 0;
                        if (!var4_5) {
                            bh1_1.b("performMeasureAndLayout called with unattached root");
                            throw null;
                        }
                        var4_5 = var3_4.L();
                        if (!var4_5) {
                            bh1_1.b("performMeasureAndLayout called with unplaced root");
                            throw null;
                        }
                        var4_5 = this.c;
                        var6_7 = 1;
                        if (!(var4_5 ^= var6_7)) {
                            bh1_1.b("performMeasureAndLayout called during measure layout");
                            throw null;
                        }
                        var7_8 = this.i;
                        var5_6 = 0;
                        if (var7_8 == null) ** GOTO lbl29
                        this.c = var6_7;
                        this.d = var6_7;
                        var4_5 = var2_3.c();
                        if (!var4_5) {
                            var4_5 = false;
                            var7_8 = null;
                            break block14;
                        }
                        break block17;
lbl29:
                        // 1 sources

                        var4_5 = false;
                        var7_8 = null;
                        break block15;
                    }
                    var4_5 = false;
                    var7_8 = null;
                    while (true) {
                        var8_9 = var2_3.c();
                        var9_10 = var2_3.a;
                        if (!var8_9) break;
                        var10_11 = var9_10.c;
                        var8_9 = var10_11.isEmpty() ^ var6_7;
                        if (var8_9) {
                            var11_12 = var9_10.c;
                            var11_12 = var11_12.first();
                            var11_12 = (xp1_0)var11_12;
                        } else {
                            var9_10 = var2_3.b;
                            var11_12 = var9_10.c;
                            var11_12 = var11_12.first();
                            var11_12 = (xp1_0)var11_12;
                        }
                        var9_10.c((xp1_0)var11_12);
                        var8_9 = this.m((xp1_0)var11_12, (boolean)var8_9, (boolean)var6_7);
                        if (var11_12 != var3_4 || !var8_9) continue;
                        var4_5 = true;
                    }
                    if (var1_1 == null) break block14;
                    try {
                        var1_1.invoke();
                    }
                    catch (Throwable var1_2) {
                        break block16;
                    }
                }
                this.c = false;
                this.d = false;
                break block15;
            }
            this.c = false;
            this.d = false;
            throw var1_2;
        }
        var1_1 = this.f;
        var12_13 = var1_1.c;
        if (var12_13 > 0) {
            var3_4 = var1_1.a;
            do {
                var10_11 = (Sg2$a)var3_4[var5_6];
                var10_11.h();
            } while ((var5_6 += var6_7) < var12_13);
        }
        var1_1.g();
        return var4_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(xp1_0 object, long l2) {
        int n3;
        int n4;
        int n7;
        Object object2;
        block17: {
            Throwable throwable2;
            block16: {
                Object object3;
                block18: {
                    Boolean bl2;
                    boolean bl3;
                    block15: {
                        bl3 = ((xp1_0)object).I;
                        if (bl3) {
                            return;
                        }
                        object2 = this.a;
                        n7 = Intrinsics.areEqual(object, object2);
                        n4 = 1;
                        object3 = null;
                        if ((n7 ^= n4) == 0) {
                            bh1_1.b("measureAndLayout called on root");
                            throw null;
                        }
                        n7 = ((xp1_0)object2).e();
                        if (n7 == 0) {
                            bh1_1.b("performMeasureAndLayout called with unattached root");
                            throw null;
                        }
                        bl3 = ((xp1_0)object2).L();
                        if (!bl3) {
                            bh1_1.b("performMeasureAndLayout called with unplaced root");
                            throw null;
                        }
                        bl3 = this.c ^ n4;
                        if (!bl3) {
                            bh1_1.b("performMeasureAndLayout called during measure layout");
                            throw null;
                        }
                        object2 = this.i;
                        n7 = 0;
                        if (object2 == null) break block17;
                        this.c = n4;
                        this.d = false;
                        try {
                            object2 = this.b;
                            object3 = ((jp0)object2).a;
                            ((ip0_0)object3).c((xp1_0)object);
                            object2 = ((jp0)object2).b;
                            ((ip0_0)object2).c((xp1_0)object);
                            object2 = new c60(l2);
                            bl3 = YK1.b((xp1_0)object, (c60)object2);
                            object3 = ((xp1_0)object).z;
                            if (bl3) break block15;
                        }
                        catch (Throwable throwable2) {
                            break block16;
                        }
                        bl3 = ((bq1)object3).h;
                        if (!bl3) break block18;
                    }
                    if (bl3 = Intrinsics.areEqual(object2 = ((xp1_0)object).M(), bl2 = Boolean.TRUE)) {
                        ((xp1_0)object).N();
                    }
                }
                this.e((xp1_0)object);
                object2 = new c60(l2);
                YK1.c((xp1_0)object, (c60)object2);
                n3 = (int)(((bq1)object3).e ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(((xp1_0)object).L() ? 1 : 0)) != 0) {
                    ((xp1_0)object).V();
                    Object object4 = this.e;
                    object4 = ((R82)object4).a;
                    ((WR1)object4).b(object);
                    ((xp1_0)object).H = n4;
                }
                this.d();
                this.c = false;
                this.d = false;
                break block17;
            }
            this.c = false;
            this.d = false;
            throw throwable2;
        }
        object = this.f;
        n3 = ((WR1)object).c;
        if (n3 > 0) {
            Object[] objectArray = ((WR1)object).a;
            do {
                object2 = (Sg2$a)objectArray[n7];
                object2.h();
            } while ((n7 += n4) < n3);
        }
        ((WR1)object).g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        Throwable throwable2;
        block7: {
            xp1_0 xp1_02;
            block5: {
                block6: {
                    Object object = this.b;
                    boolean bl2 = ((jp0)object).c();
                    if (!bl2) return;
                    xp1_02 = this.a;
                    boolean bl3 = xp1_02.e();
                    if (!bl3) {
                        bh1_1.b("performMeasureAndLayout called with unattached root");
                        throw null;
                    }
                    bl3 = xp1_02.L();
                    if (!bl3) {
                        bh1_1.b("performMeasureAndLayout called with unplaced root");
                        throw null;
                    }
                    bl3 = this.c;
                    boolean bl4 = true;
                    if (!(bl3 ^= bl4)) {
                        bh1_1.b("performMeasureAndLayout called during measure layout");
                        throw null;
                    }
                    c60 c602 = this.i;
                    if (c602 == null) return;
                    this.c = bl4;
                    bl3 = false;
                    c602 = null;
                    this.d = false;
                    try {
                        object = ((jp0)object).a;
                        object = ((ip0_0)object).c;
                        boolean bl5 = ((AbstractCollection)object).isEmpty();
                        if (bl5) break block5;
                        object = xp1_02.c;
                        if (object == null) break block6;
                        this.o(xp1_02, bl4);
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                this.n(xp1_02);
            }
            this.o(xp1_02, false);
            this.c = false;
            this.d = false;
            return;
        }
        this.c = false;
        this.d = false;
        throw throwable2;
    }

    public final boolean m(xp1_0 xp1_02, boolean bl2, boolean bl3) {
        boolean bl4;
        block16: {
            block18: {
                block19: {
                    Object object;
                    Object object2;
                    bq1 bq12;
                    boolean bl5;
                    block20: {
                        Object object3;
                        block17: {
                            Boolean bl6;
                            Boolean bl7;
                            block15: {
                                boolean bl8 = xp1_02.I;
                                bl4 = false;
                                if (bl8) {
                                    return false;
                                }
                                bl8 = xp1_02.L();
                                bl5 = true;
                                bq12 = xp1_02.z;
                                if (bl8) break block15;
                                object2 = bq12.r;
                                bl8 = ((bq1$b)object2).t;
                                if (!bl8 && !(bl8 = YK1.h(xp1_02)) && !(bl8 = Intrinsics.areEqual(object2 = xp1_02.M(), object3 = Boolean.TRUE)) && (!(bl8 = bq12.g) || (object2 = xp1_02.y()) != (object3 = Xp1$f.InMeasureBlock) && ((object2 = bq12.s) == null || (object2 = ((bq1$a_0)object2).r) == null || (bl8 = ((Sc)object2).f()) != bl5)) && !(bl8 = ((Sc)(object2 = bq12.r.u)).f()) && ((object2 = bq12.s) == null || (object2 = ((bq1$a_0)object2).r) == null || (bl8 = ((Sc)object2).f()) != bl5)) break block16;
                            }
                            if (xp1_02 == (object2 = this.a)) {
                                object3 = this.i;
                                Intrinsics.checkNotNull(object3);
                            } else {
                                object3 = null;
                            }
                            if (!bl2) break block17;
                            bl2 = bq12.g;
                            if (bl2) {
                                bl4 = YK1.b(xp1_02, (c60)object3);
                            }
                            if (bl3 && (bl4 || (bl2 = bq12.h)) && (bl2 = Intrinsics.areEqual(bl7 = xp1_02.M(), bl6 = Boolean.TRUE))) {
                                xp1_02.N();
                            }
                            break block18;
                        }
                        bl2 = bq12.d;
                        if (bl2) {
                            bl2 = YK1.c(xp1_02, (c60)object3);
                        } else {
                            bl2 = false;
                            Object var10_11 = null;
                        }
                        if (!bl3 || !(bl3 = bq12.e)) break block19;
                        if (xp1_02 == object2) break block20;
                        object = xp1_02.A();
                        if (object == null || (bl3 = object.L()) != bl5) break block19;
                        object = bq12.r;
                        bl3 = ((bq1$b)object).t;
                        if (!bl3) break block19;
                    }
                    if (xp1_02 == object2) {
                        object = xp1_02.v;
                        object2 = Xp1$f.NotUsed;
                        if (object == object2) {
                            xp1_02.p();
                        }
                        if ((object = xp1_02.A()) == null || (object = object.y.b) == null || (object = ((tb1_0)object).i) == null) {
                            object = aq1_0.a(xp1_02).getPlacementScope();
                        }
                        object2 = bq12.r;
                        Ns2$a.f((Ns2$a)object, (Ns2)object2, 0, 0);
                    } else {
                        xp1_02.V();
                    }
                    object = this.e.a;
                    ((WR1)object).b(xp1_02);
                    xp1_02.H = bl5;
                }
                bl4 = bl2;
            }
            this.d();
        }
        return bl4;
    }

    public final void n(xp1_0 objectArray) {
        objectArray = objectArray.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                xp1_0 xp1_02;
                boolean bl2;
                if (!(bl2 = YK1.i(xp1_02 = (xp1_0)objectArray[n4]))) continue;
                bl2 = iq1_1.b(xp1_02);
                if (bl2) {
                    bl2 = true;
                    this.o(xp1_02, bl2);
                    continue;
                }
                this.n(xp1_02);
            } while (++n4 < n3);
        }
    }

    public final void o(xp1_0 xp1_02, boolean bl2) {
        boolean bl3 = xp1_02.I;
        if (bl3) {
            return;
        }
        Object object = this.a;
        if (xp1_02 == object) {
            object = this.i;
            Intrinsics.checkNotNull(object);
        } else {
            bl3 = false;
            object = null;
        }
        if (bl2) {
            YK1.b(xp1_02, (c60)object);
        } else {
            YK1.c(xp1_02, (c60)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean p(xp1_0 object, boolean n3) {
        block7: {
            block6: {
                boolean bl2;
                int n4;
                block9: {
                    Object object2;
                    block8: {
                        Xp1$d xp1$d = ((xp1_0)object).z.c;
                        int[] nArray = YK1$b.$EnumSwitchMapping$0;
                        int n7 = xp1$d.ordinal();
                        n4 = 1;
                        if ((n7 = nArray[n7]) == n4) return 0 != 0;
                        int n8 = 2;
                        if (n7 == n8) return 0 != 0;
                        n8 = 3;
                        if (n7 == n8 || n7 == (n8 = 4)) break block6;
                        n8 = 5;
                        if (n7 != n8) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        bq1 bq12 = ((xp1_0)object).z;
                        n8 = (int)(bq12.d ? 1 : 0);
                        if (n8 != 0) {
                            if (n3 == 0) return 0 != 0;
                        }
                        bq12.d = n4;
                        n3 = (int)(((xp1_0)object).I ? 1 : 0);
                        if (n3 != 0) break block7;
                        n3 = (int)(((xp1_0)object).L() ? 1 : 0);
                        if (n3 == 0) {
                            n3 = (int)(YK1.h((xp1_0)object) ? 1 : 0);
                            if (n3 == 0) return 0 != 0;
                        }
                        if ((object2 = ((xp1_0)object).A()) == null) break block8;
                        object2 = ((xp1_0)object2).z;
                        n3 = (int)(((bq1)object2).d ? 1 : 0);
                        if (n3 == n4) break block9;
                    }
                    object2 = this.b;
                    ((jp0)object2).a((xp1_0)object, false);
                }
                if (bl2 = this.d) return 0 != 0;
                return n4 != 0;
            }
            YK1$a yK1$a = new YK1$a((xp1_0)object, false, n3 != 0);
            object = this.h;
            ((WR1)object).b(yK1$a);
        }
        return 0 != 0;
    }

    public final void q(long l2) {
        boolean bl2;
        Object object = this.i;
        boolean bl3 = false;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            long l3 = ((c60)object).a;
            bl2 = c60.c(l3, l2);
        }
        if (!bl2) {
            bl2 = this.c;
            boolean bl4 = true;
            if (bl2 ^= bl4) {
                object = new c60(l2);
                this.i = object;
                xp1_0 xp1_02 = this.a;
                Object object2 = xp1_02.c;
                object = xp1_02.z;
                if (object2 != null) {
                    ((bq1)object).g = bl4;
                }
                ((bq1)object).d = bl4;
                if (object2 != null) {
                    bl3 = true;
                }
                object2 = this.b;
                ((jp0)object2).a(xp1_02, bl3);
            } else {
                bh1_1.b("updateRootConstraints called while measuring");
                throw null;
            }
        }
    }
}

