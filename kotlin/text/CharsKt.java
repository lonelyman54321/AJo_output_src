/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.text.a;

public final class CharsKt
extends a {
    private CharsKt() {
    }

    public static boolean b(char c2) {
        boolean bl2 = Character.isWhitespace(c2);
        c2 = !bl2 && (c2 = (char)(Character.isSpaceChar(c2) ? 1 : 0)) == '\u0000' ? (char)'\u0000' : '\u0001';
        return c2 != 0;
    }
}

