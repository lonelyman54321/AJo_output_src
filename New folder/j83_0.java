/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from j83
 */
public final class j83_0
extends qg3_2
implements Function2 {
    public Ref$FloatRef a;
    public int b;
    public final /* synthetic */ m83 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ QT2 f;

    public j83_0(m83 m832, float f5, Function1 function1, kU2$b$a kU2$b$a, f80_0 f80_02) {
        this.c = m832;
        this.d = f5;
        this.e = function1;
        this.f = kU2$b$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5 = this.d;
        Object object2 = this.f;
        QT2 qT2 = object2;
        qT2 = (kU2$b$a)object2;
        m83 m832 = this.c;
        Function1 function1 = this.e;
        object2 = object;
        object = new j83_0(m832, f5, function1, (kU2$b$a)qT2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (j83_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((j83_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        float f5;
        float f6;
        int n3;
        float f7;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        j83_0 j83_02 = this;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.b;
        Object object7 = this.f;
        int n7 = 2;
        Function1 function1 = this.e;
        m83 m832 = this.c;
        int n8 = 1;
        if (n4 != 0) {
            if (n4 != n8) {
                if (n4 == n7) {
                    vl2_2.b(object);
                    return object;
                }
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            object6 = this.a;
            vl2_2.b(object);
            object5 = object6;
            object6 = object;
        } else {
            vl2_2.b(object);
            object6 = m832.b;
            object4 = FloatCompanionObject.INSTANCE;
            object4 = ya3_0.a;
            object6 = object6.a();
            object4 = new kl_1(0.0f);
            float f8 = this.d;
            object3 = new kl_1(f8);
            object6 = (kl_1)((PA3)object6).c((Ol)object4, (Ol)object3);
            f7 = ((kl_1)object6).a;
            object4 = m832.a;
            f7 = object4.b(f8, f7);
            n3 = Float.isNaN(f7) ^ n8;
            if (n3 == 0) {
                object4 = "calculateApproachOffset returned NaN. Please use a valid value.".toString();
                object6 = new IllegalStateException((String)object4);
                throw object6;
            }
            object5 = new Ref$FloatRef();
            f7 = Math.abs(f7);
            ((Ref$FloatRef)object5).element = f6 = Math.signum(f8) * f7;
            object6 = new Float(f6);
            function1.invoke(object6);
            f5 = ((Ref$FloatRef)object5).element;
            object2 = new j83$b((Ref$FloatRef)object5, function1);
            this.a = object5;
            this.b = n8;
            f8 = this.d;
            object4 = object7;
            object4 = (kU2$b$a)object7;
            object6 = this.c;
            j83_0 j83_03 = this;
            object6 = m83.c((m83)object6, (kU2$b$a)object4, f5, f8, (j83$b)object2, this);
            if (object6 == j90_02) {
                return j90_02;
            }
        }
        object6 = (il_0)object6;
        object4 = m832.a;
        object3 = (Number)((il_0)object6).d();
        f5 = ((Number)object3).floatValue();
        f5 = object4.a(f5);
        n3 = Float.isNaN(f5) ^ n8;
        if (n3 != 0) {
            ((Ref$FloatRef)object5).element = f5;
            n3 = 30;
            il_0 il_02 = jl_0.b((il_0)object6, 0.0f, 0.0f, n3);
            j83$a j83$a = new j83$a((Ref$FloatRef)object5, function1);
            n4 = 0;
            f7 = 0.0f;
            j83_02.a = null;
            j83_02.b = n7;
            object6 = object7;
            object6 = (kU2$b$a)object7;
            object2 = m832.c;
            f6 = f5;
            object7 = this;
            if ((object6 = r83_0.b((kU2$b$a)object6, f5, f5, il_02, (Gl)object2, j83$a, this)) != j90_02) return object6;
            return j90_02;
        }
        object4 = "calculateSnapOffset returned NaN. Please use a valid value.".toString();
        object6 = new IllegalStateException((String)object4);
        throw object6;
    }
}

