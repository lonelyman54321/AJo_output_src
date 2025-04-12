/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cz1
 */
public final class cz1_2
implements hx0_2 {
    public final /* synthetic */ fz1_2 a;

    public /* synthetic */ cz1_2(fz1_2 fz1_22) {
        this.a = fz1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (CharSequence)object;
        object2 = (Integer)object2;
        object3 = (Integer)object3;
        object4 = (Integer)object4;
        object = fz1_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((fz1_2)object2).Qa().mobileEtError;
        object3 = "mobileEtError";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        ai0_2.i((View)object);
        boolean bl2 = ((fz1_2)object2).f;
        if (!bl2) {
            ((fz1_2)object2).Ta();
        }
        return Unit.a;
    }
}

