/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

public final class yF1
extends RecyclerView$B {
    public final pr2_2 a;

    public yF1(View view, mg1_2 mg1_22) {
        pr2_2 pr2_22;
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(mg1_22, "luxeSaleToolbarListener");
        super(view);
        this.a = pr2_22 = new pr2_2(view, mg1_22, true);
        pr2_22.d();
    }
}

