/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.Coupon;
import com.ril.ajio.services.data.Cart.CouponList;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$a;
import com.skydoves.balloon.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wc0
 */
public final class wc0_1
extends nw_1
implements View.OnClickListener {
    public final rc0_1 a;
    public final CouponList b;
    public final mu1_1 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ConstraintLayout i;
    public final AjioTextView j;
    public final ConstraintLayout k;
    public final TextView l;
    public final Balloon m;

    public wc0_1(View view, rc0_1 object, CouponList object2, mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(mu1_12, "lifecycleOwner");
        super(view);
        this.a = object;
        this.b = object2;
        this.c = mu1_12;
        int n3 = R$id.couponCodeTv;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.d = object;
        n3 = R$id.couponInfoTv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.e = object;
        n3 = R$id.tnc;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.f = object;
        int n4 = R$id.savingValueTv;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        this.g = view2;
        n4 = R$id.applyCouponTv;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        this.h = view2;
        int n7 = R$id.savingContainer;
        Object object3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ConstraintLayout)((Object)object3);
        this.i = object3;
        n7 = R$id.timer_tv;
        object3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.j = object3;
        n7 = R$id.cl_email_verification;
        object3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ConstraintLayout)((Object)object3);
        this.k = object3;
        int n8 = R$id.verifyApplyCouponTv;
        View view3 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object2);
        view3 = (TextView)view3;
        this.l = view3;
        view.setOnClickListener((View.OnClickListener)this);
        object.setOnClickListener((View.OnClickListener)this);
        view2.setOnClickListener((View.OnClickListener)this);
        object3.setOnClickListener((View.OnClickListener)this);
        view3.setOnClickListener((View.OnClickListener)this);
        int n10 = og1_1.b();
        if (n10 != 0) {
            n10 = view2.getPaintFlags() | 8;
            view2.setPaintFlags(n10);
            n10 = object.getPaintFlags() | 8;
            object.setPaintFlags(n10);
            n3 = view3.getPaintFlags() | 8;
            view3.setPaintFlags(n3);
        }
        object = h40_0.a;
        n3 = (int)(h40_0.d1() ? 1 : 0);
        if (n3 != 0) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "employee_offer_restriction_enabled";
            n3 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
            if (n3 != 0) {
                view = view.getContext();
                Intrinsics.checkNotNullExpressionValue(view, "getContext(...)");
                object = new Balloon$a((Context)view);
                ((Balloon$a)object).H = object2 = Integer.valueOf(R$layout.layout_email_verification_info);
                float f5 = 6;
                n4 = 1;
                ((Balloon$a)object).l = n10 = on_2.b(f5, n4);
                ((Balloon$a)object).r = f5 = (float)on_2.b(2, n4);
                object2 = com.skydoves.balloon.a.TOP;
                Intrinsics.checkNotNullParameter(object2, "value");
                ((Balloon$a)object).p = object2;
                ((Balloon$a)object).j = n4;
                ((Balloon$a)object).m = 0.54f;
                ((Balloon$a)object).i = n10 = on_2.b(33, n4);
                ((Balloon$a)object).h = n10 = on_2.b(78, n4);
                object2 = Resources.getSystem().getDisplayMetrics();
                n7 = 0;
                object3 = null;
                ((Balloon$a)object).t = f5 = TypedValue.applyDimension((int)n4, (float)0.0f, (DisplayMetrics)object2);
                ((Balloon$a)object).F = f5 = 0.9f;
                ((Balloon$a)object).L = mu1_12;
                ((Balloon$a)object).s = n10 = hv3_0.m(R$color.color_202020);
                mu1_12 = null;
                object2 = new Balloon((Context)view, (Balloon$a)object, null);
                this.m = object2;
            }
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, object2);
        int n3 = object.getId();
        int n4 = R$id.applyCouponTv;
        String string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.Coupon";
        rc0_1 rc0_12 = this.a;
        if (n3 == n4) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, string2);
            object = (Coupon)object;
            if (rc0_12 != null) {
                rc0_12.C1((Coupon)object);
            }
        } else {
            n4 = R$id.tnc;
            if (n3 == n4) {
                if (rc0_12 != null && (object = this.b) != null) {
                    object = ((CouponList)object).getTermsAndCondition();
                    rc0_12.e9((String)object);
                }
            } else {
                n4 = R$id.verifyApplyCouponTv;
                if (n3 == n4) {
                    object = object.getTag();
                    Intrinsics.checkNotNull(object, string2);
                    object = (Coupon)object;
                    if (rc0_12 != null) {
                        rc0_12.i1((Coupon)object);
                    }
                } else {
                    int n7 = R$id.cl_email_verification;
                    if (n3 == n7 && (object = this.m) != null) {
                        object2 = this.k;
                        n4 = 0;
                        ((Balloon)object).s((View)object2, 0, 0);
                    }
                }
            }
        }
    }

    public final void w(List list, List list2, int n3) {
        int n4 = 0;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        if (list != null) {
            Object object;
            String string2;
            boolean bl2;
            int n8 = n3 + -1;
            list = (ArrayList)list;
            Object object2 = (Coupon)((ArrayList)list).get(n8);
            Object object3 = this.k;
            Object object4 = this.l;
            TextView textView = this.h;
            if (object2 != null && !(bl2 = ((Coupon)object2).isEmailVerified())) {
                ai0_2.B((View)object3);
                ai0_2.B((View)object4);
                ai0_2.i((View)textView);
            } else {
                ai0_2.i((View)object3);
                ai0_2.i((View)object4);
                ai0_2.B((View)textView);
            }
            int n10 = R$string.apply_coupon_refresh;
            object3 = hv3_0.K(n10);
            String string3 = "";
            if (object2 == null || (string2 = ((Coupon)object2).getVoucherCode()) == null) {
                string2 = string3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object3 = stringBuilder.toString();
            textView.setContentDescription((CharSequence)object3);
            object4.setTag(object2);
            textView.setTag(object2);
            Intrinsics.checkNotNull(object2);
            object3 = ((Coupon)object2).getVoucherCode();
            object4 = this.d;
            object4.setText((CharSequence)object3);
            object3 = ((Coupon)object2).getVoucherName();
            n10 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            if (n10 == 0) {
                object3 = ((Coupon)object2).getVoucherName();
                object4 = "\n";
                object3 = cP.a(string3, (String)object3, (String)object4);
            } else {
                object3 = string3;
            }
            object4 = ((Coupon)object2).getVoucherDescription();
            int n14 = TextUtils.isEmpty((CharSequence)object4);
            if (n14 == 0) {
                object4 = ((Coupon)object2).getVoucherDescription();
                object3 = Ft2.a((String)object3, (String)object4);
            }
            n14 = TextUtils.isEmpty((CharSequence)object3);
            textView = this.e;
            if (n14 == 0) {
                textView.setText((CharSequence)object3);
            } else {
                textView.setText((CharSequence)string3);
            }
            object3 = this.b;
            Intrinsics.checkNotNull(object3);
            object3 = ((CouponList)object3).getTermsAndCondition();
            n10 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            n14 = 8;
            textView = this.f;
            if (n10 != 0) {
                textView.setVisibility(n14);
            } else {
                textView.setVisibility(0);
                n10 = R$string.apply_coupon_content;
                string2 = ((Coupon)object2).getVoucherCode();
                if (string2 != null) {
                    string3 = string2;
                }
                object = new Object[n7];
                object[0] = string3;
                object = hv3_0.L(n10, object);
                textView.setContentDescription((CharSequence)object);
            }
            object = ((Coupon)object2).getDiscountValue();
            Intrinsics.checkNotNullExpressionValue(object, "getDiscountValue(...)");
            n7 = ok1_1.b(Float.parseFloat((String)object));
            f5 = n7;
            object = qz2_0.y(f5);
            object2 = ((Coupon)object2).getDiscountValue();
            n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            object3 = this.i;
            if (n8 != 0) {
                object3.setVisibility(n14);
            } else {
                object3.setVisibility(0);
                object2 = this.g;
                object2.setText((CharSequence)object);
            }
            n7 = (int)(og1_1.b() ? 1 : 0);
            if (n7 != 0) {
                int n15 = ((ArrayList)list).size();
                if (n3 < n15) {
                    list = this.itemView;
                    n3 = R$id.couponDivider;
                    list = list.findViewById(n3);
                    list.setVisibility(0);
                } else {
                    list = this.itemView;
                    n4 = R$id.couponDivider;
                    list = list.findViewById(n4);
                    list.setVisibility(n14);
                }
            }
        }
    }
}

