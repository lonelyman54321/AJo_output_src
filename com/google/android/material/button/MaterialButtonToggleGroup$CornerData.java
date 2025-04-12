/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.button;

import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;

class MaterialButtonToggleGroup$CornerData {
    private static final CornerSize noCorner;
    CornerSize bottomLeft;
    CornerSize bottomRight;
    CornerSize topLeft;
    CornerSize topRight;

    static {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(0.0f);
        noCorner = absoluteCornerSize;
    }

    public MaterialButtonToggleGroup$CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topLeft = cornerSize;
        this.topRight = cornerSize3;
        this.bottomRight = cornerSize4;
        this.bottomLeft = cornerSize2;
    }

    public static MaterialButtonToggleGroup$CornerData bottom(MaterialButtonToggleGroup$CornerData object) {
        CornerSize cornerSize = noCorner;
        CornerSize cornerSize2 = ((MaterialButtonToggleGroup$CornerData)object).bottomLeft;
        object = ((MaterialButtonToggleGroup$CornerData)object).bottomRight;
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = new MaterialButtonToggleGroup$CornerData(cornerSize, cornerSize2, cornerSize, (CornerSize)object);
        return materialButtonToggleGroup$CornerData;
    }

    public static MaterialButtonToggleGroup$CornerData end(MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData, View view) {
        boolean bl2 = ViewUtils.isLayoutRtl(view);
        materialButtonToggleGroup$CornerData = bl2 ? MaterialButtonToggleGroup$CornerData.left(materialButtonToggleGroup$CornerData) : MaterialButtonToggleGroup$CornerData.right(materialButtonToggleGroup$CornerData);
        return materialButtonToggleGroup$CornerData;
    }

    public static MaterialButtonToggleGroup$CornerData left(MaterialButtonToggleGroup$CornerData object) {
        CornerSize cornerSize = ((MaterialButtonToggleGroup$CornerData)object).topLeft;
        object = ((MaterialButtonToggleGroup$CornerData)object).bottomLeft;
        CornerSize cornerSize2 = noCorner;
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = new MaterialButtonToggleGroup$CornerData(cornerSize, (CornerSize)object, cornerSize2, cornerSize2);
        return materialButtonToggleGroup$CornerData;
    }

    public static MaterialButtonToggleGroup$CornerData right(MaterialButtonToggleGroup$CornerData object) {
        CornerSize cornerSize = noCorner;
        CornerSize cornerSize2 = ((MaterialButtonToggleGroup$CornerData)object).topRight;
        object = ((MaterialButtonToggleGroup$CornerData)object).bottomRight;
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = new MaterialButtonToggleGroup$CornerData(cornerSize, cornerSize, cornerSize2, (CornerSize)object);
        return materialButtonToggleGroup$CornerData;
    }

    public static MaterialButtonToggleGroup$CornerData start(MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData, View view) {
        boolean bl2 = ViewUtils.isLayoutRtl(view);
        materialButtonToggleGroup$CornerData = bl2 ? MaterialButtonToggleGroup$CornerData.right(materialButtonToggleGroup$CornerData) : MaterialButtonToggleGroup$CornerData.left(materialButtonToggleGroup$CornerData);
        return materialButtonToggleGroup$CornerData;
    }

    public static MaterialButtonToggleGroup$CornerData top(MaterialButtonToggleGroup$CornerData object) {
        CornerSize cornerSize = ((MaterialButtonToggleGroup$CornerData)object).topLeft;
        CornerSize cornerSize2 = noCorner;
        object = ((MaterialButtonToggleGroup$CornerData)object).topRight;
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = new MaterialButtonToggleGroup$CornerData(cornerSize, cornerSize2, (CornerSize)object, cornerSize2);
        return materialButtonToggleGroup$CornerData;
    }
}

