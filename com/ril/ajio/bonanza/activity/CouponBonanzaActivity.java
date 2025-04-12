/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.bonanza.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.D;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity$a;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity$b;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity$c;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

public final class CouponBonanzaActivity
extends ComponentActivity {
    public final D X;

    public CouponBonanzaActivity() {
        D d2;
        CouponBonanzaActivity$a couponBonanzaActivity$a = new CouponBonanzaActivity$a(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(ob0_1.class);
        CouponBonanzaActivity$b couponBonanzaActivity$b = new CouponBonanzaActivity$b(this);
        CouponBonanzaActivity$c couponBonanzaActivity$c = new CouponBonanzaActivity$c(this);
        this.X = d2 = new D(yn1_22, couponBonanzaActivity$b, couponBonanzaActivity$a, couponBonanzaActivity$c);
    }

    public final ob0_1 l2() {
        return (ob0_1)this.X.getValue();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = nu1_0.a(this);
        Function2 function2 = new aa0_2(this, null);
        ((iu1_0)object).c(function2);
        object = nu1_0.a(this);
        function2 = new ba0_2(this, null);
        ((iu1_0)object).c(function2);
        object = new ca0_1(this);
        function2 = new u10(-1230826130, object, true);
        f10.a(this, (u10)function2);
    }

    public final void onResume() {
        super.onResume();
        ob0_1 ob0_12 = this.l2();
        Object object = ob0_12.e;
        boolean bl2 = ob0_12.p();
        Object object2 = bl2;
        ((h83_0)object).setValue(object2);
        object = ob0_12.m();
        object2 = "sale_ended";
        boolean bl3 = ((String)object).equalsIgnoreCase((String)object2);
        if (!bl3) {
            bl3 = false;
            bl2 = false;
            object2 = null;
            int n3 = 7;
            object = ob0_1.f(ob0_12, null, 0, n3);
            ob0_12.d((CouponBonanzaInfoRequest)object);
        }
    }
}

