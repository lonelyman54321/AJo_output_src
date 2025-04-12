/*
 * Decompiled with CFR 0.152.
 */
public final class Rl2$c
extends Rl2 {
    public final int a;
    public final int b;
    public final int c;

    public Rl2$c(int n3, int n4, int n7) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof Rl2$c;
        if (n3 == 0) return 0 != 0;
        object = (Rl2$c)object;
        int n4 = this.a;
        n3 = ((Rl2$c)object).a;
        if (n4 != n3) return 0 != 0;
        n3 = this.b;
        n4 = ((Rl2$c)object).b;
        if (n3 != n4) return 0 != 0;
        n3 = this.c;
        int n7 = ((Rl2$c)object).c;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = this.b;
        n3 += n4;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int n3 = this.a;
        m10.a(stringBuilder, n3, " items (\n                    |   dropCount: ", n3, "\n                    |   newPlaceholdersBefore: ");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |   oldPlaceholdersBefore: ");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |)\n                    |");
        return ee3_2.c(stringBuilder.toString());
    }
}

