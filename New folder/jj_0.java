/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Jj
 */
public final class jj_0
extends qg3_2
implements Function1 {
    public il_0 a;
    public Ref$BooleanRef b;
    public int c;
    public final /* synthetic */ Lj d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ol_1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Function1 h;

    public jj_0(Lj lj, Object object, ni3_0 ni3_02, long l2, Function1 function1, f80_0 f80_02) {
        this.d = lj;
        this.e = object;
        this.f = ni3_02;
        this.g = l2;
        this.h = function1;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        jj_0 jj_02;
        Object object = this.f;
        ol_1 ol_12 = object;
        ol_12 = (ni3_0)object;
        Lj lj = this.d;
        Object object2 = this.e;
        long l2 = this.g;
        Function1 function1 = this.h;
        object = jj_02;
        jj_02 = new jj_0(lj, object2, (ni3_0)ol_12, l2, function1, f80_02);
        return jj_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (jj_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((jj_0)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        CancellationException cancellationException2;
        Lj lj;
        block8: {
            Object object2;
            Object object3 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.c;
            int n4 = 1;
            lj = this.d;
            if (n3 != 0) {
                if (n3 != n4) {
                    object3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object3;
                }
                object3 = this.b;
                object2 = this.a;
                vl2_2.b(object);
            } else {
                Object object4;
                vl2_2.b(object);
                object2 = lj.c;
                Object object5 = lj.a;
                object5 = object5.a();
                Object object6 = this.e;
                object5 = object5.invoke(object6);
                ((il_0)object2).c = object5 = (Ol)object5;
                object2 = this.f;
                object2 = object2.h();
                object5 = lj.e;
                ((h83_0)object5).setValue(object2);
                object2 = Boolean.TRUE;
                object5 = lj.d;
                ((h83_0)object5).setValue(object2);
                object2 = lj.c;
                object5 = ((il_0)object2).b;
                Object object7 = ((h83_0)object5).getValue();
                object5 = ((il_0)object2).c;
                Ol ol = Pl.a((Ol)object5);
                long l2 = ((il_0)object2).d;
                boolean bl2 = ((il_0)object2).f;
                Object object8 = ((il_0)object2).a;
                long l3 = Long.MIN_VALUE;
                Object object9 = object4;
                object4 = new il_0((Vs3)object8, object7, ol, l2, l3, bl2);
                object9 = new Ref$BooleanRef();
                object5 = this.f;
                long l4 = this.g;
                object2 = this.h;
                object8 = new Jj$a(lj, (il_0)object4, (Function1)object2, (Ref$BooleanRef)object9);
                this.a = object4;
                this.b = object9;
                this.c = n4;
                object2 = object4;
                Object object10 = object5;
                Object object11 = object8;
                object8 = object4;
                object4 = this;
                object2 = mg3_0.b((il_0)object2, (ol_1)object5, l4, (Function1)object11, this);
                if (object2 == object3) {
                    return object3;
                }
                object3 = object9;
                object2 = object8;
            }
            try {
                boolean bl3 = ((Ref$BooleanRef)object3).element;
                object3 = bl3 ? pl_1.BoundReached : pl_1.Finished;
            }
            catch (CancellationException cancellationException2) {}
            break block8;
            Lj.b(lj);
            return new sl_1((il_0)object2, (pl_1)((Object)object3));
        }
        Lj.b(lj);
        throw cancellationException2;
    }
}

