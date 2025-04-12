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
 * Renamed from hA
 */
public final class ha_1
implements Function0 {
    public final /* synthetic */ ia_1 a;

    public /* synthetic */ ha_1(ia_1 ia_12) {
        this.a = ia_12;
    }

    public final Object invoke() {
        ia_1 ia_12 = this.a;
        Intrinsics.checkNotNullParameter(ia_12, "this$0");
        ia_12 = ia_12.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(ia_12, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)ia_12);
        return jo_22;
    }
}

