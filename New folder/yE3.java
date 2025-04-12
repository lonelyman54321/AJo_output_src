/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class yE3
extends RecyclerView$B
implements View.OnClickListener {
    public final xE3 a;
    public final Facet b;
    public final int c;
    public final TextView d;
    public FacetValue e;
    public int f;
    public int g;

    public yE3(View view, xE3 xE32, Facet facet, int n3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = xE32;
        this.b = facet;
        this.c = n3;
        int n4 = R$id.visual_filter_row_item_text;
        xE32 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(xE32, "findViewById(...)");
        xE32 = (TextView)xE32;
        this.d = xE32;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.b;
        xE3 xE32 = this.a;
        if (xE32 != null) {
            String string2;
            int n3 = 0;
            object2 = null;
            String string3 = object != null ? (string2 = ((Facet)object).getName()) : null;
            int n4 = this.g;
            FacetValue facetValue = this.e;
            if (facetValue != null) {
                object2 = facetValue.getName();
            }
            Object object3 = object2;
            n3 = this.f;
            int n7 = n3 + 1;
            int n8 = this.c;
            object2 = xE32;
            xE32.C2(n4, n8, n7, string3, (String)object3);
        }
        if (xE32 != null) {
            object2 = this.e;
            xE32.I7((FacetValue)object2, (Facet)object);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void w(FacetValue object, int n3, int n4) {
        int n7;
        Object object2;
        String string2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "currentFacetValue");
        this.f = n3;
        this.e = object;
        this.g = n4;
        n3 = (int)(((FacetValue)object).getSelected() ? 1 : 0);
        n4 = 0;
        Object object3 = null;
        TextView textView = this.d;
        if (n3 != 0) {
            n3 = R$drawable.rounded_rect_black_bg;
            textView.setBackgroundResource(n3);
            n3 = hv3_0.m(R$color.accent_color_11);
            textView.setTextColor(n3);
            n3 = R$drawable.ic_close_filter;
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, n3, 0);
        } else {
            n3 = R$drawable.rounded_rect_white_bg;
            textView.setBackgroundResource(n3);
            n3 = hv3_0.m(R$color.accent_color_10);
            textView.setTextColor(n3);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        Object object4 = this.b;
        int n8 = 1;
        lr_0 lr_02 = null;
        if (object4 == null || !(bl2 = kotlin.text.b.i(string2 = ((Facet)object4).getName(), (String)(object2 = "Rating"), n8 != 0))) {
            if (object4 != null) {
                object4 = ((Facet)object4).getCode();
            } else {
                n3 = 0;
                object4 = null;
            }
            string2 = "rating";
            n3 = (int)(kotlin.text.b.i((String)object4, string2, n8 != 0) ? 1 : 0);
            if (n3 == 0) {
                object = ((FacetValue)object).getName();
                textView.setText((CharSequence)object);
                return;
            }
        }
        object4 = he3_1.Companion;
        object = ((FacetValue)object).getName();
        object4.getClass();
        object = he3$a_0.a((String)object);
        n3 = 2;
        string2 = "";
        if (object != null && (n7 = object.size()) == n3) {
            Object e2 = object.get(n8);
        } else {
            String string3 = string2;
        }
        object2 = object;
        object2 = (Collection)object;
        if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
            void var13_15;
            object = object != null ? (String)object.get(0) : null;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            object = " ";
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(var13_15);
            string2 = ((StringBuilder)object3).toString();
        }
        object = new SpannableString((CharSequence)string2);
        object3 = this.itemView.getContext();
        n8 = R$drawable.ic_rating_star_small;
        if ((object3 = xn.a((Context)object3, n8)) != null) {
            object3 = bu0_0.a((Drawable)object3);
        } else {
            n4 = 0;
            object3 = null;
        }
        if (object3 != null) {
            Context context = this.itemView.getContext();
            string2 = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string2);
            lr_02 = new lr_0(context, (Bitmap)object3);
        }
        n4 = 3;
        n8 = 33;
        object.setSpan((Object)lr_02, n3, n4, n8);
        object4 = TextView.BufferType.SPANNABLE;
        textView.setText((CharSequence)object, (TextView.BufferType)object4);
    }
}

