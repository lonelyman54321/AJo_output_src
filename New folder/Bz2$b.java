/*
 * Decompiled with CFR 0.152.
 */
public final class Bz2$b {
    public k93_0 a;
    public final /* synthetic */ Bz2 b;

    public Bz2$b(Bz2 bz2) {
        this.b = bz2;
    }

    public final String toString() {
        Comparable comparable = this.a;
        Object object = "[ ";
        if (comparable != null) {
            int n3 = 0;
            comparable = null;
            while (true) {
                int n4 = 9;
                float f5 = 1.3E-44f;
                if (n3 >= n4) break;
                object = Ex0.a((String)object);
                f5 = this.a.h[n3];
                ((StringBuilder)object).append(f5);
                String string2 = " ";
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
                ++n3;
            }
        }
        comparable = nn_2.a((String)object, "] ");
        object = this.a;
        ((StringBuilder)comparable).append(object);
        return ((StringBuilder)comparable).toString();
    }
}

