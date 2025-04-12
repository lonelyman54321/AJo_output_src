/*
 * Decompiled with CFR 0.152.
 */
public final class ay$b
implements dj0$a {
    public final yE0 a;
    public final az2_2 b;

    public ay$b(int n3, yE0 object) {
        this.a = object;
        super(n3, 0);
        this.b = object;
    }

    public final dj0 a(N93 object, ba2 ba22) {
        object = ((N93)object).a;
        az2_2 az2_22 = this.b;
        yE0 yE02 = this.a;
        ay_2 ay_22 = new ay_2((Fe1)object, ba22, az2_22, yE02);
        return ay_22;
    }

    public final boolean equals(Object object) {
        return object instanceof ay$b;
    }

    public final int hashCode() {
        return ay$b.class.hashCode();
    }
}

