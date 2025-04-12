/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qy1
 */
public final class qy1_0
implements hx0_2 {
    public final /* synthetic */ ry1_1 a;

    public /* synthetic */ qy1_0(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        boolean bl2;
        object = (CharSequence)object;
        object2 = (Integer)object2;
        object3 = (Integer)object3;
        object4 = (Integer)object4;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((ry1_1)object2).r;
        if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEtError) != null) {
            ai0_2.i((View)object);
        }
        if (!(bl2 = ((ry1_1)object2).f)) {
            ((ry1_1)object2).Qa();
        }
        return Unit.a;
    }
}

