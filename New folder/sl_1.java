/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from sl
 */
public final class sl_1 {
    public final il_0 a;
    public final pl_1 b;

    public sl_1(il_0 il_02, pl_1 pl_12) {
        this.a = il_02;
        this.b = pl_12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimationResult(endReason=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", endState=");
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

