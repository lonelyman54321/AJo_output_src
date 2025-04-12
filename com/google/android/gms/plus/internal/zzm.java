/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.view.View
 */
package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.plus.PlusOneDummyView;
import com.google.android.gms.plus.internal.zzd;
import com.google.android.gms.plus.internal.zze;

public final class zzm
extends RemoteCreator {
    private static final zzm zzz;

    static {
        zzm zzm2;
        zzz = zzm2 = new zzm();
    }

    private zzm() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static View zza(Context var0, int var1_1, int var2_2, String var3_3, int var4_4) {
        block11: {
            if (var3_3 == null) break block11;
            var5_5 = zzm.zzz;
            var6_6 = var5_5 = var5_5.getRemoteCreatorInstance(var0);
            var6_6 = (zzd)var5_5;
            var7_7 = ObjectWrapper.wrap(var0);
            var8_8 /* !! */  = var6_6.zza(var7_7, var1_1, var2_2, var3_3, var4_4);
            var8_8 /* !! */  = ObjectWrapper.unwrap((IObjectWrapper)var8_8 /* !! */ );
            var8_8 /* !! */  = (View)var8_8 /* !! */ ;
            ** GOTO lbl25
        }
        try {
            var8_8 /* !! */  = new NullPointerException();
            throw var8_8 /* !! */ ;
        }
        catch (Exception v0) {
            ** continue;
        }
lbl23:
        // 1 sources

        while (true) {
            var8_8 /* !! */  = new PlusOneDummyView(var0, var1_1);
lbl25:
            // 2 sources

            return var8_8 /* !! */ ;
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        boolean bl2 = iInterface instanceof zzd;
        if (bl2) {
            return (zzd)iInterface;
        }
        iInterface = new zze(iBinder);
        return iInterface;
    }
}

