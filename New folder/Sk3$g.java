/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

public final class Sk3$g
implements Sj3 {
    public final /* synthetic */ Sk3 a;

    public Sk3$g(Sk3 sk3) {
        this.a = sk3;
    }

    public final void a() {
    }

    public final void b(long l2) {
        Object object;
        Object object2;
        Sk3 sk3 = this.a;
        int n3 = sk3.j();
        if (n3 != 0 && (object2 = (v21_0)((Object)((h83_0)(object = sk3.p)).getValue())) == null) {
            object2 = v21_0.SelectionEnd;
            ((h83_0)object).setValue(object2);
            sk3.r = n3 = -1;
            sk3.m();
            object = sk3.d;
            int n4 = 1;
            int n7 = 0;
            if (object != null && (object = ((Vt1)object).d()) != null && (n3 = (int)(((Ul3)object).c(l2) ? 1 : 0)) == n4) {
                object = sk3.l().a.a;
                n3 = ((String)object).length();
                if (n3 == 0) {
                    return;
                }
                sk3.h(false);
                object = sk3.l();
                long l3 = mm3.b;
                int n8 = 5;
                object2 = ql3_0.a((ql3_0)object, null, l3, n8);
                tv0_1 tv0_12 = PX2$a.b;
                boolean bl2 = true;
                boolean bl3 = true;
                object = sk3;
                long l4 = Sk3.c(sk3, (ql3_0)object2, l2, bl2, false, tv0_12, bl3);
                n7 = 32;
                n4 = (int)(l4 >>= n7);
                sk3.n = object = Integer.valueOf(n4);
            } else {
                object = sk3.d;
                if (object != null && (object = ((Vt1)object).d()) != null) {
                    n3 = ((Ul3)object).b(l2, n4 != 0);
                    n3 = sk3.b.a(n3);
                    object2 = sk3.l().a;
                    long l7 = nm3.a(n3, n3);
                    object = Sk3.e((Sl)object2, l7);
                    sk3.h(false);
                    object2 = sk3.i;
                    if (object2 != null) {
                        object2.a();
                    }
                    object2 = sk3.c;
                    object2.invoke(object);
                }
            }
            object = x21_0.None;
            sk3.r((x21_0)((Object)object));
            sk3.m = l2;
            object = new e72(l2);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = sk3.q;
            parcelableSnapshotMutableState.setValue(object);
            sk3.o = l2 = 0L;
        }
    }

    public final void c() {
    }

    /*
     * Unable to fully structure code
     */
    public final void d(long var1_1) {
        block6: {
            block7: {
                var3_2 = this.a;
                var4_3 = var3_2.j();
                if (var4_3 == 0 || (var4_3 = (var5_4 = var3_2.l().a.a).length()) == 0) break block6;
                var6_5 = var3_2.o;
                var3_2.o = var1_1 = e72.i(var6_5, var1_1);
                var8_6 = var3_2.d;
                if (var8_6 == null || (var8_6 = var8_6.d()) == null) break block7;
                var6_5 = var3_2.m;
                var9_7 = var3_2.o;
                var6_5 = e72.i(var6_5, var9_7);
                var11_8 = new e72(var6_5);
                var3_2.q.setValue(var11_8);
                var5_4 = var3_2.n;
                var12_9 = PX2$a.b;
                if (var5_4 != null) ** GOTO lbl-1000
                var5_4 = var3_2.i();
                Intrinsics.checkNotNull(var5_4);
                var6_5 = var5_4.a;
                var4_3 = (int)var8_6.c(var6_5);
                if (var4_3 == 0) {
                    var5_4 = var3_2.b;
                    var13_10 = var3_2.m;
                    var15_12 = true;
                    var16_13 = var8_6.b(var13_10, var15_12);
                    var4_3 = var5_4.a(var16_13);
                    var17_14 = var3_2.b;
                    var11_8 = var3_2.i();
                    Intrinsics.checkNotNull(var11_8);
                    var18_16 = var11_8.a;
                    var20_17 = var8_6.b(var18_16, var15_12);
                    var20_17 = var17_14.a(var20_17);
                    if (var4_3 == var20_17) {
                        var12_9 = var8_6 = PX2$a.a;
                    }
                    var17_14 = var3_2.l();
                    var8_6 = var3_2.i();
                    Intrinsics.checkNotNull(var8_6);
                    var9_7 = var8_6.a;
                    var21_18 = true;
                    var5_4 = var3_2;
                    Sk3.c(var3_2, (ql3_0)var17_14, var9_7, false, false, (PX2)var12_9, var21_18);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var5_4 = var3_2.n) != null) {
                        var4_3 = var5_4.intValue();
                    } else {
                        var6_5 = var3_2.m;
                        var4_3 = var8_6.b(var6_5, false);
                    }
                    var17_15 = var3_2.i();
                    Intrinsics.checkNotNull(var17_15);
                    var13_11 = var17_15.a;
                    var20_17 = var8_6.b(var13_11, false);
                    var17_15 = var3_2.n;
                    if (var17_15 == null && var4_3 == var20_17) {
                        return;
                    }
                    var17_15 = var3_2.l();
                    var8_6 = var3_2.i();
                    Intrinsics.checkNotNull(var8_6);
                    var9_7 = var8_6.a;
                    var21_19 = true;
                    var5_4 = var3_2;
                    Sk3.c(var3_2, (ql3_0)var17_15, var9_7, false, false, (PX2)var12_9, var21_19);
                }
                var20_17 = mm3.c;
            }
            var3_2.t(false);
        }
    }

    public final void e() {
        Boolean bl2;
        boolean bl3;
        Object object = this.a;
        Sk3.b((Sk3)object, null);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((Sk3)object).q;
        parcelableSnapshotMutableState.setValue(null);
        boolean bl4 = true;
        ((Sk3)object).t(bl4);
        ((Sk3)object).n = null;
        Object object2 = ((Sk3)object).l();
        long l2 = ((ql3_0)object2).b;
        boolean bl5 = mm3.b(l2);
        Object object3 = bl5 ? x21_0.Cursor : x21_0.Selection;
        ((Sk3)object).r((x21_0)((Object)object3));
        object3 = ((Sk3)object).d;
        if (object3 != null) {
            if (!bl5 && (bl3 = Tk3.b((Sk3)object, bl4))) {
                bl3 = true;
            } else {
                bl3 = false;
                bl2 = null;
            }
            bl2 = bl3;
            object3 = ((Vt1)object3).m;
            ((h83_0)object3).setValue(bl2);
        }
        if ((object3 = ((Sk3)object).d) != null) {
            if (!bl5 && (bl3 = Tk3.b((Sk3)object, false))) {
                bl3 = true;
            } else {
                bl3 = false;
                bl2 = null;
            }
            bl2 = bl3;
            object3 = ((Vt1)object3).n;
            ((h83_0)object3).setValue(bl2);
        }
        if ((object3 = ((Sk3)object).d) != null) {
            boolean bl6;
            if (!bl5 || !(bl6 = Tk3.b((Sk3)object, bl4))) {
                bl4 = false;
                parcelableSnapshotMutableState = null;
            }
            object = bl4;
            object2 = ((Vt1)object3).o;
            ((h83_0)object2).setValue(object);
        }
    }

    public final void onCancel() {
        this.e();
    }

    public final void onStop() {
        this.e();
    }
}

