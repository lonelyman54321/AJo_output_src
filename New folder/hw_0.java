/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hw
 */
public abstract class hw_0
implements o91 {
    public final tg_1 a;
    public final String b;

    public hw_0(tg_1 object, int n3) {
        int n4;
        this.a = object;
        object = "top";
        if (n3 != 0 && n3 == (n4 = 1)) {
            object = "bottom";
        }
        this.b = object;
    }

    public final void a(y50$a_0 object, float f5, float f6) {
        int n3;
        int n4 = ((y50$a_0)object).b;
        String string2 = "top";
        if (n4 != 0 && n4 == (n3 = 1)) {
            string2 = "bottom";
        }
        char[] cArray = new char[]{};
        ng_1 ng_12 = new pg_0(cArray);
        object = ug_1.l(((y50$a_0)object).a.toString());
        ng_12.l((QG)object);
        object = ug_1.l(string2);
        ng_12.l((QG)object);
        object = new sg_1(f5);
        ng_12.l((QG)object);
        object = new sg_1(f6);
        ng_12.l((QG)object);
        object = this.a;
        String string3 = this.b;
        ((pg_0)object).z(string3, ng_12);
    }
}

