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
 * Renamed from ad3
 */
public final class ad3_2
implements Function0 {
    public final /* synthetic */ ed3_2 a;

    public /* synthetic */ ad3_2(ed3_2 ed3_22) {
        this.a = ed3_22;
    }

    public final Object invoke() {
        ed3_2 ed3_22 = this.a;
        Intrinsics.checkNotNullParameter(ed3_22, "this$0");
        ed3_22 = ed3_22.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(ed3_22, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)ed3_22);
        return jo_22;
    }
}

