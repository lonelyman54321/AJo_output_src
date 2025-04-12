/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.net.Uri;
import java.util.Map;

public final class zzbe {
    private final Map zza;

    public zzbe(Map map2) {
        this.zza = map2;
    }

    public final String zza(Uri object, String string2, String string3, String string4) {
        block7: {
            block6: {
                block5: {
                    if (object == null) break block5;
                    string2 = object.toString();
                    break block6;
                }
                if (string2 == null) break block7;
            }
            object = (Map)this.zza.get(string2);
            if (object == null) {
                return null;
            }
            if (string3 != null) {
                string2 = String.valueOf(string4);
                int n3 = string2.length();
                string4 = n3 != 0 ? string3.concat(string2) : new String(string3);
            }
            return (String)object.get(string4);
        }
        return null;
    }
}

