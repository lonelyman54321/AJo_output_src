/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.MenuItem
 *  android.widget.TextView
 */
package com.ril.ajio.payment.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class CheckoutAddressActivity
extends BaseSplitActivity {
    public static final /* synthetic */ int q0;
    public Fragment X;
    public AjioLoaderView Y;
    public h5_0 Z;
    public final UserInformation k0;
    public String p0;

    public CheckoutAddressActivity() {
        UserInformation userInformation;
        this.k0 = userInformation = VX0.a(AJIOApplication.Companion);
    }

    public final void onBackPressed() {
        Fragment fragment = this.X;
        boolean bl2 = fragment instanceof kt_2;
        if (bl2) {
            String string2 = "null cannot be cast to non-null type com.ril.ajio.payment.fragment.CheckoutAddressTabFragment";
            Intrinsics.checkNotNull(fragment, string2);
            fragment = (kt_2)fragment;
            ((kt_2)fragment).setResultAndFinish();
        } else {
            bl2 = fragment instanceof gt_2;
            if (bl2) {
                String string3 = "null cannot be cast to non-null type com.ril.ajio.payment.fragment.CheckoutAddressFragment";
                Intrinsics.checkNotNull(fragment, string3);
                fragment = (gt_2)fragment;
                ((gt_2)fragment).setResultAndFinish();
            } else {
                super.onBackPressed();
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_checkout_address_revamp;
        this.setContentView(n3);
        n3 = R$id.ex_checkout_address_progressView;
        object = (AjioLoaderView)this.findViewById(n3);
        this.Y = object;
        object = kd3_2.a();
        Object object2 = new AddressRepo();
        Object object3 = this.getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        Intrinsics.checkNotNull(object);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = h5_0.class;
        String string2 = "modelClass";
        object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object2, (Class)object3, string2);
        object2 = "<this>";
        object3 = sw0_0.a((Class)object3, (String)object2, (Class)object3, string2, string2);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object4).concat((String)object2);
            this.Z = object = (h5_0)((pD3)object).a((yn1_2)object3, (String)object2);
            if (object != null && (object = ((h5_0)object).f) != null) {
                object2 = new zs_0(this);
                ((LiveData)object).e(this, (F62)object2);
            }
            if ((object = this.Y) != null) {
                ((AjioLoaderView)((Object)object)).startLoader();
            }
            object = p3.a("client_type", "Android");
            AJIOApplication.Companion.getClass();
            object2 = p90.a((Context)AJIOApplication$a.a());
            ((HashMap)object).put("client_version", object2);
            object3 = this.k0;
            Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
            object2 = ServiceUtil.getToken((UserInformation)object3);
            if (object2 != null && (object4 = this.Z) != null) {
                object3 = ((UserInformation)object3).getUserId();
                string2 = "getUserId(...)";
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                ((h5_0)object4).d((String)object2, (String)object3, (HashMap)object);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.finish();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void showNotification(String string2, String string3) {
        int n3 = R$id.notification_text;
        TextView textView = (TextView)this.findViewById(n3);
        hv3_0.j0(string2, string3, textView);
    }

    public final void y2(boolean bl2) {
        Object object;
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        Object object3 = "masterFlagToEnablePickupstore";
        boolean bl3 = ((ao0_0)object2).a((String)object3);
        if (bl3) {
            object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
            object3 = "enablePickupstore";
            bl3 = ((ao0_0)object2).a((String)object3);
            object = bl2 ? new kt_2() : (bl3 ? new kt_2() : new gt_2());
        } else {
            object = new gt_2();
        }
        this.X = object;
        object = this.getIntent();
        if (object != null && (object = this.X) != null) {
            object2 = this.getIntent().getExtras();
            ((Fragment)object).setArguments((Bundle)object2);
        }
        object = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
        object.getClass();
        object2 = new a((FragmentManager)object);
        Intrinsics.checkNotNullExpressionValue(object2, "beginTransaction(...)");
        int n3 = R$id.checkout_address_contentframe;
        object3 = this.X;
        Intrinsics.checkNotNull(object3);
        ((k)object2).j(n3, (Fragment)object3, "CheckoutAddressTabFragment");
        ((a)object2).d();
    }
}

