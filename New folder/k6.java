/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class k6
extends RecyclerView$B {
    public static final /* synthetic */ int i;
    public final ja2_1 a;
    public final rv_1 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;

    public k6(View view, ja2_1 ja2_12, rv_1 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(ja2_12, "orderClickListener");
        Intrinsics.checkNotNullParameter(object, "viewDetailsClickListener");
        super(view);
        this.a = ja2_12;
        this.b = object;
        int n3 = R$id.nt_header;
        ja2_12 = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ja2_12, (String)object);
        ja2_12 = (TextView)ja2_12;
        this.c = ja2_12;
        n3 = R$id.nt_order_id;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, (String)object);
        ja2_12 = (TextView)ja2_12;
        this.d = ja2_12;
        n3 = R$id.nt_date_info;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, (String)object);
        ja2_12 = (TextView)ja2_12;
        this.e = ja2_12;
        n3 = R$id.nt_amnt;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, (String)object);
        ja2_12 = (TextView)ja2_12;
        this.f = ja2_12;
        n3 = R$id.nt_IV;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, (String)object);
        ja2_12 = (ImageView)ja2_12;
        this.g = ja2_12;
        n3 = R$id.nt_view_details;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        this.h = view;
    }
}

