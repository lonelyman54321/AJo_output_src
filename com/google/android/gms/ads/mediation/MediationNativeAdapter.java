/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

public interface MediationNativeAdapter
extends MediationAdapter {
    public void requestNativeAd(Context var1, MediationNativeListener var2, Bundle var3, NativeMediationAdRequest var4, Bundle var5);
}

