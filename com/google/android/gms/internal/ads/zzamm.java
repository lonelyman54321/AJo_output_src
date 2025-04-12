/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfxm;

final class zzamm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzamm(int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17, int n18, int n19) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = n10;
        this.zzf = n14;
        this.zzg = n15;
        this.zzh = n16;
        this.zzi = n17;
        this.zzj = n18;
        this.zzk = n19;
    }

    public static zzamm zza(String stringArray) {
        Object object;
        int n3;
        Object object2;
        int n4;
        int n7 = 7;
        String[] stringArray2 = stringArray;
        stringArray2 = TextUtils.split((String)stringArray.substring(n7), (String)",");
        int n8 = -1;
        int n10 = -1;
        int n14 = -1;
        int n15 = -1;
        int n16 = -1;
        int n17 = -1;
        int n18 = -1;
        int n19 = -1;
        int n20 = -1;
        int n21 = -1;
        int n22 = -1;
        for (int i3 = 0; i3 < (n4 = stringArray2.length); ++i3) {
            block26: {
                object2 = zzfxm.zza(stringArray2[i3].trim());
                n3 = ((String)object2).hashCode();
                switch (n3) {
                    default: {
                        break;
                    }
                    case 1988365454: {
                        object = "outlinecolour";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 3;
                        break block26;
                    }
                    case 1767875043: {
                        object = "alignment";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 1;
                        break block26;
                    }
                    case 767321349: {
                        object = "borderstyle";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 9;
                        break block26;
                    }
                    case 366554320: {
                        object = "fontsize";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 4;
                        break block26;
                    }
                    case 3373707: {
                        object = "name";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 0;
                        object = null;
                        break block26;
                    }
                    case 3029637: {
                        object = "bold";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 5;
                        break block26;
                    }
                    case -70925746: {
                        object = "primarycolour";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 2;
                        break block26;
                    }
                    case -192095652: {
                        object = "strikeout";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 8;
                        break block26;
                    }
                    case -1026963764: {
                        object = "underline";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 7;
                        break block26;
                    }
                    case -1178781136: {
                        object = "italic";
                        n7 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 6;
                        break block26;
                    }
                }
                n7 = -1;
            }
            switch (n7) {
                default: {
                    break;
                }
                case 9: {
                    n22 = i3;
                    break;
                }
                case 8: {
                    n21 = i3;
                    break;
                }
                case 7: {
                    n20 = i3;
                    break;
                }
                case 6: {
                    n19 = i3;
                    break;
                }
                case 5: {
                    n18 = i3;
                    break;
                }
                case 4: {
                    n17 = i3;
                    break;
                }
                case 3: {
                    n16 = i3;
                    break;
                }
                case 2: {
                    n15 = i3;
                    break;
                }
                case 1: {
                    n14 = i3;
                    break;
                }
                case 0: {
                    n10 = i3;
                }
            }
            n7 = 7;
        }
        if (n10 != n8) {
            object2 = object;
            n3 = n4;
            object = new zzamm(n10, n14, n15, n16, n17, n18, n19, n20, n21, n22, n4);
            return object;
        }
        return null;
    }
}

