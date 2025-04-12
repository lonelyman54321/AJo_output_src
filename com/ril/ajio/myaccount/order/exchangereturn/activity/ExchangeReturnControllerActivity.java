/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.MenuItem
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.E$b;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExchangeReturnControllerActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.b;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class ExchangeReturnControllerActivity
extends Hilt_ExchangeReturnControllerActivity
implements sk_1 {
    public ReturnOrderItemDetails p0;
    public final NewEEcommerceEventsRevamp q0;
    public final NewCustomEventsRevamp r0;
    public final String s0;
    public final String t0;
    public ud0_2 u0;

    public ExchangeReturnControllerActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.q0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.r0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.s0 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.t0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void k(boolean bl2) {
        if (bl2) {
            Bus bus = AB0.a();
            String string2 = "finish";
            bus.post(string2);
        }
        this.finish();
    }

    public final void onBackPressed() {
        Object object = this.getSupportFragmentManager();
        Object object2 = "EXCHANGE_CONTROLLER_TAG";
        boolean bl2 = (object = ((FragmentManager)object).E((String)object2)) instanceof b;
        if (bl2) {
            object = ((b)object).q;
            int n3 = ((ArrayList)object).size();
            if (n3 > 0) {
                a.Companion.getClass();
                n3 = 1;
                bl2 = false;
                object = a$a.a(n3 != 0, false);
                object2 = this.getSupportFragmentManager();
                String string2 = "CancelConfirmationBottomSheet";
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            } else {
                object = this.getSupportFragmentManager();
                n3 = ((FragmentManager)object).J();
                if (n3 > 0) {
                    object = this.getSupportFragmentManager();
                    ((FragmentManager)object).V();
                } else {
                    super.onBackPressed();
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        AB0.a().register(this);
        int n3 = R$layout.activity_exchange_return_controller_list;
        this.setContentView(n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = ud0_2.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object2 = Reflection.getOrCreateKotlinClass((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            Object object5;
            int n4;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            this.u0 = object = (ud0_2)((pD3)object).a((yn1_2)object2, (String)object3);
            object = this.getIntent();
            object2 = "RETURN_ITEMS_DATA";
            object.hasExtra((String)object2);
            object = this.getIntent();
            object3 = "getIntent(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            int n7 = Build.VERSION.SDK_INT;
            int n8 = 33;
            Object object6 = null;
            if (n7 >= n8) {
                object = jn.a((Intent)object);
            } else {
                n4 = (object = object.getSerializableExtra((String)object2)) instanceof ReturnOrderItemDetails;
                if (n4 == 0) {
                    n3 = 0;
                    object = null;
                }
                object = (ReturnOrderItemDetails)object;
            }
            this.p0 = object = (ReturnOrderItemDetails)object;
            object = this.getIntent().getExtras();
            object2 = this.u0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exchangeReturnControllerViewModel");
                n4 = 0;
                object2 = null;
            }
            object4 = this.p0;
            object2.getClass();
            n4 = 0;
            object2 = null;
            if (object4 != null && (object4 = ((ReturnOrderItemDetails)object4).getSelectedList()) != null && (object4 = ((HashMap)object4).keySet()) != null) {
                boolean bl2;
                object4 = object4.iterator();
                while (bl2 = object4.hasNext()) {
                    object5 = (CartEntry)object4.next();
                    if (object5 != null) {
                        object5 = ((CartEntry)object5).getDropAtStore();
                    } else {
                        bl2 = false;
                        object5 = null;
                    }
                    if (object5 == null) continue;
                    ++n4;
                }
            }
            if (object != null) {
                object4 = "DROP_AT_STORE_ITEM_COUNT";
                object.putInt(object4, n4);
            }
            object2 = new b();
            ((Fragment)object2).setArguments((Bundle)object);
            object = this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
            object.getClass();
            object4 = new androidx.fragment.app.a((FragmentManager)object);
            Intrinsics.checkNotNullExpressionValue(object4, "beginTransaction(...)");
            n3 = R$id.item_list_controller_contentframe;
            object5 = "EXCHANGE_CONTROLLER_TAG";
            ((k)object4).j(n3, (Fragment)object2, (String)object5);
            ((androidx.fragment.app.a)object4).d();
            object = this.getIntent();
            if (object != null) {
                object = object.getExtras();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (object = this.getIntent()) != null && (object = object.getExtras()) != null && (n3 = (int)(object.containsKey((String)(object2 = "GIFTS_ITEMS_DATA")) ? 1 : 0)) == (n7 = 1)) {
                object = this.getIntent();
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                int n10 = Build.VERSION.SDK_INT;
                if (n10 >= n8) {
                    object = kn.b((Intent)object);
                } else {
                    n4 = (object = object.getSerializableExtra((String)object2)) instanceof HashMap;
                    if (n4 != 0) {
                        object6 = object;
                    }
                    object = object6;
                    object = (HashMap)object6;
                }
                object = (HashMap)object;
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onDestroy() {
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Object object = "item";
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int bl2 = menuItem.getItemId();
        int n3 = 16908332;
        if (bl2 == n3) {
            a.Companion.getClass();
            boolean bl3 = true;
            boolean bl4 = false;
            object = a$a.a(bl3, false);
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            String string2 = "CancelConfirmationBottomSheet";
            ((DialogFragment)object).show(fragmentManager, string2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.r0.getSTEP();
        bundle.putInt((String)object, 2);
        String string2 = this.s0;
        String string3 = this.t0;
        this.r0.newPushCustomScreenView("return or exchange mode selection screen", "order management screen", string2, bundle, string3);
        object = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(this.r0, "", "", null, "openScreen", "return or exchange mode selection screen", "order management screen", string4, bundle, string5, false, null, 1540, null);
    }

    public final void onStop() {
        super.onStop();
        this.q0.setPreviousScreenData("return or exchange mode selection screen", "order management screen");
    }
}

