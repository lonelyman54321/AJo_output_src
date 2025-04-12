/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult;

final class zzk
implements DynamiteModule$VersionPolicy {
    /*
     * Unable to fully structure code
     */
    public final DynamiteModule$VersionPolicy$SelectionResult selectModule(Context var1_1, String var2_2, DynamiteModule$VersionPolicy$IVersions var3_3) {
        var4_4 = new DynamiteModule$VersionPolicy$SelectionResult();
        var4_4.localVersion = var5_5 = var3_3.zza(var1_1, var2_2);
        var5_5 = 1;
        var4_4.remoteVersion = var6_6 = var3_3.zzb(var1_1, var2_2, (boolean)var5_5);
        var7_7 = var4_4.localVersion;
        if (var7_7 != 0) ** GOTO lbl-1000
        var7_7 = 0;
        var2_2 = null;
        if (var6_6 == 0) {
            var5_5 = 0;
        } else if (var6_6 < var7_7) {
            var5_5 = -1;
        }
        var4_4.selection = var5_5;
        return var4_4;
    }
}

