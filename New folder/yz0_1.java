/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Yz0
 */
public final class yz0_1
implements X01 {
    public final /* synthetic */ gr3$a a;
    public final /* synthetic */ gr3$a b;
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ yA0 d;
    public final /* synthetic */ JE0 e;
    public final /* synthetic */ gr3$a f;

    public /* synthetic */ yz0_1(gr3$a gr3$a, gr3$a gr3$a2, gr3 gr32, yA0 yA02, JE0 jE0, gr3$a gr3$a3) {
        this.a = gr3$a;
        this.b = gr3$a2;
        this.c = gr32;
        this.d = yA02;
        this.e = jE0;
        this.f = gr3$a3;
    }

    public final cA0 init() {
        Object object;
        Object object2;
        Object object3;
        Object object4 = this.a;
        Object object5 = this.d;
        JE0 jE0 = this.e;
        gr3$a$a gr3$a$a = null;
        if (object4 != null) {
            object3 = new aa0_0((yA0)object5, jE0);
            object2 = new ba0_0((yA0)object5, jE0);
            object4 = ((gr3$a)object4).a((Function1)object3, (Function1)object2);
        } else {
            object4 = null;
        }
        object3 = this.b;
        if (object3 != null) {
            object2 = new dA0((yA0)object5, jE0);
            object = new eA0((yA0)object5, jE0);
            object3 = ((gr3$a)object3).a((Function1)object2, (Function1)object);
        } else {
            object3 = null;
        }
        object2 = this.c.a.a();
        object = Xz0.PreEnter;
        if (object2 == object) {
            ((yA0)object5).a().getClass();
            object2 = jE0.a();
            object2.getClass();
        } else {
            jE0.a().getClass();
            object2 = ((yA0)object5).a();
            object2.getClass();
        }
        object2 = this.f;
        if (object2 != null) {
            object = new gA0(null, (yA0)object5, jE0);
            object5 = fA0.c;
            gr3$a$a = ((gr3$a)object2).a((Function1)object5, (Function1)object);
        }
        object5 = new cA0((gr3$a$a)object4, (gr3$a$a)object3, gr3$a$a);
        return object5;
    }
}

