/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Range;

public class Range$AttributeRange {
    static final Range$AttributeRange UntrackedAttr;
    private final Range nameRange;
    private final Range valueRange;

    static {
        Range$AttributeRange range$AttributeRange;
        Range range = Range.Untracked;
        UntrackedAttr = range$AttributeRange = new Range$AttributeRange(range, range);
    }

    public Range$AttributeRange(Range range, Range range2) {
        this.nameRange = range;
        this.valueRange = range2;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        Range range = null;
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            object = (Range$AttributeRange)object;
            object3 = this.nameRange;
            object2 = ((Range$AttributeRange)object).nameRange;
            boolean bl2 = ((Range)object3).equals(object2);
            if (!bl2) {
                return false;
            }
            range = this.valueRange;
            object = ((Range$AttributeRange)object).valueRange;
            return range.equals(object);
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.nameRange.hashCode() * 31;
        return this.valueRange.hashCode() + n3;
    }

    public Range nameRange() {
        return this.nameRange;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.nameRange().toString();
        stringBuilder.append(string2);
        stringBuilder.append("=");
        string2 = this.valueRange().toString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public Range valueRange() {
        return this.valueRange;
    }
}

