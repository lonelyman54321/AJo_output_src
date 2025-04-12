/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class yg3$b$a {
    public final Context a;
    public String b;
    public yg3$a c;

    public yg3$b$a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final yg3$b a() {
        yg3$a yg3$a = this.c;
        if (yg3$a != null) {
            yg3$b yg3$b;
            String string2 = this.b;
            Context context = this.a;
            yg3$b yg3$b2 = yg3$b;
            yg3$b = new yg3$b(context, string2, yg3$a, false, false);
            return yg3$b;
        }
        String string3 = "Must set a callback to create the configuration.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }
}

