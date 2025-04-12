/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzze;
import com.google.android.gms.internal.gtm.zzzg;
import com.google.android.gms.internal.gtm.zzzi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzyh
implements zzadl {
    protected int zzb = 0;

    public static void zzS(Iterable object, List object2) {
        int n3;
        Object object3;
        Object object4 = zzaco.zzb;
        object4 = object;
        object4 = (Collection)object;
        int n4 = object4.size();
        int n7 = object2 instanceof ArrayList;
        if (n7 != 0) {
            object3 = object2;
            object3 = (ArrayList)object2;
            n3 = object2.size() + n4;
            ((ArrayList)object3).ensureCapacity(n3);
        } else {
            n7 = object2 instanceof zzadu;
            if (n7 != 0) {
                object3 = object2;
                object3 = (zzadu)object2;
                n3 = object2.size() + n4;
                ((zzadu)object3).zzf(n3);
            }
        }
        n4 = object2.size();
        object = (List)object;
        n7 = object.size();
        String string2 = null;
        for (n3 = 0; n3 < n7; ++n3) {
            Object e2 = object.get(n3);
            if (e2 == null) {
                int n8 = object2.size() - n4;
                object3 = "Element at index ";
                string2 = " is null.";
                object = Gj0.b(n8, (String)object3, string2);
                n7 = object2.size();
                while ((n7 += -1) >= n4) {
                    object2.remove(n7);
                }
                object2 = new NullPointerException((String)object);
                throw object2;
            }
            object2.add(e2);
        }
    }

    public int zzQ(zzadx zzadx2) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzyx zzR() {
        IOException iOException2;
        block3: {
            Object object;
            try {
                int n3 = this.zzY();
                object = zzyx.zzb;
                object = new byte[n3];
                zzze zzze2 = new zzze((byte[])object, 0, n3);
                this.zzax(zzze2);
                n3 = zzze2.zzb();
                if (n3 == 0) {
                    return new zzyv((byte[])object);
                }
            }
            catch (IOException iOException2) {
                break block3;
            }
            object = "Did not write as much data as expected.";
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        Object object = this.getClass();
        object = ((Class)object).getName();
        object = cP.a("Serializing ", (String)object, " to a ByteString threw an IOException (should never happen).");
        RuntimeException runtimeException = new RuntimeException((String)object, iOException2);
        throw runtimeException;
    }

    public final void zzT(OutputStream outputStream) {
        int n3 = this.zzY();
        int n4 = zzzi.zzf;
        n4 = 4096;
        if (n3 > n4) {
            n3 = 4096;
        }
        zzzg zzzg2 = new zzzg(outputStream, n3);
        this.zzax(zzzg2);
        zzzg2.zzI();
    }
}

