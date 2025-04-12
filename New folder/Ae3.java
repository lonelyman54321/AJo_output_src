/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.a;
import kotlinx.coroutines.e;

public final class Ae3 {
    public static wn0_2 a(i90_0 object, CoroutineContext coroutineContext, Function2 function2, int n3) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            coroutineContext = f.a;
        }
        l90_0 l90_02 = l90_0.DEFAULT;
        object = a90_0.b((i90_0)object, coroutineContext);
        boolean bl2 = l90_02.isLazy();
        coroutineContext = bl2 ? new wq1_2((CoroutineContext)object, function2) : new a((CoroutineContext)object, n4 != 0, n4 != 0);
        l90_02.invoke(function2, coroutineContext, (f80_0)((Object)coroutineContext));
        return coroutineContext;
    }

    public static final boolean b(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static final mb3_2 c(i90_0 object, CoroutineContext coroutineContext, l90_0 l90_02, Function2 function2) {
        object = a90_0.b((i90_0)object, coroutineContext);
        boolean bl2 = l90_02.isLazy();
        if (bl2) {
            coroutineContext = new ct1_2((CoroutineContext)object, function2);
        } else {
            boolean bl3 = true;
            coroutineContext = new a((CoroutineContext)object, bl3, bl3);
        }
        l90_02.invoke(function2, coroutineContext, (f80_0)((Object)coroutineContext));
        return coroutineContext;
    }

    public static /* synthetic */ mb3_2 d(i90_0 i90_02, CoroutineContext coroutineContext, l90_0 l90_02, Function2 function2, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            coroutineContext = f.a;
        }
        if ((n3 &= 2) != 0) {
            l90_02 = l90_0.DEFAULT;
        }
        return Ae3.c(i90_02, coroutineContext, l90_02, function2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object e(CoroutineContext var0, Function2 var1_1) {
        block16: {
            block17: {
                block15: {
                    var2_2 = Thread.currentThread();
                    var3_4 = d.n0;
                    var4_5 = (d)var0.get((CoroutineContext$a)var3_4);
                    var5_6 = true;
                    if (var4_5 == null) {
                        var4_5 = cn3_0.a();
                        var0 = var0.plus(var4_5);
                        var6_7 = f.a;
                        if ((var0 = a90_0.a(var6_7, (CoroutineContext)var0, var5_6)) != (var7_8 = ir0_2.a) && (var3_4 = var0.get((CoroutineContext$a)var3_4)) == null) {
                            var0 = var0.plus(var7_8);
                        }
                    } else {
                        var8_9 = var4_5 instanceof jb0_2;
                        if (var8_9) {
                            var4_5 = (jb0_2)var4_5;
                        }
                        var4_5 = (jb0_2)cn3_0.a.get();
                        var6_7 = f.a;
                        if ((var0 = a90_0.a(var6_7, (CoroutineContext)var0, var5_6)) != (var7_8 = ir0_2.a) && (var3_4 = var0.get((CoroutineContext$a)var3_4)) == null) {
                            var0 = var0.plus(var7_8);
                        }
                    }
                    var3_4 = new ky_2((CoroutineContext)var0, (Thread)var2_2, (jb0_2)var4_5);
                    l90_0.DEFAULT.invoke((Function2)var1_1, var3_4, (f80_0)var3_4);
                    var0 = null;
                    var1_1 = var3_4.e;
                    if (var1_1 != null) {
                        var9_10 = jb0_2.e;
                        var1_1.P0(false);
                    }
                    try lbl-1000:
                    // 2 sources

                    {
                        while ((var9_10 = (int)Thread.interrupted()) == 0) {
                            var10_11 = var1_1 != null ? var1_1.R0() : 0x7FFFFFFFFFFFFFFFL;
                            break block15;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var2_3) {
                        break block16;
                    }
                }
                var9_10 = (int)var3_4.n();
                if (var9_10 != 0) break block17;
                LockSupport.parkNanos(var3_4, var10_11);
                ** GOTO lbl-1000
            }
            if (var1_1 != null) {
                var9_10 = jb0_2.e;
                var1_1.N0(false);
            }
            if (var12_12 = (var0 = y61.b(JobSupport.a.get(var3_4))) instanceof m00_0) {
                var1_1 = var0;
                var1_1 = (m00_0)var0;
            } else {
                var12_12 = false;
                var1_1 = null;
            }
            if (var1_1 == null) {
                return var0;
            }
            throw var1_1.a;
lbl-1000:
            // 1 sources

            {
                var2_2 = new InterruptedException();
                var3_4.H(var2_2);
                throw var2_2;
            }
        }
        if (var1_1 != null) {
            var1_1.N0(false);
        }
        throw var2_3;
    }

    public static /* synthetic */ Object f(Function2 function2) {
        return Ae3.e(f.a, function2);
    }

    public static final Object g(f80_0 object, CoroutineContext object2, Function2 object3) {
        block10: {
            CoroutineContext coroutineContext = object.getContext();
            Object object4 = Boolean.FALSE;
            x90_0 x90_02 = new Object();
            object4 = (Boolean)object2.fold(object4, x90_02);
            boolean bl2 = (Boolean)object4;
            x90_02 = null;
            object2 = !bl2 ? coroutineContext.plus((CoroutineContext)object2) : a90_0.a(coroutineContext, (CoroutineContext)object2, false);
            mm0.c((CoroutineContext)object2);
            if (object2 == coroutineContext) {
                coroutineContext = new ut2_2((f80_0)object, (CoroutineContext)object2);
                object2 = nv3_0.a((ut2_2)coroutineContext, (ut2_2)coroutineContext, object3);
            } else {
                int n3;
                int n4;
                object4 = d.n0;
                CoroutineContext$Element coroutineContext$Element = object2.get((CoroutineContext$a)object4);
                boolean bl3 = Intrinsics.areEqual(coroutineContext$Element, coroutineContext = coroutineContext.get((CoroutineContext$a)object4));
                if (bl3) {
                    coroutineContext = new mv3_0((f80_0)object, (CoroutineContext)object2);
                    boolean bl4 = false;
                    object4 = ((a)coroutineContext).c;
                    object2 = bn3_0.c((CoroutineContext)object4, null);
                    try {
                        object3 = nv3_0.a((ut2_2)coroutineContext, (ut2_2)coroutineContext, object3);
                        object2 = object3;
                    }
                    finally {
                        bn3_0.a((CoroutineContext)object4, object2);
                    }
                }
                coroutineContext = new ut2_2((f80_0)object, (CoroutineContext)object2);
                el_2.c(object3, coroutineContext, (f80_0)((Object)coroutineContext));
                do {
                    if ((n3 = ((AtomicIntegerFieldUpdater)(object2 = e.e)).get(coroutineContext)) == 0) continue;
                    n4 = 2;
                    if (n3 == n4) {
                        object2 = y61.b(JobSupport.a.get(coroutineContext));
                        n3 = object2 instanceof m00_0;
                        if (n3 != 0) {
                            throw ((m00_0)object2).a;
                        }
                        break block10;
                    }
                    object2 = "Already suspended".toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                } while ((n4 = (int)(((AtomicIntegerFieldUpdater)object2).compareAndSet(coroutineContext, 0, n3 = 1) ? 1 : 0)) == 0);
                object2 = j90_0.COROUTINE_SUSPENDED;
            }
        }
        object3 = j90_0.COROUTINE_SUSPENDED;
        if (object2 == object3) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(object, (String)object3);
        }
        return object2;
    }
}

