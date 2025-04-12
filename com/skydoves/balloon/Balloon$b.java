/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.a;
import com.skydoves.balloon.c;
import com.skydoves.balloon.d;

public final class Balloon$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;
    public static final /* synthetic */ int[] $EnumSwitchMapping$5;
    public static final /* synthetic */ int[] $EnumSwitchMapping$6;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        c c2;
        int n3;
        Enum enum_;
        int n4;
        int n7;
        int n8;
        int n10 = a.values().length;
        int[] nArray = new int[n10];
        int n14 = 1;
        try {
            a a2 = a.BOTTOM;
            n8 = a2.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            a a3 = a.TOP;
            n7 = a3.ordinal();
            nArray[n7] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            a a4 = a.START;
            n4 = a4.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 4;
        try {
            enum_ = a.END;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n10 = xp_2.values().length;
        nArray = new int[n10];
        try {
            enum_ = xp_2.ALIGN_BALLOON;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = xp_2.ALIGN_ANCHOR;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n10 = vu_2.values().length;
        nArray = new int[n10];
        try {
            enum_ = vu_2.ELASTIC;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = vu_2.CIRCULAR;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = vu_2.FADE;
            n3 = enum_.ordinal();
            nArray[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = vu_2.OVERSHOOT;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            int n15;
            enum_ = vu_2.NONE;
            n3 = enum_.ordinal();
            nArray[n3] = n15 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
        n10 = av_2.values().length;
        nArray = new int[n10];
        try {
            enum_ = av_2.FADE;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$3 = nArray;
        n10 = wu_2.values().length;
        nArray = new int[n10];
        try {
            enum_ = wu_2.HEARTBEAT;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = wu_2.SHAKE;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = wu_2.BREATH;
            n3 = enum_.ordinal();
            nArray[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = wu_2.ROTATE;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$4 = nArray;
        n10 = d.values().length;
        nArray = new int[n10];
        try {
            enum_ = d.TOP;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = d.BOTTOM;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = d.START;
            n3 = enum_.ordinal();
            nArray[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = d.END;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$5 = nArray;
        n10 = c.values().length;
        nArray = new int[n10];
        try {
            enum_ = c.TOP;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c2 = c.BOTTOM;
            n14 = c2.ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c2 = c.END;
            n14 = c2.ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c2 = c.START;
            n14 = c2.ordinal();
            nArray[n14] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$6 = nArray;
    }
}

