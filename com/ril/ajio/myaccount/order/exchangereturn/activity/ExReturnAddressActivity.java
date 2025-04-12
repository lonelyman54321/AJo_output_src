/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnControllerActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExReturnAddressActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.returnexchange.ReturnCapture;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ExReturnAddressActivity
extends Hilt_ExReturnAddressActivity {
    public static final /* synthetic */ int D0;
    public final String A0;
    public final String B0;
    public String C0;
    public AjioTextView Y;
    public TextView Z;
    public AjioLoaderView k0;
    public String p0;
    public ReturnOrderItemDetails q0;
    public HashMap r0;
    public final ArrayList s0;
    public final ArrayList t0;
    public h5_0 u0;
    public Toolbar v0;
    public final hh3_2 w0;
    public ReturnCapture x0;
    public final NewEEcommerceEventsRevamp y0;
    public final NewCustomEventsRevamp z0;

    public ExReturnAddressActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new ArrayList();
        this.s0 = object;
        object = new ArrayList();
        this.t0 = object;
        object = new u8_0(this, 1);
        this.w0 = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.y0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.z0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.A0 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.B0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.C0 = "";
    }

    public final void A2(boolean bl2) {
        boolean bl3;
        Object object;
        Object object2 = z40_0.Companion;
        Object object3 = this.getApplication();
        Object object4 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object2.getClass();
        object2 = z40$a.a((Context)object3).a;
        object3 = "android_dropAtStoreEnable";
        boolean n3 = ((ao0_0)object2).a((String)object3);
        if (n3 && bl2) {
            object = this.Z;
            if (object != null) {
                int n4 = R$string.return_exchange_lbl;
                object2 = hv3_0.K(n4);
                object.setText((CharSequence)object2);
            }
            object = new oc0_2();
            object2 = "ExReturnTabAddressFragment";
        } else {
            object = this.Z;
            if (object != null) {
                int n7 = R$string.select_a_pickup_address;
                object2 = hv3_0.K(n7);
                object.setText((CharSequence)object2);
            }
            object = new dc0_1();
            object2 = "ExReturnAddresFragmentRevamp";
        }
        object3 = new Bundle();
        object4 = this.q0;
        boolean bl4 = false;
        String string2 = null;
        if (object4 != null) {
            object4 = ((ReturnOrderItemDetails)object4).getDeliveryAddress();
        } else {
            bl3 = false;
            object4 = null;
        }
        String string3 = "RETURN_ITEMS_ADDRESS_DATA";
        object3.putSerializable(string3, (Serializable)object4);
        object4 = this.q0;
        if (object4 != null && (object4 = ((ReturnOrderItemDetails)object4).getConsignment()) != null) {
            string2 = ((Consignment)object4).getCode();
        }
        object3.putString("consignment_code", string2);
        object4 = this.getIntent().getExtras();
        bl4 = true;
        if (object4 != null && (bl3 = object4.containsKey(string3 = "IS_FROM_JOUNRNEY")) == bl4) {
            this.C0 = object4 = this.getIntent().getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "product_id";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "order_status";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "order_id";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "non_refundable_fee";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "discounts";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
            object4 = this.getIntent();
            string3 = "return_percentage";
            object4 = object4.getStringExtra(string3);
            object3.putString(string3, (String)object4);
        }
        ((Fragment)object).setArguments((Bundle)object3);
        object3 = this.getSupportFragmentManager();
        object3.getClass();
        object4 = new a((FragmentManager)object3);
        Intrinsics.checkNotNullExpressionValue(object4, "beginTransaction(...)");
        int n8 = R$id.ex_return_address_contentframe;
        ((k)object4).j(n8, (Fragment)object, (String)object2);
        ((a)object4).o(bl4, bl4);
    }

    public final void onBackPressed() {
        int n3;
        int n4;
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        if (fragmentManager != null && (n4 = (fragmentManager = this.getSupportFragmentManager()).J()) > (n3 = 1)) {
            fragmentManager = this.getSupportFragmentManager();
            fragmentManager.V();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle object) {
        int n3;
        boolean bl2;
        boolean bl3;
        String string2;
        String string3;
        String string4;
        Object object2;
        Object object3;
        int n4;
        Object object4;
        boolean bl4;
        super.onCreate((Bundle)object);
        int bl22 = R$layout.activity_ex_return_address;
        this.setContentView(bl22);
        AB0.a().register(this);
        int n7 = R$id.ex_return_tab_address_toolbar;
        object = (Toolbar)this.findViewById(n7);
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.v0 = object;
        Object object5 = "toolbar";
        int n8 = 0;
        Object object6 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            boolean bl5 = false;
            object = null;
        }
        int n10 = R$id.toolbar_title;
        object = (TextView)object.findViewById(n10);
        this.Z = object;
        object = this.v0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            boolean bl6 = false;
            object = null;
        }
        object5 = hv3_0.a;
        this.setSupportActionBar((Toolbar)object);
        object = this.getSupportActionBar();
        boolean bl7 = true;
        if (object != null) {
            object.q();
            object.r();
            object.n(bl7);
            object.p();
        }
        int n14 = R$id.ex_return_tab_address_progressView;
        object = (AjioLoaderView)this.findViewById(n14);
        this.k0 = object;
        int n15 = R$id.ex_return_tab_address_tv_notification;
        this.Y = object = (AjioTextView)this.findViewById(n15);
        object = this.getIntent();
        if (object != null) {
            object = object.getExtras();
        } else {
            boolean bl8 = false;
            object = null;
        }
        String string5 = "getApplication(...)";
        int n16 = 33;
        if (object != null && (object = this.getIntent()) != null && (object = object.getExtras()) != null && (bl4 = object.containsKey((String)(object4 = "RETURN_ITEMS_DATA"))) == bl7) {
            int n17;
            object = this.getIntent();
            if (object != null && (object = object.getExtras()) != null) {
                n17 = Build.VERSION.SDK_INT;
                if (n17 >= n16) {
                    object = D7.a(object);
                } else {
                    n4 = (object = object.getSerializable((String)object4)) instanceof ReturnOrderItemDetails;
                    if (n4 == 0) {
                        boolean bl9 = false;
                        object = null;
                    }
                    object = (ReturnOrderItemDetails)object;
                }
                object = (ReturnOrderItemDetails)object;
            } else {
                boolean bl10 = false;
                object = null;
            }
            this.q0 = object;
            if (object != null && (object = object.getDeliveryAddress()) != null) {
                object = object.getPostalCode();
            } else {
                boolean bl11 = false;
                object = null;
            }
            this.p0 = object;
            object = this.q0;
            if (object != null && (object = object.getConsignment()) != null) {
                object = object.getEntries();
            } else {
                boolean bl12 = false;
                object = null;
            }
            object4 = object;
            object4 = (Collection)object;
            if (object4 != null && (n4 = (int)(object4.isEmpty() ? 1 : 0)) == 0) {
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object4 = (CartEntry)object.next();
                    object3 = ((CartEntry)object4).getOrderEntry();
                    if (object3 != null) {
                        object3 = ((CartEntry)object3).getProduct();
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    if (object3 == null) continue;
                    n4 = (int)(((CartEntry)object4).isDropAtStoreAvailable() ? 1 : 0);
                    if (n4 != 0) {
                        object4 = this.s0;
                        ((ArrayList)object4).add(object3);
                        continue;
                    }
                    object4 = this.t0;
                    ((ArrayList)object4).add(object3);
                }
            }
            object = kd3_2.a();
            object4 = new AddressRepo();
            object3 = this.getApplication();
            object.a = object4;
            object.b = object3;
            Intrinsics.checkNotNull(object);
            object4 = "owner";
            Intrinsics.checkNotNullParameter(this, (String)object4);
            object3 = "factory";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object2 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object4);
            object4 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, "store");
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object4, "defaultCreationExtras");
            object3 = h5_0.class;
            string4 = "modelClass";
            object = im_1.a((rd3_0)object2, (kd3_2)object, (Wd0)object4, (Class)object3, string4);
            object4 = "<this>";
            object3 = sw0_0.a((Class)object3, (String)object4, (Class)object3, string4, string4);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = object3.getQualifiedName();
            if (object4 != null) {
                object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object4 = ((String)object2).concat((String)object4);
                this.u0 = object = (h5_0)object.a((yn1_2)object3, (String)object4);
                if (object != null && (object = object.b) != null) {
                    object4 = new ub0_0(this);
                    object.e(this, (F62)object4);
                }
                if ((object = this.u0) != null && (object = object.m) != null) {
                    object4 = new vb0_2(this);
                    object.e(this, (F62)object4);
                }
                object = z40_0.Companion;
                object4 = this.getApplication();
                Intrinsics.checkNotNullExpressionValue(object4, string5);
                object.getClass();
                object = z40$a.a((Context)object4).a;
                object4 = "android_dropAtStoreEnable";
                boolean bl13 = object.a((String)object4);
                if (bl13) {
                    boolean bl14;
                    boolean bl15 = this.isFinishing();
                    if (!bl15 && !(bl14 = TextUtils.isEmpty((CharSequence)(object = this.p0)))) {
                        object = this.k0;
                        if (object != null) {
                            object.startLoader();
                        }
                        object = p3.a("client_type", "Android");
                        AJIOApplication.Companion.getClass();
                        object4 = p90.a((Context)AJIOApplication$a.a());
                        object.put("client_version", object4);
                        object4 = this.w0;
                        object3 = (UserInformation)((hh3_2)object4).getValue();
                        object2 = "<get-userInformation>(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                        object3 = ServiceUtil.getToken((UserInformation)object3);
                        if (object3 != null && (object2 = this.u0) != null) {
                            object4 = ((UserInformation)((hh3_2)object4).getValue()).getUserId();
                            Intrinsics.checkNotNullExpressionValue(object4, "getUserId(...)");
                            string4 = this.p0;
                            string3 = "null cannot be cast to non-null type kotlin.String";
                            Intrinsics.checkNotNull(string4, string3);
                            ((h5_0)object2).e((String)object3, (String)object4, (HashMap)object, string4);
                        }
                    }
                } else {
                    this.A2(bl7);
                }
            } else {
                object5 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object5);
                throw object;
            }
        }
        if ((object = this.getIntent()) != null && (object = object.getExtras()) != null) {
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n16) {
                object = E7.a(object);
            } else {
                string2 = "GIFTS_ITEMS_DATA";
                n16 = (object = object.getSerializable(string2)) instanceof HashMap;
                if (n16 != 0) {
                    object6 = object;
                }
                object = object6;
                object = (HashMap)object6;
            }
            object6 = object;
            object6 = (HashMap)object;
        }
        this.r0 = object6;
        object = z40_0.Companion;
        object6 = this.getApplication();
        Intrinsics.checkNotNullExpressionValue(object6, string5);
        object.getClass();
        object = z40$a.a((Context)object6).a;
        object6 = "returnCapture";
        object = object.b((String)object6);
        n8 = object.length();
        if (n8 > 0) {
            object6 = ReturnCapture.class;
            this.x0 = object = (ReturnCapture)JsonUtils.fromJson((String)object, (Class)object6);
        }
        if ((bl3 = h40_0.l1()) && (object = this.getIntent().getExtras()) != null && (bl2 = object.containsKey((String)(object6 = "IS_FROM_JOUNRNEY"))) == bl7 && (object = this.getIntent().getStringExtra((String)object6)) != null && (n3 = object.length()) != 0) {
            object = this.C0;
            bl7 = false;
            object5 = null;
            object6 = "return";
            boolean bl16 = b.i((String)object, (String)object6, false);
            if (bl16) {
                object = AnalyticsManager.Companion.getInstance();
                object5 = object.getNewCustomEventsRevamp();
                int n18 = 1632;
                object6 = "";
                string5 = "";
                string2 = "";
                object4 = "screen_view";
                object3 = "return address selection screen";
                object2 = null;
                string4 = null;
                string3 = null;
                String string6 = "";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, string5, string2, (String)object4, (String)object3, null, null, null, string6, false, null, n18, null);
            } else {
                object = AnalyticsManager.Companion.getInstance();
                object5 = object.getNewCustomEventsRevamp();
                int n19 = 1632;
                object6 = "";
                string5 = "";
                string2 = "";
                object4 = "screen_view";
                object3 = "exchange address selection screen";
                object2 = null;
                string4 = null;
                string3 = null;
                String string7 = "";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, string5, string2, (String)object4, (String)object3, null, null, null, string7, false, null, n19, null);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            AB0.a().post("finish");
            this.onBackPressed();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        String string2 = this.z0.getSTEP();
        bundle.putInt(string2, 1);
        String string3 = this.A0;
        String string4 = this.B0;
        this.z0.newPushCustomScreenView("return/exchange address selection screen", "order management screen", string3, bundle, string4);
        km_1.a(AnalyticsManager.Companion, "return/exchange address selection screen");
    }

    public final void onStop() {
        super.onStop();
        this.y0.setPreviousScreenData("return/exchange address selection screen", "order management screen");
    }

    public final void showNotification(String string2, String string3) {
        AjioTextView ajioTextView = this.Y;
        hv3_0.j0(string2, string3, ajioTextView);
    }

    public final void y2(Intent intent, boolean bl2) {
        Intrinsics.checkNotNullParameter(intent, "intent1");
        String string2 = this.C0;
        intent.putExtra("IS_FROM_JOUNRNEY", string2);
        intent.putExtra("reverseService", bl2);
        Object object = this.getIntent();
        String string3 = "product_id";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
        object = this.getIntent();
        string3 = "order_status";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
        object = this.getIntent();
        string3 = "order_id";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
        object = this.getIntent();
        string3 = "non_refundable_fee";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
        object = this.getIntent();
        string3 = "discounts";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
        object = this.getIntent();
        string3 = "return_percentage";
        object = object.getStringExtra(string3);
        intent.putExtra(string3, (String)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void z2(CartDeliveryAddress var1_1) {
        block73: {
            var2_2 = this.q0;
            if (var2_2 == null) {
                return;
            }
            var2_2 = this.x0;
            var3_3 = false;
            var4_4 /* !! */  = null;
            if (var2_2 != null) {
                var5_5 = var2_2.isNewOne();
            } else {
                var5_5 = 0;
                var2_2 = null;
            }
            var6_6 = this.q0;
            var7_7 = null;
            var6_6 = var6_6 != null && (var6_6 = var6_6.getConsignment()) != null ? var6_6.getEntries() : null;
            var8_8 = 1;
            if (var5_5 == 0) break block73;
            if (var6_6 == null) ** GOTO lbl-1000
            var2_2 = var6_6;
            var2_2 = var6_6;
            var5_5 = var2_2.isEmpty() ^ var8_8;
            if (var5_5 != 0) {
                var2_2 = var6_6;
                var2_2 = ((Iterable)var6_6).iterator();
                block0: while (true) {
                    var9_9 = 0;
                    var10_10 = null;
                    while (var11_11 = var2_2.hasNext()) {
                        var12_12 = ((CartEntry)var2_2.next()).getOrderEntry();
                        if (var12_12 == null) continue;
                        var10_10 = var12_12.getCtaMessage();
                        if (var10_10 == null) continue block0;
                        var9_9 = 1;
                    }
                    break;
                }
                var5_5 = var9_9;
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = 0;
                var2_2 = null;
            }
        }
        if ((var10_10 = this.u0) != null) {
            var10_10 = this.x0;
            var12_12 = this.q0;
            if (var5_5 != 0) {
                if (var12_12 != null) {
                    var12_12.setDeliveryAddress(var1_1);
                }
                if (var12_12 != null && (var2_2 = var12_12.getConsignment()) != null) {
                    var2_2 = var2_2.getEntries();
                } else {
                    var5_5 = 0;
                    var2_2 = null;
                }
                if (var2_2 != null) {
                    var13_13 = var2_2;
                    var13_13 = (Collection)var2_2;
                    var14_15 = var13_13.isEmpty() ^ var8_8;
                    if (var14_15 != 0) {
                        var2_2 = var2_2.iterator();
                        while ((var14_15 = (int)var2_2.hasNext()) != 0) {
                            var13_13 = ((CartEntry)var2_2.next()).getOrderEntry();
                            if (var13_13 == null) continue;
                            var15_17 = var13_13.isReturnable();
                            if (var15_17 && (var15_17 = var13_13.isExchangeable())) {
                                if (var1_1 != null && !(var15_17 = var1_1.isReverseService()) && !(var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip((boolean)var8_8);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    if (var10_10 != null) {
                                        var16_19 = var10_10.getExchangeMessage();
                                    } else {
                                        var15_17 = 0;
                                        var16_19 = null;
                                    }
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && (var15_17 = var1_1.isReverseService()) == var8_8 && !(var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    if (var10_10 != null) {
                                        var16_19 = var10_10.getExchangeMessage();
                                    } else {
                                        var15_17 = 0;
                                        var16_19 = null;
                                    }
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && (var15_17 = var1_1.isReverseService()) == var8_8 && (var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible((boolean)var8_8);
                                    var16_19 = var13_13.getCtaMessage();
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 == null || (var15_17 = var1_1.isReverseService()) || !(var15_17 = var1_1.isExchangeService())) continue;
                                var12_12.setSelfShip(false);
                                var13_13.setReturnEligible(false);
                                var13_13.setExchangeEligible((boolean)var8_8);
                                var16_19 = var13_13.getCtaMessage();
                                var13_13.setReturnExchangeErrorMessage(var16_19);
                                continue;
                            }
                            var15_17 = var13_13.isReturnable();
                            if (var15_17 && !(var15_17 = var13_13.isExchangeable())) {
                                if (var1_1 != null && !(var15_17 = var1_1.isReverseService()) && !(var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip((boolean)var8_8);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    var16_19 = var13_13.getCtaMessage();
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && (var15_17 = var1_1.isReverseService()) == var8_8 && !(var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    var16_19 = var13_13.getCtaMessage();
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && (var15_17 = var1_1.isReverseService()) == var8_8 && (var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    var16_19 = var13_13.getCtaMessage();
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 == null || (var15_17 = var1_1.isReverseService()) || !(var15_17 = var1_1.isExchangeService())) continue;
                                var12_12.setSelfShip(false);
                                var13_13.setReturnEligible(false);
                                var13_13.setExchangeEligible((boolean)var8_8);
                                var16_19 = var13_13.getCtaMessage();
                                var13_13.setReturnExchangeErrorMessage(var16_19);
                                continue;
                            }
                            var15_17 = var13_13.isReturnable();
                            if (!var15_17 && (var15_17 = var13_13.isExchangeable())) {
                                if (var1_1 != null && (var15_17 = var1_1.isReverseService()) == var8_8 && (var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible(false);
                                    var13_13.setExchangeEligible((boolean)var8_8);
                                    var16_19 = var13_13.getCtaMessage();
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && !(var15_17 = var1_1.isReverseService()) && (var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip(false);
                                    var13_13.setReturnEligible(false);
                                    var13_13.setExchangeEligible(false);
                                    if (var10_10 != null) {
                                        var16_19 = var10_10.getExchangeMessage();
                                    } else {
                                        var15_17 = 0;
                                        var16_19 = null;
                                    }
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 != null && !(var15_17 = var1_1.isReverseService()) && !(var15_17 = var1_1.isExchangeService())) {
                                    var12_12.setSelfShip((boolean)var8_8);
                                    var13_13.setReturnEligible((boolean)var8_8);
                                    var13_13.setExchangeEligible(false);
                                    if (var10_10 != null) {
                                        var16_19 = var10_10.getExchangeMessage();
                                    } else {
                                        var15_17 = 0;
                                        var16_19 = null;
                                    }
                                    var13_13.setReturnExchangeErrorMessage(var16_19);
                                    continue;
                                }
                                if (var1_1 == null || (var15_17 = var1_1.isReverseService()) != var8_8 || (var15_17 = var1_1.isExchangeService())) continue;
                                var12_12.setSelfShip(false);
                                var13_13.setReturnEligible((boolean)var8_8);
                                var13_13.setExchangeEligible(false);
                                var16_19 = var13_13.getCtaMessage();
                                var13_13.setReturnExchangeErrorMessage(var16_19);
                                continue;
                            }
                            var15_17 = var13_13.isReturnable();
                            if (var15_17 || (var15_17 = var13_13.isExchangeable())) continue;
                            var12_12.setSelfShip(false);
                            var13_13.setReturnEligible(false);
                            var13_13.setExchangeEligible(false);
                            var16_19 = var13_13.getCtaMessage();
                            var13_13.setReturnExchangeErrorMessage(var16_19);
                        }
                    }
                }
            } else {
                if (var12_12 != null) {
                    var12_12.setDeliveryAddress(var1_1);
                }
                if (var12_12 != null && (var2_2 = var12_12.getConsignment()) != null) {
                    var2_2 = var2_2.getEntries();
                } else {
                    var5_5 = 0;
                    var2_2 = null;
                }
                if (var2_2 != null) {
                    var10_10 = var2_2;
                    var10_10 = (Collection)var2_2;
                    var9_9 = var10_10.isEmpty() ^ var8_8;
                    if (var9_9 != 0) {
                        if (var1_1 != null && (var9_9 = (int)var1_1.isReverseService()) == 0 && (var9_9 = (int)var1_1.isExchangeService()) == 0) {
                            if (var12_12 != null) {
                                var12_12.setSelfShip((boolean)var8_8);
                            }
                            var2_2 = var2_2.iterator();
                            while ((var9_9 = var2_2.hasNext()) != 0) {
                                var10_10 = (CartEntry)var2_2.next();
                                var13_14 = var10_10.getOrderEntry();
                                if (var13_14 == null) continue;
                                var10_10.getOrderEntry().setExchangeEligible(false);
                                var13_14 = var10_10.getOrderEntry();
                                var16_20 = var10_10.getOrderEntry();
                                var15_18 = var16_20.isReturnEligibleAtprodLevel();
                                var13_14.setReturnEligible(var15_18);
                                var10_10 = var10_10.getOrderEntry().getProduct();
                                Y63.g((Product)var10_10);
                            }
                        } else {
                            if (var12_12 != null) {
                                var12_12.setSelfShip(false);
                            }
                            if (var1_1 != null && (var9_9 = (int)var1_1.isExchangeService()) == var8_8) {
                                var2_2 = var2_2.iterator();
                                while ((var9_9 = var2_2.hasNext()) != 0) {
                                    var10_10 = (CartEntry)var2_2.next();
                                    var13_14 = var10_10.getOrderEntry();
                                    if (var13_14 != null) {
                                        var16_20 = var10_10.getOrderEntry();
                                        var15_18 = var16_20.isExchangeEligibleAtProdLevel();
                                        var13_14.setExchangeEligible(var15_18);
                                    }
                                    if ((var13_14 = var10_10.getOrderEntry()) != null) {
                                        var16_20 = var10_10.getOrderEntry();
                                        var15_18 = var16_20.isReturnEligibleAtprodLevel();
                                        var13_14.setReturnEligible(var15_18);
                                    }
                                    var10_10 = var10_10.getOrderEntry().getProduct();
                                    Y63.g((Product)var10_10);
                                }
                            } else if (var1_1 != null && (var9_9 = (int)var1_1.isReverseService()) == var8_8) {
                                var2_2 = var2_2.iterator();
                                while ((var9_9 = var2_2.hasNext()) != 0) {
                                    var10_10 = (CartEntry)var2_2.next();
                                    var10_10.getOrderEntry().setExchangeEligible(false);
                                    var13_14 = var10_10.getOrderEntry();
                                    var16_20 = var10_10.getOrderEntry();
                                    var15_18 = var16_20.isReturnEligibleAtprodLevel();
                                    var13_14.setReturnEligible(var15_18);
                                    var10_10 = var10_10.getOrderEntry().getProduct();
                                    Y63.g((Product)var10_10);
                                }
                            }
                        }
                    }
                }
                if (var12_12 != null && (var2_2 = var12_12.getConsignment()) != null) {
                    var2_2 = var2_2.getEntries();
                } else {
                    var5_5 = 0;
                    var2_2 = null;
                }
                if (var2_2 != null) {
                    var10_10 = var2_2;
                    var10_10 = (Collection)var2_2;
                    var9_9 = var10_10.isEmpty() ^ var8_8;
                    if (var9_9 != 0) {
                        var2_2 = var2_2.iterator();
                        while ((var9_9 = (int)var2_2.hasNext()) != 0) {
                            var10_10 = ((CartEntry)var2_2.next()).getOrderEntry();
                            if (var10_10 != null && (var14_16 = var10_10.isReturnEligible()) == 0 && (var14_16 = var10_10.isExchangeEligible()) == 0) {
                                var14_16 = R$string.return_exchange_not_avl_msg;
                                var13_14 = hv3_0.K(var14_16);
                                var10_10.setReturnExchangeErrorMessage((String)var13_14);
                                continue;
                            }
                            var14_16 = var10_10.isExchangeEligible();
                            if (var14_16 == 0) {
                                if (var12_12 != null && (var13_14 = var12_12.getOrderCode()) != null && (var14_16 = (int)b.s((String)var13_14, (String)(var16_20 = "EX"), false)) == var8_8) {
                                    var14_16 = R$string.exchange_not_avl_msg_ex;
                                    var13_14 = hv3_0.K(var14_16);
                                    var10_10.setReturnExchangeErrorMessage((String)var13_14);
                                } else {
                                    var14_16 = var10_10.isExchangeEligibleAtProdLevel();
                                    if (var14_16 == 0) {
                                        var14_16 = R$string.exchange_not_avl_msg;
                                        var13_14 = hv3_0.K(var14_16);
                                        var10_10.setReturnExchangeErrorMessage((String)var13_14);
                                    } else {
                                        var14_16 = R$string.exchange_pincode_avl_msg;
                                        var13_14 = hv3_0.K(var14_16);
                                        var10_10.setReturnExchangeErrorMessage((String)var13_14);
                                    }
                                }
                            }
                            if ((var14_16 = var10_10.isReturnEligible()) != 0) continue;
                            var14_16 = (int)var10_10.isReturnEligibleAtprodLevel();
                            if (var14_16 == 0) {
                                var14_16 = R$string.return_not_avl_msg;
                                var13_14 = hv3_0.K(var14_16);
                                var10_10.setReturnExchangeErrorMessage((String)var13_14);
                                continue;
                            }
                            var14_16 = R$string.return_pincode_avl_msg;
                            var13_14 = hv3_0.K(var14_16);
                            var10_10.setReturnExchangeErrorMessage((String)var13_14);
                        }
                    }
                }
            }
        }
        var2_2 = var6_6;
        var2_2 = var6_6;
        var10_10 = "GIFTS_ITEMS_DATA";
        var12_12 = "RETURN_ITEMS_DATA";
        if (var2_2 != null && (var5_5 = var2_2.isEmpty()) == 0 && (var5_5 = var6_6.size()) > var8_8) {
            var2_2 = new Object((Context)this, NewExchangeReturnSelectionListActivity.class);
            var4_4 /* !! */  = this.q0;
            var2_2.putExtra((String)var12_12, (Serializable)var4_4 /* !! */ );
            var6_6 = this.C0;
            var2_2.putExtra("IS_FROM_JOUNRNEY", (String)var6_6);
            var4_4 /* !! */  = this.r0;
            var2_2.putExtra((String)var10_10, (Serializable)var4_4 /* !! */ );
            var3_3 = h40_0.l1();
            if (var3_3) {
                if (var1_1 != null) {
                    var8_8 = var1_1.isReverseService();
                }
                this.y2((Intent)var2_2, (boolean)var8_8);
            }
            var17_21 = 21;
            this.startActivityForResult((Intent)var2_2, var17_21);
        } else {
            var2_2 = this.q0;
            if (var2_2 != null && (var2_2 = var2_2.getSelectedList()) != null) {
                if (var6_6 != null) {
                    var7_7 = var6_6 = var6_6.get(0);
                    var7_7 = (CartEntry)var6_6;
                }
                var4_4 /* !! */  = Integer.valueOf(0);
                var2_2 = (Integer)var2_2.put(var7_7, var4_4 /* !! */ );
            }
            var2_2 = new Object((Context)this, ExchangeReturnControllerActivity.class);
            var4_4 /* !! */  = this.q0;
            var2_2.putExtra((String)var12_12, (Serializable)var4_4 /* !! */ );
            var4_4 /* !! */  = this.r0;
            var2_2.putExtra((String)var10_10, (Serializable)var4_4 /* !! */ );
            var3_3 = h40_0.l1();
            if (var3_3) {
                if (var1_1 != null) {
                    var8_8 = var1_1.isReverseService();
                }
                this.y2((Intent)var2_2, (boolean)var8_8);
            }
            var17_22 = 203;
            this.startActivityForResult((Intent)var2_2, var17_22);
        }
    }
}

