/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class Zv2 {
    public int a;
    public long[] b;

    public final void a(long l2) {
        int n3 = this.b(l2);
        if (n3 == 0) {
            n3 = this.a;
            long[] lArray = this.b;
            int n4 = lArray.length;
            if (n3 >= n4) {
                n4 = n3 + 1;
                int n7 = lArray.length * 2;
                n4 = Math.max(n4, n7);
                lArray = Arrays.copyOf(lArray, n4);
                String string2 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(lArray, string2);
                this.b = lArray;
            }
            lArray = this.b;
            lArray[n3] = l2;
            int n8 = this.a;
            if (n3 >= n8) {
                this.a = ++n3;
            }
        }
    }

    public final boolean b(long l2) {
        int n3 = this.a;
        for (int i3 = 0; i3 < n3; ++i3) {
            long[] lArray = this.b;
            long l3 = lArray[i3];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) continue;
            return true;
        }
        return false;
    }

    public final void c(int n3) {
        int n4 = this.a;
        if (n3 < n4) {
            n4 += -1;
            while (n3 < n4) {
                long l2;
                long[] lArray = this.b;
                int n7 = n3 + 1;
                lArray[n3] = l2 = lArray[n7];
                n3 = n7;
            }
            this.a = n3 = this.a + -1;
        }
    }
}

