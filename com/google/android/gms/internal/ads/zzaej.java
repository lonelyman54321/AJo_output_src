/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzgd;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzaej {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza;
    public int zzb;

    public zzaej() {
        int n3;
        this.zza = n3 = -1;
        this.zzb = n3;
    }

    private final boolean zzc(String object) {
        block9: {
            Pattern pattern = zzc;
            boolean bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).find();
            if (bl2) {
                String string2;
                bl2 = true;
                try {
                    string2 = ((Matcher)object).group((int)(bl2 ? 1 : 0));
                }
                catch (NumberFormatException numberFormatException) {}
                int n3 = zzgd.zza;
                n3 = 16;
                int n4 = Integer.parseInt(string2, n3);
                int n7 = 2;
                object = ((Matcher)object).group(n7);
                int n8 = Integer.parseInt((String)object, n3);
                if (n4 <= 0 && n8 <= 0) break block9;
                this.zza = n4;
                this.zzb = n8;
                return bl2;
            }
        }
        return false;
    }

    public final boolean zza() {
        int n3 = this.zza;
        int n4 = -1;
        return n3 != n4 && (n3 = this.zzb) != n4;
    }

    public final boolean zzb(zzcd zzcd2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = zzcd2.zza()); ++i3) {
            String string2;
            Object object = zzcd2.zzb(i3);
            boolean bl2 = object instanceof zzahk;
            String string3 = "iTunSMPB";
            boolean bl3 = true;
            if (bl2) {
                object = (zzahk)object;
                string2 = ((zzahk)object).zzb;
                bl2 = string3.equals(string2);
                if (!bl2 || (n3 = (int)(this.zzc((String)(object = ((zzahk)object).zzc)) ? 1 : 0)) == 0) continue;
                return bl3;
            }
            bl2 = object instanceof zzaht;
            if (!bl2) continue;
            object = (zzaht)object;
            String string4 = "com.apple.iTunes";
            string2 = ((zzaht)object).zza;
            bl2 = string4.equals(string2);
            if (!bl2 || !(bl2 = string3.equals(string2 = ((zzaht)object).zzb)) || (n3 = (int)(this.zzc((String)(object = ((zzaht)object).zzc)) ? 1 : 0)) == 0) continue;
            return bl3;
        }
        return false;
    }
}

