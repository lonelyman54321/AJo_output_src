/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Point
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.appcompat.app.f$a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioProxyByPassClient;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.databinding.ExchangeFragementLayoutRevampBinding;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductDetail;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from RC0
 */
public final class rc0_2
extends u51
implements View.OnClickListener,
F63$d,
gD0$e,
ud0_0 {
    public static final RC0$a Companion;
    public static final /* synthetic */ gn1_2[] x;
    public FragmentActivity f;
    public final ArrayList g;
    public CartEntry h;
    public Product i;
    public final NewCustomEventsRevamp j;
    public f63_0 k;
    public final hh3_2 l;
    public final hh3_2 m;
    public String n;
    public LinearLayoutManager o;
    public LinearLayoutManager p;
    public gd0_0 q;
    public ConstraintLayout r;
    public ProductOptionVariant s;
    public String t;
    public String u;
    public EddResult v;
    public final cc3_2 w;

    static {
        Object object = jz.a(rc0_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/ExchangeFragementLayoutRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        x = gn1_2Array;
        Companion = object = new Object();
    }

    public rc0_2() {
        Object object = new ArrayList();
        this.g = object;
        this.j = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        object = new lc0_2(this, 0);
        this.l = object = yr1_2.b((Function0)object);
        object = new mc0_1(this, 0);
        this.m = object = yr1_2.b((Function0)object);
        this.w = object = z80_0.c(RC0$b.a, this);
    }

    public final void G4() {
        this.Pa();
    }

    public final void Pa() {
        Object object = this.f;
        boolean bl2 = object instanceof ExchangeReturnTabActivity;
        if (bl2) {
            object = this.h;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setReason(null);
            object = this.h;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setReasonIndex(0);
            object = this.h;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setSubReason(null);
            object = this.h;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setSubreasonIndex(null);
            object = this.h;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).getProduct().setSelectedProductSizeCode(null);
            object = this.f;
            String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity";
            Intrinsics.checkNotNull(object, string2);
            object = (ExchangeReturnTabActivity)object;
            ((ExchangeReturnTabActivity)object).C2();
        }
    }

    public final ExchangeFragementLayoutRevampBinding Qa() {
        Object object = x[0];
        object = this.w.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (ExchangeFragementLayoutRevampBinding)object;
    }

    public final void Ra() {
        Object object = this.q;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            int n3 = ((gd0_0)object).d;
            if (n3 != 0) {
                Object object2;
                object = this.s;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    object = ((ProductOptionVariant)object).getCode();
                } else {
                    object = "";
                }
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object2 = this.n)))) {
                    object2 = (e12_0)this.m.getValue();
                    String string2 = this.n;
                    Intrinsics.checkNotNull(string2);
                    Intrinsics.checkNotNull(object);
                    gd0_0 gd0_02 = this.q;
                    Intrinsics.checkNotNull(gd0_02);
                    int n4 = gd0_02.d;
                    boolean bl3 = true;
                    ((e12_0)object2).l(n4, string2, (String)object, bl3);
                }
            }
        }
    }

    public final void Sa(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            ArrayList arrayList = this.g;
            if (arrayList != null) {
                int n3 = arrayList.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    boolean bl3;
                    Object object = ((ProductOptionVariant)arrayList.get(i3)).getCode();
                    boolean bl4 = kotlin.text.b.i(string2, (String)object, bl3 = true);
                    if (bl4) {
                        ((ProductOptionVariant)arrayList.get(i3)).setSelected(bl3);
                        this.s = object = (ProductOptionVariant)arrayList.get(i3);
                        continue;
                    }
                    object = (ProductOptionVariant)arrayList.get(i3);
                    ((ProductOptionVariant)object).setSelected(false);
                }
            }
            this.Ua(arrayList);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ta(EddResult var1_1, String var2_2) {
        block34: {
            block36: {
                block37: {
                    block35: {
                        var3_3 = null;
                        var4_4 = 1;
                        var5_5 /* !! */  = this.f;
                        if (var5_5 /* !! */  == null) break block34;
                        Intrinsics.checkNotNull(var5_5 /* !! */ );
                        var6_6 = var5_5 /* !! */ .isFinishing();
                        if (var6_6 != 0) break block34;
                        this.v = var1_1;
                        var7_7 = TextUtils.isEmpty((CharSequence)var2_2);
                        var6_6 = 8;
                        var8_8 = "sizeAlertViewCL";
                        var9_9 = "rowExchangeEddLL";
                        var10_10 = "exchangeReasonCL";
                        var11_11 = "";
                        if (var7_7 != 0) break block35;
                        var1_1 = this.q;
                        Intrinsics.checkNotNull(var1_1);
                        var12_12 = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var12_12, var8_8);
                        var1_1.getClass();
                        gd0_0.h((View)var12_12, var11_11, var6_6);
                        var1_1 = this.Qa().exchangeReason.exchangeReasonCL;
                        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var10_10);
                        ai0_2.B((View)var1_1);
                        var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddLL;
                        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                        ai0_2.B((View)var1_1);
                        var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddErrorTvError;
                        var1_1.setText((CharSequence)var2_2);
                        break block36;
                    }
                    var1_1 = this.v;
                    if (var1_1 != null) break block37;
                    var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddLL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                    ai0_2.i((View)var1_1);
                    var1_1 = this.Qa().exchangeReason.exchangeReasonCL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var10_10);
                    ai0_2.B((View)var1_1);
                    break block36;
                }
                var1_1 = var1_1.getProductDetails();
                var13_13 = 0;
                var2_2 = null;
                if (var1_1 != null) {
                    var1_1 = this.v;
                    if (var1_1 != null && (var1_1 = var1_1.getProductDetails()) != null) {
                        var7_7 = var1_1.size();
                        var1_1 = var7_7;
                    } else {
                        var7_7 = 0;
                        var1_1 = null;
                    }
                    Intrinsics.checkNotNull(var1_1);
                    var7_7 = var1_1.intValue();
                    if (var7_7 > 0 && (var1_1 = this.v) != null && (var1_1 = var1_1.getProductDetails()) != null) {
                        var2_2 = var1_1 = var1_1.get(0);
                        var2_2 = (ProductDetail)var1_1;
                    }
                }
                if ((var1_1 = this.h) == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getProduct();
                if (var1_1 != null) {
                    var1_1 = this.h;
                    Intrinsics.checkNotNull(var1_1);
                    var1_1 = var1_1.getProduct().getCode();
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = var11_11;
                }
                var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var14_14 = this.n;
                var15_15 = ", exchange not available for pincode -";
                var1_1 = UX.c("Item -", (String)var1_1, var15_15, var14_14);
                var14_14 = "Exchange Screen";
                var16_16 = "EDD on Shipping Page";
                var12_12.pushButtonTapEvent(var16_16, var1_1, var14_14);
                if (var2_2 != null && (var7_7 = (int)var2_2.isServicability()) == 0) {
                    var1_1 = this.Qa().exchangeReason.exchangeReasonCL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var10_10);
                    ai0_2.i((View)var1_1);
                    var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddLL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                    ai0_2.B((View)var1_1);
                    var1_1 = this.q;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = this.Qa().sizeAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var2_2, var8_8);
                    var1_1.getClass();
                    gd0_0.h((View)var2_2, var11_11, var6_6);
                    this.Qa().rowExchangeEdd.tvCreateReturn.setOnClickListener(this);
                    this.Qa().rowExchangeEdd.tvLearnWhy.setOnClickListener(this);
                    var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddErrorTvError;
                    var13_13 = R$string.edd_selected_size_not_deliverable;
                    var9_9 = this.v;
                    Intrinsics.checkNotNull(var9_9);
                    var9_9 = var9_9.getPinCode();
                    var10_10 = new Object[var4_4];
                    var10_10[0] = var9_9;
                    var2_2 = hv3_0.L(var13_13, (Object[])var10_10);
                    var1_1.setText((CharSequence)var2_2);
                    var7_7 = (int)h40_0.l1();
                    var2_2 = "tvCreateReturnInfo";
                    var9_9 = "tvCreateReturn";
                    if (var7_7 == 0) {
                        var1_1 = this.h;
                        if (var1_1 != null && (var7_7 = (int)var1_1.isReturnable()) == var4_4) {
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturn;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                            ai0_2.B((View)var1_1);
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturnInfo;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                            var13_13 = R$string.returnable_info;
                            var2_2 = this.getString(var13_13);
                            ai0_2.z((TextView)var1_1, (String)var2_2);
                        } else {
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturn;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                            ai0_2.i((View)var1_1);
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturnInfo;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                            var13_13 = R$string.not_returnable_info;
                            var2_2 = this.getString(var13_13);
                            ai0_2.z((TextView)var1_1, (String)var2_2);
                        }
                    } else {
                        var1_1 = this.h;
                        if (var1_1 != null && (var7_7 = (int)var1_1.isReturnable()) == var4_4 && (var1_1 = this.getArguments()) != null && (var7_7 = (int)var1_1.getBoolean((String)(var10_10 = "reverseService"))) == var4_4) {
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturn;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                            ai0_2.B((View)var1_1);
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturnInfo;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                            var13_13 = R$string.returnable_info;
                            var2_2 = this.getString(var13_13);
                            ai0_2.z((TextView)var1_1, (String)var2_2);
                        } else {
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturn;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                            ai0_2.i((View)var1_1);
                            var1_1 = this.Qa().rowExchangeEdd.tvCreateReturnInfo;
                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                            var13_13 = R$string.incentivise_info_more;
                            var2_2 = this.getString(var13_13);
                            ai0_2.z((TextView)var1_1, (String)var2_2);
                        }
                    }
                } else {
                    var1_1 = this.Qa().rowExchangeEdd.rowExchangeEddLL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                    ai0_2.i((View)var1_1);
                    var1_1 = this.Qa().exchangeReason.exchangeReasonCL;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var10_10);
                    ai0_2.B((View)var1_1);
                }
            }
            var1_1 = this.s;
            if (var1_1 == null) break block34;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getCode();
            var2_2 = this.s;
            Intrinsics.checkNotNull(var2_2);
            var2_2 = var2_2.getValue();
            var17_17 = 32;
            if (var2_2 != null) {
                var2_2 = this.s;
                Intrinsics.checkNotNull(var2_2);
                var2_2 = var2_2.getValue();
                Intrinsics.checkNotNull(var2_2);
                var18_18 = var2_2.length() - var4_4;
                var19_19 = 0;
                var12_12 = null;
                var20_20 = false;
                var14_14 = null;
                while (var19_19 <= var18_18) {
                    var21_21 = var20_20 == false ? var19_19 : var18_18;
                    if ((var21_21 = Intrinsics.compare(var2_2.charAt(var21_21), var17_17)) <= 0) {
                        var21_21 = 1;
                    } else {
                        var21_21 = 0;
                        var16_16 = null;
                    }
                    if (!var20_20) {
                        if (var21_21 == 0) {
                            var20_20 = true;
                            continue;
                        }
                        var19_19 += var4_4;
                        continue;
                    }
                    if (var21_21 == 0) break;
                    var18_18 += -1;
                }
                var2_2 = com.jio.jioads.adinterfaces.a.a(var18_18, var4_4, var19_19, (String)var2_2);
            } else {
                var2_2 = var11_11;
            }
            var18_18 = TextUtils.isEmpty((CharSequence)var2_2);
            if (var18_18 != 0 || (var18_18 = TextUtils.isEmpty((CharSequence)var1_1)) != 0) break block34;
            var10_10 = this.v;
            if (var10_10 == null) ** GOTO lbl-1000
            Intrinsics.checkNotNull(var10_10);
            var18_18 = (int)var10_10.isServicability();
            if (var18_18 == 0) {
                var3_3 = this.q;
                Intrinsics.checkNotNull(var3_3);
                var22_22 = this.Qa().sizeAlertView.sizeAlertViewCL;
                Intrinsics.checkNotNullExpressionValue((Object)var22_22, var8_8);
                var3_3.getClass();
                gd0_0.h((View)var22_22, var11_11, var6_6);
                var3_3 = this.q;
                if (var3_3 != null) {
                    Intrinsics.checkNotNull(var3_3);
                    var3_3.g();
                }
            } else lbl-1000:
            // 2 sources

            {
                var18_18 = var2_2.length() - var4_4;
                var19_19 = 0;
                var12_12 = null;
                var20_20 = false;
                var14_14 = null;
                while (var19_19 <= var18_18) {
                    var21_21 = var20_20 == false ? var19_19 : var18_18;
                    if ((var21_21 = Intrinsics.compare(var2_2.charAt(var21_21), var17_17)) <= 0) {
                        var21_21 = 1;
                    } else {
                        var21_21 = 0;
                        var16_16 = null;
                    }
                    if (!var20_20) {
                        if (var21_21 == 0) {
                            var20_20 = true;
                            continue;
                        }
                        var19_19 += var4_4;
                        continue;
                    }
                    if (var21_21 == 0) break;
                    var18_18 += -1;
                }
                var9_9 = com.jio.jioads.adinterfaces.a.a(var18_18, var4_4, var19_19, (String)var2_2);
                var10_10 = this.q;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.e;
                var4_4 = kotlin.text.b.i((String)var9_9, (String)var10_10, (boolean)var4_4);
                if (var4_4 != 0) {
                    this.Qa().sizeAlertView.sizeAlertViewCL.setVisibility(0);
                    var22_23 = this.q;
                    Intrinsics.checkNotNull(var22_23);
                    var9_9 = this.Qa().sizeAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var9_9, var8_8);
                    var18_18 = R$string.alert_text_for_exchange_size;
                    var10_10 = hv3_0.K(var18_18);
                    var22_23.getClass();
                    gd0_0.h((View)var9_9, (String)var10_10, 0);
                } else {
                    var22_23 = this.q;
                    Intrinsics.checkNotNull(var22_23);
                    var9_9 = this.Qa().sizeAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var9_9, var8_8);
                    var22_23.getClass();
                    gd0_0.h((View)var9_9, var11_11, var6_6);
                }
                var22_23 = this.s;
                Intrinsics.checkNotNull(var22_23);
                var4_4 = var22_23.getStockLevel();
                var9_9 = this.h;
                Intrinsics.checkNotNull(var9_9);
                var9_9 = var9_9.getQuantity();
                var17_17 = var9_9.intValue();
                var10_10 = "exchangeReturnQuantityLayoutLL";
                if (var4_4 >= var17_17) {
                    var22_23 = this.q;
                    Intrinsics.checkNotNull(var22_23);
                    var9_9 = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                    Intrinsics.checkNotNullExpressionValue(var9_9, (String)var10_10);
                    var10_10 = this.h;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getQuantity();
                    var12_12 = "getQuantity(...)";
                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var12_12);
                    var18_18 = var10_10.intValue();
                    var22_23.m((View)var9_9, var18_18, this, false);
                    var3_3 = this.q;
                    Intrinsics.checkNotNull(var3_3);
                    var22_23 = this.Qa().quantityAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var22_23, var8_8);
                    var3_3.getClass();
                    gd0_0.h((View)var22_23, var11_11, var6_6);
                } else {
                    var22_23 = this.q;
                    Intrinsics.checkNotNull(var22_23);
                    var5_5 /* !! */  = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                    Intrinsics.checkNotNullExpressionValue(var5_5 /* !! */ , (String)var10_10);
                    var9_9 = this.s;
                    Intrinsics.checkNotNull(var9_9);
                    var17_17 = var9_9.getStockLevel();
                    var22_23.m((View)var5_5 /* !! */ , var17_17, this, false);
                    var22_23 = this.q;
                    Intrinsics.checkNotNull(var22_23);
                    var5_5 /* !! */  = this.Qa().quantityAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var5_5 /* !! */ , var8_8);
                    var23_24 = R$string.alert_text_for_exchange_quantity;
                    var8_8 = hv3_0.K(var23_24);
                    var22_23.getClass();
                    gd0_0.h((View)var5_5 /* !! */ , var8_8, 0);
                }
            }
            var3_3 = this.h;
            Intrinsics.checkNotNull(var3_3);
            var3_3 = var3_3.getProduct();
            var3_3.setSelectedSize((String)var2_2);
            var2_2 = this.h;
            Intrinsics.checkNotNull(var2_2);
            var2_2 = var2_2.getProduct();
            var2_2.setSelectedProductSizeCode((String)var1_1);
            var1_1 = this.q;
            if (var1_1 != null) {
                Intrinsics.checkNotNull(var1_1);
                var2_2 = this.f;
                Intrinsics.checkNotNull(var2_2);
                var1_1.j((Activity)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ua(List var1_1) {
        block21: {
            block22: {
                block24: {
                    block23: {
                        var2_2 /* !! */  = this.r;
                        if (var2_2 /* !! */  == null) break block21;
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var3_3 = var2_2 /* !! */ .getVisibility();
                        if (var3_3 != 0 || (var2_2 /* !! */  = this.p) == null) break block21;
                        var4_4 /* !! */  = this.r;
                        Intrinsics.checkNotNull((Object)var4_4 /* !! */ );
                        var5_5 = this.f;
                        if (var5_5 == null) break block21;
                        Intrinsics.checkNotNull(var5_5);
                        var6_6 = var5_5.isFinishing();
                        if (var6_6 != 0) break block21;
                        var5_5 = var1_1;
                        var5_5 = (Collection)var1_1;
                        var7_7 = 8;
                        if (var5_5 == null || (var6_6 = var5_5.isEmpty()) != 0) break block22;
                        var6_6 = R$id.pdp_size_layout;
                        var4_4 /* !! */ .findViewById(var6_6).setVisibility(0);
                        this.k = var5_5 = new f63_0(this, (List)var1_1);
                        var8_8 = R$id.product_detail_size_rv;
                        var1_1 = var4_4 /* !! */ .findViewById(var8_8);
                        var4_4 /* !! */  = "findViewById(...)";
                        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var4_4 /* !! */ );
                        var1_1 = (RecyclerView)var1_1;
                        var1_1.setLayoutManager((RecyclerView$o)var2_2 /* !! */ );
                        var2_2 /* !! */  = this.k;
                        var1_1.setAdapter((RecyclerView$f)var2_2 /* !! */ );
                        var1_1 = this.s;
                        if (var1_1 != null) {
                            this.Ra();
                        }
                        if ((var3_3 = (var1_1 = this.g).size()) != (var9_10 = 1)) break block21;
                        ((ProductOptionVariant)var1_1.get(0)).setSelected((boolean)var9_10);
                        this.s = var1_1 = (ProductOptionVariant)var1_1.get(0);
                        var3_3 = 0;
                        var2_2 /* !! */  = null;
                        if (var1_1 != null) {
                            var1_1 = var1_1.getCode();
                        } else {
                            var8_8 = 0;
                            var1_1 = null;
                        }
                        var5_5 = this.s;
                        var10_11 = 32;
                        if (var5_5 != null && (var5_5 = var5_5.getValue()) != null) {
                            var11_12 = var5_5.length() - var9_10;
                            var12_13 = 0;
                            var13_14 = null;
                            var14_15 = false;
                            var15_16 = null;
                            while (var12_13 <= var11_12) {
                                var16_17 = var14_15 == false ? var12_13 : var11_12;
                                var16_17 = Intrinsics.compare(var5_5.charAt(var16_17), var10_11);
                                var16_17 = var16_17 <= 0 ? 1 : 0;
                                if (!var14_15) {
                                    if (var16_17 == 0) {
                                        var14_15 = true;
                                        continue;
                                    }
                                    ++var12_13;
                                    continue;
                                }
                                if (var16_17 == 0) break;
                                var11_12 += -1;
                            }
                            var5_5 = com.jio.jioads.adinterfaces.a.a(var11_12, var9_10, var12_13, (String)var5_5);
                        } else {
                            var6_6 = 0;
                            var5_5 = null;
                        }
                        var11_12 = TextUtils.isEmpty((CharSequence)var5_5);
                        if (var11_12 != 0 || (var11_12 = (int)TextUtils.isEmpty((CharSequence)var1_1)) != 0) break block21;
                        var17_18 = this.v;
                        var13_14 = "";
                        var15_16 = "sizeAlertViewCL";
                        if (var17_18 == null) break block23;
                        Intrinsics.checkNotNull(var17_18);
                        var11_12 = (int)var17_18.isServicability();
                        if (var11_12 != 0) break block23;
                        var2_2 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var4_4 /* !! */  = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue((Object)var4_4 /* !! */ , var15_16);
                        var2_2 /* !! */ .getClass();
                        gd0_0.h((View)var4_4 /* !! */ , var13_14, var7_7);
                        break block24;
                    }
                    if (var5_5 == null) ** GOTO lbl-1000
                    var11_12 = var5_5.length() - var9_10;
                    var16_17 = 0;
                    var18_19 = false;
                    while (var16_17 <= var11_12) {
                        var19_20 = var18_19 == false ? var16_17 : var11_12;
                        var19_20 = Intrinsics.compare(var5_5.charAt(var19_20), var10_11);
                        var19_20 = var19_20 <= 0 ? 1 : 0;
                        if (!var18_19) {
                            if (var19_20 == 0) {
                                var18_19 = true;
                                continue;
                            }
                            ++var16_17;
                            continue;
                        }
                        if (var19_20 == 0) break;
                        var11_12 += -1;
                    }
                    var20_21 = com.jio.jioads.adinterfaces.a.a(var11_12, var9_10, var16_17, (String)var5_5);
                    var17_18 = this.q;
                    if (var17_18 != null) {
                        var17_18 = var17_18.e;
                    } else {
                        var11_12 = 0;
                        var17_18 = null;
                    }
                    var9_10 = kotlin.text.b.i((String)var20_21, (String)var17_18, (boolean)var9_10);
                    if (var9_10 != 0) {
                        this.Qa().sizeAlertView.sizeAlertViewCL.setVisibility(0);
                        var4_4 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var4_4 /* !! */ );
                        var20_21 = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var20_21, var15_16);
                        var11_12 = R$string.alert_text_for_exchange_size;
                        var17_18 = hv3_0.K(var11_12);
                        var4_4 /* !! */ .getClass();
                        gd0_0.h((View)var20_21, (String)var17_18, 0);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var4_4 /* !! */ );
                        var20_21 = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var20_21, var15_16);
                        var4_4 /* !! */ .getClass();
                        gd0_0.h((View)var20_21, var13_14, var7_7);
                    }
                    var4_4 /* !! */  = this.s;
                    if (var4_4 /* !! */  != null) {
                        var9_10 = var4_4 /* !! */ .getStockLevel();
                        var4_4 /* !! */  = Integer.valueOf(var9_10);
                    } else {
                        var9_10 = 0;
                        var4_4 /* !! */  = null;
                    }
                    Intrinsics.checkNotNull((Object)var4_4 /* !! */ );
                    var9_10 = var4_4 /* !! */ .intValue();
                    var20_21 = this.h;
                    Intrinsics.checkNotNull(var20_21);
                    var20_21 = var20_21.getQuantity();
                    var10_11 = var20_21.intValue();
                    var17_18 = "exchangeReturnQuantityLayoutLL";
                    if (var9_10 >= var10_11) {
                        var2_2 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var4_4 /* !! */  = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                        Intrinsics.checkNotNullExpressionValue((Object)var4_4 /* !! */ , (String)var17_18);
                        var20_21 = this.h;
                        Intrinsics.checkNotNull(var20_21);
                        var20_21 = var20_21.getQuantity();
                        var17_18 = "getQuantity(...)";
                        Intrinsics.checkNotNullExpressionValue(var20_21, (String)var17_18);
                        var10_11 = var20_21.intValue();
                        var2_2 /* !! */ .m((View)var4_4 /* !! */ , var10_11, this, false);
                        var2_2 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var4_4 /* !! */  = this.Qa().quantityAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue((Object)var4_4 /* !! */ , var15_16);
                        var2_2 /* !! */ .getClass();
                        gd0_0.h((View)var4_4 /* !! */ , var13_14, var7_7);
                    } else {
                        var4_4 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var4_4 /* !! */ );
                        var21_22 /* !! */  = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                        Intrinsics.checkNotNullExpressionValue(var21_22 /* !! */ , (String)var17_18);
                        var20_21 = this.s;
                        if (var20_21 != null) {
                            var3_3 = var20_21.getStockLevel();
                            var2_2 /* !! */  = Integer.valueOf(var3_3);
                        }
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var3_3 = var2_2 /* !! */ .intValue();
                        var4_4 /* !! */ .m((View)var21_22 /* !! */ , var3_3, this, false);
                        var2_2 /* !! */  = this.q;
                        Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                        var4_4 /* !! */  = this.Qa().quantityAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue((Object)var4_4 /* !! */ , var15_16);
                        var7_7 = R$string.alert_text_for_exchange_quantity;
                        var21_22 /* !! */  = hv3_0.K(var7_7);
                        var2_2 /* !! */ .getClass();
                        gd0_0.h((View)var4_4 /* !! */ , (String)var21_22 /* !! */ , 0);
                    }
                }
                var2_2 /* !! */  = this.h;
                Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                var2_2 /* !! */ .getProduct().setSelectedSize((String)var5_5);
                var2_2 /* !! */  = this.h;
                Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                var2_2 /* !! */  = var2_2 /* !! */ .getProduct();
                var2_2 /* !! */ .setSelectedProductSizeCode((String)var1_1);
                this.Ra();
                var1_1 = this.q;
                if (var1_1 != null) {
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 /* !! */  = this.f;
                    Intrinsics.checkNotNull((Object)var2_2 /* !! */ );
                    var1_1.j((Activity)var2_2 /* !! */ );
                }
                break block21;
            }
            var8_9 = R$id.pdp_size_layout;
            var1_1 = var4_4 /* !! */ .findViewById(var8_9);
            var1_1.setVisibility(var7_7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Va(Boolean var1_1, Boolean var2_2) {
        block9: {
            block8: {
                var3_3 /* !! */  = new Bundle();
                var4_4 = Boolean.TRUE;
                var5_5 = Intrinsics.areEqual(var1_1, var4_4);
                if (var5_5 != 0) {
                    var5_5 = R$string.what_can_you_do_info;
                    var6_6 = this.getString(var5_5);
                } else {
                    var5_5 = R$string.not_returnable_info;
                    var6_6 = this.getString(var5_5);
                }
                Intrinsics.checkNotNull(var6_6);
                var7_7 = R$string.what_can_you_do;
                var8_8 = this.getString(var7_7);
                var9_9 = "returnable_heading2";
                var3_3 /* !! */ .putString(var9_9, var8_8);
                var8_8 = "returnable_description2";
                var3_3 /* !! */ .putString(var8_8, var6_6);
                var10_10 = Intrinsics.areEqual(var2_2, var4_4);
                var4_4 = "is_returnable";
                var6_6 = "returnable_description1";
                var11_11 = "returnable_heading1";
                if (var10_10 == 0) break block8;
                var10_10 = R$string.why_exchange_not_allowed;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var11_11, (String)var2_2);
                var10_10 = R$string.exchange_wrong_item_info;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var6_6, (String)var2_2);
                break block9;
            }
            var10_10 = (int)h40_0.l1();
            if (var10_10 == 0) ** GOTO lbl-1000
            var2_2 = this.getArguments();
            if (var2_2 != null) {
                var12_12 = "reverseService";
                var10_10 = (int)var2_2.getBoolean(var12_12);
            } else {
                var10_10 = 1;
            }
            if (var10_10 == 0) {
                var10_10 = R$string.size_not_deliverable;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var11_11, (String)var2_2);
                var10_10 = R$string.incentivise_delivery_error;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var6_6, (String)var2_2);
                var2_2 = "";
                var3_3 /* !! */ .putString(var9_9, (String)var2_2);
                var3_3 /* !! */ .putString(var8_8, (String)var2_2);
                var10_10 = 0;
                var2_2 = null;
                var3_3 /* !! */ .putBoolean((String)var4_4, false);
            } else lbl-1000:
            // 2 sources

            {
                var10_10 = R$string.size_not_deliverable;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var11_11, (String)var2_2);
                var10_10 = R$string.size_not_deliverable_info;
                var2_2 = this.getString(var10_10);
                var3_3 /* !! */ .putString(var6_6, (String)var2_2);
            }
        }
        if (var1_1 != null) {
            var13_13 = var1_1.booleanValue();
            var3_3 /* !! */ .putBoolean((String)var4_4, var13_13);
        }
        vy0_2.Companion.getClass();
        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , "data");
        Intrinsics.checkNotNullParameter(this, "createReturnListener");
        var1_1 = new vy0_2();
        var1_1.g = this;
        var2_2 = new Bundle();
        var12_12 = var3_3 /* !! */ .getString(var11_11);
        var2_2.putString(var11_11, var12_12);
        var11_11 = var3_3 /* !! */ .getString(var9_9);
        var2_2.putString(var9_9, var11_11);
        var9_9 = var3_3 /* !! */ .getString(var6_6);
        var2_2.putString(var6_6, var9_9);
        var6_6 = var3_3 /* !! */ .getString(var8_8);
        var2_2.putString(var8_8, var6_6);
        var14_14 = var3_3 /* !! */ .getBoolean((String)var4_4);
        var2_2.putBoolean((String)var4_4, var14_14);
        var1_1.setArguments((Bundle)var2_2);
        var2_2 = this.getActivity();
        if (var2_2 != null && (var2_2 = var2_2.getSupportFragmentManager()) != null) {
            var3_3 /* !! */  = "ExchangeFragmentRevamp";
            var1_1.show((FragmentManager)var2_2, (String)var3_3 /* !! */ );
        }
    }

    public final void W1() {
        Comparable comparable = this.h;
        if (comparable != null) {
            boolean bl2 = comparable.isReturnable();
            comparable = Boolean.valueOf(bl2);
        } else {
            boolean bl3 = false;
            comparable = null;
        }
        Boolean bl4 = Boolean.TRUE;
        this.Va((Boolean)comparable, bl4);
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = this.getActivity();
        this.f = object;
        object = this.getArguments();
        if (object != null) {
            this.t = string2 = object.getString("RETURN_REASON", null);
            string2 = "RETURN_SUB_REASON";
            object = object.getString(string2, null);
            this.u = object;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        OC0 oC0;
        void var1_36;
        String string2;
        int n3;
        Object object2;
        Object object3;
        int n4;
        int n7;
        Boolean bl2;
        int n8;
        int n10;
        LinearLayoutManager linearLayoutManager;
        int n14;
        block33: {
            Object[] objectArray;
            UrlHelper urlHelper;
            int n15;
            int n16;
            int n17;
            block34: {
                block28: {
                    String string3;
                    String string4;
                    int n18;
                    int n19;
                    block32: {
                        Object[] objectArray2;
                        UrlHelper urlHelper2;
                        block31: {
                            block29: {
                                String string5;
                                String string6;
                                block30: {
                                    void var1_4;
                                    block27: {
                                        n14 = 0;
                                        linearLayoutManager = null;
                                        n10 = -1;
                                        n8 = 1;
                                        bl2 = null;
                                        if (object != null) {
                                            n19 = object.getId();
                                            Integer n20 = n19;
                                        } else {
                                            n19 = 0;
                                            Object var1_3 = null;
                                        }
                                        n7 = R$id.tvCreateReturn;
                                        if (var1_4 != null && (n4 = var1_4.intValue()) == n7) {
                                            this.Pa();
                                            return;
                                        }
                                        n7 = R$id.pdp_Imv_next_size;
                                        if (var1_4 != null && (n4 = var1_4.intValue()) == n7) {
                                            LinearLayoutManager linearLayoutManager2;
                                            FragmentActivity fragmentActivity = this.f;
                                            if (fragmentActivity == null) return;
                                            Intrinsics.checkNotNull(fragmentActivity);
                                            n19 = (int)(fragmentActivity.isFinishing() ? 1 : 0);
                                            if (n19 != 0) {
                                                return;
                                            }
                                            ConstraintLayout constraintLayout = this.r;
                                            if (constraintLayout != null) {
                                                Intrinsics.checkNotNull((Object)constraintLayout);
                                                n19 = constraintLayout.getVisibility();
                                                if (n19 == 0) {
                                                    LinearLayoutManager linearLayoutManager3 = this.p;
                                                    if (linearLayoutManager3 == null) return;
                                                    Intrinsics.checkNotNull(linearLayoutManager3);
                                                    n19 = linearLayoutManager3.findLastCompletelyVisibleItemPosition();
                                                    if (n19 <= 0) return;
                                                    linearLayoutManager = this.p;
                                                    Intrinsics.checkNotNull(linearLayoutManager);
                                                    linearLayoutManager.scrollToPosition(n19 += n8);
                                                    return;
                                                }
                                            }
                                            if ((linearLayoutManager2 = this.o) == null) return;
                                            Intrinsics.checkNotNull(linearLayoutManager2);
                                            n19 = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                                            if (n19 <= 0) return;
                                            linearLayoutManager = this.o;
                                            Intrinsics.checkNotNull(linearLayoutManager);
                                            linearLayoutManager.scrollToPosition(n19 += n8);
                                            return;
                                        }
                                        n7 = R$id.pdp_Imv_prev_size;
                                        if (var1_4 != null && (n4 = var1_4.intValue()) == n7) {
                                            LinearLayoutManager linearLayoutManager4;
                                            FragmentActivity fragmentActivity = this.f;
                                            if (fragmentActivity == null) return;
                                            Intrinsics.checkNotNull(fragmentActivity);
                                            n19 = (int)(fragmentActivity.isFinishing() ? 1 : 0);
                                            if (n19 != 0) {
                                                return;
                                            }
                                            ConstraintLayout constraintLayout = this.r;
                                            if (constraintLayout != null) {
                                                Intrinsics.checkNotNull((Object)constraintLayout);
                                                n19 = constraintLayout.getVisibility();
                                                if (n19 == 0) {
                                                    LinearLayoutManager linearLayoutManager5 = this.p;
                                                    if (linearLayoutManager5 == null) return;
                                                    Intrinsics.checkNotNull(linearLayoutManager5);
                                                    n19 = linearLayoutManager5.findFirstCompletelyVisibleItemPosition();
                                                    if (n19 <= 0) return;
                                                    linearLayoutManager = this.p;
                                                    Intrinsics.checkNotNull(linearLayoutManager);
                                                    linearLayoutManager.scrollToPosition(n19 += n10);
                                                    return;
                                                }
                                            }
                                            if ((linearLayoutManager4 = this.o) == null) return;
                                            Intrinsics.checkNotNull(linearLayoutManager4);
                                            n19 = linearLayoutManager4.findFirstCompletelyVisibleItemPosition();
                                            if (n19 <= 0) return;
                                            linearLayoutManager = this.o;
                                            Intrinsics.checkNotNull(linearLayoutManager);
                                            linearLayoutManager.scrollToPosition(n19 += n10);
                                            return;
                                        }
                                        n7 = R$id.goto_size_guide_button;
                                        if (var1_4 == null || (n4 = var1_4.intValue()) != n7) break block27;
                                        Product product = this.i;
                                        if (product == null) break block28;
                                        Intrinsics.checkNotNull(product);
                                        ProductFnlColorVariantData productFnlColorVariantData = product.getFnlColorVariantData();
                                        if (productFnlColorVariantData == null) break block28;
                                        Product product2 = this.i;
                                        Intrinsics.checkNotNull(product2);
                                        ProductFnlColorVariantData productFnlColorVariantData2 = product2.getFnlColorVariantData();
                                        Intrinsics.checkNotNull(productFnlColorVariantData2);
                                        String string7 = productFnlColorVariantData2.getSizeGuideServiceUrl();
                                        n19 = (int)(TextUtils.isEmpty((CharSequence)string7) ? 1 : 0);
                                        object3 = "size_guide_service";
                                        object2 = "misc";
                                        n3 = 32;
                                        if (n19 != 0) break block29;
                                        Product product3 = this.i;
                                        Intrinsics.checkNotNull(product3);
                                        ProductFnlColorVariantData productFnlColorVariantData3 = product3.getFnlColorVariantData();
                                        Intrinsics.checkNotNull(productFnlColorVariantData3);
                                        string6 = productFnlColorVariantData3.getSizeGuideServiceUrl();
                                        Intrinsics.checkNotNull(string6);
                                        n18 = string6.length() - n8;
                                        n17 = 0;
                                        n16 = 0;
                                        break block30;
                                    }
                                    n14 = R$id.tvLearnWhy;
                                    if (var1_4 == null) {
                                        return;
                                    }
                                    n19 = var1_4.intValue();
                                    if (n19 != n14) return;
                                    CartEntry cartEntry = this.h;
                                    if (cartEntry != null) {
                                        n19 = (int)(cartEntry.isReturnable() ? 1 : 0);
                                        bl2 = n19 != 0;
                                    }
                                    Boolean bl3 = Boolean.FALSE;
                                    this.Va(bl2, bl3);
                                    return;
                                }
                                while (n17 <= n18) {
                                    n15 = n16 == 0 ? n17 : n18;
                                    n15 = Intrinsics.compare(string6.charAt(n15), n3);
                                    n15 = n15 <= 0 ? 1 : 0;
                                    if (n16 == 0) {
                                        if (n15 == 0) {
                                            n16 = 1;
                                            continue;
                                        }
                                        n17 += n8;
                                        continue;
                                    }
                                    if (n15 == 0) break;
                                    n18 += n10;
                                }
                                if ((n19 = (int)(TextUtils.isEmpty((CharSequence)(string5 = ((Object)string6.subSequence(n17, n18 += n8)).toString())) ? 1 : 0)) != 0) break block29;
                                urlHelper2 = UrlHelper.Companion.getInstance();
                                objectArray2 = this.i;
                                Intrinsics.checkNotNull(objectArray2);
                                objectArray2 = objectArray2.getFnlColorVariantData();
                                Intrinsics.checkNotNull(objectArray2);
                                objectArray2 = objectArray2.getSizeGuideServiceUrl();
                                Intrinsics.checkNotNull(objectArray2);
                                n17 = objectArray2.length() - n8;
                                n16 = 0;
                                n15 = 0;
                                break block31;
                            }
                            Product product = this.i;
                            Intrinsics.checkNotNull(product);
                            ProductFnlColorVariantData productFnlColorVariantData = product.getFnlColorVariantData();
                            Intrinsics.checkNotNull(productFnlColorVariantData);
                            String string8 = productFnlColorVariantData.getSizeGuideUrl();
                            n19 = (int)(TextUtils.isEmpty((CharSequence)string8) ? 1 : 0);
                            if (n19 != 0) break block28;
                            Product product4 = this.i;
                            Intrinsics.checkNotNull(product4);
                            ProductFnlColorVariantData productFnlColorVariantData4 = product4.getFnlColorVariantData();
                            Intrinsics.checkNotNull(productFnlColorVariantData4);
                            string4 = productFnlColorVariantData4.getSizeGuideUrl();
                            Intrinsics.checkNotNull(string4);
                            n18 = string4.length() - n8;
                            n17 = 0;
                            n16 = 0;
                            break block32;
                        }
                        while (n16 <= n17) {
                            int n21 = n15 == 0 ? n16 : n17;
                            n21 = Intrinsics.compare(objectArray2.charAt(n21), n3);
                            n21 = n21 <= 0 ? 1 : 0;
                            if (n15 == 0) {
                                if (n21 == 0) {
                                    n15 = 1;
                                    continue;
                                }
                                n16 += n8;
                                continue;
                            }
                            if (n21 == 0) break;
                            n17 += n10;
                        }
                        string2 = com.jio.jioads.adinterfaces.a.a(n17, n8, n16, (String)objectArray2);
                        objectArray2 = new Object[n8];
                        objectArray2[0] = string2;
                        String string9 = urlHelper2.getApiUrl((String)object2, (String)object3, objectArray2);
                        break block33;
                    }
                    while (n17 <= n18) {
                        n15 = n16 == 0 ? n17 : n18;
                        n15 = Intrinsics.compare(string4.charAt(n15), n3);
                        n15 = n15 <= 0 ? 1 : 0;
                        if (n16 == 0) {
                            if (n15 == 0) {
                                n16 = 1;
                                continue;
                            }
                            n17 += n8;
                            continue;
                        }
                        if (n15 == 0) break;
                        n18 += n10;
                    }
                    if ((n19 = (int)(TextUtils.isEmpty((CharSequence)(string3 = ((Object)string4.subSequence(n17, n18 += n8)).toString())) ? 1 : 0)) != 0) break block28;
                    urlHelper = UrlHelper.Companion.getInstance();
                    objectArray = this.i;
                    Intrinsics.checkNotNull(objectArray);
                    objectArray = objectArray.getFnlColorVariantData();
                    Intrinsics.checkNotNull(objectArray);
                    objectArray = objectArray.getSizeGuideUrl();
                    Intrinsics.checkNotNull(objectArray);
                    n17 = objectArray.length() - n8;
                    n16 = 0;
                    n15 = 0;
                    break block34;
                }
                String string10 = "";
                break block33;
            }
            while (n16 <= n17) {
                int n22 = n15 == 0 ? n16 : n17;
                n22 = Intrinsics.compare(objectArray.charAt(n22), n3);
                n22 = n22 <= 0 ? 1 : 0;
                if (n15 == 0) {
                    if (n22 == 0) {
                        n15 = 1;
                        continue;
                    }
                    n16 += n8;
                    continue;
                }
                if (n22 == 0) break;
                n17 += n10;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n17, n8, n16, (String)objectArray);
            objectArray = new Object[n8];
            objectArray[0] = string2;
            String string11 = urlHelper.getApiUrl((String)object2, (String)object3, objectArray);
        }
        object3 = this.f;
        if (object3 == null) return;
        Intrinsics.checkNotNull(object3);
        n7 = (int)(object3.isFinishing() ? 1 : 0);
        if (n7 != 0) return;
        n7 = (int)(this.isDetached() ? 1 : 0);
        if (n7 != 0) return;
        n7 = (int)(this.isRemoving() ? 1 : 0);
        if (n7 != 0) return;
        object2 = this.f;
        Intrinsics.checkNotNull(object2);
        object3 = new f$a((Context)object2);
        object2 = this.f;
        Intrinsics.checkNotNull(object2);
        object2 = object2.getLayoutInflater();
        string2 = "getLayoutInflater(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        n3 = R$layout.product_zoom_layout;
        bl2 = object2.inflate(n3, null);
        n4 = R$id.sizeguide_webview;
        object2 = (WebView)bl2.findViewById(n4);
        object2.setVisibility(0);
        object2.getSettings().setJavaScriptEnabled(n8 != 0);
        object2.getSettings().setUseWideViewPort(n8 != 0);
        object2.getSettings().setLoadWithOverviewMode(n8 != 0);
        object2.loadUrl((String)var1_36);
        AjioProxyByPassClient ajioProxyByPassClient = new AjioProxyByPassClient();
        object2.setWebViewClient((WebViewClient)ajioProxyByPassClient);
        ((f$a)object3).setView((View)bl2);
        f f5 = ((f$a)object3).create();
        Intrinsics.checkNotNullExpressionValue(f5, "create(...)");
        linearLayoutManager = new WindowManager.LayoutParams();
        Object object4 = this.f;
        Intrinsics.checkNotNull(object4);
        object4 = object4.getSystemService("window");
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.view.WindowManager");
        object4 = (WindowManager)object4;
        object3 = f5.getWindow();
        if (object3 != null) {
            object3 = f5.getWindow();
            Intrinsics.checkNotNull(object3);
            object3 = object3.getAttributes();
            linearLayoutManager.copyFrom((WindowManager.LayoutParams)object3);
        }
        if ((object3 = object4.getDefaultDisplay()) != null) {
            object3 = new Point();
            object4 = object4.getDefaultDisplay();
            object4.getSize((Point)object3);
            ((WindowManager.LayoutParams)linearLayoutManager).width = n10;
            ((WindowManager.LayoutParams)linearLayoutManager).height = n10;
            f5.show();
            oC0 = f5.getWindow();
            Intrinsics.checkNotNull(oC0);
            oC0.setAttributes((WindowManager.LayoutParams)linearLayoutManager);
        }
        n14 = R$id.product_gallery_close;
        linearLayoutManager = (ImageButton)bl2.findViewById(n14);
        oC0 = new OC0(f5);
        linearLayoutManager.setOnClickListener(oC0);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        ((FontsManager)object).getTypefaceWithFont((Context)object2, 10);
        object = FontsManager.getInstance();
        object2 = AJIOApplication$a.a();
        int n3 = 9;
        ((FontsManager)object).getTypefaceWithFont((Context)object2, n3);
        object = this.getArguments();
        if (object != null) {
            object = this.requireArguments();
            object2 = "RETURN_EXCHANGE_PINCODE";
            this.n = object = object.getString((String)object2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.exchange_fragement_layout_revamp;
        return layoutInflater.inflate(n3, null);
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.j.getSTEP();
        int n4 = 3;
        bundle.putInt((String)object, n4);
        Object object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        object = this.j;
        String string4 = "exchange size & reason selection screen";
        String string5 = "order management screen";
        Object object3 = bundle;
        ((NewCustomEventsRevamp)object).newPushCustomScreenView(string4, string5, string2, bundle, string3);
        object = this.getArguments();
        if (object != null && (object = object.getString(string4 = "IS_FROM_JOUNRNEY")) != null && (n3 = ((String)object).equals(string4 = "exchange")) == (n4 = 1) && (n3 = (int)(h40_0.l1() ? 1 : 0)) != 0) {
            object = this.getArguments();
            string4 = "product_id";
            string5 = null;
            if (object != null) {
                object = object.getString(string4);
            } else {
                n3 = 0;
                object = null;
            }
            bundle.putString(string4, (String)object);
            object = this.getArguments();
            string4 = "order_status";
            if (object != null) {
                object = object.getString(string4);
            } else {
                n3 = 0;
                object = null;
            }
            bundle.putString(string4, (String)object);
            object = this.getArguments();
            string4 = "order_id";
            if (object != null) {
                string5 = object.getString(string4);
            }
            bundle.putString(string4, string5);
            String string6 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
            String string7 = cv_0.a((AnalyticsManager$Companion)object2);
            int n7 = 1540;
            object = this.j;
            string4 = "";
            string5 = "";
            string2 = null;
            object3 = "screen_view";
            string3 = "exchange size & reason selection screen";
            object2 = "order management screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string5, null, (String)object3, string3, (String)object2, string6, bundle, string7, false, null, n7, null);
        } else {
            String string8 = bv_0.a((AnalyticsManager$Companion)object2);
            String string9 = cv_0.a((AnalyticsManager$Companion)object2);
            int n8 = 1540;
            object = this.j;
            string4 = "";
            string5 = "";
            string2 = null;
            object3 = "openScreen";
            string3 = "exchange size & reason selection screen";
            object2 = "order management screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string5, null, (String)object3, string3, (String)object2, string8, bundle, string9, false, null, n8, null);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block72: {
            block73: {
                block74: {
                    var3_3 = this;
                    var4_4 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "view");
                    super.onViewCreated(var1_1, var2_2);
                    var5_5 = this.Qa();
                    var6_6 = var5_5.productExchange.viewComposeGwp.composeGiftsView;
                    Intrinsics.checkNotNullExpressionValue(var6_6, "composeGiftsView");
                    ai0_2.i((View)var6_6);
                    var6_6 = var5_5.collapseToolBar;
                    var7_7 = R$style.collapsed_toolbar_title;
                    var6_6.setCollapsedTitleTextAppearance(var7_7);
                    var7_7 = R$style.expanded_toolbar_title;
                    var6_6.setExpandedTitleTextAppearance(var7_7);
                    var7_7 = mz3_0.d(16);
                    var8_8 = var6_6.getExpandedTitleMarginTop();
                    var9_9 = var6_6.getExpandedTitleMarginEnd();
                    var10_10 = var6_6.getExpandedTitleMarginBottom();
                    var6_6.setExpandedTitleMargin(var7_7, (int)var8_8, var9_9, var10_10);
                    var6_6 = var5_5.alfToolbar;
                    var7_7 = R$string.exchage_request_txt;
                    var11_11 = this.getString(var7_7);
                    var6_6.setTitle((CharSequence)var11_11);
                    var6_6 = var5_5.alfToolbar;
                    var7_7 = R$drawable.ic_cc_close;
                    var6_6.setNavigationIcon(var7_7);
                    var6_6 = this.Qa().alfToolbar;
                    var7_7 = R$string.close;
                    var11_11 = this.getString(var7_7);
                    var6_6.setNavigationContentDescription((CharSequence)var11_11);
                    var6_6 = var5_5.alfToolbar;
                    var11_11 = new NC0(this, 0);
                    var6_6.setNavigationOnClickListener((View.OnClickListener)var11_11);
                    var6_6 = ((e12_0)this.m.getValue()).Q0;
                    var11_11 = this.getViewLifecycleOwner();
                    var12_12 = new qc0_1(this, 0);
                    var13_13 = new RC0$c((qc0_1)var12_12);
                    var6_6.e((mu1_1)var11_11, var13_13);
                    var6_6 = var5_5.exchangeScroll;
                    var7_7 = 1;
                    var6_6.setNestedScrollingEnabled((boolean)var7_7);
                    var14_14 = R$id.pdp_size_layout;
                    var6_6 = (ConstraintLayout)var1_1.findViewById(var14_14);
                    this.r = var6_6;
                    var12_12 = this.requireActivity();
                    var9_9 = 0;
                    var13_13 = null;
                    var6_6 = new LinearLayoutManager((Context)var12_12, 0, false);
                    this.o = var6_6;
                    var12_12 = this.requireActivity();
                    var6_6 = new LinearLayoutManager((Context)var12_12, 0, false);
                    this.p = var6_6;
                    var6_6 = this.f;
                    var8_8 = false;
                    var12_12 = null;
                    if (var6_6 != null) {
                        var6_6 = var6_6.getIntent();
                    } else {
                        var14_14 = 0;
                        var6_6 = null;
                    }
                    var15_15 = new ArrayList<String>();
                    var16_16 = "Select Reason";
                    var15_15.add((String)var16_16);
                    if (var6_6 != null && (var16_16 = var6_6.getStringArrayListExtra("EXCHANGE_ITEMS_REASONS")) != null) {
                        var15_15.addAll((Collection<String>)var16_16);
                    }
                    var10_10 = 33;
                    if (var6_6 != null) {
                        var17_17 = Build.VERSION.SDK_INT;
                        if (var17_17 >= var10_10) {
                            var18_18 = KC0.a((Intent)var6_6);
                        } else {
                            var18_18 = var6_6.getSerializableExtra("EXCHANGE_ITEMS_SUBREASONS");
                            var19_19 = var18_18 instanceof Object;
                            if (var19_19 == 0) {
                                var17_17 = 0;
                                var18_18 = null;
                            }
                            var20_20 = var18_18;
                            var20_20 = var18_18;
                            var18_18 = (Serializable)var18_18;
                        }
                    } else {
                        var17_17 = 0;
                        var18_18 = null;
                    }
                    var18_18 = (List)var18_18;
                    var20_20 = var3_3.f;
                    if (var20_20 != null) {
                        if (var6_6 != null) {
                            var19_19 = Build.VERSION.SDK_INT;
                            if (var19_19 >= var10_10) {
                                var6_6 = id0_1.a((Intent)var6_6);
                            } else {
                                var16_16 = "RETURN_ITEMS_CONSIGNMENT_ENTRY";
                                var10_10 = (var6_6 = var6_6.getSerializableExtra((String)var16_16)) instanceof CartEntry;
                                if (var10_10 == 0) {
                                    var14_14 = 0;
                                    var6_6 = null;
                                }
                                var6_6 = (CartEntry)var6_6;
                            }
                            var6_6 = (CartEntry)var6_6;
                        } else {
                            var14_14 = 0;
                            var6_6 = null;
                        }
                        var3_3.h = var6_6;
                        if (var6_6 != null) {
                            var6_6 = var6_6.getProduct();
                            var3_3.i = var6_6;
                        }
                        var6_6 = var3_3.i;
                        Y63.i((Product)var6_6);
                    }
                    if ((var6_6 = var3_3.i) == null) break block72;
                    var6_6 = new gd0_0(false, null, var3_3);
                    var3_3.q = var6_6;
                    var6_6 = var3_3.i;
                    if (var6_6 != null) {
                        var6_6 = var6_6.getFeatureData();
                    } else {
                        var14_14 = 0;
                        var6_6 = null;
                    }
                    if (var6_6 != null) {
                        var6_6 = var6_6.iterator();
                        while ((var10_10 = (int)var6_6.hasNext()) != 0) {
                            var16_16 = (FeatureData)var6_6.next();
                            var20_20 = var16_16.getName();
                            var19_19 = (int)kotlin.text.b.i((String)var20_20, (String)(var21_21 = "Size Format"), (boolean)var7_7);
                            if (var19_19 == 0 || (var20_20 = var16_16.getFeatureValues()) == null) continue;
                            var20_20 = var16_16.getFeatureValues();
                            Intrinsics.checkNotNull(var20_20);
                            var19_19 = (var20_20 = (Collection)var20_20).isEmpty() ^ var7_7;
                            if (var19_19 == 0) continue;
                            var20_20 = var16_16.getFeatureValues();
                            Intrinsics.checkNotNull(var20_20);
                            if ((var20_20 = ((FeatureValue)var20_20.get(0)).getValue()) == null) continue;
                            var6_6 = var16_16.getFeatureValues();
                            Intrinsics.checkNotNull(var6_6);
                            var6_6 = ((FeatureValue)var6_6.get(0)).getValue();
                            Intrinsics.checkNotNull(var6_6);
                            break;
                        }
                    }
                    if ((var6_6 = var3_3.f) == null) break block73;
                    Intrinsics.checkNotNull(var6_6);
                    var14_14 = (int)var6_6.isFinishing();
                    if (var14_14 != 0) break block73;
                    var14_14 = R$id.goto_size_guide_button;
                    var6_6 = var4_4.findViewById(var14_14);
                    var16_16 = var3_3.i;
                    if (var16_16 == null || (var16_16 = var16_16.getFnlColorVariantData()) == null) ** GOTO lbl-1000
                    var16_16 = var3_3.i;
                    if (var16_16 != null && (var16_16 = var16_16.getFnlColorVariantData()) != null) {
                        var16_16 = var16_16.getSizeGuideServiceUrl();
                    } else {
                        var10_10 = 0;
                        var16_16 = null;
                    }
                    var19_19 = 32;
                    if (var16_16 == null) break block74;
                    var16_16 = var3_3.i;
                    if (var16_16 != null && (var16_16 = var16_16.getFnlColorVariantData()) != null) {
                        var16_16 = var16_16.getSizeGuideServiceUrl();
                    } else {
                        var10_10 = 0;
                        var16_16 = null;
                    }
                    Intrinsics.checkNotNull(var16_16);
                    var22_22 = var16_16.length() - var7_7;
                    var23_23 = false;
                    var24_24 /* !! */  = null;
                    var25_25 = false;
                    var26_26 = null;
                    while (var23_23 <= var22_22) {
                        var27_27 = var25_25 == false ? var23_23 : var22_22;
                        if ((var27_27 = Intrinsics.compare(var16_16.charAt((int)var27_27), var19_19)) <= false) {
                            var27_27 = true;
                        } else {
                            var27_27 = false;
                            var28_28 = null;
                        }
                        if (!var25_25) {
                            if (!var27_27) {
                                var25_25 = true;
                                continue;
                            }
                            var23_23 += 1;
                            continue;
                        }
                        if (!var27_27) break;
                        var22_22 += -1;
                    }
                    if ((var10_10 = (var16_16 = var16_16.subSequence((int)var23_23, (int)(var22_22 += var7_7)).toString()).length()) != 0) ** GOTO lbl-1000
                }
                if ((var16_16 = var3_3.i) != null && (var16_16 = var16_16.getFnlColorVariantData()) != null) {
                    var16_16 = var16_16.getSizeGuideUrl();
                } else {
                    var10_10 = 0;
                    var16_16 = null;
                }
                if (var16_16 != null) {
                    var16_16 = var3_3.i;
                    if (var16_16 != null && (var16_16 = var16_16.getFnlColorVariantData()) != null) {
                        var16_16 = var16_16.getSizeGuideUrl();
                    } else {
                        var10_10 = 0;
                        var16_16 = null;
                    }
                    Intrinsics.checkNotNull(var16_16);
                    var22_22 = var16_16.length() - var7_7;
                    var23_23 = false;
                    var24_24 /* !! */  = null;
                    var25_25 = false;
                    var26_26 = null;
                    while (var23_23 <= var22_22) {
                        var27_27 = var25_25 == false ? var23_23 : var22_22;
                        if ((var27_27 = Intrinsics.compare(var16_16.charAt((int)var27_27), var19_19)) <= false) {
                            var27_27 = true;
                        } else {
                            var27_27 = false;
                            var28_28 = null;
                        }
                        if (!var25_25) {
                            if (!var27_27) {
                                var25_25 = true;
                                continue;
                            }
                            var23_23 += 1;
                            continue;
                        }
                        if (!var27_27) break;
                        var22_22 += -1;
                    }
                    ** if ((var10_10 = (var16_16 = var16_16.subSequence((int)var23_23, (int)(var22_22 += var7_7)).toString()).length()) == 0) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    Intrinsics.checkNotNull(var6_6);
                    ai0_2.B((View)var6_6);
                    var6_6.setOnClickListener((View.OnClickListener)var3_3);
                    ** GOTO lbl224
                }
lbl-1000:
                // 3 sources

                {
                    Intrinsics.checkNotNull(var6_6);
                    ai0_2.i((View)var6_6);
                }
            }
            var6_6 = var3_3.i;
            var16_16 = var3_3.g;
            if (var6_6 != null) {
                var16_16.clear();
                var6_6 = var3_3.i;
                if (var6_6 != null) {
                    var6_6 = var6_6.getProductOptionVariants();
                } else {
                    var14_14 = 0;
                    var6_6 = null;
                }
                if (var6_6 != null) {
                    var6_6 = var3_3.i;
                    if (var6_6 != null && (var6_6 = var6_6.getProductOptionVariants()) != null) {
                        var14_14 = var6_6.size();
                        var6_6 = var14_14;
                    } else {
                        var14_14 = 0;
                        var6_6 = null;
                    }
                    Intrinsics.checkNotNull(var6_6);
                    var14_14 = var6_6.intValue();
                    if (var14_14 > 0) {
                        var6_6 = var3_3.i;
                        if (var6_6 != null) {
                            var6_6 = var6_6.getProductOptionVariants();
                        } else {
                            var14_14 = 0;
                            var6_6 = null;
                        }
                        Intrinsics.checkNotNull(var6_6);
                        var6_6 = var6_6.iterator();
                        while ((var19_19 = (int)var6_6.hasNext()) != 0) {
                            var20_20 = (ProductOptionVariant)var6_6.next();
                            var16_16.add(var20_20);
                        }
                    }
                }
            }
            var6_6 = var16_16.iterator();
            while ((var19_19 = (int)var6_6.hasNext()) != 0) {
                var20_20 = (ProductOptionVariant)var6_6.next();
                var20_20 = var3_3.h;
                Intrinsics.checkNotNull(var20_20);
                var20_20 = var20_20.getProduct().getSelectedProductSizeCode();
                var22_22 = TextUtils.isEmpty((CharSequence)var20_20);
                if (!var22_22) {
                    var3_3.Sa((String)var20_20);
                    continue;
                }
                var3_3.Ua((List)var16_16);
            }
            var14_14 = R$id.product_exchange;
            var26_26 = var4_4.findViewById(var14_14);
            var20_20 = var3_3.q;
            if (var20_20 != null) {
                var21_21 = var3_3.h;
                var24_24 /* !! */  = var3_3.i;
                Intrinsics.checkNotNull(var26_26);
                var4_4 = this.requireActivity();
                var28_28 = var4_4.getSupportFragmentManager();
                this.getActivity();
                var29_29 = null;
                var20_20.l((CartEntry)var21_21, var24_24 /* !! */ , var26_26, (FragmentManager)var28_28, null);
            }
            if ((var4_4 = var3_3.q) != null) {
                var6_6 = this.getArguments();
                if (var6_6 != null) {
                    var16_16 = "product_id";
                    var6_6 = var6_6.getString((String)var16_16);
                } else {
                    var14_14 = 0;
                    var6_6 = null;
                }
                var16_16 = this.getArguments();
                if (var16_16 != null) {
                    var20_20 = "order_status";
                    var16_16 = var16_16.getString((String)var20_20);
                } else {
                    var10_10 = 0;
                    var16_16 = null;
                }
                var20_20 = this.getArguments();
                if (var20_20 != null) {
                    var12_12 = var20_20.getString("order_id");
                }
                var4_4.p = var16_16;
                var4_4.o = var6_6;
                var4_4.q = var12_12;
            }
            var4_4 = var3_3.h;
            Intrinsics.checkNotNull(var4_4);
            var4_4 = var4_4.getQuantity();
            var30_30 = var4_4.intValue();
            var6_6 = "getQuantity(...)";
            var12_12 = "exchangeReturnQuantityLayoutLL";
            var16_16 = "tvSelectQuantity";
            if (var30_30 <= var7_7) {
                var4_4 = var5_5.tvSelectQuantity;
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var16_16);
                ai0_2.i((View)var4_4);
                var4_4 = var5_5.exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var12_12);
                ai0_2.i((View)var4_4);
                var4_4 = var3_3.q;
                if (var4_4 != null) {
                    var20_20 = var3_3.h;
                    Intrinsics.checkNotNull(var20_20);
                    var20_20 = var20_20.getQuantity();
                    Intrinsics.checkNotNullExpressionValue(var20_20, (String)var6_6);
                    var19_19 = var20_20.intValue();
                    var21_21 = var3_3.h;
                    Intrinsics.checkNotNull(var21_21);
                    var22_22 = var21_21.getIsExchangeItem();
                    var4_4.n(var19_19, var3_3, var22_22);
                }
            } else {
                var4_4 = var5_5.tvSelectQuantity;
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var16_16);
                ai0_2.B((View)var4_4);
                var4_4 = var5_5.exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var12_12);
                ai0_2.B((View)var4_4);
            }
            var4_4 = var3_3.i;
            Intrinsics.checkNotNull(var4_4);
            var20_20 = "product";
            Intrinsics.checkNotNullParameter(var4_4, (String)var20_20);
            var4_4 = var4_4.getVariantOptions();
            if (var4_4 != null) {
                var4_4 = var4_4.iterator();
                while ((var19_19 = (int)var4_4.hasNext()) != 0) {
                    var20_20 = ((ProductOptionItem)var4_4.next()).getStock();
                    if (var20_20 != null && (var20_20 = var20_20.getStockLevel()) != null) {
                        var19_19 = var20_20.intValue();
                    } else {
                        var19_19 = 0;
                        var20_20 = null;
                    }
                    if (var19_19 <= 0) continue;
                    break;
                }
            } else {
                var7_7 = 0;
                var11_11 = null;
            }
            if (var7_7 != 0) {
                var4_4 = var3_3.q;
                if (var4_4 != null) {
                    var11_11 = var5_5.exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                    Intrinsics.checkNotNullExpressionValue(var11_11, (String)var12_12);
                    var12_12 = var3_3.h;
                    Intrinsics.checkNotNull(var12_12);
                    var12_12 = var12_12.getQuantity();
                    Intrinsics.checkNotNullExpressionValue(var12_12, (String)var6_6);
                    var14_14 = var12_12.intValue();
                    var12_12 = var3_3.h;
                    Intrinsics.checkNotNull(var12_12);
                    var8_8 = var12_12.getIsExchangeItem();
                    var4_4.m((View)var11_11, var14_14, var3_3, var8_8);
                }
                if ((var16_16 = var3_3.q) != null) {
                    var20_20 = var3_3.h;
                    Intrinsics.checkNotNull(var20_20);
                    var21_21 = var3_3.f;
                    Intrinsics.checkNotNull(var21_21);
                    var24_24 /* !! */  = var5_5.exchangeReason.exchangeReasonCL;
                    Intrinsics.checkNotNullExpressionValue(var24_24 /* !! */ , "exchangeReasonCL");
                    var4_4 = var3_3.h;
                    Intrinsics.checkNotNull(var4_4);
                    var25_25 = var4_4.getIsExchangeItem();
                    var28_28 = var5_5.exchangeScroll;
                    Intrinsics.checkNotNullExpressionValue(var28_28, "exchangeScroll");
                    var29_29 = var3_3.t;
                    var4_4 = var3_3.u;
                    var16_16.e(var15_15, (List)var18_18, (CartEntry)var20_20, (FragmentActivity)var21_21, (View)var24_24 /* !! */ , var25_25, (NestedScrollView)var28_28, var29_29, (String)var4_4);
                }
            } else {
                var4_4 = var3_3.q;
                if (var4_4 != null) {
                    var4_4 = var5_5.sizeAlertView.sizeAlertViewCL;
                    Intrinsics.checkNotNullExpressionValue(var4_4, "sizeAlertViewCL");
                    var14_14 = R$string.all_exchanged_size_oos;
                    var6_6 = hv3_0.K(var14_14);
                    gd0_0.h((View)var4_4, (String)var6_6, 0);
                }
                var4_4 = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                var14_14 = 8;
                var4_4.setVisibility(var14_14);
                this.Qa().exchangeReason.exchangeReasonCL.setVisibility(var14_14);
                var4_4 = this.Qa().tvSelectQuantity;
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var16_16);
                ai0_2.i((View)var4_4);
            }
        }
        var5_5.exchangeScroll.scrollTo(0, 0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void p3(String var1_1, String var2_2, ProductOptionVariant var3_3) {
        block26: {
            var4_4 = this.Qa();
            var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
            if (var5_5 || (var5_5 = TextUtils.isEmpty((CharSequence)var1_1))) break block26;
            var6_6 = this.v;
            var7_7 = 8;
            var8_8 = "";
            var9_9 = "sizeAlertViewCL";
            if (var6_6 == null) ** GOTO lbl-1000
            Intrinsics.checkNotNull(var6_6);
            var5_5 = var6_6.isServicability();
            if (!var5_5) {
                var6_6 = this.q;
                Intrinsics.checkNotNull(var6_6);
                var10_10 = this.Qa().quantityAlertView.sizeAlertViewCL;
                Intrinsics.checkNotNullExpressionValue(var10_10, var9_9);
                var6_6.getClass();
                gd0_0.h((View)var10_10, var8_8, var7_7);
            } else lbl-1000:
            // 2 sources

            {
                Intrinsics.checkNotNull(var2_2);
                var5_5 = var2_2.length();
                var11_11 = 1;
                var5_5 -= var11_11;
                var12_12 = 0;
                var13_13 = null;
                var14_14 = false;
                var15_15 = null;
                while (var12_12 <= var5_5) {
                    var16_16 = var14_14 == false ? var12_12 : var5_5;
                    var16_16 = var2_2.charAt(var16_16);
                    var17_17 = 32;
                    var16_16 = Intrinsics.compare(var16_16, var17_17);
                    var16_16 = var16_16 <= 0;
                    if (!var14_14) {
                        if (!var16_16) {
                            var14_14 = true;
                            continue;
                        }
                        var12_12 += 1;
                        continue;
                    }
                    if (!var16_16) break;
                    var5_5 += -1;
                }
                var6_6 = com.jio.jioads.adinterfaces.a.a(var5_5, var11_11, var12_12, (String)var2_2);
                var13_13 = this.q;
                Intrinsics.checkNotNull(var13_13);
                var13_13 = var13_13.e;
                var5_5 = (int)kotlin.text.b.i((String)var6_6, (String)var13_13, (boolean)var11_11);
                if (var5_5) {
                    this.Qa().sizeAlertView.sizeAlertViewCL.setVisibility(0);
                    var6_6 = this.q;
                    if (var6_6 != null) {
                        var6_6 = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var6_6, var9_9);
                        var11_11 = R$string.alert_text_for_exchange_size;
                        var10_10 = hv3_0.K(var11_11);
                        gd0_0.h((View)var6_6, (String)var10_10, 0);
                    }
                } else {
                    var6_6 = this.q;
                    if (var6_6 != null) {
                        var6_6 = this.Qa().sizeAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var6_6, var9_9);
                        gd0_0.h((View)var6_6, var8_8, var7_7);
                    }
                }
                Intrinsics.checkNotNull(var3_3);
                var5_5 = var3_3.getStockLevel();
                var10_10 = this.h;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.getQuantity();
                var11_11 = var10_10.intValue();
                var13_13 = "exchangeReturnQuantityLayoutLL";
                if (var5_5 >= var11_11) {
                    var6_6 = this.q;
                    if (var6_6 != null) {
                        var10_10 = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                        Intrinsics.checkNotNullExpressionValue(var10_10, (String)var13_13);
                        var13_13 = this.h;
                        Intrinsics.checkNotNull(var13_13);
                        var13_13 = var13_13.getQuantity();
                        var15_15 = "getQuantity(...)";
                        Intrinsics.checkNotNullExpressionValue(var13_13, var15_15);
                        var12_12 = var13_13.intValue();
                        var6_6.m((View)var10_10, var12_12, this, false);
                    }
                    if ((var6_6 = this.q) != null) {
                        var6_6 = this.Qa().quantityAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var6_6, var9_9);
                        gd0_0.h((View)var6_6, var8_8, var7_7);
                    }
                } else {
                    var6_6 = this.q;
                    if (var6_6 != null) {
                        var18_18 = this.Qa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                        Intrinsics.checkNotNullExpressionValue(var18_18, (String)var13_13);
                        var11_11 = var3_3.getStockLevel();
                        var6_6.m((View)var18_18, var11_11, this, false);
                    }
                    if ((var6_6 = this.q) != null) {
                        var6_6 = this.Qa().quantityAlertView.sizeAlertViewCL;
                        Intrinsics.checkNotNullExpressionValue(var6_6, var9_9);
                        var7_7 = R$string.alert_text_for_exchange_quantity;
                        var18_18 = hv3_0.K(var7_7);
                        gd0_0.h((View)var6_6, (String)var18_18, 0);
                    }
                }
            }
            var6_6 = this.h;
            Intrinsics.checkNotNull(var6_6);
            var6_6 = var6_6.getProduct();
            var6_6.setSelectedSize((String)var2_2);
            var2_2 = this.h;
            Intrinsics.checkNotNull(var2_2);
            var2_2.getProduct().setSelectedProductSizeCode((String)var1_1);
            var2_2 = this.q;
            if (var2_2 != null) {
                Intrinsics.checkNotNull(var2_2);
                var6_6 = this.f;
                Intrinsics.checkNotNull(var6_6);
                var2_2.j((Activity)var6_6);
            }
            this.Sa((String)var1_1);
            var19_19 = hv3_0.Y();
            if (var19_19 != 0) {
                var1_1 = this.i;
                if (var1_1 != null && (var1_1 = var1_1.getFeatureData()) != null) {
                    var1_1 = var1_1.iterator();
                    while ((var20_20 = var1_1.hasNext()) != 0) {
                        var2_2 = (FeatureData)var1_1.next();
                        var6_6 = var2_2.getCode();
                        var7_7 = 0;
                        var18_18 = null;
                        if (var6_6 != null) {
                            var9_9 = "brickmodelchestsize";
                            var5_5 = (int)StringsKt.F((CharSequence)var6_6, var9_9, false);
                            var6_6 = (boolean)var5_5;
                        } else {
                            var5_5 = 0;
                            var6_6 = null;
                        }
                        Intrinsics.checkNotNull(var6_6);
                        var5_5 = var6_6.booleanValue();
                        if (var5_5) {
                            if ((var2_2 = var2_2.getFeatureValues()) == null || (var2_2 = (FeatureValue)var2_2.get(0)) == null || (var2_2 = var2_2.getValue()) == null) continue;
                            var6_6 = " Bust ";
                            var8_8 = nb0_0.a(var8_8, (String)var6_6, (String)var2_2);
                            continue;
                        }
                        var6_6 = var2_2.getCode();
                        if (var6_6 != null) {
                            var5_5 = (int)StringsKt.F((CharSequence)var6_6, "brickmodelwaistsize", false);
                            var18_18 = (boolean)var5_5;
                        }
                        Intrinsics.checkNotNull(var18_18);
                        var5_5 = (int)var18_18.booleanValue();
                        if (!var5_5 || (var2_2 = var2_2.getFeatureValues()) == null || (var2_2 = (FeatureValue)var2_2.get(0)) == null || (var2_2 = var2_2.getValue()) == null) continue;
                        var6_6 = " Waist ";
                        var8_8 = nb0_0.a(var8_8, (String)var6_6, (String)var2_2);
                    }
                }
                var1_1 = this.m;
                var2_2 = (e12_0)var1_1.getValue();
                Intrinsics.checkNotNull(var3_3);
                var6_6 = this.i;
                Intrinsics.checkNotNull(var6_6);
                var2_2.getClass();
                var2_2 = e12_0.g(var3_3, (Product)var6_6);
                if (var2_2 != null && (var20_20 = var2_2.length()) == 0) {
                    var1_1 = (e12_0)var1_1.getValue();
                    var2_2 = this.i;
                    Intrinsics.checkNotNull(var2_2);
                    var1_1.getClass();
                    var1_1 = e12_0.g(var3_3, (Product)var2_2);
                    var8_8 = Ft2.a(var8_8, (String)var1_1);
                }
                var19_19 = var8_8.length();
                var2_2 = "tvModelSize";
                if (var19_19 > 0) {
                    var4_4.tvModelSize.setText(var8_8);
                    var1_1 = var4_4.tvModelSize;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                    ai0_2.B((View)var1_1);
                } else {
                    var1_1 = var4_4.tvModelSize;
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                    ai0_2.i((View)var1_1);
                }
            }
        }
    }

    public final void r7(int n3) {
        CartEntry cartEntry = this.h;
        Intrinsics.checkNotNull(cartEntry);
        cartEntry.setExchangeEditedQuantity(n3);
    }
}

