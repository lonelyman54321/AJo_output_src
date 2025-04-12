/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FA1
 */
public final class fa1_0
implements Function0 {
    public final /* synthetic */ ga1_0 a;

    public /* synthetic */ fa1_0(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    public final Object invoke() {
        ga1_0 ga1_02 = this.a;
        Intrinsics.checkNotNullParameter(ga1_02, "this$0");
        ga1_02 = ga1_02.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(ga1_02, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)ga1_02);
        return jo_22;
    }
}

