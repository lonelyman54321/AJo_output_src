/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.databinding.ActivityExchangeConfirmedBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class ExchangeConfirmedActivity$a
implements Function0 {
    public final /* synthetic */ AppCompatActivity a;

    public ExchangeConfirmedActivity$a(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    public final Object invoke() {
        LayoutInflater layoutInflater = this.a.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        return ActivityExchangeConfirmedBinding.inflate(layoutInflater);
    }
}

