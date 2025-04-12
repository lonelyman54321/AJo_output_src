/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.accompanist.insets;

import android.view.View;
import com.google.accompanist.insets.RootWindowInsets;
import com.google.accompanist.insets.ViewWindowInsetObserver;
import com.google.accompanist.insets.WindowInsetsKt$ProvideWindowInsets$1$invoke$$inlined$onDispose$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class WindowInsetsKt$ProvideWindowInsets$1
extends Lambda
implements Function1 {
    final /* synthetic */ boolean $consumeWindowInsets;
    final /* synthetic */ View $view;
    final /* synthetic */ RootWindowInsets $windowInsets;
    final /* synthetic */ boolean $windowInsetsAnimationsEnabled;

    public WindowInsetsKt$ProvideWindowInsets$1(View view, RootWindowInsets rootWindowInsets, boolean bl2, boolean bl3) {
        this.$view = view;
        this.$windowInsets = rootWindowInsets;
        this.$consumeWindowInsets = bl2;
        this.$windowInsetsAnimationsEnabled = bl3;
        super(1);
    }

    public final Cr0 invoke(Dr0 object) {
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        Object object2 = this.$view;
        object = new ViewWindowInsetObserver((View)object2);
        object2 = this.$windowInsets;
        boolean bl2 = this.$consumeWindowInsets;
        boolean bl3 = this.$windowInsetsAnimationsEnabled;
        ((ViewWindowInsetObserver)object).observeInto$insets_release((RootWindowInsets)object2, bl2, bl3);
        object2 = new WindowInsetsKt$ProvideWindowInsets$1$invoke$$inlined$onDispose$1((ViewWindowInsetObserver)object);
        return object2;
    }
}

