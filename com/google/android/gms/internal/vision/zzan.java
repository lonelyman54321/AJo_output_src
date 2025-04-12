/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzad;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzaf;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzt;

public final class zzan
extends zzt {
    private final zzam zza;

    public zzan(Context context, zzam zzam2) {
        super(context, "TextNativeHandle", "ocr");
        this.zza = zzam2;
        this.zzd();
    }

    public final /* synthetic */ Object zza(DynamiteModule object, Context object2) {
        Object object3;
        boolean bl2;
        object3 = (object = ((DynamiteModule)object).instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")) == null ? null : ((bl2 = (object3 = object.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator")) instanceof zzaf) ? (zzaf)object3 : new zzae((IBinder)object));
        if (object3 == null) {
            return null;
        }
        object = ObjectWrapper.wrap(object2);
        object2 = (zzam)Preconditions.checkNotNull(this.zza);
        return object3.zza((IObjectWrapper)object, (zzam)object2);
    }

    public final void zza() {
        ((zzad)Preconditions.checkNotNull((zzad)this.zzd())).zzb();
    }

    public final zzah[] zza(Bitmap object, zzs zzs2, zzaj zzaj2) {
        boolean bl2 = this.zzb();
        if (!bl2) {
            return new zzah[0];
        }
        try {
            object = ObjectWrapper.wrap(object);
        }
        catch (RemoteException remoteException) {
            return new zzah[0];
        }
        Object object2 = this.zzd();
        object2 = (zzad)object2;
        object2 = Preconditions.checkNotNull(object2);
        object2 = (zzad)object2;
        return object2.zza((IObjectWrapper)object, zzs2, zzaj2);
    }
}

