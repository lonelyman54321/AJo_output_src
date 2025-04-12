/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Gs3$b {
    public final String a;
    public final int b;
    public final List c;
    public final byte[] d;

    public Gs3$b(int n3, String string2, int n4, ArrayList arrayList, byte[] byArray) {
        this.a = string2;
        this.b = n4;
        List list = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.c = list;
        this.d = byArray;
    }

    public final int a() {
        int n3 = this.b;
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }
}

