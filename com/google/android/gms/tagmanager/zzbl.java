/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzp;
import java.util.Map;

final class zzbl
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzJ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzch.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbz.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzcu.toString();

    public zzbl() {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
    }

    public final zzap zza(Map object) {
        block18: {
            block17: {
                Object object2;
                block22: {
                    block20: {
                        int n3;
                        int n4;
                        String string2;
                        block21: {
                            String string3;
                            block19: {
                                int n7;
                                String string4;
                                Object object3;
                                Object object4;
                                block16: {
                                    block15: {
                                        block14: {
                                            object4 = zzb;
                                            if ((object4 = (zzap)object.get(object4)) == null || object4 == (object3 = zzfp.zza())) break block18;
                                            object4 = zzfp.zzm(zzfp.zzk((zzap)object4));
                                            object3 = zzd;
                                            object3 = (zzap)object.get(object3);
                                            string2 = "text";
                                            object3 = object3 == null ? string2 : zzfp.zzm(zzfp.zzk((zzap)object3));
                                            object2 = zze;
                                            object2 = (zzap)object.get(object2);
                                            string4 = "base16";
                                            object2 = object2 == null ? string4 : zzfp.zzm(zzfp.zzk((zzap)object2));
                                            String string5 = zzc;
                                            object = (zzap)object.get(string5);
                                            n4 = 2;
                                            if (object != null && (n7 = ((Boolean)(object = zzfp.zzf(zzfp.zzk((zzap)object)))).booleanValue()) != 0) {
                                                n4 = 3;
                                            }
                                            try {
                                                n7 = string2.equals(object3);
                                                string2 = "base64url";
                                                string3 = "base64";
                                                if (n7 == 0) break block14;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                return zzfp.zza();
                                            }
                                            object = ((String)object4).getBytes();
                                        }
                                        n7 = string4.equals(object3);
                                        if (n7 == 0) break block15;
                                        object = zzp.zzb((String)object4);
                                    }
                                    n7 = string3.equals(object3);
                                    if (n7 == 0) break block16;
                                    object = Base64.decode((String)object4, (int)n4);
                                }
                                n7 = string2.equals(object3);
                                if (n7 == 0) break block17;
                                n7 = n4 | 8;
                                object = Base64.decode((String)object4, (int)n7);
                                n3 = string4.equals(object2);
                                if (n3 == 0) break block19;
                                object = zzp.zza((byte[])object);
                                break block20;
                            }
                            n3 = string3.equals(object2);
                            if (n3 == 0) break block21;
                            object = Base64.encodeToString((byte[])object, (int)n4);
                            break block20;
                        }
                        n3 = string2.equals(object2);
                        if (n3 == 0) break block22;
                        n3 = n4 | 8;
                        object = Base64.encodeToString((byte[])object, (int)n3);
                    }
                    return zzfp.zzb(object);
                }
                object = String.valueOf(object2);
                "Encode: unknown output format: ".concat((String)object);
                return zzfp.zza();
            }
            return zzfp.zza();
        }
        return zzfp.zza();
    }

    public final boolean zzb() {
        return true;
    }
}

