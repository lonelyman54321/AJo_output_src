/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xv2
 */
public final class xv2_1
extends RecyclerView$B {
    public static final /* synthetic */ int c;
    public final yv2_1 a;
    public final boolean b;

    public xv2_1(View view, yv2_1 yv2_12, boolean bl2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(yv2_12, "filterClickListener");
        super(view);
        this.a = yv2_12;
        this.b = bl2;
    }

    public final void w(int n3, Boolean bl2, List list, HashMap hashMap) {
        Object object = this;
        Object object2 = hashMap;
        Intrinsics.checkNotNullParameter(hashMap, "imagesMap");
        Object object3 = h40_0.a;
        object3 = h40_0.h0().optString("quickFilterTitle");
        Intrinsics.checkNotNullExpressionValue(object3, "optString(...)");
        View view = this.itemView;
        int n4 = R$id.filter_icon_iv;
        view = (ImageView)view.findViewById(n4);
        View view2 = this.itemView;
        int n7 = R$id.filter_name_tv;
        view2 = (TextView)view2.findViewById(n7);
        View view3 = this.itemView;
        int n8 = R$id.root_rl;
        view3 = (RelativeLayout)view3.findViewById(n8);
        View view4 = this.itemView;
        int n10 = R$id.layout_relative_quick_filter;
        view4 = (RelativeLayout)view4.findViewById(n10);
        View view5 = this.itemView;
        int n14 = R$id.ll_view;
        view5 = (LinearLayout)view5.findViewById(n14);
        Boolean bl3 = Boolean.TRUE;
        n14 = (int)(Intrinsics.areEqual(bl2, bl3) ? 1 : 0);
        if (n14 != 0) {
            int n15;
            n14 = mz3_0.L(4);
            int n16 = mz3_0.L(8);
            int n17 = mz3_0.L(12);
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            String string2 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
            Intrinsics.checkNotNull(layoutParams2, string2);
            layoutParams2 = (RelativeLayout.LayoutParams)layoutParams2;
            Collection collection = list;
            collection = list;
            boolean bl4 = this.b;
            object = null;
            if (collection != null && (n15 = (int)(collection.isEmpty() ? 1 : 0)) == 0) {
                if (bl4) {
                    layoutParams.setMargins(n14, n16, 0, 0);
                } else {
                    layoutParams.setMargins(n14, n17, 0, 0);
                }
            } else {
                n15 = -1;
                layoutParams.width = n15;
                layoutParams2.width = n15;
                if (bl4) {
                    layoutParams.setMargins(n14, n16, n16, 0);
                } else {
                    layoutParams.setMargins(n14, n17, n16, 0);
                }
            }
            Intrinsics.checkNotNull(view5);
            object = view5.getLayoutParams();
            Intrinsics.checkNotNull(object, string2);
            object = (RelativeLayout.LayoutParams)object;
            n14 = 14;
            n16 = -1;
            object.addRule(n14, n16);
            view5.setLayoutParams((ViewGroup.LayoutParams)object);
            view4.setLayoutParams(layoutParams2);
            view3.setLayoutParams(layoutParams);
        }
        if (view != null) {
            int n18;
            object = (String)((HashMap)object2).get("Quick Filter");
            if (object != null && (n18 = ((String)object).length()) > 0) {
                object2 = new da$a();
                n7 = 1;
                ((da$a)object2).k = n7;
                ((da$a)object2).g = n7;
                ((da$a)object2).n = object;
                ((da$a)object2).u = view;
                ((da$a)object2).a();
            } else {
                object = view.getContext();
                n18 = R$drawable.ic_quick_filter;
                object = t70.getDrawable((Context)object, n18);
                view.setImageDrawable((Drawable)object);
            }
        }
        if (view2 != null) {
            view2.setText((CharSequence)object3);
        }
        object = this;
        object2 = this.itemView;
        object3 = new wv2_0(this, n3);
        object2.setOnClickListener((View.OnClickListener)object3);
    }
}

