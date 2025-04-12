/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.native.renderer;

import android.view.ViewGroup;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdViewRenderer c;

    public r(NativeAdViewRenderer nativeAdViewRenderer) {
        this.c = nativeAdViewRenderer;
        super(0);
    }

    public final Object invoke() {
        NativeAdViewRenderer nativeAdViewRenderer = this.c;
        NativeAdViewRenderer.access$registerClick(nativeAdViewRenderer);
        ViewGroup viewGroup = nativeAdViewRenderer.getContainerView();
        List list = nativeAdViewRenderer.getClickViewList();
        NativeAdViewRenderer.access$registerViewForInteraction(nativeAdViewRenderer, viewGroup, list);
        return Unit.a;
    }
}

