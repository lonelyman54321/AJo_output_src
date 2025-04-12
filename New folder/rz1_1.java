/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rZ1
 */
public final class rz1_1
implements Function1 {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ rz1_1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((bz1_2)object2).p;
        if (object != null) {
            object = ((bz1_2)object2).s;
            Intrinsics.checkNotNull(object);
            object2 = "source - account";
            object.g((String)object2);
        }
        return Unit.a;
    }
}

