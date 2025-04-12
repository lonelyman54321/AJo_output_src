/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.provider.Settings$Secure
 */
package com.ril.ajio.cart.address;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import kotlin.jvm.internal.Intrinsics;

public final class CartAddressListBottomSheet$locationModeReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ CartAddressListBottomSheet a;

    public CartAddressListBottomSheet$locationModeReceiver$1(CartAddressListBottomSheet cartAddressListBottomSheet) {
        this.a = cartAddressListBottomSheet;
    }

    public final void onReceive(Context object, Intent object2) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "intent");
        object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getContentResolver();
        string2 = "location_mode";
        int n3 = Settings.Secure.getInt((ContentResolver)object, (String)string2, (int)0);
        if (n3 != 0) {
            ((CartAddressListBottomSheet)object2).Ra();
        } else {
            object = ((CartAddressListBottomSheet)object2).t;
            if (object != null) {
                int n4 = 8;
                object.setVisibility(n4);
            }
            if ((object = ((CartAddressListBottomSheet)object2).j) != null) {
                object.setVisibility(0);
            }
            if ((object = ((CartAddressListBottomSheet)object2).r) != null) {
                object.setVisibility(0);
            }
            if ((object = ((CartAddressListBottomSheet)object2).s) != null) {
                int n7 = 4;
                object.setVisibility(n7);
            }
            object = "screen_view";
            object2 = "";
            CartAddressListBottomSheet.Qa((String)object, (String)object2, (String)object2);
        }
    }
}

