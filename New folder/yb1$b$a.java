/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

public final class yb1$b$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ db1_2 c;
    public final /* synthetic */ i d;

    public yb1$b$a(Long l2, db1_2 db1_22, i i3, f80_0 f80_02) {
        this.b = l2;
        this.c = db1_22;
        this.d = i3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        db1_2 db1_22 = this.c;
        i i3 = this.d;
        Long l2 = this.b;
        object = new yb1$b$a(l2, db1_22, i3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yb1$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yb1$b$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            long l2 = this.b;
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        db1_2 db1_22 = this.c;
        Intrinsics.checkNotNullParameter(db1_22, "request");
        Object object2 = db1_22.a;
        ((eu3_0)object2).a();
        int n7 = 256;
        Object object3 = new StringBuilder(n7);
        fu3_0.a((eu3_0)object2, (StringBuilder)object3);
        object2 = ((StringBuilder)object3).toString();
        Intrinsics.checkNotNullExpressionValue(object2, "toString(...)");
        object3 = vb1_2.a;
        Intrinsics.checkNotNullParameter(object3, "key");
        Object object4 = va1_1.a;
        object4 = (Map)db1_22.f.a((xq_2)object4);
        if (object4 != null) {
            object3 = object4.get(object3);
        } else {
            n4 = 0;
            object3 = null;
        }
        object3 = (wb1_2)object3;
        if (object3 != null) {
            object3 = ((wb1_2)object3).a;
        } else {
            n4 = 0;
            object3 = null;
        }
        object = new HttpRequestTimeoutException((String)object2, (Long)object3, null);
        object2 = yb1_2.a;
        object3 = new StringBuilder("Request timeout: ");
        eu3_0 eu3_02 = db1_22.a;
        ((StringBuilder)object3).append(eu3_02);
        String string2 = ((StringBuilder)object3).toString();
        object2.g(string2);
        String string3 = ((Throwable)object).getMessage();
        Intrinsics.checkNotNull(string3);
        object = xc0_2.a(string3, (Throwable)object);
        this.d.d((CancellationException)object);
        return Unit.a;
    }
}

