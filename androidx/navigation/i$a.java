/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 */
package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import androidx.navigation.i;
import androidx.navigation.i$a$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class i$a {
    public static String a(int n3, Context object) {
        String string2;
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object, string3);
        int n4 = 0xFFFFFF;
        if (n3 <= n4) {
            string2 = String.valueOf(n3);
        } else {
            object = object.getResources();
            try {
                string2 = object.getResourceName(n3);
            }
            catch (Resources.NotFoundException notFoundException) {
                string2 = String.valueOf(n3);
            }
            object = "try {\n                  \u2026tring()\n                }";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
        }
        return string2;
    }

    public static Sequence b(i i3) {
        Intrinsics.checkNotNullParameter(i3, "<this>");
        return ez2_1.d(i$a$a.c, i3);
    }
}

