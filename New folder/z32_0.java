/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Sort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from z32
 */
public final class z32_0
extends RecyclerView$B {
    public final d92 a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;

    public z32_0(View view, d92 d922) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(d922, "onSortClickListener");
        super(view);
        this.a = d922;
        int n3 = R$id.plp_sort_row_layout;
        d922 = (LinearLayout)view.findViewById(n3);
        this.b = d922;
        n3 = R$id.plp_sort_row_select_iv;
        d922 = (ImageView)view.findViewById(n3);
        this.c = d922;
        n3 = R$id.plp_sort_row_title_tv;
        view = (TextView)view.findViewById(n3);
        this.d = view;
    }

    public final void w(Sort sort) {
        int n3 = 0;
        Context context = null;
        Intrinsics.checkNotNullParameter(sort, "sort");
        Object object = sort.getName();
        this.d.setText((CharSequence)object);
        int n4 = sort.getSelected();
        String string2 = "getContext(...)";
        String string3 = "format(...)";
        int n7 = 1;
        String string4 = "getString(...)";
        LinearLayout linearLayout = this.b;
        ImageView imageView = this.c;
        if (n4 != 0) {
            imageView.setTag((Object)"selected");
            object = StringCompanionObject.INSTANCE;
            object = linearLayout.getContext();
            int n8 = R$string.acc_plp_radio_button_selected;
            object = object.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            string4 = sort.getName();
            Object[] objectArray = new Object[n7];
            objectArray[0] = string4;
            zw_0.a(objectArray, n7, (String)object, string3, linearLayout);
            context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, string2);
            n4 = R$attr.sort_solid_selected;
            n3 = tm3_0.b(n4, context);
            imageView.setImageResource(n3);
        } else {
            imageView.setTag((Object)"unselected");
            object = StringCompanionObject.INSTANCE;
            object = linearLayout.getContext();
            int n10 = R$string.acc_plp_radio_button_unselected;
            object = object.getString(n10);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            string4 = sort.getName();
            Object[] objectArray = new Object[n7];
            objectArray[0] = string4;
            zw_0.a(objectArray, n7, (String)object, string3, linearLayout);
            context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, string2);
            n4 = R$attr.sort_solid_unselected;
            n3 = tm3_0.b(n4, context);
            imageView.setImageResource(n3);
        }
        context = this.itemView;
        object = new y32(this, sort);
        context.setOnClickListener((View.OnClickListener)object);
    }
}

