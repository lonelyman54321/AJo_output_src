/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Range;

public class Range$Position {
    private final int columnNumber;
    private final int lineNumber;
    private final int pos;

    public Range$Position(int n3, int n4, int n7) {
        this.pos = n3;
        this.lineNumber = n4;
        this.columnNumber = n7;
    }

    public static /* synthetic */ int access$000(Range$Position range$Position) {
        return range$Position.pos;
    }

    public int columnNumber() {
        return this.columnNumber;
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        Class<?> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = this.getClass()) == (clazz = object.getClass())) {
            object = (Range$Position)object;
            int n3 = this.pos;
            int n4 = ((Range$Position)object).pos;
            if (n3 != n4) {
                return false;
            }
            n3 = this.lineNumber;
            n4 = ((Range$Position)object).lineNumber;
            if (n3 != n4) {
                return false;
            }
            n3 = this.columnNumber;
            int n7 = ((Range$Position)object).columnNumber;
            if (n3 != n7) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.pos * 31;
        int n4 = this.lineNumber;
        n3 = (n3 + n4) * 31;
        n4 = this.columnNumber;
        return n3 + n4;
    }

    public boolean isTracked() {
        boolean bl2;
        Range$Position range$Position = Range.access$100();
        if (this != range$Position) {
            bl2 = true;
        } else {
            bl2 = false;
            range$Position = null;
        }
        return bl2;
    }

    public int lineNumber() {
        return this.lineNumber;
    }

    public int pos() {
        return this.pos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.lineNumber;
        stringBuilder.append(n3);
        stringBuilder.append(",");
        n3 = this.columnNumber;
        stringBuilder.append(n3);
        stringBuilder.append(":");
        n3 = this.pos;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

