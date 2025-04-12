/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import coil.memory.c;
import java.io.Closeable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Kz0
 */
public final class kz0_0
implements mj1 {
    public final ce1_0 a;
    public final oh3_0 b;
    public final hK2 c;
    public final c d;

    public kz0_0(ce1_0 ce1_02, oh3_0 object, hK2 hK22) {
        this.a = ce1_02;
        this.b = object;
        this.c = hK22;
        this.d = object = new c(ce1_02, hK22);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(kz0_0 var0, N93 var1_1, n10_0 var2_2, pe1_0 var3_3, Object var4_4, ba2 var5_5, GB0 var6_6, f80_0 var7_7) {
        block13: {
            block14: {
                var8_8 = var7_7;
                var0.getClass();
                var9_9 = var7_7 instanceof Lz0;
                if (!var9_9) ** GOTO lbl-1000
                var10_10 /* !! */  = var7_7;
                var10_10 /* !! */  = (Lz0)var7_7;
                var11_11 = var10_10 /* !! */ .l;
                var12_12 = -1 << -1;
                var13_13 = var11_11 & var12_12;
                if (var13_13 != 0) {
                    var10_10 /* !! */ .l = var11_11 -= var12_12;
                    var14_14 = var0;
                } else lbl-1000:
                // 2 sources

                {
                    var14_14 = var0;
                    var10_10 /* !! */  = new Lz0(var0, (f80_0)var8_8);
                }
                var8_8 = var10_10 /* !! */ .j;
                var15_15 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var13_13 = var10_10 /* !! */ .l;
                var16_16 = 1;
                var17_17 = null;
                if (var13_13 == 0) break block13;
                if (var13_13 != var16_16) break block14;
                var11_11 = var10_10 /* !! */ .i;
                var18_18 = var10_10 /* !! */ .g;
                var19_19 = var10_10 /* !! */ .f;
                var20_20 = var10_10 /* !! */ .e;
                var21_21 = var10_10 /* !! */ .d;
                var22_22 = var10_10 /* !! */ .c;
                var23_23 = var10_10 /* !! */ .b;
                var24_24 = var10_10 /* !! */ .a;
                vl2_2.b(var8_8);
                var25_25 = var24_24;
                var24_24 = var10_10 /* !! */ ;
                var10_10 /* !! */  = var22_22;
                var26_26 = var11_11;
                var14_14 = var25_25;
                var27_27 = var21_21;
                var21_21 = var18_18;
                var18_18 = var27_27;
                var28_28 = var20_20;
                var20_20 = var19_19;
                var19_19 = var28_28;
                ** GOTO lbl98
            }
            var8_8 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var8_8;
        }
        vl2_2.b(var8_8);
        var29_29 = false;
        var8_8 = var1_1;
        var18_18 = var3_3;
        var19_19 = var4_4;
        var20_20 = var5_5;
        var21_21 = var6_6;
        var23_23 = var10_10 /* !! */ ;
        var26_26 = 0;
        var22_22 = null;
        var10_10 /* !! */  = var2_2;
        while (true) {
            block16: {
                block15: {
                    block12: {
                        var24_24 = var14_14.a;
                        var24_24 = var10_10 /* !! */ .e;
                        var30_30 = var24_24.size();
                        while (var26_26 < var30_30) {
                            var31_31 = ((dj0$a)var24_24.get(var26_26)).a((N93)var8_8, (ba2)var20_20);
                            if (var31_31 != null) {
                                var22_22 = var26_26;
                                var24_24 = new Pair(var31_31, var22_22);
                                break block12;
                            }
                            ++var26_26;
                        }
                        var32_32 = 0;
                        var24_24 = null;
                    }
                    if (var24_24 == null) break;
                    var22_22 = (dj0)var24_24.a;
                    var24_24 = (Number)var24_24.b;
                    var32_32 = var24_24.intValue() + var16_16;
                    var21_21.getClass();
                    var23_23.a = var14_14;
                    var23_23.b = var8_8;
                    var23_23.c = var10_10 /* !! */ ;
                    var23_23.d = var18_18;
                    var23_23.e = var19_19;
                    var23_23.f = var20_20;
                    var23_23.g = var21_21;
                    var23_23.h = var22_22;
                    var23_23.i = var32_32;
                    var23_23.l = var16_16;
                    var22_22 = var22_22.a((f80_0)var23_23);
                    if (var22_22 == var15_15 /* !! */ ) break block15;
                    var25_25 = var23_23;
                    var23_23 = var8_8;
                    var8_8 = var22_22;
                    var26_26 = var32_32;
                    var24_24 = var25_25;
lbl98:
                    // 2 sources

                    var8_8 = (aj0)var8_8;
                    var21_21.getClass();
                    if (var8_8 == null) break block16;
                    var10_10 /* !! */  = var23_23.c;
                    var14_14 = var23_23.a;
                    var13_13 = var14_14 instanceof vL0;
                    if (var13_13 != 0) {
                        var14_14 = (vL0)var14_14;
                    } else {
                        var11_11 = 0;
                        var14_14 = null;
                    }
                    if (var14_14 != null) {
                        var17_17 = var14_14.c;
                    }
                    var14_14 = var8_8.a;
                    var29_29 = var8_8.b;
                    var15_15 /* !! */  = new Kz0$a((Drawable)var14_14, var29_29, (ri0)var10_10 /* !! */ , var17_17);
                }
                return var15_15 /* !! */ ;
            }
            var8_8 = var23_23;
            var23_23 = var24_24;
        }
        var8_8 = jk0_0.a(var19_19, "Unable to create a decoder that supports: ");
        var8_8 = var8_8.toString();
        var10_10 /* !! */  = new IllegalStateException((String)var8_8);
        throw var10_10 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object c(kz0_0 var0, pe1_0 var1_1, Object var2_2, ba2 var3_3, GB0 var4_4, f80_0 var5_5) {
        block55: {
            block53: {
                block49: {
                    block54: {
                        block48: {
                            block47: {
                                block46: {
                                    block50: {
                                        block51: {
                                            block52: {
                                                var6_6 = var0;
                                                var7_15 = var1_1;
                                                var8_16 = var5_5;
                                                var0.getClass();
                                                var9_17 = var5_5 instanceof mz0_0;
                                                if (var9_17 == 0) ** GOTO lbl-1000
                                                var10_18 = var5_5;
                                                var10_18 = (mz0_0)var5_5;
                                                var11_19 = var10_18.k;
                                                var12_20 = -1 << -1;
                                                var13_21 = var11_19 & var12_20;
                                                if (var13_21) {
                                                    var10_18.k = var11_19 -= var12_20;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var10_18 = new mz0_0((kz0_0)var6_6, (f80_0)var8_16);
                                                }
                                                var14_22 = var10_18;
                                                var8_16 = var10_18.i;
                                                var15_23 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                var9_17 = var10_18.k;
                                                var16_24 = 3;
                                                var17_25 = 2;
                                                var11_19 = 1;
                                                if (var9_17 == 0) break block50;
                                                if (var9_17 == var11_19) break block51;
                                                if (var9_17 == var17_25) break block52;
                                                if (var9_17 != var16_24) {
                                                    var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var6_6;
                                                }
                                                vl2_2.b(var8_16);
                                                var11_19 = 0;
                                                var18_26 = null;
                                                break block53;
                                            }
                                            var10_18 = var10_18.e;
                                            var6_6 = (Ref$ObjectRef)var14_22.d;
                                            var18_27 = (GB0)var14_22.c;
                                            var19_28 = var14_22.b;
                                            var20_29 = var14_22.a;
                                            try {
                                                vl2_2.b(var8_16);
                                                ** GOTO lbl-1000
                                            }
                                            catch (Throwable var6_7) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var11_19 = 0;
                                                    var18_27 = null;
                                                    break block46;
                                                    break;
                                                }
                                            }
                                        }
                                        var6_6 = var10_18.h;
                                        var10_18 = var10_18.g;
                                        var18_27 = var14_22.f;
                                        var19_28 = var14_22.e;
                                        var20_29 = (GB0)var14_22.d;
                                        var21_31 = var14_22.c;
                                        var22_32 = var14_22.b;
                                        var7_15 = var14_22.a;
                                        {
                                            vl2_2.b(var8_16);
                                            var23_30 = var6_6;
                                            var24_33 = var18_27;
                                            var25_34 = var19_28;
                                            var26_35 = var20_29;
                                            var27_36 = var21_31;
                                            var6_6 = var7_15;
                                            ** GOTO lbl-1000
                                        }
                                    }
                                    vl2_2.b(var8_16);
                                    var25_34 = new Ref$ObjectRef();
                                    var8_16 = var3_3;
                                    var25_34.element = var3_3;
                                    var28_37 = new Ref$ObjectRef();
                                    var28_37.element = var8_16 = var6_6.a.getComponents();
                                    var22_32 = new Ref$ObjectRef();
                                    var8_16 = var6_6.c;
                                    var10_18 = var25_34.element;
                                    var10_18 = (ba2)var10_18;
                                    var25_34.element = var8_16 = var8_16.d((ba2)var10_18);
                                    break block47;
                                }
lbl80:
                                // 4 sources

                                while (true) {
                                    var8_16 = var10_18.element;
                                    var9_17 = var8_16 instanceof N93;
                                    if (var9_17 != 0) {
                                        var23_30 = var8_16;
                                        var23_30 = (N93)var8_16;
                                    } else {
                                        var23_30 = null;
                                    }
                                    if (var23_30 == null) throw var6_8;
                                    var8_16 = var23_30.a;
                                    if (var8_16 == null) throw var6_8;
                                    m.a((Closeable)var8_16);
                                    throw var6_8;
                                }
                            }
                            var8_16 = var7_15.j;
                            var10_18 = var7_15.k;
                            if (var8_16 == null && var10_18 == null) ** GOTO lbl141
                            var8_16 = var28_37.element;
                            var8_16 = (n10_0)var8_16;
                            var8_16.getClass();
                            var19_28 = var8_16.a;
                            var19_28 = (Collection)var19_28;
                            var19_28 = CollectionsKt.m0((Collection)var19_28);
                            var20_29 = var8_16.b;
                            var20_29 = (Collection)var20_29;
                            var20_29 = CollectionsKt.m0((Collection)var20_29);
                            var21_31 = var8_16.c;
                            var21_31 = (Collection)var21_31;
                            var21_31 = CollectionsKt.m0((Collection)var21_31);
                            var29_38 = var8_16.d;
                            var29_38 = (Collection)var29_38;
                            var29_38 = CollectionsKt.m0((Collection)var29_38);
                            var8_16 = var8_16.e;
                            var8_16 = (Collection)var8_16;
                            var8_16 = CollectionsKt.m0((Collection)var8_16);
                            var26_35 = var7_15.j;
                            var23_30 = null;
                            if (var26_35 == null) break block48;
                            try {
                                var29_38.add(0, var26_35);
                            }
                            catch (Throwable var6_9) {
                                var10_18 = var22_32;
                                ** continue;
                            }
                        }
                        if (var10_18 != null) {
                            var8_16.add(0, var10_18);
                        }
                        var30_39 = e.a((List)var19_28);
                        var31_40 = e.a((List)var20_29);
                        var24_33 = e.a((List)var21_31);
                        var32_41 = e.a((List)var29_38);
                        var27_36 = e.a((List)var8_16);
                        var33_42 = var10_18;
                        var10_18 = new n10_0((List)var30_39, (List)var31_40, (List)var24_33, (List)var32_41, (List)var27_36);
                        var28_37.element = var10_18;
lbl141:
                        // 2 sources

                        var10_18 = var8_16 = var28_37.element;
                        var10_18 = (n10_0)var8_16;
                        var20_29 = var8_16 = var25_34.element;
                        var20_29 = (ba2)var8_16;
                        var14_22.a = var6_6;
                        var14_22.b = var7_15;
                        var29_38 = var2_2;
                        var14_22.c = var2_2;
                        var26_35 = var4_4;
                        var14_22.d = var4_4;
                        var14_22.e = var25_34;
                        var14_22.f = var28_37;
                        var14_22.g = var22_32;
                        var14_22.h = var22_32;
                        var14_22.k = var11_19;
                        var8_16 = var0;
                        var18_27 = var1_1;
                        var19_28 = var2_2;
                        var21_31 = var4_4;
                        var23_30 = var22_32;
                        var22_32 = var14_22;
                        try {
                            var8_16 = var0.d((n10_0)var10_18, var1_1, var2_2, (ba2)var20_29, var4_4, var14_22);
                            if (var8_16 == var15_23 /* !! */ ) {
                                return var15_23 /* !! */ ;
                            }
                            var22_32 = var7_15;
                            var27_36 = var2_2;
                            var10_18 = var23_30;
                            var24_33 = var28_37;
                        }
                        catch (Throwable var6_12) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var11_19 = 0;
                                var18_27 = null;
                                var10_18 = var23_30;
                                ** continue;
                                break;
                            }
                        }
lbl-1000:
                        // 2 sources

                        {
                            var23_30.element = var8_16;
                            var18_27 = var8_16 = var10_18.element;
                            var18_27 = (VK0)var8_16;
                        }
                        var12_20 = var18_27 instanceof N93;
                        if (var12_20 == 0) break block54;
                        {
                            var8_16 = var22_32.y;
                            var33_42 = var18_27;
                            var30_39 = var6_6;
                            var31_40 = var10_18;
                            var32_41 = var22_32;
                            var18_27 = new nz0_1((kz0_0)var6_6, (Ref$ObjectRef)var10_18, (Ref$ObjectRef)var24_33, (pe1_0)var22_32, var27_36, (Ref$ObjectRef)var25_34, (GB0)var26_35, null);
                            var14_22.a = var6_6;
                            var14_22.b = var22_32;
                            var14_22.c = var26_35;
                            var14_22.d = var25_34;
                            var14_22.e = var10_18;
                            var12_20 = 0;
                            var19_28 = null;
                            var14_22.f = null;
                            var14_22.g = null;
                            var14_22.h = null;
                            var14_22.k = var12_20 = 2;
                            if ((var8_16 = Ae3.g(var14_22, (CoroutineContext)var8_16, (Function2)var18_27)) == var15_23 /* !! */ ) {
                                return var15_23 /* !! */ ;
                            }
                            var20_29 = var6_6;
                            var19_28 = var22_32;
                            var18_27 = var26_35;
                            var6_6 = var25_34;
                        }
lbl-1000:
                        // 2 sources

                        {
                            var8_16 = (Kz0$a)var8_16;
                            var25_34 = var6_6;
                            var31_40 = var18_27;
                            var22_32 = var19_28;
                            var34_43 = var20_29;
                            break block49;
                        }
                    }
                    var11_19 = var18_27 instanceof hu0;
                    if (var11_19 == 0) break block55;
                    {
                        var19_28 = var8_16;
                        var19_28 = (hu0)var8_16;
                        var19_28 = var19_28.a;
                        var20_29 = var8_16;
                        var20_29 = (hu0)var8_16;
                        var13_21 = (int)var20_29.b;
                        var8_16 = (hu0)var8_16;
                        var8_16 = var8_16.c;
                        var21_31 = null;
                    }
                    try {
                        var18_27 = new Kz0$a((Drawable)var19_28, (boolean)var13_21, (ri0)var8_16, null);
                        var34_43 = var6_6;
                        var8_16 = var18_27;
                        var31_40 = var26_35;
                    }
                    catch (Throwable var6_10) {
                        var11_19 = 0;
                        var18_27 = null;
                    }
                }
                var6_6 = var10_18.element;
                var9_17 = var6_6 instanceof N93;
                if (var9_17 != 0) {
                    var19_28 = var6_6;
                    var19_28 = (N93)var6_6;
                } else {
                    var12_20 = 0;
                    var19_28 = null;
                }
                if (var19_28 != null && (var6_6 = var19_28.a) != null) {
                    m.a((Closeable)var6_6);
                }
                var33_42 = var6_6 = var25_34.element;
                var33_42 = (ba2)var6_6;
                var11_19 = 0;
                var18_27 = null;
                var14_22.a = null;
                var14_22.b = null;
                var14_22.c = null;
                var14_22.d = null;
                var14_22.e = null;
                var14_22.f = null;
                var14_22.g = null;
                var14_22.h = null;
                var14_22.k = var35_44 = 3;
                var34_43.getClass();
                var6_6 = var22_32.l;
                var9_17 = (int)var6_6.isEmpty();
                if (var9_17 == 0 && ((var9_17 = (var10_18 = var8_16.a) instanceof BitmapDrawable) != 0 || (var9_17 = (int)var22_32.p) != 0)) {
                    var32_41 = null;
                    var28_37 = var10_18;
                    var30_39 = var6_6;
                    var24_33 = var22_32;
                    var10_18 = new qz0_0((kz0_0)var34_43, (Kz0$a)var8_16, (ba2)var33_42, (List)var6_6, (GB0)var31_40, (pe1_0)var22_32, null);
                    var6_6 = var22_32.z;
                    var8_16 = var6_6 = Ae3.g(var14_22, (CoroutineContext)var6_6, (Function2)var10_18);
                }
                if (var8_16 == var15_23 /* !! */ ) {
                    return var15_23 /* !! */ ;
                }
            }
            var15_23 /* !! */  = var8_16;
            var15_23 /* !! */  = (Kz0$a)var8_16;
            var6_6 = var15_23 /* !! */ .a;
            var36_45 = var6_6 instanceof BitmapDrawable;
            if (var36_45) {
                var23_30 = var6_6;
                var23_30 = (BitmapDrawable)var6_6;
            } else {
                var23_30 = null;
            }
            if (var23_30 == null) return var15_23 /* !! */ ;
            var6_6 = var23_30.getBitmap();
            if (var6_6 == null) return var15_23 /* !! */ ;
            var6_6.prepareToDraw();
            return var15_23 /* !! */ ;
            ** GOTO lbl80
        }
        var11_19 = 0;
        var18_27 = null;
        try {
            var6_6 = new NoWhenBranchMatchedException();
            throw var6_6;
        }
        catch (Throwable var6_11) {}
        ** GOTO lbl80
        catch (Throwable var6_14) {
            var23_30 = var22_32;
            ** GOTO lbl-1000
        }
        catch (Throwable var6_13) {
            var23_30 = var22_32;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(se2_0 var1_1, f80_0 var2_2) {
        block15: {
            var3_3 = this;
            var4_4 = var1_1;
            var5_5 = var2_2;
            var6_9 = 1;
            var7_10 = this.d;
            var8_11 = var2_2 instanceof oz0_1;
            if (var8_11 == 0) ** GOTO lbl-1000
            var9_12 = var2_2;
            var9_12 = (oz0_1)var2_2;
            var10_13 = var9_12.e;
            var11_14 = -1 << -1;
            var12_15 = var10_13 & var11_14;
            if (var12_15 != 0) {
                var9_12.e = var10_13 -= var11_14;
            } else lbl-1000:
            // 2 sources

            {
                var9_12 = new oz0_1(var3_3, (f80_0)var5_5);
            }
            var5_5 = var9_12;
            var9_12 = var9_12.c;
            var13_16 = j90_0.COROUTINE_SUSPENDED;
            var10_13 = var5_5.e;
            if (var10_13 != 0) {
                if (var10_13 != var6_9) {
                    var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var5_5;
                }
                var7_10 = var5_5.b;
                var14_17 = var5_5.a;
                try {
                    vl2_2.b(var9_12);
                    return var9_12;
                }
                catch (Throwable var5_6) {
                    var4_4 = var7_10;
                }
            } else {
                block14: {
                    block13: {
                        vl2_2.b(var9_12);
                        try {
                            var14_18 = var4_4.d;
                            var9_12 = var14_18.b;
                            var15_19 = var4_4.e;
                            var16_20 = m.a;
                            var17_21 = var4_4.f;
                            var16_20 = var3_3.c;
                            var16_20 = var16_20.c(var14_18, (B63)var15_19);
                            var18_22 /* !! */  = var16_20.e;
                            var17_21.getClass();
                            var19_23 = var3_3.a;
                            var19_23 = var19_23.getComponents();
                            var19_23 = var19_23.b;
                            var20_24 = var19_23;
                            var20_24 = (Collection)var19_23;
                            var21_25 = var20_24.size();
                            var22_26 = var9_12;
                            var9_12 = null;
                            for (var8_11 = 0; var8_11 < var21_25; var8_11 += var25_29) {
                                var23_27 = var19_23.get(var8_11);
                                var23_27 = (Pair)var23_27;
                                var24_28 = var23_27.a;
                                var24_28 = (bH1)var24_28;
                                var23_27 = var23_27.b;
                                var23_27 = (Class)var23_27;
                                var2_2 = var19_23;
                                var19_23 = var22_26.getClass();
                                var25_29 = (int)var23_27.isAssignableFrom((Class<?>)var19_23);
                                if (var25_29 != 0) {
                                    var19_23 = "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>";
                                    Intrinsics.checkNotNull(var24_28, (String)var19_23);
                                    var19_23 = var24_28.a(var22_26, (ba2)var16_20);
                                    if (var19_23 != null) {
                                        var22_26 = var19_23;
                                    }
                                }
                                var25_29 = 1;
                                var19_23 = var2_2;
                                var6_9 = 1;
                            }
                            var19_23 = var7_10.b(var14_18, var22_26, (ba2)var16_20, var17_21);
                            if (var19_23 == null) break block13;
                            var7_10 = var7_10.a(var14_18, (MemoryCache$Key)var19_23, (B63)var15_19, var18_22 /* !! */ );
                            break block14;
                        }
                        catch (Throwable var5_7) {
                            var14_17 = var3_3;
                            break block15;
                        }
                    }
                    var26_30 = 0;
                    var7_10 = null;
                }
                if (var7_10 != null) {
                    return coil.memory.c.c((se2_0)var4_4, var14_18, (MemoryCache$Key)var19_23, (MemoryCache$b)var7_10);
                }
                var24_28 = var14_18.x;
                var21_25 = 0;
                var20_24 = null;
                var7_10 = var23_27;
                var9_12 = this;
                var15_19 = var22_26;
                var18_22 /* !! */  = var19_23;
                var19_23 = var1_1;
                var23_27 = new pz0_1(this, var14_18, var22_26, (ba2)var16_20, var17_21, (MemoryCache$Key)var18_22 /* !! */ , var1_1, null);
                var5_5.a = var3_3;
                var5_5.b = var4_4;
                var5_5.e = var26_30 = 1;
                var9_12 = Ae3.g((f80_0)var5_5, (CoroutineContext)var24_28, (Function2)var23_27);
                if (var9_12 != var13_16) return var9_12;
                return var13_16;
            }
        }
        var26_31 = var5_8 instanceof CancellationException;
        if (var26_31 != false) throw (Throwable)var5_8;
        var7_10 = var14_17.c;
        var9_12 = var4_4.getRequest();
        var7_10.getClass();
        return hK2.a((pe1_0)var9_12, (Throwable)var5_8);
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(n10_0 var1_1, pe1_0 var2_2, Object var3_3, ba2 var4_4, GB0 var5_5, f80_0 var6_6) {
        block14: {
            block15: {
                var7_7 = var6_6;
                var8_10 = var6_6 instanceof Kz0$b;
                if (!var8_10) ** GOTO lbl-1000
                var9_11 = var6_6;
                var9_11 = (Kz0$b)var6_6;
                var10_12 = var9_11.k;
                var11_13 = -1 << -1;
                var12_14 = var10_12 & var11_13;
                if (var12_14 != 0) {
                    var9_11.k = var10_12 -= var11_13;
                    var13_15 = this;
                } else lbl-1000:
                // 2 sources

                {
                    var13_15 = this;
                    var9_11 = new Kz0$b(this, (f80_0)var7_7);
                }
                var7_7 = var9_11.i;
                var14_16 = j90_0.COROUTINE_SUSPENDED;
                var12_14 = var9_11.k;
                var15_17 = 1;
                if (var12_14 == 0) break block14;
                if (var12_14 != var15_17) break block15;
                var12_14 = var9_11.h;
                var16_18 = var9_11.f;
                var17_19 = var9_11.e;
                var18_20 = var9_11.d;
                var19_21 = var9_11.c;
                var20_22 = var9_11.b;
                var21_23 = var9_11.a;
                vl2_2.b(var7_7);
                var22_24 = var19_21;
                var19_21 = var9_11;
                var9_11 = var22_24;
                var23_25 = var12_14;
                var24_26 = var18_20;
                var25_27 = var17_19;
                var17_19 = var16_18;
                var16_18 = var25_27;
                ** GOTO lbl94
            }
            var7_7 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var7_7;
        }
        vl2_2.b(var7_7);
        var26_28 = false;
        var7_7 = var1_1;
        var24_26 = var3_3;
        var16_18 = var4_4;
        var17_19 = var5_5;
        var19_21 = var9_11;
        var21_23 = var13_15;
        var23_25 = 0;
        var18_20 = null;
        var9_11 = var2_2;
        while (true) {
            block13: {
                var20_22 = var21_23.a;
                var20_22 = var7_7.d;
                var27_29 = var20_22.size();
                while (var23_25 < var27_29) {
                    var28_30 = (Pair)var20_22.get(var23_25);
                    var29_31 = (eL0$a)var28_30.a;
                    var28_30 = (Class)var28_30.b;
                    var30_32 = var24_26.getClass();
                    var31_33 = var28_30.isAssignableFrom(var30_32);
                    if (var31_33) {
                        Intrinsics.checkNotNull(var29_31, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                        var30_32 = var29_31.a(var24_26, (ba2)var16_18);
                        if (var30_32 != null) {
                            var18_20 = var23_25;
                            var20_22 = new Pair(var30_32, var18_20);
                            break block13;
                        }
                    }
                    ++var23_25;
                }
                var20_22 = null;
            }
            if (var20_22 == null) break;
            var30_32 = (el0_0)var20_22.a;
            var18_20 = (Number)var20_22.b;
            var23_25 = var18_20.intValue() + var15_17;
            var17_19.getClass();
            var19_21.a = var21_23;
            var19_21.b = var7_7;
            var19_21.c = var9_11;
            var19_21.d = var24_26;
            var19_21.e = var16_18;
            var19_21.f = var17_19;
            var19_21.g = var30_32;
            var19_21.h = var23_25;
            var19_21.k = var15_17;
            var30_32 = var30_32.a((f80_0)var19_21);
            if (var30_32 == var14_16) {
                return var14_16;
            }
            var20_22 = var7_7;
            var7_7 = var30_32;
lbl94:
            // 2 sources

            var30_32 = var7_7;
            var30_32 = (VK0)var7_7;
            try {
                var17_19.getClass();
                if (var30_32 != null) {
                    return var30_32;
                }
                var7_7 = var20_22;
            }
            catch (Throwable var7_8) {
                var9_11 = var7_8;
                var26_28 = var30_32 instanceof N93;
                if (var26_28) {
                    var30_32 = (N93)var30_32;
                } else {
                    var31_33 = false;
                    var30_32 = null;
                }
                if (var30_32 != null && (var7_9 = var30_32.a) != null) {
                    m.a(var7_9);
                }
                throw var9_11;
            }
        }
        var7_7 = jk0_0.a(var24_26, "Unable to create a fetcher that supports: ");
        var7_7 = var7_7.toString();
        var9_11 = new IllegalStateException((String)var7_7);
        throw var9_11;
    }
}

