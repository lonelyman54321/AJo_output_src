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
 * Renamed from Yc
 */
public final class yc_0
implements Function0 {
    public final /* synthetic */ zc_1 a;

    public /* synthetic */ yc_0(zc_1 zc_12) {
        this.a = zc_12;
    }

    public final Object invoke() {
        zc_1 zc_12 = this.a;
        Intrinsics.checkNotNullParameter(zc_12, "this$0");
        zc_12 = zc_12.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(zc_12, "getApplication(...)");
        op2_2 op2_22 = new op2_2((Application)zc_12);
        return op2_22;
    }
}

