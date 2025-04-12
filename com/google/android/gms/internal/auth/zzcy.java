/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.auth;

import android.util.Base64;
import com.google.android.gms.internal.auth.zzcz;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzhr;
import com.google.android.gms.internal.auth.zzhu;
import java.io.IOException;

final class zzcy
extends zzdc {
    final /* synthetic */ zzhu zza;

    public zzcy(zzcz zzcz2, String string2, Object object, boolean bl2, zzhu zzhu2, byte[] byArray) {
        this.zza = zzhu2;
        super(zzcz2, "getTokenRefactor__blocked_packages", object, true, null);
    }

    public final Object zza(Object object) {
        Object object2 = object;
        object2 = (String)object;
        int n3 = 3;
        object2 = Base64.decode((String)object2, (int)n3);
        try {
            return zzhr.zzk((byte[])object2);
        }
        catch (IOException | IllegalArgumentException exception) {
            this.zzc();
            object = (String)object;
            return null;
        }
    }
}

