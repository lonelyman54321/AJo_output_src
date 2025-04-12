/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;

final class MediaType$Tokenizer {
    final String input;
    int position = 0;

    public MediaType$Tokenizer(String string2) {
        this.input = string2;
    }

    public char consumeCharacter(char c2) {
        Preconditions.checkState(this.hasMore());
        int n3 = this.previewChar();
        int n4 = 1;
        n3 = n3 == c2 ? 1 : 0;
        Preconditions.checkState(n3 != 0);
        this.position = n3 = this.position + n4;
        return c2;
    }

    public char consumeCharacter(CharMatcher charMatcher) {
        int n3;
        Preconditions.checkState(this.hasMore());
        char c2 = this.previewChar();
        Preconditions.checkState(charMatcher.matches(c2));
        this.position = n3 = this.position + 1;
        return c2;
    }

    public String consumeToken(CharMatcher object) {
        int n3 = this.position;
        object = this.consumeTokenIfPresent((CharMatcher)object);
        int n4 = this.position;
        n3 = n4 != n3 ? 1 : 0;
        Preconditions.checkState(n3 != 0);
        return object;
    }

    public String consumeTokenIfPresent(CharMatcher object) {
        int n3;
        Preconditions.checkState(this.hasMore());
        int n4 = this.position;
        object = ((CharMatcher)object).negate();
        String string2 = this.input;
        this.position = n3 = ((CharMatcher)object).indexIn(string2, n4);
        n3 = (int)(this.hasMore() ? 1 : 0);
        if (n3 != 0) {
            object = this.input;
            int n7 = this.position;
            object = ((String)object).substring(n4, n7);
        } else {
            object = this.input.substring(n4);
        }
        return object;
    }

    public boolean hasMore() {
        String string2;
        int n3;
        int n4 = this.position;
        n4 = n4 >= 0 && n4 < (n3 = (string2 = this.input).length()) ? 1 : 0;
        return n4 != 0;
    }

    public char previewChar() {
        Preconditions.checkState(this.hasMore());
        String string2 = this.input;
        int n3 = this.position;
        return string2.charAt(n3);
    }
}

