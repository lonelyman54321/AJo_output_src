/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class QR$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qr_2 c;
    public final /* synthetic */ fs0_2 d;

    public QR$a(qr_2 qr_22, fs0_2 fs0_22, f80_0 f80_02) {
        this.c = qr_22;
        this.d = fs0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qr_2 qr_22 = this.c;
        fs0_2 fs0_22 = this.d;
        QR$a qR$a = new QR$a(qr_22, fs0_22, f80_02);
        qR$a.b = object;
        return qR$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QR$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QR$a)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            qr_2 qr_22 = this.c;
            es0_2 es0_22 = qr_22.d;
            fs0_2 fs0_22 = this.d;
            QR$a$a qR$a$a = new QR$a$a(ref$ObjectRef, (i90_0)object, qr_22, fs0_22);
            this.a = n4;
            object = es0_22.collect(qR$a$a, this);
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

