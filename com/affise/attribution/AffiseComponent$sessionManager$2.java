/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.session.SessionManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$sessionManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$sessionManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final SessionManagerImpl invoke() {
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = AffiseComponent.access$getActivityCountProvider(this.this$0);
        SessionManagerImpl sessionManagerImpl = new SessionManagerImpl(sharedPreferences2, currentActiveActivityCountProvider);
        return sessionManagerImpl;
    }
}

