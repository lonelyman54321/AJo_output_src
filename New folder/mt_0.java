/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mt
 */
public final class mt_0
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ob0_1 d;

    public /* synthetic */ mt_0(c80 c802, String string2, Activity activity, ob0_1 ob0_12) {
        this.a = c802;
        this.b = string2;
        this.c = activity;
        this.d = ob0_12;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.d;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Activity activity = this.c;
        i90_0 i90_03 = i90_02;
        i90_03 = (c80)i90_02;
        String string2 = this.b;
        Qt$j qt$j = new Qt$j(string2, activity, ob0_12, (c80)i90_03, null);
        Ae3.d(i90_02, null, null, qt$j, 3);
        return Unit.a;
    }
}

