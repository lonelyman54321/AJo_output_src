/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad.targeting;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class a {
    public static boolean a(String string2, ArrayList object) {
        boolean bl2;
        boolean bl3 = true;
        int n3 = 2;
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            Object object2;
            String string3 = (String)object.next();
            Object object3 = new StringBuilder("^");
            Object object4 = new String[]{","};
            int n4 = 6;
            object4 = StringsKt.a0(string2, (String[])object4, false, 0, n4);
            int n7 = yx_2.o((Iterable)object4, 10);
            Object object5 = new ArrayList(n7);
            object4 = object4.iterator();
            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object2 = ((Object)StringsKt.m0((String)object4.next())).toString();
                ((ArrayList)object5).add(object2);
            }
            int n8 = 0;
            fo0_2 fo0_22 = null;
            int n10 = 62;
            object4 = CollectionsKt.R(object5, "|", null, null, null, n10);
            object5 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(object5, "getDefault(...)");
            object4 = ((String)object4).toUpperCase((Locale)object5);
            Intrinsics.checkNotNullExpressionValue(object4, "this as java.lang.String).toUpperCase(locale)");
            ((StringBuilder)object3).append((String)object4);
            int n14 = 36;
            ((StringBuilder)object3).append((char)n14);
            object3 = ((StringBuilder)object3).toString();
            object4 = new bi2_2[n3];
            object4[0] = object5 = bi2_2.IGNORE_CASE;
            object4[bl3] = object5 = bi2_2.MULTILINE;
            object4 = p03_0.f((Object[])object4);
            Intrinsics.checkNotNullParameter(object3, "pattern");
            Intrinsics.checkNotNullParameter(object4, "options");
            object2 = Regex.b;
            object4 = ((Iterable)object4).iterator();
            int n15 = 0;
            while ((n8 = object4.hasNext()) != 0) {
                fo0_22 = (fo0_2)object4.next();
                n8 = fo0_22.getValue();
                n15 |= n8;
            }
            object2.getClass();
            n14 = n15 & 2;
            if (n14 != 0) {
                n15 |= 0x40;
            }
            object3 = Pattern.compile((String)object3, n15);
            object4 = "compile(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object5 = new Regex((Pattern)object3);
            bl2 = ((Regex)object5).c(string3);
            if (!bl2) continue;
            return bl3;
        }
        return false;
    }
}

