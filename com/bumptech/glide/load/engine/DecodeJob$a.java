/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.DecodeJob$g;
import com.bumptech.glide.load.engine.DecodeJob$h;

public final class DecodeJob$a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10 = cz0_0.values().length;
        int[] nArray = new int[n10];
        c = nArray;
        int n14 = 1;
        try {
            object3 = cz0_0.SOURCE;
            n8 = object3.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object3 = c;
            object2 = cz0_0.TRANSFORMED;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (cz0_0)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = DecodeJob$h.values().length;
        object3 = new int[n8];
        b = (int[])object3;
        try {
            object2 = DecodeJob$h.RESOURCE_CACHE;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (cz0_0)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object3 = b;
            object2 = DecodeJob$h.DATA_CACHE;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (cz0_0)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object2 = b;
            enum_ = DecodeJob$h.SOURCE;
            n4 = enum_.ordinal();
            object2[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = DecodeJob$h.FINISHED;
            n4 = enum_.ordinal();
            n3 = 4;
            object2[n4] = n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = DecodeJob$h.INITIALIZE;
            n4 = enum_.ordinal();
            n3 = 5;
            object2[n4] = n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = DecodeJob$g.values().length;
        object2 = new int[n7];
        a = (int[])object2;
        try {
            enum_ = DecodeJob$g.INITIALIZE;
            n4 = enum_.ordinal();
            object2[n4] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = DecodeJob$g.SWITCH_TO_SOURCE_SERVICE;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)DecodeJob$g.DECODE_DATA;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

