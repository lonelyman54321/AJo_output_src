/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eW1
 */
public final class ew1_2
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ ew1_2(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        ((Boolean)object).booleanValue();
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        object = ex1_02.getActivity();
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
        return Unit.a;
    }
}

