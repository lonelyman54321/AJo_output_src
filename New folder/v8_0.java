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
 * Renamed from v8
 */
public final class v8_0
implements Function0 {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ v8_0(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final Object invoke() {
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.a;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        q9_02 = q9_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(q9_02, "getApplication(...)");
        object = new ky1_0((Application)q9_02);
        return object;
    }
}

