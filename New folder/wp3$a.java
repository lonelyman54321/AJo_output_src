/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class wp3$a {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public wp3$a(int n3, byte[] byArray, int n4, int n7) {
        this.a = n3;
        this.b = byArray;
        this.c = n4;
        this.d = n7;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<wp3$a> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = wp3$a.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (wp3$a)object;
            int n3 = this.a;
            int n4 = ((wp3$a)object).a;
            if (n3 != n4 || (n3 = this.c) != (n4 = ((wp3$a)object).c) || (n3 = this.d) != (n4 = ((wp3$a)object).d) || !(bl3 = Arrays.equals((byte[])(object2 = (Object)this.b), (byte[])(object = (Object)((wp3$a)object).b)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = (Arrays.hashCode(this.b) + n3) * 31;
        n3 = this.c;
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        return n4 + n3;
    }
}

