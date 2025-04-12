/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 *  android.view.View
 */
import android.util.Property;
import android.view.View;

/*
 * Renamed from eE3$a
 */
public final class ee3$a_0
extends Property {
    public final Object get(Object object) {
        object = (View)object;
        return Float.valueOf(ee3_0.a.a((View)object));
    }

    public final void set(Object object, Object object2) {
        object = (View)object;
        float f5 = ((Float)object2).floatValue();
        ee3_0.b((View)object, f5);
    }
}

