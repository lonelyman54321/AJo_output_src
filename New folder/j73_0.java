/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j73
 */
public final class j73_0
extends rl2_2
implements Function2 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Iterator i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;

    public j73_0(int n3, int n4, Iterator iterator, boolean bl2, f80_0 f80_02) {
        this.g = n3;
        this.h = n4;
        this.i = iterator;
        this.j = false;
        this.k = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.h;
        Iterator iterator = this.i;
        int n4 = this.g;
        boolean bl2 = this.k;
        j73_0 j73_02 = new j73_0(n4, n3, iterator, bl2, f80_02);
        j73_02.f = object;
        return j73_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (j73_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((j73_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block29: {
            block30: {
                block24: {
                    block25: {
                        block26: {
                            block27: {
                                block28: {
                                    var2_2 = this;
                                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var4_4 = this.e;
                                    var5_5 = 1;
                                    var6_6 = this.k;
                                    var7_7 = 5;
                                    var8_8 = 4;
                                    var9_9 = 3;
                                    var10_10 = 2;
                                    var11_11 = this.j;
                                    var12_12 = this.h;
                                    var13_13 = this.g;
                                    var14_14 = null;
                                    if (var4_4 == 0) break block24;
                                    if (var4_4 == var5_5) break block25;
                                    if (var4_4 == var10_10) break block26;
                                    if (var4_4 == var9_9) break block27;
                                    if (var4_4 == var8_8) break block28;
                                    if (var4_4 != var7_7) {
                                        var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var3_3 /* !! */ ;
                                    }
                                    break block26;
                                }
                                var15_15 /* !! */  = (hp2_2)this.b;
                                var16_16 = this.f;
                                vl2_2.b(var1_1);
                                ** GOTO lbl-1000
                            }
                            var15_15 /* !! */  = this.c;
                            var17_17 = (hp2_2)this.b;
                            var18_18 = (Object[])this.f;
                            vl2_2.b(var1_1);
                            ** GOTO lbl144
                        }
                        vl2_2.b(var1_1);
                        break block29;
                    }
                    var4_4 = this.d;
                    var19_20 /* !! */  = this.c;
                    var20_21 /* !! */  = (ArrayList<E>)this.b;
                    var21_23 = (xz2_2)this.f;
                    vl2_2.b(var1_1);
                    var22_24 = var21_23;
                    ** GOTO lbl81
                }
                vl2_2.b(var1_1);
                var15_15 /* !! */  = (xz2_2)this.f;
                var23_25 = 1024;
                if (var13_13 <= var23_25) {
                    var23_25 = var13_13;
                }
                var24_26 = var12_12 - var13_13;
                var25_27 = var2_2.i;
                var7_7 = 0;
                var19_20 /* !! */  = null;
                if (var24_26 < 0) break block30;
                var20_21 /* !! */  = new ArrayList<E>(var23_25);
                var22_24 = var15_15 /* !! */ ;
                var21_23 = var20_21 /* !! */ ;
                var4_4 = var24_26;
                var19_20 /* !! */  = var25_27;
                var8_8 = 0;
                var20_21 /* !! */  = null;
                while ((var23_25 = (int)var19_20 /* !! */ .hasNext()) != 0) {
                    var18_19 = var19_20 /* !! */ .next();
                    if (var8_8 > 0) {
                        var8_8 += -1;
                        continue;
                    }
                    var21_23.add(var18_19);
                    var23_25 = var21_23.size();
                    if (var23_25 != var13_13) continue;
                    var2_2.f = var22_24;
                    var2_2.b = var21_23;
                    var2_2.c = var19_20 /* !! */ ;
                    var2_2.d = var4_4;
                    var2_2.e = var5_5;
                    var20_21 /* !! */  = var22_24.a(var2_2, var21_23);
                    if (var20_21 /* !! */  == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                    var20_21 /* !! */  = var21_23;
lbl81:
                    // 2 sources

                    if (var11_11) {
                        var20_21 /* !! */ .clear();
lbl83:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var20_21 /* !! */  = new ArrayList<E>(var13_13);
                    ** continue;
                    var21_23 = var20_21 /* !! */ ;
                    var8_8 = var4_4;
                }
                var4_4 = var21_23.isEmpty() ^ var5_5;
                if (var4_4 != 0 && (var6_6 || (var4_4 = var21_23.size()) == var13_13)) {
                    var2_2.f = null;
                    var2_2.b = null;
                    var2_2.c = null;
                    var2_2.e = var10_10;
                    var15_15 /* !! */  = var22_24.a(var2_2, var21_23);
                    if (var15_15 /* !! */  == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                }
                break block29;
            }
            var18_18 = new Object[var23_25];
            var17_17 = new hp2_2((Object[])var18_18, 0);
            var18_18 = var15_15 /* !! */ ;
            var15_15 /* !! */  = var25_27;
            block2: while ((var7_7 = (int)var15_15 /* !! */ .hasNext()) != 0) {
                block31: {
                    block33: {
                        block32: {
                            var19_20 /* !! */  = var15_15 /* !! */ .next();
                            var24_26 = var17_17.a();
                            if (var24_26 == (var26_28 = var17_17.c)) break block31;
                            var24_26 = var17_17.d;
                            var8_8 = var17_17.e;
                            var24_26 = (var24_26 + var8_8) % var26_28;
                            var14_14 = var17_17.b;
                            var14_14[var24_26] = var19_20 /* !! */ ;
                            var17_17.e = ++var8_8;
                            var7_7 = var17_17.a();
                            if (var7_7 != var26_28) break block32;
                            var7_7 = var17_17.e;
                            if (var7_7 >= var13_13) break block33;
                            var7_7 = var26_28 >> 1;
                            if ((var26_28 = var26_28 + var7_7 + var5_5) > var13_13) {
                                var26_28 = var13_13;
                            }
                            if ((var7_7 = var17_17.d) == 0) {
                                var19_20 /* !! */  = Arrays.copyOf(var14_14, var26_28);
                                var20_22 = "copyOf(...)";
                                Intrinsics.checkNotNullExpressionValue(var19_20 /* !! */ , (String)var20_22);
                            } else {
                                var19_20 /* !! */  = new Object[var26_28];
                                var19_20 /* !! */  = var17_17.toArray(var19_20 /* !! */ );
                            }
                            var10_10 = var17_17.e;
                            var17_17 = var20_22 = new hp2_2(var19_20 /* !! */ , var10_10);
                        }
lbl132:
                        // 2 sources

                        while (true) {
                            var8_8 = 4;
                            var14_14 = null;
                            continue block2;
                            break;
                        }
                    }
                    var19_20 /* !! */  = var11_11 != false ? var17_17 : new ArrayList(var17_17);
                    var2_2.f = var18_18;
                    var2_2.b = var17_17;
                    var2_2.c = var15_15 /* !! */ ;
                    var2_2.e = var9_9;
                    if ((var19_20 /* !! */  = var18_18.a(var2_2, var19_20 /* !! */ )) == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
lbl144:
                    // 3 sources

                    var17_17.c(var12_12);
                    ** continue;
                }
                var3_3 /* !! */  = new IllegalStateException("ring buffer is full");
                throw var3_3 /* !! */ ;
            }
            if (var6_6) {
                var15_15 /* !! */  = var17_17;
                var16_16 = var18_18;
                while ((var7_7 = var15_15 /* !! */ .e) > var12_12) {
                    var19_20 /* !! */  = var11_11 != false ? var15_15 /* !! */  : new ArrayList(var15_15 /* !! */ );
                    var2_2.f = var16_16;
                    var2_2.b = var15_15 /* !! */ ;
                    var20_22 = null;
                    var2_2.c = null;
                    var2_2.e = var8_8 = 4;
                    if ((var19_20 /* !! */  = var16_16.a(var2_2, var19_20 /* !! */ )) == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            }
            break block29;
lbl-1000:
            // 3 sources

            {
                var15_15 /* !! */ .c(var12_12);
                continue;
            }
            var7_7 = (int)var15_15 /* !! */ .isEmpty();
            if ((var5_5 ^= var7_7) != 0) {
                var2_2.f = null;
                var2_2.b = null;
                var2_2.c = null;
                var2_2.e = var5_5 = 5;
                if ((var15_15 /* !! */  = var16_16.a(var2_2, var15_15 /* !! */ )) == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
            }
        }
        return Unit.a;
    }
}

