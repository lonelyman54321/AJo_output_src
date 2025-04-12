/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult;

public interface DynamiteModule$VersionPolicy {
    public DynamiteModule$VersionPolicy$SelectionResult selectModule(Context var1, String var2, DynamiteModule$VersionPolicy$IVersions var3);
}

