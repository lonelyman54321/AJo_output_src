/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkh;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzhke
extends zzhkh {
    final Logger zza;

    public zzhke(String object) {
        this.zza = object = Logger.getLogger((String)object);
    }

    public final void zza(String string2) {
        Level level = Level.FINE;
        this.zza.logp(level, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", string2);
    }
}

