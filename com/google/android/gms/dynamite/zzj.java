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

final class zzj
implements DynamiteModule$VersionPolicy {
    public final DynamiteModule$VersionPolicy$SelectionResult selectModule(Context context, String string2, DynamiteModule$VersionPolicy$IVersions dynamiteModule$VersionPolicy$IVersions) {
        int n3;
        DynamiteModule$VersionPolicy$SelectionResult dynamiteModule$VersionPolicy$SelectionResult;
        block3: {
            int n4;
            int n7;
            block2: {
                int n8;
                block1: {
                    int n10;
                    dynamiteModule$VersionPolicy$SelectionResult = new DynamiteModule$VersionPolicy$SelectionResult();
                    dynamiteModule$VersionPolicy$SelectionResult.localVersion = n10 = dynamiteModule$VersionPolicy$IVersions.zza(context, string2);
                    n3 = 1;
                    n7 = 0;
                    dynamiteModule$VersionPolicy$SelectionResult.remoteVersion = n10 != 0 ? (n4 = dynamiteModule$VersionPolicy$IVersions.zzb(context, string2, false)) : (n4 = dynamiteModule$VersionPolicy$IVersions.zzb(context, string2, n3 != 0));
                    n8 = dynamiteModule$VersionPolicy$SelectionResult.localVersion;
                    if (n8 != 0) break block1;
                    if (n4 != 0) break block2;
                    n3 = 0;
                    break block3;
                }
                n7 = n8;
            }
            if (n7 >= n4) {
                n3 = -1;
            }
        }
        dynamiteModule$VersionPolicy$SelectionResult.selection = n3;
        return dynamiteModule$VersionPolicy$SelectionResult;
    }
}

