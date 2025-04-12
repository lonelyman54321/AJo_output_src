/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Editable
 *  android.text.TextWatcher
 */
package com.ril.ajio.myaccount.address.fragment;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class AddAddressFragment$c
implements TextWatcher {
    public final /* synthetic */ AddAddressFragment a;

    public AddAddressFragment$c(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void afterTextChanged(Editable object) {
        Object object2 = "s";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.length();
        int n4 = 6;
        if (n3 == n4) {
            object = object.toString();
            object2 = this.a;
            Object object3 = ((AddAddressFragment)object2).v;
            if (object3 != null) {
                object3.startLoader();
            }
            object3 = p3.a("client_type", "Android");
            AJIOApplication.Companion.getClass();
            Object object4 = p90.a((Context)AJIOApplication$a.a());
            ((HashMap)object3).put("client_version", object4);
            object4 = ((AddAddressFragment)object2).Ra();
            String string2 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            object4 = ServiceUtil.getToken((UserInformation)object4);
            if (object4 != null && (object2 = ((AddAddressFragment)object2).z) != null) {
                ((h5_0)object2).b((String)object4, (String)object, (HashMap)object3);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }
}

