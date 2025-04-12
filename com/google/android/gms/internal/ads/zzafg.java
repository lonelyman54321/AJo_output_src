/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzagw;
import com.google.android.gms.internal.ads.zzaio;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class zzafg {
    public static int zza(int n3) {
        int n4 = 0;
        while (n3 > 0) {
            n3 >>>= 1;
            ++n4;
        }
        return n4;
    }

    public static zzcd zzb(List object) {
        int n3;
        int n4 = 1;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = object.size()); i3 += n4) {
            Object object2 = (String)object.get(i3);
            int n7 = 2;
            Object object3 = ((String)object2).split("=", n7);
            int n8 = ((String[])object3).length;
            String string2 = "VorbisUtil";
            if (n8 != n7) {
                object3 = "Failed to parse Vorbis comment: ";
                object2 = ((String)object3).concat((String)object2);
                zzfk.zzf(string2, (String)object2);
                continue;
            }
            object2 = object3[0];
            Object object4 = "METADATA_BLOCK_PICTURE";
            n3 = (int)(((String)object2).equals(object4) ? 1 : 0);
            if (n3 != 0) {
                object2 = object3[n4];
                object2 = Base64.decode((String)object2, (int)0);
                object3 = new zzfu((byte[])object2);
                object2 = zzagw.zzb((zzfu)object3);
                try {
                    arrayList.add(object2);
                }
                catch (RuntimeException runtimeException) {
                    object3 = "Failed to parse vorbis picture";
                    zzfk.zzg(string2, (String)object3, runtimeException);
                }
                continue;
            }
            object4 = object3[0];
            object3 = object3[n4];
            object2 = new zzaio((String)object4, (String)object3);
            arrayList.add(object2);
        }
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            return null;
        }
        object = new zzcd(arrayList);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static zzafd zzc(zzfu object, boolean bl2, boolean bl3) {
        int n3;
        void var2_4;
        long l2;
        long l3;
        long l4;
        int n4 = 0;
        if (bl2) {
            int n7 = 3;
            zzafg.zzd(n7, (zzfu)object, false);
        }
        long l7 = ((zzfu)object).zzs();
        int n8 = (int)l7;
        Charset charset = zzfxs.zzc;
        String string2 = ((zzfu)object).zzA(n8, charset);
        int n10 = string2.length();
        long l8 = ((zzfu)object).zzs();
        int n14 = (int)l8;
        String[] stringArray = new String[n14];
        n10 += 15;
        while ((l4 = (l3 = (l2 = (long)n4) - l8) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l2 = ((zzfu)object).zzs();
            int n15 = (int)l2;
            n10 += 4;
            Object object2 = zzfxs.zzc;
            stringArray[n4] = object2 = ((zzfu)object).zzA(n15, (Charset)object2);
            int n16 = ((String)object2).length();
            n10 += n16;
            ++n4;
        }
        if (var2_4 != false && (n3 = ((zzfu)object).zzm() & 1) == 0) {
            throw zzch.zza("framing bit expected to be set", null);
        }
        object = new zzafd(string2, stringArray, ++n10);
        return object;
    }

    public static boolean zzd(int n3, zzfu object, boolean bl2) {
        int n4;
        int n7;
        int n8 = ((zzfu)object).zzb();
        if (n8 < (n7 = 7)) {
            if (bl2) {
                return false;
            }
            n3 = ((zzfu)object).zzb();
            object = new StringBuilder("too short header: ");
            ((StringBuilder)object).append(n3);
            throw zzch.zza(((StringBuilder)object).toString(), null);
        }
        n8 = ((zzfu)object).zzm();
        if (n8 != n3) {
            if (bl2) {
                return false;
            }
            String string2 = String.valueOf(Integer.toHexString(n3));
            throw zzch.zza("expected header type ".concat(string2), null);
        }
        n3 = ((zzfu)object).zzm();
        if (n3 == (n8 = 118) && (n3 = ((zzfu)object).zzm()) == (n8 = 111) && (n3 = ((zzfu)object).zzm()) == (n8 = 114) && (n3 = ((zzfu)object).zzm()) == (n8 = 98) && (n3 = ((zzfu)object).zzm()) == (n8 = 105) && (n3 = ((zzfu)object).zzm()) == (n4 = 115)) {
            return true;
        }
        if (bl2) {
            return false;
        }
        throw zzch.zza("expected characters 'vorbis'", null);
    }
}

