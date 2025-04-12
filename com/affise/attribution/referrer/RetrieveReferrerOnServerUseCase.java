/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.referrer;

import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.referrer.OnReferrerCallback;
import com.affise.attribution.referrer.ReferrerCallback;
import com.affise.attribution.referrer.ReferrerKey;
import com.affise.attribution.utils.ReferrerKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class RetrieveReferrerOnServerUseCase {
    private final AffiseModuleManager moduleManager;
    private ReferrerCallback referrerCallback;

    public RetrieveReferrerOnServerUseCase(AffiseModuleManager affiseModuleManager) {
        Intrinsics.checkNotNullParameter(affiseModuleManager, "moduleManager");
        this.moduleManager = affiseModuleManager;
    }

    public static /* synthetic */ void a(OnReferrerCallback onReferrerCallback, String string2) {
        RetrieveReferrerOnServerUseCase.getReferrerOnServer$lambda$0(onReferrerCallback, string2);
    }

    public static /* synthetic */ void b(OnReferrerCallback onReferrerCallback, ReferrerKey referrerKey, String string2) {
        RetrieveReferrerOnServerUseCase.getReferrerOnServerValue$lambda$1(onReferrerCallback, referrerKey, string2);
    }

    private final ReferrerCallback getReferrerModule() {
        Object object = this.referrerCallback;
        if (object != null) {
            return object;
        }
        object = this.moduleManager;
        AffiseModules affiseModules = AffiseModules.Status;
        boolean bl2 = (object = ((AffiseModuleManager)object).getModule(affiseModules)) instanceof ReferrerCallback;
        object = bl2 ? (ReferrerCallback)object : null;
        this.referrerCallback = object;
        return object;
    }

    private static final void getReferrerOnServer$lambda$0(OnReferrerCallback onReferrerCallback, String string2) {
        if (onReferrerCallback != null) {
            onReferrerCallback.handleReferrer(string2);
        }
    }

    private static final void getReferrerOnServerValue$lambda$1(OnReferrerCallback onReferrerCallback, ReferrerKey object, String string2) {
        String string3 = "$key";
        Intrinsics.checkNotNullParameter(object, string3);
        if (onReferrerCallback != null) {
            object = string2 != null ? ReferrerKt.getReferrerValue(string2, object) : null;
            onReferrerCallback.handleReferrer((String)object);
        }
    }

    private final void handleReferrerOnServer(OnReferrerCallback onReferrerCallback) {
        Object object = this.getReferrerModule();
        if (object != null) {
            object.getReferrer(onReferrerCallback);
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            onReferrerCallback.handleReferrer(null);
        }
    }

    public final void getReferrerOnServer(OnReferrerCallback onReferrerCallback) {
        cm2_0 cm2_02 = new cm2_0(onReferrerCallback);
        this.handleReferrerOnServer(cm2_02);
    }

    public final void getReferrerOnServerValue(ReferrerKey referrerKey, OnReferrerCallback onReferrerCallback) {
        Intrinsics.checkNotNullParameter((Object)referrerKey, "key");
        bm2_0 bm2_02 = new bm2_0(onReferrerCallback, referrerKey);
        this.handleReferrerOnServer(bm2_02);
    }
}

