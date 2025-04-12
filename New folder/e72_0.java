/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from E72
 */
public final class e72_0
extends ta1_1 {
    public static final hh3_2 j;
    public final b72_0 e;
    public final Set f;
    public final CoroutineContext g;
    public final CoroutineContext h;
    public final Map i;

    static {
        rg0_2 rg0_22 = new rg0_2(2);
        j = yr1_2.b(rg0_22);
    }

    public e72_0(b72_0 object) {
        Intrinsics.checkNotNullParameter(object, "config");
        this.e = object;
        Object object2 = new ua1_0[3];
        Object object3 = vb1_2.a;
        object2[0] = object3;
        object3 = xf3_2.a;
        object2[1] = object3;
        object3 = qr2_2.a;
        object2[2] = object3;
        this.f = object2 = p03_0.f(object2);
        object3 = object2;
        super(1, this, e72_0.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0);
        super();
        int n3 = ((b72_0)object).c;
        Intrinsics.checkNotNullParameter(object2, "supplier");
        Intrinsics.checkNotNullParameter(object3, "close");
        Serializable serializable = new cp1_2((E72$b)object2, (c72_0)object3, n3);
        object = Collections.synchronizedMap(serializable);
        Intrinsics.checkNotNullExpressionValue(object, "synchronizedMap(...)");
        this.i = object;
        object = super.getCoroutineContext();
        object2 = i$a.a;
        object = object.get((CoroutineContext$a)object2);
        Intrinsics.checkNotNull(object);
        object = (i)object;
        super((i)object);
        object = C90$a.a;
        super((CoroutineContext$a)object);
        this.g = object = CoroutineContext$Element$a.d((CoroutineContext)object3, (CoroutineContext$Element)object2);
        this.h = object = super.getCoroutineContext().plus((CoroutineContext)object);
        object = e01_0.a;
        object2 = super.getCoroutineContext();
        object3 = l90_0.ATOMIC;
        super(this, null);
        Ae3.c((i90_0)object, (CoroutineContext)object2, (l90_0)((Object)object3), (Function2)((Object)serializable));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(x72_0 var1_1, kj2_2 var2_2, CoroutineContext var3_3, eb1_2 var4_4, f80_0 var5_5) {
        var6_6 = this;
        var7_7 = var3_3;
        var8_8 = var4_4;
        var9_9 = var5_5;
        var10_10 = var5_5 instanceof E72$d;
        if (!var10_10) ** GOTO lbl-1000
        var11_11 = var5_5;
        var11_11 = (E72$d)var5_5;
        var12_12 = var11_11.g;
        var13_13 = -1 << -1;
        var14_14 = var12_12 & var13_13;
        if (var14_14 != 0) {
            var11_11.g = var12_12 -= var13_13;
        } else lbl-1000:
        // 2 sources

        {
            var11_11 = new E72$d(var6_6, (f80_0)var9_9);
        }
        var9_9 = var11_11.e;
        var15_15 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        var13_13 = var11_11.g;
        var16_16 = i$a.a;
        var17_17 = 1;
        if (var13_13 == 0) ** GOTO lbl33
        if (var13_13 == var17_17) {
            var7_7 = var11_11.d;
            var8_8 = var11_11.c;
            var15_15 /* !! */  = var11_11.b;
            var11_11 = var11_11.a;
            vl2_2.b(var9_9);
            var18_18 = var7_7;
            var7_7 = var15_15 /* !! */ ;
        } else {
            var7_7 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var7_7;
lbl33:
            // 1 sources

            vl2_2.b(var9_9);
            var9_9 = bi0_2.a(null);
            var11_11.a = var6_6;
            var11_11.b = var7_7;
            var11_11.c = var8_8;
            var11_11.d = var9_9;
            var11_11.g = var17_17;
            var20_20 = zj1_2.b((f80_0)var11_11);
            var19_19 = new CancellableContinuationImpl(var17_17, (f80_0)var20_20);
            var19_19.r();
            var20_20 = var1_1.b(var2_2);
            var21_21 = var7_7.get((CoroutineContext$a)var16_16);
            Intrinsics.checkNotNull(var21_21);
            var21_21 = (i)var21_21;
            var18_18 = new m72_0((RealCall)var20_20);
            var21_21.u((boolean)var17_17, (boolean)var17_17, (Function1)var18_18);
            var22_22 = new w72_0((eb1_2)var8_8, (CancellableContinuationImpl)var19_19);
            var20_20.c((wj_2)var22_22);
            var19_19 = var19_19.q();
            if (var19_19 == var15_15 /* !! */ ) {
                var22_22 = "frame";
                Intrinsics.checkNotNullParameter(var11_11, (String)var22_22);
            }
            if (var19_19 == var15_15 /* !! */ ) {
                return var15_15 /* !! */ ;
            }
            var11_11 = var6_6;
            var18_18 = var9_9;
            var9_9 = var19_19;
        }
        var9_9 = (cl2_2)var9_9;
        var15_15 /* !! */  = var9_9.g;
        var19_19 = var7_7.get((CoroutineContext$a)var16_16);
        Intrinsics.checkNotNull(var19_19);
        var19_19 = (i)var19_19;
        var16_16 = new d72_0((il2_2)var15_15 /* !! */ );
        var19_19.G((Function1)var16_16);
        if (var15_15 /* !! */  != null && (var15_15 /* !! */  = var15_15 /* !! */ .h()) != null) {
            var19_19 = e01_0.a;
            var16_16 = new j72_0((se_1)var15_15 /* !! */ , (CoroutineContext)var7_7, (eb1_2)var8_8, null);
            var23_23 /* !! */  = 2;
            var8_8 = kf_1.e((i90_0)var19_19, (CoroutineContext)var7_7, (Function2)var16_16, (int)var23_23 /* !! */ ).a;
            if (var8_8 != null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
        }
        uf_1.a.getClass();
        var8_8 = uF$a.b;
        ** while (true)
        var24_24 = var8_8;
        var11_11.getClass();
        var23_23 /* !! */  = var9_9.d;
        var11_11 = var9_9.c;
        var21_21 = new ub1_2(var23_23 /* !! */ , (String)var11_11);
        var8_8 = var9_9.b;
        var11_11 = "<this>";
        Intrinsics.checkNotNullParameter(var8_8, (String)var11_11);
        var15_15 /* !! */  = (j90_0)l72_0.$EnumSwitchMapping$0;
        var23_23 /* !! */  = var8_8.ordinal();
        var23_23 /* !! */  = (int)var15_15 /* !! */ [var23_23 /* !! */ ];
        block0 : switch (var23_23 /* !! */ ) {
            default: {
                var7_7 = new NoWhenBranchMatchedException();
                throw var7_7;
            }
            case 6: {
                var8_8 = wa1_1.h;
lbl99:
                // 6 sources

                while (true) {
                    var25_25 = var8_8;
                    break block0;
                    break;
                }
            }
            case 5: {
                var8_8 = wa1_1.d;
                ** GOTO lbl99
            }
            case 4: {
                var8_8 = wa1_1.d;
                ** GOTO lbl99
            }
            case 3: {
                var8_8 = wa1_1.g;
                ** GOTO lbl99
            }
            case 2: {
                var8_8 = wa1_1.e;
                ** GOTO lbl99
            }
            case 1: {
                var8_8 = wa1_1.f;
                ** continue;
            }
        }
        var8_8 = var9_9.f;
        Intrinsics.checkNotNullParameter(var8_8, (String)var11_11);
        var26_26 = new n72_0((m41_0)var8_8);
        var20_20 = var8_8;
        var8_8 = new lb1_1((ub1_2)var21_21, (by0_2)var18_18, var26_26, (wa1_1)var25_25, var24_24, (CoroutineContext)var7_7);
        return var8_8;
    }

    public final void close() {
        super.close();
        Object object = i$a.a;
        object = this.g.get((CoroutineContext$a)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((g00_0)object).a();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f0(eb1_2 var1_1, f80_0 var2_2) {
        block20: {
            block19: {
                block14: {
                    block15: {
                        block16: {
                            block17: {
                                block18: {
                                    var3_3 = var2_2 instanceof E72$c;
                                    if (var3_3) {
                                        var4_4 /* !! */  = var2_2;
                                        var4_4 /* !! */  = (E72$c)var2_2;
                                        var5_5 = var4_4 /* !! */ .e;
                                        var6_6 = -1 << -1;
                                        var7_7 = var5_5 & var6_6;
                                        if (var7_7 != 0) {
                                            var4_4 /* !! */ .e = var5_5 -= var6_6;
lbl10:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                    }
                                    var4_4 /* !! */  = new E72$c(this, (f80_0)var2_2);
                                    ** while (true)
                                    var8_8 = var4_4 /* !! */ ;
                                    var2_2 = var4_4 /* !! */ .c;
                                    var4_4 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var5_5 = var8_8.e;
                                    var6_6 = 4;
                                    var7_7 = 1;
                                    if (var5_5 == 0) break block14;
                                    if (var5_5 == var7_7) break block15;
                                    var9_9 = 2;
                                    if (var5_5 == var9_9) break block16;
                                    var9_9 = 3;
                                    if (var5_5 == var9_9) break block17;
                                    if (var5_5 != var6_6) break block18;
                                    vl2_2.b(var2_2);
                                    break block19;
                                }
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            vl2_2.b(var2_2);
                            return var2_2;
                        }
                        vl2_2.b(var2_2);
                        return var2_2;
                    }
                    var1_1 = var8_8.b;
                    var10_10 = var8_8.a;
                    vl2_2.b(var2_2);
lbl42:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                vl2_2.b(var2_2);
                var8_8.a = this;
                var8_8.b = var1_1;
                var8_8.e = var7_7;
                var2_2 = Mz3.a;
                var2_2 = var8_8.getContext();
                var10_10 = wo1_2.b;
                var2_2 = var2_2.get((CoroutineContext$a)var10_10);
                Intrinsics.checkNotNull(var2_2);
                var2_2 = ((wo1_2)var2_2).a;
                if (var2_2 == var4_4 /* !! */ ) {
                    return var4_4 /* !! */ ;
                }
                var10_10 = this;
                ** while (true)
                var11_11 = var1_1;
                var12_12 = var2_2;
                var12_12 = (CoroutineContext)var2_2;
                var1_1 = new KJ2$a();
                var2_2 = var11_11.a.f;
                var1_1.h((String)var2_2);
                var2_2 = new f72_0((KJ2$a)var1_1);
                var13_13 = Mz3.a;
                var13_13 = var11_11.c;
                Intrinsics.checkNotNullParameter(var13_13, "requestHeaders");
                var14_14 = var11_11.d;
                Intrinsics.checkNotNullParameter(var14_14, "content");
                var15_15 = "block";
                Intrinsics.checkNotNullParameter(var2_2, (String)var15_15);
                var17_17 = var13_13;
                var17_17 = (q41_0)var13_13;
                var16_16 = new ez3_0((q41_0)var17_17, var14_14);
                Intrinsics.checkNotNullParameter(var16_16, (String)var15_15);
                var17_17 = null;
                var15_15 = new p41_0(0);
                var16_16.invoke(var15_15);
                var15_15 = var15_15.i();
                var16_16 = new gz3_0((f72_0)var2_2);
                var15_15.a((Function2)var16_16);
                var15_15 = ja1_1.a;
                var15_15 = "User-Agent";
                var16_16 = var13_13.get((String)var15_15);
                if (var16_16 == null && (var16_16 = var14_14.c().get((String)var15_15)) == null && (var7_7 ^= (var18_18 = jt2_2.a)) != 0) {
                    var19_19 = "ktor-client";
                    var2_2.invoke(var15_15, var19_19);
                }
                var19_19 = var14_14.b();
                var15_15 = "Content-Type";
                if ((var19_19 == null || (var19_19 = var19_19.toString()) == null) && (var19_19 = var14_14.c().get((String)var15_15)) == null) {
                    var19_19 = var13_13.get((String)var15_15);
                }
                var16_16 = var14_14.a();
                var17_17 = "Content-Length";
                if ((var16_16 == null || (var16_16 = var16_16.toString()) == null) && (var16_16 = var14_14.c().get((String)var17_17)) == null) {
                    var16_16 = var13_13.get((String)var17_17);
                }
                if (var19_19 != null) {
                    var2_2.invoke(var15_15, var19_19);
                }
                if (var16_16 != null) {
                    var2_2.invoke(var17_17, var16_16);
                }
                var2_2 = var11_11.b;
                var19_19 = var2_2.a;
                var7_7 = (int)nk_0.e((String)var19_19);
                var13_13 = null;
                if (var7_7 != 0) {
                    var19_19 = h72_0.a(var14_14, (CoroutineContext)var12_12);
                } else {
                    var7_7 = 0;
                    var19_19 = null;
                }
                var2_2 = var2_2.a;
                var1_1.e((String)var2_2, (pj2_2)var19_19);
                var19_19 = var1_1.b();
                var1_1 = var10_10.i;
                var2_2 = vb1_2.a;
                var2_2 = var11_11.a((ua1_0)var2_2);
                var1_1 = (x72_0)var1_1.get(var2_2);
                if (var1_1 != null) {
                    var2_2 = "<this>";
                    Intrinsics.checkNotNullParameter(var11_11, (String)var2_2);
                    Intrinsics.checkNotNullParameter(var11_11, (String)var2_2);
                    var8_8.a = null;
                    var8_8.b = null;
                    var8_8.e = var6_6;
                    var2_2 = var10_10.a((x72_0)var1_1, (kj2_2)var19_19, (CoroutineContext)var12_12, var11_11, var8_8);
                    if (var2_2 == var4_4 /* !! */ ) {
                        return var4_4 /* !! */ ;
                    } else {
                        ** GOTO lbl133
                    }
                }
                break block20;
            }
            return var2_2;
        }
        var2_2 = "OkHttpClient can't be constructed because HttpTimeout plugin is not installed".toString();
        var1_1 = new IllegalStateException((String)var2_2);
        throw var1_1;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.h;
    }

    public final Set k0() {
        return this.f;
    }
}

