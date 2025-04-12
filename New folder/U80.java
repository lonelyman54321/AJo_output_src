/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class U80
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ MD b;
    public final /* synthetic */ ql3_0 c;
    public final /* synthetic */ Vt1 d;
    public final /* synthetic */ Ul3 e;
    public final /* synthetic */ i72 f;

    public U80(MD mD, ql3_0 ql3_02, Vt1 vt1, Ul3 ul3, i72 i722, f80_0 f80_02) {
        this.b = mD;
        this.c = ql3_02;
        this.d = vt1;
        this.e = ul3;
        this.f = i722;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ul3 ul3 = this.e;
        i72 i722 = this.f;
        MD mD = this.b;
        ql3_0 ql3_02 = this.c;
        Vt1 vt1 = this.d;
        object = new U80(mD, ql3_02, vt1, ul3, i722, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (U80)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((U80)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.d.a;
        Object object2 = this.e.a;
        this.a = n4;
        ql3_0 ql3_02 = this.c;
        long l2 = ql3_02.b;
        int n7 = mm3.d(l2);
        n7 = this.f.b(n7);
        String string2 = ((Tl3)object2).a.a.a;
        int n8 = string2.length();
        if (n7 < n8) {
            object = ((Tl3)object2).b(n7);
        } else if (n7 != 0) {
            object = ((Tl3)object2).b(n7 -= n4);
        } else {
            object2 = ((Mj3)object).b;
            Vo0 vo0 = ((Mj3)object).g;
            object = ((Mj3)object).h;
            long l3 = gk3.b((xm3)object2, vo0, (RU0$a)object);
            l2 = 0xFFFFFFFFL;
            float f5 = (int)(l3 &= l2);
            n4 = 0;
            vo0 = null;
            n7 = 1065353216;
            float f6 = 1.0f;
            object = new aG2(0.0f, 0.0f, f6, f5);
        }
        object2 = this.b;
        object = object2.a((aG2)object, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

