/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package androidx.appcompat.widget;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

public final class SwitchCompat$a
extends Property {
    public final Object get(Object object) {
        return Float.valueOf(((SwitchCompat)((Object)object)).mThumbPosition);
    }

    public final void set(Object object, Object object2) {
        object = (SwitchCompat)((Object)object);
        float f5 = ((Float)object2).floatValue();
        ((SwitchCompat)((Object)object)).setThumbPosition(f5);
    }
}

