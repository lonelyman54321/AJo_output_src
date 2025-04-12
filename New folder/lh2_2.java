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

/*
 * Renamed from Lh2
 */
public final class lh2_2
extends RecyclerView$B {
    public final View a;
    public final zi2_1 b;
    public final View c;

    public lh2_2(View view, zi2_1 zi2_12) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(zi2_12, "pdpInfoSetter");
        super(view);
        this.a = view;
        this.b = zi2_12;
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.c = view;
    }

    public final void w() {
        View view = this.c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            view = null;
        }
        kh2_1 kh2_12 = new kh2_1(this);
        view.setOnClickListener((View.OnClickListener)kh2_12);
    }
}

