/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Address
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 */
package com.ril.ajio.myaccount.address.fragment;

import android.location.Address;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatEditText;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class AddAddressFragment$AddressResultReceiver
extends ResultReceiver {
    public final /* synthetic */ AddAddressFragment a;

    public AddAddressFragment$AddressResultReceiver(AddAddressFragment addAddressFragment, Handler handler) {
        this.a = addAddressFragment;
        super(handler);
    }

    public final void onReceiveResult(int n3, Bundle object) {
        Regex regex;
        Object object2;
        String string2;
        int n4;
        Object object3 = "resultData";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        n3 = Build.VERSION.SDK_INT;
        int n7 = 33;
        CharSequence charSequence = null;
        if (n3 >= n7) {
            object3 = (Parcelable)A4.a((Bundle)object);
        } else {
            object3 = object.getParcelable("com.ril.ajio.view.myaccount.addressRESULT_DATA_KEY");
            n4 = object3 instanceof Address;
            if (n4 == 0) {
                n3 = 0;
                object3 = null;
            }
            object3 = (Address)object3;
        }
        object3 = (Address)object3;
        if (object3 == null) {
            return;
        }
        n4 = object3.getMaxAddressLineIndex();
        Object object4 = "";
        if (n4 >= 0) {
            int n8 = 0;
            string2 = null;
            while (true) {
                object2 = object3.getAddressLine(n8);
                if (n8 != n4) {
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            object2 = object4;
        }
        object = new CartDeliveryAddress();
        string2 = oo1_1.a(",", (String)object2, (String)object4);
        object2 = object3.getLocality();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object2 = object3.getLocality();
            Intrinsics.checkNotNullExpressionValue(object2, "getLocality(...)");
            regex = new Regex((String)object2);
            string2 = regex.replace(string2, (String)object4);
            object2 = object3.getLocality();
            ((CartDeliveryAddress)object).setDistrict((String)object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = object3.getPostalCode())))) {
            object2 = object3.getPostalCode();
            Intrinsics.checkNotNullExpressionValue(object2, "getPostalCode(...)");
            regex = new Regex((String)object2);
            string2 = regex.replace(string2, (String)object4);
            object2 = object3.getPostalCode();
            ((CartDeliveryAddress)object).setPostalCode((String)object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = object3.getAdminArea())))) {
            object2 = object3.getAdminArea();
            Intrinsics.checkNotNullExpressionValue(object2, "getAdminArea(...)");
            regex = new Regex((String)object2);
            string2 = regex.replace(string2, (String)object4);
            object2 = object3.getAdminArea();
            ((CartDeliveryAddress)object).setState((String)object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = object3.getCountryName())))) {
            object3 = object3.getCountryName();
            Intrinsics.checkNotNullExpressionValue(object3, "getCountryName(...)");
            object2 = new Regex((String)object3);
            string2 = ((Regex)object2).replace(string2, (String)object4);
        }
        ((CartDeliveryAddress)object).setLine2(string2);
        object3 = this.a;
        object4 = ((AddAddressFragment)object3).n;
        if (object4 != null) {
            Intrinsics.checkNotNull(object4);
            object4 = ((CartDeliveryAddress)object4).getFirstName();
            ((CartDeliveryAddress)object).setFirstName((String)object4);
            object4 = ((AddAddressFragment)object3).n;
            Intrinsics.checkNotNull(object4);
            object4 = ((CartDeliveryAddress)object4).getLastName();
            ((CartDeliveryAddress)object).setLastName((String)object4);
            object4 = ((AddAddressFragment)object3).n;
            Intrinsics.checkNotNull(object4);
            object4 = ((CartDeliveryAddress)object4).getLandmark();
            ((CartDeliveryAddress)object).setLandmark((String)object4);
            object4 = ((AddAddressFragment)object3).n;
            Intrinsics.checkNotNull(object4);
            object4 = ((CartDeliveryAddress)object4).getPhone();
            ((CartDeliveryAddress)object).setPhone((String)object4);
        }
        object4 = ((AddAddressFragment)object3).e;
        Intrinsics.checkNotNull(object4);
        object4 = ((AppCompatEditText)object4).getText();
        n7 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
        if (n7 == 0) {
            object4 = ((AddAddressFragment)object3).e;
            Intrinsics.checkNotNull(object4);
            object4 = ((AppCompatEditText)object4).getText();
            if (object4 != null) {
                charSequence = StringsKt.m0((CharSequence)object4);
            }
            object4 = String.valueOf(charSequence);
            ((CartDeliveryAddress)object).setPhone((String)object4);
        }
        ((AddAddressFragment)object3).Ua((CartDeliveryAddress)object);
    }
}

