/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from Ml0
 */
public final class ml0_1
extends qg3_2
implements Function2 {
    public Ref$FloatRef a;
    public il_0 b;
    public int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ nl0_0 e;
    public final /* synthetic */ QT2 f;

    public ml0_1(float f5, nl0_0 nl0_02, kU2$b$a kU2$b$a, f80_0 f80_02) {
        this.d = f5;
        this.e = nl0_02;
        this.f = kU2$b$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5 = this.d;
        kU2$b$a kU2$b$a = (kU2$b$a)this.f;
        nl0_0 nl0_02 = this.e;
        object = new ml0_1(f5, nl0_02, kU2$b$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ml0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ml0_1)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        float f5;
        Ref$FloatRef ref$FloatRef;
        block7: {
            Object object2 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.c;
            int n4 = 1;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                object2 = this.b;
                ref$FloatRef = this.a;
                vl2_2.b(object);
                break block7;
            }
            vl2_2.b(object);
            f5 = this.d;
            float f6 = Math.abs(f5);
            float f7 = 1.0f;
            n3 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
            if (n3 <= 0) return new Float(f5);
            ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = f5;
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            int n7 = 28;
            vi0_0 vi0_02 = null;
            object = jl_0.a(0.0f, f5, n7);
            try {
                nl0_0 nl0_02 = this.e;
                vi0_02 = nl0_02.a;
                QT2 qT2 = this.f;
                qT2 = (kU2$b$a)qT2;
                Ml0$a ml0$a = new Ml0$a(ref$FloatRef2, (kU2$b$a)qT2, ref$FloatRef, nl0_02);
                this.a = ref$FloatRef;
                this.b = object;
                this.c = n4;
                n4 = 0;
                object = mg3_0.d((il_0)object, vi0_02, false, ml0$a, this);
                if (object == object2) {
                    return object2;
                }
            }
            catch (CancellationException cancellationException) {
                block8: {
                    object2 = object;
                    break block8;
                    catch (CancellationException cancellationException2) {}
                }
                object = (Number)((il_0)object2).d();
                ref$FloatRef.element = f5 = ((Number)object).floatValue();
            }
        }
        f5 = ref$FloatRef.element;
        return new Float(f5);
    }
}

