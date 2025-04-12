/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.PathClassLoader
 */
package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class zzc
extends PathClassLoader {
    public zzc(String string2, ClassLoader classLoader) {
        super(string2, classLoader);
    }

    public final Class loadClass(String string2, boolean bl2) {
        String string3 = "java.";
        boolean bl3 = string2.startsWith(string3);
        if (!bl3 && !(bl3 = string2.startsWith(string3 = "android."))) {
            try {
                return ((ClassLoader)((Object)this)).findClass(string2);
            }
            catch (ClassNotFoundException classNotFoundException) {}
        }
        return super.loadClass(string2, bl2);
    }
}

