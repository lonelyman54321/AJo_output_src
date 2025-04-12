/*
 * Decompiled with CFR 0.152.
 */
public final class gj1
implements Bp {
    public final int a() {
        return 4;
    }

    public final int b(Object object) {
        return ((int[])object).length;
    }

    public final String getTag() {
        return "IntegerArrayPool";
    }

    public final Object newArray(int n3) {
        return new int[n3];
    }
}

