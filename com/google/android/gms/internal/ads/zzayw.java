/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzazs;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzayw
extends zzazs {
    public zzayw(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzatp2, n3, 24);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzc() {
        Object object;
        Object object2 = this.zzb.zzh();
        if (object2 == null) {
            return;
        }
        try {
            Object object3;
            Object object4;
            object2 = ((AdvertisingIdClient)object2).getInfo();
            object = ((AdvertisingIdClient$Info)object2).getId();
            int n3 = zzayh.zza;
            if (object != null && (n3 = (int)(((String)object).matches((String)(object4 = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) ? 1 : 0)) != 0) {
                object = UUID.fromString((String)object);
                n3 = 16;
                object4 = new byte[n3];
                object3 = ByteBuffer.wrap((byte[])object4);
                long l2 = ((UUID)object).getMostSignificantBits();
                ((ByteBuffer)object3).putLong(l2);
                l2 = ((UUID)object).getLeastSignificantBits();
                ((ByteBuffer)object3).putLong(l2);
                boolean bl2 = true;
                object = zzavo.zza((byte[])object4, bl2);
            }
            if (object == null) return;
            object4 = this.zze;
            synchronized (object4) {
                object3 = this.zze;
                ((zzatp)object3).zzt((String)object);
            }
        }
        catch (IOException iOException) {
            return;
        }
        {
            object = this.zze;
            boolean bl3 = ((AdvertisingIdClient$Info)object2).isLimitAdTrackingEnabled();
            ((zzatp)object).zzs(bl3);
            object2 = this.zze;
            object = zzatx.zzf;
            ((zzatp)object2).zzu((zzatx)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzb;
        boolean bl2 = ((zzaye)object).zzq();
        if (!bl2) {
            object = this.zze;
            synchronized (object) {
                zzatp zzatp2 = this.zze;
                Object object2 = this.zzf;
                zzaye zzaye2 = this.zzb;
                zzaye2 = zzaye2.zzb();
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = zzaye2;
                zzaye2 = null;
                object2 = ((Method)object2).invoke(null, objectArray);
                object2 = (String)object2;
                zzatp2.zzt((String)object2);
                return;
            }
        }
        this.zzc();
    }

    public final Void zzl() {
        zzaye zzaye2 = this.zzb;
        boolean bl2 = zzaye2.zzr();
        if (bl2) {
            super.zzl();
            return null;
        }
        zzaye2 = this.zzb;
        bl2 = zzaye2.zzq();
        if (bl2) {
            this.zzc();
        }
        return null;
    }
}

