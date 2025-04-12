/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final class zzarr
implements zzard {
    private final Map zza;
    private final zzaqq zzb;
    private final BlockingQueue zzc;
    private final zzaqv zzd;

    public zzarr(zzaqq zzaqq2, BlockingQueue blockingQueue, zzaqv zzaqv2) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzd = zzaqv2;
        this.zzb = zzaqq2;
        this.zzc = blockingQueue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzare object) {
        int n3 = 1;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    Object[] objectArray;
                    Object object2;
                    Object object3;
                    block6: {
                        try {
                            int n4;
                            object3 = this.zza;
                            object = ((zzare)object).zzj();
                            object3 = object3.remove(object);
                            object3 = (List)object3;
                            if (object3 == null || (n4 = object3.isEmpty()) != 0) break block5;
                            n4 = zzarq.zzb;
                            if (n4 == 0) break block6;
                            n4 = object3.size();
                            object2 = n4;
                            int n7 = 2;
                            objectArray = new Object[n7];
                            objectArray[0] = object2;
                            objectArray[n3] = object;
                            object2 = "%d waiting requests for cacheKey=%s; resend to network";
                            zzarq.zzd((String)object2, objectArray);
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object2 = object3.remove(0);
                    object2 = (zzare)object2;
                    objectArray = this.zza;
                    objectArray.put(object, object3);
                    ((zzare)object2).zzu(this);
                    try {
                        object = this.zzc;
                        object.put(object2);
                        return;
                    }
                    catch (InterruptedException interruptedException) {
                        Object object4 = ((Object)interruptedException).toString();
                        Object[] objectArray2 = new Object[n3];
                        objectArray2[0] = object4;
                        object4 = "Couldn't add request to queue. %s";
                        zzarq.zzb((String)object4, objectArray2);
                        object4 = Thread.currentThread();
                        ((Thread)object4).interrupt();
                        object4 = this.zzb;
                        ((zzaqq)object4).zzb();
                        return;
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzb(zzare object, zzark zzark2) {
        long l2;
        boolean bl2;
        Object object2 = zzark2.zzb;
        if (object2 != null && !(bl2 = ((zzaqn)object2).zza(l2 = System.currentTimeMillis()))) {
            Object[] objectArray;
            int n3;
            Object object3;
            object = ((zzare)object).zzj();
            // MONITORENTER : this
            object2 = this.zza;
            object2 = object2.remove(object);
            object2 = (List)object2;
            // MONITOREXIT : this
            if (object2 == null) return;
            int n4 = (int)(zzarq.zzb ? 1 : 0);
            if (n4 != 0) {
                object3 = object2.size();
                n3 = 2;
                objectArray = new Object[n3];
                objectArray[0] = object3;
                n4 = 1;
                objectArray[n4] = object;
                object = "Releasing %d waiting requests for cacheKey=%s.";
                zzarq.zzd((String)object, objectArray);
            }
            object = object2.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (zzare)object.next();
                object3 = this.zzd;
                n3 = 0;
                objectArray = null;
                ((zzaqv)object3).zzb((zzare)object2, zzark2, null);
            }
            return;
        }
        this.zza((zzare)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc(zzare object) {
        String string2 = null;
        boolean bl2 = true;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string3;
                ArrayList<Object[]> arrayList;
                block5: {
                    block6: {
                        try {
                            arrayList = this.zza;
                            string3 = ((zzare)object).zzj();
                            boolean bl3 = arrayList.containsKey(string3);
                            if (!bl3) break block5;
                            arrayList = this.zza;
                            arrayList = arrayList.get(string3);
                            if ((arrayList = (List)arrayList) != null) break block6;
                            arrayList = new ArrayList<Object[]>();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    String string4 = "waiting-for-response";
                    ((zzare)object).zzm(string4);
                    arrayList.add((Object[])object);
                    object = this.zza;
                    object.put(string3, arrayList);
                    boolean bl4 = zzarq.zzb;
                    if (bl4) {
                        object = new Object[bl2];
                        object[0] = string3;
                        string2 = "Request for cacheKey=%s is in flight, putting on hold.";
                        zzarq.zza(string2, (Object[])object);
                    }
                    return bl2;
                }
                arrayList = this.zza;
                Object var7_9 = null;
                arrayList.put(string3, null);
                ((zzare)object).zzu(this);
                boolean bl5 = zzarq.zzb;
                if (bl5) {
                    object = new Object[bl2];
                    object[0] = string3;
                    String string5 = "new request, sending to network %s";
                    zzarq.zza(string5, (Object[])object);
                }
                return false;
            }
            throw throwable2;
        }
    }
}

