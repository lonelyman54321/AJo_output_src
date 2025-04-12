/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$b
extends cU1 {
    public final Object a(Bundle bundle, String string2) {
        return (Boolean)bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "boolean";
    }

    public final Object d(String object) {
        block4: {
            boolean bl2;
            block3: {
                String string2;
                block2: {
                    Intrinsics.checkNotNullParameter(object, "value");
                    string2 = "true";
                    boolean bl3 = Intrinsics.areEqual(object, string2);
                    if (!bl3) break block2;
                    bl2 = true;
                    break block3;
                }
                string2 = "false";
                bl2 = Intrinsics.areEqual(object, string2);
                if (!bl2) break block4;
                bl2 = false;
                object = null;
            }
            return bl2;
        }
        object = new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        throw object;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        boolean bl2 = (Boolean)object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putBoolean(string2, bl2);
    }
}

