/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.native.renderer;

import android.view.ViewGroup;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdViewRenderer c;
    public final /* synthetic */ ArrayList d;

    public y(NativeAdViewRenderer nativeAdViewRenderer, ArrayList arrayList) {
        this.c = nativeAdViewRenderer;
        this.d = arrayList;
        super(0);
    }

    public final Object invoke() {
        NativeAdViewRenderer nativeAdViewRenderer = this.c;
        ViewGroup viewGroup = nativeAdViewRenderer.getContainerView();
        ArrayList arrayList = this.d;
        NativeAdViewRenderer.access$registerViewForInteraction(nativeAdViewRenderer, viewGroup, arrayList);
        return Unit.a;
    }
}

