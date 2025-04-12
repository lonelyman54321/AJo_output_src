/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.text.CharsKt__CharJVMKt;

public class a
extends CharsKt__CharJVMKt {
    public static final boolean a(char c2, char c3, boolean bl2) {
        boolean bl3 = true;
        if (c2 == c3) {
            return bl3;
        }
        if (!bl2) {
            return false;
        }
        if ((c2 = Character.toUpperCase(c2)) != (c3 = Character.toUpperCase(c3)) && (c2 = Character.toLowerCase(c2)) != (c3 = Character.toLowerCase(c3))) {
            bl3 = false;
        }
        return bl3;
    }
}

