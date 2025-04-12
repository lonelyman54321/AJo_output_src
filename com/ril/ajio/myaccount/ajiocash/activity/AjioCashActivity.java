/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
package com.ril.ajio.myaccount.ajiocash.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.ActivityAjioCashNewBinding;
import com.ril.ajio.myaccount.ajiocash.activity.AjioCashActivity$a;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioCashActivity
extends BaseSplitActivity
implements j3_0 {
    public final rq1_2 X;

    public AjioCashActivity() {
        Object object = et1_2.NONE;
        AjioCashActivity$a ajioCashActivity$a = new AjioCashActivity$a(this);
        object = yr1_2.a(object, ajioCashActivity$a);
        this.X = object;
    }

    public final void N() {
    }

    public final void Q1(Fragment object, Fragment fragment, boolean bl2, String string2, Boolean object2) {
        if (fragment != null) {
            object = this.getSupportFragmentManager();
            object.getClass();
            object2 = new a((FragmentManager)object);
            object = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            int n3 = R$id.fragmentContainer;
            ((k)object2).j(n3, fragment, string2);
            if (bl2) {
                ((k)object2).c(string2);
            }
            ((a)object2).d();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = ((ActivityAjioCashNewBinding)this.X.getValue()).getRoot();
        this.setContentView((View)bundle);
        q5_0.Companion.getClass();
        q5_0 q5_02 = new q5_0();
        Boolean bl2 = Boolean.FALSE;
        this.Q1(null, q5_02, false, "AjioCashFragmentRefresh", bl2);
    }

    public final void onFragmentInteraction(String string2, int n3, Bundle bundle) {
    }

    public final void showToastNotification(Context context, String string2, int n3, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "message");
        this.showNotification(context, string2, n3, string3);
    }

    public final void startLoader() {
        ((ActivityAjioCashNewBinding)this.X.getValue()).ajioLoaderView.startLoader();
    }

    public final void stopLoader() {
        ((ActivityAjioCashNewBinding)this.X.getValue()).ajioLoaderView.stopLoader();
    }

    public final void t0(String string2, String string3) {
        super.showNotification(string2, string3);
    }

    public final void v1() {
    }

    public final Fragment y() {
        return null;
    }
}

