/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$j
extends cU1 {
    public final Object a(Bundle bundle, String string2) {
        return (String)bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "string";
    }

    public final Object d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        String string3 = "null";
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        if (bl2) {
            string2 = null;
        }
        return string2;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putString(string2, (String)object);
    }

    public final String f(Object object) {
        if ((object = (object = (String)object) != null ? Uri.encode((String)object) : null) == null) {
            object = "null";
        }
        return object;
    }
}

