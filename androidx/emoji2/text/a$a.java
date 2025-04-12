/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 */
package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

public class a$a {
    public Signature[] a(PackageManager packageManager, String string2) {
        return packageManager.getPackageInfo((String)string2, (int)64).signatures;
    }
}

