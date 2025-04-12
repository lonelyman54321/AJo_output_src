/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vT2
 */
public final class vt2_0 {
    public final nr1_1 a;

    public vt2_0() {
        nr1_1 nr1_12;
        this.a = nr1_12 = et2_1.d();
    }

    /*
     * Unable to fully structure code
     */
    public final void a(Object var1_1, Object var2_2) {
        block6: {
            block7: {
                var3_3 = this.a;
                var4_4 = var3_3.e(var1_1);
                if (var4_4 < 0) {
                    var5_5 = true;
                } else {
                    var5_5 = false;
                    var6_6 = null;
                }
                var7_7 = null;
                var8_8 = var5_5 != false ? null : var3_3.c[var4_4];
                if (var8_8 == null) break block6;
                var9_9 = var8_8 instanceof pr1_1;
                if (!var9_9) break block7;
                Intrinsics.checkNotNull(var8_8, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                var7_7 = var8_8;
                var7_7 = (pr1_1)var8_8;
                var7_7.d(var2_2);
                ** GOTO lbl-1000
            }
            if (var8_8 != var2_2) {
                var10_10 = new pr1_1(null);
                var7_7 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0";
                Intrinsics.checkNotNull(var8_8, (String)var7_7);
                var10_10.d(var8_8);
                var10_10.d(var2_2);
                var2_2 = var10_10;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = var8_8;
            }
        }
        if (var5_5) {
            var6_6 = var3_3.b;
            var6_6[var4_4 ^= -1] = var1_1;
            var1_1 = var3_3.c;
            var1_1[var4_4] = var2_2;
        } else {
            var1_1 = var3_3.c;
            var1_1[var4_4] = var2_2;
        }
    }

    public final boolean b(Object object, Object object2) {
        nr1_1 nr1_12 = this.a;
        Object object3 = nr1_12.b(object);
        boolean bl2 = false;
        if (object3 == null) {
            return false;
        }
        boolean bl3 = object3 instanceof pr1_1;
        if (bl3) {
            boolean bl4;
            boolean bl5 = ((pr1_1)(object3 = (pr1_1)object3)).j(object2);
            if (bl5 && (bl4 = ((ft2_0)object3).b())) {
                nr1_12.g(object);
            }
            return bl5;
        }
        boolean bl6 = Intrinsics.areEqual(object3, object2);
        if (bl6) {
            nr1_12.g(object);
            bl2 = true;
        }
        return bl2;
    }

    public final void c(Object object) {
        Object object2 = object;
        nr1_1 nr1_12 = this.a;
        long[] lArray = nr1_12.a;
        int n3 = lArray.length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                long l2 = lArray[n4];
                long l3 = l2 ^ (long)-1;
                int n7 = 7;
                l3 = l3 << n7 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object3 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object4 < 0) {
                            int n14 = (n4 << 3) + n7;
                            Object object5 = nr1_12.b[n14];
                            object5 = nr1_12.c[n14];
                            boolean bl2 = object5 instanceof pr1_1;
                            if (bl2) {
                                String string2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>";
                                Intrinsics.checkNotNull(object5, string2);
                                object5 = (pr1_1)object5;
                                ((pr1_1)object5).j(object2);
                                object3 = ((ft2_0)object5).b();
                            } else if (object5 == object2) {
                                object3 = 1;
                            } else {
                                object3 = 0;
                                object5 = null;
                            }
                            if (object3 != false) {
                                nr1_12.h(n14);
                            }
                        }
                        l2 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
    }
}

