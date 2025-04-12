/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NE
 */
public final class ne_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ne_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                vv2_22 = vv2_22.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(vv2_22, "getApplication(...)");
                ky1_0 ky1_02 = new ky1_0((Application)vv2_22);
                return ky1_02;
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

