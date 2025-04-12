/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfyv;

public final class zzfiq {
    public static zze zza(Throwable object) {
        int n3 = object instanceof zzehp;
        if (n3 != 0) {
            object = (zzehp)object;
            n3 = ((zzdzd)object).zza();
            object = ((zzehp)object).zzb();
            return zzfiq.zzc(n3, (zze)object);
        }
        n3 = object instanceof zzdzd;
        int n4 = 0;
        if (n3 != 0) {
            Object object2 = ((Throwable)object).getMessage();
            if (object2 == null) {
                int n7 = ((zzdzd)object).zza();
                object = zzfiq.zzd(n7, null, null);
            } else {
                object2 = object;
                object2 = (zzdzd)object;
                n3 = ((zzdzd)object2).zza();
                object = ((Throwable)object).getMessage();
                object = zzfiq.zzd(n3, (String)object, null);
            }
            return object;
        }
        n3 = object instanceof com.google.android.gms.ads.internal.util.zzba;
        if (n3 != 0) {
            zze zze2;
            object = (com.google.android.gms.ads.internal.util.zzba)object;
            n4 = ((com.google.android.gms.ads.internal.util.zzba)object).zza();
            String string2 = zzfyv.zzc(((Throwable)object).getMessage());
            zze zze3 = zze2;
            zze2 = new zze(n4, string2, "com.google.android.gms.ads", null, null);
            return zze2;
        }
        return zzfiq.zzd(1, null, null);
    }

    public static zze zzb(Throwable object, zzehq object2) {
        String string2;
        Object object3;
        object = zzfiq.zza((Throwable)object);
        int n3 = ((zze)object).zza;
        int n4 = 3;
        if ((n3 == n4 || n3 == 0) && (object3 = ((zze)object).zzd) != null && (n3 = (int)(((String)(object3 = ((zze)object3).zzc)).equals(string2 = "com.google.android.gms.ads") ? 1 : 0)) == 0) {
            n3 = 0;
            object3 = null;
            ((zze)object).zzd = null;
        }
        if (object2 != null) {
            object2 = ((zzehq)object2).zzb();
            ((zze)object).zze = object2;
        }
        return object;
    }

