/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.net.Uri;

public final class zzci {
    private final a53 zza;

    public zzci(a53 a532) {
        this.zza = a532;
    }

    public final String zza(Uri object, String string2, String object2, String string3) {
        string2 = null;
        if (object != null) {
            object = object.toString();
            object2 = this.zza;
            if ((object = (a53)((a53)object2).get(object)) == null) {
                return null;
            }
            string2 = String.valueOf(string3);
            string2 = "".concat(string2);
            return (String)((a53)object).get(string2);
        }
        return null;
    }
}

