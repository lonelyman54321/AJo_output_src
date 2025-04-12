/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;

public final class zzgo
extends zzji {
    private char zza = '\u0000';
    private long zzb = -1;
    private String zzc;
    private final zzgq zzd;
    private final zzgq zze;
    private final zzgq zzf;
    private final zzgq zzg;
    private final zzgq zzh;
    private final zzgq zzi;
    private final zzgq zzj;
    private final zzgq zzk;
    private final zzgq zzl;

    public zzgo(zzic zzic2) {
        super(zzic2);
        zzgq zzgq2;
        int n3 = 6;
        this.zzd = zzgq2 = new zzgq(this, n3, false, false);
        boolean bl2 = true;
        this.zze = zzgq2 = new zzgq(this, n3, bl2, false);
        this.zzf = zzgq2 = new zzgq(this, n3, false, bl2);
        n3 = 5;
        this.zzg = zzgq2 = new zzgq(this, n3, false, false);
        this.zzh = zzgq2 = new zzgq(this, n3, bl2, false);
        this.zzi = zzgq2 = new zzgq(this, n3, false, bl2);
        this.zzj = zzgq2 = new zzgq(this, 4, false, false);
        this.zzk = zzgq2 = new zzgq(this, 3, false, false);
        this.zzl = zzgq2 = new zzgq(this, 2, false, false);
    }

    public static /* bridge */ /* synthetic */ char zza(zzgo zzgo2) {
        return zzgo2.zza;
    }

    public static Object zza(String string2) {
        if (string2 == null) {
            return null;
        }
        zzgt zzgt2 = new zzgt(string2);
        return zzgt2;
    }

    private static String zza(boolean bl2, Object stackTraceElementArray) {
        long l2;
        int n3;
        CharSequence charSequence = "";
        if (stackTraceElementArray == null) {
            return charSequence;
        }
        Object object = stackTraceElementArray instanceof Integer;
        if (object != 0) {
            n3 = (Integer)stackTraceElementArray;
            l2 = n3;
            stackTraceElementArray = l2;
        }
        object = stackTraceElementArray instanceof Long;
        String object22 = "-";
        StringBuilder stringBuilder = null;
        if (object != 0) {
            long l3;
            if (!bl2) {
                return String.valueOf(stackTraceElementArray);
            }
            Object object2 = stackTraceElementArray;
            object2 = (Long)stackTraceElementArray;
            long l4 = Math.abs((Long)object2);
            long l7 = l4 - (l3 = (long)100);
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object < 0) {
                return String.valueOf(stackTraceElementArray);
            }
            n3 = ((String)(stackTraceElementArray = String.valueOf(stackTraceElementArray))).charAt(0);
            if (n3 == (object = 45)) {
                charSequence = object22;
            }
            object2 = String.valueOf(Math.abs((Long)object2));
            double d2 = ((String)object2).length() + -1;
            double d5 = 10.0;
            l2 = Math.round(Math.pow(d5, d2));
            double d7 = ((String)object2).length();
            long l8 = Math.round(Math.pow(d5, d7) - 1.0);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(l2);
            stringBuilder.append("...");
            stringBuilder.append((String)charSequence);
            stringBuilder.append(l8);
            return stringBuilder.toString();
        }
        boolean bl3 = stackTraceElementArray instanceof Boolean;
        if (bl3) {
            return String.valueOf(stackTraceElementArray);
        }
        bl3 = stackTraceElementArray instanceof Throwable;
        if (bl3) {
            stackTraceElementArray = (Throwable)stackTraceElementArray;
            String string2 = bl2 ? stackTraceElementArray.getClass().getName() : ((Throwable)stackTraceElementArray).toString();
            charSequence = new StringBuilder(string2);
            string2 = zzgo.zzb(zzic.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : ((Throwable)stackTraceElementArray).getStackTrace()) {
                String string3;
                boolean bl4 = stackTraceElement.isNativeMethod();
                if (bl4 || (string3 = stackTraceElement.getClassName()) == null || !(bl4 = (string3 = zzgo.zzb(string3)).equals(string2))) continue;
                string2 = ": ";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(stackTraceElement);
                break;
            }
            return ((StringBuilder)charSequence).toString();
        }
        bl3 = stackTraceElementArray instanceof zzgt;
        if (bl3) {
            return zzgt.zza((zzgt)stackTraceElementArray);
        }
        if (bl2) {
            return object22;
        }
        return String.valueOf(stackTraceElementArray);
    }

    public static String zza(boolean bl2, String string2, Object object, Object object2, Object object3) {
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        object = zzgo.zza(bl2, object);
        object2 = zzgo.zza(bl2, object2);
        String string4 = zzgo.zza(bl2, object3);
        object3 = new StringBuilder();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            ((StringBuilder)object3).append(string2);
            string3 = ": ";
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)object);
        String string5 = ", ";
        if (!bl4) {
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append((String)object);
            string3 = string5;
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)object2))) {
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append((String)object2);
        } else {
            string5 = string3;
        }
        bl4 = TextUtils.isEmpty((CharSequence)string4);
        if (!bl4) {
            ((StringBuilder)object3).append(string5);
            ((StringBuilder)object3).append(string4);
        }
        return ((StringBuilder)object3).toString();
    }

    public static /* bridge */ /* synthetic */ void zza(zzgo zzgo2, char c2) {
        zzgo2.zza = c2;
    }

    public static /* bridge */ /* synthetic */ void zza(zzgo zzgo2, long l2) {
        zzgo2.zzb = l2;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzgo zzgo2) {
        return zzgo2.zzb;
    }

    private static String zzb(String string2) {
        int n3;
        int n4 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "";
        if (n4 != 0) {
            return string3;
        }
        n4 = string2.lastIndexOf(46);
        if (n4 == (n3 = -1)) {
            return string3;
        }
        return string2.substring(0, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzz() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block3: {
                    block5: {
                        block4: {
                            try {
                                object = this.zzc;
                                if (object != null) break block3;
                                object = this.zzu;
                                if ((object = ((zzic)object).zzy()) == null) break block4;
                                object = this.zzu;
                                object = ((zzic)object).zzy();
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        object = "FA";
                    }
                    this.zzc = object;
                }
                object = this.zzc;
                Preconditions.checkNotNull(object);
                return this.zzc;
            }
            throw throwable2;
        }
    }

    public final void zza(int n3, String string2) {
        String string3 = this.zzz();
        Log.println((int)n3, (String)string3, (String)string2);
    }

    public final void zza(int n3, boolean n4, boolean n7, String string2, Object object, Object object2, Object object3) {
        Object object4;
        if (n4 == 0 && (n4 = this.zza(n3)) != 0) {
            object4 = zzgo.zza(false, string2, object, object2, object3);
            this.zza(n3, (String)object4);
        }
        if (n7 == 0 && n3 >= (n4 = 5)) {
            int n8;
            zzgr zzgr2;
            Preconditions.checkNotNull(string2);
            object4 = this.zzu.zzo();
            n7 = 6;
            if (object4 == null) {
                this.zza(n7, "Scheduler not set. Not logging error/warn");
                return;
            }
            boolean bl2 = ((zzji)object4).zzag();
            if (!bl2) {
                this.zza(n7, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (n3 < 0) {
                n3 = 0;
                zzgr2 = null;
            }
            if (n3 >= (n7 = 9)) {
                n3 = 8;
                n8 = 8;
            } else {
                n8 = n3;
            }
            zzgr2 = new zzgr(this, n8, string2, object, object2, object3);
            ((zzhv)object4).zzb(zzgr2);
        }
    }

    public final boolean zza(int n3) {
        return Log.isLoggable((String)this.zzz(), (int)n3);
    }

    public final zzgq zzc() {
        return this.zzk;
    }

    public final zzgq zzg() {
        return this.zzd;
    }

    public final boolean zzh() {
        return false;
    }

    public final zzgq zzm() {
        return this.zzf;
    }

    public final zzgq zzo() {
        return this.zze;
    }

    public final zzgq zzp() {
        return this.zzj;
    }

    public final zzgq zzq() {
        return this.zzl;
    }

    public final zzgq zzr() {
        return this.zzg;
    }

    public final zzgq zzw() {
        return this.zzi;
    }

    public final zzgq zzx() {
        return this.zzh;
    }

    public final String zzy() {
        Pair pair;
        Object object = this.zzk().zzb;
        String string2 = null;
        if (object == null) {
            return null;
        }
        object = this.zzk().zzb.zza();
        if (object != null && object != (pair = zzha.zza)) {
            string2 = String.valueOf(((Pair)object).second);
            object = (String)((Pair)object).first;
            return n1.a(string2, ":", (String)object);
        }
        return null;
    }
}

