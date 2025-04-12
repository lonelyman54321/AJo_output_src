/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ki3$c
implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public ki3$c(int n3, int n4, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "from");
        Intrinsics.checkNotNullParameter(string3, "to");
        this.a = n3;
        this.b = n4;
        this.c = string2;
        this.d = string3;
    }

    public final int compareTo(Object object) {
        object = (ki3$c)object;
        String string2 = "other";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((ki3$c)object).a;
        int n4 = this.a - n3;
        if (n4 == 0) {
            n3 = this.b;
            int n7 = ((ki3$c)object).b;
            n4 = n3 - n7;
        }
        return n4;
    }
}

