/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfnc;
import java.util.Map;

public final class zzp {
    public static zzfnc zza(Bundle object) {
        int n3;
        block24: {
            int n4;
            Object object2 = object.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            if (object2 != null) {
                object = object2;
            }
            if ((n4 = TextUtils.isEmpty((CharSequence)(object = object.getString((String)(object2 = "query_info_type"))))) != 0) {
                return zzfnc.zzb;
            }
            n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1743582870: {
                    object2 = "requester_type_8";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block24;
                }
                case 1743582869: {
                    object2 = "requester_type_7";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block24;
                }
                case 1743582868: {
                    object2 = "requester_type_6";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block24;
                }
                case 1743582867: {
                    object2 = "requester_type_5";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block24;
                }
                case 1743582866: {
                    object2 = "requester_type_4";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block24;
                }
                case 1743582865: {
                    object2 = "requester_type_3";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block24;
                }
                case 1743582864: {
                    object2 = "requester_type_2";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block24;
                }
                case 1743582863: {
                    object2 = "requester_type_1";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block24;
                }
                case 1743582862: {
                    object2 = "requester_type_0";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    object = null;
                    break block24;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return zzfnc.zzb;
            }
            case 8: {
                return zzfnc.zzj;
            }
            case 7: {
                return zzfnc.zzi;
            }
            case 6: {
                return zzfnc.zzh;
            }
            case 5: {
                return zzfnc.zzg;
            }
            case 4: {
                return zzfnc.zzf;
            }
            case 3: {
                return zzfnc.zze;
            }
            case 2: {
                return zzfnc.zzd;
            }
            case 1: {
                return zzfnc.zzc;
            }
            case 0: 
        }
        return zzfnc.zza;
    }

    public static String zzb(String string2) {
        int n3;
        block23: {
            n3 = TextUtils.isEmpty((CharSequence)string2);
            if (n3 != 0) {
                return "unspecified";
            }
            n3 = string2.hashCode();
            switch (n3) {
                default: {
                    break;
                }
                case 1743582870: {
                    String string3 = "requester_type_8";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block23;
                }
                case 1743582869: {
                    String string4 = "requester_type_7";
                    n3 = (int)(string2.equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block23;
                }
                case 1743582868: {
                    String string5 = "requester_type_6";
                    n3 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block23;
                }
                case 1743582867: {
                    String string6 = "requester_type_5";
                    n3 = (int)(string2.equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block23;
                }
                case 1743582866: {
                    String string7 = "requester_type_4";
                    n3 = (int)(string2.equals(string7) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block23;
                }
                case 1743582865: {
                    String string8 = "requester_type_3";
                    n3 = (int)(string2.equals(string8) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block23;
                }
                case 1743582864: {
                    String string9 = "requester_type_2";
                    n3 = (int)(string2.equals(string9) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block23;
                }
                case 1743582863: {
                    String string10 = "requester_type_1";
                    n3 = (int)(string2.equals(string10) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block23;
                }
                case 1743582862: {
                    String string11 = "requester_type_0";
                    n3 = (int)(string2.equals(string11) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    string11 = null;
                    break block23;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return string2;
            }
            case 8: {
                return "8";
            }
            case 7: {
                return "7";
            }
            case 6: {
                return "6";
            }
            case 5: {
                return "5";
            }
            case 4: {
                return "4";
            }
            case 3: {
                return "3";
            }
            case 2: {
                return "2";
            }
            case 1: {
                return "1";
            }
            case 0: 
        }
        return "0";
    }

    public static String zzc(zzl zzl2) {
        if (zzl2 != null && (zzl2 = zzl2.zzc) != null) {
            return zzl2.getString("query_info_type");
        }
        return "unspecified";
    }

    public static void zzd(zzdvh zzdvh2, zzdux object, String string2, Pair ... pairArray) {
        object = zzbep.zzhj;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        object = zzcci.zza;
        object2 = new zzo(zzdvh2, null, string2, pairArray);
        object.execute((Runnable)object2);
    }

    public static void zze(zzdvh zzdvh2, zzdux object, String string2, Pair ... pairArray) {
        int n3;
        object = zzdvh2.zzc();
        String string3 = "action";
        zzp.zzg((Map)object, string3, string2);
        string2 = null;
        for (int i3 = 0; i3 < (n3 = pairArray.length); ++i3) {
            string3 = pairArray[i3];
            String string4 = (String)((Pair)string3).first;
            string3 = (String)((Pair)string3).second;
            zzp.zzg((Map)object, string4, string3);
        }
        zzdvh2.zzf((Map)object);
    }

    public static int zzf(zzfho object) {
        String string2;
        boolean bl2 = ((zzfho)object).zzr;
        if (bl2) {
            return 2;
        }
        object = ((zzfho)object).zzd;
        zzc zzc2 = ((zzl)object).zzs;
        if (zzc2 == null && (string2 = ((zzl)object).zzx) == null) {
            return 1;
        }
        if (zzc2 != null && (object = ((zzl)object).zzx) != null) {
            return 5;
        }
        if (zzc2 != null) {
            return 3;
        }
        return 4;
    }

    private static void zzg(Map map2, String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            map2.put(string2, string3);
        }
    }
}

