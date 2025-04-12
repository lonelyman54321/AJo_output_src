/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzfig {
    private final Pattern zza;

    public zzfig() {
        Object object = zzbep.zzhc;
        zzben zzben2 = zzba.zzc();
        object = zzben2.zza((zzbeg)object);
        object = (String)object;
        try {
            object = Pattern.compile((String)object);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            object = null;
        }
        this.zza = object;
    }

    public final String zza(String object) {
        boolean bl2;
        Pattern pattern = this.zza;
        if (pattern != null && object != null && (bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).find())) {
            return ((Matcher)object).group();
        }
        return null;
    }
}

