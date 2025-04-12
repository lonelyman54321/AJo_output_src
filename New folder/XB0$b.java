/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class XB0$b
extends RecyclerView$B {
    public static final /* synthetic */ int t;
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final RadioButton g;
    public final TextView h;
    public final TextView i;
    public final CardView j;
    public final ConstraintLayout k;
    public final AjioTextView l;
    public final ConstraintLayout m;
    public final AjioTextView n;
    public final CardView o;
    public final TextView p;
    public final TextView q;
    public final ImageView r;
    public final /* synthetic */ xb0_0 s;

    public XB0$b(xb0_0 xb0_02, View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        this.s = xb0_02;
        super((View)object);
        int n3 = R$id.labLayout;
        View view = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.a = view;
        int n4 = R$id.labTvName;
        Object object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.b = object2;
        n4 = R$id.labTvDefault;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.c = object2;
        n4 = R$id.labTvDefaultNew;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.d = object2;
        n4 = R$id.labTvAddress;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.e = object2;
        n4 = R$id.labTvPhone;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.f = object2;
        n4 = R$id.labRbSelection;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (RadioButton)object2;
        this.g = object2;
        n4 = R$id.labTvReturnPickUp;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.h = object2;
        n4 = R$id.labTvExchange;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.i = object2;
        n4 = R$id.cvAddress;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (CardView)((Object)object2);
        this.j = object2;
        int n7 = R$id.clCard;
        Object object3 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (ConstraintLayout)((Object)object3);
        this.k = object3;
        n7 = R$id.lbl_how_self_ship_works;
        object3 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (AjioTextView)object3;
        this.l = object3;
        n7 = R$id.cl_self_ship;
        object3 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (ConstraintLayout)((Object)object3);
        this.m = object3;
        n7 = R$id.exchangeReturnLabel;
        object3 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (AjioTextView)object3;
        this.n = object3;
        n7 = R$id.cvViewMore;
        object3 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (CardView)((Object)object3);
        this.o = object3;
        int n8 = R$id.labTvDelivered;
        View view2 = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.p = view2;
        n8 = R$id.tv_view_more;
        view2 = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.q = view2;
        n8 = R$id.ic_up_down;
        object = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.r = object;
        object = "null cannot be cast to non-null type android.view.View.OnClickListener";
        Intrinsics.checkNotNull(xb0_02, (String)object);
        view.setOnClickListener((View.OnClickListener)xb0_02);
        Intrinsics.checkNotNull(xb0_02, (String)object);
        object2.setOnClickListener((View.OnClickListener)xb0_02);
        Intrinsics.checkNotNull(xb0_02, (String)object);
        object3.setOnClickListener((View.OnClickListener)xb0_02);
    }

    public static String w(CartDeliveryAddress object, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = ((CartDeliveryAddress)object).getLine1();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl3) {
            object2 = ((CartDeliveryAddress)object).getLine1();
            stringBuilder.append((String)object2);
        }
        object2 = ((CartDeliveryAddress)object).getLine2();
        bl3 = TextUtils.isEmpty((CharSequence)object2);
        String string2 = ", ";
        if (!bl3) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getLine2();
            stringBuilder.append((String)object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getLandmark())))) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getLandmark();
            stringBuilder.append((String)object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getTown())))) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getTown();
            stringBuilder.append((String)object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getDistrict())))) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getDistrict();
            stringBuilder.append((String)object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getState())))) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getState();
            stringBuilder.append((String)object2);
        }
        if ((object2 = ((CartDeliveryAddress)object).getCountry()) != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getCountry().getName())))) {
            stringBuilder.append(string2);
            object2 = ((CartDeliveryAddress)object).getCountry().getName();
            stringBuilder.append((String)object2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getPostalCode())))) {
            object2 = " - ";
            stringBuilder.append((String)object2);
            if (bl2) {
                cp$a cp$a = cp_1.Companion;
                object = ((CartDeliveryAddress)object).getPostalCode();
                cp$a.getClass();
                object = cp$a.B((String)object);
                stringBuilder.append((String)object);
            } else {
                object = ((CartDeliveryAddress)object).getPostalCode();
                stringBuilder.append((String)object);
            }
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(CartDeliveryAddress var1_1, int var2_2, boolean var3_3) {
        var4_4 /* !! */  = "address";
        Intrinsics.checkNotNullParameter(var1_1, var4_4 /* !! */ );
        var5_5 = hv3_0.W();
        var6_6 /* !! */  = this.p;
        var7_7 /* !! */  = this.o;
        if (var2_2 == 0 && var5_5 != 0) {
            if (var3_3 == 0) {
                var7_7 /* !! */ .setVisibility(0);
            }
            var6_6 /* !! */ .setVisibility(0);
        } else {
            var3_3 = 8;
            var7_7 /* !! */ .setVisibility(var3_3);
            var6_6 /* !! */ .setVisibility(var3_3);
        }
        var8_8 = this.s;
        var9_9 = var8_8.d;
        var7_7 /* !! */  = this.q;
        var10_10 /* !! */  = this.r;
        if (var9_9 != 0) {
            var6_6 /* !! */  = hv3_0.K(R$string.view_less);
            var7_7 /* !! */ .setText((CharSequence)var6_6 /* !! */ );
            var6_6 /* !! */  = hv3_0.r(R$drawable.arrow_up);
            var10_10 /* !! */ .setImageDrawable((Drawable)var6_6 /* !! */ );
            var9_9 = R$string.acc_up_arrow_icon;
            var6_6 /* !! */  = hv3_0.K(var9_9);
            var10_10 /* !! */ .setContentDescription((CharSequence)var6_6 /* !! */ );
        } else {
            var6_6 /* !! */  = hv3_0.K(R$string.view_more);
            var7_7 /* !! */ .setText((CharSequence)var6_6 /* !! */ );
            var6_6 /* !! */  = hv3_0.r(R$drawable.arrow_down);
            var10_10 /* !! */ .setImageDrawable((Drawable)var6_6 /* !! */ );
            var9_9 = R$string.acc_down_arrow_icon;
            var6_6 /* !! */  = hv3_0.K(var9_9);
            var10_10 /* !! */ .setContentDescription((CharSequence)var6_6 /* !! */ );
        }
        var6_6 /* !! */  = this.d;
        var7_7 /* !! */  = this.c;
        if (var2_2 == 0 && var5_5 != 0) {
            ai0_2.i((View)var7_7 /* !! */ );
            ai0_2.i((View)var6_6 /* !! */ );
        } else {
            var11_11 = var1_1.isDefaultAddress();
            if (var11_11 != 0) {
                if (var5_5 != 0) {
                    ai0_2.B((View)var6_6 /* !! */ );
                    ai0_2.i((View)var7_7 /* !! */ );
                } else {
                    ai0_2.B((View)var7_7 /* !! */ );
                    ai0_2.i((View)var6_6 /* !! */ );
                }
            } else {
                ai0_2.i((View)var7_7 /* !! */ );
                ai0_2.i((View)var6_6 /* !! */ );
            }
        }
        var12_12 = var2_2;
        this.j.setTag(var12_12);
        var12_12 = var8_8.c;
        var6_6 /* !! */  = this.k;
        var7_7 /* !! */  = this.g;
        var10_10 /* !! */  = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        var13_13 = 1;
        if (var12_12 == null || (var12_12 = var12_12.p1()) == null) ** GOTO lbl-1000
        var12_12 = var8_8.c;
        var14_14 = 0;
        var15_15 = null;
        if (var12_12 != null && (var12_12 = var12_12.p1()) != null) {
            var12_12 = var12_12.getId();
        } else {
            var5_5 = 0;
            var12_12 = null;
        }
        var5_5 = TextUtils.isEmpty((CharSequence)var12_12);
        if (var5_5 != 0) ** GOTO lbl-1000
        var12_12 = var8_8.c;
        if (var12_12 != null && (var12_12 = var12_12.p1()) != null) {
            var15_15 = var12_12.getId();
        }
        if ((var5_5 = kotlin.text.b.i(var15_15, (String)(var12_12 = var1_1.getId()), false)) != 0) {
            var7_7 /* !! */ .setChecked((boolean)var13_13);
            ai0_2.B((View)var7_7 /* !! */ );
            var5_5 = R$drawable.card_view_border;
            var6_6 /* !! */ .setBackgroundResource(var5_5);
            AJIOApplication.Companion.getClass();
            var12_12 = AJIOApplication$a.a();
            var6_6 /* !! */  = this.m.getLayoutParams();
            Intrinsics.checkNotNull(var6_6 /* !! */ , (String)var10_10 /* !! */ );
            var6_6 /* !! */  = (ConstraintLayout$LayoutParams)var6_6 /* !! */ ;
            var16_16 = 2;
            var6_6 /* !! */ .leftMargin = var11_11 = ai0_2.e(var16_16, (Context)var12_12);
            var6_6 /* !! */ .rightMargin = var5_5 = ai0_2.e(var16_16, (Context)var12_12);
        } else lbl-1000:
        // 3 sources

        {
            var7_7 /* !! */ .setChecked(false);
            ai0_2.B((View)var7_7 /* !! */ );
            this.a.setOnClickListener((View.OnClickListener)var8_8);
            var6_6 /* !! */ .setBackgroundResource(0);
            AJIOApplication.Companion.getClass();
            var12_12 = AJIOApplication$a.a();
            var6_6 /* !! */  = this.m.getLayoutParams();
            Intrinsics.checkNotNull(var6_6 /* !! */ , (String)var10_10 /* !! */ );
            var6_6 /* !! */  = (ConstraintLayout$LayoutParams)var6_6 /* !! */ ;
            var6_6 /* !! */ .leftMargin = var16_16 = ai0_2.e(0, (Context)var12_12);
            var6_6 /* !! */ .rightMargin = var5_5 = ai0_2.e(0, (Context)var12_12);
        }
        var12_12 = mz3_0.N(var1_1);
        var6_6 /* !! */  = this.b;
        var12_12 = hv3_0.u((String)var12_12);
        var6_6 /* !! */ .setText((CharSequence)var12_12);
        var12_12 = XB0$b.w(var1_1, false);
        var6_6 /* !! */  = this.e;
        var6_6 /* !! */ .setText((CharSequence)var12_12);
        var12_12 = XB0$b.w(var1_1, (boolean)var13_13);
        var6_6 /* !! */ .setContentDescription((CharSequence)var12_12);
        var12_12 = var1_1.getPhone();
        if (var12_12 != null) {
            var12_12 = var1_1.getPhone();
            var6_6 /* !! */  = "getPhone(...)";
            Intrinsics.checkNotNullExpressionValue(var12_12, (String)var6_6 /* !! */ );
            var9_9 = var12_12.length() - var13_13;
            var16_16 = 0;
            var7_7 /* !! */  = null;
            var11_11 = 0;
            var10_10 /* !! */  = null;
            while (var16_16 <= var9_9) {
                var14_14 = var11_11 == 0 ? var16_16 : var9_9;
                var14_14 = var12_12.charAt(var14_14);
                var17_17 = 32;
                if ((var14_14 = Intrinsics.compare(var14_14, var17_17)) <= 0) {
                    var14_14 = 1;
                } else {
                    var14_14 = 0;
                    var15_15 = null;
                }
                if (var11_11 == 0) {
                    if (var14_14 == 0) {
                        var11_11 = 1;
                        continue;
                    }
                    ++var16_16;
                    continue;
                }
                if (var14_14 == 0) break;
                var9_9 += -1;
            }
            if ((var5_5 = (var12_12 = var12_12.subSequence(var16_16, var9_9 += var13_13).toString()).length()) > 0) {
                var12_12 = var1_1.getPhone();
                var6_6 /* !! */  = this.f;
                var6_6 /* !! */ .setText((CharSequence)var12_12);
                var12_12 = cp_1.Companion;
                var7_7 /* !! */  = var1_1.getPhone();
                var12_12.getClass();
                var12_12 = cp$a.B((String)var7_7 /* !! */ );
                var6_6 /* !! */ .setContentDescription((CharSequence)var12_12);
            }
        }
        var12_12 = hv3_0.K(R$string.self_ship_product_to_return);
        var6_6 /* !! */  = new SpannableString((CharSequence)var12_12);
        var7_7 /* !! */  = new XB0$b$a(var8_8);
        var11_11 = var12_12.length();
        var13_13 = 64;
        var14_14 = 33;
        var6_6 /* !! */ .setSpan((Object)var7_7 /* !! */ , var13_13, var11_11, var14_14);
        var7_7 /* !! */  = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        var10_10 /* !! */  = AJIOApplication$a.a();
        var17_17 = 10;
        var7_7 /* !! */  = var7_7 /* !! */ .getTypefaceWithFont((Context)var10_10 /* !! */ , var17_17);
        var10_10 /* !! */  = "getTypefaceWithFont(...)";
        Intrinsics.checkNotNullExpressionValue((Object)var7_7 /* !! */ , (String)var10_10 /* !! */ );
        var19_19 = "";
        var18_18 /* !! */  = new AjioCustomTypefaceSpan(var19_19, (Typeface)var7_7 /* !! */ );
        var5_5 = var12_12.length();
        var6_6 /* !! */ .setSpan((Object)var18_18 /* !! */ , var13_13, var5_5, var14_14);
        var12_12 = FontsManager.getInstance();
        var7_7 /* !! */  = AJIOApplication$a.a();
        var13_13 = 9;
        var12_12 = var12_12.getTypefaceWithFont((Context)var7_7 /* !! */ , var13_13);
        Intrinsics.checkNotNullExpressionValue(var12_12, (String)var10_10 /* !! */ );
        var7_7 /* !! */  = new AjioCustomTypefaceSpan(var19_19, (Typeface)var12_12);
        var5_5 = 63;
        var6_6 /* !! */ .setSpan((Object)var7_7 /* !! */ , 0, var5_5, var14_14);
        var12_12 = this.l;
        var12_12.setText((CharSequence)var6_6 /* !! */ );
        var6_6 /* !! */  = LinkMovementMethod.getInstance();
        var12_12.setMovementMethod((MovementMethod)var6_6 /* !! */ );
        Intrinsics.checkNotNullParameter(var1_1, var4_4 /* !! */ );
        var4_4 /* !! */  = this.m;
        var12_12 = this.n;
        var6_6 /* !! */  = this.h;
        var7_7 /* !! */  = this.i;
        var10_10 /* !! */  = var8_8.a;
        var20_20 = "return";
        if (var2_2 == 0 && var2_2 != (var14_14 = var8_8.e)) {
            ai0_2.i((View)var7_7 /* !! */ );
            ai0_2.i((View)var6_6 /* !! */ );
            ai0_2.i((View)var12_12);
            var14_14 = (int)h40_0.l1();
            if (var14_14 != 0 && (var14_14 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false)) != 0) {
                ai0_2.i((View)var4_4 /* !! */ );
            }
        }
        var14_14 = (int)var1_1.isSelectedAddress();
        var18_18 /* !! */  = "exchange";
        if (var14_14 != 0) {
            var14_14 = (int)var1_1.isExchangeService();
            var19_19 = "#ff7676";
            if (var14_14 != 0 && (var14_14 = (int)var1_1.isReverseService()) != 0) {
                var14_14 = hv3_0.m(R$color.accent_color_2);
                var7_7 /* !! */ .setTextColor(var14_14);
                var14_14 = hv3_0.m(R$color.accent_color_2);
                var6_6 /* !! */ .setTextColor(var14_14);
                var15_15 = hv3_0.K(R$string.return_available);
                var6_6 /* !! */ .setText((CharSequence)var15_15);
                var14_14 = R$string.exchange_available;
                var15_15 = hv3_0.K(var14_14);
                var7_7 /* !! */ .setText(var15_15);
                var3_3 = var8_8.e;
                if (var3_3 == var2_2) {
                    ai0_2.B((View)var7_7 /* !! */ );
                    ai0_2.B((View)var6_6 /* !! */ );
                } else {
                    ai0_2.i((View)var12_12);
                    ai0_2.i((View)var4_4 /* !! */ );
                }
            } else {
                var14_14 = (int)var1_1.isExchangeService();
                if (var14_14 != 0 && (var14_14 = (int)var1_1.isReverseService()) == 0) {
                    var14_14 = hv3_0.m(R$color.accent_color_2);
                    var7_7 /* !! */ .setTextColor(var14_14);
                    var14_14 = Color.parseColor((String)var19_19);
                    var6_6 /* !! */ .setTextColor(var14_14);
                    var15_15 = hv3_0.K(R$string.return_not_available_for_pincode);
                    var6_6 /* !! */ .setText((CharSequence)var15_15);
                    var14_14 = R$string.exchange_available;
                    var15_15 = hv3_0.K(var14_14);
                    var7_7 /* !! */ .setText(var15_15);
                    var3_3 = var8_8.e;
                    if (var3_3 == var2_2) {
                        ai0_2.B((View)var6_6 /* !! */ );
                        ai0_2.B((View)var7_7 /* !! */ );
                        var2_2 = (int)h40_0.l1();
                        if (var2_2 != 0 && (var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false)) != 0) {
                            ai0_2.B((View)var4_4 /* !! */ );
                        }
                    } else {
                        ai0_2.i((View)var12_12);
                        var2_2 = (int)h40_0.l1();
                        if (var2_2 != 0 && (var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false)) != 0) {
                            ai0_2.i((View)var4_4 /* !! */ );
                        }
                    }
                } else {
                    var14_14 = (int)var1_1.isExchangeService();
                    if (var14_14 == 0 && (var14_14 = (int)var1_1.isReverseService()) != 0) {
                        var14_14 = Color.parseColor((String)var19_19);
                        var7_7 /* !! */ .setTextColor(var14_14);
                        var14_14 = Color.parseColor((String)"#ff008526");
                        var6_6 /* !! */ .setTextColor(var14_14);
                        var15_15 = hv3_0.K(R$string.return_available);
                        var6_6 /* !! */ .setText((CharSequence)var15_15);
                        var14_14 = R$string.exchange_not_available_for_pincode;
                        var15_15 = hv3_0.K(var14_14);
                        var7_7 /* !! */ .setText(var15_15);
                        var3_3 = var8_8.e;
                        if (var3_3 == var2_2) {
                            ai0_2.B((View)var6_6 /* !! */ );
                            ai0_2.B((View)var7_7 /* !! */ );
                        } else {
                            ai0_2.i((View)var12_12);
                            ai0_2.i((View)var4_4 /* !! */ );
                        }
                    } else {
                        var3_3 = var8_8.e;
                        if (var3_3 == var2_2) {
                            ai0_2.B((View)var12_12);
                            ai0_2.B((View)var4_4 /* !! */ );
                        } else {
                            ai0_2.i((View)var7_7 /* !! */ );
                            ai0_2.i((View)var6_6 /* !! */ );
                        }
                        var2_2 = (int)h40_0.l1();
                        if (var2_2 != 0) {
                            var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false);
                            if (var2_2 != 0) {
                                var2_2 = R$string.return_not_available_for_pincode;
                                var21_21 = hv3_0.K(var2_2);
                                var12_12.setText((CharSequence)var21_21);
                            } else {
                                var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , (String)var18_18 /* !! */ , false);
                                if (var2_2 != 0) {
                                    var2_2 = R$string.exchange_not_available_for_pincode;
                                    var21_21 = hv3_0.K(var2_2);
                                    var12_12.setText((CharSequence)var21_21);
                                    ai0_2.i((View)var4_4 /* !! */ );
                                }
                            }
                        }
                    }
                }
            }
            var2_2 = (int)h40_0.l1();
            if (var2_2 != 0 && (var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , (String)var18_18 /* !! */ , false)) != 0 && (var2_2 = (int)var1_1.isReverseService()) == 0) {
                ai0_2.i((View)var4_4 /* !! */ );
                var2_2 = var12_12.getVisibility();
                if (var2_2 == 0) {
                    ai0_2.i((View)var12_12);
                    ai0_2.B((View)var7_7 /* !! */ );
                    var21_21 = hv3_0.K(R$string.exchange_not_available_for_pincode);
                    var7_7 /* !! */ .setText(var21_21);
                    var2_2 = Color.parseColor((String)var19_19);
                    var7_7 /* !! */ .setTextColor(var2_2);
                } else {
                    var2_2 = var7_7 /* !! */ .getVisibility();
                    if (var2_2 == 0) {
                        ai0_2.i((View)var7_7 /* !! */ );
                        ai0_2.B((View)var12_12);
                        var21_21 = hv3_0.K(R$string.exchange_not_available_for_pincode);
                        var12_12.setText((CharSequence)var21_21);
                        var2_2 = Color.parseColor((String)var19_19);
                        var12_12.setTextColor(var2_2);
                    }
                }
                ai0_2.i((View)var6_6 /* !! */ );
            }
        }
        if ((var2_2 = (int)h40_0.l1()) != 0) {
            var2_2 = var6_6 /* !! */ .getVisibility();
            if (var2_2 == 0 && (var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false)) == 0) {
                ai0_2.i((View)var6_6 /* !! */ );
            }
            if ((var2_2 = var7_7 /* !! */ .getVisibility()) == 0 && (var2_2 = (int)kotlin.text.b.i((String)var10_10 /* !! */ , (String)var18_18 /* !! */ , false)) == 0) {
                ai0_2.i((View)var7_7 /* !! */ );
            }
            if (!((var22_22 = var1_1.isSelectedAddress()) || (var22_22 = kotlin.text.b.i((String)var10_10 /* !! */ , (String)var18_18 /* !! */ , false)) && (var22_22 = kotlin.text.b.i((String)var10_10 /* !! */ , var20_20, false)))) {
                ai0_2.i((View)var6_6 /* !! */ );
                ai0_2.i((View)var7_7 /* !! */ );
                ai0_2.i((View)var12_12);
                ai0_2.i((View)var4_4 /* !! */ );
            }
        }
    }
}

