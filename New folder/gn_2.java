/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gN
 */
public final class gn_2
implements Function0 {
    public final /* synthetic */ qn_2 a;

    public /* synthetic */ gn_2(qn_2 qn_22) {
        this.a = qn_22;
    }

    public final Object invoke() {
        Object object = qn_2.Companion;
        qn_2 qn_22 = this.a;
        Intrinsics.checkNotNullParameter(qn_22, "this$0");
        qn_22 = qn_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(qn_22, "getApplication(...)");
        object = new g4_0((Application)qn_22);
        return object;
    }
}

