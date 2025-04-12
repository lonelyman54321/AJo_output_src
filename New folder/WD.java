/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class WD
implements yp1_2 {
    public final Function0 a;
    public final Object b;
    public Throwable c;
    public List d;
    public List e;
    public final Uq f;

    public WD(FF2$e serializable) {
        this.a = serializable;
        serializable = new Serializable();
        this.b = serializable;
        this.d = serializable = new Serializable();
        this.e = serializable = new Serializable();
        super(0);
        this.f = serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(WD object, Throwable object2) {
        Object object3 = ((WD)object).b;
        synchronized (object3) {
            Throwable throwable2;
            block6: {
                Object object4;
                block5: {
                    try {
                        object4 = ((WD)object).c;
                        if (object4 == null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                ((WD)object).c = object2;
                object4 = ((WD)object).d;
                int n3 = object4.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object5 = object4.get(i3);
                    object5 = (WD$a)object5;
                    object5 = ((WD$a)object5).b;
                    Object object6 = tl2_2.b;
                    object6 = vl2_2.a((Throwable)object2);
                    object5.resumeWith(object6);
                }
                object2 = ((WD)object).d;
                object2.clear();
                object = ((WD)object).f;
                ((AtomicInteger)object).set(0);
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object R(Function1 object, f80_0 f80_02) {
        Object object2;
        block8: {
            Object object3 = zj1_2.b(f80_02);
            int n3 = 1;
            object2 = new CancellableContinuationImpl(n3, (f80_0)object3);
            ((CancellableContinuationImpl)object2).r();
            object3 = new WD$a((Function1)object, (CancellableContinuationImpl)object2);
            object = this.b;
            // MONITORENTER : object
            Object object4 = this.c;
            if (object4 != null) {
                object3 = tl2_2.b;
                object3 = vl2_2.a((Throwable)object4);
                ((CancellableContinuationImpl)object2).resumeWith(object3);
                // MONITOREXIT : object
                break block8;
            }
            object4 = this.d;
            object4 = (Collection)object4;
            boolean bl2 = object4.isEmpty();
            boolean bl3 = bl2 ^ true;
            List list = this.d;
            list.add(object3);
            if (!bl3) {
                Uq uq = this.f;
                uq.set(n3);
            }
            // MONITOREXIT : object
            object = new WD$b(this, (WD$a)object3);
            ((CancellableContinuationImpl)object2).x((Function1)object);
            if (!bl2 || (object = this.a) == null) break block8;
            try {
                object.invoke();
            }
            catch (Throwable throwable) {
                WD.e(this, throwable);
            }
        }
        object = ((CancellableContinuationImpl)object2).q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) return object;
        object2 = "frame";
        Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(long var1_1) {
        var3_2 = this.b;
        synchronized (var3_2) {
            block8: {
                block7: {
                    var4_3 = this.d;
                    var5_4 = this.e;
                    this.d = var5_4;
                    this.e = var4_3;
                    var5_4 = this.f;
                    var6_5 = 0;
                    var5_4.set(0);
                    var7_6 = var4_3.size();
lbl12:
                    // 2 sources

                    while (var6_5 < var7_6) {
                        var8_7 = var4_3.get(var6_5);
                        var8_7 = (WD$a)var8_7;
                        var8_7.getClass();
                        ** GOTO lbl21
                    }
                    break block7;
                    {
                        block9: {
                            catch (Throwable var11_11) {
                                break block8;
                            }
lbl21:
                            // 1 sources

                            try {
                                var9_8 = tl2_2.b;
                                var9_8 = var8_7.a;
                                var10_10 = var1_1;
                                var9_8 = var9_8.invoke(var10_10);
                                break block9;
                            }
                            catch (Throwable var9_9) {}
                            var10_10 = tl2_2.b;
                            var9_8 = vl2_2.a(var9_9);
                        }
                        var8_7 = var8_7.b;
                        var8_7.resumeWith(var9_8);
                        ++var6_5;
                        ** GOTO lbl12
                    }
                }
                var4_3.clear();
                var11_12 = Unit.a;
                return;
            }
            throw var11_11;
        }
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return YP1$a.a;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

