/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JJ0
 */
public final class jj0_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jj0_2(Activity activity, dr0_0 dr0_02, int n3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Activity activity = this.a;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.c | 1);
        gk0_1.c(activity, dr0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

