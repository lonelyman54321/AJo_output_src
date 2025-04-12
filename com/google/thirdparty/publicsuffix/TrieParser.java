/*
 * Decompiled with CFR 0.152.
 */
package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Queues;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.ArrayDeque;
import java.util.Deque;

final class TrieParser {
    private static final Joiner DIRECT_JOINER = Joiner.on("");

    private static int doParseTrieToBuilder(Deque deque, CharSequence charSequence, int n3, ImmutableMap$Builder immutableMap$Builder) {
        String string2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14 = charSequence.length();
        int n15 = 0;
        int n16 = n3;
        while (true) {
            int n17;
            n10 = 58;
            n8 = 33;
            n7 = 44;
            n4 = 63;
            if (n16 >= n14 || (n15 = charSequence.charAt(n16)) == (n17 = 38) || n15 == n4 || n15 == n8 || n15 == n10 || n15 == n7) break;
            ++n16;
        }
        CharSequence charSequence2 = TrieParser.reverse(charSequence.subSequence(n3, n16));
        deque.push(charSequence2);
        if ((n15 == n8 || n15 == n4 || n15 == n10 || n15 == n7) && (n8 = (string2 = DIRECT_JOINER.join(deque)).length()) > 0) {
            PublicSuffixType publicSuffixType = PublicSuffixType.fromCode((char)n15);
            immutableMap$Builder.put(string2, (Object)publicSuffixType);
        }
        ++n16;
        if (n15 != n4 && n15 != n7) {
            while (n16 < n14) {
                n15 = TrieParser.doParseTrieToBuilder(deque, charSequence, n16, immutableMap$Builder);
                if ((n15 = (int)charSequence.charAt(n16 += n15)) != n4 && (n15 = (int)charSequence.charAt(n16)) != n7) continue;
                ++n16;
                break;
            }
        }
        deque.pop();
        return n16 - n3;
    }

    public static ImmutableMap parseFullString(String string2) {
        int n3;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        int n4 = string2.length();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            ArrayDeque arrayDeque = Queues.newArrayDeque();
            n3 = TrieParser.doParseTrieToBuilder(arrayDeque, string2, i3, immutableMap$Builder);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    public static ImmutableMap parseTrie(CharSequence ... charSequenceArray) {
        return TrieParser.parseFullString(DIRECT_JOINER.join(charSequenceArray));
    }

    private static CharSequence reverse(CharSequence charSequence) {
        StringBuilder stringBuilder = new StringBuilder(charSequence);
        return stringBuilder.reverse();
    }
}

