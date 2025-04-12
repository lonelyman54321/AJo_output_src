/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ConsoleMessage$MessageLevel
 */
package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

final class zzchb {
    static final /* synthetic */ int[] zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ConsoleMessage.MessageLevel messageLevel;
        int n7 = ConsoleMessage.MessageLevel.values().length;
        int[] nArray = new int[n7];
        zza = nArray;
        try {
            messageLevel = ConsoleMessage.MessageLevel.ERROR;
            n4 = messageLevel.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            messageLevel = ConsoleMessage.MessageLevel.WARNING;
            n4 = messageLevel.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            messageLevel = ConsoleMessage.MessageLevel.LOG;
            n4 = messageLevel.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            messageLevel = ConsoleMessage.MessageLevel.TIP;
            n4 = messageLevel.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zza;
            messageLevel = ConsoleMessage.MessageLevel.DEBUG;
            n4 = messageLevel.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

