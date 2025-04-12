/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.FloatProperty
 */
import android.util.FloatProperty;

/*
 * Renamed from jS0$a
 */
public final class js0$a_0
extends jS0 {
    public final /* synthetic */ FloatProperty a;

    public js0$a_0(String string2, FloatProperty floatProperty) {
        this.a = floatProperty;
        super(string2);
    }

    public final float getValue(Object object) {
        return ((Float)iS0.a(this.a, object)).floatValue();
    }

    public final void setValue(Object object, float f5) {
        hs0_0.a(this.a, object, f5);
    }
}

