/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l12
 */
public final class l12_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ l12_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ms2_2 ms2_22 = (ms2_2)this.b;
                Intrinsics.checkNotNullParameter(ms2_22, "this$0");
                ms2_22 = ms2_22.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(ms2_22, "getApplication(...)");
                op2_2 op2_22 = new op2_2((Application)ms2_22);
                return op2_22;
            }
            case 0: 
        }
        o12_0 o12_02 = (o12_0)this.b;
        Intrinsics.checkNotNullParameter(o12_02, "this$0");
        o12_02 = o12_02.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(o12_02, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)o12_02);
        return jo_22;
    }
}

