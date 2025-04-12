/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Bn2
 */
public final class bn2_0
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ bn2_0(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "$paymentAccId";
        Intrinsics.checkNotNullParameter(object, string2);
        object = (ConstraintLayout)((Object)object.element);
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

