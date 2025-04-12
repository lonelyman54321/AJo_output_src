/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.p;
import java.io.Serializable;
import java.util.Iterator;

public abstract class DF
implements Iterable,
Serializable {
    public static final DF$e b;
    public static final DF$c c;
    public int a = 0;

    static {
        byte[] byArray = p.b;
        Object object = new DF$e(byArray);
        b = object;
        boolean bl2 = Ye.a();
        object = bl2 ? new Object() : new Object();
        c = object;
    }

    public static DF$e c(int n3, byte[] object, int n4) {
        int n7 = n3 + n4;
        int n8 = ((byte[])object).length;
        int n10 = n7 - n3;
        int n14 = n3 | n7;
        n10 |= n14;
        n14 = n8 - n7;
        if ((n10 |= n14) < 0) {
            if (n3 >= 0) {
                if (n7 < n3) {
                    object = new IndexOutOfBoundsException;
                    String string2 = D70.b(n3, n7, "Beginning index larger than ending index: ", ", ");
                    object(string2);
                    throw object;
                }
                object = D70.b(n7, n8, "End index: ", " >= ");
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
                throw indexOutOfBoundsException;
            }
            object = new IndexOutOfBoundsException;
            String string3 = Gj0.b(n3, "Beginning index: ", " < 0");
            object(string3);
            throw object;
        }
        byte[] byArray = c.copyFrom((byte[])object, n3, n4);
        DF$e dF$e = new DF$e(byArray);
        return dF$e;
    }

    public abstract byte a(int var1);

    public abstract byte d(int var1);

    public abstract boolean e();

    public abstract boolean equals(Object var1);

    public abstract int f(int var1, int var2);

    public abstract String g();

    public abstract void h(tf_0 var1);

    public final int hashCode() {
        int n3 = this.a;
        if (n3 == 0) {
            n3 = this.size();
            if ((n3 = this.f(n3, n3)) == 0) {
                n3 = 1;
            }
            this.a = n3;
        }
        return n3;
    }

    public Iterator iterator() {
        cf_1 cf_12 = new cf_1(this);
        return cf_12;
    }

    public abstract int size();

    public final String toString() {
        String string2 = Integer.toHexString(System.identityHashCode(this));
        Integer n3 = this.size();
        Object[] objectArray = new Object[]{string2, n3};
        return String.format("<ByteString@%s size=%d>", objectArray);
    }
}

