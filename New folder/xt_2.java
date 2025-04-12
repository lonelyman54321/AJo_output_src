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
 * Renamed from xt
 */
public final class xt_2
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ xt_2(c80 c802, ob0_1 ob0_12, Activity activity) {
        this.a = activity;
        this.b = ob0_12;
        this.c = c802;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        Object object = this.a;
        if (object != null) {
            ob0_12.q((Activity)object);
            object = new eu_2(ob0_12, null);
            int n3 = 3;
            Ae3.d(i90_02, null, null, (Function2)object, n3);
        }
        return Unit.a;
    }
}

