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

public final class fh3$a
implements gx0_2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public fh3$a(dr0_0 dr0_02, Activity activity) {
        this.a = activity;
        this.b = dr0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = Unit.a;
            string2 = this.a;
            dr0_0 dr0_02 = this.b;
            object3 = new eh3_2((Activity)string2, dr0_02, null);
            ly0_0.d((b30_0)object2, object, (Function2)object3);
        }
        return Unit.a;
    }
}

