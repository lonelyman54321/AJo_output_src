/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package androidx.transition;

import android.util.Property;
import androidx.transition.ChangeTransform$e;

public final class ChangeTransform$a
extends Property {
    public final void set(Object object, Object object2) {
        object = (ChangeTransform$e)object;
        object2 = (float[])object2;
        object.getClass();
        int n3 = ((Object)object2).length;
        float[] fArray = ((ChangeTransform$e)object).c;
        System.arraycopy(object2, 0, fArray, 0, n3);
        ((ChangeTransform$e)object).a();
    }
}

