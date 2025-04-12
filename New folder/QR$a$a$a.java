/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class QR$a$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qr_2 b;
    public final /* synthetic */ fs0_2 c;
    public final /* synthetic */ Object d;

    public QR$a$a$a(qr_2 qr_22, fs0_2 fs0_22, Object object, f80_0 f80_02) {
        this.b = qr_22;
        this.c = fs0_22;
        this.d = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs0_2 fs0_22 = this.c;
        Object object2 = this.d;
        qr_2 qr_22 = this.b;
        object = new QR$a$a$a(qr_22, fs0_22, object2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QR$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QR$a$a$a)object).invokeSuspend(object2);
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
            object = this.b.e;
            this.a = n4;
            fs0_2 fs0_22 = this.c;
            Object object2 = this.d;
            object = object.invoke(fs0_22, object2, this);
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

