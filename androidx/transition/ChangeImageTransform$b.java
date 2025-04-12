/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.util.Property
 *  android.widget.ImageView
 */
package androidx.transition;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public final class ChangeImageTransform$b
extends Property {
    public final void set(Object object, Object object2) {
        object = (ImageView)object;
        object2 = (Matrix)object2;
        Pe1.a((ImageView)object, (Matrix)object2);
    }
}

