/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class CE$d
implements CE$h {
    public final void a(Bundle bundle, String string2, Object object) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        double d2 = (Double)object;
        bundle.putDouble(string2, d2);
    }
}

