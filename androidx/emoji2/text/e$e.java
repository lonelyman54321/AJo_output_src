/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.g$a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class e$e {
    public int a = 1;
    public final g$a b;
    public g$a c;
    public g$a d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public e$e(g$a a2, boolean bl2, int[] nArray) {
        this.b = a2;
        this.c = a2;
        this.g = bl2;
        this.h = nArray;
    }

    public final void a() {
        g$a a2;
        this.a = 1;
        this.c = a2 = this.b;
        this.f = 0;
    }

    public final boolean b() {
        int n3;
        Object object;
        Object object2 = this.c.b.c();
        int n4 = ((di3_1)object2).a(6);
        boolean bl2 = true;
        if (n4 != 0) {
            object = ((di3_1)object2).b;
            n3 = ((di3_1)object2).a;
            if ((n3 = (int)((ByteBuffer)object).get(n4 += n3)) != 0) {
                return bl2;
            }
        }
        if ((n3 = this.e) == (n4 = 65039)) {
            return bl2;
        }
        n3 = (int)(this.g ? 1 : 0);
        n4 = 0;
        if (n3 != 0) {
            object2 = this.h;
            if (object2 == null) {
                return bl2;
            }
            object = this.c.b;
            int n7 = ((rt3)object).a(0);
            n3 = Arrays.binarySearch((int[])object2, n7);
            if (n3 < 0) {
                return bl2;
            }
        }
        return false;
    }
}

