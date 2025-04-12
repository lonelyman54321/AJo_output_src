/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$d
extends cU1 {
    public final Object a(Bundle object, String string2) {
        object = bU1.b("bundle", string2, "key", object, string2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        return (Float)object;
    }

    public final String b() {
        return "float";
    }

    public final Object d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return Float.valueOf(Float.parseFloat(string2));
    }

    public final void e(Bundle bundle, String string2, Object object) {
        float f5 = ((Number)object).floatValue();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putFloat(string2, f5);
    }
}

