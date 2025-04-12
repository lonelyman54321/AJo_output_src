/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcby;
import java.util.ArrayList;

public final class zzbbc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbbr zze;
    private final zzbbz zzf;
    private final Object zzg;
    private final ArrayList zzh;
    private final ArrayList zzi;
    private final ArrayList zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private String zzo;
    private String zzp;
    private String zzq;

    public zzbbc(int n3, int n4, int n7, int n8, int n10, int n14, int n15, boolean bl2) {
        Object object;
        this.zzg = object = new Object();
        object = new ArrayList();
        this.zzh = object;
        object = new ArrayList();
        this.zzi = object;
        object = new ArrayList();
        this.zzj = object;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzo = object = "";
        this.zzp = object;
        this.zzq = object;
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = bl2;
        Object object2 = new zzbbr(n8);
        this.zze = object2;
        this.zzf = object2 = new zzbbz(n10, n14, n15);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzp(String object, boolean bl2, float f5, float f6, float f7, float f8) {
        if (object == null) return;
        int n3 = this.zzc;
        int n4 = ((String)object).length();
        if (n4 < n3) {
            return;
        }
        Object object2 = this.zzg;
        synchronized (object2) {
            try {
                Object object3 = this.zzh;
                ((ArrayList)object3).add(object);
                n4 = this.zzk;
                int n7 = ((String)object).length();
                this.zzk = n4 += n7;
                if (!bl2) return;
                Object object4 = this.zzi;
                ((ArrayList)object4).add(object);
                object = this.zzj;
                object3 = this.zzi;
                n4 = ((ArrayList)object3).size();
                int n8 = n4 + -1;
                object3 = object4;
                object4 = new zzbbn(f5, f6, f7, f8, n8);
                ((ArrayList)object).add(object4);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final String zzq(ArrayList object, int n3) {
        int n4;
        int n7;
        n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = object.size();
        int n10 = 0;
        do {
            n4 = 100;
            if (n10 >= n8) break;
            String string2 = (String)object.get(n10);
            stringBuilder.append(string2);
            stringBuilder.append(' ');
            n7 = stringBuilder.length();
            ++n10;
        } while (n7 <= n4);
        int n14 = stringBuilder.length() + -1;
        stringBuilder.deleteCharAt(n14);
        object = stringBuilder.toString();
        n3 = ((String)object).length();
        if (n3 < n4) {
            return object;
        }
        return ((String)object).substring(0, n4);
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = object instanceof zzbbc;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (object == this) {
            return bl3;
        }
        object = ((zzbbc)object).zzo;
        if (object != null && (bl2 = ((String)object).equals(string2 = this.zzo))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        Object object = this.zzh;
        int n3 = this.zzl;
        int n4 = this.zzn;
        int n7 = this.zzk;
        int n8 = 100;
        object = zzbbc.zzq((ArrayList)object, n8);
        String string2 = zzbbc.zzq(this.zzi, n8);
        String string3 = this.zzo;
        String string4 = this.zzp;
        String string5 = this.zzq;
        StringBuilder stringBuilder = fQ2.a("ActivityContent fetchId: ", " score:", " total_length:", n3, n4);
        h30_0.b(stringBuilder, n7, "\n text: ", (String)object, "\n viewableText");
        X50.a(stringBuilder, string2, "\n signture: ", string3, "\n viewableSignture: ");
        return BW0.b(stringBuilder, string4, "\n viewableSignatureForVertical: ", string5);
    }

    public final int zza(int n3, int n4) {
        int n7 = this.zzd;
        if (n7 != 0) {
            return this.zzb;
        }
        n7 = this.zza;
        n3 *= n7;
        n7 = this.zzb;
        return n4 * n7 + n3;
    }

    public final int zzb() {
        return this.zzn;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        Object object = this.zzg;
        synchronized (object) {
            int n3;
            this.zzm = n3 = this.zzm + -1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh() {
        Object object = this.zzg;
        synchronized (object) {
            int n3;
            this.zzm = n3 = this.zzm + 1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi() {
        Object object = this.zzg;
        synchronized (object) {
            int n3;
            this.zzn = n3 = this.zzn + -100;
            return;
        }
    }

    public final void zzj(int n3) {
        this.zzl = n3;
    }

    public final void zzk(String string2, boolean bl2, float f5, float f6, float f7, float f8) {
        this.zzp(string2, bl2, f5, f6, f7, f8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(String object, boolean n3, float f5, float f6, float f7, float f8) {
        this.zzp((String)object, n3 != 0, f5, f6, f7, f8);
        object = this.zzg;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        n3 = this.zzm;
                        if (n3 >= 0) break block3;
                        String string2 = "ActivityContent: negative number of WebViews.";
                        com.google.android.gms.ads.internal.util.client.zzm.zze(string2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzm();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm() {
        Object object = this.zzg;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block4: {
                    ArrayList arrayList;
                    Object object2;
                    int n3;
                    block5: {
                        try {
                            n3 = this.zzk;
                            int n4 = this.zzl;
                            n3 = this.zza(n3, n4);
                            n4 = this.zzn;
                            if (n3 <= n4) break block4;
                            this.zzn = n3;
                            object2 = zzu.zzo();
                            n3 = (int)((object2 = ((zzcby)object2).zzi()).zzP() ? 1 : 0);
                            if (n3 != 0) break block5;
                            object2 = this.zze;
                            arrayList = this.zzh;
                            this.zzo = object2 = ((zzbbr)object2).zza(arrayList);
                            object2 = this.zze;
                            arrayList = this.zzi;
                            this.zzp = object2 = ((zzbbr)object2).zza(arrayList);
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object2 = zzu.zzo();
                    n3 = (int)((object2 = ((zzcby)object2).zzi()).zzQ() ? 1 : 0);
                    if (n3 == 0) {
                        object2 = this.zzf;
                        arrayList = this.zzi;
                        ArrayList arrayList2 = this.zzj;
                        this.zzq = object2 = ((zzbbz)object2).zza(arrayList, arrayList2);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn() {
        Object object = this.zzg;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3 = this.zzk;
                        int n4 = this.zzl;
                        n3 = this.zza(n3, n4);
                        n4 = this.zzn;
                        if (n3 <= n4) break block3;
                        this.zzn = n3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzo() {
        Object object = this.zzg;
        synchronized (object) {
            boolean bl2 = this.zzm;
            if (bl2) return false;
            return true;
        }
    }
}

