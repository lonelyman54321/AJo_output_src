/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
package androidx.transition;

import android.graphics.Path;
import androidx.transition.PathMotion;

public final class Transition$a
extends PathMotion {
    public final Path getPath(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7, f8);
        return path;
    }
}

