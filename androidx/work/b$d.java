/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b$d
extends Lambda
implements Function1 {
    public static final b$d c;

    static {
        b$d b$d;
        c = b$d = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "<name for destructuring parameter 0>");
        CharSequence charSequence = (String)object.getKey();
        object = object.getValue();
        String string2 = " : ";
        charSequence = nn_2.a((String)charSequence, string2);
        boolean bl2 = object instanceof Object[];
        if (bl2) {
            object = Arrays.toString((Object[])object);
            string2 = "toString(this)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
        ((StringBuilder)charSequence).append(object);
        return ((StringBuilder)charSequence).toString();
    }
}

