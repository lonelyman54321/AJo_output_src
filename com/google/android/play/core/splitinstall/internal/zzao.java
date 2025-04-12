/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.Build;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzau;
import com.google.android.play.core.splitinstall.internal.zzay;
import com.google.android.play.core.splitinstall.internal.zzaz;
import com.google.android.play.core.splitinstall.internal.zzba;
import com.google.android.play.core.splitinstall.internal.zzbd;
import com.google.android.play.core.splitinstall.internal.zzbe;
import com.google.android.play.core.splitinstall.internal.zzbg;

public final class zzao {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzan zza() {
        int n3 = Build.VERSION.SDK_INT;
        switch (n3) {
            default: {
                return new zzbg();
            }
            case 27: {
                n3 = mk3_2.a();
                if (n3 != 0) return new zzbg();
                return new zzbe();
            }
            case 26: {
                return new zzbd();
            }
            case 25: {
                return new zzba();
            }
            case 24: {
                return new zzaz();
            }
            case 23: {
                return new zzay();
            }
            case 22: {
                return new zzau();
            }
            case 21: 
        }
        return new zzat();
    }
}

