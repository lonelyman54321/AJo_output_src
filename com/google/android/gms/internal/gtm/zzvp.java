/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzuf;
import com.google.android.gms.internal.gtm.zzui;
import com.google.android.gms.internal.gtm.zzuk;
import com.google.android.gms.internal.gtm.zzul;
import com.google.android.gms.internal.gtm.zzuw;
import com.google.android.gms.internal.gtm.zzuz;
import com.google.android.gms.internal.gtm.zzvd;
import com.google.android.gms.internal.gtm.zzvm;
import com.google.android.gms.internal.gtm.zzvo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public final class zzvp
extends zzvd {
    public static final /* synthetic */ int zza;
    private static final Set zzb;
    private static final zzuw zzc;
    private static final zzvm zzd;

    static {
        zzui zzui2 = zzuf.zza;
        zzui2 = zzuk.zza;
        zzui2 = zzul.zza;
        Object object = new zzui[]{zzui2, zzui2, zzui2};
        object = Arrays.asList(object);
        Object object2 = new HashSet(object);
        object2 = Collections.unmodifiableSet(object2);
        zzb = object2;
        zzc = zzuz.zza(object2).zza();
        zzd = object2 = new zzvm(null);
    }

    public /* synthetic */ zzvp(String string2, String string3, boolean n3, int n4, Level level, Set set, zzuw zzuw2, zzvo zzvo2) {
        super(string3);
        int n7 = string3.length();
        n3 = 23;
        if (n7 > n3) {
            n7 = string3.length();
            n4 = -1;
            n7 += n4;
            while (n7 >= 0) {
                int n8;
                int n10 = string3.charAt(n7);
                if (n10 != (n8 = 46) && n10 != (n8 = 36)) {
                    n7 += -1;
                    continue;
                }
                n4 = n7;
                break;
            }
            string3 = string3.substring(++n4);
        }
        string2 = String.valueOf(string3);
        string2 = "".concat(string2);
        int n14 = Math.min(string2.length(), n3);
        string2.substring(0, n14);
    }

    public static /* bridge */ /* synthetic */ zzuw zzb() {
        return zzc;
    }

    public static zzvm zzc() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ Set zzd() {
        return zzb;
    }
}

