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
 * Renamed from m21
 */
public final class m21_0
implements Function0 {
    public final /* synthetic */ t21_0 a;

    public /* synthetic */ m21_0(t21_0 t21_02) {
        this.a = t21_02;
    }

    public final Object invoke() {
        t21_0 t21_02 = this.a;
        Intrinsics.checkNotNullParameter(t21_02, "this$0");
        t21_02 = t21_02.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(t21_02, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)t21_02);
        return jo_22;
    }
}

