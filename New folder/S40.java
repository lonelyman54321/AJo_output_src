/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

public final class S40 {
    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "label");
        Trace.beginSection((String)gp3_0.c(string2));
    }

    public final void b() {
        Trace.endSection();
    }

    public final boolean c() {
        return gp3_0.b();
    }
}

