/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzhg;
import com.google.android.gms.internal.gtm.zzjb;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcp;

public class TagManagerServiceProviderImpl
extends zzcp {
    private static volatile zzjb zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzhg getService(IObjectWrapper object, zzck zzck2, zzcb zzcb2) {
        zzjb zzjb2 = zza;
        if (zzjb2 != null) return zzjb2;
        Class<TagManagerServiceProviderImpl> clazz = TagManagerServiceProviderImpl.class;
        synchronized (clazz) {
            try {
                zzjb2 = zza;
                if (zzjb2 != null) return zzjb2;
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                object = (Context)object;
                zza = zzjb2 = new zzjb((Context)object, zzck2, zzcb2);
                return zzjb2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

