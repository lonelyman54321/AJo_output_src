/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wr2
 */
public final class wr2_1
implements Function0 {
    public final /* synthetic */ h a;

    public /* synthetic */ wr2_1(h h3) {
        this.a = h3;
    }

    public final Object invoke() {
        h h3 = this.a;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        h3 = h3.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(h3, "getApplication(...)");
        op2_2 op2_22 = new op2_2((Application)h3);
        return op2_22;
    }
}

