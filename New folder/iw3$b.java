/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.text.PrecomputedTextCompat;

public final class iw3$b
extends iw3$a {
    public final boolean a(CharSequence charSequence) {
        boolean bl2;
        boolean bl3 = jw3.a(charSequence);
        if (!bl3 && !(bl2 = charSequence instanceof PrecomputedTextCompat)) {
            bl2 = false;
            charSequence = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

