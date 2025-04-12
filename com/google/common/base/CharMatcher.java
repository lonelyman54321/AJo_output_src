/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher$1;
import com.google.common.base.CharMatcher$And;
import com.google.common.base.CharMatcher$Any;
import com.google.common.base.CharMatcher$AnyOf;
import com.google.common.base.CharMatcher$Ascii;
import com.google.common.base.CharMatcher$BitSetMatcher;
import com.google.common.base.CharMatcher$BreakingWhitespace;
import com.google.common.base.CharMatcher$Digit;
import com.google.common.base.CharMatcher$ForPredicate;
import com.google.common.base.CharMatcher$InRange;
import com.google.common.base.CharMatcher$Invisible;
import com.google.common.base.CharMatcher$Is;
import com.google.common.base.CharMatcher$IsEither;
import com.google.common.base.CharMatcher$IsNot;
import com.google.common.base.CharMatcher$JavaDigit;
import com.google.common.base.CharMatcher$JavaIsoControl;
import com.google.common.base.CharMatcher$JavaLetter;
import com.google.common.base.CharMatcher$JavaLetterOrDigit;
import com.google.common.base.CharMatcher$JavaLowerCase;
import com.google.common.base.CharMatcher$JavaUpperCase;
import com.google.common.base.CharMatcher$Negated;
import com.google.common.base.CharMatcher$None;
import com.google.common.base.CharMatcher$Or;
import com.google.common.base.CharMatcher$SingleWidth;
import com.google.common.base.CharMatcher$Whitespace;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.SmallCharMatcher;
import java.util.BitSet;

