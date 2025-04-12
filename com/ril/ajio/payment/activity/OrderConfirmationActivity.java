/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.payment.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.payment.activity.Hilt_OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$a;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$b;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.user.UserInformation;
import in.juspay.services.HyperServices;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class OrderConfirmationActivity
extends Hilt_OrderConfirmationActivity {
    public static final OrderConfirmationActivity$a Companion;
    public HashMap p0;
    public HashMap q0;
    public String r0 = "";
    public ConvenienceFeePriceSplitUp s0;
    public String t0;
    public String u0;
    public ji0_2 v0;
    public jo_2 w0;
    public final hh3_2 x0;
    public final hh3_2 y0;

    static {
        OrderConfirmationActivity$a orderConfirmationActivity$a;
        Companion = orderConfirmationActivity$a = new Object();
    }

    public OrderConfirmationActivity() {
        Object object = new sa2_1(this);
        this.x0 = object = yr1_2.b((Function0)object);
        object = new ta2_2(this);
        this.y0 = object = yr1_2.b((Function0)object);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        HyperServices hyperServices = xn.b;
        if (hyperServices != null) {
            hyperServices.terminate();
        }
        xn.b = null;
        at2_1.e((Context)this);
        this.finish();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        int n3;
        String string2;
        String string3;
        int n4;
        super.onCreate((Bundle)object);
        int n7 = R$layout.activity_order_confirmation;
        this.setContentView(n7);
        Object object4 = this.getApplicationContext();
        Object object5 = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
        object = new jo_2((Context)object4);
        this.w0 = object;
        object = f00.c;
        if (object == null) {
            this.finish();
        }
        object = f00.c;
        boolean bl2 = false;
        object4 = null;
        f00.c = null;
        object5 = this.getIntent();
        Object object6 = "ORDER_COD_FEE_DATA";
        int n8 = object5.hasExtra((String)object6);
        int n10 = 33;
        Object object7 = "getIntent(...)";
        if (n8 != 0) {
            object5 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object5, (String)object7);
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n10) {
                object5 = qa2_0.a((Intent)object5);
            } else {
                n4 = (object5 = object5.getSerializableExtra((String)object6)) instanceof ConvenienceFeePriceSplitUp;
                if (!n4) {
                    n8 = 0;
                    object5 = null;
                }
                object5 = (ConvenienceFeePriceSplitUp)object5;
            }
            this.s0 = object5 = (ConvenienceFeePriceSplitUp)object5;
        }
        if ((n8 = (object5 = this.getIntent()).hasExtra(string3 = "IS_COD_BLOCKED")) != 0) {
            this.t0 = object5 = this.getIntent().getStringExtra(string3);
        }
        if ((n8 = (object5 = this.getIntent()).hasExtra(string2 = "FB_EVENT_DATA")) != 0) {
            object5 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object5, (String)object7);
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n10) {
                object5 = ra2_0.a((Intent)object5);
            } else {
                n10 = (object5 = object5.getSerializableExtra(string2)) instanceof ji0_2;
                if (!n10) {
                    n8 = 0;
                    object5 = null;
                }
                object5 = (ji0_2)object5;
            }
            this.v0 = object5 = (ji0_2)object5;
        }
        if ((n8 = (object5 = this.getIntent()).hasExtra((String)(object3 = "payment_type"))) != 0) {
            this.u0 = object5 = this.getIntent().getStringExtra((String)object3);
        }
        if ((object5 = this.w0) == null) {
            object5 = "appPreferences";
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object4 = object5;
        }
        object4 = ((jo_2)object4).f();
        object5 = "New";
        n10 = 1;
        bl2 = b.i((String)object4, (String)object5, n10 != 0);
        if (bl2) {
            object4 = this.y0;
            object5 = ((hy3_0)((hh3_2)object4).getValue()).m;
            int n14 = 1;
            object7 = new wy1_1(this, n14);
            object2 = new OrderConfirmationActivity$b((wy1_1)object7);
            ((LiveData)object5).e(this, (F62)object2);
            object5 = ((UserInformation)this.x0.getValue()).getUserEmailId();
            object7 = (hy3_0)((hh3_2)object4).getValue();
            n3 = (int)(((hy3_0)object7).p() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0)) == 0) {
                object4 = (hy3_0)((hh3_2)object4).getValue();
                Intrinsics.checkNotNull(object5);
                object7 = "BackGround_User_Type";
                ((hy3_0)object4).o((String)object5, (String)object7);
            }
        }
        if (object == null) return;
        this.p0 = object4 = object.d;
        this.q0 = object4 = object.e;
        this.r0 = object4 = object.f;
        object4 = f.Companion;
        object5 = this.s0;
        object7 = this.v0;
        object2 = this.t0;
        String string4 = this.u0;
        object4.getClass();
        object4 = new f();
        Bundle bundle = new Bundle();
        String string5 = object.a;
        bundle.putString("order_no", string5);
        string5 = object.b;
        bundle.putString("cart_order", string5);
        String string6 = "ajio_cash_point";
        float f5 = object.c;
        bundle.putFloat(string6, f5);
        bundle.putSerializable((String)object6, (Serializable)object5);
        bundle.putSerializable(string2, (Serializable)object7);
        bundle.putString(string3, (String)object2);
        bundle.putString("PAYMENT_TYPE", string4);
        ((Fragment)object4).setArguments(bundle);
        object = "order_confirmation_tag";
        n8 = R$id.aocFragmentContainer;
        object6 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object6, "getSupportFragmentManager(...)");
        object6.getClass();
        object7 = new a((FragmentManager)object6);
        string3 = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(object7, string3);
        try {
            ((k)object7).j(n8, (Fragment)object4, (String)object);
            ((a)object7).o(n10 != 0, n10 != 0);
            ((FragmentManager)object6).C();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Exception exception2;
            block20: {
                block19: {
                    try {
                        object3 = new a((FragmentManager)object6);
                        object7 = ((FragmentManager)object6).E((String)object);
                        if (object7 == null || !(n4 = ((Fragment)object7).isAdded())) break block19;
                        ((a)object3).i((Fragment)object7);
                        ((a)object3).d();
                        object3 = new a((FragmentManager)object6);
                    }
                    catch (Exception exception2) {
                        break block20;
                    }
                }
                ((k)object3).j(n8, (Fragment)object4, (String)object);
                ((a)object3).d();
                return;
            }
            object4 = yn3_0.a;
            ((yn3$a)object4).e(exception2);
        }
    }
}

