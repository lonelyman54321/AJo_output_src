/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ET1
 */
public final class et1_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ A20 c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ qr1_1 e;
    public final /* synthetic */ tr1_0 f;

    public et1_1(A20 a20, tr1_0 tr1_02, qr1_1 qr1_12, tr1_0 tr1_03, f80_0 f80_02) {
        this.c = a20;
        this.d = tr1_02;
        this.e = qr1_12;
        this.f = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        et1_1 et1_12;
        Object object2 = this.d;
        ib3_0 ib3_02 = object2;
        ib3_02 = (tr1_0)object2;
        A20 a20 = this.c;
        qr1_1 qr1_12 = this.e;
        tr1_0 tr1_02 = this.f;
        object2 = et1_12;
        et1_12 = new et1_1(a20, (tr1_0)ib3_02, qr1_12, tr1_02, f80_02);
        et1_12.b = object;
        return et1_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (es0_2)object;
        object2 = (f80_0)object2;
        object = (et1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((et1_1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        tr1_0 tr1_02 = this.f;
        A20 a20 = this.c;
        int n4 = 1;
        ib3_0 ib3_02 = this.d;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            d d2 = (d)this.b;
            vl2_2.b(object);
        } else {
            Object object2;
            Object object3;
            vl2_2.b(object);
            object = (es0_2)this.b;
            Object object4 = (List)ib3_02.getValue();
            n3 = object4.size();
            qr1_1 qr1_12 = this.e;
            if (n3 > n4) {
                n3 = 0;
                qr1_12.k(0.0f);
                object4 = (d)CollectionsKt.T((List)ib3_02.getValue());
                Intrinsics.checkNotNull(object4);
                a20.b().e((d)object4);
                object3 = (List)ib3_02.getValue();
                int n7 = ((List)ib3_02.getValue()).size() + -2;
                object3 = (d)object3.get(n7);
                object2 = a20.b();
                ((kU1)object2).e((d)object3);
            } else {
                n3 = 0;
                object4 = null;
            }
            object2 = ib3_02;
            object2 = (tr1_0)ib3_02;
            object3 = new ET1$a((tr1_0)object2, tr1_02, qr1_12);
            this.b = object4;
            this.a = n4;
            object = object.collect((fs0_2)object3, this);
            if (object == j90_02) {
                return j90_02;
            }
            Object object5 = object4;
        }
        try {
            void var2_5;
            object = ib3_02.getValue();
            object = (List)object;
            int n8 = object.size();
            if (n8 <= n4) return Unit.a;
            object = Boolean.FALSE;
            tr1_02.setValue(object);
            Intrinsics.checkNotNull(var2_5);
            n8 = 0;
            object = null;
            a20.e((d)var2_5, false);
            return Unit.a;
        }
        catch (CancellationException cancellationException) {
            object = (List)ib3_02.getValue();
            int n10 = object.size();
            if (n10 <= n4) return Unit.a;
            object = Boolean.FALSE;
            tr1_02.setValue(object);
        }
        return Unit.a;
    }
}

