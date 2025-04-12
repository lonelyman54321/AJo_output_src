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
 * Renamed from Dd
 */
public final class dd_0
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;

    public /* synthetic */ dd_0(Activity activity, dr0_0 dr0_02, yT1 yT12) {
        this.a = activity;
        this.b = dr0_02;
        this.c = yT12;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        Object object2 = this.a;
        if (object2 != null) {
            object.getClass();
            object = dr0_0.w(object2);
            object2 = new ed_0(yT12);
            ((fq0_2)object).Ta((Function0)object2);
        }
        return Unit.a;
    }
}

