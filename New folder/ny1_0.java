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
 * Renamed from nY1
 */
public final class ny1_0
implements Function0 {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ ny1_0(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    public final Object invoke() {
        oy1_1 oy1_12 = this.a;
        Intrinsics.checkNotNullParameter(oy1_12, "this$0");
        oy1_12 = oy1_12.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(oy1_12, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)oy1_12);
        return jo_22;
    }
}

