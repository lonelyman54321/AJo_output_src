/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class i91
extends RecyclerView$B {
    public final View a;
    public final boolean b;
    public final ShimmerFrameLayout c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;

    public i91(View view, boolean bl2) {
        Object object;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = view;
        this.b = bl2;
        int n3 = R$id.home_product_widget_shimmer;
        this.c = object = (ShimmerFrameLayout)view.findViewById(n3);
        int n4 = R$id.shimmer_container;
        object = (ConstraintLayout)view.findViewById(n4);
        this.d = object;
        int n7 = R$id.view_constraint_layout;
        object = (ConstraintLayout)view.findViewById(n7);
        this.e = object;
        int n8 = R$id.product_view;
        object = view.findViewById(n8);
        this.f = object;
        int n10 = R$id.first_bar;
        object = view.findViewById(n10);
        this.g = object;
        int n14 = R$id.second_bar;
        object = view.findViewById(n14);
        this.h = object;
        int n15 = R$id.third_bar;
        this.i = view = view.findViewById(n15);
    }
}

