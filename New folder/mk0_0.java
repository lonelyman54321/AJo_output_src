/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mk0
 */
public final class mk0_0
implements vv1$a,
o60_0,
Continuation {
    public final /* synthetic */ Object a;

    public /* synthetic */ mk0_0(Object object) {
        this.a = object;
    }

    public /* synthetic */ mk0_0(oe$a oe$a, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        this.a = jm1_02;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void invoke(Object object) {
        object = (oe)object;
        jm1_0 jm1_02 = (jm1_0)this.a;
        object.q(jm1_02);
    }

    public Object then(Task task2) {
        return Utils.a((CountDownLatch)this.a, task2);
    }
}

