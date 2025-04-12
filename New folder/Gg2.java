/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Path
 */
import android.graphics.Outline;
import android.graphics.Path;

public final class Gg2 {
    public static final Gg2 a;

    static {
        Gg2 gg2;
        a = gg2 = new Object();
    }

    public final void a(Outline object, gn2 gn22) {
        boolean bl2 = gn22 instanceof ki;
        if (bl2) {
            gn22 = ((ki)gn22).a;
            fg2_0.a(object, (Path)gn22);
            return;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw object;
    }
}

