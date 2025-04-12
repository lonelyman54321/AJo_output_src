/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

final class ExpandedPair {
    private final FinderPattern finderPattern;
    private final DataCharacter leftChar;
    private final boolean mayBeLast;
    private final DataCharacter rightChar;

    public ExpandedPair(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean bl2) {
        this.leftChar = dataCharacter;
        this.rightChar = dataCharacter2;
        this.finderPattern = finderPattern;
        this.mayBeLast = bl2;
    }

    private static boolean equalsOrNull(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    private static int hashNotNull(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ExpandedPair;
        if (!bl3) {
            return false;
        }
        object = (ExpandedPair)object;
        Object object2 = this.leftChar;
        DataCharacter dataCharacter = ((ExpandedPair)object).leftChar;
        bl3 = ExpandedPair.equalsOrNull(object2, dataCharacter);
        return bl3 && (bl3 = ExpandedPair.equalsOrNull(object2 = this.rightChar, dataCharacter = ((ExpandedPair)object).rightChar)) && (bl2 = ExpandedPair.equalsOrNull(object2 = this.finderPattern, object = ((ExpandedPair)object).finderPattern));
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public DataCharacter getLeftChar() {
        return this.leftChar;
    }

    public DataCharacter getRightChar() {
        return this.rightChar;
    }

    public int hashCode() {
        int n3 = ExpandedPair.hashNotNull(this.leftChar);
        int n4 = ExpandedPair.hashNotNull(this.rightChar);
        n3 ^= n4;
        n4 = ExpandedPair.hashNotNull(this.finderPattern);
        return n3 ^ n4;
    }

    public boolean mayBeLast() {
        return this.mayBeLast;
    }

    public boolean mustBeLast() {
        DataCharacter dataCharacter = this.rightChar;
        return dataCharacter == null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        Object object = this.leftChar;
        stringBuilder.append(object);
        stringBuilder.append(" , ");
        object = this.rightChar;
        stringBuilder.append(object);
        stringBuilder.append(" : ");
        object = this.finderPattern;
        if (object == null) {
            object = "null";
        } else {
            int n3 = ((FinderPattern)object).getValue();
            object = n3;
        }
        return fK.a(stringBuilder, object, " ]");
    }
}

