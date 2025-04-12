/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import java.lang.reflect.Method;

public final class zzf {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void zza(Throwable throwable, Throwable throwable2) {
        Class[] classArray;
        int n3 = 1;
        Object object = Throwable.class;
        String string2 = "addSuppressed";
        try {
            classArray = new Class[n3];
        }
        catch (Exception exception) {
            return;
        }
        classArray[0] = object;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = throwable2;
        ((Method)object).invoke((Object)throwable, objectArray);
    }
}

