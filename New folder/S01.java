/*
 * Decompiled with CFR 0.152.
 */
import java.text.BreakIterator;

public final class S01
extends k0_0 {
    public final BreakIterator a;

    public S01(CharSequence charSequence) {
        BreakIterator breakIterator = BreakIterator.getCharacterInstance();
        charSequence = ((Object)charSequence).toString();
        breakIterator.setText((String)charSequence);
        this.a = breakIterator;
    }

    public final int U(int n3) {
        return this.a.following(n3);
    }

    public final int V(int n3) {
        return this.a.preceding(n3);
    }
}

