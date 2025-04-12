/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcd;
import com.google.android.gms.internal.clearcut.zzcq;

final class zzcc {
    static final /* synthetic */ int[] zzje;
    static final /* synthetic */ int[] zzjf;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        Enum enum_;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8 = zzcq.values().length;
        int[] nArray = new int[n8];
        zzjf = nArray;
        int n10 = 1;
        try {
            object3 = zzcq.zzle;
            n7 = object3.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            object3 = zzjf;
            object2 = zzcq.zzlg;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (zzcq)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            object2 = zzjf;
            enum_ = zzcq.zzld;
            n3 = enum_.ordinal();
            object2[n3] = (zzcq)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = zzcd.values().length;
        object2 = new int[n4];
        zzje = (int[])object2;
        try {
            enum_ = zzcd.zzjj;
            n3 = enum_.ordinal();
            object2[n3] = (zzcq)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = zzje;
            object2 = zzcd.zzjh;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = zzje;
            object = (Object)zzcd.zzjg;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

