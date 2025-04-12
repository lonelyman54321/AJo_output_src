/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from rr1
 */
public final class rr1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ qr1_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public rr1_2(qr1_0 qr1_02, int n3, int n4, f80_0 f80_02) {
        this.a = qr1_02;
        this.b = n3;
        this.c = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.b;
        int n4 = this.c;
        qr1_0 qr1_02 = this.a;
        object = new rr1_2(qr1_02, n3, n4, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (rr1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rr1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((qr1_0)object).b;
        Object object3 = ((kr1_0)object2).a;
        int n3 = ((e83_0)object3).o();
        int n4 = this.c;
        int n7 = this.b;
        if (n3 != n7 || (n3 = ((e83_0)(object3 = ((kr1_0)object2).b)).o()) != n4) {
            object3 = ((qr1_0)object).k;
            ((LazyLayoutItemAnimator)object3).f();
        }
        ((kr1_0)object2).a(n7, n4);
        n3 = 0;
        object3 = null;
        ((kr1_0)object2).d = null;
        object = ((qr1_0)object).h;
        if (object != null) {
            object.f();
        }
        return Unit.a;
    }
}

