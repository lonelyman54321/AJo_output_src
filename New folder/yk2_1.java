/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i;

/*
 * Renamed from yk2
 */
public final class yk2_1 {
    public final Object a;
    public final am2_0 b;
    public final Kl2 c;
    public final es0_2 d;
    public final JI2 e;
    public final cm2 f;
    public final Function0 g;
    public final v61 h;
    public final AtomicBoolean i;
    public final le_2 j;
    public final Jk2$a k;
    public final xl1_2 l;
    public final ys0_2 m;

    public yk2_1(Object object, am2_0 object2, Kl2 object3, Y40 object4, cm2 cm22, tk2$b$a tk2$b$a) {
        Intrinsics.checkNotNullParameter(object2, "pagingSource");
        Intrinsics.checkNotNullParameter(object3, "config");
        Intrinsics.checkNotNullParameter(object4, "retryFlow");
        String string2 = "jumpCallback";
        Intrinsics.checkNotNullParameter(tk2$b$a, string2);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
        object = null;
        this.e = null;
        this.f = cm22;
        this.g = tk2$b$a;
        int n3 = ((Kl2)object3).f;
        int n4 = -1 << -1;
        if (n3 == n4) {
            this.h = object2 = new v61();
            this.i = object2 = new AtomicBoolean(false);
            this.j = object2 = sr_2.a(-2, 6, null);
            this.k = object2 = new Jk2$a((Kl2)object3);
            this.l = object2 = mm0.a();
            object3 = new ek2_1(this, null);
            Intrinsics.checkNotNullParameter(object2, "controller");
            Intrinsics.checkNotNullParameter(object3, "block");
            object4 = new zk_0((i)object2, (Function2)object3, null);
            object2 = d53.a((Function2)object4);
            object3 = new fk2_1(this, null);
            this.m = object = new ys0_2((es0_2)object2, (Function2)object3);
            return;
        }
        object2.getClass();
        object2 = "PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static final Object a(yk2_1 object, ys0_2 object2, Rv1 rv1, f80_0 f80_02) {
        object.getClass();
        Object object3 = new zk2_1(null, (yk2_1)object, rv1);
        object2 = LS0.a(object2, (gx0_2)object3);
        object3 = new ak2_0(rv1, null);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object3, "operation");
        js0_2 js0_22 = new js0_2((es0_2)object2, (gx0_2)object3, null);
        object2 = new br2_2(js0_22);
        int n3 = -1;
        object2 = ms0_1.c(object2, n3);
        object3 = new bk2_0((yk2_1)object, rv1);
        object = object2.collect((fs0_2)object3, f80_02);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(yk2_1 var0, Rv1 var1_1, ez0_0 var2_2, f80_0 var3_3) {
        block120: {
            block109: {
                block108: {
                    block104: {
                        block124: {
                            block115: {
                                block114: {
                                    block116: {
                                        block122: {
                                            block123: {
                                                block105: {
                                                    block117: {
                                                        block121: {
                                                            block118: {
                                                                block106: {
                                                                    block112: {
                                                                        block111: {
                                                                            block107: {
                                                                                block119: {
                                                                                    block110: {
                                                                                        var4_4 /* !! */  = var0 /* !! */ ;
                                                                                        var5_17 /* !! */  = var1_1 /* !! */ ;
                                                                                        var6_18 /* !! */  = var3_3;
                                                                                        var0 /* !! */ .getClass();
                                                                                        var7_19 = var3_3 instanceof dk2_2;
                                                                                        if (var7_19 == 0) ** GOTO lbl-1000
                                                                                        var8_20 = var3_3;
                                                                                        var8_20 = (dk2_2)var3_3;
                                                                                        var9_21 = var8_20.p;
                                                                                        var10_22 = -1 << -1;
                                                                                        var11_23 = var9_21 & var10_22;
                                                                                        if (var11_23 != 0) {
                                                                                            var8_20.p = var9_21 -= var10_22;
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            var8_20 = new dk2_2((yk2_1)var4_4 /* !! */ , (f80_0)var6_18 /* !! */ );
                                                                                        }
                                                                                        var6_18 /* !! */  = var8_20.n;
                                                                                        var12_24 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                                                        var10_22 = var8_20.p;
                                                                                        var13_25 /* !! */  = "Use doInitialLoad for LoadType == REFRESH";
                                                                                        var14_26 = "message";
                                                                                        var15_27 = "Paging";
                                                                                        block21 : switch (var10_22) {
                                                                                            default: {
                                                                                                var4_4 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                throw var4_4 /* !! */ ;
                                                                                            }
                                                                                            case 11: {
                                                                                                var16_28 = var8_20.m;
                                                                                                var17_29 /* !! */  = var8_20.l;
                                                                                                var18_32 = (hs1_2)var8_20.h;
                                                                                                var19_33 = (Jk2$a)var8_20.g;
                                                                                                var20_34 = (Ref$BooleanRef)var8_20.f;
                                                                                                var21_35 = (Ref$ObjectRef)var8_20.e;
                                                                                                var22_36 = (Ref$IntRef)var8_20.d;
                                                                                                var23_37 = (ez0_0)var8_20.c;
                                                                                                var24_38 = (Rv1)var8_20.b;
                                                                                                var25_39 /* !! */  = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var26_40 = var14_26;
                                                                                                var27_41 = var15_27;
                                                                                                var6_18 /* !! */  = var19_33;
                                                                                                var19_33 = var25_39 /* !! */ ;
                                                                                                var28_42 /* !! */  = var23_37;
                                                                                                var23_37 = var21_35;
                                                                                                var21_35 = var28_42 /* !! */ ;
                                                                                                break block115;
                                                                                            }
                                                                                            case 10: {
                                                                                                var5_17 /* !! */  = var4_4 /* !! */  = var8_20.i;
                                                                                                var5_17 /* !! */  = (hs1_2)var4_4 /* !! */ ;
                                                                                                var4_4 /* !! */  = (am2$b)var8_20.h;
                                                                                                var25_39 /* !! */  = (am2$a)var8_20.g;
                                                                                                var18_32 = (Ref$BooleanRef)var8_20.f;
                                                                                                var22_36 = (Ref$ObjectRef)var8_20.e;
                                                                                                var21_35 = (Ref$IntRef)var8_20.d;
                                                                                                var23_37 = (ez0_0)var8_20.c;
                                                                                                var24_38 = (Rv1)var8_20.b;
                                                                                                var19_33 = (yk2_1)var8_20.a;
                                                                                                try {
                                                                                                    vl2_2.b(var6_18 /* !! */ );
                                                                                                    var26_40 = var14_26;
                                                                                                    var27_41 = var15_27;
                                                                                                    var28_42 /* !! */  = var23_37;
                                                                                                    var23_37 = var22_36;
                                                                                                    var22_36 = var21_35;
                                                                                                }
                                                                                                catch (Throwable var4_5) lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    while (true) {
                                                                                                        var29_43 /* !! */  = 0;
                                                                                                        var6_18 /* !! */  = null;
                                                                                                        break block104;
                                                                                                        break;
                                                                                                    }
                                                                                                }
lbl65:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var21_35 = var28_42 /* !! */ ;
                                                                                                    ** GOTO lbl-1000
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            case 9: {
                                                                                                var4_4 /* !! */  = (Jk2)var8_20.j;
                                                                                                var5_17 /* !! */  = (hs1_2)var8_20.i;
                                                                                                var25_39 /* !! */  = (am2$b)var8_20.h;
                                                                                                var18_32 = (am2$a)var8_20.g;
                                                                                                var22_36 = (Ref$BooleanRef)var8_20.f;
                                                                                                var21_35 = (Ref$ObjectRef)var8_20.e;
                                                                                                var23_37 = (Ref$IntRef)var8_20.d;
                                                                                                var24_38 = (ez0_0)var8_20.c;
                                                                                                var19_33 = (Rv1)var8_20.b;
                                                                                                var20_34 = (yk2_1)var8_20.a;
                                                                                                {
                                                                                                    vl2_2.b(var6_18 /* !! */ );
                                                                                                    var26_40 = var14_26;
                                                                                                    ** GOTO lbl-1000
                                                                                                }
                                                                                            }
                                                                                            case 8: {
                                                                                                var4_4 /* !! */  = var8_20.k;
                                                                                                var5_17 /* !! */  = (Jk2$a)var8_20.j;
                                                                                                var25_39 /* !! */  = (Rv1)var8_20.i;
                                                                                                var18_32 = (am2$b)var8_20.h;
                                                                                                var22_36 = (am2$a)var8_20.g;
                                                                                                var21_35 = (Ref$BooleanRef)var8_20.f;
                                                                                                var23_37 = (Ref$ObjectRef)var8_20.e;
                                                                                                var24_38 = (Ref$IntRef)var8_20.d;
                                                                                                var19_33 = (ez0_0)var8_20.c;
                                                                                                var20_34 = (Rv1)var8_20.b;
                                                                                                var0 /* !! */  = var4_4 /* !! */ ;
                                                                                                var4_4 /* !! */  = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var6_18 /* !! */  = var0 /* !! */ ;
                                                                                                break block116;
                                                                                            }
                                                                                            case 7: {
                                                                                                var4_4 /* !! */  = (Jk2)var8_20.d;
                                                                                                var5_17 /* !! */  = (hs1_2)var8_20.c;
                                                                                                var25_39 /* !! */  = (ez0_0)var8_20.b;
                                                                                                var8_20 = (Rv1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                ** GOTO lbl-1000
                                                                                            }
lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                while (true) {
                                                                                                    var29_43 /* !! */  = 0;
                                                                                                    var6_18 /* !! */  = null;
                                                                                                    break block105;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            case 6: {
                                                                                                var4_4 /* !! */  = (hs1_2)var8_20.f;
                                                                                                var5_17 /* !! */  = (Jk2$a)var8_20.e;
                                                                                                var25_39 /* !! */  = (am2$b)var8_20.d;
                                                                                                var18_32 = (ez0_0)var8_20.c;
                                                                                                var13_25 /* !! */  = (Rv1)var8_20.b;
                                                                                                var14_26 = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var6_18 /* !! */  = var4_4 /* !! */ ;
                                                                                                var4_4 /* !! */  = var8_20;
                                                                                                var24_38 = var18_32;
                                                                                                var8_20 = var13_25 /* !! */ ;
                                                                                                break block117;
                                                                                            }
                                                                                            case 5: {
                                                                                                var4_4 /* !! */  = (hs1_2)var8_20.j;
                                                                                                var5_17 /* !! */  = (Jk2$a)var8_20.i;
                                                                                                var25_39 /* !! */  = (am2$b)var8_20.h;
                                                                                                var18_32 = (am2$a)var8_20.g;
                                                                                                var22_36 = (Ref$BooleanRef)var8_20.f;
                                                                                                var21_35 = (Ref$ObjectRef)var8_20.e;
                                                                                                var23_37 = (Ref$IntRef)var8_20.d;
                                                                                                var24_38 = (ez0_0)var8_20.c;
                                                                                                var19_33 = (Rv1)var8_20.b;
                                                                                                var20_34 = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var6_18 /* !! */  = var4_4 /* !! */ ;
                                                                                                break block118;
                                                                                            }
                                                                                            case 4: {
                                                                                                var4_4 /* !! */  = (am2$a)var8_20.g;
                                                                                                var5_17 /* !! */  = (Ref$BooleanRef)var8_20.f;
                                                                                                var25_39 /* !! */  = (Ref$ObjectRef)var8_20.e;
                                                                                                var18_32 = (Ref$IntRef)var8_20.d;
                                                                                                var22_36 = (ez0_0)var8_20.c;
                                                                                                var21_35 = (Rv1)var8_20.b;
                                                                                                var23_37 = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var24_38 = var22_36;
                                                                                                var19_33 = var21_35;
                                                                                                var22_36 = var5_17 /* !! */ ;
                                                                                                var21_35 = var25_39 /* !! */ ;
                                                                                                var28_42 /* !! */  = var18_32;
                                                                                                var18_32 = var4_4 /* !! */ ;
lbl157:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var4_4 /* !! */  = var28_42 /* !! */ ;
                                                                                                    break block106;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            case 3: {
                                                                                                var4_4 /* !! */  = (Ref$ObjectRef)var8_20.h;
                                                                                                var5_17 /* !! */  = var8_20.g;
                                                                                                var25_39 /* !! */  = (hs1_2)var8_20.f;
                                                                                                var18_32 = (Ref$ObjectRef)var8_20.e;
                                                                                                var22_36 = (Ref$IntRef)var8_20.d;
                                                                                                var21_35 = (ez0_0)var8_20.c;
                                                                                                var23_37 = (Rv1)var8_20.b;
                                                                                                var24_38 = (yk2_1)var8_20.a;
                                                                                                try {
                                                                                                    vl2_2.b(var6_18 /* !! */ );
                                                                                                    break block107;
                                                                                                }
                                                                                                catch (Throwable var4_9) lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    while (true) {
                                                                                                        var17_30 = false;
                                                                                                        var5_17 /* !! */  = null;
                                                                                                        break block108;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            case 2: {
                                                                                                var4_4 /* !! */  = (Ref$ObjectRef)var8_20.h;
                                                                                                var5_17 /* !! */  = (hs1_2)var8_20.g;
                                                                                                var25_39 /* !! */  = (Jk2$a)var8_20.f;
                                                                                                var18_32 = (Ref$ObjectRef)var8_20.e;
                                                                                                var22_36 = (Ref$IntRef)var8_20.d;
                                                                                                var21_35 = (ez0_0)var8_20.c;
                                                                                                var23_37 = (Rv1)var8_20.b;
                                                                                                var24_38 = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                break block119;
                                                                                            }
                                                                                            case 1: {
                                                                                                var4_4 /* !! */  = (hs1_2)var8_20.f;
                                                                                                var5_17 /* !! */  = (Jk2$a)var8_20.e;
                                                                                                var25_39 /* !! */  = (Ref$IntRef)var8_20.d;
                                                                                                var18_32 = (ez0_0)var8_20.c;
                                                                                                var22_36 = (Rv1)var8_20.b;
                                                                                                var21_35 = (yk2_1)var8_20.a;
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var6_18 /* !! */  = var4_4 /* !! */ ;
                                                                                                var4_4 /* !! */  = var21_35;
                                                                                                var28_42 /* !! */  = var25_39 /* !! */ ;
                                                                                                var25_39 /* !! */  = var5_17 /* !! */ ;
                                                                                                var5_17 /* !! */  = var22_36;
lbl201:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var22_36 = var28_42 /* !! */ ;
                                                                                                    break block21;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            case 0: {
                                                                                                vl2_2.b(var6_18 /* !! */ );
                                                                                                var6_18 /* !! */  = Rv1.REFRESH;
                                                                                                if (var5_17 /* !! */  != var6_18 /* !! */ ) {
                                                                                                    var25_39 /* !! */  = new Ref$IntRef();
                                                                                                    var6_18 /* !! */  = var4_4 /* !! */ .k;
                                                                                                    var18_32 = var6_18 /* !! */ .a;
                                                                                                    var8_20.a = var4_4 /* !! */ ;
                                                                                                    var8_20.b = var5_17 /* !! */ ;
                                                                                                    var22_36 = var2_2;
                                                                                                    var8_20.c = var2_2;
                                                                                                    var8_20.d = var25_39 /* !! */ ;
                                                                                                    var8_20.e = var6_18 /* !! */ ;
                                                                                                    var8_20.f = var18_32;
                                                                                                    var8_20.p = 1;
                                                                                                    var30_44 = false;
                                                                                                    var21_35 = null;
                                                                                                    var23_37 = var18_32.d((f80_0)var8_20, null);
                                                                                                    if (var23_37 == var12_24 /* !! */ ) {
                                                                                                        return var12_24 /* !! */ ;
                                                                                                    }
                                                                                                    var28_42 /* !! */  = var25_39 /* !! */ ;
                                                                                                    var25_39 /* !! */  = var6_18 /* !! */ ;
                                                                                                    var6_18 /* !! */  = var18_32;
                                                                                                    var18_32 = var2_2;
                                                                                                    ** continue;
                                                                                                }
                                                                                                break block120;
                                                                                            }
                                                                                        }
                                                                                        var25_39 /* !! */  = var25_39 /* !! */ .b;
                                                                                        var21_35 = yk2$a.$EnumSwitchMapping$0;
                                                                                        var31_45 = var5_17 /* !! */ .ordinal();
                                                                                        var30_44 = var21_35[var31_45];
                                                                                        var31_45 = 1;
                                                                                        if (var30_44 == var31_45) break block109;
                                                                                        var32_46 = 2;
                                                                                        if (var30_44 == var32_46) ** GOTO lbl274
                                                                                        var32_46 = 3;
                                                                                        if (var30_44 != var32_46) ** GOTO lbl306
                                                                                        var30_44 = var25_39 /* !! */ .d;
                                                                                        var24_38 = var18_32.b;
                                                                                        var32_46 = var24_38.d;
                                                                                        if ((var30_44 = var30_44 + var32_46 + var31_45) >= 0) break block110;
                                                                                        var31_45 = var28_42 /* !! */ .element;
                                                                                        var24_38 = var4_4 /* !! */ .c;
                                                                                        var32_46 = var24_38.a;
                                                                                        var30_44 = -var30_44;
                                                                                        var32_46 = var32_46 * var30_44 + var31_45;
                                                                                        try {
                                                                                            var28_42 /* !! */ .element = var32_46;
                                                                                            return var28_42 /* !! */ .element;
                                                                                        }
                                                                                        finally {
                                                                                            var30_44 = 0;
                                                                                            var21_35 = null;
                                                                                        }
                                                                                    }
                                                                                    var25_39 /* !! */  = var25_39 /* !! */ .c;
                                                                                    var31_45 = xx_2.h((List)var25_39 /* !! */ );
                                                                                    if (var30_44 <= var31_45) {
                                                                                        while (true) {
                                                                                            var32_46 = var22_36.element;
                                                                                            var19_33 = var25_39 /* !! */ .get(var30_44);
                                                                                            var19_33 = (am2$b$b)var19_33;
                                                                                            var19_33 = var19_33.a;
                                                                                            var33_47 = var19_33.size();
                                                                                            var22_36.element = var32_46 += var33_47;
                                                                                            if (var30_44 != var31_45) {
                                                                                                var32_46 = 1;
                                                                                                var30_44 += var32_46;
                                                                                                continue;
                                                                                            } else {
                                                                                                ** GOTO lbl273
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    ** GOTO lbl306
lbl273:
                                                                                    // 2 sources

                                                                                    ** GOTO lbl306
lbl274:
                                                                                    // 1 sources

                                                                                    var30_44 = var25_39 /* !! */ .d;
                                                                                    var23_37 = var18_32.b;
                                                                                    var31_45 = var23_37.c;
                                                                                    var30_44 += var31_45;
                                                                                    var31_45 = 1;
                                                                                    var30_44 -= var31_45;
                                                                                    var25_39 /* !! */  = var25_39 /* !! */ .c;
                                                                                    var31_45 = xx_2.h((List)var25_39 /* !! */ );
                                                                                    if (var30_44 <= var31_45) ** GOTO lbl292
                                                                                    var31_45 = var28_42 /* !! */ .element;
                                                                                    var24_38 = var4_4 /* !! */ .c;
                                                                                    var32_46 = var24_38.a;
                                                                                    var33_47 = xx_2.h((List)var25_39 /* !! */ );
                                                                                    var30_44 = (var30_44 - var33_47) * var32_46 + var31_45;
                                                                                    var28_42 /* !! */ .element = var30_44;
                                                                                    var30_44 = xx_2.h((List)var25_39 /* !! */ );
lbl292:
                                                                                    // 2 sources

                                                                                    if (var30_44 >= 0) {
                                                                                        var31_45 = 0;
                                                                                        var23_37 = null;
                                                                                        while (true) {
                                                                                            var32_46 = var22_36.element;
                                                                                            var19_33 = var25_39 /* !! */ .get(var31_45);
                                                                                            var19_33 = (am2$b$b)var19_33;
                                                                                            var19_33 = var19_33.a;
                                                                                            var33_47 = var19_33.size();
                                                                                            var22_36.element = var32_46 += var33_47;
                                                                                            if (var31_45 == var30_44) break;
                                                                                            var32_46 = 1;
                                                                                            var31_45 += var32_46;
                                                                                        }
                                                                                    }
lbl306:
                                                                                    // 6 sources

                                                                                    var25_39 /* !! */  = Unit.a;
                                                                                    var34_48 = 0;
                                                                                    var6_18 /* !! */ .b(null);
                                                                                    var6_18 /* !! */  = new Ref$ObjectRef();
                                                                                    var25_39 /* !! */  = var4_4 /* !! */ .k;
                                                                                    var21_35 = var25_39 /* !! */ .a;
                                                                                    var8_20.a = var4_4 /* !! */ ;
                                                                                    var8_20.b = var5_17 /* !! */ ;
                                                                                    var8_20.c = var18_32;
                                                                                    var8_20.d = var22_36;
                                                                                    var8_20.e = var6_18 /* !! */ ;
                                                                                    var8_20.f = var25_39 /* !! */ ;
                                                                                    var8_20.g = var21_35;
                                                                                    var8_20.h = var6_18 /* !! */ ;
                                                                                    var8_20.p = 2;
                                                                                    var31_45 = 0;
                                                                                    var23_37 = null;
                                                                                    var24_38 = var21_35.d((f80_0)var8_20, null);
                                                                                    if (var24_38 == var12_24 /* !! */ ) {
                                                                                        return var12_24 /* !! */ ;
                                                                                    }
                                                                                    var24_38 = var4_4 /* !! */ ;
                                                                                    var23_37 = var5_17 /* !! */ ;
                                                                                    var4_4 /* !! */  = var6_18 /* !! */ ;
                                                                                    var5_17 /* !! */  = var21_35;
                                                                                    var21_35 = var18_32;
                                                                                    var18_32 = var6_18 /* !! */ ;
                                                                                }
                                                                                try {
                                                                                    var6_18 /* !! */  = var25_39 /* !! */ .b;
                                                                                    var34_48 = var21_35.a;
                                                                                    var19_33 = var21_35.b;
                                                                                    var33_47 = var19_33.a((Rv1)var23_37);
                                                                                    var35_49 = var22_36.element;
                                                                                    var25_39 /* !! */  = var24_38.i((Jk2)var6_18 /* !! */ , (Rv1)var23_37, var34_48, var33_47 += var35_49);
                                                                                    if (var25_39 /* !! */  == null) break block111;
                                                                                    var8_20.a = var24_38;
                                                                                    var8_20.b = var23_37;
                                                                                    var8_20.c = var21_35;
                                                                                    var8_20.d = var22_36;
                                                                                    var8_20.e = var18_32;
                                                                                    var8_20.f = var5_17 /* !! */ ;
                                                                                    var8_20.g = var25_39 /* !! */ ;
                                                                                    var8_20.h = var4_4 /* !! */ ;
                                                                                    var8_20.p = var33_47 = 3;
                                                                                    if ((var6_18 /* !! */  = var24_38.k((Jk2)var6_18 /* !! */ , (Rv1)var23_37, (h80_0)var8_20)) == var12_24 /* !! */ ) {
                                                                                        return var12_24 /* !! */ ;
                                                                                    }
                                                                                    var28_42 /* !! */  = var25_39 /* !! */ ;
                                                                                    var25_39 /* !! */  = var5_17 /* !! */ ;
                                                                                    var5_17 /* !! */  = var28_42 /* !! */ ;
                                                                                }
                                                                                catch (Throwable var4_12) {
                                                                                    ** continue;
                                                                                }
lbl356:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var34_48 = 0;
                                                                                    var25_39 /* !! */  = null;
                                                                                    var5_17 /* !! */ .b(null);
                                                                                    var4_4 /* !! */ .element = var6_18 /* !! */ ;
                                                                                    var4_4 /* !! */  = new Ref$BooleanRef();
                                                                                    break block112;
                                                                                    break;
                                                                                }
lbl363:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var25_39 /* !! */  = var5_17 /* !! */ ;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var6_18 /* !! */  = var5_17 /* !! */ ;
                                                                            var5_17 /* !! */  = var25_39 /* !! */ ;
                                                                            ** GOTO lbl356
                                                                        }
                                                                        var29_43 /* !! */  = 0;
                                                                        var6_18 /* !! */  = null;
                                                                        ** while (true)
                                                                    }
lbl377:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var5_17 /* !! */  = var18_32.element;
                                                                        if (var5_17 /* !! */  == null) return Unit.a;
                                                                        var5_17 /* !! */  = var24_38.g((Rv1)var23_37, (Object)var5_17 /* !! */ );
                                                                        var6_18 /* !! */  = Build.ID;
                                                                        if (var6_18 /* !! */  != null && (var34_48 = (int)Log.isLoggable((String)var15_27, (int)(var29_43 /* !! */  = 3))) != 0) {
                                                                            var29_43 /* !! */  = 1;
                                                                        } else {
                                                                            var29_43 /* !! */  = 0;
                                                                            var6_18 /* !! */  = null;
                                                                        }
                                                                        var25_39 /* !! */  = var24_38.b;
                                                                        if (var29_43 /* !! */  != 0) {
                                                                            var6_18 /* !! */  = new StringBuilder("Start ");
                                                                            var6_18 /* !! */ .append(var23_37);
                                                                            var6_18 /* !! */ .append(" with loadKey ");
                                                                            var19_33 = var18_32.element;
                                                                            var6_18 /* !! */ .append(var19_33);
                                                                            var19_33 = " on ";
                                                                            var6_18 /* !! */ .append((String)var19_33);
                                                                            var6_18 /* !! */ .append(var25_39 /* !! */ );
                                                                            var6_18 /* !! */  = var6_18 /* !! */ .toString();
                                                                            Intrinsics.checkNotNullParameter(var6_18 /* !! */ , (String)var14_26);
                                                                        }
                                                                        var8_20.a = var24_38;
                                                                        var8_20.b = var23_37;
                                                                        var8_20.c = var21_35;
                                                                        var8_20.d = var22_36;
                                                                        var8_20.e = var18_32;
                                                                        var8_20.f = var4_4 /* !! */ ;
                                                                        var8_20.g = var5_17 /* !! */ ;
                                                                        var8_20.h = null;
                                                                        var8_20.i = null;
                                                                        var8_20.p = var29_43 /* !! */  = 4;
                                                                        var6_18 /* !! */  = var25_39 /* !! */ .c((am2$a)var5_17 /* !! */ , (f80_0)var8_20);
                                                                        if (var6_18 /* !! */  == var12_24 /* !! */ ) {
                                                                            return var12_24 /* !! */ ;
                                                                        }
                                                                        var19_33 = var23_37;
                                                                        var23_37 = var24_38;
                                                                        var24_38 = var21_35;
                                                                        var21_35 = var18_32;
                                                                        var18_32 = var5_17 /* !! */ ;
                                                                        var28_42 /* !! */  = var22_36;
                                                                        var22_36 = var4_4 /* !! */ ;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var25_39 /* !! */  = var6_18 /* !! */ ;
                                                                var25_39 /* !! */  = (am2$b)var6_18 /* !! */ ;
                                                                var17_29 /* !! */  = var25_39 /* !! */  instanceof am2$b$b;
                                                                if (var17_29 /* !! */  == 0) break block121;
                                                                var5_17 /* !! */  = (Rv1)yk2$a.$EnumSwitchMapping$0;
                                                                var29_43 /* !! */  = var19_33.ordinal();
                                                                var17_29 /* !! */  = (int)var5_17 /* !! */ [var29_43 /* !! */ ];
                                                                if (var17_29 /* !! */  != (var29_43 /* !! */  = 2)) {
                                                                    var29_43 /* !! */  = 3;
                                                                    if (var17_29 /* !! */  != var29_43 /* !! */ ) {
                                                                        var4_4 /* !! */  = new IllegalArgumentException(var13_25 /* !! */ );
                                                                        throw var4_4 /* !! */ ;
                                                                    }
                                                                    var5_17 /* !! */  = var25_39 /* !! */ ;
                                                                    var5_17 /* !! */  = ((am2$b$b)var25_39 /* !! */ ).c;
                                                                } else {
                                                                    var5_17 /* !! */  = var25_39 /* !! */ ;
                                                                    var5_17 /* !! */  = ((am2$b$b)var25_39 /* !! */ ).b;
                                                                }
                                                                var23_37.b.getClass();
                                                                var6_18 /* !! */  = var21_35.element;
                                                                var17_29 /* !! */  = (int)Intrinsics.areEqual((Object)var5_17 /* !! */ , var6_18 /* !! */ );
                                                                if (var17_29 /* !! */  != 0) {
                                                                    var4_4 /* !! */  = Rv1.PREPEND;
                                                                    var4_4 /* !! */  = var19_33 == var4_4 /* !! */  ? "prevKey" : "nextKey";
                                                                    var5_17 /* !! */  = new StringBuilder("The same value, ");
                                                                    var6_18 /* !! */  = var21_35.element;
                                                                    var5_17 /* !! */ .append(var6_18 /* !! */ );
                                                                    var5_17 /* !! */ .append(", was passed as the ");
                                                                    var5_17 /* !! */ .append((String)var4_4 /* !! */ );
                                                                    var5_17 /* !! */ .append(" in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ");
                                                                    var4_4 /* !! */  = ee3_2.c(var5_17 /* !! */ .toString());
                                                                    var4_4 /* !! */  = var4_4 /* !! */ .toString();
                                                                    var5_17 /* !! */  = new IllegalStateException((String)var4_4 /* !! */ );
                                                                    throw var5_17 /* !! */ ;
                                                                }
                                                                var5_17 /* !! */  = var23_37.k;
                                                                var6_18 /* !! */  = var5_17 /* !! */ .a;
                                                                var8_20.a = var23_37;
                                                                var8_20.b = var19_33;
                                                                var8_20.c = var24_38;
                                                                var8_20.d = var4_4 /* !! */ ;
                                                                var8_20.e = var21_35;
                                                                var8_20.f = var22_36;
                                                                var8_20.g = var18_32;
                                                                var8_20.h = var25_39 /* !! */ ;
                                                                var8_20.i = var5_17 /* !! */ ;
                                                                var8_20.j = var6_18 /* !! */ ;
                                                                var8_20.p = 5;
                                                                var0 /* !! */  = var4_4 /* !! */ ;
                                                                var35_49 = 0;
                                                                var20_34 = null;
                                                                var4_4 /* !! */  = var6_18 /* !! */ .d((f80_0)var8_20, null);
                                                                if (var4_4 /* !! */  == var12_24 /* !! */ ) {
                                                                    return var12_24 /* !! */ ;
                                                                }
                                                                var20_34 = var23_37;
                                                                var23_37 = var0 /* !! */ ;
                                                            }
                                                            try {
                                                                var4_4 /* !! */  = var5_17 /* !! */ .b;
                                                                var17_29 /* !! */  = var24_38.a;
                                                                var0 /* !! */  = var8_20;
                                                                var8_20 = var25_39 /* !! */ ;
                                                                var8_20 = (am2$b$b)var25_39 /* !! */ ;
                                                                var16_28 = (int)var4_4 /* !! */ .e(var17_29 /* !! */ , (Rv1)var19_33, (am2$b$b)var8_20);
                                                                var17_29 /* !! */  = 0;
                                                                var5_17 /* !! */  = null;
                                                                var6_18 /* !! */ .b(null);
                                                                if (var16_28 == 0) {
                                                                    var4_4 /* !! */  = Build.ID;
                                                                    if (var4_4 /* !! */  == null) return Unit.a;
                                                                }
                                                            }
                                                            catch (Throwable var4_13) {
                                                                var6_18 /* !! */ .b(null);
                                                                throw var4_13;
                                                            }
                                                            var4_4 /* !! */  = Build.ID;
                                                            if (var4_4 /* !! */  != null) {
                                                                var16_28 = 3;
                                                                var17_29 /* !! */  = (int)Log.isLoggable((String)var15_27, (int)var16_28);
                                                                if (var17_29 /* !! */  != 0) {
                                                                    var5_17 /* !! */  = var21_35.element;
                                                                    var20_34.getClass();
                                                                    var5_17 /* !! */  = yk2_1.h((Rv1)var19_33, (Object)var5_17 /* !! */ , (am2$b)var25_39 /* !! */ );
                                                                    Intrinsics.checkNotNullParameter((Object)var5_17 /* !! */ , (String)var14_26);
                                                                }
                                                            } else {
                                                                var16_28 = 3;
                                                            }
                                                            var17_29 /* !! */  = var23_37.element;
                                                            var6_18 /* !! */  = var25_39 /* !! */ ;
                                                            var6_18 /* !! */  = (am2$b$b)var25_39 /* !! */ ;
                                                            var8_20 = var6_18 /* !! */ .a;
                                                            var23_37.element = var7_19 = var8_20.size() + var17_29 /* !! */ ;
                                                            var5_17 /* !! */  = Rv1.PREPEND;
                                                            if (var19_33 == var5_17 /* !! */  && (var5_17 /* !! */  = var6_18 /* !! */ .b) == null) {
                                                                while (true) {
                                                                    var17_29 /* !! */  = 1;
                                                                    var22_36.element = var17_29 /* !! */ ;
                                                                    break;
                                                                }
                                                            } else {
                                                                if (var19_33 == (var5_17 /* !! */  = Rv1.APPEND) && (var5_17 /* !! */  = var6_18 /* !! */ .c) == null) ** continue;
                                                                var17_29 /* !! */  = 1;
                                                            }
                                                            var8_20 = var0 /* !! */ ;
                                                            break block122;
                                                        }
                                                        var0 /* !! */  = var28_42 /* !! */ ;
                                                        var16_28 = 3;
                                                        var17_29 /* !! */  = 1;
                                                        var29_43 /* !! */  = var25_39 /* !! */  instanceof am2$b$a;
                                                        if (var29_43 /* !! */  == 0) break block123;
                                                        var4_4 /* !! */  = Build.ID;
                                                        if (var4_4 /* !! */  != null && (var16_28 = (int)Log.isLoggable((String)var15_27, (int)2)) != 0) {
                                                            var4_4 /* !! */  = var21_35.element;
                                                            var23_37.getClass();
                                                            var4_4 /* !! */  = yk2_1.h((Rv1)var19_33, var4_4 /* !! */ , (am2$b)var25_39 /* !! */ );
                                                            Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var14_26);
                                                        }
                                                        var5_17 /* !! */  = var23_37.k;
                                                        var4_4 /* !! */  = var5_17 /* !! */ .a;
                                                        var8_20.a = var23_37;
                                                        var8_20.b = var19_33;
                                                        var8_20.c = var24_38;
                                                        var8_20.d = var25_39 /* !! */ ;
                                                        var8_20.e = var5_17 /* !! */ ;
                                                        var8_20.f = var4_4 /* !! */ ;
                                                        var29_43 /* !! */  = 0;
                                                        var6_18 /* !! */  = null;
                                                        var8_20.g = null;
                                                        var8_20.p = var10_22 = 6;
                                                        var18_32 = var4_4 /* !! */ .d((f80_0)var8_20, null);
                                                        if (var18_32 == var12_24 /* !! */ ) {
                                                            return var12_24 /* !! */ ;
                                                        }
                                                        var6_18 /* !! */  = var4_4 /* !! */ ;
                                                        var4_4 /* !! */  = var8_20;
                                                        var14_26 = var23_37;
                                                        var8_20 = var19_33;
                                                    }
                                                    try {
                                                        var5_17 /* !! */  = var5_17 /* !! */ .b;
                                                        var25_39 /* !! */  = (am2$b$a)var25_39 /* !! */ ;
                                                        var25_39 /* !! */  = var25_39 /* !! */ .a;
                                                        var25_39 /* !! */  = (Exception)var25_39 /* !! */ ;
                                                        var18_32 = new Ov1$a((Exception)var25_39 /* !! */ );
                                                        var4_4 /* !! */ .a = var8_20;
                                                        var4_4 /* !! */ .b = var24_38;
                                                        var4_4 /* !! */ .c = var6_18 /* !! */ ;
                                                        var4_4 /* !! */ .d = var5_17 /* !! */ ;
                                                        var34_48 = 0;
                                                        var25_39 /* !! */  = null;
                                                        var4_4 /* !! */ .e = null;
                                                        var4_4 /* !! */ .f = null;
                                                        var4_4 /* !! */ .p = var34_48 = 7;
                                                        var4_4 /* !! */  = var14_26.j((Jk2)var5_17 /* !! */ , (Rv1)var8_20, (Ov1$a)var18_32, (h80_0)var4_4 /* !! */ );
                                                        if (var4_4 /* !! */  == var12_24 /* !! */ ) {
                                                            return var12_24 /* !! */ ;
                                                        }
                                                        var4_4 /* !! */  = var5_17 /* !! */ ;
                                                        var5_17 /* !! */  = var6_18 /* !! */ ;
                                                        var25_39 /* !! */  = var24_38;
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (Throwable var4_14) {
                                                        ** continue;
                                                    }
lbl589:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_17 /* !! */  = var6_18 /* !! */ ;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    catch (Throwable var4_7) {}
                                                    ** while (true)
lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var4_4 /* !! */  = var4_4 /* !! */ .k;
                                                        var6_18 /* !! */  = var25_39 /* !! */ .b;
                                                        var4_4 /* !! */ .put(var8_20, var6_18 /* !! */ );
                                                        var4_4 /* !! */  = Unit.a;
                                                        var29_43 /* !! */  = 0;
                                                        var6_18 /* !! */  = null;
                                                        var5_17 /* !! */ .b(null);
                                                        return Unit.a;
                                                    }
                                                }
                                                var5_17 /* !! */ .b(null);
                                                throw var4_8;
                                            }
                                            var20_34 = var23_37;
                                            var23_37 = var28_42 /* !! */ ;
                                        }
                                        var6_18 /* !! */  = yk2$a.$EnumSwitchMapping$0;
                                        var36_50 = var19_33.ordinal();
                                        var29_43 /* !! */  = (int)var6_18 /* !! */ [var36_50];
                                        var16_28 = 2;
                                        var6_18 /* !! */  = var29_43 /* !! */  == var16_28 ? Rv1.APPEND : Rv1.PREPEND;
                                        var4_4 /* !! */  = var20_34.k;
                                        var5_17 /* !! */  = var4_4 /* !! */ .a;
                                        var8_20.a = var20_34;
                                        var8_20.b = var19_33;
                                        var8_20.c = var24_38;
                                        var8_20.d = var23_37;
                                        var8_20.e = var21_35;
                                        var8_20.f = var22_36;
                                        var8_20.g = var18_32;
                                        var8_20.h = var25_39 /* !! */ ;
                                        var8_20.i = var6_18 /* !! */ ;
                                        var8_20.j = var4_4 /* !! */ ;
                                        var8_20.k = var5_17 /* !! */ ;
                                        var0 /* !! */  = var4_4 /* !! */ ;
                                        var8_20.p = var16_28 = 8;
                                        var1_1 /* !! */  = var6_18 /* !! */ ;
                                        var29_43 /* !! */  = 0;
                                        var6_18 /* !! */  = null;
                                        var4_4 /* !! */  = var5_17 /* !! */ .d((f80_0)var8_20, null);
                                        if (var4_4 /* !! */  == var12_24 /* !! */ ) {
                                            return var12_24 /* !! */ ;
                                        }
                                        var6_18 /* !! */  = var5_17 /* !! */ ;
                                        var4_4 /* !! */  = var20_34;
                                        var5_17 /* !! */  = var0 /* !! */ ;
                                        var20_34 = var19_33;
                                        var19_33 = var24_38;
                                        var24_38 = var23_37;
                                        var23_37 = var21_35;
                                        var21_35 = var22_36;
                                        var22_36 = var18_32;
                                        var18_32 = var25_39 /* !! */ ;
                                        var25_39 /* !! */  = var1_1 /* !! */ ;
                                    }
                                    try {
                                        var5_17 /* !! */  = var5_17 /* !! */ .b;
                                        var26_40 = var14_26;
                                        var14_26 = var19_33.b;
                                        var25_39 /* !! */  = var5_17 /* !! */ .c((Rv1)var25_39 /* !! */ , (re3_0)var14_26);
                                        if (var25_39 /* !! */  == null) break block114;
                                        var5_17 /* !! */ .b((rk2$a)var25_39 /* !! */ );
                                        var14_26 = var4_4 /* !! */ .j;
                                        var8_20.a = var4_4 /* !! */ ;
                                        var8_20.b = var20_34;
                                        var8_20.c = var19_33;
                                        var8_20.d = var24_38;
                                        var8_20.e = var23_37;
                                        var8_20.f = var21_35;
                                        var8_20.g = var22_36;
                                        var8_20.h = var18_32;
                                        var8_20.i = var6_18 /* !! */ ;
                                        var8_20.j = var5_17 /* !! */ ;
                                        var0 /* !! */  = var5_17 /* !! */ ;
                                        var17_29 /* !! */  = 0;
                                        var5_17 /* !! */  = null;
                                        var8_20.k = null;
                                        var8_20.p = var17_29 /* !! */  = 9;
                                        var5_17 /* !! */  = var14_26.o((f80_0)var8_20, var25_39 /* !! */ );
                                        if (var5_17 /* !! */  == var12_24 /* !! */ ) {
                                            return var12_24 /* !! */ ;
                                        }
                                        var5_17 /* !! */  = var6_18 /* !! */ ;
                                        var25_39 /* !! */  = var18_32;
                                        var18_32 = var22_36;
                                        var22_36 = var21_35;
                                        var21_35 = var23_37;
                                        var23_37 = var24_38;
                                        var24_38 = var19_33;
                                        var19_33 = var20_34;
                                        var20_34 = var4_4 /* !! */ ;
                                        var4_4 /* !! */  = var0 /* !! */ ;
                                    }
                                    catch (Throwable var4_15) {
                                        var5_17 /* !! */  = var6_18 /* !! */ ;
                                        ** continue;
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        var6_18 /* !! */  = Unit.a;
                                        var6_18 /* !! */  = var5_17 /* !! */ ;
                                        var5_17 /* !! */  = var4_4 /* !! */ ;
                                        var4_4 /* !! */  = var20_34;
                                        var20_34 = var19_33;
                                        var19_33 = var24_38;
                                        var24_38 = var23_37;
                                        var23_37 = var21_35;
                                        var21_35 = var22_36;
                                        ** GOTO lbl-1000
                                    }
                                }
                                var0 /* !! */  = var5_17 /* !! */ ;
                                var25_39 /* !! */  = var18_32;
                                var18_32 = var22_36;
lbl-1000:
                                // 2 sources

                                {
                                    var37_51 = var19_33.a;
                                    var22_36 = var19_33.b;
                                    var38_52 = var22_36.a((Rv1)var20_34);
                                    var27_41 = var15_27;
                                    var39_53 = var24_38.element;
                                    var14_26 = var4_4 /* !! */ .i((Jk2)var5_17 /* !! */ , (Rv1)var20_34, var37_51, var38_52 += var39_53);
                                    var15_27 = var5_17 /* !! */ .l;
                                }
                                {
                                    var23_37.element = var14_26;
                                }
                                if (var14_26 != null || (var37_51 = (var14_26 = var15_27.a((Rv1)var20_34)) instanceof Ov1$a) != 0) ** GOTO lbl714
                                {
                                    var37_51 = (int)var21_35.element;
                                    var14_26 = var37_51 != 0 ? Ov1$c.b : Ov1$c.c;
                                    var15_27.c((Rv1)var20_34, (Ov1)var14_26);
lbl714:
                                    // 2 sources

                                    var14_26 = var25_39 /* !! */ ;
                                    var14_26 = (am2$b$b)var25_39 /* !! */ ;
                                    var5_17 /* !! */  = var5_17 /* !! */ .f((am2$b$b)var14_26, (Rv1)var20_34);
                                    var14_26 = var4_4 /* !! */ .j;
                                    var8_20.a = var4_4 /* !! */ ;
                                    var8_20.b = var20_34;
                                    var8_20.c = var19_33;
                                    var8_20.d = var24_38;
                                    var8_20.e = var23_37;
                                    var8_20.f = var21_35;
                                    var8_20.g = var18_32;
                                    var8_20.h = var25_39 /* !! */ ;
                                    var8_20.i = var6_18 /* !! */ ;
                                    var39_53 = 0;
                                    var15_27 = null;
                                    var8_20.j = null;
                                    var8_20.k = null;
                                    var8_20.p = var39_53 = 10;
                                    if ((var5_17 /* !! */  = var14_26.o((f80_0)var8_20, (Object)var5_17 /* !! */ )) == var12_24 /* !! */ ) {
                                        return var12_24 /* !! */ ;
                                    }
                                    var5_17 /* !! */  = var6_18 /* !! */ ;
                                    var22_36 = var24_38;
                                    var24_38 = var20_34;
                                    var28_42 /* !! */  = var19_33;
                                    var19_33 = var4_4 /* !! */ ;
                                    var4_4 /* !! */  = var25_39 /* !! */ ;
                                    var25_39 /* !! */  = var18_32;
                                    var18_32 = var21_35;
                                    ** continue;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var6_18 /* !! */  = Unit.a;
                                    var29_43 /* !! */  = 0;
                                    var6_18 /* !! */  = null;
                                    var5_17 /* !! */ .b(null);
                                }
                                var17_29 /* !! */  = var25_39 /* !! */  instanceof am2$a$b;
                                if (var17_29 /* !! */  == 0) ** GOTO lbl-1000
                                var5_17 /* !! */  = var4_4 /* !! */ ;
                                var5_17 /* !! */  = ((am2$b$b)var4_4 /* !! */ ).b;
                                if (var5_17 /* !! */  == null) {
                                    var17_29 /* !! */  = 1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var17_29 /* !! */  = 0;
                                    var5_17 /* !! */  = null;
                                }
                                var29_43 /* !! */  = var25_39 /* !! */  instanceof am2$a$a;
                                if (var29_43 /* !! */  != 0 && (var4_4 /* !! */  = ((am2$b$b)var4_4 /* !! */ ).c) == null) {
                                    var16_28 = 1;
                                } else {
                                    var16_28 = 0;
                                    var4_4 /* !! */  = null;
                                }
                                var6_18 /* !! */  = var19_33.e;
                                if (var6_18 /* !! */  == null || var17_29 /* !! */  == 0 && var16_28 == 0) break block124;
                                var6_18 /* !! */  = var19_33.k;
                                var25_39 /* !! */  = var6_18 /* !! */ .a;
                                var8_20.a = var19_33;
                                var8_20.b = var24_38;
                                var8_20.c = var21_35;
                                var8_20.d = var22_36;
                                var8_20.e = var23_37;
                                var8_20.f = var18_32;
                                var8_20.g = var6_18 /* !! */ ;
                                var8_20.h = var25_39 /* !! */ ;
                                var37_51 = 0;
                                var14_26 = null;
                                var8_20.i = null;
                                var8_20.l = var17_29 /* !! */ ;
                                var8_20.m = var16_28;
                                var8_20.p = var39_53 = 11;
                                var15_27 = var25_39 /* !! */ .d((f80_0)var8_20, null);
                                if (var15_27 == var12_24 /* !! */ ) {
                                    return var12_24 /* !! */ ;
                                }
                                var20_34 = var18_32;
                                var18_32 = var25_39 /* !! */ ;
                            }
                            try {
                                var6_18 /* !! */  = var6_18 /* !! */ .b;
                                var25_39 /* !! */  = var19_33.h;
                                var25_39 /* !! */  = var25_39 /* !! */ .a;
                                var25_39 /* !! */  = var25_39 /* !! */ .c;
                                var6_18 /* !! */  = var6_18 /* !! */ .a((rE3$a)var25_39 /* !! */ );
                                var34_48 = 0;
                                var18_32.b(null);
                                var25_39 /* !! */  = var19_33.e;
                                if (var17_29 /* !! */  != 0) {
                                    var5_17 /* !! */  = Rv1.PREPEND;
                                    var25_39 /* !! */ .d(var5_17 /* !! */ , (cm2)var6_18 /* !! */ );
                                }
                                if (var16_28 != 0) {
                                    var4_4 /* !! */  = Rv1.APPEND;
                                    var25_39 /* !! */ .d((Rv1)var4_4 /* !! */ , (cm2)var6_18 /* !! */ );
                                }
                                var18_32 = var23_37;
                                var23_37 = var24_38;
                                var24_38 = var19_33;
                                var4_4 /* !! */  = var20_34;
                            }
                            catch (Throwable var4_16) {
                                var18_32.b(null);
                                throw var4_16;
                            }
lbl805:
                            // 2 sources

                            while (true) {
                                var14_26 = var26_40;
                                var15_27 = var27_41;
                                ** continue;
                                break;
                            }
                        }
                        var4_4 /* !! */  = var18_32;
                        var18_32 = var23_37;
                        var23_37 = var24_38;
                        var24_38 = var19_33;
                        ** while (true)
                    }
                    var5_17 /* !! */ .b(null);
                    throw var4_6;
                    var16_28 = (int)Log.isLoggable((String)var15_27, (int)2);
                    if (var16_28 == 0) return Unit.a;
                    var4_4 /* !! */  = var21_35.element;
                    var20_34.getClass();
                    var4_4 /* !! */  = yk2_1.h((Rv1)var19_33, var4_4 /* !! */ , null);
                    Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var14_26);
                    return Unit.a;
                }
                var25_39 /* !! */ .b(null);
                throw var4_10;
            }
            try {
                var4_4 /* !! */  = new IllegalStateException(var13_25 /* !! */ );
                throw var4_4 /* !! */ ;
            }
            catch (Throwable var4_11) {}
        }
        var5_17 /* !! */  = var13_25 /* !! */ .toString();
        var4_4 /* !! */  = new IllegalArgumentException((String)var5_17 /* !! */ );
        throw var4_4 /* !! */ ;
    }

    public static final Object c(yk2_1 object, Rv1 object2, re3_0 re3_02, Ek2$c$a$b object3) {
        block8: {
            block7: {
                block6: {
                    object.getClass();
                    int[] nArray = yk2$a.$EnumSwitchMapping$0;
                    int n3 = ((Enum)object2).ordinal();
                    int n4 = nArray[n3];
                    n3 = 1;
                    if (n4 != n3) break block6;
                    if ((object = ((yk2_1)object).f((f80_0)object3)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
                        object = Unit.a;
                    }
                    break block7;
                }
                if (re3_02 == null) break block8;
                object = ((yk2_1)object).h;
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "loadType");
                Intrinsics.checkNotNullParameter(re3_02, "viewportHint");
                object3 = Rv1.PREPEND;
                if (object2 != object3 && object2 != (object3 = Rv1.APPEND)) {
                    object = new StringBuilder("invalid load type for reset: ");
                    ((StringBuilder)object).append(object2);
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
                object3 = new w61((Rv1)((Object)object2), re3_02);
                object = ((v61)object).a;
                object2 = null;
                ((v61$b)object).a(null, (Function2)object3);
                object = Unit.a;
            }
            return object;
        }
        object2 = "Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final void d(yk2_1 yk2_12, i90_0 i90_02) {
        Object object = yk2_12.c;
        int n3 = ((Kl2)object).f;
        int n4 = -1 << -1;
        int n7 = 3;
        if (n3 != n4) {
            object = new Gk2(yk2_12, null);
            Ae3.d(i90_02, null, null, (Function2)object, n7);
        }
        object = new hk2_0(yk2_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, n7);
        object = new ik2_0(yk2_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, n7);
    }

    public static String h(Rv1 object, Object object2, am2$b object3) {
        String string2 = "End ";
        if (object3 == null) {
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            ((StringBuilder)object3).append(" with loadkey ");
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(". Load CANCELLED.");
            object = ((StringBuilder)object3).toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            stringBuilder.append(" with loadKey ");
            stringBuilder.append(object2);
            stringBuilder.append(". Returned ");
            stringBuilder.append(object3);
            object = stringBuilder.toString();
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(f80_0 var1_1) {
        var2_3 = var1_1 instanceof yk2$b;
        if (!var2_3) ** GOTO lbl-1000
        var3_4 = var1_1;
        var3_4 = (yk2$b)var1_1;
        var4_5 = var3_4.f;
        var5_6 = -1 << -1;
        var6_7 = var4_5 & var5_6;
        if (var6_7 != 0) {
            var3_4.f = var4_5 -= var5_6;
        } else lbl-1000:
        // 2 sources

        {
            var3_4 = new yk2$b(this, (f80_0)var1_1);
        }
        var1_1 = var3_4.d;
        var7_8 = j90_0.COROUTINE_SUSPENDED;
        var5_6 = var3_4.f;
        var6_7 = 1;
        if (var5_6 == 0) ** GOTO lbl25
        if (var5_6 == var6_7) {
            var7_8 = var3_4.c;
            var8_9 = var3_4.b;
            var3_4 = var3_4.a;
            vl2_2.b(var1_1);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl25:
            // 1 sources

            vl2_2.b(var1_1);
            var8_9 = this.k;
            var1_1 = var8_9.a;
            var3_4.a = this;
            var3_4.b = var8_9;
            var3_4.c = var1_1;
            var3_4.f = var6_7;
            var3_4 = var1_1.d((f80_0)var3_4, null);
            if (var3_4 == var7_8) {
                return var7_8;
            }
            var3_4 = this;
            var7_8 = var1_1;
        }
        try {
            var1_1 = var8_9.b;
            var3_4 = var3_4.h;
            var3_4 = var3_4.a;
            var3_4 = var3_4.c;
            var1_1 = var1_1.a((rE3$a)var3_4);
            return var1_1;
        }
        finally {
            var7_8.b(null);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f(f80_0 var1_1) {
        block53: {
            block51: {
                block56: {
                    block57: {
                        block61: {
                            block54: {
                                block58: {
                                    block55: {
                                        block62: {
                                            block52: {
                                                block59: {
                                                    block60: {
                                                        var2_9 = var1_1 instanceof yk2$c;
                                                        if (!var2_9) ** GOTO lbl-1000
                                                        var3_10 = var1_1;
                                                        var3_10 = (yk2$c)var1_1;
                                                        var4_11 = var3_10.g;
                                                        var5_12 = -1 << -1;
                                                        var6_13 = var4_11 & var5_12;
                                                        if (var6_13 != 0) {
                                                            var3_10.g = var4_11 -= var5_12;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var3_10 = new yk2$c(this, (f80_0)var1_1);
                                                        }
                                                        var1_1 = var3_10.e;
                                                        var7_14 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                        var5_12 = var3_10.g;
                                                        var8_15 = "message";
                                                        var9_16 = "Paging";
                                                        var10_17 = 0;
                                                        var11_18 = null;
                                                        var12_19 = 3;
                                                        var13_20 = 2;
                                                        var14_21 = 1;
                                                        switch (var5_12) {
                                                            default: {
                                                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                throw var1_1;
                                                            }
                                                            case 9: {
                                                                var3_10 = (hs1_2)var3_10.a;
                                                                try {
                                                                    vl2_2.b(var1_1);
                                                                    ** GOTO lbl-1000
                                                                }
                                                                catch (Throwable var1_2) {
                                                                    break block51;
                                                                }
                                                            }
                                                            case 8: {
                                                                var15_22 = var3_10.d;
                                                                var8_15 = (Jk2$a)var3_10.c;
                                                                var9_16 = (am2$b)var3_10.b;
                                                                var11_18 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                break block57;
                                                            }
                                                            case 7: {
                                                                var7_14 /* !! */  = var3_10.d;
                                                                var15_22 = (Jk2$a)var3_10.c;
                                                                var8_15 = (am2$b)var3_10.b;
                                                                var3_10 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                break block58;
                                                            }
                                                            case 6: {
                                                                var15_22 = (hs1_2)var3_10.c;
                                                                var8_15 = (am2$b)var3_10.b;
                                                                var9_16 = (yk2_1)var3_10.a;
                                                                try {
                                                                    vl2_2.b(var1_1);
                                                                    ** GOTO lbl-1000
                                                                }
                                                                catch (Throwable var1_3) {
                                                                    break block52;
                                                                }
                                                            }
                                                            case 5: {
                                                                var15_22 = var3_10.d;
                                                                var8_15 = (Jk2$a)var3_10.c;
                                                                var9_16 = (am2$b)var3_10.b;
                                                                var11_18 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                ** GOTO lbl-1000
                                                            }
                                                            case 4: {
                                                                var15_22 = var3_10.d;
                                                                var16_23 = (Jk2$a)var3_10.c;
                                                                var17_24 = (am2$b)var3_10.b;
                                                                var18_25 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                break block59;
                                                            }
                                                            case 3: {
                                                                var15_22 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                break block60;
                                                            }
                                                            case 2: {
                                                                var15_22 = (hs1_2)var3_10.b;
                                                                var17_24 = (yk2_1)var3_10.a;
                                                                try {
                                                                    vl2_2.b(var1_1);
                                                                    ** GOTO lbl-1000
                                                                }
                                                                catch (Throwable var1_4) {
                                                                    break block53;
                                                                }
                                                            }
                                                            case 1: {
                                                                var15_22 = (hs1_2)var3_10.c;
                                                                var17_24 = (Jk2$a)var3_10.b;
                                                                var18_25 = (yk2_1)var3_10.a;
                                                                vl2_2.b(var1_1);
                                                                break;
                                                            }
                                                            case 0: {
                                                                vl2_2.b(var1_1);
                                                                var17_24 = this.k;
                                                                var1_1 = var17_24.a;
                                                                var3_10.a = this;
                                                                var3_10.b = var17_24;
                                                                var3_10.c = var1_1;
                                                                var3_10.g = var14_21;
                                                                var15_22 = var1_1.d((f80_0)var3_10, null);
                                                                if (var15_22 == var7_14 /* !! */ ) {
                                                                    return var7_14 /* !! */ ;
                                                                }
                                                                var18_25 = this;
                                                                var15_22 = var1_1;
                                                            }
                                                        }
                                                        {
                                                            var1_1 = var17_24.b;
                                                            var17_24 = Rv1.REFRESH;
                                                            var3_10.a = var18_25;
                                                            var3_10.b = var15_22;
                                                            var3_10.c = null;
                                                            var3_10.g = var13_20;
                                                            var1_1 = var18_25.k((Jk2)var1_1, (Rv1)var17_24, (h80_0)var3_10);
                                                            if (var1_1 == var7_14 /* !! */ ) {
                                                                return var7_14 /* !! */ ;
                                                            }
                                                            var17_24 = var18_25;
                                                        }
lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var1_1 = Unit.a;
                                                            var15_22.b(null);
                                                            var1_1 = Rv1.REFRESH;
                                                            var15_22 = var17_24.a;
                                                            var1_1 = var17_24.g((Rv1)var1_1, var15_22);
                                                            var15_22 = Build.ID;
                                                        }
                                                        if (var15_22 == null || (var5_12 = (int)Log.isLoggable((String)var9_16, (int)var12_19)) == 0) {
                                                            var14_21 = 0;
                                                            var16_23 = null;
                                                        }
                                                        var15_22 = var17_24.b;
                                                        if (var14_21 != 0) {
                                                            var16_23 = new StringBuilder("Start REFRESH with loadKey ");
                                                            var18_25 = var17_24.a;
                                                            var16_23.append(var18_25);
                                                            var18_25 = " on ";
                                                            var16_23.append((String)var18_25);
                                                            var16_23.append(var15_22);
                                                            var16_23 = var16_23.toString();
                                                            Intrinsics.checkNotNullParameter(var16_23, (String)var8_15);
                                                        }
                                                        var3_10.a = var17_24;
                                                        var3_10.b = null;
                                                        var3_10.g = var12_19;
                                                        if ((var1_1 = var15_22.c((am2$a)var1_1, (f80_0)var3_10)) == var7_14 /* !! */ ) {
                                                            return var7_14 /* !! */ ;
                                                        }
                                                        var15_22 = var17_24;
                                                    }
                                                    var1_1 = (am2$b)var1_1;
                                                    var14_21 = var1_1 instanceof am2$b$b;
                                                    if (var14_21 == 0) break block61;
                                                    var16_23 = var15_22.k;
                                                    var17_24 = var16_23.a;
                                                    var3_10.a = var15_22;
                                                    var3_10.b = var1_1;
                                                    var3_10.c = var16_23;
                                                    var3_10.d = var17_24;
                                                    var3_10.g = var19_26 = 4;
                                                    var18_25 = var17_24.d((f80_0)var3_10, null);
                                                    if (var18_25 == var7_14 /* !! */ ) {
                                                        return var7_14 /* !! */ ;
                                                    }
                                                    var18_25 = var15_22;
                                                    var15_22 = var17_24;
                                                    var17_24 = var1_1;
                                                }
                                                try {
                                                    var1_1 = var16_23.b;
                                                    var16_23 = Rv1.REFRESH;
                                                    var20_27 /* !! */  = var17_24;
                                                    var20_27 /* !! */  = (am2$b$b)var17_24;
                                                    var10_17 = var1_1.e(0, (Rv1)var16_23, (am2$b$b)var20_27 /* !! */ );
                                                    var1_1 = var1_1.l;
                                                }
                                                catch (Throwable var1_5) {
                                                    break block54;
                                                }
                                                var20_27 /* !! */  = Ov1$c.c;
                                                var1_1.c((Rv1)var16_23, (Ov1)var20_27 /* !! */ );
                                                var20_27 /* !! */  = var17_24;
                                                var20_27 /* !! */  = (am2$b$b)var17_24;
                                                var20_27 /* !! */  = var20_27 /* !! */ .b;
                                                var21_28 = Ov1$c.b;
                                                if (var20_27 /* !! */  == null) {
                                                    var20_27 /* !! */  = Rv1.PREPEND;
                                                    var1_1.c((Rv1)var20_27 /* !! */ , var21_28);
                                                }
                                                var20_27 /* !! */  = var17_24;
                                                var20_27 /* !! */  = (am2$b$b)var17_24;
                                                var20_27 /* !! */  = var20_27 /* !! */ .c;
                                                if (var20_27 /* !! */  == null) {
                                                    var20_27 /* !! */  = Rv1.APPEND;
                                                    var1_1.c((Rv1)var20_27 /* !! */ , var21_28);
                                                }
                                                var15_22.b(null);
                                                if (var10_17 == 0) break block62;
                                                var1_1 = Build.ID;
                                                if (var1_1 != null && (var22_29 = Log.isLoggable((String)var9_16, (int)var12_19))) {
                                                    var1_1 = var18_25.a;
                                                    var1_1 = yk2_1.h((Rv1)var16_23, var1_1, (am2$b)var17_24);
                                                    Intrinsics.checkNotNullParameter(var1_1, (String)var8_15);
                                                }
                                                var8_15 = var18_25.k;
                                                var1_1 = var8_15.a;
                                                var3_10.a = var18_25;
                                                var3_10.b = var17_24;
                                                var3_10.c = var8_15;
                                                var3_10.d = var1_1;
                                                var3_10.g = var5_12 = 5;
                                                var15_22 = var1_1.d((f80_0)var3_10, null);
                                                if (var15_22 == var7_14 /* !! */ ) {
                                                    return var7_14 /* !! */ ;
                                                }
                                                var15_22 = var1_1;
                                                var9_16 = var17_24;
                                                var11_18 = var18_25;
lbl-1000:
                                                // 2 sources

                                                {
                                                    var1_1 = var8_15.b;
                                                    var8_15 = var11_18.j;
                                                    var23_31 = var9_16;
                                                    var23_31 = (am2$b$b)var9_16;
                                                    var24_32 = Rv1.REFRESH;
                                                    var1_1 = var1_1.f((am2$b$b)var23_31, var24_32);
                                                    var3_10.a = var11_18;
                                                    var3_10.b = var9_16;
                                                    var3_10.c = var15_22;
                                                    var3_10.d = null;
                                                    var3_10.g = var12_19 = 6;
                                                    var1_1 = var8_15.o((f80_0)var3_10, var1_1);
                                                    if (var1_1 == var7_14 /* !! */ ) {
                                                        return var7_14 /* !! */ ;
                                                    }
                                                    var8_15 = var9_16;
                                                    var9_16 = var11_18;
                                                }
lbl-1000:
                                                // 2 sources

                                                {
                                                    var1_1 = Unit.a;
                                                    var15_22.b(null);
                                                    break block55;
                                                }
                                            }
                                            var15_22.b(null);
                                            throw var1_3;
                                        }
                                        var1_1 = Build.ID;
                                        if (var1_1 != null && (var22_30 = Log.isLoggable((String)var9_16, (int)var13_20))) {
                                            var1_1 = var18_25.a;
                                            var1_1 = yk2_1.h((Rv1)var16_23, var1_1, null);
                                            Intrinsics.checkNotNullParameter(var1_1, (String)var8_15);
                                        }
                                        var8_15 = var17_24;
                                        var9_16 = var18_25;
                                    }
                                    var1_1 = var9_16.e;
                                    if (var1_1 == null) return Unit.a;
                                    var1_1 = var8_15;
                                    var1_1 = (am2$b$b)var8_15;
                                    var15_22 = var1_1.b;
                                    if (var15_22 != null) {
                                        var1_1 = var1_1.c;
                                        if (var1_1 != null) return Unit.a;
                                    }
                                    var15_22 = var9_16.k;
                                    var1_1 = var15_22.a;
                                    var3_10.a = var9_16;
                                    var3_10.b = var8_15;
                                    var3_10.c = var15_22;
                                    var3_10.d = var1_1;
                                    var3_10.g = var10_17 = 7;
                                    if ((var3_10 = var1_1.d((f80_0)var3_10, null)) == var7_14 /* !! */ ) {
                                        return var7_14 /* !! */ ;
                                    }
                                    var7_14 /* !! */  = var1_1;
                                    var3_10 = var9_16;
                                }
                                try {
                                    var1_1 = var15_22.b;
                                    var15_22 = var3_10.h;
                                    var15_22 = var15_22.a;
                                    var15_22 = var15_22.c;
                                    var1_1 = var1_1.a((rE3$a)var15_22);
                                    var8_15 = (am2$b$b)var8_15;
                                    var7_14 /* !! */  = var8_15.b;
                                    var3_10 = var3_10.e;
                                    if (var7_14 /* !! */  == null) {
                                        var7_14 /* !! */  = Rv1.PREPEND;
                                        var3_10.d((Rv1)var7_14 /* !! */ , (cm2)var1_1);
                                    }
                                    if ((var7_14 /* !! */  = var8_15.c) != null) return Unit.a;
                                    var7_14 /* !! */  = Rv1.APPEND;
                                    var3_10.d((Rv1)var7_14 /* !! */ , (cm2)var1_1);
                                    return Unit.a;
                                }
                                finally {
                                    var7_14 /* !! */ .b(null);
                                }
                            }
                            var15_22.b(null);
                            throw var1_5;
                        }
                        var10_17 = var1_1 instanceof am2$b$a;
                        if (var10_17 == 0) return Unit.a;
                        var11_18 = Build.ID;
                        if (var11_18 != null && (var25_33 = Log.isLoggable((String)var9_16, (int)var13_20))) {
                            var9_16 = Rv1.REFRESH;
                            var11_18 = var15_22.a;
                            var9_16 = yk2_1.h((Rv1)var9_16, var11_18, (am2$b)var1_1);
                            Intrinsics.checkNotNullParameter(var9_16, (String)var8_15);
                        }
                        var8_15 = var15_22.k;
                        var9_16 = var8_15.a;
                        var3_10.a = var15_22;
                        var3_10.b = var1_1;
                        var3_10.c = var8_15;
                        var3_10.d = var9_16;
                        var3_10.g = var10_17 = 8;
                        var11_18 = var9_16.d((f80_0)var3_10, null);
                        if (var11_18 == var7_14 /* !! */ ) {
                            return var7_14 /* !! */ ;
                        }
                        var11_18 = var15_22;
                        var15_22 = var9_16;
                        var9_16 = var1_1;
                    }
                    try {
                        var1_1 = var8_15.b;
                        var9_16 = (am2$b$a)var9_16;
                        var9_16 = var9_16.a;
                        var9_16 = (Exception)var9_16;
                        var8_15 = new Ov1$a((Exception)var9_16);
                        var9_16 = Rv1.REFRESH;
                        var3_10.a = var15_22;
                        var3_10.b = null;
                        var3_10.c = null;
                        var3_10.d = null;
                        var3_10.g = var12_19 = 9;
                        var1_1 = var11_18.j((Jk2)var1_1, (Rv1)var9_16, (Ov1$a)var8_15, (h80_0)var3_10);
                        if (var1_1 == var7_14 /* !! */ ) {
                            return var7_14 /* !! */ ;
                        }
                        var3_10 = var15_22;
                    }
                    catch (Throwable var1_7) {
                        break block56;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = Unit.a;
                        var3_10.b(null);
                        return Unit.a;
                    }
                }
                var3_10 = var15_22;
            }
            var3_10.b(null);
            throw var1_8;
        }
        var15_22.b(null);
        throw var1_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final am2$a g(Rv1 object, Object object2) {
        void var1_8;
        String string2;
        Rv1 rv1 = Rv1.REFRESH;
        Kl2 kl2 = this.c;
        int n3 = object == rv1 ? kl2.d : kl2.a;
        n3 = (int)(kl2.c ? 1 : 0);
        Intrinsics.checkNotNullParameter(object, "loadType");
        int[] nArray = bm2.$EnumSwitchMapping$0;
        int n7 = ((Enum)object).ordinal();
        n7 = nArray[n7];
        n3 = 1;
        if (n7 == n3) {
            am2$a$c am2$a$c = new am2$a$c(string2);
            return var1_8;
        }
        n3 = 2;
        if (n7 != n3) {
            n3 = 3;
            if (n7 != n3) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            if (string2 != null) {
                am2$a$a am2$a$a = new am2$a$a(string2);
                return var1_8;
            }
            string2 = "key cannot be null for append".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        if (string2 != null) {
            am2$a$b am2$a$b = new am2$a$b(string2);
            return var1_8;
        }
        string2 = "key cannot be null for prepend".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object i(Jk2 object, Rv1 rv1, int n3, int n4) {
        object.getClass();
        Intrinsics.checkNotNullParameter((Object)rv1, "loadType");
        int[] nArray = Jk2$b.$EnumSwitchMapping$0;
        int n7 = rv1.ordinal();
        int n8 = nArray[n7];
        n7 = 1;
        if (n8 == n7) {
            object = new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
            throw object;
        }
        n7 = 2;
        if (n8 != n7) {
            n7 = 3;
            if (n8 != n7) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            n8 = ((Jk2)object).h;
        } else {
            n8 = ((Jk2)object).g;
        }
        n7 = 0;
        if (n3 != n8) {
            return null;
        }
        Ov1 ov1 = ((Jk2)object).l.a(rv1);
        n3 = ov1 instanceof Ov1$a;
        if (n3 != 0) {
            return null;
        }
        Kl2 kl2 = this.c;
        n3 = kl2.b;
        if (n4 >= n3) {
            return null;
        }
        Rv1 rv12 = Rv1.PREPEND;
        object = ((Jk2)object).c;
        if (rv1 != rv12) return ((am2$b$b)CollectionsKt.S((List)object)).c;
        return ((am2$b$b)CollectionsKt.L((List)object)).b;
    }

    public final Object j(Jk2 object, Rv1 object2, Ov1$a ov1$a, h80_0 h80_02) {
        Ov1 ov1 = ((Jk2)object).l.a((Rv1)((Object)object2));
        boolean bl2 = Intrinsics.areEqual(ov1, ov1$a);
        if (!bl2) {
            object = ((Jk2)object).l;
            ((AR1)object).c((Rv1)((Object)object2), ov1$a);
            object = ((AR1)object).d();
            ov1$a = null;
            object2 = new rk2$c((Qv1)object, null);
            object = this.j.o(h80_02, object2);
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object == object2) {
                return object;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public final Object k(Jk2 object, Rv1 object2, h80_0 h80_02) {
        Ov1$b ov1$b;
        Ov1 ov1 = ((Jk2)object).l.a((Rv1)((Object)object2));
        boolean bl2 = Intrinsics.areEqual(ov1, ov1$b = Ov1$b.b);
        if (!bl2) {
            object = ((Jk2)object).l;
            ((AR1)object).c((Rv1)((Object)object2), ov1$b);
            object = ((AR1)object).d();
            bl2 = false;
            ov1 = null;
            object2 = new rk2$c((Qv1)object, null);
            object = this.j.o(h80_02, object2);
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object == object2) {
                return object;
            }
            return Unit.a;
        }
        return Unit.a;
    }
}

