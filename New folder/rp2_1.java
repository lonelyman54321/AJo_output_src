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
 * Renamed from Rp2
 */
public final class rp2_1
implements Function0 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ rp2_1(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final Object invoke() {
        xp2_2 xp2_22 = this.a;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        xp2_22 = xp2_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(xp2_22, "getApplication(...)");
        hy3_0 hy3_02 = new hy3_0((Application)xp2_22, null, 2, null);
        return hy3_02;
    }
}

