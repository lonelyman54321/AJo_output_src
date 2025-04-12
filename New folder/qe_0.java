/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QE
 */
public final class qe_0
implements Bp {
    public final int a() {
        return 1;
    }

    public final int b(Object object) {
        return ((byte[])object).length;
    }

    public final String getTag() {
        return "ByteArrayPool";
    }

    public final Object newArray(int n3) {
        return new byte[n3];
    }
}

