/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Path
 */
package com.google.android.material.drawable;

import android.graphics.Outline;
import android.graphics.Path;

class DrawableUtils$OutlineCompatL {
    private DrawableUtils$OutlineCompatL() {
    }

    public static void setConvexPath(Outline outline, Path path) {
        outline.setConvexPath(path);
    }
}

