/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class hX0
implements yg3$c {
    public final yg3_1 a(yg3$b yg3$b) {
        Intrinsics.checkNotNullParameter(yg3$b, "configuration");
        String string2 = yg3$b.b;
        yg3$a yg3$a = yg3$b.c;
        Context context = yg3$b.a;
        boolean bl2 = yg3$b.d;
        boolean bl3 = yg3$b.e;
        fx0_0 fx0_02 = new fx0_0(context, string2, yg3$a, bl2, bl3);
        return fx0_02;
    }
}

