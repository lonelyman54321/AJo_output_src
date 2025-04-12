/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Objects;

public class QG
implements Cloneable {
    public final char[] a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public pg_0 d;

    public QG(char[] cArray) {
        this.a = cArray;
    }

    public QG d() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object = new AssertionError();
            throw object;
        }
        return (QG)object;
    }

    public final String e() {
        long l2;
        int n3;
        char[] cArray = this.a;
        String string2 = new String(cArray);
        int n4 = string2.length();
        if (n4 < (n3 = 1)) {
            return "";
        }
        long l3 = this.c;
        long l4 = Long.MAX_VALUE;
        long l7 = l3 - l4;
        n4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n4 != 0 && (n4 = (int)((l2 = l3 - (l4 = this.b)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) >= 0) {
            n4 = (int)l4;
            int n7 = (int)l3 + n3;
            return string2.substring(n4, n7);
        }
        l3 = this.b;
        n4 = (int)l3;
        int n8 = (int)l3 + n3;
        return string2.substring(n4, n8);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        int n3 = object instanceof QG;
        if (!n3) {
            return false;
        }
        object = (QG)object;
        long l2 = this.b;
        long l3 = ((QG)object).b;
        long l4 = l2 - l3;
        n3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n3) {
            return false;
        }
        l2 = this.c;
        l3 = ((QG)object).c;
        long l7 = l2 - l3;
        n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n3) {
            return false;
        }
        object.getClass();
        Object object2 = this.a;
        char[] cArray = ((QG)object).a;
        n3 = Arrays.equals(object2, cArray);
        if (!n3) {
            return false;
        }
        object2 = this.d;
        object = ((QG)object).d;
        return Objects.equals(object2, object);
    }

    public float f() {
        boolean bl2 = this instanceof sg_1;
        if (bl2) {
            return ((sg_1)this).f();
        }
        return 0.0f / 0.0f;
    }

    public int g() {
        boolean bl2 = this instanceof sg_1;
        if (bl2) {
            return ((sg_1)this).g();
        }
        return 0;
    }

    public int hashCode() {
        int n3;
        char[] cArray = this.a;
        int n4 = Arrays.hashCode(cArray) * 31;
        long l2 = this.b;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        l2 = this.c;
        long l4 = l2 >>> n7;
        n8 = (int)(l2 ^= l4);
        n4 = (n4 + n8) * 31;
        pg_0 pg_02 = this.d;
        if (pg_02 != null) {
            n3 = pg_02.hashCode();
        } else {
            n3 = 0;
            pg_02 = null;
        }
        return (n4 + n3) * 31 + 0;
    }

    public final String i() {
        String string2 = this.getClass().toString();
        int n3 = string2.lastIndexOf(46) + 1;
        return string2.substring(n3);
    }

    public final void j(long l2) {
        long l3 = this.c;
        long l4 = Long.MAX_VALUE;
        long l7 = l3 - l4;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 != false) {
            return;
        }
        this.c = l2;
        pg_0 pg_02 = this.d;
        if (pg_02 != null) {
            pg_02.l(this);
        }
    }

    public String toString() {
        long l2;
        long l3 = this.b;
        long l4 = this.c;
        long l7 = l3 - l4;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 <= 0 && (l8 = (l2 = l4 - (l3 = Long.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            Object object = this.a;
            String string2 = new String((char[])object);
            int n3 = (int)this.b;
            int n4 = (int)this.c + 1;
            string2 = string2.substring(n3, n4);
            object = new StringBuilder;
            ((StringBuilder)object)();
            String string3 = this.i();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(" (");
            l4 = this.b;
            ((StringBuilder)object).append(l4);
            ((StringBuilder)object).append(" : ");
            l4 = this.c;
            ((StringBuilder)object).append(l4);
            ((StringBuilder)object).append(") <<");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(">>");
            return ((StringBuilder)object).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        Class<?> clazz = this.getClass();
        stringBuilder.append(clazz);
        stringBuilder.append(" (INVALID, ");
        long l12 = this.b;
        stringBuilder.append(l12);
        stringBuilder.append("-");
        l12 = this.c;
        return jl0_0.b(stringBuilder, l12, ")");
    }
}

