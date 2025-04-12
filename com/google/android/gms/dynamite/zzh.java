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

final class zzh
implements DynamiteModule$VersionPolicy {
    public final DynamiteModule$VersionPolicy$SelectionResult selectModule(Context context, String string2, DynamiteModule$VersionPolicy$IVersions dynamiteModule$VersionPolicy$IVersions) {
        int n3;
        DynamiteModule$VersionPolicy$SelectionResult dynamiteModule$VersionPolicy$SelectionResult = new DynamiteModule$VersionPolicy$SelectionResult();
        int n4 = 0;
        dynamiteModule$VersionPolicy$SelectionResult.remoteVersion = n3 = dynamiteModule$VersionPolicy$IVersions.zzb(context, string2, false);
        if (n3 != 0) {
            n4 = 1;
        }
        dynamiteModule$VersionPolicy$SelectionResult.selection = n4;
        return dynamiteModule$VersionPolicy$SelectionResult;
    }
}

