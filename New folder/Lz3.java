/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class Lz3 {
    public static final long a;
    public static final WE2 b;

    static {
        WE2 wE2;
        a = f60.i(0, 0, 0, 0);
        B63 b63 = B63.c;
        b = wE2 = new WE2(b63);
    }

    public static final pe1_0 a(Object object, b30_0 b30_02) {
        Object object2;
        b30_02.u(1087186730);
        boolean bl2 = object instanceof pe1_0;
        if (bl2) {
            object = (pe1_0)object;
            b30_02.I();
            return object;
        }
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        vc3_12 = (Context)b30_02.j(vc3_12);
        b30_02.u(-1245195153);
        boolean bl3 = b30_02.J(vc3_12);
        boolean bl4 = b30_02.J(object);
        Object object3 = b30_02.v();
        if ((bl3 |= bl4) || object3 == (object2 = b30$a.a)) {
            object2 = new pe1$a_0((Context)vc3_12);
            ((pe1$a_0)object2).c = object;
            object3 = ((pe1$a_0)object2).a();
            b30_02.o(object3);
        }
        object3 = (pe1_0)object3;
        b30_02.I();
        b30_02.I();
        return object3;
    }
}

