/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.affise.attribution.modules.subscription;

import android.app.Activity;
import com.affise.attribution.modules.AffiseModuleApi;
import com.affise.attribution.modules.subscription.AffiseProduct;
import com.affise.attribution.modules.subscription.AffiseProductType;
import com.affise.attribution.modules.subscription.AffiseResultCallback;
import java.util.List;

public interface AffiseSubscriptionApi
extends AffiseModuleApi {
    public void fetchProducts(List var1, AffiseResultCallback var2);

    public void purchase(Activity var1, AffiseProduct var2, AffiseProductType var3, AffiseResultCallback var4);

    public void purchase(Activity var1, String var2, String var3, AffiseProductType var4, AffiseResultCallback var5);
}

