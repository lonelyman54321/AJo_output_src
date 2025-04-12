/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.gson.Gson;
import com.jio.jioads.adinterfaces.JioAdView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.analytics.events.FacebookEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.managers.CustomScrollLinearLayoutManager;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.fragment.b;
import com.ril.ajio.payment.fragment.e;
import com.ril.ajio.payment.fragment.f$a;
import com.ril.ajio.payment.fragment.f$b;
import com.ril.ajio.payment.fragment.f$c;
import com.ril.ajio.payment.fragment.f$d;
import com.ril.ajio.payment.fragment.f$e;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.view.NpsView;
import com.ril.ajio.payment.view.NpsView$a;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartItem;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryFeedback;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import io.reactivex.Scheduler;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

public final class f
extends b61_0
implements ma2_1,
NpsView$a,
View.OnClickListener,
wg2_1,
Av,
xc1_2 {
    public static final f$a Companion;
    public Handler A;
    public ea2_0 B;
    public String C;
    public String D;
    public ji0_2 E;
    public ka2_0 F;
    public Component G;
    public ReviewManager H;
    public final hh3_2 I;
    public final hh3_2 J;
    public final hh3_2 K;
    public JioAdView L;
    public final NewEEcommerceEventsRevamp g;
    public final NewCustomEventsRevamp h;
    public final D i;
    public RecyclerView j;
    public NpsView k;
    public TextView l;
    public TextView m;
    public OrderConfirmationActivity n;
    public AjioLoaderView o;
    public ArrayList p;
    public int q;
    public String r;
    public e s;
    public boolean t;
    public int u;
    public la2_2 v;
    public Bundle w;
    public float x;
    public float y;
    public Integer z;

    static {
        f$a f$a;
        Companion = f$a = new Object();
    }

    public f() {
        int n3;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.g = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.h = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = Reflection.getOrCreateKotlinClass(db2_1.class);
        f$c f$c = new f$c(this);
        f$d f$d = new f$d(this);
        f$e f$e = new f$e(this);
        this.i = object = LW0.a(this, (yn1_2)object, f$c, f$d, f$e);
        this.q = n3 = -1;
        this.u = n3;
        this.z = object = Integer.valueOf(0);
        newEEcommerceEventsRevamp.getPrevScreen();
        newEEcommerceEventsRevamp.getPrevScreenType();
        int n4 = 1;
        object = new of1_2(this, n4);
        this.I = object = yr1_2.b((Function0)object);
        object = new aw_2(this, n4);
        this.J = object = yr1_2.b((Function0)object);
        object = new Object();
        this.K = object = yr1_2.b((Function0)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Sa(Banner object, int n3) {
        Object object2;
        Object object3 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object3, "EXTERNAL_AD");
        CharSequence charSequence = "getHost(...)";
        String string2 = null;
        String string3 = "";
        if (n4 != 0) {
            object3 = ((Banner)object).getBannerAdsMetaData();
            if (object3 != null) {
                string2 = ((BannerAdsMetaData)object3).getCtaFb();
            }
            if (string2 != null && (n4 = string2.length()) != 0) {
                object3 = new URL(string2);
                object3 = ((URL)object3).getHost();
                Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
            } else {
                object3 = string3;
            }
            charSequence = "TPBA";
        } else {
            object3 = ((Banner)object).getBannerType();
            n4 = Intrinsics.areEqual(object3, object2 = "AD");
            if (n4 != 0) {
                object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null) {
                    string2 = ((BannerAdsMetaData)object3).getCtaFb();
                }
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object3 = new URL(string2);
                    object3 = ((URL)object3).getHost();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                } else {
                    object3 = string3;
                }
                charSequence = "jioads_direct_demand";
            } else {
                object3 = ((Banner)object).getBannerUrl();
                if (object3 == null) {
                    object3 = string3;
                }
                int n7 = 100;
                object3 = le3_2.E(n7, (String)object3);
                charSequence = "paid";
            }
        }
        Object object4 = object3;
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        string2 = ((Banner)object).getBannerUrl();
        if (string2 != null) {
            string3 = string2;
        }
        object3.getClass();
        object3 = cp_1.k(string3);
        String string4 = n1.a((String)charSequence, " - ", (String)object3);
        object3 = ((Banner)object).getWidth();
        object = ((Banner)object).getHeight();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(object3);
        ((StringBuilder)charSequence).append("x");
        ((StringBuilder)charSequence).append(object);
        String string5 = ((StringBuilder)charSequence).toString();
        String string6 = hj0_0.a(n3, "0|");
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = bv_0.a((AnalyticsManager$Companion)object);
        ((NewEEcommerceEventsRevamp)object2).pushSelectContentEventForThirdPartyBanner(string7, string8, (String)object4, string4, string5, string6);
    }

    public final void I4(Banner object, int n3, String string2) {
        Intrinsics.checkNotNullParameter(object, "banner");
        Object object2 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object2, "AD");
        hh3_2 hh3_22 = this.I;
        String string3 = "Web view Screen";
        String string4 = "ajio";
        String string5 = null;
        if (n4 != 0) {
            xv$a_0 xv$a_0;
            if (string2 != null && (n4 = string2.length()) != 0 && (n4 = (int)(((h40_0)(object2 = h40_0.a)).p1(xv$a_0 = xv$a_0.ThankYou) ? 1 : 0)) != 0) {
                boolean bl2;
                com.ril.ajio.payment.fragment.f.Sa((Banner)object, n3);
                Object object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null && (object3 = ((BannerAdsMetaData)object3).getClickTracker()) != null) {
                    if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                        string5 = ((BannerAdsMetaData)object).getCcbValue();
                    }
                    Intrinsics.checkNotNullParameter(object3, "url");
                    long l2 = k7.p();
                    object = String.valueOf(l2);
                    object2 = "[trq]";
                    object = kotlin.text.b.n((String)object3, (String)object2, (String)object, false);
                    if (string5 == null) {
                        string5 = "";
                    }
                    object = kotlin.text.b.n((String)object, "[ccb]", string5, false);
                    object3 = (BannerAdViewModel)hh3_22.getValue();
                    ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
                }
                if (bl2 = StringsKt.F(string2, string4, false)) {
                    object = AnalyticsManager.Companion;
                    km_1.a((AnalyticsManager$Companion)object, string3);
                }
                object = kj0_1.g();
                object3 = this.getActivity();
                ((kj0_1)object).w((Activity)object3, string2);
            }
        } else {
            String string6;
            object2 = ((Banner)object).getBannerType();
            n4 = (int)(Intrinsics.areEqual(object2, string6 = "EXTERNAL_AD") ? 1 : 0);
            if (n4 != 0) {
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object2 = h40_0.a;
                    object2 = xv$a_0.ThankYou;
                    n4 = (int)(h40_0.r2((xv$a_0)((Object)object2)) ? 1 : 0);
                    if (n4 != 0) {
                        boolean bl3;
                        com.ril.ajio.payment.fragment.f.Sa((Banner)object, n3);
                        object = ((Banner)object).getBannerAdsMetaData();
                        if (object != null) {
                            string5 = ((BannerAdsMetaData)object).getClickTracker();
                        }
                        if (string5 != null) {
                            object = (BannerAdViewModel)hh3_22.getValue();
                            ((BannerAdViewModel)object).callBannerClickImpression(string5);
                        }
                        if (bl3 = StringsKt.F(string2, string4, false)) {
                            object = AnalyticsManager.Companion;
                            km_1.a((AnalyticsManager$Companion)object, string3);
                        }
                        object = kj0_1.g();
                        FragmentActivity fragmentActivity = this.getActivity();
                        ((kj0_1)object).w(fragmentActivity, string2);
                    }
                }
            } else if (string2 != null && (n4 = string2.length()) != 0) {
                object2 = h40_0.a;
                object2 = xv$a_0.ThankYou;
                n4 = (int)(h40_0.R0((xv$a_0)((Object)object2)) ? 1 : 0);
                if (n4 != 0) {
                    com.ril.ajio.payment.fragment.f.Sa((Banner)object, n3);
                    object = kj0_1.g();
                    FragmentActivity fragmentActivity = this.getActivity();
                    ((kj0_1)object).w(fragmentActivity, string2);
                }
            }
        }
    }

    public final db2_1 Pa() {
        return (db2_1)this.i.getValue();
    }

    public final void Qa(String string2) {
        Object object;
        int n3;
        int n4;
        f f5 = this;
        Object object2 = string2;
        Object object3 = za2_0.a;
        int n7 = this.q;
        Bundle bundle = new Bundle();
        Object object4 = za2_0.b;
        Object object5 = ((NewCustomEventsRevamp)object4).getRATING();
        String string3 = String.valueOf(n7);
        bundle.putString((String)object5, string3);
        if (string2 != null && (n4 = string2.length()) > (n3 = 50)) {
            object5 = ((NewCustomEventsRevamp)object4).getCOMMENTS();
            string3 = string2.substring(0, n3);
            object = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string3, (String)object);
            bundle.putString((String)object5, string3);
        } else {
            object5 = ((NewCustomEventsRevamp)object4).getCOMMENTS();
            bundle.putString((String)object5, (String)object2);
        }
        object5 = ((NewCustomEventsRevamp)object4).getEC_ORDER_CONFIRMATION();
        object = String.valueOf(n7);
        String string4 = za2_0.c;
        String string5 = za2_0.d;
        int n8 = 1536;
        CharSequence charSequence = "feedback_rating";
        CharSequence charSequence2 = "order confirmation screen";
        String string6 = "thank you screen";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, "feedback", (String)object, (String)charSequence, (String)charSequence2, string6, string4, bundle, string5, false, null, n8, null);
        n7 = f5.q;
        object4 = null;
        object5 = "orderConfirmationActivity";
        string3 = "order confirmation screen";
        object = "NPS_";
        if (n7 >= 0) {
            object3 = f5.o;
            if (object3 != null) {
                ((AjioLoaderView)((Object)object3)).startLoader();
            }
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            int n10 = f5.q;
            charSequence2 = new StringBuilder((String)object);
            ((StringBuilder)charSequence2).append(n10);
            object = ((StringBuilder)charSequence2).toString();
            charSequence = "NPS_SUBMIT";
            ((GTMEvents)object3).pushButtonTapEvent((String)charSequence, object, string3);
            object3 = f5.r;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            if (n7 != 0) {
                boolean bl2;
                object2 = f5.n;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl2 = false;
                    object2 = null;
                }
                if (!(bl2 = object2.isFinishing())) {
                    object2 = f5.n;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object4 = object2;
                    }
                    ((OrderConfirmationActivity)object4).onBackPressed();
                }
            } else {
                object3 = this.Pa();
                n4 = f5.q;
                float f6 = n4;
                string3 = f5.r;
                if (string3 == null) {
                    string3 = "";
                }
                object3.getClass();
                Intrinsics.checkNotNullParameter(string3, "orderId");
                object = new QueryFeedback();
                ((QueryFeedback)object).setComments((String)object2);
                object2 = String.valueOf(f6);
                ((QueryFeedback)object).setRating((String)object2);
                ((QueryFeedback)object).setOrderID(string3);
                object2 = md3_0.c((jD3)object3);
                object5 = new hb2_2((db2_1)object3, (QueryFeedback)object, null);
                n7 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)object5, n7);
            }
        } else {
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            n7 = f5.q;
            charSequence = new StringBuilder((String)object);
            ((StringBuilder)charSequence).append(n7);
            object3 = ((StringBuilder)charSequence).toString();
            object = "NPS_CONTINUE";
            ((GTMEvents)object2).pushButtonTapEvent((String)object, object3, string3);
            object2 = f5.n;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object4 = object2;
            }
            ((OrderConfirmationActivity)object4).onBackPressed();
        }
    }

    public final void R3() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = za2_0.a;
        NewCustomEventsRevamp newCustomEventsRevamp = za2_0.b;
        String string2 = newCustomEventsRevamp.getEC_ORDER_CONFIRMATION();
        String string3 = za2_0.c;
        String string4 = za2_0.d;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "user interactions", "referral card clicked", "order_confirm_interaction", "order confirmation screen", "thank you screen", string3, null, string4, false, null, 1536, null);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent("referral card clicked", "referral widget", "order confirmation screen");
        newEEcommerceEventsRevamp = new Bundle();
        newEEcommerceEventsRevamp.putBoolean("gotoReferral", true);
        float f5 = this.x;
        newEEcommerceEventsRevamp.putFloat("REFEREE_EARN_AMOUNT", f5);
        f5 = this.y;
        newEEcommerceEventsRevamp.putFloat("REFERRER_EARN_AMOUNT", f5);
        at2_1.f(this.getContext(), (Bundle)newEEcommerceEventsRevamp);
    }

    public final void Ra(CartOrder object) {
        boolean bl2;
        Object object2 = ((CartOrder)object).getEntries();
        Object object3 = new StringBuilder();
        Object object4 = new StringBuilder();
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            int n3;
            Object object5;
            Object object6;
            Object object7;
            boolean bl3;
            Object object8;
            int n4;
            Object object9 = new ArrayList();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            object2 = object2.iterator();
            while ((n4 = object2.hasNext()) != 0) {
                object8 = (CartItem)object2.next();
                bl3 = object8 instanceof CartEntry;
                if (!bl3 || (object7 = ((CartEntry)(object8 = (CartEntry)object8)).getProduct()) == null) continue;
                object7 = ((CartEntry)object8).getProduct().getBrandName();
                bl3 = TextUtils.isEmpty((CharSequence)object7);
                object6 = ",";
                if (!bl3) {
                    object7 = ((CartEntry)object8).getProduct().getBrandName();
                    ((StringBuilder)object3).append((String)object7);
                    ((StringBuilder)object3).append((String)object6);
                }
                if ((object7 = ((CartEntry)object8).getProduct().getCatalog()) == null) {
                    object7 = ((CartEntry)object8).getProduct().getCatalogName();
                }
                if (!(bl3 = TextUtils.isEmpty((CharSequence)object7))) {
                    object7 = ((CartEntry)object8).getProduct().getCatalog();
                    if (object7 == null) {
                        object7 = ((CartEntry)object8).getProduct().getCatalogName();
                    }
                    ((StringBuilder)object4).append((String)object7);
                    ((StringBuilder)object4).append((String)object6);
                }
                object7 = ((CartEntry)object8).getProduct().getBaseProduct();
                ((ArrayList)object9).add(object7);
                object6 = ((CartEntry)object8).getProduct().getBaseProduct();
                object8 = ((CartEntry)object8).getQuantity();
                object5 = "getQuantity(...)";
                Intrinsics.checkNotNullExpressionValue(object8, (String)object5);
                n4 = ((Number)object8).intValue();
                object7 = new FbEventContentData((String)object6, n4);
                arrayList.add(object7);
            }
            object2 = ((StringBuilder)object3).toString();
            object8 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object8);
            int n7 = ((String)object2).length();
            bl3 = false;
            object7 = null;
            object6 = "";
            if (n7 > 0) {
                n7 = ((StringBuilder)object3).length() + -1;
                object2 = ((StringBuilder)object3).substring(0, n7);
            } else {
                object2 = object6;
            }
            object3 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullExpressionValue(object3, (String)object8);
            int n8 = ((String)object3).length();
            if (n8 > 0) {
                n8 = ((StringBuilder)object4).length() + -1;
                object3 = ((StringBuilder)object4).substring(0, n8);
            } else {
                object3 = object6;
            }
            object4 = ((CartOrder)object).getCreditsUsedAmount();
            object4 = object4 == null ? ((CartOrder)object).getTotalPrice() : ((CartOrder)object).getBalanceAmount();
            n4 = 0;
            object8 = null;
            object5 = object4 != null ? ((Price)object4).getValue() : null;
            this.C = object5;
            object5 = object4 != null ? ((Price)object4).getValue() : null;
            if (object5 != null) {
                object5 = this.n;
                if (object5 == null) {
                    object5 = "orderConfirmationActivity";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                } else {
                    object8 = object5;
                }
                n4 = (int)(object8.isFinishing() ? 1 : 0);
                if (n4 == 0) {
                    object8 = AnalyticsManager.Companion;
                    object5 = ((AnalyticsManager$Companion)object8).getInstance().getFb();
                    Object object10 = new AnalyticsData$Builder();
                    object9 = object9.toString();
                    object9 = ((AnalyticsData$Builder)object10).productCode((String)object9);
                    object10 = ((Price)object4).getValue();
                    if (object10 == null) {
                        object10 = object6;
                    }
                    object9 = ((AnalyticsData$Builder)object9).price((String)object10);
                    object2 = ((AnalyticsData$Builder)object9).setBrand((String)object2).setCatalogId((String)object3);
                    object3 = ((CartOrder)object).getPaymentCode();
                    object2 = ((AnalyticsData$Builder)object2).paymentMode((String)object3).fbContentData(arrayList).build();
                    ((FacebookEvents)object5).logPurchase((AnalyticsData)object2);
                    object2 = ((CartOrder)object).getAppliedVouchers();
                    object2 = object2 != null && (n7 = (object2 = ((CartOrder)object).getAppliedVouchers()).size()) > 0 ? ((CartAppliedVoucher)((CartOrder)object).getAppliedVouchers().get(0)).getVoucherCode() : object6;
                    object3 = new Bundle();
                    object4 = ((Price)object4).getValue();
                    object3.putString("Amount", (String)object4);
                    object9 = ((CartOrder)object).getPaymentCode();
                    object3.putString("Payment Mode", (String)object9);
                    object4 = ((CartOrder)object).getTotalItems();
                    Intrinsics.checkNotNullExpressionValue(object4, "getTotalItems(...)");
                    n3 = ((Number)object4).intValue();
                    object3.putInt("No of items", n3);
                    object9 = ((CartOrder)object).getCode();
                    object3.putString("Order ID", (String)object9);
                    object3.putString("Coupon Code", (String)object2);
                    object2 = ((AnalyticsManager$Companion)object8).getInstance().getGa();
                    object4 = new AnalyticsData$Builder();
                    object3 = ((AnalyticsData$Builder)object4).bundle((Bundle)object3).build();
                    ((GoogleAnalyticsEvents)object2).productPurchase((AnalyticsData)object3);
                }
            }
            if ((object2 = this.E) != null) {
                object3 = AnalyticsManager.Companion.getInstance().getFb();
                object4 = new AnalyticsData$Builder();
                object9 = ((ji0_2)object2).b;
                if (object9 != null) {
                    object6 = object9;
                }
                object4 = ((AnalyticsData$Builder)object4).productCode((String)object6);
                object = ((CartOrder)object).getPaymentCode();
                object = ((AnalyticsData$Builder)object4).paymentMode((String)object);
                n3 = ((ji0_2)object2).c;
                object4 = n3;
                object = ((AnalyticsData$Builder)object).setNumItems((Integer)object4);
                object4 = ((ji0_2)object2).a;
                object = ((AnalyticsData$Builder)object).setLuxeDetails((LuxeDetails)object4);
                object2 = ((ji0_2)object2).d;
                object = ((AnalyticsData$Builder)object).price((String)object2).build();
                ((FacebookEvents)object3).initiateCheckoutEvent((AnalyticsData)object);
            }
        }
    }

    public final void W7(JioAdView jioAdView) {
        this.L = jioAdView;
    }

    public final void f4() {
        Object object = this.C;
        if (object != null) {
            float f5 = Float.parseFloat((String)object);
            Object object2 = this.a;
            ((jo_2)object2).o(f5);
            object = this.getActivity();
            if (object != null) {
                int n3;
                object2 = AnalyticsUtil.Companion;
                Object object3 = z40_0.Companion;
                object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                Object object4 = "enable_my_rewards_status";
                object3 = ((ao0_0)object3).b((String)object4);
                object2 = ((AnalyticsUtil$Companion)object2).mapperToMyRewardsOption((String)object3);
                object3 = UrlHelper.Companion.getInstance().getBaseUrl();
                if (object2 != null) {
                    object4 = ((MyRewardsOption)object2).getUrlEndPoint();
                } else {
                    n3 = 0;
                    object4 = null;
                }
                object3 = Ft2.a((String)object3, (String)object4);
                object4 = MyRewardsWebActivity.Companion;
                if (object2 == null || (object2 = ((MyRewardsOption)object2).getTitle()) == null) {
                    object2 = "My Rewards";
                }
                object4.getClass();
                n3 = 14;
                MyRewardsWebActivity$a.a(n3, (Activity)object, (String)object3, (String)object2);
            }
        }
    }

    public final void f6(CartOrder cartOrder) {
        boolean bl2;
        f f5 = this;
        Object object = cartOrder;
        Intrinsics.checkNotNullParameter(cartOrder, "cartOrder");
        Object object2 = za2_0.b;
        Object object3 = ((NewCustomEventsRevamp)object2).getEC_ORDER_CONFIRMATION();
        String string2 = za2_0.c;
        String string3 = za2_0.d;
        int n3 = 1536;
        String string4 = "user interactions";
        String string5 = "view address clicked";
        String string6 = "order_confirm_interaction";
        String string7 = "order confirmation screen";
        String string8 = "thank you screen";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object3, string4, string5, string6, string7, string8, string2, null, string3, false, null, n3, null);
        Object object4 = this.getActivity();
        if (object4 != null && !(bl2 = object4.isFinishing())) {
            object2 = cartOrder.getDeliveryAddress();
            if (object2 != null) {
                object2 = cartOrder.getDeliveryAddress();
                object3 = this.n;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationActivity");
                    object3 = null;
                }
                object3 = ((OrderConfirmationActivity)object3).r0;
                ((CartDeliveryAddress)object2).setEstimateDeliveryDate((String)object3);
            }
            ((io2_1)f5.J.getValue()).a.k(object);
            object = new so0_2();
            object4 = ((FragmentActivity)object4).getSupportFragmentManager();
            object2 = "DeliveryAddressBottomSheetFragment";
            ((DialogFragment)object).show((FragmentManager)object4, (String)object2);
        }
    }

    public final void h8() {
        boolean bl2;
        Object object = this.k;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("npsRatingView");
            boolean n3 = false;
            object = null;
        }
        object.setVisibility(0);
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "in_app_rating_dialog";
        boolean bl3 = ((ao0_0)object).a(string2);
        if (bl3) {
            object = z40$a.a((Context)AJIOApplication$a.a()).a;
            int n3 = ((ao0_0)object).g("in_app_rating_dialog_delay") * 1000;
            Object object3 = Looper.getMainLooper();
            string2 = new Handler(object3);
            this.A = string2;
            object3 = new ea2_0(this);
            this.B = object3;
            long l2 = n3;
            string2.postDelayed((Runnable)object3, l2);
        }
        if (bl2 = og1_1.b()) {
            object = this.m;
            if (object == null) {
                object = "tvSubmitLuxe";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object2.setVisibility(0);
        } else {
            object = this.l;
            if (object == null) {
                object = "tvSubmit";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object2.setVisibility(0);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        n4 = 1779;
        if (n3 == n4) {
            this.isAdded();
        }
    }

    public final void onAnimationEnd() {
        boolean bl2;
        boolean bl3;
        Object object = this.j;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            bl3 = false;
            object = null;
        }
        if (bl2 = (object = ((RecyclerView)object).getLayoutManager()) instanceof CustomScrollLinearLayoutManager) {
            object2 = object;
            object2 = (CustomScrollLinearLayoutManager)object;
        }
        if (object2 != null) {
            bl3 = true;
            ((CustomScrollLinearLayoutManager)object2).setScrollEnabled(bl3);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OrderConfirmationActivity;
        if (bl2) {
            object = (OrderConfirmationActivity)object;
            this.n = object;
            this.a.B();
            return;
        }
        object = pn_2.b(object, " is not instance of OrderConfirmationActivity");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.btn_submitrating;
        Object object2 = null;
        if (n3 == n4) {
            object = this.k;
            if (object == null) {
                object = "npsRatingView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object = ((NpsView)object2).getComments();
            this.Qa((String)object);
        } else {
            int n7;
            n3 = object.getId();
            if (n3 == (n4 = R$id.tvSubmit) || (n7 = object.getId()) == (n3 = R$id.tvSubmitLuxe)) {
                object = this.n;
                if (object == null) {
                    object = "orderConfirmationActivity";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = object;
                }
                ((OrderConfirmationActivity)object2).onBackPressed();
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.Pa();
        object.getClass();
        object = md3_0.c((jD3)object);
        ab2_2 ab2_22 = new qg3_2(2, null);
        Ae3.d((i90_0)object, null, null, ab2_22, 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_order_confirmation_preview;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        Handler handler;
        Object object = this.B;
        if (object != null && (handler = this.A) != null) {
            handler.removeCallbacks((Runnable)object);
        }
        super.onDestroyView();
        object = this.L;
        if (object != null) {
            ((JioAdView)object).onDestroy();
        }
        this.a.o(0.0f);
        object = this.k;
        handler = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("npsRatingView");
            object = null;
        }
        ((NpsView)object).setOnRatingClickListener(null);
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        String string2 = "permissions";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(nArray, "grantResults");
        object = new ArrayList();
        int n4 = 1771;
        if (n3 == n4) {
            object = Looper.getMainLooper();
            Handler handler = new Handler(object);
            object = new ga2_0(this);
            long l2 = 500L;
            handler.postDelayed((Runnable)object, l2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void onResume() {
        Object object;
        super.onResume();
        Object object2 = this.w;
        String string2 = "order confirmation screen";
        if (object2 != null) {
            object = h40_0.a;
            boolean n3 = ((h40_0)object).f1();
            if (n3) {
                void var4_7;
                object = this.z;
                if (object != null) {
                    int n4 = (Integer)object;
                } else {
                    boolean bl2 = false;
                    object = null;
                }
                if (var4_7 > 0) {
                    object = "offer_count";
                    Integer n7 = this.z;
                    object2.putSerializable((String)object, (Serializable)n7);
                }
            }
            object = AnalyticsManager.Companion;
            vb0_0.a((AnalyticsManager$Companion)object, string2, object2);
        } else {
            object2 = AnalyticsManager.Companion;
            km_1.a((AnalyticsManager$Companion)object2, string2);
        }
        boolean bl3 = this.t;
        if (bl3) {
            object2 = this.n;
            string2 = null;
            object = "orderConfirmationActivity";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl3 = false;
                object2 = null;
            }
            if (!(bl3 = object2.isFinishing())) {
                object2 = this.n;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    string2 = object2;
                }
                ((OrderConfirmationActivity)((Object)string2)).onBackPressed();
            }
        }
    }

    public final void onStop() {
        this.g.setPreviousScreenData("order confirmation screen", "thank you screen");
        super.onStop();
        AnalyticsGAEventHandler analyticsGAEventHandler = AnalyticsGAEventHandler.Companion.getInstance();
        Message message = new Message();
        message.what = 1004;
        analyticsGAEventHandler.sendMessage(message);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block176: {
            block175: {
                block174: {
                    block155: {
                        block154: {
                            block168: {
                                block173: {
                                    block172: {
                                        block171: {
                                            block167: {
                                                block170: {
                                                    block146: {
                                                        block145: {
                                                            block144: {
                                                                block166: {
                                                                    block165: {
                                                                        block162: {
                                                                            block163: {
                                                                                block164: {
                                                                                    block161: {
                                                                                        block156: {
                                                                                            block160: {
                                                                                                block158: {
                                                                                                    block159: {
                                                                                                        block157: {
                                                                                                            block152: {
                                                                                                                block151: {
                                                                                                                    block147: {
                                                                                                                        block153: {
                                                                                                                            block148: {
                                                                                                                                block149: {
                                                                                                                                    block150: {
                                                                                                                                        var3_3 = this;
                                                                                                                                        var4_4 = var1_1;
                                                                                                                                        var5_8 = "cartOrder";
                                                                                                                                        var6_9 = "";
                                                                                                                                        var7_10 = 0.0f;
                                                                                                                                        var8_11 = null;
                                                                                                                                        var9_12 = 3;
                                                                                                                                        var10_13 = 0;
                                                                                                                                        var11_14 = null;
                                                                                                                                        var12_15 = 2;
                                                                                                                                        var13_16 = 2.8E-45f;
                                                                                                                                        var14_17 = 1;
                                                                                                                                        var15_18 = 1.4E-45f;
                                                                                                                                        Intrinsics.checkNotNullParameter(var1_1, "rootView");
                                                                                                                                        super.onViewCreated(var1_1, var2_2);
                                                                                                                                        com.ril.ajio.payment.fragment.g.Companion.getClass();
                                                                                                                                        com.ril.ajio.payment.fragment.g.w = var14_17;
                                                                                                                                        var17_20 = this.Pa();
                                                                                                                                        var18_21 = this.a;
                                                                                                                                        var16_19 = new ka2_0((jo_2)var18_21, (db2_1)var17_20);
                                                                                                                                        this.F = var16_19;
                                                                                                                                        var19_22 = R$id.parent_layout;
                                                                                                                                        var16_19 = (RelativeLayout)var1_1.findViewById(var19_22);
                                                                                                                                        if (var16_19 != null) {
                                                                                                                                            var20_23 = R$string.acc_page_header_order_confirmation;
                                                                                                                                            var17_20 = hv3_0.K(var20_23);
                                                                                                                                            var16_19.setContentDescription((CharSequence)var17_20);
                                                                                                                                        }
                                                                                                                                        var21_24 = Looper.getMainLooper();
                                                                                                                                        var17_20 = new Handler((Looper)var21_24);
                                                                                                                                        var21_24 = new d10(var16_19, var14_17);
                                                                                                                                        var22_25 = 500L;
                                                                                                                                        var17_20.postDelayed((Runnable)var21_24, var22_25);
                                                                                                                                        var19_22 = R$id.ajio_loader_view;
                                                                                                                                        var16_19 = (AjioLoaderView)var4_4.findViewById(var19_22);
                                                                                                                                        var3_3.o = var16_19;
                                                                                                                                        var19_22 = R$id.order_conf_rv;
                                                                                                                                        var16_19 = (RecyclerView)var4_4.findViewById(var19_22);
                                                                                                                                        var3_3.j = var16_19;
                                                                                                                                        var17_20 = this.getContext();
                                                                                                                                        var16_19 = new CustomScrollLinearLayoutManager((Context)var17_20);
                                                                                                                                        var16_19.setScrollEnabled(false);
                                                                                                                                        var17_20 = var3_3.j;
                                                                                                                                        var24_26 = "recyclerView";
                                                                                                                                        if (var17_20 == null) {
                                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var24_26);
                                                                                                                                            var20_23 = 0;
                                                                                                                                            var17_20 = null;
                                                                                                                                        }
                                                                                                                                        var17_20.setLayoutManager((RecyclerView$o)var16_19);
                                                                                                                                        var19_22 = R$id.npsview_bottomsheet;
                                                                                                                                        var3_3.k = var16_19 = (NpsView)var4_4.findViewById(var19_22);
                                                                                                                                        if (var16_19 == null) {
                                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException("npsRatingView");
                                                                                                                                            var19_22 = 0;
                                                                                                                                            var16_19 = null;
                                                                                                                                        }
                                                                                                                                        var16_19.setOnRatingClickListener(var3_3);
                                                                                                                                        var19_22 = R$id.btn_submitrating;
                                                                                                                                        var16_19 = (AjioButton)var4_4.findViewById(var19_22);
                                                                                                                                        if (var16_19 == null) {
                                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException("submitBt");
                                                                                                                                            var19_22 = 0;
                                                                                                                                            var16_19 = null;
                                                                                                                                        }
                                                                                                                                        var16_19.setOnClickListener((View.OnClickListener)var3_3);
                                                                                                                                        var19_22 = R$id.tvSubmit;
                                                                                                                                        var16_19 = (TextView)var4_4.findViewById(var19_22);
                                                                                                                                        var3_3.l = var16_19;
                                                                                                                                        if (var16_19 == null) {
                                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException("tvSubmit");
                                                                                                                                            var19_22 = 0;
                                                                                                                                            var16_19 = null;
                                                                                                                                        }
                                                                                                                                        var16_19.setOnClickListener((View.OnClickListener)var3_3);
                                                                                                                                        var19_22 = R$id.tvSubmitLuxe;
                                                                                                                                        var4_4 = (TextView)var4_4.findViewById(var19_22);
                                                                                                                                        var3_3.m = var4_4;
                                                                                                                                        if (var4_4 == null) {
                                                                                                                                            Intrinsics.throwUninitializedPropertyAccessException("tvSubmitLuxe");
                                                                                                                                            var25_27 = 0;
                                                                                                                                            var4_4 = null;
                                                                                                                                            var26_28 = 0.0f;
                                                                                                                                        }
                                                                                                                                        var4_4.setOnClickListener((View.OnClickListener)var3_3);
                                                                                                                                        var4_4 = ReviewManagerFactory.create((Context)this.requireActivity());
                                                                                                                                        var3_3.H = var4_4;
                                                                                                                                        var4_4 = this.Pa().r;
                                                                                                                                        var16_19 = this.getViewLifecycleOwner();
                                                                                                                                        var17_20 = new sf1_2(var3_3, var12_15);
                                                                                                                                        var21_24 = new f$b((Function1)var17_20);
                                                                                                                                        var4_4.e((mu1_1)var16_19, (F62)var21_24);
                                                                                                                                        var4_4 = this.Pa().t;
                                                                                                                                        var16_19 = this.getViewLifecycleOwner();
                                                                                                                                        var17_20 = new i5_0(var3_3, var14_17);
                                                                                                                                        var21_24 = new f$b((Function1)var17_20);
                                                                                                                                        var4_4.e((mu1_1)var16_19, (F62)var21_24);
                                                                                                                                        var4_4 = ((BannerAdViewModel)var3_3.I.getValue()).getAdditionalBannerLD();
                                                                                                                                        var16_19 = this.getViewLifecycleOwner();
                                                                                                                                        var17_20 = new uf1_2(var3_3, var9_12);
                                                                                                                                        var21_24 = new f$b((Function1)var17_20);
                                                                                                                                        var4_4.e((mu1_1)var16_19, (F62)var21_24);
                                                                                                                                        var18_21.p(0);
                                                                                                                                        ap_0.c = null;
                                                                                                                                        var16_19 = ap_0.b;
                                                                                                                                        var16_19.removePreference("cart_id");
                                                                                                                                        ap_0.a.removeCartGuId();
                                                                                                                                        var21_24 = this.getArguments();
                                                                                                                                        cp_1.Companion.getClass();
                                                                                                                                        var4_4 = new Object();
                                                                                                                                        var4_4.c();
                                                                                                                                        var25_27 = var4_4.d();
                                                                                                                                        var27_29 = 33;
                                                                                                                                        var17_20 = "ORDER_COD_FEE_DATA";
                                                                                                                                        if (var25_27 == var14_17) {
                                                                                                                                            var4_4 = var3_3.w;
                                                                                                                                            if (var4_4 == null) {
                                                                                                                                                var4_4 = new Bundle();
                                                                                                                                                var3_3.w = var4_4;
                                                                                                                                            }
                                                                                                                                            if ((var4_4 = var3_3.w) != null && var21_24 != null && (var25_27 = (int)var21_24.containsKey((String)var17_20)) == var14_17) {
                                                                                                                                                var25_27 = Build.VERSION.SDK_INT;
                                                                                                                                                if (var25_27 >= var27_29) {
                                                                                                                                                    var4_4 = aa2_0.a((Bundle)var21_24);
                                                                                                                                                } else {
                                                                                                                                                    var4_4 = var21_24.getSerializable((String)var17_20);
                                                                                                                                                    var19_22 = var4_4 instanceof ConvenienceFeePriceSplitUp;
                                                                                                                                                    if (var19_22 == 0) {
                                                                                                                                                        var25_27 = 0;
                                                                                                                                                        var4_4 = null;
                                                                                                                                                        var26_28 = 0.0f;
                                                                                                                                                    }
                                                                                                                                                    var4_4 = (ConvenienceFeePriceSplitUp)var4_4;
                                                                                                                                                }
                                                                                                                                                var4_4 = (ConvenienceFeePriceSplitUp)var4_4;
                                                                                                                                                if (var4_4 != null && (var16_19 = var3_3.w) != null) {
                                                                                                                                                    var4_4 = mz3_0.f((ConvenienceFeePriceSplitUp)var4_4);
                                                                                                                                                    var16_19.putAll((Bundle)var4_4);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var28_30 = 0.0;
                                                                                                                                        var16_19 = var3_3.h;
                                                                                                                                        if (var21_24 == null) break block147;
                                                                                                                                        var4_4 = "FB_EVENT_DATA";
                                                                                                                                        var30_31 = var21_24.containsKey((String)var4_4);
                                                                                                                                        if (var30_31) {
                                                                                                                                            var4_4 = var21_24.getSerializable((String)var4_4);
                                                                                                                                            var18_21 = "null cannot be cast to non-null type com.ril.ajio.payment.data.FBEventData";
                                                                                                                                            Intrinsics.checkNotNull(var4_4, (String)var18_21);
                                                                                                                                            var3_3.E = var4_4 = (ji0_2)var4_4;
                                                                                                                                        }
                                                                                                                                        var4_4 = var21_24.getString("cart_order");
                                                                                                                                        var18_21 = "IS_COD_BLOCKED";
                                                                                                                                        var30_31 = var21_24.containsKey((String)var18_21);
                                                                                                                                        if (var30_31) {
                                                                                                                                            var21_24.getString((String)var18_21);
                                                                                                                                        }
                                                                                                                                        if (var30_31 = var21_24.containsKey((String)(var18_21 = "PAYMENT_TYPE"))) {
                                                                                                                                            var3_3.D = var18_21 = var21_24.getString((String)var18_21);
                                                                                                                                        }
                                                                                                                                        if ((var27_29 = (int)TextUtils.isEmpty((CharSequence)var4_4)) != 0) break block148;
                                                                                                                                        var18_21 = var4_4 = JsonUtils.fromJson((String)var4_4, CartOrder.class);
                                                                                                                                        var18_21 = (CartOrder)var4_4;
                                                                                                                                        if (var18_21 == null) break block149;
                                                                                                                                        var4_4 = var18_21.getEntries();
                                                                                                                                        var31_32 = var18_21.getEntries();
                                                                                                                                        if (var31_32 == null) break block150;
                                                                                                                                        var32_33 = new ArrayList();
                                                                                                                                        var33_34 = var31_32.iterator();
                                                                                                                                        while (var30_31 = var33_34.hasNext()) {
                                                                                                                                            var35_36 = var34_35 = var33_34.next();
                                                                                                                                            var35_36 = (CartEntry)var34_35;
                                                                                                                                            var36_37 = var35_36.isGiftProduct();
                                                                                                                                            var12_15 = (int)Intrinsics.areEqual(var36_37, var11_14 = Boolean.FALSE);
                                                                                                                                            if (var12_15 != 0) {
                                                                                                                                                var32_33.add(var34_35);
                                                                                                                                            }
                                                                                                                                            var12_15 = 2;
                                                                                                                                            var13_16 = 2.8E-45f;
                                                                                                                                            var10_13 = 0;
                                                                                                                                            var11_14 = null;
                                                                                                                                            var9_12 = 3;
                                                                                                                                        }
                                                                                                                                        var32_33 = var32_33.iterator();
                                                                                                                                        var37_38 = 0;
                                                                                                                                        var38_39 = 0.0f;
                                                                                                                                        var33_34 = null;
                                                                                                                                        break block151;
                                                                                                                                    }
                                                                                                                                    var39_40 = 0;
                                                                                                                                    var32_33 = null;
                                                                                                                                    var40_41 = 0.0f;
                                                                                                                                    break block152;
                                                                                                                                }
                                                                                                                                var62_62 = var16_19;
                                                                                                                                var41_42 = var17_20;
                                                                                                                                var16_19 = var18_21;
                                                                                                                                var43_44 = var6_9;
                                                                                                                                var20_23 = 0;
                                                                                                                                var17_20 = null;
                                                                                                                                var8_11 = var21_24;
                                                                                                                                break block153;
                                                                                                                            }
                                                                                                                            var62_62 = var16_19;
                                                                                                                            var41_42 = var17_20;
                                                                                                                            var43_44 = var6_9;
                                                                                                                            var20_23 = 0;
                                                                                                                            var17_20 = null;
                                                                                                                            var8_11 = var21_24;
                                                                                                                            var27_29 = 0;
                                                                                                                            var18_21 = null;
                                                                                                                        }
                                                                                                                        var48_48 = var43_44;
                                                                                                                        break block154;
                                                                                                                    }
                                                                                                                    var62_62 = var16_19;
                                                                                                                    var41_42 = var17_20;
                                                                                                                    var43_44 = var6_9;
                                                                                                                    var20_23 = 0;
                                                                                                                    var17_20 = null;
                                                                                                                    var8_11 = var21_24;
                                                                                                                    var27_29 = 0;
                                                                                                                    var18_21 = null;
                                                                                                                    var16_19 = var6_9;
                                                                                                                    break block155;
                                                                                                                }
                                                                                                                while ((var12_15 = (int)var32_33.hasNext()) != 0) {
                                                                                                                    var36_37 = (CartEntry)var32_33.next();
                                                                                                                    if (var36_37 != null && (var36_37 = var36_37.getGiftProductsCount()) != null) {
                                                                                                                        var12_15 = var36_37.intValue();
                                                                                                                    } else {
                                                                                                                        var12_15 = 0;
                                                                                                                        var13_16 = 0.0f;
                                                                                                                        var36_37 = null;
                                                                                                                    }
                                                                                                                    var37_38 += var12_15;
                                                                                                                }
                                                                                                                var32_33 = var37_38;
                                                                                                            }
                                                                                                            var3_3.z = var32_33;
                                                                                                            var32_33 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry";
                                                                                                            var33_34 = "orderConfirmationActivity";
                                                                                                            if (var4_4 != null) {
                                                                                                                var36_37 = var3_3.n;
                                                                                                                if (var36_37 == null) {
                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                    var12_15 = 0;
                                                                                                                    var36_37 = null;
                                                                                                                    var13_16 = 0.0f;
                                                                                                                }
                                                                                                                if ((var12_15 = (int)var36_37.isFinishing()) == 0) {
                                                                                                                    var12_15 = var4_4.size();
                                                                                                                    var11_14 = null;
                                                                                                                    for (var10_13 = 0; var10_13 < var12_15; var10_13 += var14_17) {
                                                                                                                        var34_35 = var4_4.get(var10_13);
                                                                                                                        Intrinsics.checkNotNull(var34_35, (String)var32_33);
                                                                                                                        var34_35 = ((CartEntry)var34_35).getProduct();
                                                                                                                        Y63.g(var34_35);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            if (var4_4 != null) {
                                                                                                                var36_37 = var3_3.n;
                                                                                                                if (var36_37 == null) {
                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                    var12_15 = 0;
                                                                                                                    var36_37 = null;
                                                                                                                    var13_16 = 0.0f;
                                                                                                                }
                                                                                                                if ((var12_15 = (int)var36_37.isFinishing()) == 0) {
                                                                                                                    var36_37 = var3_3.n;
                                                                                                                    if (var36_37 == null) {
                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                        var12_15 = 0;
                                                                                                                        var36_37 = null;
                                                                                                                        var13_16 = 0.0f;
                                                                                                                    }
                                                                                                                    if ((var36_37 = var36_37.p0) != null) {
                                                                                                                        var12_15 = var4_4.size();
                                                                                                                        var11_14 = null;
                                                                                                                        for (var10_13 = 0; var10_13 < var12_15; var10_13 += var14_17) {
                                                                                                                            var34_35 = var4_4.get(var10_13);
                                                                                                                            Intrinsics.checkNotNull(var34_35, (String)var32_33);
                                                                                                                            var34_35 = (CartEntry)var34_35;
                                                                                                                            var41_42 = var3_3.n;
                                                                                                                            if (var41_42 == null) {
                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                                var42_43 /* !! */  = 0;
                                                                                                                                var41_42 = null;
                                                                                                                            }
                                                                                                                            if ((var41_42 = var41_42.p0) != null && (var41_42 = var34_35.getProduct()) != null) {
                                                                                                                                var41_42 = var3_3.n;
                                                                                                                                if (var41_42 == null) {
                                                                                                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                                    var42_43 /* !! */  = 0;
                                                                                                                                    var41_42 = null;
                                                                                                                                }
                                                                                                                                if ((var41_42 = var41_42.p0) != null) {
                                                                                                                                    var43_44 = var34_35.getProduct();
                                                                                                                                    var8_11 = var43_44.getCode();
                                                                                                                                    var41_42 = (String)var41_42.get(var8_11);
                                                                                                                                } else {
                                                                                                                                    var42_43 /* !! */  = 0;
                                                                                                                                    var41_42 = null;
                                                                                                                                }
                                                                                                                                if (var41_42 != null) {
                                                                                                                                    var41_42 = var3_3.n;
                                                                                                                                    if (var41_42 == null) {
                                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                                        var42_43 /* !! */  = 0;
                                                                                                                                        var41_42 = null;
                                                                                                                                    }
                                                                                                                                    if ((var41_42 = var41_42.p0) != null) {
                                                                                                                                        var8_11 = var34_35.getProduct().getCode();
                                                                                                                                        var41_42 = (String)var41_42.get(var8_11);
                                                                                                                                    } else {
                                                                                                                                        var42_43 /* !! */  = 0;
                                                                                                                                        var41_42 = null;
                                                                                                                                    }
                                                                                                                                    var34_35.setEddDate((String)var41_42);
                                                                                                                                    var41_42 = var3_3.n;
                                                                                                                                    if (var41_42 == null) {
                                                                                                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                                        var42_43 /* !! */  = 0;
                                                                                                                                        var41_42 = null;
                                                                                                                                    }
                                                                                                                                    if ((var41_42 = var41_42.q0) != null) {
                                                                                                                                        var8_11 = var34_35.getProduct().getCode();
                                                                                                                                        var41_42 = (String)var41_42.get(var8_11);
                                                                                                                                    } else {
                                                                                                                                        var42_43 /* !! */  = 0;
                                                                                                                                        var41_42 = null;
                                                                                                                                    }
                                                                                                                                    var34_35.setPriorityDeliveryDate((String)var41_42);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var7_10 = 0.0f;
                                                                                                                            var8_11 = null;
                                                                                                                        }
                                                                                                                        var4_4 = var18_21.getDeliveryAddress();
                                                                                                                        if (var4_4 != null) {
                                                                                                                            var4_4 = var18_21.getDeliveryAddress();
                                                                                                                            var32_33 = var3_3.n;
                                                                                                                            if (var32_33 == null) {
                                                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var33_34);
                                                                                                                                var39_40 = 0;
                                                                                                                                var40_41 = 0.0f;
                                                                                                                                var32_33 = null;
                                                                                                                            }
                                                                                                                            var32_33 = var32_33.r0;
                                                                                                                            var4_4.setEstimateDeliveryDate((String)var32_33);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            var3_3.p = var4_4 = new ArrayList();
                                                                                                            var4_4 = new Bundle();
                                                                                                            var3_3.w = var4_4;
                                                                                                            var4_4 = this.getArguments();
                                                                                                            var42_43 /* !! */  = 0;
                                                                                                            var41_42 = null;
                                                                                                            if (var4_4 != null) {
                                                                                                                var32_33 = "ajio_cash_point";
                                                                                                                var26_28 = var4_4.getFloat((String)var32_33);
                                                                                                            } else {
                                                                                                                var25_27 = 0;
                                                                                                                var26_28 = 0.0f;
                                                                                                                var4_4 = null;
                                                                                                            }
                                                                                                            var32_33 = var18_21.getAjioCashEarnedAmt();
                                                                                                            var38_39 = var18_21.getLoyaltyEarnedPoints();
                                                                                                            var36_37 = var32_33.getValue();
                                                                                                            if (var36_37 != null) {
                                                                                                                var36_37 = var32_33.getValue();
                                                                                                                Intrinsics.checkNotNull(var36_37);
                                                                                                                var13_16 = var36_37.floatValue();
                                                                                                                cfr_temp_0 = var13_16 - 0.0f;
                                                                                                                var12_15 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                                                                                if (var12_15 > 0) {
                                                                                                                    var4_4 = var32_33.getValue();
                                                                                                                    Intrinsics.checkNotNull(var4_4);
                                                                                                                    var26_28 = var4_4.floatValue();
                                                                                                                }
                                                                                                            }
                                                                                                            if ((var32_33 = var18_21.getTaaraEarnedAmount()) == null) {
                                                                                                                var32_33 = ax0_1.a;
                                                                                                                var36_37 = var18_21.getRelianceOneEarnedAmount();
                                                                                                                var32_33.getClass();
                                                                                                                var40_41 = ax0_1.a((Price)var36_37);
                                                                                                            } else {
                                                                                                                var39_40 = 0;
                                                                                                                var40_41 = 0.0f;
                                                                                                                var32_33 = null;
                                                                                                            }
                                                                                                            var44_45 = var18_21.getRedeemedMahaCachBack();
                                                                                                            var8_11 = ax0_1.a;
                                                                                                            var34_35 = var18_21.getTaaraEarnedAmount();
                                                                                                            var8_11.getClass();
                                                                                                            var7_10 = ax0_1.a((Price)var34_35);
                                                                                                            cfr_temp_1 = var26_28 - 0.0f;
                                                                                                            var9_12 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                                                                                            if (var9_12 <= 0 && (var46_46 = (cfr_temp_2 = var38_39 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1)) <= 0 && (var46_46 = (int)((cfr_temp_3 = var40_41 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) <= 0 && (var46_46 = (int)((cfr_temp_4 = var7_10 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) <= 0) {
                                                                                                                var46_46 = 0;
                                                                                                                var43_44 = null;
                                                                                                            } else {
                                                                                                                var46_46 = 1;
                                                                                                            }
                                                                                                            if (var9_12 > 0) {
                                                                                                                var34_35 = var3_3.w;
                                                                                                                if (var34_35 != null) {
                                                                                                                    var47_47 = var16_19.getSV_EP_AJIO_WALLET();
                                                                                                                    var41_42 = var16_19.getCD_NOTIFIED();
                                                                                                                    var34_35.putString((String)var47_47, (String)var41_42);
                                                                                                                }
                                                                                                                if ((var47_47 = var3_3.w) != null) {
                                                                                                                    var41_42 = var16_19.getCM_EP_AJIO_WALLET();
                                                                                                                    var34_35 = String.valueOf(var26_28);
                                                                                                                    var47_47.putString((String)var41_42, (String)var34_35);
                                                                                                                }
                                                                                                            }
                                                                                                            var14_17 = 0;
                                                                                                            var15_18 = 0.0f;
                                                                                                            var47_47 = null;
                                                                                                            cfr_temp_5 = var40_41 - 0.0f;
                                                                                                            var42_43 /* !! */  = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                                                                                                            if (var42_43 /* !! */  > 0) {
                                                                                                                var47_47 = var3_3.w;
                                                                                                                if (var47_47 != null) {
                                                                                                                    var41_42 = var16_19.getSV_EP_RONE();
                                                                                                                    var34_35 = var16_19.getCD_NOTIFIED();
                                                                                                                    var47_47.putString((String)var41_42, (String)var34_35);
                                                                                                                }
                                                                                                                if ((var47_47 = var3_3.w) != null) {
                                                                                                                    var41_42 = var16_19.getCM_EP_RONE();
                                                                                                                    var34_35 = String.valueOf(var40_41);
                                                                                                                    var47_47.putString((String)var41_42, (String)var34_35);
                                                                                                                }
                                                                                                            }
                                                                                                            var14_17 = 0;
                                                                                                            var15_18 = 0.0f;
                                                                                                            var47_47 = null;
                                                                                                            cfr_temp_6 = var7_10 - 0.0f;
                                                                                                            var42_43 /* !! */  = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                                                                                                            if (var42_43 /* !! */  > 0) {
                                                                                                                var47_47 = var3_3.w;
                                                                                                                if (var47_47 != null) {
                                                                                                                    var41_42 = var16_19.getCD_TAARA();
                                                                                                                    var34_35 = var16_19.getCD_NOTIFIED();
                                                                                                                    var47_47.putString((String)var41_42, (String)var34_35);
                                                                                                                }
                                                                                                                if ((var47_47 = var3_3.w) != null) {
                                                                                                                    var41_42 = var16_19.getCM_EP_TAARA();
                                                                                                                    var34_35 = String.valueOf(var7_10);
                                                                                                                    var47_47.putString((String)var41_42, (String)var34_35);
                                                                                                                }
                                                                                                            }
                                                                                                            if ((var14_17 = (int)(var44_45 == var28_30 ? 0 : (var44_45 > var28_30 ? 1 : -1))) > 0 && (var47_47 = var3_3.w) != null) {
                                                                                                                var41_42 = var16_19.getCM_EP_MAHACASHBACK();
                                                                                                                var36_37 = String.valueOf(var44_45);
                                                                                                                var47_47.putString((String)var41_42, (String)var36_37);
                                                                                                            }
                                                                                                            var47_47 = "store-pickup";
                                                                                                            var36_37 = var18_21.getDeliveryModeValue();
                                                                                                            var14_17 = (int)Intrinsics.areEqual(var47_47, var36_37);
                                                                                                            var36_37 = var3_3.p;
                                                                                                            if (var36_37 == null) break block156;
                                                                                                            var48_48 = var16_19;
                                                                                                            var19_22 = 4;
                                                                                                            var42_43 /* !! */  = 0;
                                                                                                            var41_42 = null;
                                                                                                            var9_12 = 0;
                                                                                                            var34_35 = null;
                                                                                                            var11_14 = new pa2_1(0, var26_28, null, var19_22);
                                                                                                            var36_37.add(0, var11_14);
                                                                                                            var16_19 = var3_3.G;
                                                                                                            if (var16_19 != null) {
                                                                                                                var42_43 /* !! */  = 9;
                                                                                                                var49_49 = var17_20;
                                                                                                                var9_12 = 0;
                                                                                                                var34_35 = null;
                                                                                                                var11_14 = new pa2_1(var42_43 /* !! */ , 0.0f, (Component)var16_19, 2);
                                                                                                                var19_22 = 1;
                                                                                                                var36_37.add(var19_22, var11_14);
                                                                                                                var20_23 = 1;
                                                                                                            } else {
                                                                                                                var49_49 = var17_20;
                                                                                                                var19_22 = 1;
                                                                                                                var20_23 = 0;
                                                                                                                var17_20 = null;
                                                                                                            }
                                                                                                            var10_13 = (int)og1_1.c();
                                                                                                            if (var10_13 != 0) ** GOTO lbl-1000
                                                                                                            var11_14 = h40_0.a;
                                                                                                            var10_13 = (int)h40_0.y1();
                                                                                                            if (var10_13 != 0 && var46_46 != 0) {
                                                                                                                var10_13 = var20_23 + 1;
                                                                                                                var50_50 = var18_21;
                                                                                                                var27_29 = 4;
                                                                                                                var9_12 = 0;
                                                                                                                var34_35 = null;
                                                                                                                var41_42 = new Object(var19_22, var26_28, null, var27_29);
                                                                                                                var36_37.add(var10_13, var41_42);
                                                                                                                var19_22 = 2;
                                                                                                                var10_13 = 0;
                                                                                                                var11_14 = null;
                                                                                                                var42_43 /* !! */  = 6;
                                                                                                                var16_19 = new pa2_1(var42_43 /* !! */ , 0.0f, null, var27_29);
                                                                                                                var36_37.add(var20_23 += var19_22, var16_19);
                                                                                                                var16_19 = za2_0.a;
                                                                                                                var16_19 = var3_3.w;
                                                                                                                var38_39 = var38_39 + var26_28 + var40_41 + var7_10;
                                                                                                                var51_51 = za2_0.b;
                                                                                                                var52_52 = var51_51.getEC_ORDER_CONFIRMATION();
                                                                                                                var53_53 = String.valueOf(var38_39);
                                                                                                                var54_54 = ma2_0.a((Bundle)var16_19);
                                                                                                                var55_55 = za2_0.c;
                                                                                                                var56_56 = za2_0.d;
                                                                                                                var57_57 = "view earn points impression";
                                                                                                                var58_58 = "order_confirm_interaction";
                                                                                                                var59_59 = "order confirmation screen";
                                                                                                                var60_60 = "thank you screen";
                                                                                                                var61_61 = 1536;
                                                                                                                NewCustomEventsRevamp.newPushCustomEvent$default(var51_51, var52_52, var57_57, var53_53, var58_58, var59_59, var60_60, var55_55, var54_54, var56_56, false, null, var61_61, null);
                                                                                                            } else lbl-1000:
                                                                                                            // 2 sources

                                                                                                            {
                                                                                                                var50_50 = var18_21;
                                                                                                            }
                                                                                                            var19_22 = 1;
                                                                                                            var27_29 = var20_23 + 1;
                                                                                                            var39_40 = 0;
                                                                                                            var40_41 = 0.0f;
                                                                                                            var32_33 = null;
                                                                                                            var37_38 = 0;
                                                                                                            var38_39 = 0.0f;
                                                                                                            var33_34 = null;
                                                                                                            var10_13 = 4;
                                                                                                            var16_19 = new pa2_1(var10_13, 0.0f, null, var10_13);
                                                                                                            var36_37.add(var27_29, var16_19);
                                                                                                            var19_22 = (int)og1_1.b();
                                                                                                            if (var19_22 != 0 || (var19_22 = (int)pa_1.a()) == 0) ** GOTO lbl-1000
                                                                                                            cp_1.Companion.getClass();
                                                                                                            var16_19 = cp$a.q();
                                                                                                            var32_33 = "spc_order_flag";
                                                                                                            var19_22 = (int)var16_19.has((String)var32_33);
                                                                                                            if (var19_22 != 0 && (var19_22 = (int)(var16_19 = cp$a.q()).getBoolean((String)var32_33)) != 0 && (var19_22 = (int)pa_1.a) != 0) {
                                                                                                                var27_29 = var20_23 + 2;
                                                                                                                var39_40 = 0;
                                                                                                                var40_41 = 0.0f;
                                                                                                                var32_33 = null;
                                                                                                                var37_38 = 6;
                                                                                                                var38_39 = 8.4E-45f;
                                                                                                                var10_13 = 0;
                                                                                                                var11_14 = null;
                                                                                                                var42_43 /* !! */  = 4;
                                                                                                                var16_19 = new pa2_1(var37_38, 0.0f, null, var42_43 /* !! */ );
                                                                                                                var36_37.add(var27_29, var16_19);
                                                                                                                var19_22 = 3;
                                                                                                                var27_29 = var20_23 + 3;
                                                                                                                var20_23 = 8;
                                                                                                                var16_19 = new pa2_1(var20_23, 0.0f, null, var42_43 /* !! */ );
                                                                                                                var36_37.add(var27_29, var16_19);
                                                                                                            } else lbl-1000:
                                                                                                            // 2 sources

                                                                                                            {
                                                                                                                var39_40 = 0;
                                                                                                                var40_41 = 0.0f;
                                                                                                                var32_33 = null;
                                                                                                                var10_13 = 0;
                                                                                                                var11_14 = null;
                                                                                                                var42_43 /* !! */  = 4;
                                                                                                            }
                                                                                                            var19_22 = 1;
                                                                                                            var20_23 = var27_29 + 1;
                                                                                                            var37_38 = 6;
                                                                                                            var38_39 = 8.4E-45f;
                                                                                                            var16_19 = new pa2_1(var37_38, 0.0f, null, var42_43 /* !! */ );
                                                                                                            var36_37.add(var20_23, var16_19);
                                                                                                            var20_23 = var27_29 + 2;
                                                                                                            var33_34 = new pa2_1(2, 0.0f, null, var42_43 /* !! */ );
                                                                                                            var36_37.add(var20_23, var33_34);
                                                                                                            var16_19 = h40_0.a;
                                                                                                            var19_22 = (int)h40_0.y1();
                                                                                                            if (var19_22 != 0 && (var19_22 = (int)og1_1.c()) == 0) break block157;
                                                                                                            var19_22 = 3;
                                                                                                            var20_23 = var27_29 + 3;
                                                                                                            var39_40 = 0;
                                                                                                            var40_41 = 0.0f;
                                                                                                            var32_33 = null;
                                                                                                            var37_38 = 6;
                                                                                                            var38_39 = 8.4E-45f;
                                                                                                            var10_13 = 0;
                                                                                                            var11_14 = null;
                                                                                                            var42_43 /* !! */  = 4;
                                                                                                            var16_19 = new pa2_1(var37_38, 0.0f, null, var42_43 /* !! */ );
                                                                                                            var36_37.add(var20_23, var16_19);
                                                                                                            if (var46_46 == 0) break block158;
                                                                                                            break block159;
                                                                                                        }
                                                                                                        var27_29 = 1;
                                                                                                        var10_13 = 0;
                                                                                                        var11_14 = null;
                                                                                                        var42_43 /* !! */  = 4;
                                                                                                        break block160;
                                                                                                    }
                                                                                                    var20_23 = var27_29 + 4;
                                                                                                    var27_29 = 1;
                                                                                                    var16_19 = new pa2_1(var27_29, var26_28, null, var42_43 /* !! */ );
                                                                                                    var36_37.add(var20_23, var16_19);
                                                                                                    break block160;
                                                                                                }
                                                                                                var27_29 = 1;
                                                                                            }
                                                                                            var25_27 = (int)ma2_0.c();
                                                                                            if (var25_27 != 0) {
                                                                                                var25_27 = var20_23 + 1;
                                                                                                var27_29 = 0;
                                                                                                var18_21 = null;
                                                                                                var39_40 = 6;
                                                                                                var40_41 = 8.4E-45f;
                                                                                                var16_19 = new pa2_1(var39_40, 0.0f, null, var42_43 /* !! */ );
                                                                                                var36_37.add(var25_27, var16_19);
                                                                                                var19_22 = 7;
                                                                                                var4_4 = new pa2_1(var19_22, 0.0f, null, var42_43 /* !! */ );
                                                                                                var36_37.add(var20_23 += 2, var4_4);
                                                                                                var3_3.u = var20_23;
                                                                                                var25_27 = (int)ma2_0.c();
                                                                                                if (var25_27 != 0) {
                                                                                                    var4_4 = this.Pa();
                                                                                                    var16_19 = var4_4.z;
                                                                                                    if (var16_19 == null) {
                                                                                                        Intrinsics.throwUninitializedPropertyAccessException("referralRepo");
                                                                                                        var19_22 = 0;
                                                                                                        var16_19 = null;
                                                                                                    }
                                                                                                    var18_21 = var4_4.s;
                                                                                                    var16_19 = var16_19.c((zr1_1)var18_21);
                                                                                                    var18_21 = qt2_2.c;
                                                                                                    var16_19 = var16_19.h((Scheduler)var18_21);
                                                                                                    var18_21 = ti_2.a();
                                                                                                    var16_19 = var16_19.e((Scheduler)var18_21);
                                                                                                    var18_21 = new Object();
                                                                                                    var10_13 = 0;
                                                                                                    var11_14 = null;
                                                                                                    var32_33 = new va2_0(0, (Function1)var18_21);
                                                                                                    var18_21 = new wa2_1(0);
                                                                                                    var33_34 = new xa2_1(0, (Function1)var18_21);
                                                                                                    var16_19 = var16_19.f((o60_0)var32_33, (o60_0)var33_34);
                                                                                                    var4_4 = var4_4.b;
                                                                                                    var4_4.b((yr0_2)var16_19);
                                                                                                } else {
                                                                                                    var10_13 = 0;
                                                                                                    var11_14 = null;
                                                                                                }
                                                                                                var4_4 = Unit.a;
                                                                                                var51_51 = za2_0.b;
                                                                                                var52_52 = var51_51.getEC_WIDGET_INTERACTION();
                                                                                                var55_55 = za2_0.c;
                                                                                                var56_56 = za2_0.d;
                                                                                                var57_57 = "widget view";
                                                                                                var53_53 = "referral widget";
                                                                                                var58_58 = "widget_view";
                                                                                                var59_59 = "order confirmation screen";
                                                                                                var60_60 = "order management screen";
                                                                                                var54_54 = null;
                                                                                                var61_61 = 1536;
                                                                                                NewCustomEventsRevamp.newPushCustomEvent$default(var51_51, var52_52, var57_57, var53_53, var58_58, var59_59, var60_60, var55_55, null, var56_56, false, null, var61_61, null);
                                                                                            } else {
                                                                                                var10_13 = 0;
                                                                                                var11_14 = null;
                                                                                            }
                                                                                            var42_43 /* !! */  = 1;
                                                                                            var25_27 = var20_23 + 1;
                                                                                            var27_29 = 6;
                                                                                            var39_40 = 0;
                                                                                            var40_41 = 0.0f;
                                                                                            var32_33 = null;
                                                                                            var37_38 = 4;
                                                                                            var38_39 = 5.6E-45f;
                                                                                            var7_10 = 0.0f;
                                                                                            var8_11 = null;
                                                                                            var16_19 = new pa2_1(var27_29, 0.0f, null, var37_38);
                                                                                            var36_37.add(var25_27, var16_19);
                                                                                            var9_12 = 2;
                                                                                            if (var14_17 != 0) {
                                                                                                var19_22 = 3;
                                                                                                var4_4 = new pa2_1(var19_22, 0.0f, null, var37_38);
                                                                                                var36_37.add(var20_23 += var9_12, var4_4);
                                                                                            }
                                                                                            var35_36 = this.getActivity();
                                                                                            var62_62 = var48_48;
                                                                                            var16_19 = var4_4;
                                                                                            var47_47 = var49_49;
                                                                                            var17_20 = var36_37;
                                                                                            var36_37 = var50_50;
                                                                                            var37_38 = 33;
                                                                                            var38_39 = 4.6E-44f;
                                                                                            var18_21 = var50_50;
                                                                                            var32_33 = var21_24;
                                                                                            var63_63 = var46_46;
                                                                                            var8_11 = var21_24;
                                                                                            var43_44 = var6_9;
                                                                                            var32_33 = this;
                                                                                            var33_34 = this;
                                                                                            var41_42 = var49_49;
                                                                                            var64_64 = 1;
                                                                                            var47_47 = this;
                                                                                            var65_65 = 2;
                                                                                            var36_37 = var35_36;
                                                                                            var9_12 = 0;
                                                                                            var34_35 = null;
                                                                                            var11_14 = this;
                                                                                            var3_3.v = var4_4 = new la2_2((ArrayList)var17_20, (CartOrder)var50_50, (boolean)var46_46, this, this, this, (FragmentActivity)var35_36, this);
                                                                                            var4_4 = var3_3.j;
                                                                                            if (var4_4 == null) {
                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var24_26);
                                                                                                var25_27 = 0;
                                                                                                var26_28 = 0.0f;
                                                                                                var4_4 = null;
                                                                                            }
                                                                                            var16_19 = var3_3.v;
                                                                                            var4_4.setAdapter((RecyclerView$f)var16_19);
                                                                                            break block161;
                                                                                        }
                                                                                        var62_62 = var16_19;
                                                                                        var41_42 = var17_20;
                                                                                        var50_50 = var18_21;
                                                                                        var8_11 = var21_24;
                                                                                        var43_44 = var6_9;
                                                                                        var64_64 = 1;
                                                                                        var9_12 = 0;
                                                                                        var34_35 = null;
                                                                                        var65_65 = 2;
                                                                                    }
                                                                                    cp_1.Companion.getClass();
                                                                                    cp$a.e().getClass();
                                                                                    cp_1.P((CartAndOrder)var50_50);
                                                                                    var4_4 = ma2_0.a;
                                                                                    var16_19 = var50_50;
                                                                                    Intrinsics.checkNotNullParameter(var50_50, (String)var5_8);
                                                                                    var4_4 = var50_50.getTotalDiscounts();
                                                                                    var17_20 = "0.0";
                                                                                    if (var4_4 == null || (var4_4 = var50_50.getTotalDiscounts().getValue()) == null) ** GOTO lbl-1000
                                                                                    var4_4 = var50_50.getTotalDiscounts();
                                                                                    if (var4_4 != null) {
                                                                                        var4_4 = var4_4.getValue();
                                                                                    } else {
                                                                                        var25_27 = 0;
                                                                                        var26_28 = 0.0f;
                                                                                        var4_4 = null;
                                                                                    }
                                                                                    var25_27 = (int)Intrinsics.areEqual(var4_4, var17_20);
                                                                                    if (var25_27 == 0 && (var4_4 = var16_19.getTotalDiscounts().getValue()) != null) {
                                                                                        var15_18 = Float.parseFloat((String)var4_4);
                                                                                    } else lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        var14_17 = 0;
                                                                                        var15_18 = 0.0f;
                                                                                        var47_47 = null;
                                                                                    }
                                                                                    var4_4 = var16_19.getVoucherAmount();
                                                                                    if (var4_4 != null && (var4_4 = var16_19.getVoucherAmount().getValue()) != null && (var25_27 = (int)Intrinsics.areEqual(var4_4 = var16_19.getVoucherAmount().getValue(), var17_20)) == 0) {
                                                                                        var4_4 = var16_19.getVoucherAmount().getValue();
                                                                                        if (var4_4 != null) {
                                                                                            var26_28 = Float.parseFloat((String)var4_4);
                                                                                        } else {
                                                                                            var25_27 = 0;
                                                                                            var26_28 = 0.0f;
                                                                                            var4_4 = null;
                                                                                        }
                                                                                        var15_18 += var26_28;
                                                                                    }
                                                                                    if ((var4_4 = var16_19.getProductDiscounts()) != null && (var4_4 = var16_19.getProductDiscounts().getValue()) != null && (var25_27 = (int)Intrinsics.areEqual(var4_4 = var16_19.getProductDiscounts().getValue(), var17_20)) == 0) {
                                                                                        var4_4 = var16_19.getProductDiscounts().getValue();
                                                                                        if (var4_4 != null) {
                                                                                            var26_28 = Float.parseFloat((String)var4_4);
                                                                                        } else {
                                                                                            var25_27 = 0;
                                                                                            var26_28 = 0.0f;
                                                                                            var4_4 = null;
                                                                                        }
                                                                                        var15_18 += var26_28;
                                                                                    }
                                                                                    var17_20 = String.valueOf(var15_18);
                                                                                    var4_4 = this.Pa();
                                                                                    var25_27 = (int)var4_4.w;
                                                                                    if (var25_27 != 0) break block162;
                                                                                    var4_4 = cp$a.e();
                                                                                    var18_21 = var16_19.getCode();
                                                                                    if (var18_21 == null) {
                                                                                        var18_21 = var43_44;
                                                                                    }
                                                                                    var4_4.getClass();
                                                                                    cp_1.K((String)var18_21, "Appsflyer_before");
                                                                                    var4_4 = var3_3.E;
                                                                                    if (var4_4 != null) {
                                                                                        var4_4 = var4_4.a;
                                                                                    } else {
                                                                                        var25_27 = 0;
                                                                                        var26_28 = 0.0f;
                                                                                        var4_4 = null;
                                                                                    }
                                                                                    var3_3.g.pushEEPurchaseAppsflyer((CartOrder)var16_19, (LuxeDetails)var4_4);
                                                                                    var4_4 = var3_3.D;
                                                                                    var18_21 = "order confirmation screen";
                                                                                    GAEcommerceEvents.sendTransactionEvent((CartOrder)var16_19, (String)var18_21, (String)var4_4);
                                                                                    var21_24 = var3_3.F;
                                                                                    if (var21_24 == null) break block163;
                                                                                    var32_33 = new ArrayList();
                                                                                    var33_34 = var16_19.getEntries();
                                                                                    if (var33_34 == null) break block164;
                                                                                    var14_17 = var33_34.size();
                                                                                    var25_27 = 0;
                                                                                    var26_28 = 0.0f;
                                                                                    var4_4 = null;
                                                                                    var11_14 = null;
                                                                                    break block165;
                                                                                }
                                                                                var48_48 = var17_20;
                                                                                var10_13 = 0;
                                                                                var11_14 = null;
                                                                                break block166;
                                                                            }
                                                                            var48_48 = var17_20;
                                                                            break block167;
                                                                        }
                                                                        var48_48 = var17_20;
                                                                        var20_23 = 0;
                                                                        var17_20 = null;
                                                                        var10_13 = 0;
                                                                        var11_14 = null;
                                                                        break block168;
                                                                    }
                                                                    for (var10_13 = 0; var10_13 < var14_17; var36_37 = var36_37.getQuantity(), var10_13 += var12_15) {
                                                                        block169: {
                                                                            block143: {
                                                                                block142: {
                                                                                    block141: {
                                                                                        var36_37 = (CartEntry)var33_34.get(var10_13);
                                                                                        var24_26 = var36_37.getProduct();
                                                                                        var34_35 = new HashMap();
                                                                                        var6_9 = var36_37.getSourceStoreId();
                                                                                        var48_48 = var17_20;
                                                                                        var17_20 = "luxe";
                                                                                        var20_23 = (int)var6_9.equals(var17_20);
                                                                                        if (var20_23 != 0) {
                                                                                            var20_23 = 1;
                                                                                            var25_27 += var20_23;
                                                                                        }
                                                                                        var20_23 = var25_27;
                                                                                        var4_4 = var24_26.getName();
                                                                                        var34_35.put("Name", var4_4);
                                                                                        var6_9 = var24_26.getBrandName();
                                                                                        var34_35.put("BRAND", var6_9);
                                                                                        var4_4 = var24_26.getBrickCategory();
                                                                                        if (var4_4 != null) {
                                                                                            var4_4 = "Category";
                                                                                            var6_9 = var24_26.getBrickCategory();
                                                                                            var34_35.put(var4_4, var6_9);
                                                                                        }
                                                                                        if ((var4_4 = var24_26.getBrickSubCategory()) != null) {
                                                                                            var4_4 = "Vertical";
                                                                                            var6_9 = var24_26.getBrickSubCategory();
                                                                                            var34_35.put(var4_4, var6_9);
                                                                                        }
                                                                                        if ((var4_4 = var24_26.getBrickName()) != null) {
                                                                                            var4_4 = "Brick";
                                                                                            var6_9 = var24_26.getBrickName();
                                                                                            var34_35.put(var4_4, var6_9);
                                                                                        }
                                                                                        var4_4 = "Final_price";
                                                                                        try {
                                                                                            var6_9 = var36_37.getBasePrice();
                                                                                            var6_9 = var6_9.getValue();
                                                                                            if (var6_9 == null) break block141;
                                                                                            var66_66 = Double.parseDouble((String)var6_9);
                                                                                            var6_9 = var66_66;
                                                                                            break block142;
                                                                                        }
                                                                                        catch (Exception var4_5) {
                                                                                            break block143;
                                                                                        }
                                                                                    }
                                                                                    var64_64 = 0;
                                                                                    var6_9 = null;
                                                                                }
                                                                                var34_35.put(var4_4, var6_9);
                                                                                break block169;
                                                                            }
                                                                            var6_9 = yn3_0.a;
                                                                            var6_9.e(var4_5);
                                                                        }
                                                                        var4_4 = var24_26.getVerticalColor();
                                                                        var25_27 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                                                                        if (var25_27 == 0) {
                                                                            var4_4 = "color";
                                                                            var6_9 = var24_26.getVerticalColor();
                                                                            var34_35.put(var4_4, var6_9);
                                                                        }
                                                                        if ((var25_27 = (int)TextUtils.isEmpty((CharSequence)(var4_4 = var24_26.getSelectedSize()))) == 0) {
                                                                            var4_4 = "size";
                                                                            var6_9 = var24_26.getSelectedSize();
                                                                            var34_35.put(var4_4, var6_9);
                                                                        }
                                                                        if ((var25_27 = (int)TextUtils.isEmpty((CharSequence)(var4_4 = var24_26.getDiscountPercent()))) == 0) {
                                                                            var4_4 = "discount_value";
                                                                            var6_9 = var24_26.getDiscountPercent();
                                                                            var34_35.put(var4_4, var6_9);
                                                                        }
                                                                        if ((var4_4 = var24_26.getCatalog()) == null) {
                                                                            var4_4 = var24_26.getCatalogName();
                                                                        }
                                                                        if ((var25_27 = (int)TextUtils.isEmpty((CharSequence)var4_4)) == 0) {
                                                                            var4_4 = var24_26.getCatalog();
                                                                            if (var4_4 == null) {
                                                                                var4_4 = var24_26.getCatalogName();
                                                                            }
                                                                            var6_9 = "catalogId";
                                                                            var34_35.put(var6_9, var4_4);
                                                                        }
                                                                        if ((var25_27 = (int)TextUtils.isEmpty((CharSequence)(var4_4 = var36_37.getSourceStoreId()))) == 0) {
                                                                            var4_4 = "Store Type";
                                                                            var6_9 = var36_37.getSourceStoreId();
                                                                            var34_35.put(var4_4, var6_9);
                                                                        }
                                                                        if ((var4_4 = var24_26.getPrice()) != null && (var4_4 = var4_4.getValue()) != null && (var64_64 = var4_4.length()) > 0) {
                                                                            var6_9 = "MRP";
                                                                            var34_35.put(var6_9, var4_4);
                                                                        }
                                                                        if ((var4_4 = var24_26.getCode()) != null && (var64_64 = var4_4.length()) > 0) {
                                                                            var6_9 = "SKUID";
                                                                            var34_35.put(var6_9, var4_4);
                                                                        }
                                                                        if ((var4_4 = var24_26.getBaseProduct()) != null && (var64_64 = var4_4.length()) > 0) {
                                                                            var6_9 = "VariantID";
                                                                            var34_35.put(var6_9, var4_4);
                                                                        }
                                                                        var4_4 = var21_24.a.f();
                                                                        var6_9 = "User type";
                                                                        var34_35.put(var6_9, var4_4);
                                                                        var4_4 = "Quantity";
                                                                        var34_35.put(var4_4, var36_37);
                                                                        var32_33.add(var34_35);
                                                                        var12_15 = 1;
                                                                        var13_16 = 1.4E-45f;
                                                                        var25_27 = var20_23;
                                                                        var17_20 = var48_48;
                                                                        var64_64 = 1;
                                                                        var9_12 = 0;
                                                                        var34_35 = null;
                                                                    }
                                                                    var48_48 = var17_20;
                                                                    var10_13 = var25_27;
                                                                }
                                                                var17_20 = new HashMap();
                                                                var4_4 = "Item_count";
                                                                var21_24 = var16_19.getTotalItems();
                                                                var17_20.put(var4_4, var21_24);
                                                                try {
                                                                    var4_4 = var16_19.getTotalPrice();
                                                                    var4_4 = var4_4.getValue();
                                                                    if (var4_4 == null) break block144;
                                                                    var68_67 = Double.parseDouble((String)var4_4);
                                                                    var4_4 = var68_67;
                                                                    break block145;
                                                                }
                                                                catch (NumberFormatException var4_6) {
                                                                    break block146;
                                                                }
                                                            }
                                                            var25_27 = 0;
                                                            var26_28 = 0.0f;
                                                            var4_4 = null;
                                                        }
                                                        var21_24 = "Amount";
                                                        var17_20.put(var21_24, var4_4);
                                                        break block170;
                                                    }
                                                    var21_24 = yn3_0.a;
                                                    var21_24.e(var4_6);
                                                }
                                                var4_4 = var16_19.getAppliedVouchers();
                                                if (var4_4 != null && (var25_27 = (var4_4 = var16_19.getAppliedVouchers()).size()) > 0) {
                                                    var4_4 = var16_19.getAppliedVouchers();
                                                    var63_63 = 0;
                                                    var4_4 = ((CartAppliedVoucher)var4_4.get(0)).getVoucherCode();
                                                    var21_24 = "Coupon_code";
                                                    var17_20.put(var21_24, var4_4);
                                                }
                                                var21_24 = var16_19.getCode();
                                                var17_20.put("Charged ID", var21_24);
                                                var21_24 = var16_19.getPaymentCode();
                                                var17_20.put("Payment_mode", var21_24);
                                                var4_4 = var10_13;
                                                var21_24 = "LUXE Item count";
                                                var17_20.put(var21_24, var4_4);
                                                var4_4 = AnalyticsManager.Companion.getInstance().getCt();
                                                var4_4.pushEvent((HashMap)var17_20, (ArrayList)var32_33);
                                            }
                                            var4_4 = var3_3.F;
                                            if (var4_4 == null) break block171;
                                            Intrinsics.checkNotNullParameter(var16_19, (String)var5_8);
                                            var17_20 = var16_19.getEntries();
                                            if (var17_20 == null || (var63_63 = (int)var17_20.isEmpty()) != 0) break block171;
                                            var21_24 = new ArrayList();
                                            var32_33 = new StringBuilder();
                                            var17_20 = var17_20.iterator();
                                            break block172;
                                        }
                                        var10_13 = 0;
                                        var11_14 = null;
                                        break block173;
                                    }
                                    while ((var37_38 = (int)var17_20.hasNext()) != 0) {
                                        var33_34 = (CartItem)var17_20.next();
                                        var14_17 = var33_34 instanceof CartEntry;
                                        if (var14_17 == 0 || (var47_47 = (var33_34 = (CartEntry)var33_34).getProduct()) == null) continue;
                                        var47_47 = var33_34.getProduct().getCode();
                                        var21_24.add(var47_47);
                                        var47_47 = var33_34.getProduct().getBaseProduct();
                                        if (var47_47 == null) continue;
                                        var10_13 = 6;
                                        var64_64 = 0;
                                        var6_9 = null;
                                        var14_17 = StringsKt.N((CharSequence)var47_47, '_', 0, false, var10_13);
                                        var12_15 = -1;
                                        var13_16 = 0.0f / 0.0f;
                                        if (var14_17 == var12_15) continue;
                                        if ((var33_34 = var33_34.getProduct().getBaseProduct()) != null) {
                                            var33_34 = var33_34.substring(0, var14_17);
                                            var47_47 = "substring(...)";
                                            Intrinsics.checkNotNullExpressionValue(var33_34, var47_47);
                                        } else {
                                            var37_38 = 0;
                                            var38_39 = 0.0f;
                                            var33_34 = null;
                                        }
                                        var32_33.append((String)var33_34);
                                        var33_34 = ",";
                                        var32_33.append((String)var33_34);
                                    }
                                    var63_63 = var32_33.length() - 1;
                                    var37_38 = 0;
                                    var38_39 = 0.0f;
                                    var21_24 = var32_33.substring(0, var63_63);
                                    var17_20 = new StringBuilder((String)var21_24);
                                    AJIOApplication.Companion.getClass();
                                    var21_24 = AJIOApplication$a.a();
                                    var39_40 = com.ril.mp.services.R$string.rtb_url_order_confirmation_page;
                                    var33_34 = var16_19.getTotalPriceWithTax();
                                    if (var33_34 == null || (var33_34 = var33_34.getValue()) == null) {
                                        var33_34 = "0";
                                    }
                                    var33_34 = Float.valueOf((String)var33_34);
                                    Intrinsics.checkNotNullExpressionValue(var33_34, "valueOf(...)");
                                    var33_34 = String.valueOf(Math.round(var33_34.floatValue()));
                                    var47_47 = var16_19.getCode();
                                    var17_20 = var17_20.toString();
                                    var12_15 = 4;
                                    var13_16 = 5.6E-45f;
                                    var36_37 = new Object[var12_15];
                                    var10_13 = 0;
                                    var11_14 = null;
                                    var36_37[0] = var33_34;
                                    var36_37[1] = var47_47;
                                    var36_37[var65_65] = var17_20;
                                    var37_38 = 3;
                                    var38_39 = 4.2E-45f;
                                    var36_37[var37_38] = "false";
                                    var17_20 = var21_24.getString(var39_40, (Object[])var36_37);
                                    Intrinsics.checkNotNullExpressionValue(var17_20, "getString(...)");
                                    var4_4 = var4_4.b;
                                    var4_4.getClass();
                                    Intrinsics.checkNotNullParameter(var17_20, "Url");
                                    var21_24 = var4_4.y;
                                    if (var21_24 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("rtbRepo");
                                        var63_63 = 0;
                                        var21_24 = null;
                                    }
                                    var17_20 = var21_24.sendRTBRequest((String)var17_20, (String)var18_21);
                                    var18_21 = new Object();
                                    var39_40 = 1;
                                    var40_41 = 1.4E-45f;
                                    var21_24 = new a6(var39_40, (Function1)var18_21);
                                    var18_21 = new sj0_1(var39_40);
                                    var33_34 = new sy1_1(var39_40, (Function1)var18_21);
                                    var17_20 = var17_20.f((o60_0)var21_24, (o60_0)var33_34);
                                    var4_4 = var4_4.b;
                                    var4_4.b((yr0_2)var17_20);
                                }
                                var3_3.Ra((CartOrder)var16_19);
                                var4_4 = el1_2.a;
                                Intrinsics.checkNotNullParameter(var16_19, (String)var5_8);
                                var25_27 = (int)el1_2.j();
                                if (var25_27 == 0) {
                                    var27_29 = 0;
                                    var18_21 = null;
                                    var63_63 = 3;
                                } else {
                                    var4_4 = el1_2.b;
                                    var27_29 = 0;
                                    var18_21 = null;
                                    var17_20 = new rl1_1((CartOrder)var16_19, null);
                                    var63_63 = 3;
                                    Ae3.d((i90_0)var4_4, null, null, (Function2)var17_20, var63_63);
                                }
                                Intrinsics.checkNotNullParameter(var16_19, (String)var5_8);
                                var25_27 = (int)el1_2.j();
                                if (var25_27 != 0) {
                                    var4_4 = el1_2.b;
                                    var17_20 = new ml1_1((CartOrder)var16_19, null);
                                    Ae3.d((i90_0)var4_4, null, null, (Function2)var17_20, var63_63);
                                }
                                p5_0.a.getClass();
                                Intrinsics.checkNotNullParameter(var16_19, (String)var5_8);
                                var4_4 = h40_0.a;
                                var25_27 = (int)h40_0.N0();
                                if (var25_27 == 0) ** GOTO lbl-1000
                                var4_4 = p5_0.c.b();
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getUtmMedium();
                                } else {
                                    var25_27 = 0;
                                    var26_28 = 0.0f;
                                    var4_4 = null;
                                }
                                if ((var25_27 = (int)Intrinsics.areEqual(var4_4, var17_20 = "affiliate")) != 0) {
                                    var20_23 = 0;
                                    var17_20 = null;
                                    var4_4 = new p5$b((CartOrder)var16_19, null);
                                    var18_21 = p5_0.b;
                                    var63_63 = 3;
                                    Ae3.d((i90_0)var18_21, null, null, (Function2)var4_4, var63_63);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var20_23 = 0;
                                    var17_20 = null;
                                }
                                var4_4 = this.Pa();
                                var27_29 = 1;
                                var4_4.w = var27_29;
                            }
                            var18_21 = var16_19;
                        }
                        var3_3.r = var4_4 = var8_11.getString("order_no");
                        var16_19 = var48_48;
                    }
                    cp_1.Companion.getClass();
                    var4_4 = z40_0.Companion;
                    var4_4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var4_4).a;
                    var21_24 = "ConvenienceFeeConfig";
                    var4_4 = var4_4.b((String)var21_24);
                    var63_63 = var4_4.length();
                    if (var63_63 == 0) {
                        var25_27 = 0;
                        var4_4 = null;
                        var26_28 = 0.0f;
                    } else {
                        var21_24 = ConvenienceFeeConfig.class;
                        var4_4 = (ConvenienceFeeConfig)JsonUtils.fromJson((String)var4_4, (Class)var21_24);
                    }
                    if (var4_4 != null) {
                        var4_4 = var4_4.getMasterFlag();
                        var21_24 = Boolean.TRUE;
                        var10_13 = (int)Intrinsics.areEqual(var4_4, var21_24);
                    }
                    if (var10_13 == (var63_63 = 1)) {
                        var4_4 = var3_3.w;
                        if (var4_4 == null) {
                            var4_4 = new Bundle();
                            var3_3.w = var4_4;
                        }
                        if ((var4_4 = var3_3.w) != null && var8_11 != null && (var25_27 = (int)var8_11.containsKey((String)var41_42)) == (var63_63 = 1)) {
                            var25_27 = Build.VERSION.SDK_INT;
                            var63_63 = 33;
                            if (var25_27 >= var63_63) {
                                var4_4 = aa2_0.a((Bundle)var8_11);
                            } else {
                                var25_27 = (var41_42 = var8_11.getSerializable((String)var41_42)) instanceof ConvenienceFeePriceSplitUp;
                                if (var25_27 == 0) {
                                    var42_43 /* !! */  = 0;
                                    var41_42 = null;
                                }
                                var4_4 = var41_42;
                                var4_4 = (ConvenienceFeePriceSplitUp)var41_42;
                            }
                            var4_4 = (ConvenienceFeePriceSplitUp)var4_4;
                            if (var4_4 != null && (var21_24 = var3_3.w) != null) {
                                var4_4 = mz3_0.f((ConvenienceFeePriceSplitUp)var4_4);
                                var21_24.putAll((Bundle)var4_4);
                            }
                        }
                    }
                    if ((var4_4 = var3_3.w) != null) {
                        var21_24 = "ecomm_pageType";
                        var32_33 = "purchase";
                        var4_4.putString((String)var21_24, (String)var32_33);
                    }
                    if (var18_21 != null) {
                        try {
                            var4_4 = var18_21.getTotalPrice();
                            if (var4_4 != null && (var4_4 = var4_4.getValue()) != null) {
                                var28_30 = Double.parseDouble((String)var4_4);
                            }
                        }
                        catch (NumberFormatException var4_7) {
                            var21_24 = yn3_0.a;
                            var21_24.e(var4_7);
                        }
                    }
                    if ((var4_4 = var3_3.w) != null) {
                        var21_24 = "ecomm_total_value";
                        var32_33 = String.valueOf(var28_30);
                        var4_4.putString((String)var21_24, (String)var32_33);
                    }
                    if ((var4_4 = var3_3.w) != null) {
                        var21_24 = new Gson();
                        var32_33 = ma2_0.b((CartOrder)var18_21);
                        var21_24 = var21_24.toJson(var32_33);
                        var32_33 = "ecomm_prodid";
                        var4_4.putString((String)var32_33, (String)var21_24);
                    }
                    if ((var4_4 = var3_3.w) != null && (var63_63 = (int)var4_4.containsKey((String)(var21_24 = var62_62.getCM_EP_TAARA()))) != 0 && (var63_63 = (int)var4_4.containsKey((String)(var21_24 = var62_62.getCM_EP_RONE()))) != 0) {
                        var21_24 = var62_62.getCM_EP_RONE();
                        var4_4.remove((String)var21_24);
                        var21_24 = var62_62.getSV_EP_RONE();
                        var4_4.remove((String)var21_24);
                    }
                    var4_4 = GAEcommerceEvents.INSTANCE;
                    if (var18_21 != null) {
                        var8_11 = var18_21.getEntries();
                    } else {
                        var8_11 = null;
                        var7_10 = 0.0f;
                    }
                    var4_4 = var4_4.getContainsStoreForCartEntry((ArrayList)var8_11);
                    var17_20 = za2_0.a;
                    var17_20 = var3_3.w;
                    var18_21 = var3_3.D;
                    var32_33 = "stores";
                    var34_35 = dm_1.a((String)var16_19, "totalDiscount", (String)var4_4, (String)var32_33);
                    var5_8 = za2_0.b;
                    var21_24 = var5_8.getSV_EP_RONE();
                    if (var17_20 == null) break block174;
                    var32_33 = "rone";
                    var37_38 = (int)var17_20.containsKey((String)var32_33);
                    var14_17 = 1;
                    var15_18 = 1.4E-45f;
                    if (var37_38 != var14_17) break block175;
                    var6_9 = var17_20.getString((String)var32_33);
                    break block176;
                }
                var14_17 = 1;
                var15_18 = 1.4E-45f;
            }
            var6_9 = var43_44;
        }
        var34_35.putString((String)var21_24, (String)var6_9);
        var21_24 = var5_8.getSV_EP_AJIO_WALLET();
        var17_20 = var17_20 != null && (var37_38 = (int)var17_20.containsKey((String)(var32_33 = "ajio_wallet"))) == var14_17 ? var17_20.getString((String)var32_33) : "notified";
        var34_35.putString((String)var21_24, (String)var17_20);
        var17_20 = var5_8.getTOTAL_DISCOUNT();
        var34_35.putString((String)var17_20, (String)var16_19);
        var16_19 = var5_8.getPAYMENT_TYPE();
        var34_35.putString((String)var16_19, (String)var18_21);
        var34_35.putString("contains_store", (String)var4_4);
        var4_4 = za2_0.a;
        var8_11 = var4_4.getPrevScreen();
        var24_26 = var4_4.getPrevScreenType();
        var5_8.newPushCustomScreenView("order confirmation screen", "thank you screen", (String)var8_11, (Bundle)var34_35, (String)var24_26);
        var16_19 = Looper.getMainLooper();
        var4_4 = new Handler((Looper)var16_19);
        var16_19 = new ia2_0(var3_3);
        var4_4.postDelayed((Runnable)var16_19, 500L);
    }

    public final void u9(BannerAdsMetaData object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdsMetaData");
        Object object2 = ((BannerAdsMetaData)object).getImpressionTracker();
        if (object2 != null) {
            object = ((BannerAdsMetaData)object).getCcbValue();
            Intrinsics.checkNotNullParameter(object2, "url");
            long l2 = k7.p();
            String string2 = String.valueOf(l2);
            String string3 = "[trq]";
            object2 = kotlin.text.b.n((String)object2, string3, string2, false);
            if (object == null) {
                object = "";
            }
            string2 = "[ccb]";
            object = kotlin.text.b.n((String)object2, string2, (String)object, false);
            object2 = (BannerAdViewModel)this.I.getValue();
            ((BannerAdViewModel)object2).callBannerViewImpression((String)object);
        }
    }

    public final void v7() {
        Object object = za2_0.b;
        Object object2 = ((NewCustomEventsRevamp)object).getEC_ORDER_CONFIRMATION();
        String string2 = za2_0.c;
        String string3 = za2_0.d;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "Go to wallet screen", "referral card clicked", "order_confirm_interaction", "order confirmation screen", "thank you screen", string2, null, string3, false, null, 1536, null);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        ((GTMEvents)object2).pushButtonTapEvent("AJIOWallet", "Go to wallet screen", (String)object);
        object = new Bundle();
        boolean bl2 = true;
        object.putBoolean("gotoAjioWallet", bl2);
        object.putBoolean("BUNDLE_SKIPPING_MY_ACCOUNT", bl2);
        at2_1.f(this.getContext(), (Bundle)object);
    }

    public final void w8(int n3) {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = object.isFinishing())) {
            com.ril.ajio.payment.fragment.e.Companion.getClass();
            Object object2 = new e();
            Bundle bundle = new Bundle();
            String string2 = "rating";
            bundle.putInt(string2, n3);
            ((Fragment)object2).setArguments(bundle);
            this.s = object2;
            n3 = 4158;
            ((Fragment)object2).setTargetFragment(this, n3);
            e e2 = this.s;
            if (e2 != null) {
                object = ((FragmentActivity)object).getSupportFragmentManager();
                object2 = "ExpandNPSRatingDialog";
                e2.show((FragmentManager)object, (String)object2);
            }
        }
    }

    public final void y0(Float f5, Float f6, Float f7, Float f8, Float f11, DialogInterface.OnDismissListener onDismissListener) {
        boolean bl2;
        Object object = onDismissListener;
        float f12 = f5.floatValue();
        float f14 = f6.floatValue();
        float f15 = f7.floatValue();
        float f16 = f8.floatValue();
        float f17 = f11.floatValue();
        Intrinsics.checkNotNullParameter(onDismissListener, "onWalletDismissListener");
        Object object2 = za2_0.a;
        object2 = this.w;
        Object object3 = za2_0.b;
        String string2 = ((NewCustomEventsRevamp)object3).getEC_ORDER_CONFIRMATION();
        Bundle bundle = ma2_0.a((Bundle)object2);
        String string3 = za2_0.c;
        String string4 = za2_0.d;
        String string5 = "view earn points click";
        String string6 = "more details";
        String string7 = "order_confirm_interaction";
        String string8 = "order confirmation screen";
        String string9 = "thank you screen";
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string5, string6, string7, string8, string9, string3, bundle, string4, false, null, n3, null);
        object2 = this.getActivity();
        if (object2 != null && !(bl2 = object2.isFinishing())) {
            com.ril.ajio.payment.fragment.b.Companion.getClass();
            object3 = new b();
            string2 = new Bundle();
            string5 = "TOTAL_EARNED";
            string2.putFloat(string5, f12);
            string2.putFloat("AJIO_WALLET", f14);
            string2.putFloat("LR", f15);
            string2.putFloat("R1POINTS", f16);
            string2.putFloat("TAARA_WALLET", f17);
            ((Fragment)object3).setArguments((Bundle)string2);
            String string10 = "<set-?>";
            Intrinsics.checkNotNullParameter(this, string10);
            ((b)object3).f = this;
            Intrinsics.checkNotNullParameter(onDismissListener, string10);
            ((b)object3).g = onDismissListener;
            object = ((FragmentActivity)object2).getSupportFragmentManager();
            string10 = "EarnedPointsBottomSheetFragment";
            ((DialogFragment)object3).show((FragmentManager)object, string10);
        }
    }
}

