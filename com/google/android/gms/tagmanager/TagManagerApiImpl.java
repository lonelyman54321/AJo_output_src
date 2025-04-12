/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzho;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcm;

public class TagManagerApiImpl
extends zzcm {
    private zzix zza;

    public void initialize(IObjectWrapper object, zzck zzck2, zzcb zzcb2) {
        this.zza = object = zzix.zzf((Context)ObjectWrapper.unwrap((IObjectWrapper)object), zzck2, zzcb2);
        ((zzix)object).zzm(null);
    }

    public void preview(Intent intent, IObjectWrapper iObjectWrapper) {
        zzhi.zze("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzck object, zzcb object2) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        iObjectWrapper2 = (Context)ObjectWrapper.unwrap(iObjectWrapper2);
        this.zza = object = zzix.zzf((Context)iObjectWrapper, (zzck)object, (zzcb)object2);
        object2 = new zzho(intent, (Context)iObjectWrapper, (Context)iObjectWrapper2, (zzix)object);
        ((zzho)object2).zzb();
    }
}

