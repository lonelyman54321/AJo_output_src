/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzes;
import com.google.android.gms.internal.gtm.zzeu;
import java.util.Map;

public final class zzeo
extends zzbr {
    private static zzeo zza;

    public zzeo(zzbu zzbu2) {
        super(zzbu2);
    }

    public static zzeo zza() {
        return zza;
    }

    public static final String zzf(Object object) {
        long l2;
        int n3;
        if (object == null) {
            return null;
        }
        boolean bl2 = object instanceof Integer;
        if (bl2) {
            n3 = (Integer)object;
            l2 = n3;
            object = l2;
        }
        bl2 = object instanceof Long;
        String string2 = "-";
        if (bl2) {
            long l3;
            Object object2 = object;
            object2 = (Long)object;
            long l4 = Math.abs((Long)object2);
            long l7 = l4 - (l3 = (long)100);
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 < 0) {
                return object.toString();
            }
            object = object.toString();
            n3 = ((String)object).charAt(0);
            l4 = Math.abs((Long)object2);
            object2 = String.valueOf(l4);
            StringBuilder stringBuilder = new StringBuilder();
            int n4 = 45;
            if (n3 != n4) {
                string2 = "";
            }
            stringBuilder.append(string2);
            double d2 = ((String)object2).length() + -1;
            double d5 = 10.0;
            long l8 = Math.round(Math.pow(d5, d2));
            stringBuilder.append(l8);
            stringBuilder.append("...");
            stringBuilder.append(string2);
            double d7 = ((String)object2).length();
            l2 = Math.round(Math.pow(d5, d7) + -1.0);
            stringBuilder.append(l2);
            return stringBuilder.toString();
        }
        bl2 = object instanceof Boolean;
        if (bl2) {
            return object.toString();
        }
        bl2 = object instanceof Throwable;
        if (bl2) {
            return object.getClass().getCanonicalName();
        }
        return string2;
    }

    public final void zzb(zzek object, String string2) {
        object = object != null ? ((zzek)object).toString() : "no hit data";
        string2 = "Discarding hit. ".concat(string2);
        this.zzR(string2, object);
    }

    public final void zzc(Map object, String string2) {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            int n3 = stringBuilder.length();
            if (n3 > 0) {
                n3 = 44;
                stringBuilder.append((char)n3);
            }
            String string3 = (String)object2.getKey();
            stringBuilder.append(string3);
            n3 = 61;
            stringBuilder.append((char)n3);
            object2 = (String)object2.getValue();
            stringBuilder.append((String)object2);
        }
        object = stringBuilder.toString();
        string2 = "Discarding hit. ".concat(string2);
        this.zzR(string2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Class<zzeo> clazz = zzeo.class;
        synchronized (clazz) {
            zza = this;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(int n3, String object, Object object2, Object object3, Object object4) {
        String string2 = "3";
        synchronized (this) {
            Throwable throwable2;
            block7: {
                char c2;
                block6: {
                    block5: {
                        try {
                            Preconditions.checkNotNull(object);
                            zzcs zzcs2 = this.zzw();
                            c2 = zzcs2.zzb();
                            if (c2 == '\u0000') break block5;
                            this.zzw();
                            c2 = 'C';
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    this.zzw();
                    c2 = 'c';
                }
                String string3 = "01VDIWEA?";
                n3 = string3.charAt(n3);
                string3 = zzbs.zza;
                object2 = zzeo.zzf(object2);
                object3 = zzeo.zzf(object3);
                object4 = zzeo.zzf(object4);
                object = zzbq.zzD((String)object, object2, object3, object4);
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append((char)n3);
                ((StringBuilder)object2).append(c2);
                ((StringBuilder)object2).append(string3);
                String string4 = ":";
                ((StringBuilder)object2).append(string4);
                ((StringBuilder)object2).append((String)object);
                string4 = ((StringBuilder)object2).toString();
                int n4 = string4.length();
                int n7 = 1024;
                if (n4 > n7) {
                    n4 = 0;
                    object = null;
                    string4 = string4.substring(0, n7);
                }
                object = this.zzt();
                if ((object = ((zzbu)object).zzp()) != null) {
                    object = ((zzeu)object).zze();
                    ((zzes)object).zzc(string4);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }
}

