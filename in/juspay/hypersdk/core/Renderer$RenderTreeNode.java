/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package in.juspay.hypersdk.core;

import android.view.View;
import android.view.ViewGroup;

class Renderer$RenderTreeNode {
    View itself;
    ViewGroup parent;

    public Renderer$RenderTreeNode(ViewGroup viewGroup, View view) {
        this.parent = viewGroup;
        this.itself = view;
    }
}

