/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.HttpException;

public final class a$d
implements vj_2 {
    public final /* synthetic */ bl_2 a;

    public a$d(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void a(jj_2 object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        object = dl2_22.a;
        boolean bl2 = ((cl2_2)object).d();
        bl_2 bl_22 = this.a;
        if (bl2) {
            object = tl2_2.b;
            object = dl2_22.b;
            bl_22.resumeWith(object);
        } else {
            object = tl2_2.b;
            object = new HttpException(dl2_22);
            object = vl2_2.a((Throwable)object);
            bl_22.resumeWith(object);
        }
    }

    public final void b(jj_2 object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(throwable, "t");
        object = tl2_2.b;
        object = vl2_2.a(throwable);
        this.a.resumeWith(object);
    }
}

