/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.affise.attribution.modules.subscription;

import android.app.Activity;
import com.affise.attribution.Affise;
import com.affise.attribution.Affise$Module;
import com.affise.attribution.modules.subscription.AffiseProduct;
import com.affise.attribution.modules.subscription.AffiseProductType;
import com.affise.attribution.modules.subscription.AffiseResultCallback;
import com.affise.attribution.modules.subscription.AffiseSubscription;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseSubscriptionKt {
    public static final void fetchProducts(Affise$Module affise$Module, List list, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise$Module, "<this>");
        Intrinsics.checkNotNullParameter(list, "productsIds");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscription.fetchProducts(list, affiseResultCallback);
    }

    public static final void fetchProducts(Affise affise, List list, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise, "<this>");
        Intrinsics.checkNotNullParameter(list, "productsIds");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscriptionKt.fetchProducts(Affise$Module.INSTANCE, list, affiseResultCallback);
    }

    public static final boolean hasSubscriptionModule(Affise$Module affise$Module) {
        Intrinsics.checkNotNullParameter(affise$Module, "<this>");
        return AffiseSubscription.hasSubscriptionModule();
    }

    public static final boolean hasSubscriptionModule(Affise affise) {
        Intrinsics.checkNotNullParameter(affise, "<this>");
        return AffiseSubscriptionKt.hasSubscriptionModule(Affise$Module.INSTANCE);
    }

    public static final void purchase(Affise$Module affise$Module, Activity activity, AffiseProduct affiseProduct, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise$Module, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(affiseProduct, "product");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscription.purchase(activity, affiseProduct, affiseProductType, affiseResultCallback);
    }

    public static final void purchase(Affise$Module affise$Module, Activity activity, String string2, String string3, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise$Module, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscription.purchase(activity, string2, string3, affiseProductType, affiseResultCallback);
    }

    public static final void purchase(Affise affise, Activity activity, AffiseProduct affiseProduct, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(affiseProduct, "product");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscriptionKt.purchase(Affise$Module.INSTANCE, activity, affiseProduct, affiseProductType, affiseResultCallback);
    }

    public static final void purchase(Affise affise, Activity activity, String string2, String string3, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback) {
        Intrinsics.checkNotNullParameter(affise, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(affiseResultCallback, "callback");
        AffiseSubscriptionKt.purchase(Affise$Module.INSTANCE, activity, string2, string3, affiseProductType, affiseResultCallback);
    }

    public static /* synthetic */ void purchase$default(Affise$Module affise$Module, Activity activity, AffiseProduct affiseProduct, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            affiseProductType = null;
        }
        AffiseSubscriptionKt.purchase(affise$Module, activity, affiseProduct, affiseProductType, affiseResultCallback);
    }

    public static /* synthetic */ void purchase$default(Affise$Module affise$Module, Activity activity, String string2, String string3, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback, int n3, Object object) {
        int n4 = n3 & 4;
        String string4 = n4 != 0 ? null : string3;
        int n7 = n3 & 8;
        AffiseProductType affiseProductType2 = n7 != 0 ? null : affiseProductType;
        AffiseSubscriptionKt.purchase(affise$Module, activity, string2, string4, affiseProductType2, affiseResultCallback);
    }

    public static /* synthetic */ void purchase$default(Affise affise, Activity activity, AffiseProduct affiseProduct, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            affiseProductType = null;
        }
        AffiseSubscriptionKt.purchase(affise, activity, affiseProduct, affiseProductType, affiseResultCallback);
    }

    public static /* synthetic */ void purchase$default(Affise affise, Activity activity, String string2, String string3, AffiseProductType affiseProductType, AffiseResultCallback affiseResultCallback, int n3, Object object) {
        int n4 = n3 & 4;
        String string4 = n4 != 0 ? null : string3;
        int n7 = n3 & 8;
        AffiseProductType affiseProductType2 = n7 != 0 ? null : affiseProductType;
        AffiseSubscriptionKt.purchase(affise, activity, string2, string4, affiseProductType2, affiseResultCallback);
    }
}

