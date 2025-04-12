/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$f
extends rR2$O {
    public static final rR2$f b;
    public static final rR2$f c;
    public final int a;

    static {
        rR2$f rR2$f;
        b = rR2$f = new rR2$f(-16777216);
        c = rR2$f = new rR2$f(0);
    }

    public rR2$f(int n3) {
        this.a = n3;
    }

    public final String toString() {
        Integer n3 = this.a;
        Object[] objectArray = new Object[]{n3};
        return String.format("#%08x", objectArray);
    }
}

