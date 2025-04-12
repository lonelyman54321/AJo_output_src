/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.ranges.IntRange;
import kotlin.ranges.c;

class CharsKt__CharJVMKt {
    public static int checkRadix(int n3) {
        int n4 = 2;
        int n7 = 36;
        int n8 = 1;
        Object object = new c(n4, n7, n8);
        boolean bl2 = ((IntRange)object).e(n3);
        if (bl2) {
            return n3;
        }
        CharSequence charSequence = wk0_0.a(n3, "radix ", " was not in valid range ");
        IntRange intRange = new c(n4, n7, n8);
        charSequence.append(intRange);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }
}

