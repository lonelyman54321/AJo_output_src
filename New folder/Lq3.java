/*
 * Decompiled with CFR 0.152.
 */
public final class Lq3 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public /* synthetic */ Lq3(double d2, double d5, double d7, double d9, double d12) {
        this(d2, d5, d7, d9, d12, 0.0, 0.0);
    }

    public Lq3(double d2, double d5, double d7, double d9, double d12, double d13, double d14) {
        boolean bl2;
        this.a = d2;
        this.b = d5;
        this.c = d7;
        this.d = d9;
        this.e = d12;
        this.f = d13;
        this.g = d14;
        boolean bl3 = Double.isNaN(d5);
        if (!(bl3 || (bl2 = Double.isNaN(d7)) || (bl2 = Double.isNaN(d9)) || (bl2 = Double.isNaN(d12)) || (bl2 = Double.isNaN(d13)) || (bl2 = Double.isNaN(d14)) || (bl2 = Double.isNaN(d2)))) {
            double d15;
            double d16;
            d7 = 0.0;
            double d17 = d12 - d7;
            double d18 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
            if (d18 >= 0 && (d16 = (d15 = d12 - (d13 = 1.0)) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1)) <= 0) {
                double d19;
                d16 = d12 == d7 ? 0 : (d12 < d7 ? -1 : 1);
                if (d16 == false && ((d16 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1)) == false || (d16 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1)) == false)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
                    throw illegalArgumentException;
                }
                d16 = d12 == d13 ? 0 : (d12 > d13 ? 1 : -1);
                if (d16 >= 0 && (d19 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1)) == false) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
                    throw illegalArgumentException;
                }
                d19 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
                if ((d19 == false || (d19 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1)) == false) && (d19 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1)) == false) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw illegalArgumentException;
                }
                d19 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1);
                if (d19 >= 0) {
                    double d20;
                    double d22 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
                    if (d22 >= 0 && (d20 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1)) >= 0) {
                        return;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The transfer function must be positive or increasing");
                    throw illegalArgumentException;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The transfer function must be increasing");
                throw illegalArgumentException;
            }
            CharSequence charSequence = new StringBuilder("Parameter d must be in the range [0..1], was ");
            charSequence.append(d12);
            charSequence = charSequence.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameters cannot be NaN");
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Lq3;
        if (n3 == 0) {
            return false;
        }
        object = (Lq3)object;
        double d2 = this.a;
        double d5 = ((Lq3)object).a;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d5 = this.b;
        d2 = ((Lq3)object).b;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.c;
        d2 = ((Lq3)object).c;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.d;
        d2 = ((Lq3)object).d;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.e;
        d2 = ((Lq3)object).e;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.f;
        d2 = ((Lq3)object).f;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.g;
        d2 = ((Lq3)object).g;
        int n4 = Double.compare(d5, d2);
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
        n4 = (n4 + n7) * 31;
        l3 = Double.doubleToLongBits(this.c);
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = Double.doubleToLongBits(this.d);
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = Double.doubleToLongBits(this.e);
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = Double.doubleToLongBits(this.f);
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = Double.doubleToLongBits(this.g);
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransferParameters(gamma=");
        double d2 = this.a;
        stringBuilder.append(d2);
        stringBuilder.append(", a=");
        d2 = this.b;
        stringBuilder.append(d2);
        stringBuilder.append(", b=");
        d2 = this.c;
        stringBuilder.append(d2);
        stringBuilder.append(", c=");
        d2 = this.d;
        stringBuilder.append(d2);
        stringBuilder.append(", d=");
        d2 = this.e;
        stringBuilder.append(d2);
        stringBuilder.append(", e=");
        d2 = this.f;
        stringBuilder.append(d2);
        stringBuilder.append(", f=");
        d2 = this.g;
        stringBuilder.append(d2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

