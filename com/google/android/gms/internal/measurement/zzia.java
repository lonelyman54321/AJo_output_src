/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzia
extends zzhx {
    public zzia(zzif zzif2, String string2, Boolean bl2, boolean bl3) {
        super(zzif2, string2, bl2, true, null);
    }

    public final /* synthetic */ Object zza(Object object) {
        boolean bl2 = object instanceof Boolean;
        if (bl2) {
            return (Boolean)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            Object object2 = object;
            object2 = (String)object;
            Object object3 = zzgw.zzc.matcher((CharSequence)object2);
            boolean bl3 = ((Matcher)object3).matches();
            if (bl3) {
                return Boolean.TRUE;
            }
            object3 = zzgw.zzd;
            bl2 = ((Matcher)(object2 = ((Pattern)object3).matcher((CharSequence)object2))).matches();
            if (bl2) {
                return Boolean.FALSE;
            }
        }
        this.zzb();
        String.valueOf(object);
        return null;
    }
}

