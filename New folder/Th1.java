/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Th1
extends Lambda
implements Function1 {
    public final /* synthetic */ Uh1 c;

    public Th1(Uh1 uh1) {
        this.c = uh1;
        super(1);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var1_1 = (L52)var1_1;
        var1_1.a();
        var2_2 = this.c;
        var3_3 = var2_2.d;
        var4_4 = var3_3.c;
        if (var4_4 <= 0) ** GOTO lbl11
        var3_3 = var3_3.a;
        var5_5 = 0;
        while (!(var7_7 = Intrinsics.areEqual(var6_6 = (WeakReference)var3_3[var5_5], var1_1))) {
            if (++var5_5 < var4_4) continue;
lbl11:
            // 2 sources

            var5_5 = -1;
            break;
        }
        var1_1 = var2_2.d;
        if (var5_5 >= 0) {
            var1_1.n(var5_5);
        }
        if (var8_8 = var1_1.k()) {
            var1_1 = var2_2.b;
            var1_1.invoke();
        }
        return Unit.a;
    }
}

