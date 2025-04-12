/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhr;

public final class zzhm
implements zzhr {
    private final a53 zza;

    public zzhm(a53 a532) {
        this.zza = a532;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String zza(Uri object, String string2, String string3, String string4) {
        if (object != null) {
            string2 = object.toString();
        } else if (string2 == null) return null;
        object = this.zza;
        if (object == null) {
            return null;
        }
        object = (a53)((a53)object).get(string2);
        if (object == null) {
            return null;
        }
        if (string3 == null) return (String)((a53)object).get(string4);
        string4 = Ft2.a(string3, string4);
        return (String)((a53)object).get(string4);
    }
}

