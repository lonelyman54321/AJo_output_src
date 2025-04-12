/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzdy
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzP.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzs.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbx.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzbq.toString();

    public zzdy() {
        String string2 = zza;
        String[] stringArray = zzb;
        String string3 = zzc;
        stringArray = new String[]{stringArray, string3};
        super(string2, stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public final zzap zza(Map object) {
        Object object2;
        Object object3 = zzb;
        object3 = (zzap)object.get(object3);
        Object object4 = zzc;
        object4 = (zzap)object.get(object4);
        if (object3 != null && object3 != (object2 = zzfp.zza()) && object4 != null && object4 != (object2 = zzfp.zza())) {
            Long l2;
            object2 = zzd;
            int n3 = 1;
            int n4 = ((Boolean)(object2 = zzfp.zzf(zzfp.zzk((zzap)object.get(object2))))).booleanValue();
            if (n3 != n4) {
                int n7 = 64;
            } else {
                int n8 = 66;
            }
            String string2 = zze;
            object = (zzap)object.get(string2);
            if (object == null || (object = zzfp.zzj(zzfp.zzk((zzap)object))) != (l2 = zzfp.zzi()) && (n3 = ((Long)object).intValue()) >= 0) {
                block18: {
                    void var5_8;
                    try {
                        object = zzfp.zzk((zzap)object3);
                    }
                    catch (PatternSyntaxException patternSyntaxException) {}
                    object = zzfp.zzm(object);
                    object3 = zzfp.zzk((zzap)object4);
                    object3 = zzfp.zzm(object3);
                    object3 = Pattern.compile((String)object3, (int)var5_8);
                    object = ((Pattern)object3).matcher((CharSequence)object);
                    boolean bl2 = ((Matcher)object).find();
                    object4 = null;
                    if (!bl2) break block18;
                    int n10 = ((Matcher)object).groupCount();
                    if (n10 < n3) break block18;
                    object4 = ((Matcher)object).group(n3);
                }
                if (object4 == null) {
                    object = zzfp.zza();
                } else {
                    object = zzfp.zzb(object4);
                }
                return object;
            }
            return zzfp.zza();
        }
        return zzfp.zza();
    }

    public final boolean zzb() {
        return true;
    }
}

