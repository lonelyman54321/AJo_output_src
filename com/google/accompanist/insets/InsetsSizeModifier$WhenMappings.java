/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.HorizontalSide;
import com.google.accompanist.insets.VerticalSide;

public final class InsetsSizeModifier$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        int n7 = HorizontalSide.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            HorizontalSide horizontalSide = HorizontalSide.Left;
            n4 = horizontalSide.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = HorizontalSide.Right;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n7 = VerticalSide.values().length;
        nArray = new int[n7];
        try {
            enum_ = VerticalSide.Top;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            VerticalSide verticalSide = VerticalSide.Bottom;
            n8 = verticalSide.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
    }
}

