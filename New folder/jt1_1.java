/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from JT1
 */
public final class jt1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ gx2_0 b;
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ qr1_1 d;

    public jt1_1(gx2_0 gx2_02, tr1_0 tr1_02, qr1_1 qr1_12, f80_0 f80_02) {
        this.b = gx2_02;
        this.c = tr1_02;
        this.d = qr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gx2_0 gx2_02 = this.b;
        tr1_0 tr1_02 = (tr1_0)this.c;
        qr1_1 qr1_12 = this.d;
        object = new jt1_1(gx2_02, tr1_02, qr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jt1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jt1_1)object).invokeSuspend(object2);
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
            object = this.c;
            Object object2 = (List)object.getValue();
            int n7 = ((List)object.getValue()).size() + -2;
            object = (d)object2.get(n7);
            object2 = this.d;
            float f5 = object2.c();
            this.a = n4;
            gx2_0 gx2_02 = this.b;
            object = gx2_02.m(f5, object, this);
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

