/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 */
package com.ril.ajio.web;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.databinding.ActivityTermsAndConditionsBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class CustomWebViewActivity$c
implements Function0 {
    public final /* synthetic */ AppCompatActivity a;

    public CustomWebViewActivity$c(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    public final Object invoke() {
        LayoutInflater layoutInflater = this.a.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        return ActivityTermsAndConditionsBinding.inflate(layoutInflater);
    }
}

