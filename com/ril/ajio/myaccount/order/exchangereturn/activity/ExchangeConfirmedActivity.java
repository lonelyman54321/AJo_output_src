/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.databinding.ActivityExchangeConfirmedBinding;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExchangeConfirmedActivity;
import kotlin.jvm.internal.Intrinsics;

public final class ExchangeConfirmedActivity
extends Hilt_ExchangeConfirmedActivity {
    public static final /* synthetic */ int Z;
    public final rq1_2 Y;

    public ExchangeConfirmedActivity() {
        Object object = et1_2.NONE;
        ExchangeConfirmedActivity$a exchangeConfirmedActivity$a = new ExchangeConfirmedActivity$a(this);
        object = yr1_2.a(object, exchangeConfirmedActivity$a);
        this.Y = object;
    }

    public final void onBackPressed() {
        Intent intent = new Intent();
        this.setResult(-1, intent);
        this.finish();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.y2().getRoot();
        this.setContentView((View)object);
        object = this.y2().collapseToolBar;
        int n3 = R$style.collapsed_toolbar_title;
        object.setCollapsedTitleTextAppearance(n3);
        n3 = R$style.expanded_toolbar_title;
        object.setExpandedTitleTextAppearance(n3);
        n3 = mz3_0.d(16);
        int n4 = object.getExpandedTitleMarginTop();
        int n7 = object.getExpandedTitleMarginEnd();
        int n8 = object.getExpandedTitleMarginBottom();
        object.setExpandedTitleMargin(n3, n4, n7, n8);
        object = this.y2().alfToolbar;
        n3 = R$string.return_exchange_complete;
        Object object2 = this.getString(n3);
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" screen");
        object2 = ((StringBuilder)object3).toString();
        object.setContentDescription((CharSequence)object2);
        object = this.y2().alfToolbar;
        n3 = R$string.return_exchange_complete;
        object2 = this.getString(n3);
        object.setTitle((CharSequence)object2);
        object = this.y2().alfToolbar;
        n3 = R$drawable.ic_cc_close;
        object.setNavigationIcon(n3);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new CC0(this, 0);
        object.postDelayed((Runnable)object2, 300L);
        object = this.y2().alfToolbar;
        object2 = new DC0(this);
        object.setNavigationOnClickListener((View.OnClickListener)object2);
        object = new hc0_2();
        object2 = this.getIntent().getExtras();
        object.setArguments((Bundle)object2);
        object2 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getSupportFragmentManager(...)");
        object2.getClass();
        object3 = new a((FragmentManager)object2);
        Intrinsics.checkNotNullExpressionValue(object3, "beginTransaction(...)");
        n3 = R$id.exchange_confirmed_contentframe;
        ((k)object3).j(n3, (Fragment)object, "ExchangeConfirmedFragment");
        ((a)object3).d();
        object = this.y2().clContinueShopping;
        object2 = new BC0(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    public final ActivityExchangeConfirmedBinding y2() {
        return (ActivityExchangeConfirmedBinding)this.Y.getValue();
    }
}

