/*
 * Decompiled with CFR 0.152.
 */
public final class Rl2$b
extends Rl2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Rl2$b(int n3, int n4, int n7, int n8) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof Rl2$b;
        if (n3 == 0) return 0 != 0;
        object = (Rl2$b)object;
        int n4 = this.a;
        n3 = ((Rl2$b)object).a;
        if (n4 != n3) return 0 != 0;
        n3 = this.b;
        n4 = ((Rl2$b)object).b;
        if (n3 != n4) return 0 != 0;
        n3 = this.c;
        n4 = ((Rl2$b)object).c;
        if (n3 != n4) return 0 != 0;
        n3 = this.d;
        int n7 = ((Rl2$b)object).d;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = this.b;
        n3 += n4;
        n4 = this.c;
        n3 += n4;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(" items (\n                    |   startIndex: ");
        int n4 = this.a;
        m10.a(stringBuilder, n4, "\n                    |   dropCount: ", n3, "\n                    |   newPlaceholdersBefore: ");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |   oldPlaceholdersBefore: ");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |)\n                    |");
        return ee3_2.c(stringBuilder.toString());
    }
}

