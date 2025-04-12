/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$sharedPreferences$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$sharedPreferences$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final SharedPreferences invoke() {
        return AffiseComponent.access$getApp$p(this.this$0).getSharedPreferences("com.affise.attribution", 0);
    }
}

