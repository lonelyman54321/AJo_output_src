/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Dl2
 */
public final class dl2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;

    public dl2_0(hm0_0 hm0_02, float f5, int n3, f80_0 f80_02) {
        this.b = hm0_02;
        this.c = f5;
        this.d = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.b;
        float f5 = this.c;
        int n3 = this.d;
        object = new dl2_0(hm0_02, f5, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (dl2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dl2_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        double d2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Cl2 cl2 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            object = cl2.v.b(this);
            if (object != object2) {
                object = Unit.a;
            }
            if (object == object2) {
                return object2;
            }
        }
        float f5 = this.c;
        double d5 = f5;
        double d7 = -0.5;
        double d9 = d7 == d5 ? 0 : (d7 < d5 ? -1 : 1);
        if (d9 <= 0 && (d9 = (d2 = d5 - (d7 = 0.5)) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1)) <= 0) {
            int n7 = this.d;
            n7 = cl2.i(n7);
            yl2 yl22 = cl2.c;
            yl22.b.e(n7);
            is1_0 is1_02 = yl22.f;
            is1_02.d(n7);
            object2 = yl22.c;
            ((D83)object2).k(f5);
            f5 = 0.0f;
            yl22.e = null;
            object = (hi2_0)cl2.w.getValue();
            if (object != null) {
                object.f();
            }
            return Unit.a;
        }
        object = g9_0.a(f5, "pageOffsetFraction ", " is not within the range -0.5 to 0.5");
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

