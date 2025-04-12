/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Editable$Factory
 */
import android.text.Editable;

public final class Ny0
extends Editable.Factory {
    public static final Object a;
    public static volatile Ny0 b;
    public static Class c;

    static {
        Object object;
        a = object = new Object();
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class clazz = c;
        if (clazz != null) {
            W93 w93 = new W93(clazz, charSequence);
            return w93;
        }
        return super.newEditable(charSequence);
    }
}

