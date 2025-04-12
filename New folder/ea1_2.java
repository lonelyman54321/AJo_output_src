/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.call.DoubleReceiveException;
import io.ktor.client.call.NoTransformationFoundException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.d;

/*
 * Renamed from ea1
 */
public class ea1_2
implements i90_0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final xq_2 e;
    public final da1_2 a;
    public bb1_2 b;
    public jb1_2 c;
    private volatile /* synthetic */ int received;

    static {
        Object object = Object.class;
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object);
        try {
            object = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0(yn1_22, (kn1_1)object);
        e = object = new xq_2("CustomResponse", at3_02);
        d = AtomicIntegerFieldUpdater.newUpdater(ea1_2.class, "received");
    }

    public ea1_2(da1_2 da1_22) {
        Intrinsics.checkNotNullParameter(da1_22, "client");
        this.a = da1_22;
        this.received = 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(at3_0 var1_1, f80_0 var2_6) {
        block21: {
            block22: {
                block23: {
                    var3_7 = var2_6 instanceof ea1$a;
                    if (!var3_7) ** GOTO lbl-1000
                    var4_8 = var2_6;
                    var4_8 = (ea1$a)var2_6;
                    var5_9 = var4_8.e;
                    var6_10 = -1 << -1;
                    var7_11 = var5_9 & var6_10;
                    if (var7_11 != 0) {
                        var4_8.e = var5_9 -= var6_10;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_8 = new ea1$a(this, (f80_0)var2_6);
                    }
                    var2_6 = var4_8.c;
                    var8_12 = j90_0.COROUTINE_SUSPENDED;
                    var6_10 = var4_8.e;
                    var9_13 = "type";
                    var10_14 = "<this>";
                    var11_15 = 2;
                    var12_16 = 1;
                    if (var6_10 == 0) break block22;
                    if (var6_10 == var12_16) break block23;
                    if (var6_10 != var11_15) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_8.b;
                    var4_8 = var4_8.a;
                    try {
                        vl2_2.b(var2_6);
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block21;
                    }
                }
                var1_1 = var4_8.b;
                var13_17 = var4_8.a;
                try {
                    vl2_2.b(var2_6);
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_3) {
                    var4_8 = var13_17;
                    break block21;
                }
            }
            vl2_2.b(var2_6);
            try {
                var2_6 = this.d();
                var13_17 = var1_1.a;
                Intrinsics.checkNotNullParameter(var2_6, var10_14);
                Intrinsics.checkNotNullParameter(var13_17, var9_13);
                var13_17 = rn1_2.a((yn1_2)var13_17);
                var14_18 = var13_17.isInstance(var2_6);
                if (var14_18) {
                    return this.d();
                }
            }
            catch (Throwable var1_4) {
                var4_8 = this;
                break block21;
            }
            var14_18 = this.b();
            if (!var14_18) {
                var2_6 = this.d();
                var13_17 = ms0_2.a;
                Intrinsics.checkNotNullParameter(var2_6, var10_14);
                var2_6 = var2_6.a();
                var2_6 = var2_6.getAttributes();
                var13_17 = ms0_2.b;
                var14_18 = var2_6.f((xq_2)var13_17);
                if (!var14_18) {
                    var2_6 = ea1_2.d;
                    var6_10 = 0;
                    var13_17 = null;
                    var14_18 = var2_6.compareAndSet((ea1_2)this, 0, var12_16);
                    if (!var14_18) {
                        var1_1 = new DoubleReceiveException(this);
                        throw var1_1;
                    }
                }
            }
            var2_6 = this.getAttributes();
            var13_17 = ea1_2.e;
            if ((var2_6 = var2_6.a((xq_2)var13_17)) == null) {
                var4_8.a = this;
                var4_8.b = var1_1;
                var4_8.e = var12_16;
                var2_6 = this.e();
                if (var2_6 == var8_12) {
                    return var8_12;
                }
            }
            var13_17 = this;
lbl-1000:
            // 2 sources

            {
                var15_19 = new kb1_2((at3_0)var1_1, var2_6);
                var2_6 = var13_17.a;
                var2_6 = var2_6.g;
                var4_8.a = var13_17;
                var4_8.b = var1_1;
                var4_8.e = var11_15;
                var2_6 = var2_6.a(var13_17, var15_19, (f80_0)var4_8);
                if (var2_6 == var8_12) {
                    return var8_12;
                }
                var4_8 = var13_17;
            }
lbl-1000:
            // 2 sources

            {
                var2_6 = (kb1_2)var2_6;
                var2_6 = var2_6.b;
                var8_12 = g52_0.a;
                var5_9 = Intrinsics.areEqual(var2_6, var8_12) ^ var12_16;
                if (var5_9 == 0) {
                    var14_18 = false;
                    var2_6 = null;
                }
                if (var2_6 == null) return var2_6;
            }
            {
                var8_12 = var1_1.a;
                Intrinsics.checkNotNullParameter(var2_6, var10_14);
                Intrinsics.checkNotNullParameter(var8_12, var9_13);
                var8_12 = rn1_2.a((yn1_2)var8_12);
                var5_9 = (int)var8_12.isInstance(var2_6);
                if (var5_9 != 0) {
                    return var2_6;
                }
                var2_6 = var2_6.getClass();
                var2_6 = Reflection.getOrCreateKotlinClass(var2_6);
                var1_1 = var1_1.a;
                var13_17 = var4_8.d();
                var8_12 = new NoTransformationFoundException((jb1_2)var13_17, (yn1_2)var2_6, (yn1_2)var1_1);
                throw var8_12;
            }
        }
        var2_6 = var4_8.d();
        var4_8 = xc0_2.a("Receive failed", (Throwable)var1_5);
        kotlinx.coroutines.d.b((i90_0)var2_6, (CancellationException)var4_8);
        throw var1_5;
    }

    public boolean b() {
        return false;
    }

    public final bb1_2 c() {
        bb1_2 bb1_22 = this.b;
        if (bb1_22 != null) {
            return bb1_22;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final jb1_2 d() {
        jb1_2 jb1_22 = this.c;
        if (jb1_22 != null) {
            return jb1_22;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    public Object e() {
        return this.d().b();
    }

    public final yq_1 getAttributes() {
        return this.c().getAttributes();
    }

    public final CoroutineContext getCoroutineContext() {
        return this.d().getCoroutineContext();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpClientCall[");
        Object object = this.c().getUrl();
        stringBuilder.append(object);
        stringBuilder.append(", ");
        object = this.d().e();
        stringBuilder.append(object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

