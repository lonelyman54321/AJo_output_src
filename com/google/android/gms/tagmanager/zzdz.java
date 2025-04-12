/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzff;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzdz
extends zzff {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzaj.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzbx.toString();

    public zzdz() {
        String string2 = zza;
        super(string2);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean zzc(String object, String object2, Map object3) {
        boolean bl2 = true;
        String string2 = zzb;
        boolean n4 = (Boolean)(object3 = zzfp.zzf(zzfp.zzk((zzap)object3.get(string2))));
        if (bl2 != n4) {
            int n3 = 64;
        } else {
            int n7 = 66;
        }
        try {
            void var5_8;
            object2 = Pattern.compile((String)object2, (int)var5_8);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return false;
        }
        object = ((Pattern)object2).matcher((CharSequence)object);
        return ((Matcher)object).find();
    }
}

