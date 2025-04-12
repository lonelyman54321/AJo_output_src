/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcu;

public final class zzcv
extends zzcu {
    public static boolean zza(Object object, Object object2) {
        boolean bl2 = true;
        if (object != object2) {
            if (object != null) {
                boolean bl3 = object.equals(object2);
                if (!bl3) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }
}

