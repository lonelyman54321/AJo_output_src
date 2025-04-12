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

final class zzg
implements DynamiteModule$VersionPolicy {
    public final DynamiteModule$VersionPolicy$SelectionResult selectModule(Context context, String string2, DynamiteModule$VersionPolicy$IVersions dynamiteModule$VersionPolicy$IVersions) {
        int n3;
        DynamiteModule$VersionPolicy$SelectionResult dynamiteModule$VersionPolicy$SelectionResult = new DynamiteModule$VersionPolicy$SelectionResult();
        dynamiteModule$VersionPolicy$SelectionResult.localVersion = n3 = dynamiteModule$VersionPolicy$IVersions.zza(context, string2);
        if (n3 != 0) {
            int n4;
            dynamiteModule$VersionPolicy$SelectionResult.selection = n4 = -1;
        } else {
            int n7;
            n3 = 1;
            dynamiteModule$VersionPolicy$SelectionResult.remoteVersion = n7 = dynamiteModule$VersionPolicy$IVersions.zzb(context, string2, n3 != 0);
            if (n7 != 0) {
                dynamiteModule$VersionPolicy$SelectionResult.selection = n3;
            }
        }
        return dynamiteModule$VersionPolicy$SelectionResult;
    }
}

