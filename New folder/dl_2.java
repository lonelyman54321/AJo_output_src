/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;
import kotlinx.coroutines.internal.DispatchedContinuation;

/*
 * Renamed from dL
 */
public final class dl_2 {
    public static final dl_2 b;
    public final /* synthetic */ int a;

    static {
        dl_2 dl_22;
        b = dl_22 = new dl_2(1);
    }

    public /* synthetic */ dl_2(int n3) {
        this.a = n3;
    }

    /*
     * Unable to fully structure code
     */
    public static final CancellableContinuationImpl a(f80_0 var0) {
        var1_1 = var0 instanceof DispatchedContinuation;
        if (!var1_1) {
            var2_2 = new CancellableContinuationImpl(1, (f80_0)var0);
            return var2_2;
        }
        var2_3 = var0;
        var2_3 = (DispatchedContinuation)var0;
        var2_3.getClass();
        while (true) {
            block11: {
                block10: {
                    var3_4 = DispatchedContinuation.h;
                    var4_5 = var3_4.get(var2_3);
                    var5_6 = dr0_2.b;
                    var6_7 = null;
                    if (var4_5 != null) break block10;
                    var3_4.set(var2_3, var5_6);
                    var4_5 = null;
                    ** GOTO lbl24
                }
                var7_8 = var4_5 instanceof CancellableContinuationImpl;
                if (!var7_8) break block11;
                do {
                    if (!(var7_8 = var3_4.compareAndSet(var2_3, var4_5, var5_6))) continue;
                    var4_5 = (CancellableContinuationImpl)var4_5;
lbl24:
                    // 2 sources

                    if (var4_5 != null) {
                        var2_3 = CancellableContinuationImpl.g;
                        var3_4 = var2_3.get(var4_5);
                        var8_11 = var3_4 instanceof k00_0;
                        if (var8_11 && (var3_4 = ((k00_0)var3_4).d) != null) {
                            var4_5.l();
                        } else {
                            var9_9 = -1 >>> 3;
                            var5_6 = CancellableContinuationImpl.f;
                            var5_6.set(var4_5, var9_9);
                            var3_4 = r2_0.a;
                            var2_3.set(var4_5, var3_4);
                            var6_7 = var4_5;
                        }
                        if (var6_7 != null) {
                            return var6_7;
                        }
                    }
                    var2_3 = new CancellableContinuationImpl(2, (f80_0)var0);
                    return var2_3;
                } while ((var10_10 = var3_4.get(var2_3)) == var4_5);
                continue;
            }
            if (var4_5 != var5_6 && (var9_9 = var4_5 instanceof Throwable) == 0) break;
        }
        var2_3 = new StringBuilder("Inconsistent state ");
        var2_3.append(var4_5);
        var2_3 = var2_3.toString().toString();
        var0 = new IllegalStateException((String)var2_3);
        throw var0;
    }

    public static final void b(bl_2 object, b b2) {
        boolean bl2 = object instanceof CancellableContinuationImpl;
        if (bl2) {
            ((CancellableContinuationImpl)object).t(b2);
            return;
        }
        object = new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        throw object;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 1: 
        }
        return "coil.request.NullRequestData";
    }
}

