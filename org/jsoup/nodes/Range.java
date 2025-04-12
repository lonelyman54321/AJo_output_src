/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range$Position;

public class Range {
    static final Range Untracked;
    private static final Range$Position UntrackedPos;
    private final Range$Position end;
    private final Range$Position start;

    static {
        Range range;
        Range$Position range$Position;
        int n3 = -1;
        UntrackedPos = range$Position = new Range$Position(n3, n3, n3);
        Untracked = range = new Range(range$Position, range$Position);
    }

    public Range(Range$Position range$Position, Range$Position range$Position2) {
        this.start = range$Position;
        this.end = range$Position2;
    }

    public static /* synthetic */ Range$Position access$100() {
        return UntrackedPos;
    }

    public static Range of(Node object, boolean bl2) {
        String string2 = bl2 ? "jsoup.start" : "jsoup.end";
        boolean bl3 = ((Node)object).hasAttributes();
        if (!bl3) {
            return Untracked;
        }
        object = (object = ((Node)object).attributes().userData(string2)) != null ? (Range)object : Untracked;
        return object;
    }

    public Range$Position end() {
        return this.end;
    }

    public int endPos() {
        return Range$Position.access$000(this.end);
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        Range$Position range$Position = null;
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            object = (Range)object;
            object3 = this.start;
            object2 = ((Range)object).start;
            boolean bl2 = ((Range$Position)object3).equals(object2);
            if (!bl2) {
                return false;
            }
            range$Position = this.end;
            object = ((Range)object).end;
            return range$Position.equals(object);
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.start.hashCode() * 31;
        return this.end.hashCode() + n3;
    }

    public boolean isImplicit() {
        boolean bl2 = this.isTracked();
        if (!bl2) {
            return false;
        }
        Range$Position range$Position = this.start;
        Range$Position range$Position2 = this.end;
        return range$Position.equals(range$Position2);
    }

    public boolean isTracked() {
        boolean bl2;
        Range range = Untracked;
        if (this != range) {
            bl2 = true;
        } else {
            bl2 = false;
            range = null;
        }
        return bl2;
    }

    public Range$Position start() {
        return this.start;
    }

    public int startPos() {
        return Range$Position.access$000(this.start);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Range$Position range$Position = this.start;
        stringBuilder.append(range$Position);
        stringBuilder.append("-");
        range$Position = this.end;
        stringBuilder.append(range$Position);
        return stringBuilder.toString();
    }

    public void track(Node node, boolean bl2) {
    }
}

