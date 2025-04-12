/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Html
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 */
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.ajiocash.RetireRcsWalletConfig;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from zD0
 */
public final class zd0_2
extends RecyclerView$B {
    public final LinearLayout A;
    public final AjioTextView B;
    public float C;
    public final AppCompatActivity a;
    public final ReturnOrderItemDetails b;
    public final th2_0 c;
    public final Regex d;
    public final Regex e;
    public final Regex f;
    public final RadioGroup g;
    public final RadioButton h;
    public final RadioButton i;
    public final AjioEditText j;
    public final AjioEditText k;
    public final AjioEditText l;
    public final AjioTextView m;
    public final AjioTextView n;
    public final View o;
    public final AjioTextView p;
    public final AjioTextView q;
    public final AjioTextView r;
    public final AjioTextView s;
    public final LinearLayout t;
    public final LinearLayout u;
    public final ConstraintLayout v;
    public final AjioTextView w;
    public final AjioTextView x;
    public final AjioTextView y;
    public final AjioTextView z;

    public zd0_2(AppCompatActivity object, View view, ReturnOrderItemDetails object2, th2_0 th2_02) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object2, "returnOrderItemDetails");
        Intrinsics.checkNotNullParameter(th2_02, "mRefundOptionsCheckListener");
        super(view);
        this.a = object;
        this.b = object2;
        this.c = th2_02;
        this.d = object = new Regex("^[A-Z0-9]*$");
        this.e = object = new Regex("^[A-Z]{4}");
        this.f = object = new Regex("^[A-Z]{4}[A-Z0-9]{7}$");
        int n3 = R$id.rg_refund_options;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RadioGroup)object;
        this.g = object;
        n3 = R$id.rb_ajiostorecredits;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RadioButton)object;
        this.h = object;
        n3 = R$id.rb_banktransfer;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RadioButton)object;
        this.i = object;
        n3 = R$id.et_refund_accountnumber;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.j = object = (AjioEditText)object;
        n3 = R$id.et_refund_confirmaccountnumber;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.k = object = (AjioEditText)object;
        n3 = R$id.et_refund_ifsccode;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.l = object = (AjioEditText)object;
        n3 = R$id.tv_ifsc_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.m = object = (AjioTextView)object;
        n3 = R$id.what_is_ifsc;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.n = object = (AjioTextView)object;
        n3 = R$id.layout_ifsc_verified;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.o = object;
        n3 = R$id.tv_confirmaccountnumber_error;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.p = object = (AjioTextView)object;
        n3 = R$id.tv_accountnumber_error;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.q = object = (AjioTextView)object;
        n3 = R$id.tv_ifsccode_blank_error;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.r = object = (AjioTextView)object;
        n3 = R$id.tv_ajiostorecredits_message;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.s = object = (AjioTextView)object;
        n3 = R$id.bank_transfer_details_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.t = object;
        n3 = R$id.refund_options_container;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.u = object;
        n3 = R$id.cl_refund_msg;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        this.v = object;
        n3 = R$id.tv_refund_breakup;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.w = object;
        n3 = R$id.tv_refund_amount;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.x = object;
        n3 = R$id.id_read_policy;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.y = object;
        n3 = R$id.id_convenience_fee;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.z = object;
        n3 = R$id.li_convenience_fee;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.A = object;
        n3 = R$id.tv_return_fee_label;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.B = object;
    }

    public final void w() {
        int n3;
        Object object;
        Object object2 = h40_0.a;
        int n4 = h40_0.B0();
        if (n4 != 0) {
            n4 = R$string.ajiostorecredits_nt;
            object2 = hv3_0.K(n4);
            object = this.h;
            object.setText((CharSequence)object2);
        }
        if ((n4 = (int)(h40_0.B0() ? 1 : 0)) != 0) {
            object2 = h40_0.r0();
            if (object2 == null || (object2 = ((RetireRcsWalletConfig)object2).getAjioWalletDesc()) == null) {
                object2 = "";
            }
            object = hv3_0.a;
            int n7 = Build.VERSION.SDK_INT;
            n3 = 24;
            if (n7 >= n3) {
                object2 = yv3_0.a((String)object2);
                Intrinsics.checkNotNull(object2);
            } else {
                object2 = Html.fromHtml((String)object2);
                Intrinsics.checkNotNull(object2);
            }
        } else {
            n4 = R$string.ajio_store_credits_new_message;
            object2 = hv3_0.K(n4);
        }
        object = new SpannableStringBuilder((CharSequence)object2);
        Object object3 = new zD0$a(this);
        String string2 = "Know more";
        int n8 = 6;
        int n10 = StringsKt.O((CharSequence)object2, string2, 0, false, n8);
        int n14 = object2.length();
        int n15 = 18;
        object.setSpan(object3, n10, n14, n15);
        object3 = new StyleSpan(1);
        n14 = hv3_0.m(R$color.accent_color_4);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n14);
        n14 = StringsKt.O((CharSequence)object2, string2, 0, false, n8);
        int n16 = object2.length();
        object.setSpan(object3, n14, n16, n15);
        n3 = StringsKt.O((CharSequence)object2, string2, 0, false, n8);
        n4 = object2.length();
        object.setSpan((Object)foregroundColorSpan, n3, n4, n15);
        object2 = LinkMovementMethod.getInstance();
        object3 = this.s;
        object3.setMovementMethod((MovementMethod)object2);
        object3.setText((CharSequence)object);
    }
}

