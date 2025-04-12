/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from rT
 */
public final class rt_1
extends rw_2
implements View.OnClickListener {
    public final Context b;
    public final OnCheckoutClickListener c;
    public final TextView d;
    public final AjioTextView e;
    public final CheckBox f;
    public final LinearLayout g;
    public final RelativeLayout h;
    public final RelativeLayout i;
    public final ImageView j;
    public final TextView k;
    public final Typeface l;
    public final Typeface m;
    public final NewCustomEventsRevamp n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final ArrayList t;
    public boolean u;
    public boolean v;
    public final ImageView w;
    public final TextView x;
    public final RelativeLayout y;

    public rt_1(Context context, View view, OnCheckoutClickListener onCheckoutClickListener) {
        NewCustomEventsRevamp newCustomEventsRevamp;
        rt_1 rt_12 = this;
        Object object = context;
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.b = context;
        Object object3 = onCheckoutClickListener;
        this.c = onCheckoutClickListener;
        object3 = AnalyticsManager.Companion;
        Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        this.n = newCustomEventsRevamp = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.o = object3 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
        this.p = object3 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
        this.q = "title";
        this.r = "description";
        this.s = "image";
        object3 = new ArrayList();
        this.t = object3;
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        object3 = hv3_0.o(10, (Context)object3);
        this.l = object3;
        object3 = AJIOApplication$a.a();
        object3 = hv3_0.o(9, (Context)object3);
        this.m = object3;
        int n3 = R$id.checkout_expandable_layout;
        object3 = (RelativeLayout)view.findViewById(n3);
        this.h = object3;
        int n4 = pa_1.b();
        if (n4 != 0) {
            n4 = R$id.id_ajio_spc_mini_assured_gift;
            object4 = (RelativeLayout)view.findViewById(n4);
            this.i = object4;
            n4 = R$id.ic_spc_assured_gift;
            object4 = (ImageView)view.findViewById(n4);
            this.j = object4;
            n4 = R$id.id_spc_gift_title;
            object4 = (TextView)view.findViewById(n4);
            this.k = object4;
        }
        n4 = R$id.iv_pd_delivery_alert;
        object4 = (ImageView)object2.findViewById(n4);
        rt_12.w = object4;
        n4 = R$id.id_pd_title;
        object4 = (TextView)object2.findViewById(n4);
        rt_12.x = object4;
        n4 = R$id.id_priority_delivery_layout;
        object4 = (RelativeLayout)object2.findViewById(n4);
        rt_12.y = object4;
        n4 = R$id.checkout_expandable_tv_title;
        object4 = (TextView)object2.findViewById(n4);
        rt_12.d = object4;
        object4.setText((CharSequence)"Expected Delivery");
        ai0_2.t((View)object3);
        n4 = R$id.checkout_expandable_tv_status;
        rt_12.e = object4 = (AjioTextView)object2.findViewById(n4);
        n4 = R$id.checkout_expandable_checkbox_expand;
        object4 = (CheckBox)object2.findViewById(n4);
        rt_12.f = object4;
        int n7 = R$id.checkout_expandable_layout_dynamic;
        object2 = (LinearLayout)object2.findViewById(n7);
        rt_12.g = object2;
        object2.setVisibility(8);
        n7 = 0;
        String string2 = null;
        super(rt_12, 0);
        object3.setOnClickListener((View.OnClickListener)object2);
        super(rt_12);
        object4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        boolean bl2 = pa_1.b();
        if (bl2) {
            Bundle bundle = new Bundle();
            if (object != null) {
                super((Context)object);
                object = "amount_payable";
                float f5 = ((jo_2)object2).c();
                bundle.putFloat((String)object, f5);
            }
            string2 = "widget interaction";
            String string3 = "free gift widget view";
            String string4 = "";
            String string5 = "widget_interaction";
            String string6 = "single page checkout";
            String string7 = "single page checkout";
            String string8 = "";
            String string9 = "";
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, bundle, string9, false, null, n8, null);
        }
        rt_12.u = false;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.checkout_btn_review_bag;
        OnCheckoutClickListener onCheckoutClickListener = this.c;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            if (onCheckoutClickListener != null) {
                onCheckoutClickListener.g2();
            }
        } else {
            n7 = R$id.checkout_expandable_tv_status;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7 && onCheckoutClickListener != null) {
                onCheckoutClickListener.j5();
            }
        }
    }

    public final void w(boolean bl2) {
        boolean bl3 = og1_1.b();
        if (!bl3 && (bl3 = pa_1.a())) {
            cp_1.Companion.getClass();
            JSONObject jSONObject = cp$a.q();
            String string2 = "spc_order_flag";
            bl3 = jSONObject.has(string2);
            if (bl3 && (bl3 = (jSONObject = cp$a.q()).getBoolean(string2)) && (bl3 = pa_1.a)) {
                jSONObject = this.i;
                if (bl2) {
                    if (jSONObject != null) {
                        ai0_2.B((View)jSONObject);
                    }
                } else if (jSONObject != null) {
                    ai0_2.i((View)jSONObject);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(Object var1_1, Serializable var2_2) {
        block67: {
            block66: {
                var3_3 = this;
                var4_4 = var1_1;
                var5_5 = var2_2;
                var6_6 = null;
                var7_7 /* !! */  = this.g;
                var7_7 /* !! */ .removeAllViews();
                var8_8 = var7_7 /* !! */ .getVisibility();
                var9_9 = this.s;
                var10_10 = this.q;
                var11_11 = "spc_order_flag";
                var12_12 = 1;
                var13_13 = 8;
                if (var8_8 == var13_13 && (var8_8 = (int)og1_1.b()) == 0 && (var8_8 = (int)pa_1.a()) != 0) {
                    var14_14 = cp_1.Companion;
                    var14_14.getClass();
                    var15_15 /* !! */  = cp$a.q();
                    var16_16 = var15_15 /* !! */ .has((String)var11_11);
                    if (var16_16 != 0 && (var16_16 = (var15_15 /* !! */  = cp$a.q()).getBoolean((String)var11_11)) != 0 && (var16_16 = pa_1.a) != 0) {
                        var15_15 /* !! */  = this.i;
                        if (var15_15 /* !! */  != null) {
                            ai0_2.B((View)var15_15 /* !! */ );
                        }
                        var14_14.getClass();
                        var14_14 = cp$a.b();
                        var16_16 = var14_14.has((String)var10_10);
                        if (var16_16 != 0 && (var15_15 /* !! */  = var14_14.getString((String)var10_10)) != null && (var16_16 = var15_15 /* !! */ .length()) != 0 && (var15_15 /* !! */  = var3_3.k) != null) {
                            var17_17 = var14_14.getString((String)var10_10);
                            var15_15 /* !! */ .setText((CharSequence)var17_17);
                        }
                        if ((var16_16 = var14_14.has((String)var9_9)) != 0 && (var14_14 = var14_14.getString((String)var9_9)) != null && (var8_8 = var14_14.length()) != 0 && (var14_14 = var3_3.j) != null) {
                            var15_15 /* !! */  = new da$a();
                            var15_15 /* !! */ .k = var12_12;
                            var15_15 /* !! */ .g = var12_12;
                            var15_15 /* !! */ .n = var9_9;
                            var15_15 /* !! */ .u = var14_14;
                            var15_15 /* !! */ .a();
                        }
                    }
                }
                var14_14 = var3_3.f;
                var15_15 /* !! */  = var3_3.e;
                if (var4_4 == null) {
                    var4_4 = "Add Address";
                    var15_15 /* !! */ .setText((CharSequence)var4_4);
                    var18_18 = og1_1.b();
                    if (var18_18 != 0) {
                        var15_15 /* !! */ .underlineText();
                        var18_18 = hv3_0.m(R$color.luxe_color_121212);
                        var15_15 /* !! */ .setTextColor(var18_18);
                    } else {
                        var18_18 = hv3_0.m(R$color.accent_color_4);
                        var15_15 /* !! */ .setTextColor(var18_18);
                    }
                    var14_14.setVisibility(var13_13);
                    var15_15 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
                    return;
                }
                var13_13 = 0;
                var19_20 = null;
                var15_15 /* !! */ .setOnClickListener(null);
                var14_14.setVisibility(0);
                var20_21 = og1_1.b();
                if (var20_21 != 0) {
                    var15_15 /* !! */ .removeUnderlineText();
                }
                if ((var20_21 = var5_5 instanceof ArrayList) != 0) {
                    var5_5 = (ArrayList)var5_5;
                } else {
                    var21_22 = 0;
                    var5_5 = null;
                }
                if (var5_5 == null) break block66;
                var17_17 = var5_5.iterator();
                var22_23 = 1;
                var23_24 = 0;
                var24_25 = null;
                while ((var25_26 = var17_17.hasNext()) != 0) {
                    var26_27 = (CartEntry)var17_17.next();
                    if (var22_23 != 0) {
                        if (var26_27 != null) {
                            var22_23 = var26_27.isServicability();
                        } else {
                            var22_23 = 0;
                            var27_28 = null;
                        }
                        if (var26_27 != null && (var26_27 = var26_27.getServicabilityInfo()) != null && (var26_27 = var26_27.getPriorityDelivery()) != null) {
                            var28_29 = var26_27.isApplied();
                            if (var28_29) {
                                var23_24 += var12_12;
                            }
                            if ((var13_13 = (int)var3_3.u) == 0 && (var19_20 = var26_27.getErrorMessage()) != null && (var13_13 = var19_20.length()) != 0) {
                                var3_3.u = var12_12;
                            }
                        }
                    }
                    var13_13 = 0;
                    var19_20 = null;
                }
                var13_13 = (int)h40_0.Q1();
                if (var13_13 != 0) {
                    var19_20 = var5_5.iterator();
                    while ((var20_21 = var19_20.hasNext()) != 0) {
                        var17_17 = (CartEntry)var19_20.next();
                        if (var17_17 == null || (var17_17 = var17_17.getServicabilityInfo()) == null || (var17_17 = var17_17.getPriorityDelivery()) == null || (var25_26 = (int)var3_3.v) != 0 || (var17_17 = var17_17.getBucketChangeMsg()) == null || (var20_21 = var17_17.length()) == 0) continue;
                        var3_3.v = var12_12;
                    }
                }
                var19_20 = h40_0.a;
                var13_13 = (int)h40_0.O1();
                var17_17 = var3_3.y;
                if (var13_13 != 0 && var23_24 > 0) {
                    var19_20 = var3_3.x;
                    if (var19_20 != null) {
                        var25_26 = R$string.pd_delivery_selected_spc;
                        var24_25 = String.valueOf(var23_24);
                        var29_30 = var14_14;
                        var14_14 = new Object[var12_12];
                        var14_14[0] = var24_25;
                        var14_14 = hv3_0.L(var25_26, (Object[])var14_14);
                        var19_20.setText((CharSequence)var14_14);
                    } else {
                        var29_30 = var14_14;
                    }
                    if (var17_17 != null) {
                        ai0_2.B((View)var17_17);
                    }
                    if ((var14_14 = var3_3.w) != null) {
                        lp_0.h((ImageView)var14_14);
                    }
                } else {
                    var29_30 = var14_14;
                    if (var17_17 != null) {
                        ai0_2.i((View)var17_17);
                    }
                }
                var14_14 = var3_3.b;
                if (var22_23 == 0 || (var13_13 = (int)h40_0.Q1()) != 0 && (var13_13 = (int)var3_3.v) != 0) {
                    var13_13 = (int)og1_1.b();
                    var17_17 = "null cannot be cast to non-null type android.widget.TextView";
                    if (var13_13 != 0) {
                        var19_20 = LayoutInflater.from((Context)var14_14);
                        var23_24 = R$layout.row_checkout_text_lux;
                        var25_26 = 0;
                        var26_27 = null;
                        var19_20 = var19_20.inflate(var23_24, null);
                        Intrinsics.checkNotNull(var19_20, (String)var17_17);
                        var19_20 = (TextView)var19_20;
                    } else {
                        var25_26 = 0;
                        var26_27 = null;
                        var19_20 = LayoutInflater.from((Context)var14_14);
                        var23_24 = R$layout.row_checkout_text_revamp;
                        var19_20 = var19_20.inflate(var23_24, null);
                        Intrinsics.checkNotNull(var19_20, (String)var17_17);
                        var19_20 = (TextView)var19_20;
                    }
                    var17_17 = "One or more item in your bag is not deliverable at the selected address. Please review your bag.";
                    var19_20.setText((CharSequence)var17_17);
                    var7_7 /* !! */ .addView((View)var19_20);
                }
                var19_20 = var3_3.t;
                var19_20.clear();
                var20_21 = var5_5.size();
                var23_24 = 0;
                var24_25 = null;
                var25_26 = 0;
                var26_27 = null;
                while (true) {
                    var6_6 = "";
                    if (var23_24 >= var20_21) break;
                    var31_32 = var30_31 = var5_5.get(var23_24);
                    var31_32 = (CartEntry)var30_31;
                    var32_33 = var20_21;
                    Intrinsics.checkNotNull(var14_14);
                    var17_17 = new FrameLayout((Context)var14_14);
                    var17_17.k = var23_24;
                    var30_31 = var15_15 /* !! */ ;
                    var17_17.a = var15_15 /* !! */  = var3_3.c;
                    var16_16 = (int)og1_1.b();
                    if (var16_16 != 0) {
                        var15_15 /* !! */  = LayoutInflater.from((Context)var17_17.getContext());
                        var18_19 = R$layout.view_checkout_product_lux;
                        var33_34 = var22_23;
                        var22_23 = 1;
                        var4_4 = var15_15 /* !! */ .inflate(var18_19, (ViewGroup)var17_17, (boolean)var22_23);
                    } else {
                        var33_34 = var22_23;
                        var22_23 = 1;
                        var4_4 = LayoutInflater.from((Context)var17_17.getContext());
                        var16_16 = R$layout.view_checkout_product_revamp;
                        var4_4 = var4_4.inflate(var16_16, (ViewGroup)var17_17, (boolean)var22_23);
                    }
                    var16_16 = R$id.view_checkout_tv_size;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.f = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_tv_qty;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.g = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_tv_detail;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.e = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_tv_name;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.b = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_product_imv;
                    var15_15 /* !! */  = (ImageView)var4_4.findViewById(var16_16);
                    var17_17.h = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_tv_exclusive;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.c = var15_15 /* !! */ ;
                    var16_16 = R$id.view_checkout_tv_estimated_date;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.d = var15_15 /* !! */ ;
                    var16_16 = R$id.free_tag;
                    var15_15 /* !! */  = (ConstraintLayout)var4_4.findViewById(var16_16);
                    var17_17.i = var15_15 /* !! */ ;
                    var16_16 = R$id.freeTagText;
                    var15_15 /* !! */  = (TextView)var4_4.findViewById(var16_16);
                    var17_17.j = var15_15 /* !! */ ;
                    var16_16 = R$id.iv_pd_delivery_alert;
                    var4_4 = (ImageView)var4_4.findViewById(var16_16);
                    var17_17.l = var4_4;
                    var18_19 = var5_5.size();
                    var16_16 = 1;
                    if (var23_24 != (var18_19 -= var16_16)) {
                        var18_19 = 1;
                    } else {
                        var18_19 = 0;
                        var4_4 = null;
                    }
                    var4_4 = (boolean)var18_19;
                    var17_17.setData(var31_32, var4_4);
                    var7_7 /* !! */ .addView((View)var17_17);
                    if (var31_32 != null && (var4_4 = var31_32.getReasonForNotServiceability()) != null && (var18_19 = (int)var4_4.equalsIgnoreCase((String)(var15_15 /* !! */  = "oos"))) != 0) {
                        var18_19 = 1;
                        var25_26 += var18_19;
                    }
                    if (var31_32 != null && (var4_4 = var31_32.getProduct()) != null) {
                        if ((var4_4 = var4_4.getCode()) != null) {
                            var6_6 = var4_4;
                        }
                        var19_20.add(var6_6);
                    }
                    var18_19 = 1;
                    var23_24 += var18_19;
                    var4_4 = var1_1;
                    var20_21 = var32_33;
                    var15_15 /* !! */  = var30_31;
                    var22_23 = var33_34;
                    var12_12 = 1;
                }
                var30_31 = var15_15 /* !! */ ;
                var33_34 = var22_23;
                p5_0.a.getClass();
                Intrinsics.checkNotNullParameter(var19_20, "productIds");
                var4_4 = p5_0.d;
                var4_4.clear();
                var4_4.addAll(var19_20);
                var18_19 = og1_1.b();
                if (var18_19 != 0 || (var18_19 = pa_1.a()) == 0) ** GOTO lbl-1000
                cp_1.Companion.getClass();
                var4_4 = cp$a.q();
                var18_19 = var4_4.has((String)var11_11);
                if (var18_19 != 0 && (var18_19 = (int)(var4_4 = cp$a.q()).getBoolean((String)var11_11)) != 0 && (var18_19 = (int)pa_1.a) != 0) {
                    var18_19 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var18_19 = 0;
                    var4_4 = null;
                }
                var5_5 = "findViewById(...)";
                if (var18_19 != 0) {
                    var4_4 = LayoutInflater.from((Context)var14_14);
                    var34_35 = R$layout.view_spc_assured_gift;
                    var4_4 = var4_4.inflate(var34_35, null);
                    Intrinsics.checkNotNull(var4_4);
                    var34_35 = R$id.ic_spc_assured_gift;
                    var11_11 = var4_4.findViewById(var34_35);
                    Intrinsics.checkNotNullExpressionValue(var11_11, (String)var5_5);
                    var11_11 = (ImageView)var11_11;
                    var12_12 = R$id.id_spc_gift_title;
                    var31_32 = var4_4.findViewById(var12_12);
                    Intrinsics.checkNotNullExpressionValue(var31_32, (String)var5_5);
                    var31_32 = (TextView)var31_32;
                    var13_13 = R$id.id_spc_gift_details;
                    var19_20 = var4_4.findViewById(var13_13);
                    Intrinsics.checkNotNullExpressionValue(var19_20, (String)var5_5);
                    var19_20 = (TextView)var19_20;
                    cp_1.Companion.getClass();
                    var15_15 /* !! */  = cp$a.b();
                    var20_21 = (int)var15_15 /* !! */ .has((String)var10_10);
                    var22_23 = 1;
                    if (var20_21 == var22_23 && (var17_17 = var15_15 /* !! */ .getString((String)var10_10)) != null && (var20_21 = var17_17.length()) != 0) {
                        var10_10 = var15_15 /* !! */ .getString((String)var10_10);
                        var31_32.setText((CharSequence)var10_10);
                    }
                    if ((var12_12 = (int)var15_15 /* !! */ .has((String)(var10_10 = var3_3.r))) == (var20_21 = 1) && (var31_32 = var15_15 /* !! */ .getString((String)var10_10)) != null && (var12_12 = var31_32.length()) != 0) {
                        var10_10 = var15_15 /* !! */ .getString((String)var10_10);
                        var19_20.setText((CharSequence)var10_10);
                    }
                    if ((var35_36 = (int)var15_15 /* !! */ .has((String)var9_9)) == (var12_12 = 1) && (var10_10 = var15_15 /* !! */ .getString((String)var9_9)) != null && (var35_36 = var10_10.length()) != 0) {
                        var10_10 = new da$a();
                        var10_10.k = var12_12;
                        var10_10.n = var9_9;
                        var10_10.u = var11_11;
                        var10_10.a();
                    }
                    var7_7 /* !! */ .addView((View)var4_4);
                }
                if (var25_26 > 0) {
                    var4_4 = dk0.a(var25_26, "oos_count");
                    var9_9 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var10_10 = "single page checkout \u2013 payment failure";
                    var9_9.pushOpenScreenEvent((String)var10_10, (Bundle)var4_4);
                    var17_17 = new Bundle();
                    var4_4 = var3_3.n;
                    var9_9 = var4_4.getREASON();
                    var17_17.putString((String)var9_9, (String)var6_6);
                    var9_9 = var4_4.getPAYMENT_MODE();
                    var17_17.putString((String)var9_9, (String)var6_6);
                    var4_4 = var4_4.getPAYMENT_AMOUNT();
                    var17_17.putString((String)var4_4, (String)var6_6);
                    var15_15 /* !! */  = var3_3.o;
                    var27_28 = var3_3.p;
                    var11_11 = var3_3.n;
                    var31_32 = "single page checkout \u2013 payment failure";
                    var19_20 = "single page checkout";
                    var11_11.newPushCustomScreenView((String)var31_32, (String)var19_20, (String)var15_15 /* !! */ , (Bundle)var17_17, var27_28);
                }
                var4_4 = h40_0.a;
                var18_19 = h40_0.O1();
                var36_37 = var18_19 != 0 && (var18_19 = (int)var3_3.u) != 0;
                if (var33_34 != 0 && !var36_37 && (var18_19 = (int)var3_3.v) == 0) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        continue;
                        break;
                    }
                }
                var18_19 = (int)og1_1.b();
                if (var18_19 != 0) {
                    var4_4 = LayoutInflater.from((Context)var14_14);
                    var8_8 = R$layout.checkout_review_bag_lux;
                    var9_9 = null;
                    var4_4 = var4_4.inflate(var8_8, null);
                    Intrinsics.checkNotNull(var4_4);
                } else {
                    var9_9 = null;
                    var4_4 = LayoutInflater.from((Context)var14_14);
                    var8_8 = R$layout.checkout_review_bag_revamp;
                    var4_4 = var4_4.inflate(var8_8, null);
                    Intrinsics.checkNotNull(var4_4);
                }
                var8_8 = R$id.checkout_btn_review_bag;
                var14_14 = var4_4.findViewById(var8_8);
                Intrinsics.checkNotNullExpressionValue(var14_14, (String)var5_5);
                var14_14 = (TextView)var14_14;
                var14_14.setOnClickListener((View.OnClickListener)var3_3);
                var7_7 /* !! */ .addView((View)var4_4);
                ** while (true)
                var4_4 = var1_1;
                var21_22 = var1_1 instanceof CartDeliveryAddress;
                var7_7 /* !! */  = var3_3.l;
                var14_14 = var3_3.m;
                var9_9 = "Issue with bag";
                if (var21_22 != 0) {
                    var4_4 = (CartDeliveryAddress)var1_1;
                    var21_22 = var4_4.getNsCount();
                    if (var21_22 <= 0 && (var21_22 = var4_4.getOosCount()) <= 0) {
                        var21_22 = (int)og1_1.b();
                        if (var21_22 != 0) {
                            var5_5 = var30_31;
                            var30_31.setTypeface((Typeface)var14_14);
                            var37_38 = hv3_0.m(R$color.luxe_color_4A4A4A);
                            var30_31.setTextColor(var37_38);
                        } else {
                            var5_5 = var30_31;
                            var37_38 = hv3_0.m(R$color.accent_color_18);
                            var30_31.setTextColor(var37_38);
                        }
                        var7_7 /* !! */  = var4_4.getEstimateDeliveryDate();
                        var37_38 = (int)TextUtils.isEmpty((CharSequence)var7_7 /* !! */ );
                        if (var37_38 == 0) {
                            var6_6 = var4_4.getEstimateDeliveryDate();
                        }
                        var5_5.setText((CharSequence)var6_6);
                    } else {
                        var5_5 = var30_31;
                        var18_19 = (int)og1_1.b();
                        if (var18_19 != 0) {
                            var30_31.setTypeface((Typeface)var7_7 /* !! */ );
                            var18_19 = hv3_0.m(R$color.err_color_B10F2E);
                            var30_31.setTextColor(var18_19);
                        } else {
                            var18_19 = hv3_0.m(R$color.accent_color_1);
                            var30_31.setTextColor(var18_19);
                        }
                        var5_5.setText((CharSequence)var9_9);
                        var6_6 = var29_30;
                        var18_19 = 1;
                        var29_30.setChecked((boolean)var18_19);
                    }
                } else {
                    var5_5 = var30_31;
                    var35_36 = var1_1 instanceof StoreNode;
                    if (var35_36 != 0) {
                        var4_4 = (StoreNode)var1_1;
                        var35_36 = var4_4.getNsCount();
                        if (var35_36 <= 0 && (var35_36 = var4_4.getOosCount()) <= 0) {
                            var37_39 = og1_1.b();
                            if (var37_39 != 0) {
                                var30_31.setTypeface((Typeface)var14_14);
                                var37_39 = hv3_0.m(R$color.luxe_color_4A4A4A);
                                var30_31.setTextColor(var37_39);
                            } else {
                                var37_39 = hv3_0.m(R$color.accent_color_18);
                                var30_31.setTextColor(var37_39);
                            }
                            var7_7 /* !! */  = var4_4.getEstimateDeliveryDate();
                            var37_39 = (int)TextUtils.isEmpty((CharSequence)var7_7 /* !! */ );
                            if (var37_39 == 0) {
                                var6_6 = var4_4.getEstimateDeliveryDate();
                            }
                            var5_5.setText((CharSequence)var6_6);
                        } else {
                            var18_19 = (int)og1_1.b();
                            if (var18_19 != 0) {
                                var5_5.setTypeface((Typeface)var7_7 /* !! */ );
                                var18_19 = hv3_0.m(R$color.err_color_B10F2E);
                                var5_5.setTextColor(var18_19);
                            } else {
                                var18_19 = hv3_0.m(R$color.accent_color_1);
                                var5_5.setTextColor(var18_19);
                            }
                            var5_5.setText((CharSequence)var9_9);
                        }
                    }
                }
                break block67;
            }
            var5_5 = var15_15 /* !! */ ;
        }
        var4_4 = var3_3.d.getText();
        var5_5 = var5_5.getText();
        var6_6 = new StringBuilder();
        var6_6.append(var4_4);
        var6_6.append(" ");
        var6_6.append(var5_5);
        var4_4 = var6_6.toString();
        var3_3.h.setContentDescription((CharSequence)var4_4);
    }
}

