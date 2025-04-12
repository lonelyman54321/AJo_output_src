/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from nr3
 */
public final class nr3_0
extends qg3_2
implements Function2 {
    public float a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gr3 d;

    public nr3_0(gr3 gr32, f80_0 f80_02) {
        this.d = gr32;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gr3 gr32 = this.d;
        nr3_0 nr3_02 = new nr3_0(gr32, f80_02);
        nr3_02.c = object;
        return nr3_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nr3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nr3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        float f5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            f5 = this.a;
            object3 = (i90_0)this.c;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (i90_0)this.c;
            CoroutineContext coroutineContext = object.getCoroutineContext();
            f5 = mg3_0.h(coroutineContext);
            object3 = object;
        }
        do {
            boolean bl2;
            if (!(bl2 = kotlinx.coroutines.d.d((i90_0)object3))) {
                return Unit.a;
            }
            object2 = this.d;
            object = new nr3$a((gr3)object2, f5);
            this.c = object3;
            this.a = f5;
            this.b = n4;
        } while ((object = (object2 = aQ1.a(this.getContext())).R((Function1)object, this)) != j90_02);
        return j90_02;
    }
}

