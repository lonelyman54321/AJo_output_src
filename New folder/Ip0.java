/*
 * Decompiled with CFR 0.152.
 */
public final class Ip0 {
    public final int a;
    public final int b;
    public final int c;

    static {
        Ip0$a ip0$a = new Object();
        int n3 = ip0$a.a;
        int n4 = ip0$a.b;
        int n7 = 1;
        n3 = n3 <= n4 ? 1 : 0;
        ct3.a(n3 != 0);
        new Ip0(ip0$a);
        gz3.D(0);
        gz3.D(n7);
        gz3.D(2);
        gz3.D(3);
    }

    public Ip0(Ip0$a ip0$a) {
        int n3;
        int n4;
        ip0$a.getClass();
        this.a = 0;
        this.b = n4 = ip0$a.a;
        this.c = n3 = ip0$a.b;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof Ip0;
        if (n4 == 0) {
            return false;
        }
        object = (Ip0)object;
        int n7 = this.a;
        n4 = ((Ip0)object).a;
        if (n7 == n4 && (n4 = this.b) == (n7 = ((Ip0)object).b) && (n4 = this.c) == (n3 = ((Ip0)object).c)) {
            n3 = gz3.a;
        } else {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (527 + n3) * 31;
        n3 = this.b;
        n4 = (n4 + n3) * 31;
        n3 = this.c;
        return (n4 + n3) * 31;
    }
}

