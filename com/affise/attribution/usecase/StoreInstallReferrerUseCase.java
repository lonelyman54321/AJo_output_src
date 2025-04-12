/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.affise.attribution.usecase;

import android.app.Application;
import android.content.Context;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.store.StoreApi;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.referrer.OnReferrerCallback;
import com.affise.attribution.referrer.PartnerKeyKt;
import com.affise.attribution.referrer.ReferrerKey;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase$handleReferrer$2;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase$init$1;
import com.affise.attribution.usecase.StoreUseCase;
import com.affise.attribution.utils.ReferrerKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class StoreInstallReferrerUseCase {
    private final Application app;
    private Map callbacks;
    private final GoogleInstallReferrerUseCase googleInstallReferrerUseCase;
    private Function0 onFinished;
    private Function0 onReferrerSetupFinished;
    private StoreApi storeModule;
    private final StoreUseCase storeUseCase;

    public StoreInstallReferrerUseCase(Application object, StoreUseCase storeUseCase2, GoogleInstallReferrerUseCase googleInstallReferrerUseCase2) {
        Intrinsics.checkNotNullParameter(object, "app");
        Intrinsics.checkNotNullParameter(storeUseCase2, "storeUseCase");
        Intrinsics.checkNotNullParameter(googleInstallReferrerUseCase2, "googleInstallReferrerUseCase");
        this.app = object;
        this.storeUseCase = storeUseCase2;
        this.googleInstallReferrerUseCase = googleInstallReferrerUseCase2;
        this.callbacks = object;
    }

    public static final /* synthetic */ Function0 access$getOnFinished$p(StoreInstallReferrerUseCase storeInstallReferrerUseCase2) {
        return storeInstallReferrerUseCase2.onFinished;
    }

    public static final /* synthetic */ Function0 access$getOnReferrerSetupFinished$p(StoreInstallReferrerUseCase storeInstallReferrerUseCase2) {
        return storeInstallReferrerUseCase2.onReferrerSetupFinished;
    }

    public static final /* synthetic */ void access$handleReferrerCallback(StoreInstallReferrerUseCase storeInstallReferrerUseCase2) {
        storeInstallReferrerUseCase2.handleReferrerCallback();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void addCallback(OnReferrerCallback onReferrerCallback, ReferrerKey referrerKey) {
        synchronized (this) {
            if (onReferrerCallback != null) {
                Map map2 = this.callbacks;
                map2.put(onReferrerCallback, referrerKey);
            }
            return;
        }
    }

    public static /* synthetic */ void addCallback$default(StoreInstallReferrerUseCase storeInstallReferrerUseCase2, OnReferrerCallback onReferrerCallback, ReferrerKey referrerKey, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            referrerKey = null;
        }
        storeInstallReferrerUseCase2.addCallback(onReferrerCallback, referrerKey);
    }

    private final String getStoreInstallReferrer() {
        Object object = this.getInstallReferrerData();
        object = object != null ? ((AffiseReferrerData)object).getInstallReferrer() : null;
        return object;
    }

    private final void handleReferrer() {
        Object object = this.getInstallReferrerData();
        if (object != null) {
            this.handleReferrerCallback();
            return;
        }
        this.onReferrerSetupFinished = object = new StoreInstallReferrerUseCase$handleReferrer$2(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void handleReferrerCallback() {
        synchronized (this) {
            Iterator iterator;
            String string2;
            try {
                string2 = this.getReferrer();
                iterator = this.callbacks;
                iterator = iterator.entrySet();
                iterator = iterator.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            boolean bl2;
            while (bl2 = iterator.hasNext()) {
                Object object = iterator.next();
                Object object2 = (object = (Map.Entry)object).getValue();
                if (object2 != null) {
                    if (string2 != null) {
                        object2 = object.getValue();
                        object2 = (ReferrerKey)((Object)object2);
                        object2 = ReferrerKt.getReferrerValue(string2, object2);
                    } else {
                        object2 = null;
                    }
                } else {
                    object2 = string2;
                }
                object = object.getKey();
                object = (OnReferrerCallback)object;
                object.handleReferrer((String)object2);
                iterator.remove();
            }
            return;
        }
    }

    private final void startInstallReferrerRetrieve(Function0 function0) {
        StoreApi storeApi = this.storeModule;
        if (storeApi != null) {
            storeApi.startInstallReferrerRetrieve(function0);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    public final AffiseReferrerData getInstallReferrerData() {
        Object object = this.storeModule;
        object = object != null ? object.getInstallReferrerData() : null;
        return object;
    }

    public final String getReferrer() {
        int n3;
        String string2 = PartnerKeyKt.getPartnerKey((Context)this.app);
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = this.getStoreInstallReferrer();
        }
        return string2;
    }

    public final void getReferrer(OnReferrerCallback onReferrerCallback) {
        StoreInstallReferrerUseCase.addCallback$default(this, onReferrerCallback, null, 2, null);
        this.handleReferrer();
    }

    public final void getReferrerValue(ReferrerKey referrerKey, OnReferrerCallback onReferrerCallback) {
        Intrinsics.checkNotNullParameter((Object)referrerKey, "key");
        this.addCallback(onReferrerCallback, referrerKey);
        this.handleReferrer();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void init(AffiseModuleManager var1_1) {
        block4: {
            block2: {
                block3: {
                    Intrinsics.checkNotNullParameter(var1_1, "moduleManager");
                    var2_2 /* !! */  = this.storeUseCase.getStore();
                    var3_3 = var2_2 /* !! */ .hashCode();
                    var4_4 = -1365313007;
                    if (var3_3 == var4_4) break block2;
                    var4_4 = -1104280514;
                    if (var3_3 == var4_4) break block3;
                    var5_5 = 458192173;
                    if (var3_3 != var5_5 || (var5_5 = (int)var2_2 /* !! */ .equals(var1_1 = "GooglePlay")) == 0) ** GOTO lbl-1000
                    var1_1 = this.googleInstallReferrerUseCase;
                    break block4;
                }
                var6_6 = "RuStore";
                var7_8 = var2_2 /* !! */ .equals(var6_6);
                if (!var7_8) ** GOTO lbl-1000
                var2_2 /* !! */  = AffiseModules.RuStore;
                var1_1 = (StoreApi)var1_1.api((AffiseModules)var2_2 /* !! */ );
                break block4;
            }
            var6_7 = "AppGallery";
            var7_9 = var2_2 /* !! */ .equals(var6_7);
            if (var7_9) {
                var2_2 /* !! */  = AffiseModules.Huawei;
                var1_1 = (StoreApi)var1_1.api((AffiseModules)var2_2 /* !! */ );
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = this.googleInstallReferrerUseCase;
            }
        }
        this.storeModule = var1_1;
        var1_1 = new StoreInstallReferrerUseCase$init$1(this);
        this.startInstallReferrerRetrieve((Function0)var1_1);
    }

    public final StoreInstallReferrerUseCase onReferrerSetupFinished(Function0 function0) {
        this.onFinished = function0;
        return this;
    }
}

