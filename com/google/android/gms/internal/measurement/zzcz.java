/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import java.net.URL;
import java.net.URLConnection;

final class zzcz
extends zzda {
    private zzcz() {
    }

    public /* synthetic */ zzcz(zzdc zzdc2) {
        this();
    }

    public final URLConnection zza(URL uRL, String string2) {
        return uRL.openConnection();
    }
}

