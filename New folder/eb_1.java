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
 * Renamed from EB
 */
public final class eb_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ eb_1(dr0_0 dr0_02, Activity activity, String string2) {
        this.a = dr0_02;
        this.b = string2;
        this.c = activity;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        ib$a_0 ib$a_0 = ib$a_0.a;
        String string2 = this.b;
        Activity activity = this.c;
        dr0_02.J(ib$a_0, string2, activity);
        return Unit.a;
    }
}

