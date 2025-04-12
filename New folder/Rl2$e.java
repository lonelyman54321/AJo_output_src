/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Rl2$e
extends Rl2 {
    public final us2_0 a;
    public final us2_0 b;

    public Rl2$e(pk2_0 pk2_02, us2_0 us2_02) {
        Intrinsics.checkNotNullParameter(pk2_02, "newList");
        Intrinsics.checkNotNullParameter(us2_02, "previousList");
        this.a = pk2_02;
        this.b = us2_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3;
        int n4;
        int n7 = object instanceof Rl2$e;
        if (n7 == 0) return 0 != 0;
        us2_0 us2_02 = this.a;
        int n8 = us2_02.b();
        object = (Rl2$e)object;
        us2_0 us2_03 = ((Rl2$e)object).a;
        int n10 = us2_03.b();
        if (n8 != n10) return 0 != 0;
        n8 = us2_02.c();
        if (n8 != (n4 = (us2_03 = ((Rl2$e)object).a).c())) return 0 != 0;
        n8 = us2_02.getSize();
        if (n8 != (n4 = us2_03.getSize())) return 0 != 0;
        n7 = us2_02.a();
        if (n7 != (n8 = us2_03.a())) return 0 != 0;
        us2_02 = this.b;
        n8 = us2_02.b();
        if (n8 != (n10 = (object = ((Rl2$e)object).b).b())) return 0 != 0;
        n8 = us2_02.c();
        if (n8 != (n10 = object.c())) return 0 != 0;
        n8 = us2_02.getSize();
        if (n8 != (n10 = object.getSize())) return 0 != 0;
        n7 = us2_02.a();
        if (n7 != (n3 = object.a())) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        us2_0 us2_02 = this.a;
        int n3 = us2_02.b();
        stringBuilder.append(n3);
        String string2 = "\n                    |       placeholdersAfter: ";
        stringBuilder.append(string2);
        int n4 = us2_02.c();
        stringBuilder.append(n4);
        String string3 = "\n                    |       size: ";
        stringBuilder.append(string3);
        int n7 = us2_02.getSize();
        stringBuilder.append(n7);
        String string4 = "\n                    |       dataCount: ";
        stringBuilder.append(string4);
        int n8 = us2_02.a();
        stringBuilder.append(n8);
        stringBuilder.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        us2_02 = this.b;
        int n10 = us2_02.b();
        stringBuilder.append(n10);
        stringBuilder.append(string2);
        n3 = us2_02.c();
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        n3 = us2_02.getSize();
        stringBuilder.append(n3);
        stringBuilder.append(string4);
        n8 = us2_02.a();
        stringBuilder.append(n8);
        stringBuilder.append("\n                    |   )\n                    |");
        return ee3_2.c(stringBuilder.toString());
    }
}

