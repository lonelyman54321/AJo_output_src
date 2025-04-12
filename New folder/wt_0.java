/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WT
 */
public final class wt_0
extends rw_2 {
    public final Typeface b;
    public final Context c;
    public final OnCheckoutClickListener d;
    public final CheckBox e;
    public final LinearLayout f;
    public final RelativeLayout g;

    public wt_0(Context object, View object2, OnCheckoutClickListener onCheckoutClickListener) {
        Intrinsics.checkNotNullParameter(object2, "itemView");
        super((View)object2);
        Object object3 = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        int n3 = 8;
        object3 = ((FontsManager)object3).getTypefaceWithFont((Context)aJIOApplication, n3);
        Intrinsics.checkNotNullExpressionValue(object3, "getTypefaceWithFont(...)");
        this.b = object3;
        this.c = object;
        this.d = onCheckoutClickListener;
        int n4 = R$id.checkout_expandable_layout;
        object = (RelativeLayout)object2.findViewById(n4);
        this.g = object;
        int n7 = R$id.checkout_expandable_tv_title;
        onCheckoutClickListener = (TextView)object2.findViewById(n7);
        object3 = "Payment";
        onCheckoutClickListener.setText((CharSequence)object3);
        ai0_2.t((View)object);
        object.setContentDescription((CharSequence)object3);
        n7 = R$id.checkout_expandable_tv_status;
        onCheckoutClickListener = (TextView)object2.findViewById(n7);
        int n8 = R$id.checkout_expandable_checkbox_expand;
        object3 = (CheckBox)object2.findViewById(n8);
        this.e = object3;
        int n10 = R$id.checkout_expandable_layout_dynamic;
        object2 = (LinearLayout)object2.findViewById(n10);
        this.f = object2;
        onCheckoutClickListener.setVisibility(n3);
        object2.setVisibility(n3);
        super(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object3.setChecked(true);
        super(this);
        object3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
    }

    public final void w(Object object, Serializable object2) {
        int n3;
        LinearLayout linearLayout = this.f;
        linearLayout.removeAllViews();
        int n4 = object2 instanceof Boolean;
        CheckBox checkBox = this.e;
        Object object3 = this.c;
        int n7 = 15;
        String string2 = "null cannot be cast to non-null type android.widget.TextView";
        int n8 = 0;
        Typeface typeface = null;
        int n10 = 8;
        if (n4 != 0 && (n3 = ((Boolean)(object2 = (Boolean)object2)).booleanValue()) != 0) {
            object = LayoutInflater.from((Context)object3);
            n3 = R$layout.row_checkout_text;
            object = object.inflate(n3, null);
            Intrinsics.checkNotNull(object, string2);
            object = (TextView)object;
            String string3 = "Your payment options will appear here once you add an address. Add Address";
            object2 = new SpannableStringBuilder((CharSequence)string3);
            n4 = object2.length();
            int n14 = og1_1.b();
            if (n14 != 0) {
                n14 = hv3_0.m(R$color.luxe_color_121212);
                object.setTextColor(n14);
            } else {
                n14 = hv3_0.m(R$color.accent_color_22);
                object.setTextColor(n14);
            }
            string2 = "";
            typeface = this.b;
            object3 = new AjioCustomTypefaceSpan(string2, typeface);
            int n15 = n4 + -12;
            object2.setSpan(object3, n15, n4, 34);
            object3 = new WT$a(this);
            n8 = 18;
            object2.setSpan(object3, n15, n4, n8);
            string3 = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)string3);
            object.setText((CharSequence)object2);
            n3 = mz3_0.d(n7);
            linearLayout.setPadding(0, 0, 0, n3);
            linearLayout.addView((View)object);
            boolean bl2 = checkBox.isChecked();
            if (bl2) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(n10);
            }
        } else {
            int n16;
            n3 = object instanceof Boolean;
            if (n3 != 0 && (n16 = ((Boolean)(object = (Boolean)object)).booleanValue()) != 0) {
                n16 = mz3_0.d(n7);
                linearLayout.setPadding(0, 0, 0, n16);
                object = LayoutInflater.from((Context)object3);
                n3 = R$layout.row_checkout_text;
                object = object.inflate(n3, null);
                Intrinsics.checkNotNull(object, string2);
                object = (TextView)object;
                n3 = (int)(og1_1.b() ? 1 : 0);
                if (n3 != 0) {
                    n3 = hv3_0.m(R$color.luxe_color_121212);
                    object.setTextColor(n3);
                } else {
                    n3 = hv3_0.m(R$color.accent_color_22);
                    object.setTextColor(n3);
                }
                object2 = "One or more item in your bag is not deliverable at the selected address. Please review your bag.";
                object.setText((CharSequence)object2);
                linearLayout.addView((View)object);
                n16 = (int)(checkBox.isChecked() ? 1 : 0);
                if (n16 != 0) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(n10);
                }
            } else {
                linearLayout.setVisibility(n10);
            }
        }
    }
}

