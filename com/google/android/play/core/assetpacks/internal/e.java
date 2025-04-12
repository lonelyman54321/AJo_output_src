/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.assetpacks.internal.b;
import com.google.android.play.core.assetpacks.internal.d;
import com.google.android.play.core.assetpacks.internal.f;

public abstract class e
extends b
implements f {
    public static f b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        boolean bl2 = iInterface instanceof f;
        if (bl2) {
            return (f)iInterface;
        }
        iInterface = new d(iBinder);
        return iInterface;
    }
}

