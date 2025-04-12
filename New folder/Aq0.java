/*
 * Decompiled with CFR 0.152.
 */
public final class Aq0 {
    public final xs0_0 a = null;
    public final String b;

    public Aq0(String string2, String string3) {
        this.b = string2;
    }

    public final QG a() {
        Object object = this.a;
        if (object != null) {
            float f5 = ((xs0_0)object).a;
            sg_1 sg_12 = new sg_1(f5);
            return sg_12;
        }
        object = this.b;
        if (object != null) {
            return ug_1.l((String)object);
        }
        return ug_1.l("wrap");
    }
}

