/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class yg3$b {
    public final Context a;
    public final String b;
    public final yg3$a c;
    public final boolean d;
    public final boolean e;

    public yg3$b(Context context, String string2, yg3$a yg3$a, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(yg3$a, "callback");
        this.a = context;
        this.b = string2;
        this.c = yg3$a;
        this.d = bl2;
        this.e = bl3;
    }
}

