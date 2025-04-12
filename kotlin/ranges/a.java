/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.a$a;

public class a
implements Iterable,
KMappedMarker {
    public static final a$a d;
    public final char a;
    public final char b;
    public final int c;

    static {
        a$a a$a;
        d = a$a = new a$a(null);
    }

    public a(char c2, char c3) {
        this.a = c2;
        int n3 = 1;
        this.b = c2 = (char)vb2_1.a(c2, c3, n3);
        this.c = n3;
    }

    public final Iterator iterator() {
        int n3 = this.c;
        char c2 = this.a;
        char c3 = this.b;
        is_2 is_22 = new is_2(c2, c3, n3);
        return is_22;
    }
}

