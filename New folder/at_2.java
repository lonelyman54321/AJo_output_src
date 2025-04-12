/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from At
 */
public final class at_2
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ ob0_1 c;

    public /* synthetic */ at_2(c80 c802, ob0_1 ob0_12, Activity activity) {
        this.a = activity;
        this.b = c802;
        this.c = ob0_12;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.c;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Object object = this.a;
        if (object != null) {
            String string2 = "source - coupon bonanza";
            int n3 = 6;
            at2_1.h(object, string2, n3);
        }
        object = new fu_2(ob0_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

