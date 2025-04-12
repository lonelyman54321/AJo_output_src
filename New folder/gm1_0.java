/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/*
 * Renamed from Gm1
 */
public abstract class gm1_0
implements Closeable {
    public static final String[] e;
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    static {
        int n3;
        int n4 = 1;
        e = new String[128];
        for (int i3 = 0; i3 <= (n3 = 31); i3 += n4) {
            String[] stringArray = e;
            Object object = i3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            stringArray[i3] = object = String.format("\\u%04x", objectArray);
        }
        String[] stringArray = e;
        stringArray[34] = "\\\"";
        stringArray[92] = "\\\\";
        stringArray[9] = "\\t";
        stringArray[8] = "\\b";
        stringArray[10] = "\\n";
        stringArray[13] = "\\r";
        stringArray[12] = "\\f";
    }

    public final void A(int n3) {
        int n4;
        Object[] objectArray;
        int n7 = this.a;
        Object object = this.b;
        int n8 = ((int[])object).length;
        if (n7 == n8) {
            n8 = 256;
            if (n7 != n8) {
                n7 = ((int[])object).length * 2;
                this.b = objectArray = Arrays.copyOf(object, n7);
                objectArray = this.c;
                n4 = objectArray.length * 2;
                objectArray = (String[])Arrays.copyOf(objectArray, n4);
                this.c = (String[])objectArray;
                objectArray = this.d;
                n4 = objectArray.length * 2;
                objectArray = Arrays.copyOf(objectArray, n4);
                this.d = objectArray;
            } else {
                CharSequence charSequence = new StringBuilder("Nesting too deep at ");
                object = this.h();
                charSequence.append((String)object);
                charSequence = charSequence.toString();
                yl1_0 yl1_02 = new RuntimeException((String)charSequence);
                throw yl1_02;
            }
        }
        objectArray = this.b;
        n4 = this.a;
        this.a = n8 = n4 + 1;
        objectArray[n4] = n3;
    }

    public abstract int C(Gm1$a var1);

    public abstract void G();

    public abstract void H();

    public final void I(String charSequence) {
        charSequence = nn_2.a((String)charSequence, " at path ");
        String string2 = this.h();
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        lm1_1 lm1_12 = new IOException((String)charSequence);
        throw lm1_12;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final String h() {
        int n3 = this.a;
        int[] nArray = this.b;
        String[] stringArray = this.c;
        int[] nArray2 = this.d;
        StringBuilder stringBuilder = new StringBuilder("$");
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = nArray[i3];
            char c3 = '\u0001';
            if (c2 != c3 && c2 != (c3 = '\u0002')) {
                c3 = '\u0003';
                if (c2 != c3 && c2 != (c3 = '\u0004') && c2 != (c3 = '\u0005')) continue;
                c2 = '.';
                stringBuilder.append(c2);
                String string2 = stringArray[i3];
                if (string2 == null) continue;
                stringBuilder.append(string2);
                continue;
            }
            stringBuilder.append('[');
            c2 = nArray2[i3];
            stringBuilder.append((int)c2);
            c2 = ']';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public abstract boolean k();

    public abstract boolean n();

    public abstract double p();

    public abstract int u();

    public abstract String w();

    public abstract Gm1$b z();
}