    public static zze zzc(int n3, zze zze2) {
        if (n3 != 0) {
            int n4 = 8;
            if (n3 == n4) {
                Object object = zzbep.zziq;
                zzben zzben2 = zzba.zzc();
                object = (Integer)zzben2.zza((zzbeg)object);
                n3 = (Integer)object;
                if (n3 <= 0) {
                    n3 = 8;
                } else {
                    return zze2;
                }
            }
            return zzfiq.zzd(n3, null, zze2);
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zze zzd(int var0, String var1_1, zze var2_2) {
        block53: {
            var3_3 = var0 + -1;
            if (var1_1 != null) ** GOTO lbl-1000
            if (var0 == 0) throw null;
            var1_1 = "No fill.";
            switch (var3_3) {
                default: {
                    var1_1 = "Internal error.";
                }
lbl8:
                // 19 sources

                ** case 2:
lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_7 = var1_1;
                        break block53;
                        break;
                    }
                }
                case 18: {
                    var1_1 = "Ad inspector cannot be opened because it is already open.";
                    ** break;
                }
                case 17: {
                    var1_1 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    ** break;
                }
                case 16: {
                    var1_1 = "Ad inspector failed to load.";
                    ** break;
                }
                case 15: {
                    var1_1 = "Ad inspector had an internal error.";
                    ** break;
                }
                case 14: {
                    var1_1 = "Invalid ad string.";
                    ** break;
                }
                case 13: {
                    var1_1 = "Mismatch request IDs.";
                    ** break;
                }
                case 12: {
                    var5_4 = zzbep.zzit;
                    var6_5 = zzba.zzc();
                    var5_4 = (Integer)var6_5.zza((zzbeg)var5_4);
                    var7_6 = var5_4.intValue();
                    if (var7_6 > 0) ** GOTO lbl8
                    var1_1 = "The mediation adapter did not return an ad.";
                    ** break;
                }
                case 10: {
                    var1_1 = "The ad can not be shown when app is not in foreground.";
                    ** break;
                }
                case 9: {
                    var1_1 = "The ad has already been shown.";
                    ** break;
                }
                case 8: {
                    var1_1 = "The ad is not ready.";
                    ** break;
                }
                case 7: {
                    var1_1 = "A mediation adapter failed to show the ad.";
                    ** break;
                }
                case 6: {
                    var1_1 = "Invalid request: Invalid ad size.";
                    ** break;
                }
                case 5: {
                    var1_1 = "Invalid request: Invalid ad unit ID.";
                    ** break;
                }
                case 4: {
                    var1_1 = "Network error.";
                    ** break;
                }
                case 3: {
                    var1_1 = "App ID missing.";
                    ** break;
                }
                case 1: {
                    var1_1 = "Invalid request.";
                    ** break;
                }
            }
lbl65:
            // 1 sources

            ** while (true)
        }
        if (var0 == 0) throw null;
        var7_6 = 1;
        var8_8 = 2;
        switch (var3_3) {
            default: {
                switch (var0) {
                    default: {
                        var9_9 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                    }
                    case 18: {
                        var9_9 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    }
                    case 17: {
                        var9_9 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    }
                    case 16: {
                        var9_9 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    }
                    case 15: {
                        var9_9 = "INVALID_AD_STRING";
                        break;
                    }
                    case 14: {
                        var9_9 = "REQUEST_ID_MISMATCH";
                        break;
                    }
                    case 13: {
                        var9_9 = "MEDIATION_NO_FILL";
                        break;
                    }
                    case 12: {
                        var9_9 = "INTERNAL_SHOW_ERROR";
                        break;
                    }
                    case 11: {
                        var9_9 = "APP_NOT_FOREGROUND";
                        break;
                    }
                    case 10: {
                        var9_9 = "AD_REUSED";
                        break;
                    }
                    case 9: {
                        var9_9 = "NOT_READY";
                        break;
                    }
                    case 8: {
                        var9_9 = "MEDIATION_SHOW_ERROR";
                        break;
                    }
                    case 7: {
                        var9_9 = "INVALID_AD_SIZE";
                        break;
                    }
                    case 6: {
                        var9_9 = "INVALID_AD_UNIT_ID";
                        break;
                    }
                    case 5: {
                        var9_9 = "NETWORK_ERROR";
                        break;
                    }
                    case 4: {
                        var9_9 = "APP_ID_MISSING";
                        break;
                    }
                    case 3: {
                        var9_9 = "NO_FILL";
                        break;
                    }
                    case 2: {
                        var9_9 = "INVALID_REQUEST";
                        break;
                    }
                    case 1: {
                        var9_9 = "INTERNAL_ERROR";
                    }
                }
                var9_9 = "Unknown SdkError: ".concat(var9_9);
                var1_1 = new AssertionError((Object)var9_9);
                throw var1_1;
            }
lbl132:
            // 2 sources

            case 2: 
            case 10: 
            case 18: {
                var8_8 = 3;
                break;
            }
            case 1: 
            case 5: 
            case 6: 
            case 9: 
            case 16: {
                var8_8 = 1;
                break;
            }
            case 0: 
            case 11: 
            case 15: {
                var8_8 = 0;
                var6_5 = null;
                break;
            }
            case 14: {
                var0 = 11;
                var8_8 = 11;
                break;
            }
            case 13: {
                var0 = 10;
                var8_8 = 10;
                break;
            }
            case 12: {
                var9_10 = zzbep.zzit;
                var10_11 = zzba.zzc();
                var9_10 = (Integer)var10_11.zza((zzbeg)var9_10);
                var0 = var9_10.intValue();
                if (var0 > 0) ** GOTO lbl132
                var0 = 9;
                var8_8 = 9;
                break;
            }
            case 7: {
                var0 = 4;
                var8_8 = 4;
                break;
            }
            case 3: {
                var0 = 8;
                var8_8 = 8;
            }
            case 4: 
            case 8: 
            case 17: 
        }
        var5_4 = var1_1;
        return new zze(var8_8, (String)var4_7, "com.google.android.gms.ads", var2_2, null);
    }
}

