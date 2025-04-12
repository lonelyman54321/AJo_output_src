/*
 * Decompiled with CFR 0.152.
 */
public final class By2 {
    public static final By2 c;
    public static final By2 d;
    public final By2$a a;
    public final By2$b b;

    static {
        Object object;
        By2$a by2$a = By2$a.none;
        c = object = new By2(by2$a, null);
        by2$a = By2$a.xMidYMid;
        By2$b by2$b = By2$b.meet;
        d = object = new By2(by2$a, by2$b);
        object = By2$a.none;
        object = By2$a.none;
        object = By2$a.none;
        object = By2$a.none;
        object = By2$b.meet;
    }

    public By2(By2$a by2$a, By2$b by2$b) {
        this.a = by2$a;
        this.b = by2$b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = By2.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (By2)object;
        object3 = this.a;
        object2 = ((By2)object).a;
        if (object3 != object2 || (object3 = this.b) != (object = ((By2)object).b)) {
            bl2 = false;
        }
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Enum enum_ = this.a;
        stringBuilder.append(enum_);
        stringBuilder.append(" ");
        enum_ = this.b;
        stringBuilder.append(enum_);
        return stringBuilder.toString();
    }
}

