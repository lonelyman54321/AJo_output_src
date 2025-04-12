/*
 * Decompiled with CFR 0.152.
 */
public final class gX2$a {
    public long a;
    public JA3 b;
    public boolean c;
    public float d;
    public final kl_1 e;
    public kl_1 f;
    public long g;
    public long h;

    public gX2$a() {
        kl_1 kl_12;
        this.e = kl_12 = new kl_1(0.0f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("progress nanos: ");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", animationSpec: ");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", isComplete: ");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", value: ");
        float f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(", start: ");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", initialVelocity: ");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", durationNanos: ");
        l2 = this.g;
        stringBuilder.append(l2);
        stringBuilder.append(", animationSpecDuration: ");
        l2 = this.h;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

