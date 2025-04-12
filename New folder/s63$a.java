/*
 * Decompiled with CFR 0.152.
 */
public final class s63$a
implements bx0_2 {
    public final /* synthetic */ s63_0 a;

    public s63$a(s63_0 s63_02) {
        this.a = s63_02;
    }

    public final Object apply(Object object) {
        bx0_2 bx0_22 = this.a.b;
        Object[] objectArray = new Object[]{object};
        object = bx0_22.apply(objectArray);
        x03_0.b(object, "The zipper returned a null value");
        return object;
    }
}

