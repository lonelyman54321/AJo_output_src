/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from JS0
 */
public final class js0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ gx0_2 d;

    public js0_2(es0_2 es0_22, gx0_2 gx0_22, f80_0 f80_02) {
        this.c = es0_22;
        this.d = gx0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.c;
        gx0_2 gx0_22 = this.d;
        js0_2 js0_22 = new js0_2(es0_22, gx0_22, f80_02);
        js0_22.b = object;
        return js0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (js0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((js0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            vl2_2.b(object);
            object = (fs0_2)this.b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = object2 = LS0.a;
            gx0_2 gx0_22 = this.d;
            object2 = new JS0$a(ref$ObjectRef, gx0_22, (fs0_2)object);
            this.a = n4;
            object = this.c.collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

