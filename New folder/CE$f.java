/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class CE$f
implements CE$h {
    public final void a(Bundle object, String string2, Object object2) {
        Intrinsics.checkNotNullParameter(object, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        object = new IllegalArgumentException("Unexpected type from JSON");
        throw object;
    }
}

