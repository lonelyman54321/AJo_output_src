/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from Fl2
 */
public final class fl2_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zr1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Gl g;

    public fl2_0(Cl2$b cl2$b, int n3, ml2_0 ml2_02, float f5, Gl gl, f80_0 f80_02) {
        this.c = cl2$b;
        this.d = n3;
        this.e = ml2_02;
        this.f = f5;
        this.g = gl;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fl2_0 fl2_02;
        Object object2 = this.c;
        Function2 function2 = object2;
        function2 = (Cl2$b)object2;
        Object object3 = object2 = this.e;
        object3 = (ml2_0)object2;
        int n3 = this.d;
        float f5 = this.f;
        Gl gl = this.g;
        object2 = fl2_02;
        fl2_02 = new fl2_0((Cl2$b)function2, n3, (ml2_0)object3, f5, gl, f80_02);
        fl2_02.b = object;
        return fl2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (fl2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fl2_0)object).invokeSuspend(object2);
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
        object = (QT2)this.b;
        int n7 = this.d;
        Object object2 = new Integer(n7);
        Function2 function2 = this.c;
        function2.invoke(object, object2);
        object2 = this.e;
        int n8 = object2.e();
        float f5 = 0.0f;
        if (n7 > n8) {
            n8 = 1;
        } else {
            n8 = 0;
            function2 = null;
        }
        int n10 = object2.a();
        int n14 = object2.e();
        n10 = n10 - n14 + n4;
        if (n8 != 0 && n7 > (n14 = object2.a()) || n8 == 0 && n7 < (n14 = object2.e())) {
            int n15;
            n14 = object2.e();
            if ((n14 = Math.abs(n7 - n14)) >= (n15 = 3)) {
                if (n8 != 0 ? (n8 = n7 - n10) < (n10 = object2.e()) : (n10 += n7) <= (n8 = object2.e())) {
                    n8 = n10;
                }
                object2.b(n8, 0);
            }
        }
        float f6 = object2.c(n7);
        float f7 = this.f;
        f5 = f6 + f7;
        object2 = new Ref$FloatRef();
        Fl2$a fl2$a = new Fl2$a((Ref$FloatRef)object2, (QT2)object);
        this.a = n4;
        Gl gl = this.g;
        int n16 = 4;
        n8 = 0;
        function2 = null;
        object = mg3_0.c(0.0f, f5, gl, fl2$a, this, n16);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

