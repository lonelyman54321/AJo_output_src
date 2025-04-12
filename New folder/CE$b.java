/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class CE$b
implements CE$h {
    public final void a(Bundle bundle, String string2, Object object) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        int n3 = (Integer)object;
        bundle.putInt(string2, n3);
    }
}

