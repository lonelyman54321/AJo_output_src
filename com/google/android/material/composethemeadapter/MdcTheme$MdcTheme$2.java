/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.material.composethemeadapter;

import android.content.Context;
import com.google.android.material.composethemeadapter.MdcTheme;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class MdcTheme$MdcTheme$2
extends Lambda
implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $readColors;
    final /* synthetic */ boolean $readShapes;
    final /* synthetic */ boolean $readTypography;
    final /* synthetic */ boolean $setDefaultFontFamily;
    final /* synthetic */ boolean $setTextColors;

    public MdcTheme$MdcTheme$2(Context context, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, Function2 function2, int n3, int n4) {
        this.$context = context;
        this.$readColors = bl2;
        this.$readTypography = bl3;
        this.$readShapes = bl4;
        this.$setTextColors = bl5;
        this.$setDefaultFontFamily = bl6;
        this.$content = function2;
        this.$$changed = n3;
        this.$$default = n4;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        Context context = this.$context;
        boolean bl2 = this.$readColors;
        boolean bl3 = this.$readTypography;
        boolean bl4 = this.$readShapes;
        boolean bl5 = this.$setTextColors;
        boolean bl6 = this.$setDefaultFontFamily;
        Function2 function2 = this.$content;
        int n4 = this.$$changed | 1;
        int n7 = this.$$default;
        MdcTheme.MdcTheme(context, bl2, bl3, bl4, bl5, bl6, function2, b30_02, n4, n7);
    }
}

