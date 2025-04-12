/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class TS0$a
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ fs0_2 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public TS0$a(f80_0 f80_02, fs0_2 fs0_22, Ref$ObjectRef ref$ObjectRef) {
        this.b = fs0_22;
        this.c = ref$ObjectRef;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        fs0_2 fs0_22 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        TS0$a tS0$a = new TS0$a(f80_02, fs0_22, ref$ObjectRef);
        return tS0$a;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (TS0$a)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((TS0$a)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Ref$ObjectRef ref$ObjectRef = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = k52_0.a;
            Object object2 = ref$ObjectRef.element;
            if (object2 == object) {
                n3 = 0;
                object2 = null;
            }
            this.a = n4;
            object = this.b.emit(object2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        ref$ObjectRef.element = null;
        return Unit.a;
    }
}

