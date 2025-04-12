/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sR1
 */
public final class sr1_0
extends Ni1 {
    public /* synthetic */ sr1_0() {
        this(16);
    }

    public sr1_0(int n3) {
        int[] nArray = n3 == 0 ? aj1.a : new int[n3];
        this.a = nArray;
    }

    public final void b(int n3) {
        int n4 = this.b + 1;
        this.c(n4);
        int[] nArray = this.a;
        int n7 = this.b;
        nArray[n7] = n3;
        this.b = ++n7;
    }

    public final void c(int n3) {
        Object object = this.a;
        int n4 = ((int[])object).length;
        if (n4 < n3) {
            n4 = ((int[])object).length * 3 / 2;
            n3 = Math.max(n3, n4);
            int[] nArray = Arrays.copyOf(object, n3);
            object = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(nArray, (String)object);
            this.a = nArray;
        }
    }

    public final void d(int n3) {
        int n4;
        block3: {
            int[] nArray = this.a;
            int n7 = this.b;
            for (n4 = 0; n4 < n7; ++n4) {
                int n8 = nArray[n4];
                if (n3 != n8) {
                    continue;
                }
                break block3;
            }
            n4 = -1;
        }
        if (n4 >= 0) {
            this.e(n4);
        }
    }

    public final int e(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.b)) {
            int[] nArray = this.a;
            int n7 = nArray[n3];
            int n8 = n4 + -1;
            if (n3 != n8) {
                n8 = n3 + 1;
                rp_1.f(n3, n8, n4, nArray, nArray);
            }
            this.b = n3 = this.b + -1;
            return n7;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index ", " must be in 0..");
        int n10 = this.b + -1;
        charSequence.append(n10);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void f(int n3, int n4) {
        int n7;
        if (n3 >= 0 && n3 < (n7 = this.b)) {
            int[] nArray = this.a;
            int cfr_ignored_0 = nArray[n3];
            nArray[n3] = n4;
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "set index ", " must be between 0 .. ");
        n7 = this.b + -1;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }
}

