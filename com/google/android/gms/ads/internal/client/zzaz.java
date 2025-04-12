/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

public class zzaz
extends AdListener {
    private final Object zza;
    private AdListener zzb;

    public zzaz() {
        Object object;
        this.zza = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdClicked() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdClicked();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdClosed() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdClosed();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdFailedToLoad(loadAdError);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdImpression() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdImpression();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAdLoaded() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdLoaded();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdOpened() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        AdListener adListener = this.zzb;
                        if (adListener == null) break block3;
                        adListener.onAdOpened();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(AdListener adListener) {
        Object object = this.zza;
        synchronized (object) {
            this.zzb = adListener;
            return;
        }
    }
}

