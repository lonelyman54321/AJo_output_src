/*
 * Decompiled with CFR 0.152.
 */
public final class P00 {
    public double a;
    public double b;

    public P00(double d2, double d5) {
        this.a = d2;
        this.b = d5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof P00;
        if (n3 == 0) {
            return false;
        }
        object = (P00)object;
        double d2 = this.a;
        double d5 = ((P00)object).a;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d2 = this.b;
        d5 = ((P00)object).b;
        int n4 = Double.compare(d2, d5);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = Double.doubleToLongBits(this.a);
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = Double.doubleToLongBits(this.b);
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ComplexDouble(_real=");
        double d2 = this.a;
        stringBuilder.append(d2);
        stringBuilder.append(", _imaginary=");
        d2 = this.b;
        stringBuilder.append(d2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

