/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.Container$FunctionCallMacroCallback;
import com.google.android.gms.tagmanager.zzal;
import com.google.android.gms.tagmanager.zzu;
import java.util.Map;

final class zzs
implements zzal {
    final /* synthetic */ Container zza;

    public /* synthetic */ zzs(Container container, zzu zzu2) {
        this.zza = container;
    }

    public final Object zza(String string2, Map map2) {
        Container$FunctionCallMacroCallback container$FunctionCallMacroCallback = this.zza.zza(string2);
        if (container$FunctionCallMacroCallback == null) {
            return null;
        }
        return container$FunctionCallMacroCallback.getValue(string2, map2);
    }
}

