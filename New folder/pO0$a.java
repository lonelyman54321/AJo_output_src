/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class pO0$a {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g;
    public int h;

    public pO0$a() {
        boolean[] blArray = new boolean[15];
        this.g = blArray;
    }

    public final boolean a() {
        boolean bl2;
        long l2 = this.d;
        long l3 = 15;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        bl2 = object > 0 && !(bl2 = this.h);
        return bl2;
    }

    public final void b(long l2) {
        long l3 = this.d;
        long l4 = 0L;
        long l7 = 1L;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            this.a = l2;
        } else {
            Object object2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            if (object2 == false) {
                l3 = this.a;
                this.b = l3 = l2 - l3;
                this.f = l3;
                this.e = l7;
            } else {
                l4 = this.c;
                l4 = l2 - l4;
                int n3 = (int)(l3 %= (long)15);
                long l8 = this.b;
                l8 = Math.abs(l4 - l8);
                long l12 = 1000000L;
                boolean[] blArray = this.g;
                int n4 = 1;
                Object object3 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                if (object3 <= 0) {
                    this.e = l8 = this.e + l7;
                    this.f = l8 = this.f + l4;
                    object2 = blArray[n3];
                    if (object2 != false) {
                        int n7;
                        object2 = 0;
                        blArray[n3] = false;
                        this.h = n7 = this.h - n4;
                    }
                } else {
                    object2 = blArray[n3];
                    if (object2 == false) {
                        int n8;
                        blArray[n3] = n4;
                        this.h = n8 = this.h + n4;
                    }
                }
            }
        }
        this.d = l3 = this.d + l7;
        this.c = l2;
    }

    public final void c() {
        long l2;
        this.d = l2 = 0L;
        this.e = l2;
        this.f = l2;
        this.h = 0;
        Arrays.fill(this.g, false);
    }
}

