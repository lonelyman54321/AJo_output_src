/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.myaccount.order.imps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.e$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class e
extends E51 {
    public static final e$a Companion;
    public static final String m;
    public dj2_0 f;
    public View g;
    public AjioTextView h;
    public AjioTextView i;
    public RelativeLayout j;
    public String k;
    public boolean l;

    static {
        Object object = new Object();
        Companion = object;
        object = e.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "getSimpleName(...)");
        m = object;
    }

    public final void onActivityCreated(Bundle object) {
        int n3;
        Object object2;
        int n4 = 1;
        super.onActivityCreated((Bundle)object);
        boolean bl2 = this.l;
        if (bl2) {
            object = this.i;
            if (object != null) {
                object2 = this.k;
                object.setText((CharSequence)object2);
            }
        } else {
            object = this.i;
            if (object != null) {
                n3 = R$string.imps_success;
                object2 = this.getString(n3);
                object.setText((CharSequence)object2);
            }
        }
        if (bl2 = this.l) {
            object = this.h;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.j) != null) {
                ai0_2.B((View)object);
            }
        } else {
            object = this.f;
            if (object != null) {
                float f5 = object.s1();
                object = Float.valueOf(f5);
            } else {
                bl2 = false;
                float f6 = 0.0f;
                object = null;
            }
            object2 = null;
            n3 = (int)(Intrinsics.areEqual((Float)object, 0.0f) ? 1 : 0);
            if (n3 != 0) {
                object2 = this.h;
                if (object2 != null) {
                    Object object3 = StringCompanionObject.INSTANCE;
                    int n7 = R$string.request_imps_success;
                    object3 = this.getString(n7);
                    Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
                    object = qz2_0.x((Float)object);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object;
                    object = "format(...)";
                    n40_0.a(objectArray, n4, (String)object3, (String)object, (AjioTextView)object2);
                }
            } else {
                object = this.h;
                if (object != null) {
                    n4 = R$string.request_imps_success;
                    String string2 = this.getString(n4);
                    object.setText((CharSequence)string2);
                }
            }
        }
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
        object = this.getArguments();
        if (object != null) {
            String string2;
            object = this.requireArguments();
            boolean bl2 = object.containsKey(string2 = "SUCCESS_MESSAGE");
            if (bl2) {
                object = this.requireArguments().getString(string2);
                this.k = object;
            }
            if (bl2 = (object = this.requireArguments()).containsKey(string2 = "IS_RCS_BANK_ACCOUNT_DETAILS")) {
                object = this.requireArguments();
                this.l = bl2 = object.getBoolean(string2);
            }
        }
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = R$layout.imps_transaction_layout;
        object = object.inflate(n3, viewGroup, false);
        this.g = object;
        int n4 = 0;
        viewGroup = null;
        if (object != null) {
            n3 = R$id.success_transaction_tv;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.h = object;
        object = this.g;
        if (object != null) {
            n3 = R$id.imps_status_message;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.i = object;
        object = this.g;
        if (object != null) {
            n4 = R$id.rcs_bank_details_layout;
            object = object.findViewById(n4);
            viewGroup = object;
            viewGroup = (RelativeLayout)object;
        }
        this.j = viewGroup;
        return this.g;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity");
        object = (ReturnImpsActivity)object;
        object2 = m;
        ((ReturnImpsActivity)object).z2((String)object2);
    }
}

