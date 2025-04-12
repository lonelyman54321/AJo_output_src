/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzcby;
import java.util.LinkedList;
import java.util.List;

public final class zzbbd {
    int zza;
    private final Object zzb;
    private final List zzc;

    public zzbbd() {
        LinkedList linkedList = new LinkedList();
        this.zzb = linkedList;
        this.zzc = linkedList = new LinkedList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbbc zza(boolean bl2) {
        Object object = this.zzb;
        synchronized (object) {
            int n3;
            int n4;
            Object object2;
            int n7;
            block12: {
                Throwable throwable2;
                block11: {
                    Object object3;
                    try {
                        object3 = this.zzc;
                        n7 = object3.isEmpty();
                        object2 = null;
                        if (n7 != 0) {
                            String string2 = "Queue empty";
                            zzm.zze(string2);
                            return null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    object3 = this.zzc;
                    n7 = object3.size();
                    n4 = 2;
                    n3 = 0;
                    if (n7 < n4) {
                        object3 = this.zzc;
                        object3 = object3.get(0);
                        object3 = (zzbbc)object3;
                        if (bl2) {
                            List list = this.zzc;
                            list.remove(0);
                        } else {
                            ((zzbbc)object3).zzi();
                        }
                        return object3;
                    }
                    break block12;
                }
                throw throwable2;
            }
            Object object4 = this.zzc;
            object4 = object4.iterator();
            n7 = -1 << -1;
            n4 = 0;
            while (true) {
                boolean bl3;
                if (!(bl3 = object4.hasNext())) {
                    object4 = this.zzc;
                    object4.remove(n3);
                    return object2;
                }
                Object object5 = object4.next();
                int n8 = ((zzbbc)(object5 = (zzbbc)object5)).zzb();
                if (n8 > n7) {
                    n3 = n4;
                }
                int n10 = n8 > n7 ? n8 : n7;
                if (n8 > n7) {
                    object2 = object5;
                }
                ++n4;
                n7 = n10;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzbbc zzbbc2) {
        Object object = "Queue is full, current size = ";
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                int n3;
                block3: {
                    try {
                        List list = this.zzc;
                        n3 = list.size();
                        int n4 = 10;
                        if (n3 < n4) break block3;
                        list = this.zzc;
                        n3 = list.size();
                        StringBuilder stringBuilder = new StringBuilder((String)object);
                        stringBuilder.append(n3);
                        object = stringBuilder.toString();
                        zzm.zze((String)object);
                        object = this.zzc;
                        n3 = 0;
                        list = null;
                        object.remove(0);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                int n7 = this.zza;
                this.zza = n3 = n7 + 1;
                zzbbc2.zzj(n7);
                zzbbc2.zzn();
                object = this.zzc;
                object.add(zzbbc2);
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
    public final boolean zzc(zzbbc zzbbc2) {
        Object object = this.zzb;
        synchronized (object) {
            boolean bl2;
            Object object2;
            try {
                object2 = this.zzc;
                object2 = object2.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                boolean bl3;
                if (!(bl3 = object2.hasNext())) {
                    return false;
                }
                Object object3 = object2.next();
                object3 = (zzbbc)object3;
                Object object4 = zzu.zzo();
                object4 = ((zzcby)object4).zzi();
                boolean bl4 = object4.zzP();
                bl2 = true;
                if (!bl4) {
                    bl4 = zzbbc2.equals(object3);
                    if (bl4 || !(bl3 = ((String)(object3 = ((zzbbc)object3).zzd())).equals(object4 = zzbbc2.zzd()))) continue;
                    object2.remove();
                    return bl2;
                }
                object4 = zzu.zzo();
                bl4 = (object4 = ((zzcby)object4).zzi()).zzQ();
                if (!bl4 && !(bl4 = zzbbc2.equals(object3)) && (bl3 = ((String)(object3 = ((zzbbc)object3).zzf())).equals(object4 = zzbbc2.zzf()))) break;
            }
            object2.remove();
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(zzbbc zzbbc2) {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    List list = this.zzc;
                    boolean bl2 = list.contains(zzbbc2);
                    if (bl2) {
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }
}

