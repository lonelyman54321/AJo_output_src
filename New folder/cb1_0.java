/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;

/*
 * Renamed from CB1
 */
public final class cb1_0
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ fb1_0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ PB1 g;
    public final /* synthetic */ QB1 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ OB1 l;

    public cb1_0(fb1_0 fb1_02, int n3, int n4, boolean bl2, float f5, PB1 pB1, QB1 qB1, float f6, boolean bl3, boolean bl4, OB1 oB1, f80_0 f80_02) {
        this.b = fb1_02;
        this.c = n3;
        this.d = n4;
        this.e = bl2;
        this.f = f5;
        this.g = pB1;
        this.h = qB1;
        this.i = f6;
        this.j = bl3;
        this.k = bl4;
        this.l = oB1;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        boolean bl2 = this.k;
        OB1 oB1 = this.l;
        fb1_0 fb1_02 = this.b;
        int n3 = this.c;
        int n4 = this.d;
        boolean bl3 = this.e;
        float f5 = this.f;
        PB1 pB1 = this.g;
        QB1 qB1 = this.h;
        float f6 = this.i;
        boolean bl4 = this.j;
        cb1_0 cb1_02 = new cb1_0(fb1_02, n3, n4, bl3, f5, pB1, qB1, f6, bl4, bl2, oB1, f80_02);
        return cb1_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (cb1_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((cb1_0)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        fb1_0 fb1_02;
        block13: {
            block12: {
                Object object2 = j90_0.COROUTINE_SUSPENDED;
                Object object3 = this.a;
                Object object4 = 1;
                fb1_02 = this.b;
                if (object3 != 0) {
                    if (object3 != object4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block12;
                }
                vl2_2.b(object);
                Object object5 = this.c;
                fb1_02.i((int)object5);
                object5 = this.d;
                Object object6 = object5;
                fb1_02.c.setValue(object6);
                object3 = this.e;
                object6 = (boolean)object3;
                fb1_02.d.setValue(object6);
                float f5 = this.f;
                Object object7 = Float.valueOf(f5);
                fb1_02.f.setValue(object7);
                object7 = fb1_02.e;
                Object object8 = this.g;
                ((h83_0)object7).setValue(object8);
                object7 = fb1_02.i;
                object8 = this.h;
                ((h83_0)object7).setValue(object8);
                float f6 = this.i;
                fb1_02.t(f6);
                object7 = this.j;
                Object object9 = fb1_02.g;
                ((h83_0)object9).setValue(object7);
                boolean bl2 = this.k;
                if (!bl2) {
                    long l2 = Long.MIN_VALUE;
                    object7 = l2;
                    object9 = fb1_02.l;
                    ((h83_0)object9).setValue(object7);
                }
                object7 = fb1_02.a;
                if (object8 == null) {
                    object = Boolean.FALSE;
                    ((h83_0)object7).setValue(object);
                    return Unit.a;
                }
                object3 = Float.isInfinite(f5);
                if (object3 != 0) {
                    float f7 = fb1_02.h();
                    fb1_02.t(f7);
                    object2 = Boolean.FALSE;
                    ((h83_0)object7).setValue(object2);
                    fb1_02.i((int)object5);
                    return Unit.a;
                }
                object = Boolean.TRUE;
                ((h83_0)object7).setValue(object);
                try {
                    object = this.l;
                    object6 = CB1$b.$EnumSwitchMapping$0;
                    object5 = ((Enum)object).ordinal();
                    object5 = object6[object5];
                    if (object5 != object4) {
                        object3 = 2;
                        f5 = 2.8E-45f;
                        if (object5 != object3) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        object = kotlin.coroutines.f.a;
                    } else {
                        object = kotlinx.coroutines.j.a;
                    }
                    object6 = this.getContext();
                    object9 = mm0.e((CoroutineContext)object6);
                    object8 = this.l;
                    int n3 = this.d;
                    int n4 = this.c;
                    fb1_0 fb1_03 = this.b;
                    object7 = object6;
                    object6 = new cb1$a_0((OB1)((Object)object8), (i)object9, n3, n4, fb1_03, null);
                    this.a = object4;
                    object = Ae3.g(this, (CoroutineContext)object, (Function2)object6);
                    if (object != object2) break block12;
                    return object2;
                }
                catch (Throwable throwable2) {}
            }
            object = this.getContext();
            mm0.c((CoroutineContext)object);
            break block13;
            fb1_0.g(fb1_02, false);
            return Unit.a;
        }
        fb1_0.g(fb1_02, false);
        throw throwable2;
    }
}

