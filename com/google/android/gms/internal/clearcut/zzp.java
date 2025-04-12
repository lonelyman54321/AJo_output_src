/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.clearcut.ClearcutLogger$zza;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzan;
import com.google.android.gms.internal.clearcut.zzao;
import com.google.android.gms.internal.clearcut.zzgw$zza;
import com.google.android.gms.internal.clearcut.zzgw$zza$zzb;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzk;
import com.google.android.gms.internal.clearcut.zzq;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.internal.clearcut.zzy;
import com.google.android.gms.phenotype.Phenotype;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class zzp
implements ClearcutLogger$zza {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final zzao zzaq;
    private static final zzao zzar;
    private static final ConcurrentHashMap zzas;
    private static final HashMap zzat;
    private static Boolean zzau;
    private static Long zzav;
    private static final zzae zzaw;
    private final Context zzh;

    static {
        AbstractMap abstractMap = "com.google.android.gms.clearcut.public";
        Object object = Phenotype.getContentProviderUri((String)((Object)abstractMap));
        zzao zzao2 = new zzao((Uri)object);
        zzaq = zzao2 = zzao2.zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        abstractMap = Phenotype.getContentProviderUri((String)((Object)abstractMap));
        object = new zzao((Uri)abstractMap);
        zzar = ((zzao)object).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        zzas = abstractMap = new AbstractMap();
        abstractMap = new AbstractMap();
        zzat = abstractMap;
        zzau = null;
        zzav = null;
        zzaw = zzao2.zzc("enable_log_sampling_rules", false);
    }

    public zzp(Context context) {
        this.zzh = context;
        if (context != null) {
            zzae.maybeInit(context);
        }
    }

    private static long zza(String object, long l2) {
        boolean bl2;
        int n3 = 8;
        if (object != null && !(bl2 = ((String)object).isEmpty())) {
            Charset charset = UTF_8;
            object = ((String)object).getBytes(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocate(((Object)object).length + n3);
            byteBuffer.put((byte[])object);
            byteBuffer.putLong(l2);
            return zzk.zza(byteBuffer.array());
        }
        return zzk.zza(ByteBuffer.allocate(n3).putLong(l2).array());
    }

    private static zzgw$zza$zzb zza(String string2) {
        block11: {
            String string3;
            if (string2 == null) {
                return null;
            }
            int n3 = string2.indexOf(44);
            int n4 = 0;
            String string4 = null;
            if (n3 >= 0) {
                string4 = string2.substring(0, n3);
                n4 = ++n3;
                string3 = string4;
            } else {
                string3 = "";
            }
            int n7 = string2.indexOf(47, n4);
            if (n7 <= 0) {
                n3 = string2.length();
                if (n3 != 0) {
                    string3 = "Failed to parse the rule: ";
                    string3.concat(string2);
                }
                return null;
            }
            try {
                string4 = string2.substring(n4, n7);
            }
            catch (NumberFormatException numberFormatException) {
                n3 = string2.length();
                if (n3 != 0) {
                    string3 = "parseLong() failed while parsing: ";
                    string3.concat(string2);
                }
                return null;
            }
            long l2 = Long.parseLong(string4);
            ++n7;
            string4 = string2.substring(n7);
            long l3 = Long.parseLong(string4);
            long l4 = 0L;
            long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (l7 < 0 || (l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) < 0) break block11;
            return (zzgw$zza$zzb)zzgw$zza$zzb.zzfz().zzn(string3).zzr(l2).zzs(l3).zzbh();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean zzb(long l2, long l3, long l4) {
        long l7;
        long l8 = 0L;
        long l12 = l3 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object < 0) return true;
        Object object2 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
        if (object2 <= 0) return true;
        Object object3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        if (object3 < 0) {
            l8 = Long.MAX_VALUE;
            long l14 = l8 % l4;
            long l15 = 1L;
            l2 = (l2 & l8) % l4 + (l14 += l15);
        }
        long l16 = (l7 = (l2 %= l4) - l3) == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l16 >= 0) return false;
        return true;
    }

    private static boolean zzc(Context object) {
        Object object2 = zzau;
        if (object2 == null) {
            int n3 = ((PackageManagerWrapper)(object = Wrappers.packageManager((Context)object))).checkCallingOrSelfPermission((String)(object2 = "com.google.android.providers.gsf.permission.READ_GSERVICES"));
            if (!n3) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            zzau = object = Boolean.valueOf(n3 != 0);
        }
        return zzau;
    }

    private static long zzd(Context object) {
        Long l2 = zzav;
        if (l2 == null) {
            long l3 = 0L;
            if (object != null) {
                boolean bl2 = zzp.zzc(object);
                if (bl2) {
                    object = object.getContentResolver();
                    String string2 = "android_id";
                    l3 = zzy.getLong((ContentResolver)object, string2, l3);
                }
                object = l3;
                zzav = object;
            } else {
                return l3;
            }
        }
        return zzav;
    }

    public final boolean zza(zze object) {
        int n3;
        Object object2 = ((zze)object).zzag;
        Object object3 = ((zzr)object2).zzj;
        int n4 = ((zzr)object2).zzk;
        object = ((zze)object).zzaa;
        if (object != null) {
            n3 = ((zzha)object).zzbji;
        } else {
            n3 = 0;
            object = null;
        }
        Object object4 = (Boolean)zzaw.get();
        boolean n7 = (Boolean)object4;
        Object object5 = null;
        if (!n7) {
            if (object3 == null || (n3 = (int)(((String)object3).isEmpty() ? 1 : 0)) != 0) {
                if (n4 >= 0) {
                    object3 = String.valueOf(n4);
                } else {
                    boolean bl2 = false;
                    object3 = null;
                }
            }
            if (object3 != null) {
                object = this.zzh;
                if (object != null && (n3 = (int)(zzp.zzc((Context)object) ? 1 : 0)) != 0) {
                    object = zzat;
                    object2 = (zzae)((HashMap)object).get(object3);
                    if (object2 == null) {
                        object2 = zzar.zza((String)object3, null);
                        ((HashMap)object).put(object3, object2);
                    }
                    object5 = object = ((zzae)object2).get();
                    object5 = (String)object;
                }
                if ((object = zzp.zza(object5)) != null) {
                    object2 = ((zzgw$zza$zzb)object).zzfw();
                    long l2 = zzp.zzd(this.zzh);
                    long l3 = zzp.zza((String)object2, l2);
                    long l4 = ((zzgw$zza$zzb)object).zzfx();
                    long l7 = ((zzgw$zza$zzb)object).zzfy();
                    return zzp.zzb(l3, l4, l7);
                }
            }
        } else {
            boolean bl3;
            boolean bl4;
            if (object3 == null || (bl4 = ((String)object3).isEmpty())) {
                if (n4 >= 0) {
                    object3 = String.valueOf(n4);
                } else {
                    bl3 = false;
                    object3 = null;
                }
            }
            if (object3 != null) {
                object2 = this.zzh;
                if (object2 == null) {
                    object2 = Collections.emptyList();
                } else {
                    object2 = zzas;
                    object4 = (zzae)((ConcurrentHashMap)object2).get(object3);
                    if (object4 == null) {
                        zzan zzan2;
                        object4 = zzaq;
                        object5 = zzgw$zza.zzft();
                        if ((object2 = (zzae)((ConcurrentHashMap)object2).putIfAbsent(object3, object4 = ((zzao)object4).zza((String)object3, object5, zzan2 = zzq.zzax))) != null) {
                            object4 = object2;
                        }
                    }
                    object2 = ((zzgw$zza)((zzae)object4).get()).zzfs();
                }
                object2 = object2.iterator();
                while (bl3 = object2.hasNext()) {
                    long l8;
                    long l12;
                    long l14;
                    long l15;
                    object3 = (zzgw$zza$zzb)object2.next();
                    int n8 = ((zzgw$zza$zzb)object3).zzfv();
                    if (n8 != 0 && (n8 = ((zzgw$zza$zzb)object3).getEventCode()) != 0 && (n8 = ((zzgw$zza$zzb)object3).getEventCode()) != n3 || (bl3 = zzp.zzb(l15 = zzp.zza((String)(object4 = ((zzgw$zza$zzb)object3).zzfw()), l14 = zzp.zzd((Context)(object5 = this.zzh))), l12 = ((zzgw$zza$zzb)object3).zzfx(), l8 = ((zzgw$zza$zzb)object3).zzfy()))) continue;
                    return false;
                }
            }
        }
        return true;
    }
}

