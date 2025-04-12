/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from EV
 */
public final class ev_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;

    public ev_0(Ref$BooleanRef ref$BooleanRef) {
        this.c = ref$BooleanRef;
        super(1);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var1_1 = (yr3_0)var1_1;
        var2_2 = this.c;
        var3_3 = var2_2.element;
        var4_4 = true;
        if (var3_3) ** GOTO lbl-1000
        var5_5 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode";
        Intrinsics.checkNotNull(var1_1, var5_5);
        var1_1 = (ut2_1)var1_1;
        var6_6 = var1_1.o;
        if (!var6_6) {
            var6_6 = false;
            var1_1 = null;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = true;
        }
        var2_2.element = var6_6;
        return var6_6 ^ var4_4;
    }
}

