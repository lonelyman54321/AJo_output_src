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

/*
 * Renamed from m32
 */
public final class m32_0
implements Runnable {
    public final /* synthetic */ n32_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ m32_0(n32_0 n32_02, int n3) {
        this.a = n32_02;
        this.b = n3;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((n32_0)object).d;
        int n3 = this.b;
        if (object2 != null && (object2 = ((RecyclerView)object2).findViewHolderForLayoutPosition(n3)) != null && (object2 = ((RecyclerView$B)object2).itemView) != null) {
            ai0_2.a((View)object2);
        }
        if ((object = ((n32_0)object).d) != null && (object = ((RecyclerView)object).findViewHolderForLayoutPosition(n3)) != null && (object = ((RecyclerView$B)object).itemView) != null) {
            object.requestFocus();
        }
    }
}

