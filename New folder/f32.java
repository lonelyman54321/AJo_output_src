/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class f32
extends RecyclerView$B
implements View.OnClickListener {
    public final t82_0 a;
    public final yA2 b;
    public final o62_0 c;
    public final boolean d;
    public final yi2_1 e;
    public final sj2_0 f;
    public final ConstraintLayout g;
    public final LinearLayout h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final AjioTextView k;
    public final AjioTextView l;
    public final LinearLayoutCompat m;
    public final ImageView n;
    public final AjioTextView o;
    public final AjioTextView p;
    public final AjioTextView q;
    public final CardView r;
    public ProductPromotion s;
    public final boolean t;

    public f32(View object, int n3, t82_0 object2, yA2 object3, o62_0 o62_02, boolean bl2, yi2_1 yi2_12, sj2_0 sj2_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(object3, "productPromotionCallback");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object2;
        this.b = object3;
        this.c = o62_02;
        this.d = bl2;
        this.e = yi2_12;
        this.f = sj2_02;
        object = this.itemView;
        int n4 = R$id.promo_parent_layout;
        object = object.findViewById(n4);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        this.g = object;
        object = this.itemView;
        int n7 = R$id.benefit_layout;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.h = object;
        object = this.itemView;
        n7 = R$id.tv_offers_item_benefit_callout;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.i = object;
        object = this.itemView;
        n7 = R$id.tv_offers_item_termsconditions;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.j = object;
        object3 = this.itemView;
        int n8 = R$id.tv_offers_item_description;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        this.k = object3 = (AjioTextView)object3;
        object3 = this.itemView;
        n8 = R$id.tv_offer_item_benefit_bestprice_message;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        this.l = object3 = (AjioTextView)object3;
        object3 = this.itemView;
        n8 = R$id.sale_price_layout;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (LinearLayoutCompat)((Object)object3);
        this.m = object3;
        object3 = this.itemView;
        n8 = R$id.sale_star_imv;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.n = object3;
        object3 = this.itemView;
        n8 = R$id.sale_title_tv;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.o = object3;
        object3 = this.itemView;
        n8 = R$id.sale_price_tv;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.p = object3;
        object3 = this.itemView;
        n8 = R$id.timer_tv;
        object3 = object3.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.q = object3;
        object2 = this.itemView;
        n7 = R$id.cv_new_user_offer;
        object2 = (CardView)object2.findViewById(n7);
        this.r = object2;
        object2 = yi2_12.o5();
        object3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        n4 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        this.t = n4;
        object2 = this.itemView.getLayoutParams();
        ((ViewGroup.LayoutParams)object2).width = n3;
        this.itemView.setLayoutParams((ViewGroup.LayoutParams)object2);
        object.setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        block10: {
            var2_2 = "v";
            Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
            var3_3 = var1_1.getId();
            var4_4 = R$id.tv_offers_item_termsconditions;
            if (var3_3 != var4_4) break block10;
            var1_1 = this.s;
            var2_2 = "productPromotion";
            var5_5 = 0;
            var6_6 = null;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var3_3 = 0;
                var1_1 = null;
            }
            if ((var1_1 = var1_1.getTermsLink()) == null || (var8_8 = (var1_1 = fT1.a((String)(var7_7 = "\\|"), (String)var1_1)).size()) <= (var9_9 = 1) || (var8_8 = (int)TextUtils.isEmpty((CharSequence)(var7_7 = StringsKt.m0((String)var1_1.get(var9_9)).toString()))) != 0) break block10;
            var7_7 = this.s;
            if (var7_7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var8_8 = 0;
                var7_7 = null;
            }
            var7_7 = var7_7.getTitle();
            var10_10 = "offerclick (App)";
            var11_11 = "PDP: Click";
            if (var7_7 == null) ** GOTO lbl-1000
            var7_7 = this.s;
            if (var7_7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var8_8 = 0;
                var7_7 = null;
            }
            if ((var7_7 = var7_7.getTitle()) != null && (var8_8 = var7_7.length()) > 0) {
                var7_7 = AnalyticsManager.Companion;
                var12_12 = var7_7.getInstance().getGtmEvents();
                var13_13 = this.s;
                if (var13_13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                    var13_13 = null;
                }
                if ((var2_2 = var13_13.getTitle()) != null) {
                    var2_2 = StringsKt.m0((CharSequence)var2_2);
                    var6_6 = var2_2.toString();
                }
                var2_2 = hv3_0.f((String)var6_6);
                var13_13 = "Offer_T&C_";
                var6_6 = new StringBuilder((String)var13_13);
                var6_6.append(var2_2);
                var2_2 = var6_6.toString();
                var6_6 = var7_7.getInstance().getGtmEvents().getScreenName();
                var12_12.pushEvent((String)var2_2, var11_11, var10_10, (String)var6_6);
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = AnalyticsManager.Companion;
                var6_6 = var2_2.getInstance().getGtmEvents();
                var2_2 = var2_2.getInstance().getGtmEvents().getScreenName();
                var7_7 = "Offer_T&C";
                var6_6.pushEvent((String)var7_7, var11_11, var10_10, (String)var2_2);
            }
            var2_2 = this.e;
            if (var2_2 != null && (var4_4 = (int)var2_2.u7()) == var9_9) {
                var2_2 = this.f;
                if (var2_2 != null) {
                    var1_1 = StringsKt.m0((String)var1_1.get(var9_9)).toString();
                    var5_5 = 5;
                    var2_2.w1(var5_5, (String)var1_1);
                }
            } else {
                var1_1 = StringsKt.m0((String)var1_1.get(var9_9)).toString();
                var2_2 = this.a;
                var2_2.V3((String)var1_1);
            }
        }
    }

    public final void w(int n3) {
        float f5;
        int n4;
        int n7 = 1;
        float f6 = Float.MIN_VALUE;
        AjioTextView ajioTextView = this.l;
        Object object = null;
        ajioTextView.setVisibility(0);
        ai0_2.i((View)this.m);
        int n8 = R$string.bestprice_coupon_message;
        Object object2 = hv3_0.K(n8);
        Object object3 = this.e;
        Object object4 = (Boolean)object3.ba().a;
        boolean n10 = (Boolean)object4;
        if (n10 && (object4 = (String)object3.ba().b) != null) {
            object2 = object4;
        }
        object4 = StringCompanionObject.INSTANCE;
        int n14 = R$string.rupee_formatted_string;
        object4 = hv3_0.K(n14);
        Object object5 = this.s;
        int n15 = 0;
        Object object6 = null;
        String string2 = "productPromotion";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object5 = null;
            f5 = 0.0f;
        }
        f5 = ((ProductPromotion)object5).getMaxSavingPrice();
        n4 = ok1_1.b(f5);
        object5 = n4;
        Object object7 = new Object[n7];
        object7[0] = object5;
        object5 = "format(...)";
        Object object8 = xh2_0.a((Object[])object7, n7, (String)object4, (String)object5);
        object4 = " ";
        object8 = nb0_0.a((String)object2, (String)object4, (String)object8);
        boolean bl2 = this.d;
        if (!bl2) {
            object5 = cp_1.Companion;
            object5.getClass();
            n4 = (int)(cp$a.o() ? 1 : 0);
            if (n4 != 0) {
                object8 = (Boolean)object3.ba().a;
                n7 = (int)(((Boolean)object8).booleanValue() ? 1 : 0);
                if (n7 == 0) {
                    n7 = R$string.offer_price_message;
                    object2 = hv3_0.K(n7);
                }
                if ((object8 = this.s) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object6 = object8;
                }
                n7 = ok1_1.b(((ProductPromotion)object6).getMaxSavingPrice());
                f6 = n7;
                object8 = qz2_0.x(Float.valueOf(f6));
                object3 = "  ";
                object8 = nb0_0.a((String)object2, (String)object3, (String)object8);
            }
        }
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        n4 = 10;
        f5 = 1.4E-44f;
        object3 = mz3_0.t((AJIOApplication)object3, n4);
        object5 = AJIOApplication$a.a();
        n15 = 9;
        object5 = mz3_0.t((AJIOApplication)object5, n15);
        object6 = new SpannableString((CharSequence)object8);
        int n16 = 33;
        if (bl2) {
            int n17 = hv3_0.m(R$color.luxe_color_121212);
            object4 = new ForegroundColorSpan(n17);
            n17 = ((String)object2).length();
            object6.setSpan(object4, 0, n17, n16);
            n17 = hv3_0.m(R$color.luxe_color_121212);
            object4 = new ForegroundColorSpan(n17);
            n17 = ((String)object2).length();
            int n18 = ((String)object8).length();
            object6.setSpan(object4, n17, n18, n16);
        } else {
            object7 = this.itemView.getContext();
            String string3 = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(object7, string3);
            int n19 = tm3_0.a(R$attr.pdp_offer_price_text, (Context)object7);
            object4 = new ForegroundColorSpan(n19);
            n19 = ((String)object2).length();
            object6.setSpan(object4, 0, n19, n16);
            object7 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(object7, string3);
            n19 = tm3_0.a(R$attr.pdp_offer_price_text, (Context)object7);
            object4 = new ForegroundColorSpan(n19);
            n19 = ((String)object2).length();
            int n20 = ((String)object8).length();
            object6.setSpan(object4, n19, n20, n16);
            object4 = cp_1.Companion;
            object4.getClass();
            boolean bl3 = cp$a.o();
            if (bl3) {
                object7 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(object7, string3);
                n20 = R$attr.plp_discount_percentage;
                n19 = tm3_0.a(n20, (Context)object7);
                object4 = new ForegroundColorSpan(n19);
                n19 = ((String)object8).length();
                object6.setSpan(object4, 0, n19, n16);
                object4 = AJIOApplication$a.a();
                n19 = (int)(this.t ? 1 : 0);
                n19 = n19 != 0 ? R$style.fleek_muli_bold_14_accent_2 : R$style.muli_bold_14_accent_2;
                ajioTextView.setTextAppearance((Context)object4, n19);
                object4 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                int n21 = tm3_0.b(R$attr.plp_offer_drawable, (Context)object4);
                ajioTextView.setCompoundDrawablesWithIntrinsicBounds(n21, 0, 0, 0);
                int n22 = hv3_0.q(R$dimen.dimen_4);
                ajioTextView.setCompoundDrawablePadding(n22);
                ajioTextView.setGravity(16);
                object4 = AJIOApplication$a.a();
                n19 = R$color.color_202020;
                int n24 = t70.getColor((Context)object4, n19);
                object7 = this.q;
                object7.setTextColor(n24);
                int n25 = hv3_0.q(R$dimen.dimen_109);
                object7.setWidth(n25);
                object4 = object7.getLayoutParams();
                string3 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                Intrinsics.checkNotNull(object4, string3);
                object4 = (ConstraintLayout$LayoutParams)((Object)object4);
                ((ViewGroup.MarginLayoutParams)object4).bottomMargin = 0;
                int n26 = R$drawable.top_corners_rounded_accent_color5_bg;
                ((AppCompatTextView)object7).setBackgroundResource(n26);
                int n27 = hv3_0.q(R$dimen.dimen_20);
                object7.setPadding(n27, 0, 0, 0);
                int n28 = R$drawable.ic_offer_timer_pdp_black;
                ((AppCompatTextView)object7).setCompoundDrawablesWithIntrinsicBounds(n28, 0, 0, 0);
            }
        }
        object4 = cp_1.Companion;
        object4.getClass();
        boolean bl4 = cp$a.o();
        object7 = "";
        if (bl4) {
            object4 = new AjioCustomTypefaceSpan((String)object7, (Typeface)object3);
            n4 = ((String)object2).length();
            object6.setSpan(object4, 0, n4, n16);
        } else {
            object4 = new AjioCustomTypefaceSpan((String)object7, (Typeface)object5);
            n4 = ((String)object2).length();
            object6.setSpan(object4, 0, n4, n16);
        }
        object = new AjioCustomTypefaceSpan((String)object7, (Typeface)object3);
        n8 = ((String)object2).length();
        int n29 = ((String)object8).length();
        object6.setSpan(object, n8, n29, n16);
        object = TextView.BufferType.SPANNABLE;
        ajioTextView.setText((CharSequence)object6, (TextView.BufferType)object);
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object8);
        ((StringBuilder)object).append(" index ");
        ((StringBuilder)object).append(n3);
        String string4 = ((StringBuilder)object).toString();
        ajioTextView.setContentDescription(string4);
    }

    public final void x() {
        float f5;
        int n3;
        int n4;
        int n7 = 1;
        Object object = tr2_2.a;
        int n8 = tr2_2.m();
        Object object2 = this.m;
        ai0_2.B((View)object2);
        object2 = n8 != 0 ? tr2_2.c() : tr2_2.d().q;
        Object object3 = new da$a();
        ((da$a)object3).k = n7;
        ((da$a)object3).b = n4 = R$drawable.ic_sale_default;
        ((da$a)object3).c = n4;
        ((da$a)object3).n = object2;
        object2 = this.n;
        ((da$a)object3).u = object2;
        ((da$a)object3).a();
        object2 = tr2_2.d().s;
        object3 = this.o;
        object3.setText((CharSequence)object2);
        object2 = this.s;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productPromotion");
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        f5 = ((ProductPromotion)object2).getMaxSavingPrice();
        n3 = ok1_1.b(f5);
        object2 = qz2_0.o(String.valueOf(n3));
        object3 = this.p;
        object3.setText((CharSequence)object2);
        ai0_2.i((View)this.l);
        object2 = this.r;
        if (object2 != null) {
            ai0_2.i((View)object2);
        }
        object2 = this.e;
        n3 = (int)(object2.c9() ? 1 : 0);
        object3 = this.h;
        ConstraintLayout constraintLayout = this.g;
        if (n3 == 0) {
            int n10 = hv3_0.m(R$color.accent_color_17_alpha_1a);
            object2 = new ColorDrawable(n10);
            object = n8 != 0 ? tr2_2.a() : tr2_2.d().i;
            n8 = Color.parseColor((String)object);
            ColorDrawable colorDrawable = new ColorDrawable(n8);
            object = new ColorDrawable[2];
            object[0] = object2;
            object[n7] = colorDrawable;
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[])object);
            n8 = 0x40000000;
            float f6 = 2.0f;
            f5 = hv3_0.x(f6);
            int n14 = (int)f5;
            f6 = hv3_0.x(f6);
            int n15 = (int)f6;
            int n16 = 1;
            layerDrawable.setLayerInset(n16, 0, 0, n14, n15);
            constraintLayout.setBackground((Drawable)layerDrawable);
            n7 = hv3_0.m(R$color.white);
            object3.setBackgroundColor(n7);
        } else {
            Drawable drawable2 = hv3_0.r(R$drawable.luxe_sale_promo_bg);
            constraintLayout.setBackground(drawable2);
            n7 = R$drawable.luxe_sale_promo_code_bg;
            drawable2 = hv3_0.r(n7);
            object3.setBackground(drawable2);
        }
    }

    public final void y() {
        this.l.setVisibility(8);
        AjioTextView ajioTextView = this.k;
        Object object = ajioTextView.getLayoutParams();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        object = (ConstraintLayout$LayoutParams)((Object)object);
        int n3 = mz3_0.d(15);
        object.setMargins(0, 0, 0, n3);
        ajioTextView.setLayoutParams((ViewGroup.LayoutParams)object);
    }
}

