/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.FragmentManager
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioCustomLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExchangeReturnVerifyActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a$a;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import com.ril.ajio.services.data.Order.BankDetails;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.Order.ImageDetail;
import com.ril.ajio.services.data.Order.ReturnData;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryIntitateRequestReturn;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class ExchangeReturnVerifyActivity
extends Hilt_ExchangeReturnVerifyActivity
implements th2_0,
OnNavigationClickListener,
sk_1,
OnFragmentInteractionListener {
    public static final /* synthetic */ int Y0;
    public IfscResponse A0;
    public AjioCircularImageView B0;
    public ae0_2 C0;
    public ae0_2 D0;
    public hy3_0 E0;
    public db2_1 F0;
    public CustomToolbarViewMerger G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public final NewEEcommerceEventsRevamp L0;
    public final NewCustomEventsRevamp M0;
    public final String N0;
    public final String O0;
    public final hh3_2 P0;
    public LinearLayout Q0;
    public AjioTextView R0;
    public LinearLayout S0;
    public int T0;
    public final hh3_2 U0;
    public String V0;
    public float W0;
    public String X0;
    public final String p0;
    public final String q0;
    public RecyclerView r0;
    public ReturnOrderItemDetails s0;
    public HashMap t0;
    public boolean u0;
    public AjioButton v0;
    public AjioButton w0;
    public LinearLayout x0;
    public AjioLoaderView y0;
    public wf1_2 z0;

    public ExchangeReturnVerifyActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        this.p0 = "product_id";
        this.q0 = "product_name";
        Object object = AnalyticsManager.Companion;
        this.L0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.M0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.N0 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.O0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
        object = new pd0_2(this, 0);
        this.P0 = object = yr1_2.b((Function0)object);
        this.T0 = -1;
        object = new qd0_2(this);
        this.U0 = object = yr1_2.b((Function0)object);
        this.V0 = object = "";
        this.X0 = object;
    }

    public final void I0(int n3) {
        hv3_0.S(this);
        int n4 = R$id.rb_ajiostorecredits;
        boolean bl2 = true;
        if (n3 == n4) {
            ReturnOrderItemDetails returnOrderItemDetails = this.s0;
            Intrinsics.checkNotNull(returnOrderItemDetails);
            String string2 = "storeCredit";
            returnOrderItemDetails.setSelectedRefundOption(string2);
            returnOrderItemDetails = this.s0;
            Intrinsics.checkNotNull(returnOrderItemDetails);
            returnOrderItemDetails.setRefundToBankSelected(false);
            returnOrderItemDetails = this.s0;
            Intrinsics.checkNotNull(returnOrderItemDetails);
            returnOrderItemDetails.setAjioStoreCreditsSelected(bl2);
        } else {
            n4 = R$id.rb_banktransfer;
            if (n3 == n4) {
                ReturnOrderItemDetails returnOrderItemDetails = this.s0;
                Intrinsics.checkNotNull(returnOrderItemDetails);
                returnOrderItemDetails.setSelectedRefundOption("bankTransfer");
                returnOrderItemDetails = this.s0;
                Intrinsics.checkNotNull(returnOrderItemDetails);
                returnOrderItemDetails.setRefundToBankSelected(bl2);
                returnOrderItemDetails = this.s0;
                Intrinsics.checkNotNull(returnOrderItemDetails);
                returnOrderItemDetails.setAjioStoreCreditsSelected(false);
                returnOrderItemDetails = new Handler();
                bl2 = false;
                wd0_1 wd0_12 = new wd0_1(this, 0);
                long l2 = 200L;
                returnOrderItemDetails.postDelayed(wd0_12, l2);
            }
        }
    }

    public final void S() {
        Object object = this.E0;
        Intrinsics.checkNotNull(object);
        object = ((hy3_0)object).k();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.E0;
            Intrinsics.checkNotNull(object);
            object = ((hy3_0)object).k();
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        GAEcommerceEvents.pushIFSCBottomSheetEvent((String)object, "exchange/return screen");
        object = new com.ril.ajio.myaccount.order.imps.b();
        androidx.fragment.app.FragmentManager fragmentManager = this.getSupportFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "IFSCBottomSheetFragment");
    }

    public final void U(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "eventLabel");
        Intrinsics.checkNotNullParameter(string3, "ifscValue");
        Object object = this.E0;
        Intrinsics.checkNotNull(object);
        object = ((hy3_0)object).k();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.E0;
            Intrinsics.checkNotNull(object);
            object = ((hy3_0)object).k();
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        GAEcommerceEvents.pushIfscEvent(string2, "bank form", "exchange/return screen", (String)object, "formErrorEvent", "formErrorEvent", string3);
    }

    public final void k(boolean bl2) {
        AB0.a().post("finish");
        this.finish();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onActivityResult(int var1_1, int var2_2, Intent var3_3) {
        block36: {
            block37: {
                block38: {
                    super.onActivityResult(var1_1, var2_2, (Intent)var3_3);
                    var4_4 = 29 != 0;
                    var5_5 = 0;
                    var6_6 = null;
                    var7_7 = 33;
                    var8_8 = -1;
                    var9_9 = 8;
                    if (var1_1 != var4_4 || var2_2 != var8_8) break block37;
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    Intrinsics.checkNotNull(var3_3);
                    var2_2 = Build.VERSION.SDK_INT;
                    if (var2_2 >= var7_7) {
                        var11_12 = at_0.a((Intent)var3_3);
                    } else {
                        var11_12 = var3_3.getSerializableExtra("RETURN_ITEMS_ADDRESS_DATA");
                        var4_4 = var11_12 instanceof CartDeliveryAddress;
                        if (var4_4) {
                            var6_6 = var11_12;
                        }
                        var11_12 = var6_6;
                        var11_12 = (CartDeliveryAddress)var6_6;
                    }
                    var11_12 = (CartDeliveryAddress)var11_12;
                    var10_10.setDeliveryAddress((CartDeliveryAddress)var11_12);
                    var10_10 = "IS_WARE_HOUSE_ADDRESS";
                    var2_2 = (int)var3_3.hasExtra((String)var10_10);
                    var4_4 = true;
                    if (var2_2 != 0 && (var1_1 = (int)var3_3.getBooleanExtra((String)var10_10, false)) != 0) {
                        var1_1 = 1;
                    } else {
                        var1_1 = 0;
                        var10_10 = null;
                    }
                    var11_12 = this.s0;
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = var11_12.getDeliveryAddress();
                    var11_12.setSelfShipAddress((boolean)var1_1);
                    var10_10 = this.x0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10.setVisibility(0);
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    if (var10_10 == null) break block38;
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    var1_1 = var10_10.size();
                    if (var1_1 <= 0) break block38;
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    var1_1 = var10_10.size();
                    var11_12 = null;
                    for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                        block40: {
                            block39: {
                                var3_3 = this.s0;
                                Intrinsics.checkNotNull(var3_3);
                                var3_3 = var3_3.getDeliveryAddress();
                                var12_14 = var3_3.isReverseService();
                                if (!var12_14) break block39;
                                var3_3 = this.s0;
                                Intrinsics.checkNotNull(var3_3);
                                var3_3 = var3_3.getDeliveryAddress();
                                var12_14 = var3_3.isExchangeService();
                                if (var12_14 || (var12_14 = (var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry()).getIsReturnItem()) || !(var12_14 = (var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry()).getIsExchangeItem())) break block39;
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setReturnEligible(var4_4);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setExchangeEligible(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setIsExchangeItem(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setIsReturnItem(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().reset();
                                var3_3 = this.x0;
                                Intrinsics.checkNotNull(var3_3);
                                var3_3.setVisibility(var9_9);
                                break block40;
                            }
                            var3_3 = this.s0;
                            Intrinsics.checkNotNull(var3_3);
                            var3_3 = var3_3.getDeliveryAddress();
                            var12_14 = var3_3.isReverseService();
                            if (var12_14) ** GOTO lbl-1000
                            var3_3 = this.s0;
                            Intrinsics.checkNotNull(var3_3);
                            var3_3 = var3_3.getDeliveryAddress();
                            var12_14 = var3_3.isExchangeService();
                            if (!var12_14) {
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setReturnEligible(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setExchangeEligible(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setIsExchangeItem(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setIsReturnItem(false);
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().reset();
                                var3_3 = this.x0;
                                Intrinsics.checkNotNull(var3_3);
                                var3_3.setVisibility(var9_9);
                            } else if (!(var12_14 = (var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry()).getIsReturnItem()) && !(var12_14 = (var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry()).getIsExchangeItem())) {
                                var3_3 = this.x0;
                                Intrinsics.checkNotNull(var3_3);
                                var3_3.setVisibility(var9_9);
                            }
                        }
                        var3_3 = this.s0;
                        Intrinsics.checkNotNull(var3_3);
                        var3_3 = var3_3.getDeliveryAddress();
                        var12_14 = var3_3.isSelfShipAddress();
                        if (var12_14) {
                            var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                            var3_3.setReturnEligible(var4_4);
                            continue;
                        }
                        var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                        var3_3.setReturnEligible(false);
                    }
                }
                var10_10 = this.s0;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.getDeliveryAddress();
                var1_1 = (int)var10_10.isExchangeService();
                if (var1_1 != 0) {
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    if (var10_10 != null) {
                        var10_10 = this.s0;
                        Intrinsics.checkNotNull(var10_10);
                        var10_10 = var10_10.getConsignment().getEntries();
                        var1_1 = var10_10.size();
                        if (var1_1 > 0) {
                            var10_10 = this.s0;
                            Intrinsics.checkNotNull(var10_10);
                            var10_10 = var10_10.getConsignment().getEntries();
                            var1_1 = var10_10.size();
                            var11_12 = null;
                            for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                                ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setExchangeEligible(var4_4);
                                var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                                var3_3.setReturnEligible(var4_4);
                            }
                        }
                    }
                } else {
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getDeliveryAddress();
                    var1_1 = (int)var10_10.isReverseService();
                    if (var1_1 != 0) {
                        var10_10 = this.s0;
                        Intrinsics.checkNotNull(var10_10);
                        var10_10 = var10_10.getConsignment().getEntries();
                        if (var10_10 != null) {
                            var10_10 = this.s0;
                            Intrinsics.checkNotNull(var10_10);
                            var10_10 = var10_10.getConsignment().getEntries();
                            var1_1 = var10_10.size();
                            if (var1_1 > 0) {
                                var10_10 = this.s0;
                                Intrinsics.checkNotNull(var10_10);
                                var10_10 = var10_10.getConsignment().getEntries();
                                var1_1 = var10_10.size();
                                var11_12 = null;
                                for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                                    ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setExchangeEligible(false);
                                    var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                                    var3_3.setReturnEligible(var4_4);
                                }
                            }
                        }
                    } else {
                        var10_10 = this.s0;
                        Intrinsics.checkNotNull(var10_10);
                        var10_10 = var10_10.getConsignment().getEntries();
                        if (var10_10 != null) {
                            var10_10 = this.s0;
                            Intrinsics.checkNotNull(var10_10);
                            var10_10 = var10_10.getConsignment().getEntries();
                            var1_1 = var10_10.size();
                            if (var1_1 > 0) {
                                var10_10 = this.s0;
                                Intrinsics.checkNotNull(var10_10);
                                var10_10 = var10_10.getConsignment().getEntries();
                                var1_1 = var10_10.size();
                                var11_12 = null;
                                for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                                    ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry().setExchangeEligible(false);
                                    var3_3 = this.s0;
                                    Intrinsics.checkNotNull(var3_3);
                                    var3_3 = var3_3.getDeliveryAddress();
                                    var12_14 = var3_3.isSelfShipAddress();
                                    if (var12_14) {
                                        var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                                        var3_3.setReturnEligible(var4_4);
                                        continue;
                                    }
                                    var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                                    var3_3.setReturnEligible(false);
                                }
                            }
                        }
                    }
                }
                var10_10 = this.s0;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.getValidExchangableProducts();
                if (var10_10 == null) ** GOTO lbl-1000
                var10_10 = this.s0;
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.getValidExchangableProducts();
                var1_1 = var10_10.size();
                if (var1_1 > 0) {
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    var1_1 = var10_10.size();
                    var11_12 = null;
                    block4: for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                        var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                        var6_6 = this.s0;
                        Intrinsics.checkNotNull(var6_6);
                        var6_6 = var6_6.getValidExchangableProducts();
                        var5_5 = var6_6.size();
                        for (var7_7 = 0; var7_7 < var5_5; ++var7_7) {
                            var13_16 = var3_3.getProduct().getCode();
                            var14_17 = this.s0;
                            Intrinsics.checkNotNull(var14_17);
                            var14_17 = (String)var14_17.getValidExchangableProducts().get(var7_7);
                            var8_8 = (int)b.i(var13_16, (String)var14_17, var4_4);
                            if (var8_8 != 0) {
                                var6_6 = this.s0;
                                Intrinsics.checkNotNull(var6_6);
                                var6_6 = var6_6.getDeliveryAddress();
                                var5_5 = (int)var6_6.isExchangeService();
                                if (var5_5 != 0) {
                                    var3_3.setExchangeEligible(var4_4);
                                    continue block4;
                                }
                                var3_3.setExchangeEligible(false);
                                continue block4;
                            }
                            var3_3.setExchangeEligible(false);
                        }
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var10_10 = this.s0;
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.getConsignment().getEntries();
                    var1_1 = var10_10.size();
                    var11_12 = null;
                    for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                        var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                        var3_3.setExchangeEligible(false);
                    }
                }
                break block36;
            }
            var4_4 = 23 != 0;
            if (var1_1 != var4_4 || var2_2 != var8_8) break block36;
            Intrinsics.checkNotNull(var3_3);
            var10_11 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION";
            var1_1 = var3_3.getIntExtra((String)var10_11, 0);
            var2_2 = Build.VERSION.SDK_INT;
            if (var2_2 >= var7_7) {
                var11_13 = id0_1.a((Intent)var3_3);
            } else {
                var11_13 = var3_3.getSerializableExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY");
                var4_4 = var11_13 instanceof CartEntry;
                if (var4_4) {
                    var6_6 = var11_13;
                }
                var11_13 = var6_6;
                var11_13 = (CartEntry)var6_6;
            }
            var11_13 = (CartEntry)var11_13;
            var15_18 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE";
            this.T0 = var12_15 = var3_3.getIntExtra(var15_18, var8_8);
            ((CartEntry)ho_0.a(this.s0, var1_1)).setOrderEntry((CartEntry)var11_13);
            var11_13 = new Handler();
            var3_3 = new rd0_1(this, var1_1);
            var16_19 = 100;
            var11_13.postDelayed((Runnable)var3_3, var16_19);
            var10_11 = this.s0;
            Intrinsics.checkNotNull(var10_11);
            var10_11 = var10_11.getConsignment().getEntries();
            var1_1 = var10_11.size();
            var11_13 = null;
            for (var2_2 = 0; var2_2 < var1_1; ++var2_2) {
                var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry();
                var12_15 = (int)var3_3.getIsReturnItem();
                if (var12_15 == 0 && (var12_15 = (int)(var3_3 = ((CartEntry)ho_0.a(this.s0, var2_2)).getOrderEntry()).getIsExchangeItem()) == 0) {
                    var3_3 = this.x0;
                    Intrinsics.checkNotNull(var3_3);
                    var3_3.setVisibility(var9_9);
                    continue;
                }
                var10_11 = this.x0;
                Intrinsics.checkNotNull(var10_11);
                var10_11.setVisibility(0);
                break;
            }
        }
    }

    public final void onBackPressed() {
        FragmentManager fragmentManager = this.getFragmentManager();
        int n3 = fragmentManager.getBackStackEntryCount();
        if (n3 > 0) {
            fragmentManager = this.getFragmentManager();
            fragmentManager.popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle object) {
        int n3;
        Object object2;
        Object object3;
        block41: {
            boolean bl2;
            int n4;
            String string2 = null;
            int n7 = 1;
            super.onCreate((Bundle)object);
            object = "owner";
            Intrinsics.checkNotNullParameter(this, (String)object);
            Object object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            Object object5 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            Object object6 = this.getDefaultViewModelCreationExtras();
            Object object7 = "store";
            Intrinsics.checkNotNullParameter(object4, (String)object7);
            Object object8 = "factory";
            Intrinsics.checkNotNullParameter(object5, (String)object8);
            object3 = "defaultCreationExtras";
            Intrinsics.checkNotNullParameter(object6, (String)object3);
            Object object9 = wf1_2.class;
            object2 = "modelClass";
            object4 = rl3_0.b((rd3_0)object4, (E$b)object5, (Wd0)object6, object9, (String)object2);
            object5 = "<this>";
            object6 = sw0_0.a(object9, (String)object5, object9, (String)object2, (String)object2);
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            object9 = object6.getQualifiedName();
            String string3 = "Local and anonymous classes can not be ViewModels";
            if (object9 == null) {
                string2 = string3.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            Object object10 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object9 = ((String)object10).concat((String)object9);
            this.z0 = object4 = (wf1_2)((pD3)object4).a((yn1_2)object6, (String)object9);
            Intrinsics.checkNotNullParameter(this, (String)object);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object6 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object9 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, (String)object7);
            Intrinsics.checkNotNullParameter(object6, (String)object8);
            Intrinsics.checkNotNullParameter(object9, (String)object3);
            Object object11 = db2_1.class;
            object4 = rl3_0.b((rd3_0)object4, (E$b)object6, (Wd0)object9, object11, (String)object2);
            object6 = sw0_0.a(object11, (String)object5, object11, (String)object2, (String)object2);
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            object9 = object6.getQualifiedName();
            if (object9 == null) {
                string2 = string3.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            object9 = ((String)object10).concat((String)object9);
            this.F0 = object4 = (db2_1)((pD3)object4).a((yn1_2)object6, (String)object9);
            object4 = kd3_2.a();
            object9 = this.getApplication();
            object11 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object9, (String)object11);
            object6 = new UserRepo((Application)object9);
            object9 = this.getApplication();
            ((kd3_2)object4).a = object6;
            ((kd3_2)object4).b = object9;
            Intrinsics.checkNotNull(object4);
            Intrinsics.checkNotNullParameter(this, (String)object);
            Intrinsics.checkNotNullParameter(object4, (String)object8);
            object6 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object6, (String)object7);
            Intrinsics.checkNotNullParameter(object4, (String)object8);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object7 = hy3_0.class;
            object = im_1.a((rd3_0)object6, (kd3_2)object4, (Wd0)object, (Class)object7, (String)object2);
            object4 = sw0_0.a((Class)object7, (String)object5, (Class)object7, (String)object2, (String)object2);
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            object5 = object4.getQualifiedName();
            if (object5 == null) {
                string2 = string3.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            object5 = ((String)object10).concat((String)object5);
            this.E0 = object = (hy3_0)((pD3)object).a((yn1_2)object4, (String)object5);
            object = this.z0;
            if (object != null && (object = ((wf1_2)object).e) != null) {
                object4 = new ud0_1(this);
                ((LiveData)object).e(this, (F62)object4);
            }
            if ((object = this.F0) != null && (object = ((db2_1)object).p) != null) {
                object4 = new vd0_2(this);
                ((LiveData)object).e(this, (F62)object4);
            }
            AB0.a().register(this);
            object8 = LayoutInflater.from((Context)this);
            this.G0 = object4 = new CustomToolbarViewMerger(this);
            Intrinsics.checkNotNull(object4);
            int n8 = R$layout.new_exchange_return_verify_main;
            int n10 = R$layout.activity_return_exchange_items_list_verify;
            Intrinsics.checkNotNull(object8);
            int n14 = 0;
            object3 = null;
            object5 = this;
            object = ((CustomToolbarViewMerger)object4).inflateView((Context)this, n8, n10, (LayoutInflater)object8, null);
            this.setContentView((View)object);
            object = this.getIntent();
            object4 = "getIntent(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            int n15 = Build.VERSION.SDK_INT;
            n8 = 33;
            n10 = 0;
            object7 = null;
            if (n15 >= n8) {
                object = jn.a((Intent)object);
            } else {
                object8 = "RETURN_ITEMS_DATA";
                boolean bl3 = (object = object.getSerializableExtra((String)object8)) instanceof ReturnOrderItemDetails;
                if (!bl3) {
                    n3 = 0;
                    object = null;
                }
                object = (ReturnOrderItemDetails)object;
            }
            this.s0 = object = (ReturnOrderItemDetails)object;
            object = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            if (n15 >= n8) {
                object = kn.b((Intent)object);
            } else {
                object4 = "GIFTS_ITEMS_DATA";
                n4 = (object = object.getSerializableExtra((String)object4)) instanceof HashMap;
                if (n4 == 0) {
                    n3 = 0;
                    object = null;
                }
                object = (HashMap)object;
            }
            this.t0 = object = (HashMap)object;
            object = this.getIntent();
            n15 = -1;
            this.T0 = n3 = object.getIntExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE", n15);
            object = this.getIntent();
            object4 = "return_display_status";
            n3 = (int)(object.hasExtra((String)object4) ? 1 : 0);
            if (n3 != 0) {
                object = this.getIntent().getStringExtra((String)object4);
                object4 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object, (String)object4);
                this.V0 = object;
            }
            if ((object = this.s0) == null) {
                object = StringCompanionObject.INSTANCE;
                object = hv3_0.K(R$string.acc_error_message_page_load_fail);
                object4 = hv3_0.K(R$string.server_alert_title);
                object5 = new Object[n7];
                object5[0] = object4;
                object = xh2_0.a((Object[])object5, n7, (String)object, "format(...)");
                n7 = R$string.server_alert_title;
                String string4 = this.getString(n7);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                hv3_0.o0(0, string4, (String)object);
                return;
            }
            object = this.G0;
            Intrinsics.checkNotNull(object);
            object = ((CustomToolbarViewMerger)object).getToolbar();
            this.setSupportActionBar((Toolbar)object);
            n3 = R$string.returnexchange_verify_title_refresh;
            object = hv3_0.K(n3);
            object4 = this.s0;
            if (object4 != null && (object4 = ((ReturnOrderItemDetails)object4).getConsignment()) != null && (object4 = ((Consignment)object4).getEntries()) != null) {
                n4 = object4.size();
            } else {
                n4 = 0;
                object4 = null;
            }
            n4 = n4 > n7 ? 4 : 3;
            object4 = hv3_0.J(n4, n4);
            object5 = this.G0;
            if (object5 != null) {
                ((CustomToolbarViewMerger)object5).setSubTitleText((String)object4);
            }
            if ((object4 = this.G0) != null) {
                ((CustomToolbarViewMerger)object4).setTitleText((String)object);
            }
            if ((object8 = this.G0) != null) {
                n14 = R$drawable.nav_back;
                int n16 = 10;
                object11 = null;
                object9 = null;
                object2 = "returnexchangepage";
                bl2 = false;
                string3 = null;
                CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object8, n14, null, (String)object2, null, n16, null);
            }
            object4 = Looper.getMainLooper();
            object = new Handler((Looper)object4);
            object4 = new td0_0(this);
            long l2 = 300L;
            object.postDelayed((Runnable)object4, l2);
            n3 = R$id.ex_return_verify_progressView;
            object = (AjioLoaderView)this.findViewById(n3);
            this.y0 = object;
            n3 = R$id.selected_icon_exchange;
            object = (AjioCircularImageView)this.findViewById(n3);
            this.B0 = object;
            if (object != null) {
                object4 = new ExchangeReturnVerifyActivity$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
            if ((object = (AjioTextView)this.findViewById(n3 = R$id.selected_tv)) != null) {
                object4 = new ExchangeReturnVerifyActivity$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
            n3 = R$id.exchange_items_list_actionbutton_layout;
            object = (LinearLayout)this.findViewById(n3);
            this.x0 = object;
            n3 = R$id.exchange_items_list_cancel;
            object = (AjioButton)this.findViewById(n3);
            this.w0 = object;
            n3 = R$id.exchange_items_list_requestexchange;
            object = (AjioButton)this.findViewById(n3);
            this.v0 = object;
            object = this.w0;
            if (object != null) {
                object4 = new ExchangeReturnVerifyActivity$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
            if ((object = this.v0) != null) {
                object4 = new ExchangeReturnVerifyActivity$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
            n3 = R$id.return_items_listview;
            object = (RecyclerView)this.findViewById(n3);
            this.r0 = object;
            object = new AjioCustomLinearLayoutManager((Context)this);
            object4 = this.r0;
            if (object4 != null) {
                ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object);
            }
            object2 = this.s0;
            Intrinsics.checkNotNull(object2);
            bl2 = true;
            object10 = this.t0;
            object8 = object;
            object3 = this;
            object9 = this;
            object = new ae0_2(this, this, (ReturnOrderItemDetails)object2, bl2, (HashMap)object10);
            this.C0 = object;
            object4 = this.r0;
            if (object4 != null) {
                ((RecyclerView)object4).setAdapter((RecyclerView$f)object);
            }
            n3 = R$id.exchange_items_listview;
            object = (RecyclerView)this.findViewById(n3);
            object4 = new AjioCustomLinearLayoutManager((Context)this);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object4);
            object2 = this.s0;
            Intrinsics.checkNotNull(object2);
            bl2 = false;
            string3 = null;
            object10 = this.t0;
            object8 = object4;
            object3 = this;
            object9 = this;
            this.D0 = object4 = new ae0_2(this, this, (ReturnOrderItemDetails)object2, false, (HashMap)object10);
            ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
            n3 = R$id.btnSaveFullWidth;
            this.R0 = object = (AjioTextView)this.findViewById(n3);
            n3 = R$id.exchange_items_list_disclaimerlayout;
            object = (LinearLayout)this.findViewById(n3);
            this.Q0 = object;
            n3 = R$id.linearLayout_submit_back_button;
            object = (LinearLayout)this.findViewById(n3);
            this.S0 = object;
            object = this.R0;
            if (object != null) {
                object4 = new ExchangeReturnVerifyActivity$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
            object = this.s0;
            n4 = 8;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object = ((ReturnOrderItemDetails)object).getConsignment();
                if (object != null) {
                    object = this.s0;
                    Intrinsics.checkNotNull(object);
                    object = ((ReturnOrderItemDetails)object).getConsignment().getEntries();
                    if (object != null) {
                        n3 = 0;
                        object = null;
                        while (true) {
                            object5 = this.s0;
                            Intrinsics.checkNotNull(object5);
                            object5 = ((ReturnOrderItemDetails)object5).getConsignment().getEntries();
                            n15 = object5.size();
                            if (n3 >= n15) break;
                            object5 = ((CartEntry)ho_0.a(this.s0, n3)).getOrderEntry();
                            n15 = (int)(((CartEntry)object5).getIsReturnItem() ? 1 : 0);
                            if (n15 != 0) {
                                object = this.s0;
                                if (object != null) {
                                    object7 = ((ReturnOrderItemDetails)object).getRefundOptions();
                                }
                                if (object7 != null && ((object = this.s0) == null || (object = ((ReturnOrderItemDetails)object).getRefundOptions()) == null || (n3 = ((ArrayList)object).size()) != 0)) {
                                    object = this.S0;
                                    if (object != null) {
                                        object.setVisibility(n4);
                                    }
                                    if ((object = this.Q0) != null) {
                                        object.setVisibility(n4);
                                    }
                                    if ((object = this.R0) != null) {
                                        object.setVisibility(0);
                                    }
                                    break block41;
                                }
                                object = this.R0;
                                if (object != null) {
                                    object.setVisibility(n4);
                                }
                                if ((object = this.S0) != null) {
                                    object.setVisibility(0);
                                }
                                if ((object = this.Q0) != null) {
                                    object.setVisibility(0);
                                }
                                break block41;
                            }
                            n3 += n7;
                        }
                    }
                }
            }
            if ((object = this.R0) != null) {
                object.setVisibility(n4);
            }
            if ((object = this.S0) != null) {
                object.setVisibility(0);
            }
            if ((object = this.Q0) != null) {
                object.setVisibility(0);
            }
        }
        object = AnalyticsManager.Companion;
        object3 = bv_0.a((AnalyticsManager$Companion)object);
        object2 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(this.M0, "", "", null, "openScreen", "exchange size & reason review screen", "order management screen", (String)object3, null, (String)object2, false, null, 1540, null);
        object = z40_0.Companion;
        n3 = (int)(Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("cod_refund_otp_enabled") ? 1 : 0);
        this.J0 = n3;
        n3 = (int)(z40$a.a((Context)AJIOApplication$a.a()).a.a("enableIfscValidation") ? 1 : 0);
        this.I0 = n3;
        n3 = (int)(z40$a.a((Context)AJIOApplication$a.a()).a.a("block_unverified_ifsc") ? 1 : 0);
        this.H0 = n3;
    }

    public final void onFragmentInteraction(String string2, int n3, Bundle bundle) {
        if (n3 == 0) {
            this.r2();
        }
    }

    public final void onNavigationClick() {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Object object = "item";
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            a.Companion.getClass();
            n3 = 0;
            object = a$a.a(false, false);
            androidx.fragment.app.FragmentManager fragmentManager = this.getSupportFragmentManager();
            String string2 = "CancelConfirmationBottomSheet";
            ((DialogFragment)object).show(fragmentManager, string2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        String string2 = this.M0.getSTEP();
        bundle.putInt(string2, 4);
        String string3 = this.N0;
        String string4 = this.O0;
        this.M0.newPushCustomScreenView("return payment mode selection screen", "order management screen", string3, bundle, string4);
    }

    public final void onStop() {
        super.onStop();
        this.L0.setPreviousScreenData("return payment mode selection screen", "order management screen");
    }

    public final void p2(boolean bl2) {
        AjioButton ajioButton = this.v0;
        if (ajioButton != null) {
            ajioButton.setClickable(bl2);
        }
        if ((ajioButton = this.w0) != null) {
            ajioButton.setClickable(bl2);
        }
        if ((ajioButton = this.v0) != null) {
            ajioButton.setEnabled(bl2);
        }
        if ((ajioButton = this.w0) != null) {
            ajioButton.setEnabled(bl2);
        }
    }

    public final void r2() {
        String string2;
        Object object;
        float f5;
        int n3;
        float f6;
        Object object2 = new QueryIntitateRequestReturn();
        this.u2((QueryIntitateRequestReturn)object2);
        Object object3 = this.s0;
        Intrinsics.checkNotNull(object3);
        Object object4 = ((ReturnOrderItemDetails)object3).isAjioStoreCreditsSelected();
        Object object5 = "";
        if (object4 != 0) {
            f6 = this.W0;
            n3 = 0;
            f5 = 0.0f;
            object = null;
            float f7 = f6 - 0.0f;
            object4 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object4 > 0) {
                object3 = this.E0;
                Intrinsics.checkNotNull(object3);
                object3 = ((hy3_0)object3).k();
                object4 = TextUtils.isEmpty((CharSequence)object3);
                if (object4 == 0) {
                    object3 = this.E0;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((hy3_0)object3).k();
                    Intrinsics.checkNotNull(object3);
                } else {
                    object3 = object5;
                }
                f5 = this.W0;
                object = Float.valueOf(f5);
                string2 = "exchange/return screen";
                GAEcommerceEvents.pushAjioCashEvent((String)object3, (Float)object, string2);
            }
        }
        if ((object3 = this.y0) != null) {
            ((AjioLoaderView)((Object)object3)).startLoader();
        }
        object4 = 0;
        f6 = 0.0f;
        object3 = null;
        this.p2(false);
        object = this.F0;
        Intrinsics.checkNotNull(object);
        string2 = ((jo_2)this.U0.getValue()).a();
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "queryIntitateRequestReturn");
        Object object6 = md3_0.c((jD3)object);
        String string3 = null;
        Object object7 = new fb2_2((db2_1)object, (QueryIntitateRequestReturn)object2, string2, null);
        n3 = 3;
        f5 = 4.2E-45f;
        Ae3.d((i90_0)object6, null, null, (Function2)object7, n3);
        object2 = ((QueryIntitateRequestReturn)object2).getReturnData();
        if (object2 != null && (n3 = ((ArrayList)object2).size()) > 0 && (object = (ReturnData)((ArrayList)object2).get(0)) != null && (string2 = ((ReturnData)object).getReason()) != null) {
            string2 = new Bundle();
            object6 = this.M0;
            object7 = ((NewCustomEventsRevamp)object6).getPRODUCT_ID();
            if ((object2 = ((ReturnData)((ArrayList)object2).get(0)).getProductCode()) == null) {
                object2 = object5;
            }
            string2.putString((String)object7, (String)object2);
            object2 = ((NewCustomEventsRevamp)object6).getPRODUCT_NAME();
            object7 = this.s0;
            if (object7 == null || (object7 = ((ReturnOrderItemDetails)object7).getSelectedControllerConfirmedList()) == null || (object7 = (CartEntry)((ArrayList)object7).get(0)) == null || (object7 = ((CartEntry)object7).getOrderEntry()) == null || (object7 = ((CartEntry)object7).getProduct()) == null || (object7 = ((Product)object7).getName()) == null) {
                object7 = object5;
            }
            string2.putString((String)object2, (String)object7);
            object2 = ((NewCustomEventsRevamp)object6).getPRODUCT_BRAND();
            object7 = this.s0;
            if (object7 == null || (object7 = ((ReturnOrderItemDetails)object7).getSelectedControllerConfirmedList()) == null || (object7 = (CartEntry)((ArrayList)object7).get(0)) == null || (object7 = ((CartEntry)object7).getOrderEntry()) == null || (object7 = ((CartEntry)object7).getProduct()) == null || (object7 = ((Product)object7).getBrandName()) == null) {
                object7 = object5;
            }
            string2.putString((String)object2, (String)object7);
            object2 = ((NewCustomEventsRevamp)object6).getPRODUCT_SIZE();
            object7 = this.s0;
            if (object7 == null || (object7 = ((ReturnOrderItemDetails)object7).getSelectedControllerConfirmedList()) == null || (object7 = (CartEntry)((ArrayList)object7).get(0)) == null || (object7 = ((CartEntry)object7).getOrderEntry()) == null || (object7 = ((CartEntry)object7).getProduct()) == null || (object7 = ((Product)object7).getSelectedSize()) == null) {
                object7 = object5;
            }
            string2.putString((String)object2, (String)object7);
            object2 = ((NewCustomEventsRevamp)object6).getORDER_ID();
            object6 = this.s0;
            if (object6 == null || (object6 = ((ReturnOrderItemDetails)object6).getSelectedControllerConfirmedList()) == null || (object3 = (CartEntry)((ArrayList)object6).get(0)) == null || (object3 = ((CartEntry)object3).getOrderEntry()) == null || (object3 = ((CartEntry)object3).getOrderId()) == null) {
                object3 = object5;
            }
            string2.putString((String)object2, (String)object3);
            object6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = ((ReturnData)object).getReason();
            if (object2 == null) {
                object2 = object5;
            }
            if ((object3 = ((ReturnData)object).getSubReason()) != null) {
                object5 = object3;
            }
            object3 = "|";
            string3 = n1.a((String)object2, (String)object3, (String)object5);
            AnalyticsData analyticsData = ne_0.b((Bundle)string2);
            String string4 = "Order Details";
            object7 = "Return Reason";
            int n4 = 16;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object6, (String)object7, string3, string4, analyticsData, null, n4, null);
        }
    }

    public final void s2() {
        Object object = this.S0;
        int n3 = 0;
        if (object != null) {
            object.setVisibility(0);
        }
        if ((object = this.Q0) != null) {
            object.setVisibility(0);
        }
        if ((object = this.R0) != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
        if ((object = this.s0) != null) {
            n3 = 0;
            ((ReturnOrderItemDetails)object).setRefundOptions(null);
        }
        if ((object = this.C0) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void t2() {
        hw3_0 hw3_02 = new hw3_0();
        hw3_02.setCancelable(false);
        Object object = new Bundle();
        Context context = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Object object2 = new jo_2(context);
        object2 = ((sw_0)object2).getPreference("INPUT_MOBILE_NUMBER", "");
        object.putString("INTENT_USER_PHONE_NUMBER", (String)object2);
        object2 = ((UserInformation)this.P0.getValue()).getUserEmailId();
        object.putString("INTENT_USER_EMAIL_ID", (String)object2);
        object.putBoolean("IS_IMPS", true);
        hw3_02.setArguments((Bundle)object);
        object = this.getSupportFragmentManager();
        hw3_02.show((androidx.fragment.app.FragmentManager)object, "UpdateProfileOtpBottomSheetFragment");
    }

    /*
     * Unable to fully structure code
     */
    public final void u2(QueryIntitateRequestReturn var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = false;
        var5_5 = null;
        var6_6 = 0;
        var7_7 = 0.0f;
        var8_8 = null;
        this.W0 = 0.0f;
        var9_9 = this.s0;
        Intrinsics.checkNotNull(var9_9);
        var9_9 = var9_9.getDeliveryAddress().getId();
        var1_1.setDeliveryAddress((String)var9_9);
        var9_9 = this.s0;
        Intrinsics.checkNotNull(var9_9);
        var9_9 = var9_9.getOrderCode();
        var1_1.setOrderCode((String)var9_9);
        var9_9 = this.s0;
        Intrinsics.checkNotNull(var9_9);
        var9_9 = var9_9.getConsignmentCode();
        var1_1.setConsignmentCode((String)var9_9);
        var9_9 = this.s0;
        Intrinsics.checkNotNull(var9_9);
        var10_10 = var9_9.isSelfShip();
        var11_11 = 1;
        var12_12 = "true";
        var13_13 = "false";
        if (var10_10) {
            var1_1.setSelfShip((String)var12_12);
            var1_1.setDefaultAddress(var13_13);
            var9_9 = this.s0;
            Intrinsics.checkNotNull(var9_9);
            var9_9 = var9_9.getWarehouseAddress();
            if (var9_9 == null) {
                var10_10 = false;
                var14_14 = 0.0f;
                var9_9 = null;
            } else {
                var9_9 = this.s0;
                Intrinsics.checkNotNull(var9_9);
                var9_9 = var9_9.getWarehouseAddress().getId();
            }
            var3_3.setDeliveryAddress((String)var9_9);
        } else {
            var1_1.setSelfShip(var13_13);
            var9_9 = this.s0;
            Intrinsics.checkNotNull(var9_9);
            var9_9 = var9_9.getDefaultAddressId();
            var15_15 = this.s0;
            Intrinsics.checkNotNull(var15_15);
            var15_15 = var15_15.getDeliveryAddress().getId();
            var10_10 = b.i((String)var15_15, (String)var9_9, (boolean)var11_11);
            var9_9 = var10_10 != false ? var12_12 : var13_13;
            var3_3.setDefaultAddress((String)var9_9);
        }
        var9_9 = new ArrayList();
        var3_3.setReturnData((ArrayList)var9_9);
        var15_15 = var2_2.s0;
        Intrinsics.checkNotNull(var15_15);
        var15_15 = var15_15.getConsignment().getEntries();
        var16_16 = var15_15.size();
        for (var17_17 = 0; var17_17 < var16_16; var17_17 += var11_11) {
            block35: {
                block34: {
                    var18_18 = (CartEntry)ho_0.a(var2_2.s0, var17_17);
                    var19_19 = var18_18.getOrderEntry();
                    var20_20 = var19_19.isExchangeItem();
                    if (var20_20 || (var20_20 = var19_19.isReturnItem())) break block34;
                    var8_8 = var9_9;
                    break block35;
                }
                var21_21 = new ReturnData();
                var22_22 = var19_19.getReason();
                var21_21.setReason((String)var22_22);
                var22_22 = var19_19.getSubReason();
                var21_21.setSubReason((String)var22_22);
                var22_22 = var19_19.getCancelComments();
                var21_21.setCommentBox((String)var22_22);
                var23_23 = var19_19.getReturnEditedQuantity();
                if (var23_23 != 0 && (var23_23 = (int)var19_19.isReturnItem()) != 0) {
                    var23_23 = var19_19.getReturnEditedQuantity();
                } else {
                    var23_23 = var19_19.getExchangeEditedQuantity();
                    if (var23_23 != 0 && (var23_23 = (int)var19_19.isExchangeItem()) != 0) {
                        var23_23 = var19_19.getExchangeEditedQuantity();
                    } else {
                        var23_23 = 0;
                        var22_22 = null;
                    }
                }
                var24_24 = new StringBuilder();
                var24_24.append(var23_23);
                var22_22 = var24_24.toString();
                var21_21.setReturnQty((String)var22_22);
                var22_22 = var19_19.getProduct().getCode();
                var21_21.setProductCode((String)var22_22);
                var22_22 = var19_19.getImageInfoList();
                if (var22_22 == null || (var23_23 = (var22_22 = var19_19.getImageInfoList()).size()) <= 0) ** GOTO lbl-1000
                var22_22 = h40_0.a;
                var22_22 = z40_0.Companion;
                var22_22 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var22_22).a;
                var24_24 = "enable_return_image_upload_debug_logs";
                var23_23 = (int)var22_22.a((String)var24_24);
                if (var23_23 != 0) {
                    var24_24 = Looper.getMainLooper();
                    var22_22 = new Handler((Looper)var24_24);
                    var24_24 = new SD0(0, var2_2, var19_19);
                    var25_25 = var9_9;
                    var26_26 = 2000L;
                    var22_22.postDelayed((Runnable)var24_24, var26_26);
                } else lbl-1000:
                // 2 sources

                {
                    var25_25 = var9_9;
                }
                var6_6 = var19_19.isExchangeItem();
                if (var6_6 != 0) {
                    var21_21.setExchange((String)var12_12);
                    var8_8 = var19_19.getProduct().getSelectedSize();
                    var21_21.setSize((String)var8_8);
                    var8_8 = var19_19.getProduct().getSelectedProductSizeCode();
                    var21_21.setSelectedArticleNumber((String)var8_8);
                } else {
                    var6_6 = var19_19.isProductTag();
                    var21_21.setProductTag((boolean)var6_6);
                    var21_21.setExchange(var13_13);
                    var8_8 = var19_19.getImageInfoList();
                    if (var8_8 != null && (var6_6 = (var8_8 = var19_19.getImageInfoList()).size()) > 0) {
                        var8_8 = new ArrayList();
                        var9_9 = new ImageDetail();
                        var22_22 = ((ImageFileInfo)var19_19.getImageInfoList().get(0)).getImageName();
                        var9_9.setImageUrl1((String)var22_22);
                        var22_22 = var19_19.getImageInfoList();
                        var23_23 = var22_22.size();
                        if (var23_23 > var11_11) {
                            var22_22 = ((ImageFileInfo)var19_19.getImageInfoList().get(var11_11)).getImageName();
                            var9_9.setImageUrl2((String)var22_22);
                        }
                        var22_22 = h40_0.a;
                        var23_23 = (int)h40_0.u1();
                        if (var23_23 != 0 && (var23_23 = (var22_22 = var19_19.getImageInfoList()).size()) > (var28_27 = 2)) {
                            var22_22 = ((ImageFileInfo)var19_19.getImageInfoList().get(var28_27)).getImageName();
                            var9_9.setImageUrl3((String)var22_22);
                        }
                        var8_8.add(var9_9);
                        var21_21.setImageDetails((ArrayList)var8_8);
                        var8_8 = var19_19.getBarCode();
                        var21_21.setEan((String)var8_8);
                        var6_6 = (int)var19_19.isTagAvailable();
                        if (var6_6 != 0) {
                            var21_21.setIsTagAvailable((String)var12_12);
                        } else {
                            var21_21.setIsTagAvailable(var13_13);
                        }
                        var8_8 = var19_19.getReason();
                        var9_9 = var19_19.getSubReason();
                        var6_6 = (int)ce0_2.a((String)var8_8, (String)var9_9);
                        if (var6_6 != 0) {
                            var8_8 = var19_19.getWrongItemComments();
                            var21_21.setCommentBox((String)var8_8);
                        }
                    }
                }
                var8_8 = var21_21.getExchange();
                var6_6 = (int)var13_13.equalsIgnoreCase((String)var8_8);
                if (var6_6 != 0 && (var8_8 = var18_18.getBasePrice()) != null) {
                    block33: {
                        block32: {
                            try {
                                var8_8 = var18_18.getBasePrice();
                                if (var8_8 == null) break block32;
                            }
                            catch (Exception v0) {}
                            var8_8 = var18_18.getBasePrice();
                            var8_8 = var8_8.getFormattedValue();
                            Intrinsics.checkNotNull(var8_8);
                            var7_7 = Float.parseFloat((String)var8_8);
                            break block33;
                        }
                        var6_6 = 0;
                        var7_7 = 0.0f;
                        var8_8 = null;
                    }
                    var2_2.W0 = var14_14 = var2_2.W0 + var7_7;
                }
                var8_8 = var25_25;
                var25_25.add(var21_21);
            }
            var9_9 = var8_8;
            var6_6 = 0;
            var7_7 = 0.0f;
            var8_8 = null;
        }
        var5_5 = var2_2.s0;
        Intrinsics.checkNotNull(var5_5);
        var4_4 = var5_5.isRefundToBankSelected();
        if (var4_4) {
            var5_5 = new BankDetails();
            var8_8 = h40_0.a;
            var8_8 = z40_0.Companion;
            var8_8 = Q.a((AJIOApplication$a)AJIOApplication.Companion, var8_8).a;
            var9_9 = "enable_return_bank_info_encryption";
            var6_6 = var8_8.a((String)var9_9);
            if (var6_6 != 0) {
                var8_8 = new gq2_2("30819F300D06092A864886F70D010101050003818D00308189028181008563B9CE51F897838569C7D46D1906F1EC5F0386D4DAB80424DF8834C20533CFF7655AB322E31E879F7AAA0D44175D07EBD7687E6A5540E375614296EFBFD521A0864E3586FF8452D9EBA76520A51E0928AC8B11F2A86F2197EED27A723A99AE8D47E1675047304299640DE4E6DAE61B78B8E08173D1F7F0E0F76122C106F8730203010001", "VERSION_1");
                var9_9 = var2_2.s0;
                Intrinsics.checkNotNull(var9_9);
                var9_9 = var9_9.getAccountNumber();
                var29_28 = var2_2.s0;
                Intrinsics.checkNotNull(var29_28);
                var29_28 = var29_28.getIfscCode();
                var12_12 = new StringBuilder();
                var12_12.append((String)var9_9);
                var12_12.append("|");
                var12_12.append((String)var29_28);
                var9_9 = var12_12.toString();
                var8_8 = var8_8.a((String)var9_9);
                var5_5.setAccNo((String)var8_8);
                var5_5.setConfirmAccNo((String)var8_8);
                var5_5.setIfsc((String)var8_8);
                var8_8 = Boolean.TRUE;
                var5_5.setEncryptedAccountInfo((Boolean)var8_8);
            } else {
                var8_8 = var2_2.s0;
                Intrinsics.checkNotNull(var8_8);
                var8_8 = var8_8.getAccountNumber().toString();
                var5_5.setAccNo((String)var8_8);
                var8_8 = var2_2.s0;
                Intrinsics.checkNotNull(var8_8);
                var8_8 = var8_8.getAccountNumber().toString();
                var5_5.setConfirmAccNo((String)var8_8);
                var8_8 = var2_2.s0;
                Intrinsics.checkNotNull(var8_8);
                var8_8 = var8_8.getIfscCode();
                var5_5.setIfsc((String)var8_8);
            }
            var8_8 = "BankTransfer";
            var5_5.setRefundType((String)var8_8);
            var3_3.setBankDetails((BankDetails)var5_5);
            var4_4 = h40_0.B0();
            if (var4_4) {
                var5_5 = Boolean.TRUE;
                var3_3.setSkipRCS((Boolean)var5_5);
            }
        }
        var5_5 = h40_0.a;
        var4_4 = h40_0.B0();
        if (var4_4) {
            var5_5 = var2_2.s0;
            Intrinsics.checkNotNull(var5_5);
            var5_5 = var5_5.getSelectedRefundOption();
            var8_8 = "storeCredit";
            var4_4 = Intrinsics.areEqual(var5_5, var8_8);
            if (var4_4) {
                var5_5 = Boolean.TRUE;
                var3_3.setUseNT((Boolean)var5_5);
            }
        }
        var5_5 = var2_2.s0;
        Intrinsics.checkNotNull(var5_5);
        var5_5 = var5_5.getSelectedRefundOption();
        var4_4 = TextUtils.isEmpty((CharSequence)var5_5);
        if (!var4_4) {
            var5_5 = var2_2.s0;
            Intrinsics.checkNotNull(var5_5);
            var5_5 = var5_5.getSelectedRefundOption();
            var3_3.setSelectedRefundOption((String)var5_5);
        }
    }

    public final void v2(String string2) {
        boolean bl2 = this.isFinishing();
        if (bl2) {
            return;
        }
        ig0_0.Companion.getClass();
        Intrinsics.checkNotNull(string2);
        Integer n3 = 1;
        ig0_0.b((Context)this, string2, n3, 8);
    }

    public final void y1(String object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "ifscCode");
        Object object2 = this.X0;
        int n4 = Intrinsics.areEqual(object, object2);
        if (n4 != 0) {
            return;
        }
        object2 = null;
        this.A0 = null;
        this.X0 = object;
        n4 = ((String)object).length();
        if (n4 < (n3 = 11)) {
            object = this.D0;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object2 = this.A0;
                ((ae0_2)object).h((IfscResponse)object2);
            }
            if ((object = this.C0) != null) {
                Intrinsics.checkNotNull(object);
                object2 = this.A0;
                ((ae0_2)object).h((IfscResponse)object2);
            }
            return;
        }
        object2 = this.C0;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = (int)(((ae0_2)object2).g() ? 1 : 0);
        } else {
            n4 = 0;
            object2 = null;
        }
        n3 = (int)(this.I0 ? 1 : 0);
        if (n3 != 0) {
            if (n4 != 0) {
                object2 = this.y0;
                if (object2 != null) {
                    ((AjioLoaderView)((Object)object2)).startLoader();
                }
                object2 = this.z0;
                Intrinsics.checkNotNull(object2);
                object2.getClass();
                String string2 = "<set-?>";
                Intrinsics.checkNotNullParameter(object, string2);
                ((wf1_2)object2).i = object;
                object2 = this.z0;
                Intrinsics.checkNotNull(object2);
                ((wf1_2)object2).b((String)object);
            } else {
                object = this.D0;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    object2 = this.A0;
                    ((ae0_2)object).h((IfscResponse)object2);
                }
                if ((object = this.C0) != null) {
                    Intrinsics.checkNotNull(object);
                    object2 = this.A0;
                    ((ae0_2)object).h((IfscResponse)object2);
                }
            }
        }
    }
}

