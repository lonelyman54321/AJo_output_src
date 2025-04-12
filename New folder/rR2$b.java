/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$b {
    public float a;
    public float b;
    public float c;
    public float d;

    public rR2$b(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public rR2$b(rR2$b rR2$b) {
        float f5;
        float f6;
        this.a = f6 = rR2$b.a;
        this.b = f6 = rR2$b.b;
        this.c = f6 = rR2$b.c;
        this.d = f5 = rR2$b.d;
    }

    public final float a() {
        float f5 = this.a;
        float f6 = this.c;
        return f5 + f6;
    }

    public final float b() {
        float f5 = this.b;
        float f6 = this.d;
        return f5 + f6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        float f5 = this.a;
        stringBuilder.append(f5);
        String string2 = " ";
        stringBuilder.append(string2);
        float f6 = this.b;
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        f6 = this.c;
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

