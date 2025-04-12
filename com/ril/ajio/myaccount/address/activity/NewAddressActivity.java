/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.myaccount.address.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

public final class NewAddressActivity
extends BaseSplitActivity {
    public static final NewAddressActivity$a Companion;
    public AddAddressFragment X;

    static {
        NewAddressActivity$a newAddressActivity$a;
        Companion = newAddressActivity$a = new Object();
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        AddAddressFragment addAddressFragment = this.X;
        if (addAddressFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            addAddressFragment = null;
        }
        addAddressFragment.onActivityResult(n3, n4, intent);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_new_address;
        this.setContentView(n3);
        object = this.getIntent().getExtras();
        if (object == null) {
            object = new Bundle();
        }
        Object object2 = new AddAddressFragment();
        this.X = object2;
        object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        Object object3 = "shipping_add_address";
        boolean bl2 = ((ao0_0)object2).a((String)object3);
        boolean bl3 = true;
        String string2 = "isGoogleLocationEnable";
        if (bl2) {
            bl2 = object.containsKey(string2);
            if (bl2 && (bl2 = object.getBoolean(string2))) {
                object.putBoolean(string2, bl3);
            }
        } else {
            object2 = "HAS_TOOLBAR";
            object.putBoolean((String)object2, bl3);
            object.putBoolean((String)object2, bl3);
            bl2 = false;
            object2 = null;
            object.putBoolean(string2, false);
        }
        object2 = this.X;
        bl3 = false;
        object3 = null;
        string2 = "mFragment";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object2 = null;
        }
        ((Fragment)object2).setArguments((Bundle)object);
        object = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
        object.getClass();
        object2 = new a((FragmentManager)object);
        object = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        n3 = R$id.address_new_contentframe;
        AddAddressFragment addAddressFragment = this.X;
        if (addAddressFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = addAddressFragment;
        }
        ((k)object2).j(n3, (Fragment)object3, "AddAddressFragment");
        ((a)object2).d();
    }

    public final void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        Intrinsics.checkNotNullParameter(stringArray, "permissions");
        Intrinsics.checkNotNullParameter(nArray, "grantResults");
        AddAddressFragment addAddressFragment = this.X;
        if (addAddressFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            addAddressFragment = null;
        }
        addAddressFragment.onRequestPermissionsResult(n3, stringArray, nArray);
    }
}

