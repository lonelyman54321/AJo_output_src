/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

public abstract class Ni1 {
    public int[] a;
    public int b;

    public final int a(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.b)) {
            return this.a[n3];
        }
        CharSequence charSequence = wk0_0.a(n3, "Index ", " must be in 0..");
        int n7 = this.b + -1;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Ni1;
        if (n3 != 0) {
            object = (Ni1)object;
            n3 = ((Ni1)object).b;
            int n4 = this.b;
            if (n3 == n4) {
                int[] nArray = this.a;
                object = ((Ni1)object).a;
                IntRange intRange = f.m(0, n4);
                int n7 = intRange.a;
                n4 = intRange.b;
                if (n7 <= n4) {
                    while (true) {
                        Object object2;
                        int n8;
                        if ((n8 = nArray[n7]) != (object2 = object[n7])) {
                            return false;
                        }
                        if (n7 == n4) break;
                        ++n7;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] nArray = this.a;
        int n3 = this.b;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3] * 31;
            n4 += n7;
        }
        return n4;
    }

    public final String toString() {
        CharSequence charSequence;
        block3: {
            String string2 = ", ";
            Intrinsics.checkNotNullParameter(string2, "separator");
            Object object = "[";
            Intrinsics.checkNotNullParameter(object, "prefix");
            String string3 = "]";
            Intrinsics.checkNotNullParameter(string3, "postfix");
            String string4 = "...";
            Intrinsics.checkNotNullParameter(string4, "truncated");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((CharSequence)object);
            object = this.a;
            int n3 = this.b;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = object[i3];
                int n4 = -1;
                if (i3 == n4) {
                    ((StringBuilder)charSequence).append((CharSequence)string4);
                    break block3;
                }
                if (i3 != 0) {
                    ((StringBuilder)charSequence).append((CharSequence)string2);
                }
                ((StringBuilder)charSequence).append((int)object2);
            }
            ((StringBuilder)charSequence).append((CharSequence)string3);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

