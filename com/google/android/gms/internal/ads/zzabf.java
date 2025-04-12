/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztp;

public final class zzabf
extends zzto {
    public zzabf(Throwable throwable, zztp zztp2, Surface surface) {
        super(throwable, zztp2);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}

