/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class RQ2$b
extends RecyclerView$B {
    public final View a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final AjioImageView d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final AjioTextView k;
    public final AjioTextView l;
    public final AjioTextView m;
    public final AjioTextView n;
    public final AjioTextView o;
    public final AjioTextView p;
    public final AjioTextView q;
    public final AjioCircularImageView r;
    public final AjioCircularImageView s;
    public final AjioCircularImageView t;
    public final AjioCircularImageView u;
    public final AjioCircularImageView v;
    public final AjioCircularImageView w;
    public final /* synthetic */ rq2_2 x;

    public RQ2$b(rq2_2 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.x = object;
        super(view);
        this.a = view;
        int n3 = R$id.rvp_ajio_avg_l;
        object = (ConstraintLayout)view.findViewById(n3);
        this.b = object;
        n3 = R$id.rvp_your_avg_l;
        object = (ConstraintLayout)view.findViewById(n3);
        this.c = object;
        n3 = R$id.seek_barll;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioImageView)((Object)object);
        this.d = object;
        n3 = R$id.header_title;
        object = (AjioTextView)view.findViewById(n3);
        this.e = object;
        n3 = R$id.header_sub_title;
        object = (AjioTextView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.rvp_caution_text;
        object = (AjioTextView)view.findViewById(n3);
        this.g = object;
        n3 = R$id.possible_actions_heading_text;
        object = (AjioTextView)view.findViewById(n3);
        this.h = object;
        n3 = R$id.possible_action_sub_text1;
        object = (AjioTextView)view.findViewById(n3);
        this.i = object;
        n3 = R$id.possible_action_sub_text2;
        object = (AjioTextView)view.findViewById(n3);
        this.j = object;
        n3 = R$id.possible_action_sub_text3;
        object = (AjioTextView)view.findViewById(n3);
        this.k = object;
        n3 = R$id.how_it_works_heading_text;
        object = (AjioTextView)view.findViewById(n3);
        this.l = object;
        n3 = R$id.how_it_works_sub_text;
        object = (AjioTextView)view.findViewById(n3);
        this.m = object;
        n3 = R$id.avoid_penality_heading_text;
        object = (AjioTextView)view.findViewById(n3);
        this.n = object;
        n3 = R$id.avoid_penality_sub_text1;
        object = (AjioTextView)view.findViewById(n3);
        this.o = object;
        n3 = R$id.avoid_penality_sub_text2;
        object = (AjioTextView)view.findViewById(n3);
        this.p = object;
        n3 = R$id.avoid_penality_sub_text3;
        object = (AjioTextView)view.findViewById(n3);
        this.q = object;
        n3 = R$id.possible_action_image1;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.r = object;
        n3 = R$id.possible_action_image2;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.s = object;
        n3 = R$id.possible_action_image3;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.t = object;
        n3 = R$id.avoid_penality_image1;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.u = object;
        n3 = R$id.avoid_penality_image2;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.v = object;
        n3 = R$id.avoid_penality_image3;
        object = (AjioCircularImageView)view.findViewById(n3);
        this.w = object;
    }
}

