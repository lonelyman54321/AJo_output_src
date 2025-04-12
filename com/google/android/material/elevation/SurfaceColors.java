/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 */
package com.google.android.material.elevation;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;

public final class SurfaceColors
extends Enum {
    private static final /* synthetic */ SurfaceColors[] $VALUES;
    public static final /* enum */ SurfaceColors SURFACE_0;
    public static final /* enum */ SurfaceColors SURFACE_1;
    public static final /* enum */ SurfaceColors SURFACE_2;
    public static final /* enum */ SurfaceColors SURFACE_3;
    public static final /* enum */ SurfaceColors SURFACE_4;
    public static final /* enum */ SurfaceColors SURFACE_5;
    private final int elevationResId;

    static {
        SurfaceColors surfaceColors;
        SurfaceColors surfaceColors2;
        SurfaceColors surfaceColors3;
        SurfaceColors surfaceColors4;
        SurfaceColors surfaceColors5;
        SurfaceColors surfaceColors6;
        int n3 = R$dimen.m3_sys_elevation_level0;
        SURFACE_0 = surfaceColors6 = new SurfaceColors("SURFACE_0", 0, n3);
        int n4 = 1;
        int n7 = R$dimen.m3_sys_elevation_level1;
        SURFACE_1 = surfaceColors5 = new SurfaceColors("SURFACE_1", n4, n7);
        int n8 = 2;
        int n10 = R$dimen.m3_sys_elevation_level2;
        SURFACE_2 = surfaceColors4 = new SurfaceColors("SURFACE_2", n8, n10);
        int n14 = 3;
        int n15 = R$dimen.m3_sys_elevation_level3;
        SURFACE_3 = surfaceColors3 = new SurfaceColors("SURFACE_3", n14, n15);
        int n16 = 4;
        int n17 = R$dimen.m3_sys_elevation_level4;
        SURFACE_4 = surfaceColors2 = new SurfaceColors("SURFACE_4", n16, n17);
        int n18 = 5;
        int n19 = R$dimen.m3_sys_elevation_level5;
        SURFACE_5 = surfaceColors = new SurfaceColors("SURFACE_5", n18, n19);
        SurfaceColors[] surfaceColorsArray = new SurfaceColors[6];
        surfaceColorsArray[0] = surfaceColors6;
        surfaceColorsArray[n4] = surfaceColors5;
        surfaceColorsArray[n8] = surfaceColors4;
        surfaceColorsArray[n14] = surfaceColors3;
        surfaceColorsArray[n16] = surfaceColors2;
        surfaceColorsArray[n18] = surfaceColors;
        $VALUES = surfaceColorsArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SurfaceColors() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.elevationResId = var3_2;
    }

    public static int getColorForElevation(Context context, float f5) {
        ElevationOverlayProvider elevationOverlayProvider = new ElevationOverlayProvider(context);
        int n3 = R$attr.colorSurface;
        int n4 = MaterialColors.getColor(context, n3, 0);
        return elevationOverlayProvider.compositeOverlay(n4, f5);
    }

    public static SurfaceColors valueOf(String string2) {
        return Enum.valueOf(SurfaceColors.class, string2);
    }

    public static SurfaceColors[] values() {
        return (SurfaceColors[])$VALUES.clone();
    }

    public int getColor(Context context) {
        Resources resources = context.getResources();
        int n3 = this.elevationResId;
        float f5 = resources.getDimension(n3);
        return SurfaceColors.getColorForElevation(context, f5);
    }
}

