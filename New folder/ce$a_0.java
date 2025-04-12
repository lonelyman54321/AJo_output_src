/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CE$a
 */
public final class ce$a_0
implements CE$h {
    public final void a(Bundle bundle, String string2, Object object) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        boolean bl2 = (Boolean)object;
        bundle.putBoolean(string2, bl2);
    }
}

