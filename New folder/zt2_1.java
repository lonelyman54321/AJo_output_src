/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZT2
 */
public final class zt2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public zt2_1(l l2, float f5, float f6, f80_0 f80_02) {
        this.b = l2;
        this.c = f5;
        this.d = f6;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5 = this.c;
        float f6 = this.d;
        l l2 = this.b;
        object = new zt2_1(l2, f5, f6, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zt2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zt2_1)object).invokeSuspend(object2);
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
            object = this.b.C;
            float f5 = this.c;
            float f6 = this.d;
            long l2 = h72.a(f5, f6);
            this.a = n4;
            object = i.a((ku2_0)object, l2, this);
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

