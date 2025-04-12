/*
 * Decompiled with CFR 0.152.
 */
public final class MR1 {
    public float a;
    public float b;
    public float c;
    public float d;

    public final void a(float f5, float f6, float f7, float f8) {
        float f11 = this.a;
        this.a = f5 = Math.max(f5, f11);
        f5 = this.b;
        this.b = f5 = Math.max(f6, f5);
        f5 = this.c;
        this.c = f5 = Math.min(f7, f5);
        f5 = this.d;
        this.d = f5 = Math.min(f8, f5);
    }

    public final boolean b() {
        float f5;
        float f6 = this.a;
        float f7 = this.c;
        float f8 = f6 - f7;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 < 0 && (f11 = (f5 = (f6 = this.b) - (f7 = this.d)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) < 0) {
            f11 = 0.0f;
            f6 = 0.0f;
        } else {
            f11 = 1.0f;
            f6 = Float.MIN_VALUE;
        }
        return (boolean)f11;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MutableRect(");
        String string2 = jZ0.a(this.a);
        stringBuilder.append(string2);
        string2 = ", ";
        stringBuilder.append(string2);
        String string3 = jZ0.a(this.b);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        string3 = jZ0.a(this.c);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        string2 = jZ0.a(this.d);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

