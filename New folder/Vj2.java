/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

public final class Vj2
implements View.OnClickListener {
    public final /* synthetic */ xj2_0 a;

    public /* synthetic */ Vj2(xj2_0 xj2_02) {
        this.a = xj2_02;
    }

    public final void onClick(View object) {
        int n3;
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((xj2_0)object).k = bl2 = true;
        Object object2 = ((xj2_0)object).e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl2 = false;
            object2 = null;
        }
        ai0_2.i((View)object2);
        object2 = ((xj2_0)object).b;
        if (object2 != null && (object = ((ow_0)object2).a(n3 = ((RecyclerView$B)object).getLayoutPosition())) != null) {
            long l2 = 0L;
            object.seekTo(l2);
        }
    }
}

