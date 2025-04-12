/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.FloatProperty
 */
import android.util.FloatProperty;

public abstract class jS0 {
    final String mPropertyName;

    public jS0(String string2) {
        this.mPropertyName = string2;
    }

    public static jS0 createFloatPropertyCompat(FloatProperty floatProperty) {
        String string2 = gS0.a(floatProperty);
        js0$a_0 js0$a_0 = new js0$a_0(string2, floatProperty);
        return js0$a_0;
    }

    public abstract float getValue(Object var1);

    public abstract void setValue(Object var1, float var2);
}

