/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Mw
 */
public abstract class mw_0
implements tb3_0 {
    public final tg_1 a;
    public final String b;

    public mw_0(tg_1 tg_12, int n3) {
        this.a = tg_12;
        int n4 = -2;
        String string2 = "start";
        if (n3 != n4) {
            n4 = -1;
            if (n3 != n4) {
                if (n3 != 0) {
                    n4 = 1;
                    if (n3 == n4) {
                        string2 = "right";
                    }
                } else {
                    string2 = "left";
                }
            } else {
                string2 = "end";
            }
        }
        this.b = string2;
    }

    public final void a(y50$b_0 object, float f5, float f6) {
        int n3 = ((y50$b_0)object).b;
        int n4 = -2;
        String string2 = "start";
        if (n3 != n4) {
            n4 = -1;
            if (n3 != n4) {
                if (n3 != 0) {
                    n4 = 1;
                    if (n3 == n4) {
                        string2 = "right";
                    }
                } else {
                    string2 = "left";
                }
            } else {
                string2 = "end";
            }
        }
        char[] cArray = new char[]{};
        ng_1 ng_12 = new pg_0(cArray);
        object = ug_1.l(((y50$b_0)object).a.toString());
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

