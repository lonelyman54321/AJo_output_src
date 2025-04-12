/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.affise.attribution.modules.subscription;

import android.app.Activity;
import com.affise.attribution.Affise$Module;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.subscription.AffiseProduct;
import com.affise.attribution.modules.subscription.AffiseProductType;
import com.affise.attribution.modules.subscription.AffiseResult;
import com.affise.attribution.modules.subscription.AffiseResult$Error;
import com.affise.attribution.modules.subscription.AffiseResultCallback;
import com.affise.attribution.modules.subscription.AffiseSubscriptionApi;
import com.affise.attribution.modules.subscription.AffiseSubscriptionError$NotInitialized;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseSubscription {
    public static final AffiseSubscription INSTANCE;
    private static AffiseSubscriptionApi module;

    static {
        AffiseSubscription affiseSubscription;
        INSTANCE = affiseSubscription = new AffiseSubscription();
    }

    private AffiseSubscription() {
    }

    public static final void fetchProducts(List object, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(object, "productsIds");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        Object object2 = INSTANCE.getApi$attribution_release();
        if (object2 != null) {
            object2.fetchProducts((List)object, affiseResultCallback);
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            object2 = new AffiseSubscriptionError$NotInitialized();
            object = new AffiseResult$Error((Exception)object2);
            affiseResultCallback.handle((AffiseResult)object);
        }
    }

    public static final boolean hasSubscriptionModule() {
        boolean bl2;
        AffiseSubscriptionApi affiseSubscriptionApi = INSTANCE.getApi$attribution_release();
        if (affiseSubscriptionApi != null) {
            bl2 = true;
        } else {
            bl2 = false;
            affiseSubscriptionApi = null;
        }
        return bl2;
    }

    public static final void purchase(Activity object, AffiseProduct object2, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(object2, "product");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscriptionApi affiseSubscriptionApi = INSTANCE.getApi$attribution_release();
        if (affiseSubscriptionApi != null) {
            affiseSubscriptionApi.purchase((Activity)object, (AffiseProduct)object2, affiseProductType, affiseResultCallback);
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            object2 = new AffiseSubscriptionError$NotInitialized();
            object = new AffiseResult$Error((Exception)object2);
            affiseResultCallback.handle((AffiseResult)object);
        }
    }

    public static final void purchase(Activity object, String object2, String string2, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(object2, "productId");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscription affiseSubscription = INSTANCE;
        AffiseSubscriptionApi affiseSubscriptionApi = affiseSubscription.getApi$attribution_release();
        if (affiseSubscriptionApi != null) {
            affiseSubscriptionApi.purchase((Activity)object, (String)object2, string2, affiseProductType, affiseResultCallback);
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            object2 = new AffiseSubscriptionError$NotInitialized();
            object = new AffiseResult$Error((Exception)object2);
            affiseResultCallback.handle((AffiseResult)object);
        }
    }

    public final AffiseSubscriptionApi getApi$attribution_release() {
        Object object = module;
        if (object == null) {
            object = Affise$Module.INSTANCE;
            AffiseModules affiseModules = AffiseModules.Subscription;
            module = object = (AffiseSubscriptionApi)((Affise$Module)object).api$attribution_release(affiseModules);
        }
        return object;
    }
}

