/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfxm {
    public static String zza(String object) {
        int n3 = ((String)object).length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = zzfxm.zze(((String)object).charAt(i3));
            if (!object2) continue;
            object = ((String)object).toCharArray();
            while (i3 < n3) {
                object2 = object[i3];
                boolean bl2 = zzfxm.zze((char)object2);
                if (bl2) {
                    object2 = (char)(object2 ^ 0x20);
                    object[i3] = object2;
                }
                ++i3;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static String zzb(String object) {
        int n3 = ((String)object).length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = zzfxm.zzd(((String)object).charAt(i3));
            if (!object2) continue;
            object = ((String)object).toCharArray();
            while (i3 < n3) {
                object2 = object[i3];
                boolean bl2 = zzfxm.zzd((char)object2);
                if (bl2) {
                    object2 = (char)(object2 ^ 0x20);
                    object[i3] = object2;
                }
                ++i3;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int n3 = charSequence.length();
        boolean bl2 = true;
        if (charSequence == charSequence2) {
            return bl2;
        }
        int n4 = charSequence2.length();
        if (n3 == n4) {
            for (n4 = 0; n4 < n3; ++n4) {
                int n7;
                int n8;
                int n10 = charSequence.charAt(n4);
                if (n10 == (n8 = charSequence2.charAt(n4)) || (n10 = zzfxm.zzf((char)n10)) < (n7 = 26) && n10 == (n8 = zzfxm.zzf((char)n8))) {
                    continue;
                }
                return false;
            }
            return bl2;
        }
        return false;
    }

    public static boolean zzd(char n3) {
        int n4 = 97;
        return n3 >= n4 && n3 <= (n4 = 122);
    }

    public static boolean zze(char n3) {
        int n4 = 65;
        return n3 >= n4 && n3 <= (n4 = 90);
    }

    private static int zzf(char c2) {
        return (char)((c2 | 0x20) + -97);
    }
}

