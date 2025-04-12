/*
 * Decompiled with CFR 0.152.
 */
public final class GT2 {
    public final GY2 a;
    public final int b;
    public final Vi1 c;
    public final zp1 d;

    public GT2(GY2 gY2, int n3, Vi1 vi1, w32_0 w32_02) {
        this.a = gY2;
        this.b = n3;
        this.c = vi1;
        this.d = w32_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScrollCaptureCandidate(node=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", depth=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", viewportBoundsInWindow=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", coordinates=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

