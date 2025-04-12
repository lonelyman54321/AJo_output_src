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

public final class J22
implements Runnable {
    public final /* synthetic */ q22_0 a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ J22(q22_0 q22_02, Integer n3) {
        this.a = q22_02;
        this.b = n3;
    }

    public final void run() {
        int n3;
        int n4;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((q22_0)object).B;
        Integer n7 = this.b;
        if (object2 != null && (object2 = ((RecyclerView)object2).findViewHolderForAdapterPosition(n4 = n7.intValue())) != null && (object2 = ((RecyclerView$B)object2).itemView) != null) {
            object2.requestFocus();
        }
        if ((object = ((q22_0)object).B) != null && (object = ((RecyclerView)object).findViewHolderForLayoutPosition(n3 = n7.intValue())) != null && (object = ((RecyclerView$B)object).itemView) != null) {
            ai0_2.a((View)object);
        }
    }
}

