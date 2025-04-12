/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;

public final class zzam
extends Enum
implements zzach {
    public static final /* enum */ zzam zza;
    public static final /* enum */ zzam zzb;
    public static final /* enum */ zzam zzc;
    public static final /* enum */ zzam zzd;
    public static final /* enum */ zzam zze;
    public static final /* enum */ zzam zzf;
    public static final /* enum */ zzam zzg;
    public static final /* enum */ zzam zzh;
    public static final /* enum */ zzam zzi;
    public static final /* enum */ zzam zzj;
    public static final /* enum */ zzam zzk;
    public static final /* enum */ zzam zzl;
    public static final /* enum */ zzam zzm;
    public static final /* enum */ zzam zzn;
    public static final /* enum */ zzam zzo;
    public static final /* enum */ zzam zzp;
    public static final /* enum */ zzam zzq;
    private static final /* synthetic */ zzam[] zzr;
    private final int zzs;

    static {
        zzam zzam2;
        zzam zzam3;
        zzam zzam4;
        zzam zzam5;
        zzam zzam6;
        zzam zzam7;
        zzam zzam8;
        zzam zzam9;
        zzam zzam10;
        zzam zzam11;
        zzam zzam12;
        zzam zzam13;
        zzam zzam14;
        zzam zzam15;
        zzam zzam16;
        int n3 = 1;
        zza = zzam16 = new zzam("ESCAPE_HTML", 0, n3);
        int n4 = 2;
        zzb = zzam15 = new zzam("ESCAPE_HTML_RCDATA", n3, n4);
        int n7 = 3;
        zzc = zzam14 = new zzam("ESCAPE_HTML_ATTRIBUTE", n4, n7);
        int n8 = 4;
        zzd = zzam13 = new zzam("ESCAPE_HTML_ATTRIBUTE_NOSPACE", n7, n8);
        int n10 = 5;
        zze = zzam12 = new zzam("FILTER_HTML_ELEMENT_NAME", n8, n10);
        int n14 = 6;
        zzf = zzam11 = new zzam("FILTER_HTML_ATTRIBUTES", n10, n14);
        int n15 = 7;
        zzg = zzam10 = new zzam("ESCAPE_JS_STRING", n14, n15);
        n10 = 8;
        zzh = zzam9 = new zzam("ESCAPE_JS_VALUE", n15, n10);
        n8 = 9;
        zzi = zzam8 = new zzam("ESCAPE_JS_REGEX", n10, n8);
        n7 = 10;
        zzj = zzam7 = new zzam("ESCAPE_CSS_STRING", n8, n7);
        n4 = 11;
        zzk = zzam6 = new zzam("FILTER_CSS_VALUE", n7, n4);
        n3 = 12;
        zzl = zzam5 = new zzam("ESCAPE_URI", n4, n3);
        int n16 = 13;
        zzm = zzam4 = new zzam("NORMALIZE_URI", n3, n16);
        zzam zzam17 = zzam4;
        n7 = 14;
        zzam[] zzamArray = new zzam("FILTER_NORMALIZE_URI", n16, n7);
        zzn = zzamArray;
        zzam[] zzamArray2 = zzamArray;
        n4 = 15;
        zzo = zzam3 = new zzam("NO_AUTOESCAPE", n7, n4);
        zzp = zzam2 = new zzam("TEXT", n4, 17);
        n3 = 16;
        zzq = zzam4 = new zzam("CONVERT_JS_VALUE_TO_EXPRESSION", n3, n3);
        zzamArray = new zzam[17];
        zzamArray[0] = zzam16;
        zzamArray[1] = zzam15;
        zzamArray[2] = zzam14;
        zzamArray[3] = zzam13;
        zzamArray[4] = zzam12;
        zzamArray[5] = zzam11;
        zzamArray[6] = zzam10;
        zzamArray[7] = zzam9;
        zzamArray[8] = zzam8;
        zzamArray[9] = zzam7;
        zzamArray[10] = zzam6;
        zzamArray[11] = zzam5;
        zzamArray[12] = zzam17;
        zzamArray[13] = zzamArray2;
        zzamArray[14] = zzam3;
        zzamArray[15] = zzam2;
        zzamArray[n3] = zzam4;
        zzr = zzamArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzam() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzs = var3_2;
    }

    public static zzam[] values() {
        return (zzam[])zzr.clone();
    }

    public static zzam zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 17: {
                return zzp;
            }
            case 16: {
                return zzq;
            }
            case 15: {
                return zzo;
            }
            case 14: {
                return zzn;
            }
            case 13: {
                return zzm;
            }
            case 12: {
                return zzl;
            }
            case 11: {
                return zzk;
            }
            case 10: {
                return zzj;
            }
            case 9: {
                return zzi;
            }
            case 8: {
                return zzh;
            }
            case 7: {
                return zzg;
            }
            case 6: {
                return zzf;
            }
            case 5: {
                return zze;
            }
            case 4: {
                return zzd;
            }
            case 3: {
                return zzc;
            }
            case 2: {
                return zzb;
            }
            case 1: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzs);
    }

    public final int zza() {
        return this.zzs;
    }
}

