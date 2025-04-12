/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ToggleButton
 */
package com.ril.ajio.payment.fragment;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$t$a;
import com.ajio.ril.core.network.model.DataError;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioRedirectingProgressView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.payment.fragment.CheckoutFragment$a;
import com.ril.ajio.payment.fragment.CheckoutFragment$b;
import com.ril.ajio.payment.fragment.CheckoutFragment$c;
import com.ril.ajio.payment.fragment.CheckoutFragment$d;
import com.ril.ajio.payment.fragment.CheckoutFragment$e;
import com.ril.ajio.payment.fragment.CheckoutFragment$f;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.Notes;
import com.ril.ajio.services.data.Payment.OrderSummary;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryCodWithProductCode;
import com.ril.ajio.services.query.QueryDeliveryAddress;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class CheckoutFragment
extends Fragment
implements FragmentTitlesInterface,
OnCheckoutClickListener,
n82_0,
jx0$b,
co2_0 {
    public static final CheckoutFragment$a Companion;
    public ArrayList A;
    public dv_0 B;
    public boolean C;
    public String D;
    public String E;
    public final String F;
    public final String G;
    public final D H;
    public KT I;
    public final int a;
    public final hh3_2 b;
    public do2_0 c;
    public RecyclerView d;
    public LinearLayoutManager e;
    public View f;
    public hy3_0 g;
    public ps_0 h;
    public v33 i;
    public ToggleButton j;
    public Handler k;
    public boolean l;
    public final NewEEcommerceEventsRevamp m;
    public final NewCustomEventsRevamp n;
    public ys_1 o;
    public g p;
    public AjioRedirectingProgressView q;
    public String r;
    public String s;
    public ShimmerFrameLayout t;
    public Boolean u;
    public ArrayList v;
    public ArrayList w;
    public op2_2 x;
    public PaymentActivity y;
    public final boolean[] z;

    static {
        CheckoutFragment$a checkoutFragment$a;
        Companion = checkoutFragment$a = new Object();
    }

    public CheckoutFragment() {
        this.a = 1001;
        Object object = new ut_0(this);
        this.b = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.m = object2;
        this.n = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.u = object = Boolean.FALSE;
        object = new ArrayList();
        this.v = object;
        object = new ArrayList();
        this.w = object;
        object = new boolean[5];
        this.z = (boolean[])object;
        this.C = true;
        this.F = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.G = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        object2 = new CheckoutFragment$d(this);
        CheckoutFragment$e checkoutFragment$e = new CheckoutFragment$e(this);
        CheckoutFragment$f checkoutFragment$f = new CheckoutFragment$f(this);
        this.H = object = LW0.a(this, (yn1_2)object, (Function0)object2, checkoutFragment$e, checkoutFragment$f);
    }

    public final m80_0 A() {
        return this.Qa().e;
    }

    /*
     * Unable to fully structure code
     */
    public final void C8(PaymentInstrumentInfo var1_1) {
        var2_2 = this.d;
        var3_3 = null;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            var4_4 = 0;
            var2_2 = null;
            var5_5 = 0.0f;
        }
        if ((var2_2 = var2_2.getAdapter()) != null && (var6_6 = var2_2 instanceof ys_1)) {
            var7_7 = var2_2;
            var7_7 = (ys_1)var2_2;
            InternalWalletUtil.a.getClass();
            var2_2 = "checkoutAdapter";
            Intrinsics.checkNotNullParameter(var7_7, (String)var2_2);
            var8_8 = var7_7.c;
            if (var1_1 != null) {
                block16: {
                    block15: {
                        var2_2 = var8_8.iterator();
                        var6_6 = false;
                        var9_9 = 0;
                        while (true) {
                            var10_10 = var2_2.hasNext();
                            var11_11 = -1;
                            if (!var10_10) break block15;
                            var12_12 = var2_2.next();
                            var13_13 = var9_9 + 1;
                            if (var9_9 < 0) break;
                            var12_12 = (qq2_2)var12_12;
                            var14_14 = var12_12.a;
                            var15_15 = 29;
                            if (var14_14 == var15_15 && (var12_12 = var12_12.c) != null && (var14_14 = var12_12 instanceof InternalWalletDataHolder) != 0) {
                                if ((var12_12 = ((InternalWalletDataHolder)var12_12).getPaymentInstrumentInfo()) != null) {
                                    var12_12 = var12_12.getCode();
                                } else {
                                    var10_10 = false;
                                    var12_12 = null;
                                }
                                var16_16 = var1_1.getCode();
                                var10_10 = Intrinsics.areEqual(var12_12, var16_16);
                                if (var10_10) {
                                    var2_2 = var1_1.getErrorLoadingBalance();
                                    var4_4 = (int)Intrinsics.areEqual(var2_2, var3_3 = Boolean.TRUE);
                                    if (var4_4 != 0) {
                                        var6_6 = false;
                                        var10_10 = false;
                                        var12_12 = null;
                                        var3_3 = null;
                                        var13_13 = 12;
                                        var14_14 = 0;
                                        var16_16 = null;
                                        var2_2 = var18_18;
                                        var18_18 = new InternalWalletDataHolder(false, var1_1, null, null, var13_13, null);
                                        var4_4 = 32;
                                        var5_5 = 4.5E-44f;
                                        var17_17 = new qq2_2(var18_18, var4_4);
lbl54:
                                        // 2 sources

                                        while (true) {
                                            var3_3 = var17_17;
                                            ** GOTO lbl92
                                            break;
                                        }
                                    } else {
                                        var2_2 = var1_1.getAvailableAmount();
                                        var3_3 = null;
                                        if (var2_2 != null) {
                                            var5_5 = var2_2.floatValue();
                                        } else {
                                            var4_4 = 0;
                                            var5_5 = 0.0f;
                                            var2_2 = null;
                                        }
                                        var4_4 = (int)((cfr_temp_0 = var5_5 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var4_4 > 0) {
                                            var6_6 = false;
                                            var10_10 = false;
                                            var12_12 = null;
                                            var3_3 = null;
                                            var13_13 = 12;
                                            var14_14 = 0;
                                            var16_16 = null;
                                            var2_2 = var18_19;
                                            var18_19 = new InternalWalletDataHolder(false, var1_1, null, null, var13_13, null);
                                            var4_4 = 31;
                                            var5_5 = 4.3E-44f;
                                            var17_17 = new qq2_2(var18_19, var4_4);
                                            ** continue;
                                        }
                                        var12_12 = var1_1.getName();
                                        var19_20 = var1_1.getDescription();
                                        var3_3 = new InternalWalletDataHolder(false, var1_1, (String)var12_12, var19_20);
                                        var20_21 = 33;
                                        var3_3 = var2_2 = new qq2_2((InternalWalletDataHolder)var3_3, var20_21);
                                    }
                                    break block16;
                                }
                            }
                            var9_9 = var13_13;
                        }
                        xx_2.n();
                        throw null;
                    }
                    var9_9 = -1;
                }
                if (var9_9 > var11_11 && var9_9 < (var4_4 = var8_8.size()) && var3_3 != null) {
                    var8_8.set(var9_9, var3_3);
                    var7_7.notifyItemChanged(var9_9);
                }
            }
        }
    }

    public final void C9(PriceValidation priceValidation) {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        xT xT2 = new xT(0, this, priceValidation);
        recyclerView.post(xT2);
    }

    public final float D() {
        return this.Qa().o;
    }

    public final void E3(boolean bl2) {
        boolean bl3;
        Object object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) != null && (bl3 = object instanceof ys_1)) {
            ps_0 ps_02;
            Object object2 = this.h;
            if (object2 == null) {
                object2 = "checkOutViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                ps_02 = null;
            } else {
                ps_02 = object2;
            }
            ArrayList arrayList = ((ys_1)object).c;
            PaymentInstruments paymentInstruments = this.Qa().s;
            ps_02.getClass();
            Intrinsics.checkNotNullParameter(arrayList, "dataSet");
            object = md3_0.c(ps_02);
            object2 = new os_0(arrayList, paymentInstruments, bl2, ps_02, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
    }

    public final HashSet H() {
        return this.Qa().w;
    }

    public final void I9(ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp) {
        Object object;
        Object object2 = this.I;
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null) {
            boolean bl3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            Object object12;
            float f5;
            r80_0 r80_02 = new r80_0();
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getDelivery()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
                object12 = object = String.valueOf(f5);
            } else {
                object12 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getDelivery()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                object11 = object = String.valueOf(f5);
            } else {
                object11 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getRVP()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
                object10 = object = String.valueOf(f5);
            } else {
                object10 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getRVP()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                object9 = object = String.valueOf(f5);
            } else {
                object9 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getCOD()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
                object8 = object = String.valueOf(f5);
            } else {
                object8 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getCOD()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                object7 = object = String.valueOf(f5);
            } else {
                object7 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getTotal()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
                String.valueOf(f5);
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getTotal()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                object6 = object = String.valueOf(f5);
            } else {
                object6 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getPriorityDelivery()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getAmount();
                object5 = object = String.valueOf(f5);
            } else {
                object5 = null;
            }
            if (convenienceFeePriceSplitUp != null && (object = convenienceFeePriceSplitUp.getPriorityDelivery()) != null) {
                f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
                object4 = object = String.valueOf(f5);
            } else {
                object4 = null;
            }
            object = ((KT)object2).a;
            m80_0 m80_02 = ((kj2_1)object).e;
            object2 = ((KT)object2).b.k;
            if (object2 != null) {
                int bl32 = ((Cart)object2).getDeliveryFeeThresholdAmount();
                object3 = bl32;
            }
            DialogFragment dialogFragment = object3;
            boolean bl4 = false;
            object2 = null;
            if (convenienceFeePriceSplitUp != null && (object3 = convenienceFeePriceSplitUp.getDelivery()) != null && (object3 = ((ConvenienceFeePriceSplitUp$AmountData)object3).isFeeCharged()) != null) {
                bl2 = (Boolean)object3;
            } else {
                bl2 = false;
                object3 = null;
            }
            Boolean bl5 = bl2;
            if (convenienceFeePriceSplitUp != null && (object3 = convenienceFeePriceSplitUp.getRVP()) != null && (object3 = ((ConvenienceFeePriceSplitUp$AmountData)object3).isFeeCharged()) != null) {
                bl2 = (Boolean)object3;
            } else {
                bl2 = false;
                object3 = null;
            }
            Boolean bl6 = bl2;
            if (convenienceFeePriceSplitUp != null && (object3 = convenienceFeePriceSplitUp.getCOD()) != null && (object3 = ((ConvenienceFeePriceSplitUp$AmountData)object3).isFeeCharged()) != null) {
                bl3 = (Boolean)object3;
            }
            Boolean bl7 = bl3;
            Boolean bl8 = Boolean.FALSE;
            Boolean bl9 = Boolean.TRUE;
            object = r80_02;
            r80_02.Oa((String)object12, (String)object11, (String)object10, (String)object9, (String)object8, (String)object7, (String)object6, m80_02, (Integer)((Object)dialogFragment), false, bl5, bl6, bl7, (String)object5, (String)object4, bl8, bl9);
            object3 = r80_02;
        }
        if (object3 != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            r80_0.Companion.getClass();
            object = "ConvenienceFeeInfoBottomSheet";
            ((DialogFragment)object3).show((FragmentManager)object2, (String)object);
        }
    }

    public final void J8(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "eventAction");
        String string5 = "";
        Intrinsics.checkNotNullParameter(string5, "eventLabel");
        Intrinsics.checkNotNullParameter(string4, "eventName");
        String string6 = this.F;
        String string7 = this.G;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.n, string2, string3, string5, string4, "single page checkout", "single page checkout", string6, null, string7, false, null, 1664, null);
    }

    public final void K3() {
        block16: {
            int n3;
            Object object = this.d;
            int n4 = 0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                object = null;
            }
            if ((object = ((RecyclerView)object).getAdapter()) != null && (n3 = object instanceof ys_1) != 0) {
                object = (ys_1)object;
                Iterator iterator = this.Qa();
                float f5 = ((kj2_1)((Object)iterator)).o;
                InternalWalletUtil.a.getClass();
                Intrinsics.checkNotNullParameter(object, "checkoutAdapter");
                ArrayList arrayList = ((is2_1)object).c;
                int n7 = 0;
                qq2_2 qq2_22 = null;
                int n8 = 0;
                qq2_2 qq2_23 = null;
                int n10 = 30;
                int n14 = -1;
                float f6 = f5 - 0.0f;
                n3 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                if (n3 > 0) {
                    block15: {
                        iterator = arrayList.iterator();
                        while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                            qq2_22 = (qq2_2)iterator.next();
                            int n15 = n8 + 1;
                            if (n8 >= 0) {
                                qq2_22 = qq2_22;
                                n7 = qq2_22.a;
                                if (n7 != n10) {
                                    n8 = n15;
                                    continue;
                                }
                                break block15;
                            }
                            xx_2.n();
                            throw null;
                        }
                        n8 = -1;
                    }
                    if (n8 > n14 && n8 < (n4 = arrayList.size())) {
                        arrayList.remove(n8);
                        ((RecyclerView$f)object).notifyItemRemoved(n8);
                    }
                } else {
                    boolean bl2;
                    iterator = arrayList.iterator();
                    n7 = -1;
                    while (bl2 = iterator.hasNext()) {
                        Object object2 = iterator.next();
                        int n16 = n8 + 1;
                        if (n8 >= 0) {
                            int n17;
                            Integer n18;
                            object2 = (qq2_2)object2;
                            HashSet hashSet = (HashSet)InternalWalletUtil.c.getValue();
                            boolean bl3 = hashSet.contains(n18 = Integer.valueOf(n17 = ((qq2_2)object2).a));
                            if (bl3) {
                                n7 = n8;
                            } else {
                                n8 = ((qq2_2)object2).a;
                                if (n8 == n10) break block16;
                            }
                            n8 = n16;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    if (n7 > n14 && n7 < (n3 = arrayList.size())) {
                        n3 = n7 + 1;
                        qq2_23 = new qq2_2(null, n10);
                        arrayList.add(n3, qq2_23);
                        ((RecyclerView$f)object).notifyItemInserted(n7);
                    }
                }
            }
        }
    }

    public final Pair L3() {
        Object object = this.Qa();
        Object object2 = ((kj2_1)object).s;
        String string2 = null;
        object2 = object2 != null && (object2 = ((PaymentInstruments)object2).getNotes()) != null ? ((Notes)object2).getSTORED_CARD_NOTE_HEADING() : null;
        object = ((kj2_1)object).s;
        if (object != null && (object = ((PaymentInstruments)object).getNotes()) != null) {
            string2 = ((Notes)object).getSTORED_CARD_NOTE_MESSAGE();
        }
        object = new Pair(object2, string2);
        return object;
    }

    public final void L7() {
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null) {
            float f5 = 1.1E-44f;
            paymentActivity.C2(8);
            vt3_0 vt3_02 = new vt3_0();
            Object object = paymentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
            object.getClass();
            a a2 = new a((FragmentManager)object);
            String string2 = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(a2, string2);
            int n3 = R$anim.slide_in_bottom_new;
            a2.k(n3, 0, 0, 0);
            n3 = R$id.fragment_payment;
            String string3 = "UPIHowToFindBSFragment";
            a2.j(n3, vt3_02, string3);
            a2.c(string3);
            int n4 = paymentActivity.isDestroyed();
            if (n4 == 0 && (n4 = ((FragmentManager)object).K) == 0) {
                n4 = 1;
                f5 = Float.MIN_VALUE;
                a2.o(n4 != 0, n4 != 0);
                paymentActivity.F0 = n4;
                try {
                    ((FragmentManager)object).C();
                }
                catch (IllegalStateException illegalStateException) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(illegalStateException);
                }
            }
            if ((vt3_02 = paymentActivity.E0) != null) {
                int n7 = R$color.filter_bg_color;
                vt3_02.setBackgroundResource(n7);
            }
            if ((paymentActivity = paymentActivity.E0) != null) {
                n4 = 0x3F333333;
                f5 = 0.7f;
                paymentActivity.setAlpha(f5);
            }
        }
    }

    public final void M2() {
        this.a();
        this.Pa();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Oa() {
        Exception exception2;
        block16: {
            int n3;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            block15: {
                object4 = "Nonserviceable showing payment ";
                try {
                    object3 = this.h;
                    object2 = "checkOutViewModel";
                    object = null;
                    if (object3 != null) break block15;
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                catch (Exception exception2) {
                    break block16;
                }
            }
            object3 = ((ps_0)object3).n;
            n3 = ((ArrayList)object3).size();
            String string2 = "";
            if (n3 > 0) {
                object3 = this.h;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object3 = null;
                }
                if ((object3 = ((ps_0)object3).k) != null) {
                    object3 = ((Cart)object3).getCode();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null && (n3 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0)) == 0) {
                    object3 = this.h;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object3 = null;
                    }
                    if ((object3 = ((ps_0)object3).k) != null) {
                        object3 = ((Cart)object3).getCode();
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                } else {
                    object3 = string2;
                }
                yn3$a yn3$a = yn3_0.a;
                Object object5 = this.h;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    object5 = null;
                }
                object2 = ((ps_0)object5).n;
                int n4 = ((ArrayList)object2).size();
                object5 = new StringBuilder((String)object4);
                ((StringBuilder)object5).append(n4);
                object4 = " ";
                ((StringBuilder)object5).append((String)object4);
                ((StringBuilder)object5).append((String)object3);
                object4 = ((StringBuilder)object5).toString();
                Exception exception3 = new Exception((String)object4);
                yn3$a.e(exception3);
            }
            this.Ua();
            object4 = com.ril.ajio.payment.fragment.g.Companion;
            object4.getClass();
            object4 = null;
            dm0_0.f = false;
            this.p = object4 = new g();
            this.j = null;
            ((g)object4).c = this;
            object3 = this.y;
            if (object3 != null) {
                ((PaymentActivity)object3).z2((g)object4);
            }
            if ((object4 = this.p) != null) {
                object3 = this.I;
                if (object3 != null) {
                    object3 = ((KT)object3).b;
                    object3 = ((ps_0)object3).o;
                    object = object3 == null || (object3 = ((CartDeliveryAddress)object3).getPostalCode()) == null ? string2 : object3;
                }
                ((g)object4).j = object;
            }
            if ((object4 = this.I) == null) return;
            ((KT)object4).d();
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    public final void Pa() {
        boolean bl2 = false;
        Object object = null;
        int n3 = 1;
        Object object2 = this.h;
        Object object3 = "checkOutViewModel";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        if ((object2 = ((ps_0)object2).k) != null) {
            object2 = this.h;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = null;
            }
            if ((object2 = ((ps_0)object2).o) == null) {
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl2 = false;
                    object = null;
                }
                object.getClass();
            } else {
                int n4;
                Object object5;
                object2 = this.I;
                if (object2 != null) {
                    object2 = ((KT)object2).b.o;
                    object5 = "";
                    if (object2 != null && (object2 = ((CartDeliveryAddress)object2).getPostalCode()) != null) {
                        object5 = object2;
                    }
                } else {
                    object5 = null;
                }
                if ((object2 = this.h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object2 = null;
                }
                object2 = (object2 = ((ps_0)object2).k) != null ? ((Cart)object2).getCode() : null;
                if (object5 != null && (n4 = ((String)object5).length()) != 0 && object2 != null && (n4 = ((String)object2).length()) != 0) {
                    object3 = this.i;
                    if (object3 == null) {
                        object3 = "shippingViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object4 = object3;
                    }
                    object4.getClass();
                    object3 = "single page checkout";
                    CharSequence charSequence = "screenName";
                    Intrinsics.checkNotNullParameter(object3, (String)charSequence);
                    Intrinsics.checkNotNullParameter(object5, "pincodeValue");
                    Intrinsics.checkNotNullParameter(object2, "cartId");
                    Object object6 = new QueryCodWithProductCode();
                    ((QueryCodWithProductCode)object6).setPincode((String)object5);
                    ((QueryCodWithProductCode)object6).setCartId((String)object2);
                    object2 = ((v33)object4).a;
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object3, (String)charSequence);
                    Intrinsics.checkNotNullParameter(object6, "query");
                    object3 = UrlHelper.Companion.getInstance();
                    object5 = ((r33)object2).c;
                    charSequence = ((UserInformation)object5).getUserId();
                    String string2 = ((QueryCodWithProductCode)object6).getCartId();
                    object6 = ((QueryCodWithProductCode)object6).getPincode();
                    int n7 = 3;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = charSequence;
                    objectArray[n3] = string2;
                    int n8 = 2;
                    objectArray[n8] = object6;
                    object6 = "shipping_edd";
                    object3 = ((UrlHelper)object3).getApiUrl("edd", (String)object6, objectArray);
                    charSequence = "?";
                    bl2 = StringsKt.F((CharSequence)object3, charSequence, false);
                    if (bl2) {
                        object = h40_0.a;
                        bl2 = h40_0.O1();
                        object6 = "&priorityDeliveryEnable=";
                        charSequence = new StringBuilder((String)object6);
                        ((StringBuilder)charSequence).append(bl2);
                        object = ((StringBuilder)charSequence).toString();
                    } else {
                        object = h40_0.a;
                        bl2 = h40_0.O1();
                        object6 = "?priorityDeliveryEnable=";
                        charSequence = new StringBuilder((String)object6);
                        ((StringBuilder)charSequence).append(bl2);
                        object = ((StringBuilder)charSequence).toString();
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object3);
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    Intrinsics.checkNotNullExpressionValue(object5, "userInformation");
                    object3 = ServiceUtil.getToken((UserInformation)object5);
                    object3 = kp1_0.c("Bearer ", (String)object3);
                    object = ((r33)object2).a.getShippingEdd((String)object, (String)object3, "ShippingEddCheck");
                    object2 = qt2_2.c;
                    object = ((g53_0)object).h((Scheduler)object2);
                    object2 = ti_2.a();
                    object = ((g53_0)object).e((Scheduler)object2);
                    object2 = new hm2_1();
                    object3 = new m33((Function1)object2);
                    object2 = new s53_0((q63_0)object, (bx0_2)object3);
                    object = new nm_2();
                    object3 = new u53_0((q63_0)object2, (bx0_2)object);
                    Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
                    object = new vm_2(object4, n3);
                    object2 = new s33((vm_2)object);
                    object = new xm_2(object4, n3);
                    t33 t332 = new t33((xm_2)object);
                    object = ((g53_0)object3).f((o60_0)object2, t332);
                    ((v33)object4).b.b((yr0_2)object);
                    object = Unit.a;
                    return;
                }
                this.h();
                object = Unit.a;
                return;
            }
        }
        if ((object = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object = null;
        }
        ((ps_0)object).l = null;
        this.Wa(null);
        object = Unit.a;
    }

    public final void Q7(int n3) {
        boolean bl2;
        Object object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) != null && (bl2 = object instanceof ys_1)) {
            object = (ys_1)object;
            InternalWalletUtil.a.getClass();
            Intrinsics.checkNotNullParameter(object, "checkoutAdapter");
            Object object2 = ((is2_1)object).c;
            int n4 = -1;
            if (n3 > n4 && n3 < (n4 = ((ArrayList)object2).size())) {
                object2 = (qq2_2)((ArrayList)object2).get(n3);
                ((qq2_2)object2).a = n4 = 29;
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
    }

    public final kj2_1 Qa() {
        return (kj2_1)this.H.getValue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ra(boolean bl2) {
        CheckoutFragment checkoutFragment = this;
        synchronized (this) {
            Context context;
            boolean bl3;
            ArrayList<Object> arrayList;
            Serializable serializable;
            Object object;
            Object object2;
            Object object3;
            int n3;
            Object object4;
            int n4;
            Object object5;
            Object object6;
            Object object7;
            try {
                int n7;
                block50: {
                    Exception exception2;
                    int n8;
                    block49: {
                        block48: {
                            block47: {
                                boolean bl4;
                                int n10;
                                object7 = new ArrayList();
                                object6 = this.h;
                                object5 = null;
                                if (object6 == null) {
                                    object6 = "checkOutViewModel";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                                    n7 = 0;
                                    object6 = null;
                                }
                                object6 = ((ps_0)object6).o;
                                n4 = 1;
                                if (object6 != null) {
                                    object6 = checkoutFragment.h;
                                    if (object6 == null) {
                                        object6 = "checkOutViewModel";
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                                        n7 = 0;
                                        object6 = null;
                                    }
                                    object6 = ((ps_0)object6).o;
                                    object4 = checkoutFragment.h;
                                    if (object4 == null) {
                                        object4 = "checkOutViewModel";
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                        n3 = 0;
                                        object4 = null;
                                    }
                                    if ((object4 = ((ps_0)object4).o) != null) {
                                        ((CartDeliveryAddress)object4).setStorePickUpAvailable(n4 != 0);
                                    }
                                    checkoutFragment.u = object4 = Boolean.TRUE;
                                    object3 = object6;
                                } else {
                                    object6 = checkoutFragment.h;
                                    if (object6 == null) {
                                        object6 = "checkOutViewModel";
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                                        n7 = 0;
                                        object6 = null;
                                    }
                                    object6.getClass();
                                    object3 = null;
                                }
                                n3 = 17;
                                object6 = new qq2_2(object3, null, n3);
                                ((ArrayList)object7).add(object6);
                                object6 = checkoutFragment.D;
                                n7 = TextUtils.isEmpty((CharSequence)object6);
                                if (n7 == 0) {
                                    object4 = checkoutFragment.D;
                                    n10 = 22;
                                    object6 = new qq2_2((String)object4, n10);
                                    ((ArrayList)object7).add(object6);
                                }
                                n7 = 24;
                                object4 = new qq2_2(null, n7);
                                ((ArrayList)object7).add(object4);
                                object2 = checkoutFragment.h;
                                if (object2 == null) {
                                    object2 = "checkOutViewModel";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    n10 = 0;
                                    object2 = null;
                                }
                                object2 = ((ps_0)object2).m;
                                n8 = 18;
                                object4 = new qq2_2(object3, (Serializable)object2, n8);
                                ((ArrayList)object7).add(object4);
                                object4 = new qq2_2(null, n7);
                                ((ArrayList)object7).add(object4);
                                object2 = checkoutFragment.h;
                                if (object2 == null) {
                                    object2 = "checkOutViewModel";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    n10 = 0;
                                    object2 = null;
                                }
                                object2 = ((ps_0)object2).k;
                                n8 = 19;
                                object4 = new qq2_2(object2, null, n8);
                                ((ArrayList)object7).add(object4);
                                object4 = new qq2_2(null, n7);
                                ((ArrayList)object7).add(object4);
                                object2 = checkoutFragment.h;
                                if (object2 == null) {
                                    object2 = "checkOutViewModel";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    n10 = 0;
                                    object2 = null;
                                }
                                object2 = ((ps_0)object2).n;
                                n10 = ((ArrayList)object2).size();
                                n8 = 0;
                                object = null;
                                if (n10 != 0) {
                                    n10 = 1;
                                } else {
                                    n10 = 0;
                                    object2 = null;
                                }
                                object2 = n10 != 0;
                                if (object3 == null) {
                                    bl4 = true;
                                } else {
                                    bl4 = false;
                                    serializable = null;
                                }
                                serializable = bl4;
                                int n14 = 20;
                                object4 = new qq2_2(object2, serializable, n14);
                                ((ArrayList)object7).add(object4);
                                arrayList = new ArrayList<Object>((Collection<Object>)object7);
                                object4 = checkoutFragment.A;
                                if (object4 != null) {
                                    n3 = ((ArrayList)object4).size();
                                } else {
                                    n3 = 0;
                                    object4 = null;
                                }
                                if (n3 > 0) {
                                    n3 = (int)(checkoutFragment.l ? 1 : 0);
                                    if (n3 != 0) {
                                        checkoutFragment.l = false;
                                        n10 = 23;
                                        object4 = new qq2_2(null, n10);
                                        ((ArrayList)object7).add(object4);
                                    }
                                    object4 = checkoutFragment.A;
                                    Intrinsics.checkNotNull(object4);
                                    ((ArrayList)object7).addAll(object4);
                                }
                                if (object3 == null && (object4 = checkoutFragment.A) == null) {
                                    checkoutFragment.A = object4 = new ArrayList();
                                    Intrinsics.checkNotNull(object4);
                                    ((ArrayList)object7).addAll(object4);
                                }
                                if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object4 = checkoutFragment.E)) ? 1 : 0)) == 0) {
                                    object4 = new qq2_2(null, n7);
                                    object2 = checkoutFragment.E;
                                    n8 = 16;
                                    object6 = new qq2_2((String)object2, n8);
                                    ((ArrayList)object7).add(object4);
                                    ((ArrayList)object7).add(object6);
                                    arrayList.add(object4);
                                    arrayList.add(object6);
                                }
                                try {
                                    object6 = checkoutFragment.p;
                                    if (object6 == null) break block47;
                                    object6 = ((Fragment)object6).getViewLifecycleOwner();
                                    break block48;
                                }
                                catch (Exception exception2) {
                                    break block49;
                                }
                            }
                            n7 = 0;
                            object6 = null;
                        }
                        object = object6;
                        break block50;
                    }
                    object4 = yn3_0.a;
                    object2 = "CheckoutFragment";
                    ((yn3$a)object4).l((String)object2);
                    ((yn3$a)object4).e(exception2);
                    n8 = 0;
                    object = null;
                }
                checkoutFragment.v = object7;
                object6 = checkoutFragment.I;
                if (object6 != null) {
                    ((KT)object6).c();
                }
                if ((object6 = checkoutFragment.h) == null) {
                    object6 = "checkOutViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n7 = 0;
                    object6 = null;
                }
                object7 = this.Qa();
                object7 = ((kj2_1)object7).s;
                object4 = this.Qa();
                object4 = ((kj2_1)object4).w;
                object6.getClass();
                ps_0.b((PaymentInstruments)object7, (HashSet)object4);
                object6 = checkoutFragment.d;
                if (object6 == null) {
                    object6 = "recyclerView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n7 = 0;
                    object6 = null;
                }
                object6 = ((RecyclerView)object6).getAdapter();
                object7 = checkoutFragment.d;
                if (object7 == null) {
                    object7 = "recyclerView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    bl3 = false;
                    object7 = null;
                }
                ((RecyclerView)object7).setItemAnimator(null);
                object7 = checkoutFragment.d;
                if (object7 == null) {
                    object7 = "recyclerView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    bl3 = false;
                    object7 = null;
                }
                object7 = ((RecyclerView)object7).getRecycledViewPool();
                n3 = 8;
                object7 = ((RecyclerView$t)object7).a(n3);
                ((RecyclerView$t$a)object7).b = n4;
                object7 = ((RecyclerView$t$a)object7).a;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while ((n3 = ((ArrayList)object7).size()) > n4) {
                n3 = ((ArrayList)object7).size() - n4;
                ((ArrayList)object7).remove(n3);
            }
            if (object6 == null) {
                context = this.getContext();
                object2 = checkoutFragment.x;
                serializable = checkoutFragment.v;
                object7 = this.Qa();
                PaymentInstruments paymentInstruments = ((kj2_1)object7).s;
                dv_0 dv_02 = checkoutFragment.B;
                object7 = this.Qa();
                TenantResponse tenantResponse = ((kj2_1)object7).E;
                object7 = object6;
                object4 = this;
                checkoutFragment.o = object6 = new ys_1(context, this, (op2_2)object2, (mu1_1)object, (ArrayList)serializable, paymentInstruments, dv_02, this, tenantResponse);
                object6 = checkoutFragment.d;
                if (object6 == null) {
                    object6 = "recyclerView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object5 = object6;
                }
                object6 = checkoutFragment.o;
                ((RecyclerView)object5).setAdapter((RecyclerView$f)object6);
            } else {
                bl3 = object6 instanceof ys_1;
                if (bl3) {
                    object7 = object6;
                    object7 = (ys_1)object6;
                    context = this.getContext();
                    object2 = checkoutFragment.x;
                    serializable = checkoutFragment.v;
                    object4 = this.Qa();
                    PaymentInstruments paymentInstruments = ((kj2_1)object4).s;
                    dv_0 dv_03 = checkoutFragment.B;
                    object4 = this.Qa();
                    TenantResponse tenantResponse = ((kj2_1)object4).E;
                    object4 = this;
                    ((ys_1)object7).g(context, this, (op2_2)object2, (mu1_1)object, (ArrayList)serializable, paymentInstruments, dv_03, this, tenantResponse);
                    object7 = checkoutFragment.d;
                    if (object7 == null) {
                        object7 = "recyclerView";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    } else {
                        object5 = object7;
                    }
                    ((RecyclerView)object5).setAdapter((RecyclerView$f)object6);
                }
            }
            checkoutFragment.w = arrayList;
            this.h();
            if (bl2) {
                object6 = checkoutFragment.k;
                if (object6 == null) {
                    object6 = new Handler();
                    checkoutFragment.k = object6;
                }
                if ((object6 = checkoutFragment.k) != null) {
                    n4 = 0;
                    context = null;
                    object7 = new vt_0(this, 0);
                    long l2 = 500L;
                    object6.postDelayed((Runnable)object7, l2);
                }
            }
            if ((object6 = checkoutFragment.I) != null) {
                object7 = checkoutFragment.u;
                ((KT)object6).e((CartDeliveryAddress)object3, (Boolean)object7);
            }
            if ((object6 = checkoutFragment.I) != null) {
                ((KT)object6).a();
            }
            if ((object6 = checkoutFragment.I) != null) {
                ((KT)object6).b();
            }
            return;
        }
    }

    public final String S8() {
        return this.s;
    }

    public final void Sa(Error object) {
        Object object2 = this.q;
        if (object2 != null) {
            object2.dismiss();
        }
        if ((object2 = object != null ? ((Error)object).getCode() : null) != null) {
            object2 = this.y;
            if (object2 != null) {
                boolean bl2;
                ((PaymentActivity)object2).s0 = bl2 = true;
            }
            if (object2 != null) {
                String string2;
                if ((object = ((Error)object).getDescription()) == null) {
                    int n3 = R$string.review_bag_cart_error_msg;
                    object = this.getString(n3);
                    string2 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                }
                string2 = "<set-?>";
                Intrinsics.checkNotNullParameter(object, string2);
                ((PaymentActivity)object2).v0 = object;
            }
            if ((object = this.y) != null) {
                ((PaymentActivity)object).A2();
            }
        }
    }

    public final void T6() {
        ys_1 ys_12 = this.o;
        if (ys_12 != null) {
            ys_12.j = true;
            int n3 = ys_12.i;
            ys_12.notifyItemChanged(n3);
        }
    }

    public final void Ta(Cart cart) {
        boolean bl2;
        Object object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkOutViewModel");
            bl2 = false;
            object = null;
        }
        ((ps_0)object).j = cart;
        object = this.y;
        if (object != null && !(bl2 = object.isFinishing())) {
            object = this.y;
            if (object != null) {
                boolean bl3;
                ((PaymentActivity)object).x0 = bl3 = true;
            }
            if (object != null) {
                ((PaymentActivity)object).y0 = cart;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ua() {
        Object object;
        zo_2 zo_22;
        Object object2 = this.h;
        Object object3 = "checkOutViewModel";
        int n3 = 0;
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object2 = ((ps_0)object2).k;
        this.Ta((Cart)object2);
        cp_1.Companion.getClass();
        object2 = cp$a.e();
        Object object5 = this.h;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object5 = null;
        }
        object5 = ((ps_0)object5).j;
        object2.getClass();
        if (object5 != null) {
            object2 = ((Cart)object5).getBagTotalAmount();
            zo_22 = new zo_2((Cart)object5);
            object = ((Cart)object5).getBagDiscount();
            if ((object2 = (Unit)ai0_2.r(zo_22, object2, object)) == null) {
                cp_1.P((CartAndOrder)object5);
            }
        }
        object2 = this.Qa().D;
        object5 = TenantResponse.class;
        try {
            object2 = JsonUtils.fromJson((String)object2, object5);
            object2 = (TenantResponse)object2;
            if (object2 != null) {
                object5 = this.h;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object5 = null;
                }
                if ((object5 = ((ps_0)object5).j) != null && (object5 = ((TenantResponse)object2).getOrderSummary()) != null) {
                    float f5;
                    float f6;
                    int n4;
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n4 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    object = ((ps_0)object).j;
                    float f7 = 0.0f;
                    zo_22 = null;
                    if (object != null) {
                        f6 = ((Cart)object).getBagTotal();
                    } else {
                        n4 = 0;
                        f6 = 0.0f;
                        object = null;
                    }
                    object = Float.valueOf(f6);
                    ((OrderSummary)object5).setBagTotal((Float)object);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n4 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if ((object = ((ps_0)object).j) != null) {
                        f6 = ((Cart)object).getTotalBagSaving();
                    } else {
                        n4 = 0;
                        f6 = 0.0f;
                        object = null;
                    }
                    object = Float.valueOf(f6);
                    ((OrderSummary)object5).setBagSaving((Float)object);
                    object = cp$a.e();
                    Object object6 = this.h;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        object6 = null;
                        f5 = 0.0f;
                    }
                    object3 = ((ps_0)object6).j;
                    object.getClass();
                    if (object3 != null) {
                        object4 = ((Cart)object3).getEntries();
                    }
                    if (object4 != null) {
                        object4 = ((Cart)object3).getEntries();
                        n3 = object4.size();
                        f6 = 0.0f;
                        object = null;
                        for (n4 = 0; n4 < n3; ++n4) {
                            object6 = ((Cart)object3).getEntries();
                            if ((object6 = ((ArrayList)object6).get(n4)) == null) continue;
                            object6 = ((Cart)object3).getEntries();
                            object6 = ((ArrayList)object6).get(n4);
                            object6 = (CartEntry)object6;
                            object6 = ((CartEntry)object6).getMultiItemPromoAmt();
                            f7 = f5 = mz3_0.J((String)object6) + f7;
                        }
                    }
                    object3 = Float.valueOf(f7);
                    ((OrderSummary)object5).setPromoDiscount((Float)object3);
                }
            }
            object3 = this.Qa();
            if (object2 == null) {
                object3.getClass();
                return;
            }
            object4 = z40_0.Companion;
            object5 = ((Hj)object3).getApplication();
            object4.getClass();
            object4 = z40$a.a((Context)object5);
            object4 = ((z40_0)object4).a;
            object5 = "enableR1Points";
            n3 = ((ao0_0)object4).a((String)object5);
            object4 = n3 != 0;
            ((TenantResponse)object2).setMultipleWalletsSupported((Boolean)object4);
            ((kj2_1)object3).E = object2;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void Va() {
        CheckoutFragment checkoutFragment = this;
        Object object = null;
        int n3 = 1;
        km_1.a(AnalyticsManager.Companion, "single page checkout \u2013 payment failure");
        Object object2 = oT.a;
        Bundle bundle = new Bundle();
        Object object3 = oT.a;
        object2 = ((NewCustomEventsRevamp)object3).getREASON();
        Object object4 = "";
        bundle.putString((String)object2, (String)object4);
        object2 = ((NewCustomEventsRevamp)object3).getPAYMENT_MODE();
        bundle.putString((String)object2, (String)object4);
        object2 = ((NewCustomEventsRevamp)object3).getPAYMENT_AMOUNT();
        bundle.putString((String)object2, (String)object4);
        String string2 = oT.b;
        String string3 = oT.c;
        Object object5 = "single page checkout";
        ((NewCustomEventsRevamp)object3).newPushCustomScreenView("single page checkout \u2013 payment failure", (String)object5, string2, bundle, string3);
        this.l = n3;
        object2 = this.Qa();
        object3 = ((kj2_1)object2).w;
        Object object6 = "AJIO_CASH_WALLET";
        boolean n4 = ((HashSet)object3).contains(object6);
        if (n4) {
            object3 = ((kj2_1)object2).w;
            int n7 = ((HashSet)object3).size();
            if (n7 > n3) {
                ((kj2_1)object2).v = n3;
            }
        } else {
            object3 = ((kj2_1)object2).w;
            int n8 = ((HashSet)object3).size();
            if (n8 > 0) {
                ((kj2_1)object2).v = n3;
            }
        }
        object2 = this.Qa();
        boolean bl2 = false;
        object3 = null;
        ((kj2_1)object2).D = null;
        object2 = checkoutFragment.y;
        if (object2 != null) {
            ((PaymentActivity)object2).r0();
        }
        if ((object2 = checkoutFragment.h) == null) {
            object2 = "checkOutViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        object2 = checkoutFragment.I;
        Intrinsics.checkNotNull(object2);
        object2.getClass();
        QueryDeliveryAddress queryDeliveryAddress = new QueryDeliveryAddress();
        object2 = ((KT)object2).b.o;
        if (object2 != null) {
            if ((object2 = ((CartDeliveryAddress)object2).getId()) != null) {
                object4 = object2;
            }
            queryDeliveryAddress.setAddressId((String)object4);
        }
        Boolean bl3 = this.Qa().e.e();
        Boolean bl4 = this.Qa().e.f();
        Boolean bl5 = this.Qa().e.d();
        object3.getClass();
        String string4 = "single page checkout \u2013 payment failure";
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(queryDeliveryAddress, "queryDeliveryAddress");
        object2 = ((ps_0)object3).a.a(string4, queryDeliveryAddress, bl3, bl4, bl5);
        object6 = new gs_0(object3, 0);
        object5 = new HS(0, (Function1)object6);
        object = new A9(object3, n3);
        is_0 is_02 = new is_0((A9)object);
        object = ((g53_0)object2).f((o60_0)object5, is_02);
        ((ps_0)object3).r.b((yr0_2)object);
        object = Unit.a;
    }

    public final void W8(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "code");
        Object object2 = this.d;
        qq2_2 qq2_22 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            object2 = null;
        }
        if ((object2 = ((RecyclerView)object2).getAdapter()) != null && (bl2 = object2 instanceof ys_1)) {
            int n3;
            int n4;
            int n7;
            Object object3;
            block9: {
                block8: {
                    object2 = (ys_1)object2;
                    object3 = "walletCode";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    InternalWalletUtil.a.getClass();
                    Intrinsics.checkNotNullParameter(object2, "checkoutAdapter");
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = ((is2_1)object2).c;
                    Iterator iterator = object3.iterator();
                    n7 = 0;
                    while (true) {
                        boolean bl3 = iterator.hasNext();
                        n4 = -1;
                        if (!bl3) break block8;
                        Object object4 = iterator.next();
                        int n8 = n7 + 1;
                        if (n7 < 0) break;
                        object4 = (qq2_2)object4;
                        int n10 = ((qq2_2)object4).a;
                        int n14 = 29;
                        if (n10 == n14 && (object4 = ((qq2_2)object4).c) != null && (n10 = object4 instanceof InternalWalletDataHolder) != 0) {
                            Object object5 = ((InternalWalletDataHolder)(object4 = (InternalWalletDataHolder)object4)).getPaymentInstrumentInfo();
                            if (object5 != null) {
                                object5 = ((PaymentInstrumentInfo)object5).getCode();
                            } else {
                                n10 = 0;
                                object5 = null;
                            }
                            n10 = (int)(Intrinsics.areEqual(object5, object) ? 1 : 0);
                            if (n10 != 0) {
                                PaymentInstrumentInfo paymentInstrumentInfo = ((InternalWalletDataHolder)object4).getPaymentInstrumentInfo();
                                n10 = 0;
                                object5 = null;
                                int n15 = 12;
                                object = new InternalWalletDataHolder(false, paymentInstrumentInfo, null, null, n15, null);
                                int n16 = 32;
                                qq2_22 = new qq2_2((InternalWalletDataHolder)object, n16);
                                break block9;
                            }
                        }
                        n7 = n8;
                    }
                    xx_2.n();
                    throw null;
                }
                n7 = -1;
            }
            if (n7 > n4 && n7 < (n3 = ((ArrayList)object3).size()) && qq2_22 != null) {
                ((ArrayList)object3).set(n7, qq2_22);
                ((RecyclerView$f)object2).notifyItemChanged(n7);
            }
        }
    }

    public final void Wa(Cart object) {
        boolean bl2;
        this.C = bl2 = true;
        Object object2 = this.Qa();
        Hj hj = null;
        ((kj2_1)object2).D = null;
        object2 = this.h;
        if (object2 == null) {
            object2 = "checkOutViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            hj = object2;
        }
        ((ps_0)hj).m.clear();
        ((ps_0)hj).n.clear();
        ((ps_0)hj).p.clear();
        ((ps_0)hj).q.clear();
        object2 = new ts_1((Cart)object, (ps_0)hj);
        object = new o53_0((Callable)object2);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new DS(hj, 0);
        js_1 js_12 = new js_1(object2, 0);
        object2 = new ks_0(hj, 0);
        f9_0 f9_02 = new f9_0((Function1)object2);
        object = ((g53_0)object).f(js_12, f9_02);
        ((ps_0)hj).r.b((yr0_2)object);
    }

    public final void Xa(DataError object) {
        boolean bl2;
        sD3 sD32 = this.y;
        if (sD32 != null && !(bl2 = sD32.isFinishing())) {
            Object object2;
            jx0_1.Companion.getClass();
            sD32 = new jx0_1();
            if (object != null) {
                object2 = new Bundle();
                String string2 = "DATA_ERROR";
                object2.putSerializable(string2, (Serializable)object);
                ((Fragment)sD32).setArguments((Bundle)object2);
            }
            Intrinsics.checkNotNullParameter(this, "onEddFailClickListener");
            ((jx0_1)sD32).a = this;
            ((DialogFragment)sD32).setCancelable(false);
            object = this.y;
            Intrinsics.checkNotNull(object);
            object = ((FragmentActivity)object).getSupportFragmentManager();
            object2 = "EddErrorBottomSheetDialog";
            ((DialogFragment)sD32).show((FragmentManager)object, (String)object2);
        }
    }

    public final ArrayList Y8() {
        return this.Qa().i;
    }

    public final void Ya() {
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null && paymentActivity != null) {
            paymentActivity.b1();
        }
        hv3_0.p0(this.t);
        paymentActivity = this.f;
        if (paymentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerLayout");
            paymentActivity = null;
        }
        paymentActivity.setVisibility(0);
    }

    public final void a() {
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null && paymentActivity != null) {
            paymentActivity.r0();
        }
    }

    public final void c() {
        sD3 sD32;
        boolean bl2 = this.isAdded();
        if (bl2 && (sD32 = this.getActivity()) != null) {
            sD32 = new jb3_0();
            int n3 = this.a;
            ((Fragment)sD32).setTargetFragment(this, n3);
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string2 = "VerifyOtpBottomSheetFragment";
            ((DialogFragment)sD32).show(fragmentManager, string2);
        }
    }

    public final void c1() {
        boolean bl2;
        boolean bl3;
        ToggleButton toggleButton = this.j;
        if (toggleButton != null && (bl3 = toggleButton.isChecked()) == (bl2 = true)) {
            toggleButton = this.j;
            if (toggleButton != null) {
                toggleButton.toggle();
            }
            bl3 = false;
            toggleButton = null;
            this.j = null;
        }
    }

    public final PriceValidation c2() {
        return this.Qa().f;
    }

    public final void g2() {
        String string2 = "non deliverable";
        this.w6("", string2);
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null) {
            int n3 = 71;
            paymentActivity.setResult(n3);
        }
        if ((paymentActivity = this.y) != null) {
            paymentActivity.finish();
        }
    }

    public final boolean g6() {
        return (Boolean)this.Qa().A.getValue();
    }

    public final InstantDiscountInfo g8() {
        return this.Qa().z;
    }

    public final String getAjioTitle() {
        return null;
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return hv3_0.K(R$string.order_confirmation);
    }

    public final void h() {
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null && paymentActivity != null) {
            paymentActivity.b1();
        }
        hv3_0.s0(this.t);
        paymentActivity = this.f;
        if (paymentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerLayout");
            paymentActivity = null;
        }
        paymentActivity.setVisibility(8);
    }

    public final Boolean hasBackButton() {
        return null;
    }

    public final PaymentInstruments j0() {
        return this.Qa().s;
    }

    public final void j5() {
        Bundle bundle = new Bundle();
        boolean bl2 = true;
        bundle.putBoolean("isAddressNeeded", bl2);
        bundle.putBoolean("isGoogleLocationEnable", bl2);
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null) {
            NewAddressActivity$a newAddressActivity$a = NewAddressActivity.Companion;
            newAddressActivity$a.getClass();
            NewAddressActivity$a.a((Context)paymentActivity, this, bundle);
        }
    }

    public final void k(ToggleButton toggleButton, int n3) {
        boolean bl2;
        boolean bl3;
        Object object = this.j;
        if (object != null && (bl3 = object.isChecked()) == (bl2 = true) && (object = this.j) != toggleButton && object != null) {
            object.toggle();
        }
        this.j = toggleButton;
        boolean bl4 = this.C;
        if (!bl4) {
            toggleButton = this.k;
            if (toggleButton == null) {
                toggleButton = new Handler();
                this.k = toggleButton;
            }
            if ((toggleButton = this.k) != null) {
                object = new yT(this, n3);
                long l2 = 50;
                toggleButton.postDelayed((Runnable)object, l2);
            }
        }
        this.C = false;
    }

    public final void l3() {
        hv3_0.S(this.y);
        Object object = this.o;
        if (object != null) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                object = null;
            }
            zt_0 zt_02 = new zt_0(this, 0);
            object.post((Runnable)zt_02);
        }
    }

    public final void m1() {
        Object object = oT.a;
        NewCustomEventsRevamp newCustomEventsRevamp = oT.a;
        String string2 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
        String string3 = oT.b;
        String string4 = oT.c;
        String string5 = "change address click";
        String string6 = "";
        String string7 = "change_address_click";
        String string8 = "single page checkout";
        String string9 = "single page checkout";
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string8, string9, string3, null, string4, false, null, n3, null);
        object = this.y;
        if (object != null) {
            int n4 = 70;
            object.setResult(n4);
            object.finish();
        }
    }

    public final ConvenienceFee n5() {
        Object object = this.h;
        ConvenienceFee convenienceFee = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkOutViewModel");
            object = null;
        }
        if ((object = ((ps_0)object).k) != null) {
            convenienceFee = ((Cart)object).getConvenienceFee();
        }
        return convenienceFee;
    }

    public final TenantResponse n8() {
        return this.Qa().E;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        int n7 = this.a;
        if (n3 == n7 && n4 == (n3 = -1)) {
            g g3;
            boolean bl2;
            Serializable serializable;
            Object object;
            Object object2 = this.Qa().E;
            n7 = 0;
            intent = null;
            if (object2 != null && (object2 = ((TenantResponse)object2).getCartInternalWalletsEnabled()) != null && (n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0)) != 0) {
                object2 = this.Qa();
                object = this.Qa();
                serializable = this.Qa().E;
                serializable = serializable != null ? ((TenantResponse)serializable).getInternalWallets() : null;
                object.getClass();
                object = kj2_1.b(serializable);
                object2.getClass();
                serializable = "<set-?>";
                Intrinsics.checkNotNullParameter(object, (String)((Object)serializable));
                ((kj2_1)object2).w = object;
            }
            if ((object2 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                n4 = 0;
                object2 = null;
            }
            if ((object2 = ((RecyclerView)object2).getAdapter()) != null && (bl2 = object2 instanceof ys_1)) {
                boolean bl3;
                object2 = (ys_1)object2;
                object = this.Qa().w;
                serializable = "internalWalletSelectedViews";
                Intrinsics.checkNotNullParameter(object, (String)((Object)serializable));
                InternalWalletUtil.a.getClass();
                Intrinsics.checkNotNullParameter(object2, "checkoutAdapter");
                Intrinsics.checkNotNullParameter(object, (String)((Object)serializable));
                serializable = ((is2_1)object2).c;
                Iterator iterator = serializable.iterator();
                int n8 = -1;
                int n10 = 0;
                float f5 = 0.0f;
                Object object3 = null;
                while (bl3 = iterator.hasNext()) {
                    Object object4 = iterator.next();
                    int n14 = n10 + 1;
                    if (n10 >= 0) {
                        object4 = (qq2_2)object4;
                        int n15 = ((qq2_2)object4).a;
                        int n16 = 28;
                        if (n15 == n16) {
                            n8 = n10;
                        } else {
                            object3 = ((qq2_2)object4).c;
                            if (object3 != null && (bl3 = object3 instanceof InternalWalletDataHolder)) {
                                String string2;
                                object3 = (InternalWalletDataHolder)object3;
                                ((InternalWalletDataHolder)object3).setDisable(false);
                                object4 = ((InternalWalletDataHolder)object3).getPaymentInstrumentInfo();
                                if (object4 != null && (object4 = ((PaymentInstrumentInfo)object4).getCode()) != null && (n15 = (int)(Intrinsics.areEqual(string2 = "AJIO_CASH_WALLET", object4) ? 1 : 0)) != 0) {
                                    float f6;
                                    object3 = ((InternalWalletDataHolder)object3).getPaymentInstrumentInfo();
                                    n15 = 0;
                                    string2 = null;
                                    if (object3 != null && (object3 = ((PaymentInstrumentInfo)object3).getAmount()) != null) {
                                        f5 = ((Float)object3).floatValue();
                                    } else {
                                        n10 = 0;
                                        f5 = 0.0f;
                                        object3 = null;
                                    }
                                    n10 = (int)((f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                                    if (n10 > 0) {
                                        ((HashSet)object).add(object4);
                                    }
                                }
                            }
                        }
                        n10 = n14;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                if (n8 > n3 && n8 < (n3 = serializable.size())) {
                    serializable.remove(n8);
                }
                ((RecyclerView$f)object2).notifyDataSetChanged();
            }
            if ((g3 = this.p) != null && (n4 = ((HashSet)(object2 = g3.Wa().w)).size()) > 0) {
                g3.Oa();
            }
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = (PaymentActivity)this.getActivity();
        this.y = object2;
        boolean bl2 = object instanceof do2_0;
        if (bl2) {
            object = (do2_0)object;
            this.c = object;
            return;
        }
        object = pn_2.b(object, " Must implement PaymentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = new AddressRepo();
        Object object3 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object4, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string4);
        Object object6 = v33.class;
        String string5 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object5, object6, string5);
        object4 = "<this>";
        object5 = sw0_0.a(object6, (String)object4, object6, string5, string5);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object6 = object5.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string7.concat((String)object6);
            this.i = object3 = (v33)((pD3)object3).a((yn1_2)object5, (String)object6);
            object5 = this.requireActivity().getApplication();
            object6 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
            object3 = new UserRepo((Application)object5);
            object5 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = object5;
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, string3);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object5 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object5, string4);
            Class clazz = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object5, clazz, string5);
            object3 = sw0_0.a(clazz, (String)object4, clazz, string5, string5);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object5 = object3.getQualifiedName();
            if (object5 != null) {
                object5 = string7.concat((String)object5);
                this.g = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object5);
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object3 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object5 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(object3, string3);
                Intrinsics.checkNotNullParameter(object5, string4);
                clazz = ps_0.class;
                object = rl3_0.b((rd3_0)object, (E$b)object3, (Wd0)object5, clazz, string5);
                object3 = sw0_0.a(clazz, (String)object4, clazz, string5, string5);
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object5 = object3.getQualifiedName();
                if (object5 != null) {
                    object5 = string7.concat((String)object5);
                    this.h = object = (ps_0)((pD3)object).a((yn1_2)object3, (String)object5);
                    Intrinsics.checkNotNullParameter(this, (String)object2);
                    object = this.getViewModelStore();
                    Intrinsics.checkNotNullParameter(this, (String)object2);
                    object3 = this.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(this, (String)object2);
                    object2 = this.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullParameter(object, string2);
                    Intrinsics.checkNotNullParameter(object3, string3);
                    Intrinsics.checkNotNullParameter(object2, string4);
                    object5 = wx1_1.class;
                    object = rl3_0.b((rd3_0)object, (E$b)object3, (Wd0)object2, object5, string5);
                    object2 = sw0_0.a(object5, (String)object4, object5, string5, string5);
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    object3 = object2.getQualifiedName();
                    if (object3 != null) {
                        object3 = string7.concat((String)object3);
                        object = (wx1_1)((pD3)object).a((yn1_2)object2, (String)object3);
                        object = z40_0.Companion;
                        object2 = this.requireActivity().getApplication();
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                        object.getClass();
                        this.D = object = z40$a.a((Context)object2).a.b("payment_trust_marker_message");
                        object = this.requireActivity().getApplication();
                        Intrinsics.checkNotNullExpressionValue(object, (String)object6);
                        this.E = object = z40$a.a((Context)object).a.b("payment_bottom_message");
                        object2 = this.Qa();
                        object3 = this.h;
                        object4 = "checkOutViewModel";
                        object5 = null;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            object3 = null;
                        }
                        this.I = object = new KT((kj2_1)object2, (ps_0)object3);
                        object = f00.a;
                        if (object != null) {
                            object = this.h;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object = null;
                            }
                            ((ps_0)object).k = object2 = f00.a;
                            f00.a = null;
                            object = this.Qa();
                            object2 = this.h;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object2 = null;
                            }
                            ((kj2_1)object).t = object2 = ((ps_0)object2).k;
                            object = this.h;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object = null;
                            }
                            if ((object2 = this.h) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object2 = null;
                            }
                            object2 = (object2 = ((ps_0)object2).k) != null ? ((Cart)object2).getDeliveryAddress() : null;
                            ((ps_0)object).o = object2;
                        }
                        if ((object = f00.b) != null) {
                            f00.b = null;
                            object2 = this.h;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object2 = null;
                            }
                            ((ps_0)object2).i = object;
                        }
                        f00.a = null;
                        f00.b = null;
                        object = this.getArguments();
                        if (object != null) {
                            object2 = "envmode";
                            object.getInt((String)object2);
                        }
                        this.setArguments(null);
                        object = this.h;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        } else {
                            object5 = object;
                        }
                        object = ((ps_0)object5).k;
                        if (object == null && (object = this.getActivity()) != null) {
                            object = this.requireActivity();
                            object.finish();
                        }
                        this.Qa().e.c();
                        return;
                    }
                    object2 = string6.toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
                object2 = string6.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = string6.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_checkout_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        String string2;
        super.onDestroy();
        no2_0.a = string2 = "";
        no2_0.b = string2;
        string2 = this.k;
        if (string2 != null) {
            string2.removeCallbacksAndMessages(null);
        }
    }

    public void onPaymentToggleChange(boolean bl2) {
        ys_1 ys_12 = this.o;
        if (ys_12 != null) {
            String string2 = "<set-?>";
            String string3 = "datalist";
            if (!bl2) {
                Object object = this.w;
                Intrinsics.checkNotNullParameter(object, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                ys_12.c = object;
                object = this.o;
                if (object != null) {
                    ((RecyclerView$f)object).notifyDataSetChanged();
                }
                return;
            }
            Object object = this.v;
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object, string2);
            ys_12.c = object;
            object = this.o;
            if (object != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = this.p;
        if (object != null) {
            ((g)object).c = this;
        }
        object = ss_1.a;
        object = "mScrollEventStatus";
        boolean[] blArray = this.z;
        Intrinsics.checkNotNullParameter(blArray, (String)object);
        int n3 = blArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            blArray[i3] = false;
        }
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.m;
        String string2 = "single page checkout";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        boolean bl2;
        block24: {
            block23: {
                int n3;
                Intrinsics.checkNotNullParameter(object, "view");
                super.onViewCreated((View)object, (Bundle)object2);
                int n4 = R$id.checkout_shimmer;
                object2 = (ShimmerFrameLayout)object.findViewById(n4);
                this.t = object2;
                n4 = R$id.checkout_layout_shimmer;
                object2 = object.findViewById(n4);
                this.f = object2;
                n4 = R$id.fragment_checkout_rv;
                object = (RecyclerView)object.findViewById(n4);
                this.d = object;
                bl2 = og1_1.b();
                object2 = "recyclerView";
                object4 = null;
                if (bl2) {
                    object = this.d;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        bl2 = false;
                        object = null;
                    }
                    n3 = hv3_0.m(R$color.luxe_color_F5F5F5);
                    object.setBackgroundColor(n3);
                }
                object3 = this.y;
                Intrinsics.checkNotNull(object3);
                object = new LinearLayoutManager((Context)object3);
                this.e = object;
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                if ((object3 = this.e) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
                    n3 = 0;
                    object3 = null;
                }
                object.setLayoutManager((RecyclerView$o)object3);
                object = this.y;
                if (object != null) {
                    object.r0 = "";
                    n3 = 0;
                    object3 = null;
                    object.w0 = false;
                    object.s0 = false;
                    object.x0 = false;
                    object.y0 = null;
                }
                if (object == null) break block23;
                object = object.p0;
                if (object != null) break block24;
                object = "redirectingProgressView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            }
            bl2 = false;
            object = null;
        }
        this.q = object;
        object = this.g;
        object3 = "userViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object = null;
        }
        object = object.l;
        Object object5 = this.getViewLifecycleOwner();
        int n7 = 0;
        Object object6 = new st_0(this, 0);
        Object object7 = new CheckoutFragment$c((Function1)object6);
        object.e((mu1_1)object5, (F62)object7);
        object = this.i;
        object5 = "shippingViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.d;
        object6 = this.getViewLifecycleOwner();
        int n8 = 0;
        object7 = new bt_1(this, 0);
        CheckoutFragment$c checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.f;
        object5 = this.getViewLifecycleOwner();
        n7 = 0;
        object6 = new ct_1(this, 0);
        object7 = new CheckoutFragment$c((Function1)object6);
        object.e((mu1_1)object5, (F62)object7);
        object = this.h;
        object5 = "checkOutViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.b;
        object6 = this.getViewLifecycleOwner();
        n8 = 0;
        object7 = new dt_0(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.d;
        object6 = this.getViewLifecycleOwner();
        n8 = 0;
        object7 = new et_0(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.s;
        object6 = this.getViewLifecycleOwner();
        n8 = 0;
        object7 = new ft_1(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.t;
        object6 = this.getViewLifecycleOwner();
        n8 = 0;
        object7 = new gt_0(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.h;
        object6 = this.getViewLifecycleOwner();
        object7 = new ht_1(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.Qa().b;
        object6 = this.getViewLifecycleOwner();
        object7 = new it_0(0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.Qa().d;
        object6 = this.getViewLifecycleOwner();
        object7 = new tt_1(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.Qa().C;
        object6 = this.getViewLifecycleOwner();
        n8 = 0;
        object7 = new at_1(this, 0);
        checkoutFragment$c = new CheckoutFragment$c((Function1)object7);
        object.e((mu1_1)object6, checkoutFragment$c);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object = object.o;
        int n10 = 1;
        if (object == null) {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                object = null;
            }
            object.getClass();
            this.Ra(n10 != 0);
        } else {
            this.Ya();
            this.Pa();
        }
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object = null;
        }
        object3 = object.g.getUserProfile(n10 != 0);
        n10 = 1;
        object5 = new eo2_2(object, n10);
        object6 = new r23_0(1, (Function1)object5);
        n7 = 2;
        object5 = new fv_2(object, n7);
        n8 = 1;
        object7 = new Fy1(object5, n8);
        object3 = ((g53_0)object3).f((o60_0)object6, (o60_0)object7);
        object.x.b((yr0_2)object3);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object4 = object;
        }
        object = new CheckoutFragment$b(this);
        ((RecyclerView)object4).addOnScrollListener((RecyclerView$s)object);
    }

    public final void r0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.r = string2;
    }

    public final void r1() {
        this.c1();
        Object object = this.I;
        if (object != null) {
            Bundle bundle = new Bundle();
            object = ((KT)object).a.f;
            if (object != null && (object = ((PriceValidation)object).getPriceSplitup()) != null && (object = ((PriceSplitUp)object).getConvenienceFee()) != null) {
                object = mz3_0.f((ConvenienceFeePriceSplitUp)object);
                bundle.putAll((Bundle)object);
            }
            object = oT.a;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            object = AnalyticsManager.Companion;
            String string2 = bv_0.a((AnalyticsManager$Companion)object);
            String string3 = cv_0.a((AnalyticsManager$Companion)object);
            NewCustomEventsRevamp newCustomEventsRevamp = oT.a;
            String string4 = "COD convenience fee screen interactions";
            String string5 = "choose another payment mode click";
            String string6 = "";
            String string7 = "choose_another_payment_click";
            String string8 = "COD convenience fee screen";
            String string9 = "COD convenience fee screen";
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string5, string6, string7, string8, string9, string2, bundle, string3, false, null, n3, null);
        }
    }

    public final void s8(ArrayList arrayList, dv_0 dv_02, op2_2 op2_22) {
        Intrinsics.checkNotNullParameter(arrayList, "dataset");
        Intrinsics.checkNotNullParameter(dv_02, "clickListener");
        Intrinsics.checkNotNullParameter(op2_22, "paymentViewModel");
        hv3_0.S(this.y);
        this.A = arrayList;
        this.B = dv_02;
        this.x = op2_22;
        this.Ra(false);
    }

    public final void t0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "number");
        this.s = string2;
    }

    public final String t2() {
        return this.r;
    }

    public final void v9() {
        boolean bl2;
        PaymentActivity paymentActivity = this.y;
        if (paymentActivity != null && !(bl2 = paymentActivity.isFinishing()) && (paymentActivity = this.y) != null) {
            int n3 = 71;
            paymentActivity.setResult(n3);
            paymentActivity.finish();
        }
    }

    public final void w6(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "eventLabel");
        Intrinsics.checkNotNullParameter(string3, "eventAction");
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)object);
        object = ((jo_2)object2).a();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && (object2 = ((jo_2)object2).a()) != null) {
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userViewModel");
                object2 = null;
            }
            object2 = ((hy3_0)object2).k();
            Intrinsics.checkNotNullExpressionValue(object2, "getLoggedInStatus(...)");
            object = "single page checkout";
            GAEcommerceEvents.pushPaymentEvent(string2, string3, (String)object, (String)object2);
        }
    }

    public final boolean z5() {
        return this.l;
    }
}

