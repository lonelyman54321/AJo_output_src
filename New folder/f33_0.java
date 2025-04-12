/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F33
 */
public final class f33_0
extends RecyclerView$B {
    public final View a;
    public final g71_0 b;
    public List c;
    public TextView d;
    public RelativeLayout e;
    public RecyclerView f;

    public f33_0(View view, g71_0 g71_02) {
        Intrinsics.checkNotNullParameter(view, "parentView");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        super(view);
        this.a = view;
        this.b = g71_02;
    }
}

