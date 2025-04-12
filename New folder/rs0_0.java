/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from Rs0
 */
public final class rs0_0
extends rl2_2
implements Function2 {
    public Object b;
    public Object c;
    public Object d;
    public Ref$LongRef e;
    public fp3_0 f;
    public aw2_0 g;
    public boolean h;
    public float i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Ref$LongRef m;
    public final /* synthetic */ pg2_0 n;
    public final /* synthetic */ gx0_2 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ Function1 r;

    public rs0_0(Function0 function0, Ref$LongRef ref$LongRef, pg2_0 pg2_02, gx0_2 gx0_22, Function2 function2, Function0 function02, Function1 function1, f80_0 f80_02) {
        this.l = function0;
        this.m = ref$LongRef;
        this.n = pg2_02;
        this.o = gx0_22;
        this.p = function2;
        this.q = function02;
        this.r = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function0 function0 = this.q;
        Function1 function1 = this.r;
        Function0 function02 = this.l;
        Ref$LongRef ref$LongRef = this.m;
        pg2_0 pg2_02 = this.n;
        gx0_2 gx0_22 = this.o;
        Function2 function2 = this.p;
        rs0_0 rs0_02 = new rs0_0(function02, ref$LongRef, pg2_02, gx0_22, function2, function0, function1, f80_02);
        rs0_02.k = object;
        return rs0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (rs0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rs0_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object var1_1) {
        block46: {
            block57: {
                block55: {
                    block56: {
                        block50: {
                            block51: {
                                block52: {
                                    block53: {
                                        block54: {
                                            var2_2 = this;
                                            var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                            var4_4 = this.j;
                                            var5_5 = 2;
                                            var6_6 = 2.8E-45f;
                                            var7_7 = 1;
                                            var8_8 = this.n;
                                            var9_9 = 5;
                                            var10_10 = 4;
                                            var11_11 = 3;
                                            var12_12 /* !! */  = this.m;
                                            var13_13 = 0;
                                            var14_14 /* !! */  = null;
                                            if (var4_4 == 0) break block50;
                                            if (var4_4 == var7_7) break block51;
                                            if (var4_4 == var5_5) break block52;
                                            if (var4_4 == var11_11) break block53;
                                            if (var4_4 == var10_10) break block54;
                                            if (var4_4 != var9_9) {
                                                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw var3_3 /* !! */ ;
                                            }
                                            var15_15 /* !! */  = this.e;
                                            var16_16 /* !! */  = (ru_0)this.d;
                                            var8_8 = (pg2_0)this.c;
                                            var17_17 = (Function2)this.b;
                                            var18_18 = (ru_0)this.k;
                                            vl2_2.b(var1_1 /* !! */ );
                                            var19_19 /* !! */  = this;
                                            var14_14 /* !! */  = var3_3 /* !! */ ;
                                            var20_20 = 5;
                                            var21_21 = 7.0E-45f;
                                            var22_22 = 0;
                                            var23_23 = null;
                                            var3_3 /* !! */  = var1_1 /* !! */ ;
                                            ** GOTO lbl393
                                        }
                                        var24_24 = this.i;
                                        var23_23 = this.g;
                                        var25_25 /* !! */  = this.f;
                                        var26_26 = this.e;
                                        var27_27 = (Ref$LongRef)this.d;
                                        var28_28 = (ru_0)this.c;
                                        var29_29 = (aw2_0)this.b;
                                        var17_17 = (ru_0)this.k;
                                        vl2_2.b(var1_1 /* !! */ );
                                        var19_19 /* !! */  = this;
                                        var14_14 /* !! */  = var3_3 /* !! */ ;
                                        var18_18 = var28_28;
                                        var28_28 = var25_25 /* !! */ ;
                                        var30_30 = 0L;
                                        var25_25 /* !! */  = var12_12 /* !! */ ;
                                        var32_31 = 4;
                                        var33_32 = 5.6E-45f;
                                        var34_33 = var26_26;
                                        var26_26 = var17_17;
                                        var17_17 = var34_33;
                                        var35_34 = var29_29;
                                        var29_29 = var27_27;
                                        var27_27 = var35_34;
                                        ** GOTO lbl288
                                    }
                                    var24_24 = this.i;
                                    var17_17 = this.f;
                                    var18_18 = this.e;
                                    var26_26 = (Ref$LongRef)this.d;
                                    var27_27 = (ru_0)this.c;
                                    var28_28 = (aw2_0)this.b;
                                    var29_29 = (ru_0)this.k;
                                    vl2_2.b(var1_1 /* !! */ );
                                    var25_25 /* !! */  = var1_1 /* !! */ ;
                                    var22_22 = 3;
                                    var34_33 = var28_28;
                                    var28_28 = var17_17;
                                    var17_17 = var18_18;
                                    var18_18 = var27_27;
                                    var27_27 = var34_33;
                                    var35_34 = var29_29;
                                    var29_29 = var26_26;
                                    var26_26 = var35_34;
                                    ** GOTO lbl171
                                }
                                var4_4 = (int)this.h;
                                var17_17 = (aw2_0)this.b;
                                var18_18 = (ru_0)this.k;
                                vl2_2.b(var1_1 /* !! */ );
                                var26_26 = var1_1 /* !! */ ;
                                break block55;
                            }
                            var15_15 /* !! */  = (ru_0)this.k;
                            vl2_2.b(var1_1 /* !! */ );
                            var17_17 = var1_1 /* !! */ ;
                            break block56;
                        }
                        vl2_2.b(var1_1 /* !! */ );
                        var15_15 /* !! */  = (ru_0)this.k;
                        var17_17 = Nv2.Initial;
                        this.k = var15_15 /* !! */ ;
                        this.j = var7_7;
                        if ((var17_17 = Di3.b((ru_0)var15_15 /* !! */ , false, (Nv2)var17_17, this)) == var3_3 /* !! */ ) {
                            return var3_3 /* !! */ ;
                        }
                    }
                    var18_18 = var15_15 /* !! */ ;
                    var17_17 = (aw2_0)var17_17;
                    var15_15 /* !! */  = (Boolean)var2_2.l.invoke();
                    var4_4 = (int)var15_15 /* !! */ .booleanValue();
                    if (var4_4 == 0) {
                        var17_17.a();
                    }
                    var2_2.k = var18_18;
                    var2_2.b = var17_17;
                    var2_2.h = var4_4;
                    var2_2.j = var5_5;
                    var26_26 = Di3.c((ru_0)var18_18, (f80_0)var2_2, var5_5);
                    if (var26_26 == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                }
                var26_26 = (aw2_0)var26_26;
                var12_12 /* !! */ .element = var36_35 = 0L;
                if (var4_4 != 0) break block57;
                var19_19 /* !! */  = var2_2;
                var14_14 /* !! */  = var3_3 /* !! */ ;
                var25_25 /* !! */  = var12_12 /* !! */ ;
                ** GOTO lbl315
            }
            block0: while (true) {
                block44: {
                    block58: {
                        var36_35 = var26_26.a;
                        var15_15 /* !! */  = var18_18.p0();
                        var4_4 = (int)Ns0.d((mv2_0)var15_15 /* !! */ , var36_35);
                        if (var4_4 != 0) break block58;
                        var15_15 /* !! */  = var18_18.getViewConfiguration();
                        var38_36 = lw2_0.a(var26_26.i, var5_5);
                        if (var38_36) {
                            var24_24 = var15_15 /* !! */ .f();
                            var39_37 = Ns0.a;
                            var24_24 *= var39_37;
                            break block44;
                        } else {
                            var24_24 = var15_15 /* !! */ .f();
                        }
                        break block44;
                    }
                    var19_19 /* !! */  = var2_2;
                    var14_14 /* !! */  = var3_3 /* !! */ ;
                    var25_25 /* !! */  = var12_12 /* !! */ ;
lbl142:
                    // 2 sources

                    while (true) {
                        var30_30 = 0L;
                        var38_36 = false;
                        var39_37 = 0.0f;
                        var17_17 = null;
                        var32_31 = 4;
                        var33_32 = 5.6E-45f;
                        ** GOTO lbl295
                        break;
                    }
                }
                var17_17 = new Ref$LongRef();
                var17_17.element = var36_35;
                var28_28 = var27_27 = new fp3_0(var8_8);
                var29_29 = var12_12 /* !! */ ;
                var27_27 = var26_26;
                var26_26 = var18_18;
                while (true) {
                    block68: {
                        block65: {
                            block47: {
                                block61: {
                                    block59: {
                                        block67: {
                                            block66: {
                                                block64: {
                                                    block62: {
                                                        block63: {
                                                            block60: {
                                                                block45: {
                                                                    var2_2.k = var26_26;
                                                                    var2_2.b = var27_27;
                                                                    var2_2.c = var18_18;
                                                                    var2_2.d = var29_29;
                                                                    var2_2.e = var17_17;
                                                                    var2_2.f = var28_28;
                                                                    var23_23 = null;
                                                                    var2_2.g = null;
                                                                    var2_2.i = var24_24;
                                                                    var2_2.j = var22_22 = 3;
                                                                    var25_25 /* !! */  = Nv2.Main;
                                                                    if ((var25_25 /* !! */  = var18_18.x0((Nv2)var25_25 /* !! */ , (f80_0)var2_2)) == var3_3 /* !! */ ) {
                                                                        return var3_3 /* !! */ ;
                                                                    }
lbl171:
                                                                    // 3 sources

                                                                    var25_25 /* !! */  = (mv2_0)var25_25 /* !! */ ;
                                                                    var16_16 /* !! */  = var25_25 /* !! */ .a;
                                                                    var22_22 = var16_16 /* !! */ .size();
                                                                    while (var13_13 < var22_22) {
                                                                        var40_38 = var16_16 /* !! */ .get(var13_13);
                                                                        var19_19 /* !! */  = var40_38;
                                                                        var19_19 /* !! */  = (aw2_0)var40_38;
                                                                        var41_39 = var19_19 /* !! */ .a;
                                                                        var43_40 /* !! */  = var3_3 /* !! */ ;
                                                                        var30_30 = var17_17.element;
                                                                        var20_20 = Yv2.a(var41_39, var30_30);
                                                                        if (var20_20 != 0) {
                                                                            var23_23 = var40_38;
                                                                            break block45;
                                                                        }
                                                                        ++var13_13;
                                                                        var7_7 = 1;
                                                                        var2_2 = this;
                                                                    }
                                                                    var43_40 /* !! */  = var3_3 /* !! */ ;
                                                                    var22_22 = 0;
                                                                    var23_23 = null;
                                                                }
                                                                if (var23_23 == null || (var20_20 = (int)var23_23.b()) != 0) break block59;
                                                                var20_20 = (int)si0_2.c((aw2_0)var23_23);
                                                                if (var20_20 == 0) break block60;
                                                                var2_2 = var25_25 /* !! */ .a;
                                                                var44_41 = var2_2.size();
                                                                var6_6 = 0.0f;
                                                                var16_16 /* !! */  = null;
                                                                break block61;
                                                            }
                                                            var28_28.getClass();
                                                            var30_30 = var23_23.g;
                                                            var30_30 = e72.h(var23_23.c, var30_30);
                                                            var41_39 = var28_28.b;
                                                            var28_28.b = var30_30 = e72.i(var41_39, var30_30);
                                                            var16_16 /* !! */  = var28_28.a;
                                                            if (var16_16 /* !! */  == null) {
                                                                var21_21 = e72.c(var30_30);
                                                            } else {
                                                                var19_19 /* !! */  = pg2_0.Horizontal;
                                                                var21_21 = var16_16 /* !! */  == var19_19 /* !! */  ? e72.d(var30_30) : e72.e(var30_30);
                                                                var21_21 = Math.abs(var21_21);
                                                            }
                                                            var20_20 = (int)(var21_21 == var24_24 ? 0 : (var21_21 > var24_24 ? 1 : -1));
                                                            if (var20_20 >= 0) {
                                                                if (var16_16 /* !! */  == null) {
                                                                    var30_30 = var28_28.b;
                                                                    var6_6 = e72.c(var30_30);
                                                                    var7_7 = 32;
                                                                    var25_25 /* !! */  = var12_12 /* !! */ ;
                                                                    var13_13 = (int)(var30_30 >> var7_7);
                                                                    var33_32 = Float.intBitsToFloat(var13_13) / var6_6;
                                                                    var45_42 = 0xFFFFFFFFL;
                                                                    var21_21 = Float.intBitsToFloat((int)(var30_30 & var45_42)) / var6_6;
                                                                    var44_41 = Float.floatToRawIntBits(var33_32);
                                                                    var47_43 = var44_41;
                                                                    var20_20 = Float.floatToRawIntBits(var21_21);
                                                                    var30_30 = var20_20;
                                                                    var41_39 = var47_43 << var7_7;
                                                                    var30_30 = e72.j(var30_30 & var45_42 | var41_39, var24_24);
                                                                    var41_39 = var28_28.b;
                                                                    var30_30 = e72.h(var41_39, var30_30);
                                                                } else {
                                                                    var25_25 /* !! */  = var12_12 /* !! */ ;
                                                                    var30_30 = var28_28.b;
                                                                    var19_19 /* !! */  = pg2_0.Horizontal;
                                                                    var21_21 = var16_16 /* !! */  == var19_19 /* !! */  ? e72.d(var30_30) : e72.e(var30_30);
                                                                    var47_43 = var28_28.b;
                                                                    var49_44 = var16_16 /* !! */  == var19_19 /* !! */  ? e72.d(var47_43) : e72.e(var47_43);
                                                                    var49_44 = Math.signum(var49_44) * var24_24;
                                                                    var21_21 -= var49_44;
                                                                    var47_43 = var28_28.b;
                                                                    var49_44 = var16_16 /* !! */  == var19_19 /* !! */  ? e72.e(var47_43) : e72.d(var47_43);
                                                                    var30_30 = var16_16 /* !! */  == var19_19 /* !! */  ? h72.a(var21_21, var49_44) : h72.a(var49_44, var21_21);
                                                                }
                                                                var16_16 /* !! */  = new e72(var30_30);
                                                            } else {
                                                                var25_25 /* !! */  = var12_12 /* !! */ ;
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var16_16 /* !! */  = null;
                                                            }
                                                            if (var16_16 /* !! */  == null) break block62;
                                                            var23_23.a();
                                                            var29_29.element = var30_30 = var16_16 /* !! */ .a;
                                                            var20_20 = (int)var23_23.b();
                                                            if (var20_20 == 0) break block63;
                                                            var30_30 = 0L;
                                                            var32_31 = 4;
                                                            var33_32 = 5.6E-45f;
                                                            var19_19 /* !! */  = this;
                                                            var18_18 = var26_26;
                                                            var26_26 = var27_27;
                                                            var17_17 = var23_23;
                                                            var14_14 /* !! */  = var43_40 /* !! */ ;
                                                            break block64;
                                                        }
                                                        var28_28.b = var30_30 = 0L;
                                                        break block65;
                                                    }
                                                    var30_30 = 0L;
                                                    var16_16 /* !! */  = Nv2.Final;
                                                    var19_19 /* !! */  = this;
                                                    this.k = var26_26;
                                                    this.b = var27_27;
                                                    this.c = var18_18;
                                                    this.d = var29_29;
                                                    this.e = var17_17;
                                                    this.f = var28_28;
                                                    this.g = var23_23;
                                                    this.i = var24_24;
                                                    var32_31 = 4;
                                                    var33_32 = 5.6E-45f;
                                                    this.j = var32_31;
                                                    var16_16 /* !! */  = var18_18.x0((Nv2)var16_16 /* !! */ , this);
                                                    var14_14 /* !! */  = var43_40 /* !! */ ;
                                                    if (var16_16 /* !! */  == var43_40 /* !! */ ) {
                                                        return var43_40 /* !! */ ;
                                                    }
lbl288:
                                                    // 3 sources

                                                    var5_5 = (int)var23_23.b();
                                                    if (var5_5 == 0) break block66;
                                                    var18_18 = var26_26;
                                                    var26_26 = var27_27;
                                                    var38_36 = false;
                                                    var39_37 = 0.0f;
                                                    var17_17 = null;
                                                }
                                                if (var17_17 != null && (var4_4 = (int)var17_17.b()) == 0) {
                                                    var2_2 = var19_19 /* !! */ ;
                                                    var3_3 /* !! */  = var14_14 /* !! */ ;
                                                    var12_12 /* !! */  = var25_25 /* !! */ ;
                                                    var5_5 = 2;
                                                    var6_6 = 2.8E-45f;
                                                    var7_7 = 1;
                                                    var13_13 = 0;
                                                    var14_14 /* !! */  = null;
                                                    continue block0;
                                                }
                                                break block67;
                                            }
                                            var2_2 = var19_19 /* !! */ ;
                                            var3_3 /* !! */  = var14_14 /* !! */ ;
                                            var12_12 /* !! */  = var25_25 /* !! */ ;
                                            var5_5 = 2;
                                            var6_6 = 2.8E-45f;
                                            var7_7 = 1;
                                            break block68;
                                        }
                                        if (var17_17 == null) return Unit.a;
                                        var2_2 = var25_25 /* !! */ ;
                                        var50_45 = var25_25 /* !! */ .element;
                                        var16_16 /* !! */  = new e72(var50_45);
                                        var19_19 /* !! */ .o.invoke(var26_26, var17_17, var16_16 /* !! */ );
                                        var30_30 = var25_25 /* !! */ .element;
                                        var15_15 /* !! */  = new e72(var30_30);
                                        var2_2 = var19_19 /* !! */ .p;
                                        var2_2.invoke(var17_17, var15_15 /* !! */ );
                                        var3_3 /* !! */  = var18_18.p0();
                                        var52_46 = var17_17.a;
                                        var44_41 = Ns0.d((mv2_0)var3_3 /* !! */ , var52_46);
                                        if (var44_41 != 0) {
                                            break block0;
                                        }
                                        break block46;
                                    }
                                    while (true) {
                                        var19_19 /* !! */  = this;
                                        var18_18 = var26_26;
                                        var26_26 = var27_27;
                                        var25_25 /* !! */  = var12_12 /* !! */ ;
                                        var14_14 /* !! */  = var43_40 /* !! */ ;
                                        ** continue;
                                        break;
                                    }
                                }
                                for (var5_5 = 0; var5_5 < var44_41; ++var5_5) {
                                    var19_19 /* !! */  = var23_23 = var2_2.get(var5_5);
                                    var19_19 /* !! */  = var23_23;
                                    var7_7 = (int)var19_19 /* !! */ .d;
                                    if (var7_7 == 0) {
                                        continue;
                                    }
                                    break block47;
                                }
                                var22_22 = 0;
                                var23_23 = null;
                            }
                            if (var23_23 == null) ** continue;
                            var17_17.element = var30_30 = var23_23.a;
                            var25_25 /* !! */  = var12_12 /* !! */ ;
                            var30_30 = 0L;
                        }
                        var5_5 = 2;
                        var6_6 = 2.8E-45f;
                        var7_7 = 1;
                        var2_2 = this;
                        var12_12 /* !! */  = var25_25 /* !! */ ;
                        var3_3 /* !! */  = var43_40 /* !! */ ;
                    }
                    var13_13 = 0;
                    var14_14 /* !! */  = null;
                }
                break;
            }
            while (true) {
                var29_29 = null;
                ** GOTO lbl479
                break;
            }
        }
        while (true) {
            block69: {
                var3_3 /* !! */  = new Ref$LongRef();
                var3_3 /* !! */ .element = var52_46;
                var17_17 = var2_2;
                var15_15 /* !! */  = var3_3 /* !! */ ;
                var16_16 /* !! */  = var18_18;
                while (true) {
                    block49: {
                        block48: {
                            var19_19 /* !! */ .k = var18_18;
                            var19_19 /* !! */ .b = var17_17;
                            var19_19 /* !! */ .c = var8_8;
                            var19_19 /* !! */ .d = var16_16 /* !! */ ;
                            var19_19 /* !! */ .e = var15_15 /* !! */ ;
                            var22_22 = 0;
                            var23_23 = null;
                            var19_19 /* !! */ .f = null;
                            var19_19 /* !! */ .g = null;
                            var20_20 = 5;
                            var21_21 = 7.0E-45f;
                            var19_19 /* !! */ .j = var20_20;
                            var3_3 /* !! */  = Nv2.Main;
                            if ((var3_3 /* !! */  = var16_16 /* !! */ .x0((Nv2)var3_3 /* !! */ , (f80_0)var19_19 /* !! */ )) == var14_14 /* !! */ ) {
                                return var14_14 /* !! */ ;
                            }
lbl393:
                            // 3 sources

                            var3_3 /* !! */  = (mv2_0)var3_3 /* !! */ ;
                            var26_26 = var3_3 /* !! */ .a;
                            var10_10 = var26_26.size();
                            var28_28 = null;
                            for (var11_11 = 0; var11_11 < var10_10; ++var11_11) {
                                var12_12 /* !! */  = var26_26.get(var11_11);
                                var29_29 = var12_12 /* !! */ ;
                                var29_29 = (aw2_0)var12_12 /* !! */ ;
                                var54_47 = var29_29.a;
                                var1_1 /* !! */  = var3_3 /* !! */ ;
                                var30_30 = var15_15 /* !! */ .element;
                                var20_20 = (int)Yv2.a(var54_47, var30_30);
                                if (var20_20 != 0) {
                                    var23_23 = var12_12 /* !! */ ;
                                    break block48;
                                }
                                var20_20 = 5;
                                var21_21 = 7.0E-45f;
                                var22_22 = 0;
                                var23_23 = null;
                            }
                            var1_1 /* !! */  = var3_3 /* !! */ ;
                            var22_22 = 0;
                            var23_23 = null;
                        }
                        if (var23_23 == null) {
                            var44_41 = 1;
                            var49_44 = 1.4E-45f;
                            var22_22 = 0;
                            var23_23 = null;
                            break;
                        }
                        var20_20 = (int)si0_2.c((aw2_0)var23_23);
                        if (var20_20 != 0) {
                            var3_3 /* !! */  = var1_1 /* !! */ ;
                            var2_2 = var1_1 /* !! */ .a;
                            var44_41 = var2_2.size();
                            var26_26 = null;
                        } else {
                            var20_20 = 1;
                            var21_21 = 1.4E-45f;
                            var56_48 = si0_2.g((aw2_0)var23_23, (boolean)var20_20);
                            var21_21 = var8_8 == null ? e72.c(var56_48) : (var8_8 == (var2_2 = pg2_0.Vertical) ? e72.e(var56_48) : e72.d(var56_48));
                            var44_41 = 0;
                            var49_44 = 0.0f;
                            var3_3 /* !! */  = null;
                            cfr_temp_0 = var21_21 - 0.0f;
                            var20_20 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                            if (var20_20 == 0) {
                                var20_20 = 1;
                                var21_21 = 1.4E-45f;
                            } else {
                                var20_20 = 0;
                                var21_21 = 0.0f;
                                var2_2 = null;
                            }
                            var44_41 = 1;
                            var49_44 = 1.4E-45f;
                            if ((var20_20 ^= var44_41) != 0) break;
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var2_2 = null;
                            continue;
                        }
                        for (var9_9 = 0; var9_9 < var44_41; ++var9_9) {
                            var28_28 = var27_27 = var2_2.get(var9_9);
                            var28_28 = (aw2_0)var27_27;
                            var11_11 = (int)var28_28.d;
                            if (var11_11 == 0) {
                                continue;
                            }
                            break block49;
                        }
                        var10_10 = 0;
                        var27_27 = null;
                    }
                    var27_27 = (aw2_0)var27_27;
                    if (var27_27 == null) {
                        var44_41 = 1;
                        var49_44 = 1.4E-45f;
                        break;
                    }
                    var15_15 /* !! */ .element = var30_30 = var27_27.a;
                    var20_20 = 0;
                    var21_21 = 0.0f;
                    var2_2 = null;
                    var44_41 = 1;
                    var49_44 = 1.4E-45f;
                }
                if (var23_23 == null || (var20_20 = var23_23.b()) != 0) ** continue;
                var20_20 = (int)si0_2.c((aw2_0)var23_23);
                if (var20_20 == 0) break block69;
                var29_29 = var23_23;
lbl479:
                // 2 sources

                if (var29_29 == null) {
                    var2_2 = var19_19 /* !! */ .q;
                    var2_2.invoke();
                    return Unit.a;
                }
                var2_2 = var19_19 /* !! */ .r;
                var2_2.invoke(var29_29);
                return Unit.a;
            }
            var20_20 = 0;
            var21_21 = 0.0f;
            var52_46 = si0_2.g((aw2_0)var23_23, false);
            var26_26 = new e72(var52_46);
            var17_17.invoke(var23_23, var26_26);
            var23_23.a();
            var52_46 = var23_23.a;
            var2_2 = var17_17;
        }
    }
}

