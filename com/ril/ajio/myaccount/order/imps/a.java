/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
package com.ril.ajio.myaccount.order.imps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.ajiocash.datasource.AjioWalletToBankTransferConfig;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.a$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class a
extends w41_0 {
    public static final a$a Companion;
    public static final String j;
    public dj2_0 f;
    public AjioTextView g;
    public AjioTextView h;
    public AjioTextView i;

    static {
        Object object = new Object();
        Companion = object;
        object = a.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "getSimpleName(...)");
        j = object;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReplaceFragmentCallback");
        object = (dj2_0)object;
        this.f = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = ye3_0.a;
        km_1.a(AnalyticsManager.Companion, "IMPS transfer requested screen");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.ajio_cash_transfer_status_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3 = 1;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.continue_shopping;
        object2 = (AjioTextView)object.findViewById(n4);
        this.g = object2;
        n4 = R$id.transfer_details;
        object2 = (AjioTextView)object.findViewById(n4);
        this.h = object2;
        n4 = R$id.ajio_cash_msg;
        object2 = (AjioTextView)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.ajio_cash_status_message;
        object = (AjioTextView)object.findViewById(n4);
        object = this.f;
        n4 = 0;
        object2 = null;
        if (object != null) {
            float f5 = object.s1();
            object = Float.valueOf(f5);
        } else {
            object = null;
            float f6 = 0.0f;
        }
        object3 = h40_0.a;
        object3 = h40_0.e();
        if (object3 != null) {
            object2 = ((AjioWalletToBankTransferConfig)object3).c();
        }
        object3 = "format(...)";
        if (object2 != null) {
            AjioTextView ajioTextView = this.i;
            if (ajioTextView != null) {
                Object[] objectArray = StringCompanionObject.INSTANCE;
                object = qz2_0.x((Float)object);
                objectArray = new Object[n3];
                objectArray[0] = object;
                n40_0.a(objectArray, n3, (String)object2, (String)object3, ajioTextView);
            }
        } else {
            object2 = this.i;
            if (object2 != null) {
                Object object4 = StringCompanionObject.INSTANCE;
                int n7 = R$string.imps_transfer_initiated_message;
                object4 = this.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object4, "getString(...)");
                object = qz2_0.x((Float)object);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                n40_0.a(objectArray, n3, (String)object4, (String)object3, (AjioTextView)object2);
            }
        }
        object = this.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity");
        object = (ReturnImpsActivity)object;
        object2 = j;
        ((ReturnImpsActivity)object).z2((String)object2);
        object = this.g;
        if (object != null) {
            object2 = new l6(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.h) != null) {
            object2 = new m6(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }
}

