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
 * Renamed from Vf2
 */
public final class vf2_0
implements Function1 {
    public final /* synthetic */ wf2_0 a;

    public /* synthetic */ vf2_0(wf2_0 wf2_02) {
        this.a = wf2_02;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        wf2_0 wf2_02 = this.a;
        Intrinsics.checkNotNullParameter(wf2_02, "this$0");
        Boolean bl2 = Boolean.TRUE;
        boolean bl3 = Intrinsics.areEqual(object, bl2);
        if (bl3) {
            object = wf2_02.r;
            if (object != null) {
                ai0_2.B((View)object);
            }
        } else {
            object = wf2_02.r;
            if (object != null) {
                ai0_2.i((View)object);
            }
        }
        return Unit.a;
    }
}

