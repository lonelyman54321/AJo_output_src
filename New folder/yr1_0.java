/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b$a;
import androidx.compose.foundation.lazy.layout.g$a;

/*
 * Renamed from yR1
 */
public final class yr1_0 {
    public final WR1 a;
    public int b;
    public Nj1 c;

    public yr1_0() {
        WR1 wR1;
        Object[] objectArray = new Nj1[16];
        this.a = wR1 = new WR1(objectArray);
    }

    public final void a(int n3, b$a object) {
        if (n3 >= 0) {
            int n4;
            if (n3 == 0) {
                return;
            }
            int n7 = this.b;
            Nj1 nj1 = new Nj1(n7, n3, (b$a)object);
            this.b = n4 = this.b + n3;
            this.a.b(nj1);
            return;
        }
        String string2 = hj0_0.a(n3, "size should be >=0, but was ");
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void b(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.b)) {
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index ", ", size ");
        int n7 = this.b;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void c(int n3, int n4, g$a serializable) {
        this.b(n3);
        this.b(n4);
        if (n4 >= n3) {
            WR1 wR1 = this.a;
            n3 = Oj1.b(n3, wR1);
            Nj1 nj1 = (Nj1)wR1.a[n3];
            int n7 = nj1.a;
            while (n7 <= n4) {
                Nj1 nj12 = (Nj1)wR1.a[n3];
                ((g$a)serializable).invoke(nj12);
                int n8 = nj12.b;
                n7 += n8;
                ++n3;
            }
            return;
        }
        serializable = new StringBuilder("toIndex (");
        ((StringBuilder)serializable).append(n4);
        ((StringBuilder)serializable).append(") should be not smaller than fromIndex (");
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(')');
        String string2 = ((StringBuilder)serializable).toString();
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final Nj1 d(int n3) {
        Object object;
        block3: {
            Object object2;
            block2: {
                this.b(n3);
                object = this.c;
                if (object == null) break block2;
                int n4 = ((Nj1)object).b;
                int n7 = ((Nj1)object).a;
                if (n3 < (n4 += n7) && n7 <= n3) break block3;
            }
            object = this.a;
            n3 = Oj1.b(n3, (WR1)object);
            object = object2 = ((WR1)object).a[n3];
            this.c = object = (Nj1)object2;
        }
        return object;
    }
}

