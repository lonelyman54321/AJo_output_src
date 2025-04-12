/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewConfiguration
 */
import android.view.ViewConfiguration;

public final class Ta3 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final vi0_0 a(b30_0 b30_02) {
        Object object;
        Object object2 = O30.f;
        object2 = (Vo0)b30_02.j((H30)object2);
        float f5 = object2.getDensity();
        boolean bl2 = b30_02.b(f5);
        Object object3 = b30_02.v();
        if (bl2 || object3 == (object = b30$a.a)) {
            object = new Sa3((Vo0)object2);
            object3 = new wi0_0((Sa3)object);
            b30_02.o(object3);
        }
        return (vi0_0)object3;
    }
}

