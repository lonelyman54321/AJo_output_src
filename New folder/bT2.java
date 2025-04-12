/*
 * Decompiled with CFR 0.152.
 */
public final class bT2 {
    public float a;
    public float b;

    public bT2() {
        float f5 = 1.0f;
        this(f5, f5);
    }

    public bT2(float f5, float f6) {
        this.a = f5;
        this.b = f6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append("x");
        f5 = this.b;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

