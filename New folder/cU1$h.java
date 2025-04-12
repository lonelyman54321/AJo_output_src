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

public final class cU1$h
extends cU1 {
    public final Object a(Bundle object, String string2) {
        object = bU1.b("bundle", string2, "key", object, string2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object;
    }

    public final String b() {
        return "long";
    }

    public final Object d(String string2) {
        long l2;
        Intrinsics.checkNotNullParameter(string2, "value");
        String string3 = "L";
        int n3 = kotlin.text.b.h(string2, string3, false);
        String string4 = "substring(...)";
        if (n3 != 0) {
            n3 = string2.length() + -1;
            string3 = string2.substring(0, n3);
            Intrinsics.checkNotNullExpressionValue(string3, string4);
        } else {
            string3 = string2;
        }
        String string5 = "0x";
        int n4 = kotlin.text.b.s(string2, string5, false);
        if (n4 != 0) {
            n4 = 2;
            string2 = string3.substring(n4);
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            n3 = CharsKt.checkRadix(16);
            l2 = Long.parseLong(string2, n3);
        } else {
            l2 = Long.parseLong(string3);
        }
        return l2;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        long l2 = ((Number)object).longValue();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putLong(string2, l2);
    }
}

