/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

public final class cB
implements Runnable {
    public final /* synthetic */ fB a;

    public /* synthetic */ cB(fB fB2) {
        this.a = fB2;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((fB)object).c;
        if (object != null) {
            string2 = null;
            if ((object = ((RecyclerView)object).findViewHolderForLayoutPosition(0)) != null && (object = ((RecyclerView$B)object).itemView) != null) {
                ai0_2.a((View)object);
            }
        }
    }
}

