/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.ondemand.customercare.view.activity.CCCancelOrderActivity$1;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public class CCCancelOrderActivity
extends BaseSplitActivity
implements OnFragmentInteractionListener,
ps1_2 {
    private os1_2 cartOrderSharedViewModel;

    private void addCancelReasonFragment(String object, String object2, CartOrder object3) {
        this.cartOrderSharedViewModel.b.k(object3);
        object3 = this.cartOrderSharedViewModel.c;
        Bundle bundle = new HashMap();
        ((LiveData)object3).k(bundle);
        object3 = new CancelReasonFragment();
        bundle = new Bundle();
        bundle.putString("cart_string", (String)object);
        bundle.putString("order_no", (String)object2);
        ((Fragment)object3).setArguments(bundle);
        object = this.getSupportFragmentManager();
        object.getClass();
        object2 = new a((FragmentManager)object);
        int n3 = R$id.cccancel_order_contentframe;
        ((k)object2).j(n3, (Fragment)object3, "CancelReasonFragment");
        ((a)object2).d();
    }

    public boolean getRefreshOrderList() {
        return false;
    }

    public AjioCustomToolbar getToolbar() {
        return null;
    }

    public void hideToolbarLayout() {
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_cccancel_order;
        this.setContentView(n3);
        n3 = R$id.cccancel_order_toolbar;
        object = (Toolbar)this.findViewById(n3);
        int n4 = R$id.toolbar_title;
        Object object2 = (TextView)object.findViewById(n4);
        int n7 = R$id.cccancel_order_divider;
        Object object3 = (TextView)this.findViewById(n7);
        object2.setText((CharSequence)"Cancel Item");
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object5, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        pD3 pD32 = new pD3((rd3_0)object4, (E$b)object5, (Wd0)object2);
        object2 = os1_2.class;
        object4 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object2 = rn1_2.c((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object4 = object2.getQualifiedName();
        if (object4 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
            this.cartOrderSharedViewModel = object2 = (os1_2)pD32.a((yn1_2)object2, (String)object4);
            n4 = 8;
            object.setVisibility(n4);
            object3.setVisibility(n4);
            object = this.getIntent().getStringExtra("CART_ENTRY_JSON");
            object2 = this.getIntent().getStringExtra("CART_ID");
            object3 = this.getIntent();
            object4 = "cart order";
            object5 = CartOrder.class;
            object3 = (CartOrder)cp_1.N((Intent)object3, (String)object4, (Class)object5);
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)object2))) {
                this.finish();
            }
            this.addCancelReasonFragment((String)object, (String)object2, (CartOrder)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public void onFragmentInteraction(String string2, int n3, Bundle bundle) {
        this.setResult(-1);
        this.finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n3;
        int n4 = menuItem.getItemId();
        if (n4 == (n3 = 16908332)) {
            this.finish();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void redirectToHome() {
    }

    public void setRefreshOrderList(boolean bl2) {
    }

    public void setToolbarState(Fragment fragment) {
    }

    public void showNotification(String string2, String object) {
        int n3 = R$id.notification;
        View view = this.findViewById(n3);
        int n4 = R$id.notification_text;
        TextView textView = (TextView)this.findViewById(n4);
        int n7 = hv3_0.w(R$integer.notification_anim_delay);
        int n8 = hv3_0.w(R$integer.notification_anim_post_release_delay);
        if (string2 != null) {
            textView.setText((CharSequence)string2);
        } else {
            string2 = "";
            textView.setText((CharSequence)string2);
        }
        string2 = new TranslateAnimation(0.0f, 0.0f, -100.0f, 0.0f);
        long l2 = n7;
        string2.setDuration(l2);
        n4 = 0;
        textView = null;
        view.setVisibility(0);
        if (object != null) {
            view.setContentDescription((CharSequence)object);
        }
        object = new CCCancelOrderActivity$1(this, n7, view);
        long l3 = n8;
        view.postDelayed((Runnable)object, l3);
        view.startAnimation((Animation)string2);
    }

    public void showNotificationMyAccountFragment(String string2, String string3) {
        super.showNotification(string2, string3);
    }

    public void showTabLayout(boolean bl2) {
    }

    public void showUpButton(boolean bl2, int n3, int n4, String string2) {
    }
}

