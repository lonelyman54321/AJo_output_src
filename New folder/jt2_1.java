/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from JT2
 */
public final class jt2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Gl d;
    public final /* synthetic */ Ref$FloatRef e;

    public jt2_1(float f5, Qs3 qs3, Ref$FloatRef ref$FloatRef, f80_0 f80_02) {
        this.c = f5;
        this.d = qs3;
        this.e = ref$FloatRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5 = this.c;
        Qs3 qs3 = (Qs3)this.d;
        Ref$FloatRef ref$FloatRef = this.e;
        jt2_1 jt2_12 = new jt2_1(f5, qs3, ref$FloatRef, f80_02);
        jt2_12.b = object;
        return jt2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (jt2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jt2_1)object).invokeSuspend(object2);
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
            object = (QT2)this.b;
            Ref$FloatRef ref$FloatRef = this.e;
            JT2$a jT2$a = new JT2$a(ref$FloatRef, (QT2)object);
            this.a = n4;
            Gl gl = this.d;
            int n7 = 4;
            float f5 = this.c;
            object = mg3_0.c(0.0f, f5, gl, jT2$a, this, n7);
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

