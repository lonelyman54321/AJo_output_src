/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from PJ3
 */
public final class pj3_1
implements View.OnClickListener {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ tj3_2 b;

    public /* synthetic */ pj3_1(Ref$ObjectRef ref$ObjectRef, tj3_2 tj3_22) {
        this.a = ref$ObjectRef;
        this.b = tj3_22;
    }

    public final void onClick(View object) {
        Ref$ObjectRef ref$ObjectRef = this.a;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$ajioVideoPlayer");
        tj3_2 tj3_22 = this.b;
        Intrinsics.checkNotNullParameter(tj3_22, "this$0");
        object = (ob_2)ref$ObjectRef.element;
        if (object != null && (object = ((ob_2)object).p) != null && (object = (Long)((LiveData)object).d()) != null) {
            long l2 = ((Number)object).longValue();
            object = tj3_22.f;
            object.t8(l2);
        }
    }
}

