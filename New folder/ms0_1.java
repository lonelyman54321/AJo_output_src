/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from MS0
 */
public final class ms0_1 {
    public static final /* synthetic */ int a;

    public static final ee2_2 a(i23_0 i23_02) {
        ee2_2 ee2_22 = new ee2_2(i23_02, null);
        return ee2_22;
    }

    public static final ge2_2 b(kb3_2 kb3_22) {
        ge2_2 ge2_22 = new ge2_2(kb3_22, null);
        return ge2_22;
    }

    public static es0_2 c(es0_2 object, int n3) {
        int n4;
        he_2 he_22;
        pr_2 pr_22;
        int n7;
        he_2 he_23 = he_2.SUSPEND;
        int n8 = -1;
        if (n3 < 0 && n3 != (n7 = -2) && n3 != n8) {
            object = hj0_0.a(n3, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        if (n3 == n8) {
            he_23 = he_2.DROP_OLDEST;
            n3 = 0;
            pr_22 = null;
            he_22 = he_23;
            n4 = 0;
        } else {
            n4 = n3;
            he_22 = he_23;
        }
        n3 = object instanceof ox0_2;
        if (n3 != 0) {
            object = (ox0_2)object;
            n3 = 1;
            he_23 = null;
            object = OX0$a.a((ox0_2)object, null, n4, he_22, n3);
        } else {
            int n10 = 2;
            pr_22 = new pr_2((es0_2)object, null, n4, he_22, n10);
            object = pr_22;
        }
        return object;
    }

    public static final zj_2 d(Function2 function2) {
        f f5 = f.a;
        he_2 he_22 = he_2.SUSPEND;
        zj_2 zj_22 = new zj_2(function2, f5, -2, he_22);
        return zj_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Serializable e(f80_0 var0, es0_2 var1_2, fs0_2 var2_3) {
        block27: {
            block24: {
                block26: {
                    block25: {
                        block23: {
                            block22: {
                                var3_4 = var0 instanceof bt0_2;
                                if (!var3_4) ** GOTO lbl-1000
                                var4_5 = var0;
                                var4_5 = (bt0_2)var0;
                                var5_6 = var4_5.c;
                                var6_7 = -1 << -1;
                                var7_8 = var5_6 & var6_7;
                                if (var7_8 != 0) {
                                    var4_5.c = var5_6 -= var6_7;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_5 = new h80_0((f80_0)var0);
                                }
                                var0 = var4_5.b;
                                var8_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var6_7 = var4_5.c;
                                var7_8 = 1;
                                if (var6_7 != 0) {
                                    if (var6_7 == var7_8) {
                                        var1_2 = var4_5.a;
                                        try {
                                            vl2_2.b(var0);
                                            break block22;
                                        }
                                        catch (Throwable var0_1) {
                                            var8_9 /* !! */  = var0_1;
                                            break block23;
                                        }
                                    }
                                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var0;
                                }
                                vl2_2.b(var0);
                                var0 = new Ref$ObjectRef();
                                var9_11 = new ct0_1((fs0_2)var2_3, (Ref$ObjectRef)var0);
                                var4_5.a = var0;
                                var4_5.c = var7_8;
                                try {
                                    var0 = var1_2.collect(var9_11, var4_5);
                                    if (var0 == var8_9 /* !! */ ) break block24;
                                }
                                catch (Throwable var8_10) {
                                    var1_2 = var0;
                                }
                            }
                            var5_6 = 0;
                            var8_9 /* !! */  = null;
                            {
                                break block24;
                            }
                        }
                        var0 = (Throwable)var1_2.element;
                        if (var0 != null && (var10_12 = Intrinsics.areEqual(var0, (Object)var8_9 /* !! */ ))) break block25;
                        var1_2 = var4_5.getContext();
                        var2_3 = i$a.a;
                        if ((var1_2 = (i)var1_2.get((CoroutineContext$a)var2_3)) == null || !(var11_13 = var1_2.p()) || (var1_2 = var1_2.w()) == null || !(var10_12 = Intrinsics.areEqual(var1_2, (Object)var8_9 /* !! */ ))) break block26;
                    }
                    throw var8_9 /* !! */ ;
                }
                if (var0 != null) break block27;
            }
            return (Serializable)var8_9 /* !! */ ;
        }
        var10_12 = var8_9 /* !! */  instanceof CancellationException;
        if (var10_12) {
            yc0_2.a((Throwable)var0, (Throwable)var8_9 /* !! */ );
            throw var0;
        }
        yc0_2.a((Throwable)var8_9 /* !! */ , (Throwable)var0);
        throw var8_9 /* !! */ ;
    }

    public static final Object f(es0_2 object, Function2 object2, f80_0 f80_02) {
        kt0_2 kt0_22 = new kt0_2((Function2)object2, null);
        object = ms0_1.c(ms0_1.n((es0_2)object, kt0_22), 0);
        object2 = o42_0.a;
        if ((object = object.collect((fs0_2)object2, f80_02)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }

    public static final er_2 g(af2_2 af2_22) {
        er_2 er_22 = new er_2(af2_22, true);
        return er_22;
    }

    public static final es0_2 h(es0_2 object) {
        block2: {
            Object object2;
            block3: {
                boolean bl2 = object instanceof jb3_2;
                if (bl2) break block2;
                object2 = XA3.a;
                vs0_2 vs0_22 = XA3.b;
                boolean bl3 = object instanceof qr0_2;
                if (!bl3) break block3;
                es0_2 es0_22 = object;
                es0_22 = (qr0_2)object;
                Function1 function1 = ((qr0_2)es0_22).b;
                if (function1 == object2 && (object2 = ((qr0_2)es0_22).c) == vs0_22) break block2;
            }
            object = object2 = new qr0_2((es0_2)object);
        }
        return object;
    }

    public static final Object i(f80_0 object, es0_2 object2, fs0_2 fs0_22) {
        boolean bl2 = fs0_22 instanceof qn3_0;
        if (!bl2) {
            if ((object = object2.collect(fs0_22, (f80_0)object)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
                object = Unit.a;
            }
            return object;
        }
        throw ((qn3_0)fs0_22).a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object j(es0_2 var0, f80_0 var1_2) {
        block18: {
            block19: {
                block17: {
                    block15: {
                        block16: {
                            var2_4 = var1_2 instanceof ot0_2;
                            if (!var2_4) ** GOTO lbl-1000
                            var3_5 = var1_2;
                            var3_5 = (ot0_2)var1_2;
                            var4_6 = var3_5.d;
                            var5_7 = -1 << -1;
                            var6_8 = var4_6 & var5_7;
                            if (var6_8 != 0) {
                                var3_5.d = var4_6 -= var5_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_5 = new h80_0((f80_0)var1_2);
                            }
                            var1_2 = var3_5.c;
                            var7_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var5_7 = var3_5.d;
                            var8_10 = k52_0.a;
                            var9_11 = 1;
                            if (var5_7 != 0) {
                                if (var5_7 == var9_11) {
                                    var0 = var3_5.b;
                                    var7_9 /* !! */  = var3_5.a;
                                    try {
                                        vl2_2.b(var1_2);
                                        break block15;
                                    }
                                    catch (AbortFlowException var1_3) {
                                        break block16;
                                    }
                                }
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            vl2_2.b(var1_2);
                            var1_2 = new Ref$ObjectRef();
                            var1_2.element = var8_10;
                            var10_12 = new mt0_2((Ref$ObjectRef)var1_2);
                            var3_5.a = var1_2;
                            var3_5.b = var10_12;
                            var3_5.d = var9_11;
                            try {
                                var0 = var0.collect((fs0_2)var10_12, var3_5);
                                if (var0 == var7_9 /* !! */ ) break block17;
                                var7_9 /* !! */  = var1_2;
                                break block15;
                            }
                            catch (AbortFlowException var0_1) {
                                var7_9 /* !! */  = var1_2;
                                var1_2 = var0_1;
                                var0 = var10_12;
                            }
                        }
                        var10_12 = var1_2.a;
                        if (var10_12 != var0) break block18;
                        var0 = var3_5.getContext();
                        mm0.c((CoroutineContext)var0);
                    }
                    var7_9 /* !! */  = var7_9 /* !! */ .element;
                    if (var7_9 /* !! */  == var8_10) break block19;
                }
                return var7_9 /* !! */ ;
            }
            var0 = new NoSuchElementException("Expected at least one element");
            throw var0;
        }
        throw var1_2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object k(es0_2 var0, Function2 var1_2, f80_0 var2_3) {
        block18: {
            block19: {
                block17: {
                    block15: {
                        block16: {
                            var3_5 = var2_3 instanceof pt0_2;
                            if (!var3_5) ** GOTO lbl-1000
                            var4_6 = var2_3;
                            var4_6 = (pt0_2)var2_3;
                            var5_7 = var4_6.d;
                            var6_8 = -1 << -1;
                            var7_9 = var5_7 & var6_8;
                            if (var7_9 != 0) {
                                var4_6.d = var5_7 -= var6_8;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_6 = new h80_0((f80_0)var2_3);
                            }
                            var2_3 = var4_6.c;
                            var8_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var6_8 = var4_6.d;
                            var9_11 = k52_0.a;
                            var10_12 = 1;
                            if (var6_8 != 0) {
                                if (var6_8 == var10_12) {
                                    var0 = var4_6.b;
                                    var1_2 = var4_6.a;
                                    try {
                                        vl2_2.b(var2_3);
                                        break block15;
                                    }
                                    catch (AbortFlowException var2_4) {
                                        break block16;
                                    }
                                }
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            vl2_2.b(var2_3);
                            var2_3 = new Ref$ObjectRef();
                            var2_3.element = var9_11;
                            var11_13 = new nt0_2((Function2)var1_2, (Ref$ObjectRef)var2_3);
                            var4_6.a = var2_3;
                            var4_6.b = var11_13;
                            var4_6.d = var10_12;
                            try {
                                var0 = var0.collect(var11_13, var4_6);
                                if (var0 == var8_10 /* !! */ ) break block17;
                                var1_2 = var2_3;
                                break block15;
                            }
                            catch (AbortFlowException var0_1) {
                                var1_2 = var2_3;
                                var2_3 = var0_1;
                                var0 = var11_13;
                            }
                        }
                        var8_10 /* !! */  = var2_3.a;
                        if (var8_10 /* !! */  != var0) break block18;
                        var0 = var4_6.getContext();
                        mm0.c((CoroutineContext)var0);
                    }
                    var8_10 /* !! */  = var1_2.element;
                    if (var8_10 /* !! */  == var9_11) break block19;
                }
                return var8_10 /* !! */ ;
            }
            var0 = new NoSuchElementException("Expected at least one element matching the predicate");
            throw var0;
        }
        throw var2_3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object l(es0_2 var0, Function2 var1_2, f80_0 var2_3) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        var3_5 = var2_3 instanceof rt0_2;
                        if (!var3_5) ** GOTO lbl-1000
                        var4_6 = var2_3;
                        var4_6 = (rt0_2)var2_3;
                        var5_7 = var4_6.d;
                        var6_8 = -1 << -1;
                        var7_9 = var5_7 & var6_8;
                        if (var7_9 != 0) {
                            var4_6.d = var5_7 -= var6_8;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_6 = new h80_0((f80_0)var2_3);
                        }
                        var2_3 = var4_6.c;
                        var8_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var6_8 = var4_6.d;
                        var7_9 = 1;
                        if (var6_8 != 0) {
                            if (var6_8 == var7_9) {
                                var0 = var4_6.b;
                                var1_2 = var4_6.a;
                                try {
                                    vl2_2.b(var2_3);
                                    break block15;
                                }
                                catch (AbortFlowException var2_4) {
                                    break block16;
                                }
                            }
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        vl2_2.b(var2_3);
                        var2_3 = new Ref$ObjectRef();
                        var9_11 = new qt0_2((Function2)var1_2, (Ref$ObjectRef)var2_3);
                        var4_6.a = var2_3;
                        var4_6.b = var9_11;
                        var4_6.d = var7_9;
                        try {
                            var0 = var0.collect(var9_11, var4_6);
                            if (var0 == var8_10 /* !! */ ) break block17;
                            var1_2 = var2_3;
                            break block15;
                        }
                        catch (AbortFlowException var0_1) {
                            var1_2 = var2_3;
                            var2_3 = var0_1;
                            var0 = var9_11;
                        }
                    }
                    var8_10 /* !! */  = var2_3.a;
                    if (var8_10 /* !! */  != var0) break block18;
                    var0 = var4_6.getContext();
                    mm0.c((CoroutineContext)var0);
                }
                var8_10 /* !! */  = var1_2.element;
            }
            return var8_10 /* !! */ ;
        }
        throw var2_3;
    }

    public static final es0_2 m(es0_2 object, CoroutineContext object2) {
        Object object3 = i$a.a;
        if ((object3 = object2.get((CoroutineContext$a)object3)) == null) {
            object3 = f.a;
            boolean bl2 = Intrinsics.areEqual(object2, object3);
            if (!bl2) {
                bl2 = object instanceof ox0_2;
                if (bl2) {
                    object = (ox0_2)object;
                    bl2 = false;
                    object3 = null;
                    int n3 = 6;
                    object = OX0$a.a((ox0_2)object, (CoroutineContext)object2, 0, null, n3);
                } else {
                    pr_2 pr_22;
                    int n4 = 12;
                    object3 = pr_22;
                    pr_22 = new pr_2((es0_2)object, (CoroutineContext)object2, 0, null, n4);
                    object = pr_22;
                }
            }
            return object;
        }
        object = new StringBuilder("Flow context cannot contain job in it. Had ");
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static final qr_2 n(es0_2 es0_22, gx0_2 gx0_22) {
        f f5 = f.a;
        he_2 he_22 = he_2.SUSPEND;
        qr_2 qr_22 = new qr_2(gx0_22, es0_22, f5, -2, he_22);
        return qr_22;
    }
}

