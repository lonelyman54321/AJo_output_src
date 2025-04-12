/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.b;

public final class cU1$f
extends cU1 {
    public final Object a(Bundle object, String string2) {
        object = bU1.b("bundle", string2, "key", object, string2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    public final String b() {
        return "integer";
    }

    public final Object d(String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "value");
        String string3 = null;
        String string4 = "0x";
        int n4 = kotlin.text.b.s(string2, string4, false);
        if (n4 != 0) {
            string2 = string2.substring(2);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            n4 = CharsKt.checkRadix(16);
            n3 = Integer.parseInt(string2, n4);
        } else {
            n3 = Integer.parseInt(string2);
        }
        return n3;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        int n3 = ((Number)object).intValue();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putInt(string2, n3);
    }
}

