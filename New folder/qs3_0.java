/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qs3
 */
public final class qs3_0 {
    public double a;
    public double b;
    public double c;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qs3_0;
        if (n3 == 0) {
            return false;
        }
        object = (qs3_0)object;
        double d2 = this.a;
        double d5 = ((qs3_0)object).a;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d5 = this.b;
        d2 = ((qs3_0)object).b;
        n3 = Double.compare(d5, d2);
        if (n3 != 0) {
            return false;
        }
        d5 = this.c;
        d2 = ((qs3_0)object).c;
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
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TriggerGeoRadius(latitude=");
        double d2 = this.a;
        stringBuilder.append(d2);
        stringBuilder.append(", longitude=");
        d2 = this.b;
        stringBuilder.append(d2);
        stringBuilder.append(", radius=");
        d2 = this.c;
        stringBuilder.append(d2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

