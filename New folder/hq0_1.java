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
 * Renamed from HQ0
 */
public final class hq0_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;

    public /* synthetic */ hq0_1(Activity activity, dr0_0 dr0_02, yT1 yT12) {
        this.a = activity;
        this.b = dr0_02;
        this.c = yT12;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$bottomNavigationController");
        Object object2 = this.a;
        if (object2 != null) {
            dr0_02.getClass();
            Intrinsics.checkNotNullParameter(object2, "activity");
            kj0_1 kj0_12 = kj0_1.g();
            Boolean bl2 = Boolean.FALSE;
            String string2 = "/cart";
            kj0_12.s((Activity)object2, string2, null, bl2);
            object = UQ0.g((yT1)object);
            object2 = "bag icon click";
            dr0_02.W((String)object2, (String)object);
        }
        return Unit.a;
    }
}

