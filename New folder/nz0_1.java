/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Nz0
 */
public final class nz0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ kz0_0 b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ pe1_0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ GB0 h;

    public nz0_1(kz0_0 kz0_02, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, pe1_0 pe1_02, Object object, Ref$ObjectRef ref$ObjectRef3, GB0 gB0, f80_0 f80_02) {
        this.b = kz0_02;
        this.c = ref$ObjectRef;
        this.d = ref$ObjectRef2;
        this.e = pe1_02;
        this.f = object;
        this.g = ref$ObjectRef3;
        this.h = gB0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.g;
        GB0 gB0 = this.h;
        kz0_0 kz0_02 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.c;
        Ref$ObjectRef ref$ObjectRef3 = this.d;
        pe1_0 pe1_02 = this.e;
        Object object2 = this.f;
        object = new nz0_1(kz0_02, ref$ObjectRef2, ref$ObjectRef3, pe1_02, object2, ref$ObjectRef, gB0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nz0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nz0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = object = this.c.element;
            object2 = (N93)object;
            Object object3 = object = this.d.element;
            object3 = (n10_0)object;
            Object object4 = object = this.g.element;
            object4 = (ba2)object;
            this.a = n4;
            kz0_0 kz0_02 = this.b;
            pe1_0 pe1_02 = this.e;
            Object object5 = this.f;
            GB0 gB0 = this.h;
            object = kz0_0.b(kz0_02, (N93)object2, (n10_0)object3, pe1_02, object5, (ba2)object4, gB0, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

