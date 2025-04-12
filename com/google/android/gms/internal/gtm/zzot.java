/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgw;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zztp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzot
extends zzjo {
    private static final zztp zza = zztp.zzj("GET", "HEAD", "POST", "PUT");
    private final zzgw zzb;

    public zzot(zzgw zzgw2) {
        this.zzb = zzgw2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        Object object2;
        Object object3;
        boolean bl2;
        Iterator iterator;
        Object object4;
        Object object5;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((Object)object).length;
        if (n4 == n3) {
            n4 = 1;
        } else {
            n4 = 0;
            object5 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        n4 = object[0] instanceof zzqw;
        Preconditions.checkArgument(n4 != 0);
        object5 = ((zzqo)object[0]).zzb("url");
        boolean bl3 = object5 instanceof zzqz;
        Preconditions.checkArgument(bl3);
        object5 = ((zzqz)object5).zzk();
        Object[] objectArray = ((zzqo)object[0]).zzb("method");
        Object object6 = zzqs.zze;
        String string2 = "GET";
        if (objectArray == object6) {
            objectArray = new zzqz(string2);
        }
        boolean bl4 = objectArray instanceof zzqz;
        Preconditions.checkArgument(bl4);
        String string3 = ((zzqz)objectArray).zzk();
        bl3 = zza.contains(string3);
        Preconditions.checkArgument(bl3);
        objectArray = object[0];
        Iterator iterator2 = "uniqueId";
        objectArray = objectArray.zzb((String)((Object)iterator2));
        if (objectArray == object6 || objectArray == (iterator2 = zzqs.zzd) || (bl4 = objectArray instanceof zzqz)) {
            bl4 = true;
        } else {
            bl4 = false;
            iterator2 = null;
        }
        Preconditions.checkArgument(bl4);
        bl4 = false;
        iterator2 = null;
        if (objectArray == object6 || objectArray == (object4 = zzqs.zzd)) {
            iterator = null;
        } else {
            objectArray = ((zzqz)objectArray).zzk();
            iterator = objectArray;
        }
        objectArray = object[0];
        object4 = "headers";
        objectArray = objectArray.zzb((String)object4);
        if (objectArray == object6 || (bl2 = objectArray instanceof zzqw)) {
            bl2 = true;
        } else {
            bl2 = false;
            object4 = null;
        }
        Preconditions.checkArgument(bl2);
        object4 = new HashMap();
        Object object7 = ".";
        if (objectArray == object6) {
            object3 = null;
        } else {
            boolean bl5;
            objectArray = ((zzqw)objectArray).zzi().entrySet().iterator();
            while (bl5 = objectArray.hasNext()) {
                object6 = (Map.Entry)objectArray.next();
                object3 = (String)object6.getKey();
                boolean bl6 = (object6 = (zzqo)object6.getValue()) instanceof zzqz;
                if (!bl6) {
                    object2 = "Ignore the non-string value of header key ";
                    object6 = new StringBuilder((String)object2);
                    ((StringBuilder)object6).append((String)object3);
                    ((StringBuilder)object6).append((String)object7);
                    object6 = ((StringBuilder)object6).toString();
                    zzhi.zze((String)object6);
                    continue;
                }
                object6 = ((zzqz)object6).zzk();
                ((HashMap)object4).put(object3, object6);
            }
            object3 = object4;
        }
        object = object[0];
        objectArray = "body";
        object = ((zzqo)object).zzb((String)objectArray);
        object2 = zzqs.zze;
        if (object == object2 || (bl3 = object instanceof zzqz)) {
            bl3 = true;
        } else {
            bl3 = false;
            objectArray = null;
        }
        Preconditions.checkArgument(bl3);
        if (object != object2) {
            object = (zzqz)object;
            iterator2 = ((zzqz)object).zzk();
        }
        object = iterator2;
        bl3 = string3.equals(string2);
        if ((bl3 || (bl3 = string3.equals(objectArray = "HEAD"))) && object != null) {
            objectArray = new StringBuilder("Body of ");
            objectArray.append(string3);
            object6 = " hit will be ignored: ";
            objectArray.append((String)object6);
            objectArray.append((String)object);
            objectArray.append((String)object7);
            objectArray = objectArray.toString();
            zzhi.zze((String)objectArray);
        }
        objectArray = this.zzb;
        object6 = object5;
        string2 = string3;
        iterator2 = iterator;
        object4 = object3;
        object7 = object;
        objectArray.zzb((String)object5, string3, (String)((Object)iterator), (Map)object3, (String)object);
        objectArray = new Object[5];
        objectArray[0] = object5;
        objectArray[n3] = string3;
        objectArray[2] = iterator;
        objectArray[3] = object3;
        objectArray[4] = object;
        zzhi.zzd(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", objectArray));
        return object2;
    }
}

