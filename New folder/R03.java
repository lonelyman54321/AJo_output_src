/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class R03 {
    public int a;
    public final int[] b;

    public R03() {
        int[] nArray = new int[10];
        this.b = nArray;
    }

    public final int a() {
        int n3 = this.a & 0x80;
        if (n3 != 0) {
            int[] nArray = this.b;
            int n4 = 7;
            n3 = nArray[n4];
        } else {
            n3 = (char)-1;
        }
        return n3;
    }

    public final void b(R03 r03) {
        int n3;
        Intrinsics.checkNotNullParameter(r03, "other");
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            n3 = 1 << i3;
            int n4 = r03.a;
            if ((n3 &= n4) == 0) continue;
            int[] nArray = r03.b;
            n3 = nArray[i3];
            this.c(i3, n3);
        }
    }

    public final void c(int n3, int n4) {
        int[] nArray;
        int n7;
        if (n3 >= 0 && n3 < (n7 = (nArray = this.b).length)) {
            n7 = 1 << n3;
            int n8 = this.a;
            this.a = n7 |= n8;
            nArray[n3] = n4;
        }
    }
}

