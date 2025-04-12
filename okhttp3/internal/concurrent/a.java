/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;

public final class a {
    public static final void a(ri3_1 object, b object2, String string2) {
        int n3 = 1;
        Logger logger = c.i;
        StringBuilder stringBuilder = new StringBuilder();
        object2 = object2.b;
        stringBuilder.append((String)object2);
        stringBuilder.append(' ');
        object2 = StringCompanionObject.INSTANCE;
        object2 = new Object[n3];
        object2[0] = string2;
        object2 = Arrays.copyOf(object2, n3);
        object2 = String.format("%-22s", object2);
        Intrinsics.checkNotNullExpressionValue(object2, "format(format, *args)");
        stringBuilder.append((String)object2);
        stringBuilder.append(": ");
        object = ((ri3_1)object).a;
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        logger.fine((String)object);
    }

    public static final String b(long l2) {
        String string2;
        int n3 = 1;
        long l3 = 3295467296L;
        String string3 = " s ";
        int n4 = 1000000000;
        int n7 = 500000000;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            long l4 = n7;
            l2 -= l4;
            long l7 = n4;
            string2 = jl0_0.b(stringBuilder, l2 /= l7, string3);
        } else {
            l3 = 4293967796L;
            String string4 = " ms";
            int n8 = 1000000;
            int n10 = 500000;
            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 <= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                long l8 = n10;
                l2 -= l8;
                l8 = n8;
                string2 = jl0_0.b(stringBuilder, l2 /= l8, string4);
            } else {
                l3 = 0L;
                String string5 = " \u00b5s";
                int n14 = 1000;
                int n15 = 500;
                Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (object3 <= 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    long l12 = n15;
                    l2 -= l12;
                    l12 = n14;
                    string2 = jl0_0.b(stringBuilder, l2 /= l12, string5);
                } else {
                    l3 = 999500L;
                    long l14 = l2 - l3;
                    object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object3 < 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        long l15 = n15;
                        l2 += l15;
                        l15 = n14;
                        string2 = jl0_0.b(stringBuilder, l2 /= l15, string5);
                    } else {
                        l3 = 999500000L;
                        long l16 = l2 - l3;
                        object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object2 < 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            long l17 = n10;
                            l2 += l17;
                            l17 = n8;
                            string2 = jl0_0.b(stringBuilder, l2 /= l17, string4);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            long l18 = n7;
                            l2 += l18;
                            long l19 = n4;
                            string2 = jl0_0.b(stringBuilder, l2 /= l19, string3);
                        }
                    }
                }
            }
        }
        Object[] objectArray = StringCompanionObject.INSTANCE;
        objectArray = new Object[n3];
        objectArray[0] = string2;
        return xh2_0.a(objectArray, n3, "%6s", "format(format, *args)");
    }
}

