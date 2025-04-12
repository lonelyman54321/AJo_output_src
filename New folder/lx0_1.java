/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.freebies.FreebieGift;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from lX0
 */
public final class lx0_1
extends jg2_0 {
    public final View b;
    public final Object c;
    public final ConstraintLayout d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final RecyclerView i;

    public lx0_1(View object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "viewLocal");
        super((View)object);
        this.b = object;
        this.c = object2;
        int n3 = R$id.freebie_item_lyt;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.freebieImage;
        object2 = (ImageView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.titleTextView;
        object2 = (TextView)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.subTitleTextView;
        object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.tcTextView;
        object2 = (TextView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.productsRecyclerView;
        object = (RecyclerView)object.findViewById(n3);
        this.i = object;
    }

    public final void w(int n3, Object object) {
        int n4 = 1;
        String string2 = null;
        boolean bl2 = object instanceof FreebieGift;
        if (bl2) {
            Object object2;
            int n7;
            Object object3;
            Object object4;
            int n8;
            Object object5 = object;
            object5 = (FreebieGift)object;
            Object object6 = ((FreebieGift)object5).getProductDetails();
            if (object6 != null) {
                n8 = object6.size();
            } else {
                n8 = 0;
                object6 = null;
            }
            if (n8 <= 0) {
                return;
            }
            if (n8 > n4) {
                object4 = h40_0.a;
                object4 = h40_0.D(false).getFreebiesMoreThanOne();
            } else {
                object4 = h40_0.a;
                object4 = h40_0.D(false).getFreebiesOne();
            }
            Object object7 = "format(...)";
            Object object8 = "";
            TextView textView = this.f;
            if (textView != null) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = object4 == null ? object8 : object4;
                Integer n10 = n8;
                Object[] objectArray = new Object[n4];
                objectArray[0] = n10;
                zn0_1.b(objectArray, n4, (String)object3, (String)object7, textView);
            }
            if (textView != null) {
                object3 = StringCompanionObject.INSTANCE;
                if (object4 == null) {
                    object4 = object8;
                }
                object6 = n8;
                object3 = new Object[n4];
                object3[0] = object6;
                He1.a((Object[])object3, n4, (String)object4, (String)object7, textView);
            }
            if ((n8 = (int)(og1_1.c() ? 1 : 0)) != 0) {
                object6 = this.d;
                if (object6 != null) {
                    object4 = object6.getContext();
                    n7 = R$drawable.grey_rect_border_no_corner_radius;
                    object4 = t70.getDrawable((Context)object4, n7);
                    object6.setBackground((Drawable)object4);
                }
                if ((object6 = this.e) != null) {
                    object4 = object6.getContext();
                    n7 = R$drawable.ic_gift_with_product_luxe;
                    object4 = t70.getDrawable((Context)object4, n7);
                    object6.setImageDrawable((Drawable)object4);
                }
                if (textView != null) {
                    n8 = hv3_0.m(R$color.luxe_color_121212);
                    textView.setTextColor(n8);
                }
            }
            object6 = ((FreebieGift)object5).getDescription();
            object4 = "  ";
            object6 = Ft2.a((String)object6, (String)object4);
            int n14 = ((String)object6).length();
            object7 = h40_0.a;
            object7 = h40_0.D(false).getViewAllProducts();
            if (object7 != null) {
                object8 = object7;
            }
            object6 = ((String)object6).concat((String)object8);
            object7 = new SpannableString((CharSequence)object6);
            object6 = new lX0$a(this, object);
            object3 = this.b.getContext();
            int n15 = R$color.option_blue;
            int n16 = t70.getColor(object3, n15);
            textView = new ForegroundColorSpan(n16);
            n16 = ((String)object8).length() + n14;
            n15 = 33;
            object7.setSpan((Object)textView, n14, n16, n15);
            textView = new StyleSpan(n4);
            n4 = ((String)object8).length() + n14;
            object7.setSpan((Object)textView, n14, n4, n15);
            n4 = ((String)object8).length() + n14;
            object7.setSpan(object6, n14, n4, n15);
            Object object9 = this.g;
            if (object9 != null) {
                object6 = LinkMovementMethod.getInstance();
                object9.setMovementMethod((MovementMethod)object6);
            }
            if (object9 != null) {
                object9.setText((CharSequence)object7);
            }
            if (object9 != null) {
                object9.setContentDescription((CharSequence)object7);
            }
            if ((object9 = this.i) != null) {
                object5 = ((FreebieGift)object5).getProductDetails();
                n14 = 6;
                n7 = 0;
                object7 = null;
                object6 = new kg2_1((List)object5, n14, null);
                ((RecyclerView)object9).setAdapter((RecyclerView$f)object6);
            }
            if ((object9 = this.h) != null) {
                object5 = h40_0.D(false).getTermsAndCondition();
                object9.setText((CharSequence)object5);
            }
            if (object9 != null) {
                string2 = h40_0.D(false).getTermsAndCondition();
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(string2);
                ((StringBuilder)object5).append(n3);
                object2 = ((StringBuilder)object5).toString();
                object9.setContentDescription((CharSequence)object2);
            }
            if ((n3 = (int)(og1_1.c() ? 1 : 0)) != 0) {
                if (object9 != null) {
                    n3 = hv3_0.m(R$color.luxe_color_121212);
                    object9.setTextColor(n3);
                }
                if (object9 != null) {
                    n3 = 8;
                    object9.setPaintFlags(n3);
                }
            }
            if (object9 != null) {
                object2 = new kx0_1(this, object);
                object9.setOnClickListener((View.OnClickListener)object2);
            }
        }
    }
}

