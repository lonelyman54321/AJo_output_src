/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.databinding.NewActivityReturnExchangeItemsListBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class NewExchangeReturnSelectionListActivity$a
implements Function0 {
    public final /* synthetic */ AppCompatActivity a;

    public NewExchangeReturnSelectionListActivity$a(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    public final Object invoke() {
        LayoutInflater layoutInflater = this.a.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        return NewActivityReturnExchangeItemsListBinding.inflate(layoutInflater);
    }
}