public abstract class CharMatcher
implements Predicate {
    private static final int DISTINCT_CHARS = 65536;

    public static /* synthetic */ String access$100(char c2) {
        return CharMatcher.showCharacter(c2);
    }

    public static CharMatcher any() {
        return CharMatcher$Any.INSTANCE;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int n3 = charSequence.length();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                int n7 = 2;
                if (n3 != n7) {
                    CharMatcher$AnyOf charMatcher$AnyOf = new CharMatcher$AnyOf(charSequence);
                    return charMatcher$AnyOf;
                }
                n3 = charSequence.charAt(0);
                char c2 = charSequence.charAt(n4);
                return CharMatcher.isEither((char)n3, c2);
            }
            return CharMatcher.is(charSequence.charAt(0));
        }
        return CharMatcher.none();
    }

    public static CharMatcher ascii() {
        return CharMatcher$Ascii.INSTANCE;
    }

    public static CharMatcher breakingWhitespace() {
        return CharMatcher$BreakingWhitespace.INSTANCE;
    }

    public static CharMatcher digit() {
        return CharMatcher$Digit.INSTANCE;
    }

    private String finishCollapseFrom(CharSequence charSequence, int n3, int n4, char c2, StringBuilder stringBuilder, boolean bl2) {
        while (n3 < n4) {
            char c3 = charSequence.charAt(n3);
            boolean bl3 = this.matches(c3);
            if (bl3) {
                if (!bl2) {
                    stringBuilder.append(c2);
                    bl2 = true;
                }
            } else {
                stringBuilder.append(c3);
                bl2 = false;
            }
            ++n3;
        }
        return stringBuilder.toString();
    }

    public static CharMatcher forPredicate(Predicate predicate) {
        boolean bl2 = predicate instanceof CharMatcher;
        if (bl2) {
            predicate = (CharMatcher)predicate;
        } else {
            CharMatcher$ForPredicate charMatcher$ForPredicate = new CharMatcher$ForPredicate(predicate);
            predicate = charMatcher$ForPredicate;
        }
        return predicate;
    }

    public static CharMatcher inRange(char c2, char c3) {
        CharMatcher$InRange charMatcher$InRange = new CharMatcher$InRange(c2, c3);
        return charMatcher$InRange;
    }

    public static CharMatcher invisible() {
        return CharMatcher$Invisible.INSTANCE;
    }

    public static CharMatcher is(char c2) {
        CharMatcher$Is charMatcher$Is = new CharMatcher$Is(c2);
        return charMatcher$Is;
    }

    private static CharMatcher$IsEither isEither(char c2, char c3) {
        CharMatcher$IsEither charMatcher$IsEither = new CharMatcher$IsEither(c2, c3);
        return charMatcher$IsEither;
    }

    public static CharMatcher isNot(char c2) {
        CharMatcher$IsNot charMatcher$IsNot = new CharMatcher$IsNot(c2);
        return charMatcher$IsNot;
    }

    private static boolean isSmall(int n3, int n4) {
        int n7 = 1023;
        n3 = n3 <= n7 && n4 > (n3 *= 64) ? 1 : 0;
        return n3 != 0;
    }

    public static CharMatcher javaDigit() {
        return CharMatcher$JavaDigit.INSTANCE;
    }

    public static CharMatcher javaIsoControl() {
        return CharMatcher$JavaIsoControl.INSTANCE;
    }

    public static CharMatcher javaLetter() {
        return CharMatcher$JavaLetter.INSTANCE;
    }

    public static CharMatcher javaLetterOrDigit() {
        return CharMatcher$JavaLetterOrDigit.INSTANCE;
    }

    public static CharMatcher javaLowerCase() {
        return CharMatcher$JavaLowerCase.INSTANCE;
    }

    public static CharMatcher javaUpperCase() {
        return CharMatcher$JavaUpperCase.INSTANCE;
    }

    public static CharMatcher none() {
        return CharMatcher$None.INSTANCE;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return CharMatcher.anyOf(charSequence).negate();
    }

    private static CharMatcher precomputedPositive(int n3, BitSet bitSet, String string2) {
        if (n3 != 0) {
            int n4 = 0;
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 != n7) {
                    CharMatcher charMatcher;
                    n4 = bitSet.length();
                    if ((n3 = (int)(CharMatcher.isSmall(n3, n4) ? 1 : 0)) != 0) {
                        charMatcher = SmallCharMatcher.from(bitSet, string2);
                    } else {
                        n4 = 0;
                        charMatcher = new CharMatcher$BitSetMatcher(bitSet, string2, null);
                    }
                    return charMatcher;
                }
                n3 = (char)bitSet.nextSetBit(0);
                int n8 = n3 + 1;
                char c2 = (char)bitSet.nextSetBit(n8);
                return CharMatcher.isEither((char)n3, c2);
            }
            return CharMatcher.is((char)bitSet.nextSetBit(0));
        }
        return CharMatcher.none();
    }

    private static String showCharacter(char c2) {
        int n3 = 6;
        char[] cArray = new char[n3];
        cArray[0] = 92;
        cArray[1] = 117;
        cArray[2] = '\u0000';
        cArray[3] = '\u0000';
        int n4 = 4;
        cArray[n4] = '\u0000';
        int n7 = 5;
        cArray[n7] = '\u0000';
        for (int i3 = 0; i3 < n4; ++i3) {
            n7 = 5 - i3;
            int n8 = c2 & 0xF;
            String string2 = "0123456789ABCDEF";
            cArray[n7] = n8 = (int)string2.charAt(n8);
            c2 = (char)(c2 >> n4);
        }
        return String.copyValueOf(cArray);
    }

    public static CharMatcher singleWidth() {
        return CharMatcher$SingleWidth.INSTANCE;
    }

    public static CharMatcher whitespace() {
        return CharMatcher$Whitespace.INSTANCE;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        CharMatcher$And charMatcher$And = new CharMatcher$And(this, charMatcher);
        return charMatcher$And;
    }

    public boolean apply(Character c2) {
        char c3 = c2.charValue();
        return this.matches(c3);
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int n3 = charSequence.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char c3;
            int n4;
            block3: {
                block4: {
                    n4 = charSequence.charAt(i3);
                    c3 = this.matches((char)n4);
                    if (c3 == '\u0000') continue;
                    if (n4 != c2) break block3;
                    n4 = n3 + -1;
                    if (i3 == n4) break block4;
                    n4 = i3 + 1;
                    n4 = charSequence.charAt(n4);
                    if ((n4 = (int)(this.matches((char)n4) ? 1 : 0)) != 0) break block3;
                }
                ++i3;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder(n3);
            stringBuilder.append(charSequence, 0, i3);
            stringBuilder.append(c2);
            n4 = i3 + 1;
            c3 = c2;
            return this.finishCollapseFrom(charSequence, n4, n3, c2, stringBuilder, true);
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = charSequence.length()); ++i3) {
            n3 = charSequence.charAt(i3);
            if ((n3 = (int)(this.matches((char)n3) ? 1 : 0)) == 0) continue;
            ++n4;
        }
        return n4;
    }

    public int indexIn(CharSequence charSequence) {
        return this.indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        Preconditions.checkPositionIndex(n3, n4);
        while (n3 < n4) {
            char c2 = charSequence.charAt(n3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) != '\u0000') {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int i3 = charSequence.length() + -1; i3 >= 0; i3 += -1) {
            char c2 = charSequence.charAt(i3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) == '\u0000') continue;
            return i3;
        }
        return -1;
    }

    public abstract boolean matches(char var1);

    public boolean matchesAllOf(CharSequence charSequence) {
        int n3 = charSequence.length();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            char c2 = charSequence.charAt(n3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) == '\u0000') {
                return false;
            }
            n3 += -1;
        }
        return n4 != 0;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return this.matchesNoneOf(charSequence) ^ true;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        int n3;
        int n4 = this.indexIn(charSequence);
        if (n4 == (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            charSequence = null;
        }
        return n4 != 0;
    }

    public CharMatcher negate() {
        CharMatcher$Negated charMatcher$Negated = new CharMatcher$Negated(this);
        return charMatcher$Negated;
    }

    public CharMatcher or(CharMatcher charMatcher) {
        CharMatcher$Or charMatcher$Or = new CharMatcher$Or(this, charMatcher);
        return charMatcher$Or;
    }

    public CharMatcher precomputed() {
        return Platform.precomputeCharMatcher(this);
    }

    public CharMatcher precomputedInternal() {
        Object object = new BitSet();
        this.setBits((BitSet)object);
        int n3 = ((BitSet)object).cardinality();
        int n4 = n3 * 2;
        int n7 = 65536;
        if (n4 <= n7) {
            String string2 = this.toString();
            return CharMatcher.precomputedPositive(n3, (BitSet)object, string2);
        }
        n4 = 0;
        String string3 = null;
        ((BitSet)object).flip(0, n7);
        n7 -= n3;
        String string4 = this.toString();
        Object object2 = ".negate()";
        boolean bl2 = string4.endsWith((String)object2);
        if (bl2) {
            int n8 = string4.length() + -9;
            string3 = string4.substring(0, n8);
        } else {
            string3 = string4.concat((String)object2);
        }
        object = CharMatcher.precomputedPositive(n7, (BitSet)object, string3);
        object2 = new CharMatcher$1(this, (CharMatcher)object, string4);
        return object2;
    }

    public String removeFrom(CharSequence object) {
        int n3;
        int n4 = this.indexIn((CharSequence)(object = object.toString()));
        if (n4 == (n3 = -1)) {
            return object;
        }
        object = ((String)object).toCharArray();
        n3 = 1;
        int n7 = 1;
        block0: while (true) {
            n4 += n3;
            while (true) {
                Object object2;
                char c2;
                if (n4 == (c2 = ((Object)object).length)) {
                    String string2 = new String((char[])object, 0, n4 -= n7);
                    return string2;
                }
                c2 = (char)object[n4];
                if ((c2 = (char)(this.matches(c2) ? 1 : 0)) != '\u0000') {
                    ++n7;
                    continue block0;
                }
                c2 = (char)(n4 - n7);
                object[c2] = object2 = object[n4];
                ++n4;
            }
            break;
        }
    }

    public String replaceFrom(CharSequence object, char c2) {
        char c3;
        int n3 = this.indexIn((CharSequence)(object = object.toString()));
        if (n3 == (c3 = -1)) {
            return object;
        }
        object = ((String)object).toCharArray();
        object[n3] = c2;
        while (++n3 < (c3 = ((Object)object).length)) {
            c3 = (char)object[n3];
            if ((c3 = (char)(this.matches(c3) ? 1 : 0)) == '\u0000') continue;
            object[n3] = c2;
        }
        String string2 = new String((char[])object);
        return string2;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int n3;
        int n4 = charSequence2.length();
        if (n4 == 0) {
            return this.removeFrom(charSequence);
        }
        int n7 = 0;
        int n8 = 1;
        if (n4 == n8) {
            char c2 = charSequence2.charAt(0);
            return this.replaceFrom(charSequence, c2);
        }
        n4 = this.indexIn(charSequence = charSequence.toString());
        if (n4 == (n3 = -1)) {
            return charSequence;
        }
        int n10 = ((String)charSequence).length();
        int n14 = 2;
        int n15 = 16;
        int n16 = zy_2.a(n10, 3, n14, n15);
        StringBuilder stringBuilder = new StringBuilder(n16);
        do {
            stringBuilder.append(charSequence, n7, n4);
            stringBuilder.append(charSequence2);
        } while ((n4 = this.indexIn(charSequence, n7 = n4 + 1)) != n3);
        stringBuilder.append(charSequence, n7, n10);
        return stringBuilder.toString();
    }

    public String retainFrom(CharSequence charSequence) {
        return this.negate().removeFrom(charSequence);
    }

    public void setBits(BitSet bitSet) {
        for (int i3 = (int)-1; i3 >= 0; i3 += -1) {
            char c2 = (char)i3;
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) == '\u0000') continue;
            bitSet.set(i3);
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int n3;
        int n4 = charSequence.length();
        int n7 = n4 + -1;
        char c3 = '\u0000';
        for (n3 = 0; n3 < n4; ++n3) {
            c3 = charSequence.charAt(n3);
            if ((c3 = (char)(this.matches(c3) ? 1 : 0)) == '\u0000') break;
        }
        for (n4 = n7; n4 > n3; n4 += -1) {
            c3 = charSequence.charAt(n4);
            if ((c3 = (char)(this.matches(c3) ? 1 : 0)) == '\u0000') break;
        }
        if (n3 == 0 && n4 == n7) {
            charSequence = this.collapseFrom(charSequence, c2);
        } else {
            int n8 = n4 + 1;
            n4 = n8 - n3;
            StringBuilder stringBuilder = new StringBuilder(n4);
            charSequence = this.finishCollapseFrom(charSequence, n3, n8, c2, stringBuilder, false);
        }
        return charSequence;
    }

    public String trimFrom(CharSequence charSequence) {
        char c2;
        int n3;
        int n4 = charSequence.length();
        for (n3 = 0; n3 < n4; ++n3) {
            c2 = charSequence.charAt(n3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) == '\u0000') break;
        }
        n4 += -1;
        while (n4 > n3) {
            c2 = charSequence.charAt(n4);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) == '\u0000') break;
            n4 += -1;
        }
        return charSequence.subSequence(n3, ++n4).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int n3 = charSequence.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = charSequence.charAt(i3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) != '\u0000') continue;
            return charSequence.subSequence(i3, n3).toString();
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int i3 = charSequence.length() + -1; i3 >= 0; i3 += -1) {
            char c2 = charSequence.charAt(i3);
            if ((c2 = (char)(this.matches(c2) ? 1 : 0)) != '\u0000') continue;
            return charSequence.subSequence(0, ++i3).toString();
        }
        return "";
    }
}

