/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.p$b;
import androidx.navigation.q;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class q$a {
    public static String a(Class object) {
        Intrinsics.checkNotNullParameter(object, "navigatorClass");
        Serializable serializable = q.b;
        Object object2 = (String)serializable.get(object);
        if (object2 == null) {
            int n3;
            object2 = ((Class)object).getAnnotation(p$b.class);
            object2 = object2 != null ? object2.value() : null;
            if (object2 != null && (n3 = ((String)object2).length()) > 0) {
                serializable.put(object, object2);
            } else {
                object = ((Class)object).getSimpleName();
                object = "No @Navigator.Name annotation found for ".concat((String)object);
                object = object.toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
        }
        Intrinsics.checkNotNull(object2);
        return object2;
    }
}

