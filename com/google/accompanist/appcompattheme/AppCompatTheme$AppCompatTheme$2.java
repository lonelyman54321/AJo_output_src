/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.accompanist.appcompattheme;

import android.content.Context;
import com.google.accompanist.appcompattheme.AppCompatTheme;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class AppCompatTheme$AppCompatTheme$2
extends Lambda
implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $readColors;
    final /* synthetic */ boolean $readTypography;
    final /* synthetic */ A13 $shapes;

    public AppCompatTheme$AppCompatTheme$2(Context context, boolean bl2, boolean bl3, A13 a13, Function2 function2, int n3, int n4) {
        this.$context = context;
        this.$readColors = bl2;
        this.$readTypography = bl3;
        this.$shapes = a13;
        this.$content = function2;
        this.$$changed = n3;
        this.$$default = n4;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        Context context = this.$context;
        boolean bl2 = this.$readColors;
        boolean bl3 = this.$readTypography;
        A13 a13 = this.$shapes;
        Function2 function2 = this.$content;
        int n4 = Me3.b(this.$$changed | 1);
        int n7 = this.$$default;
        AppCompatTheme.AppCompatTheme(context, bl2, bl3, a13, function2, b30_02, n4, n7);
    }
}

