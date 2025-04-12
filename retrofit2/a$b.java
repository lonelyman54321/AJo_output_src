/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.HttpException;

public final class a$b
implements vj_2 {
    public final /* synthetic */ bl_2 a;

    public a$b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void a(jj_2 object, dl2_2 object2) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(object2, "response");
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        bl_2 bl_22 = this.a;
        if (bl2) {
            object2 = ((dl2_2)object2).b;
            if (object2 == null) {
                object = object.request().d(mk1_0.class);
                Intrinsics.checkNotNull(object);
                object = (mk1_0)object;
                object2 = ((mk1_0)object).a;
                String string2 = "Response from ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                object2 = ((Class)object2).getName();
                stringBuilder.append((String)object2);
                char c2 = '.';
                stringBuilder.append(c2);
                object = ((mk1_0)object).c.getName();
                stringBuilder.append((String)object);
                stringBuilder.append(" was null but response body type was declared as non-null");
                object = stringBuilder.toString();
                object3 = new NullPointerException((String)object);
                object = tl2_2.b;
                object = vl2_2.a((Throwable)object3);
                bl_22.resumeWith(object);
            } else {
                object = tl2_2.b;
                bl_22.resumeWith(object2);
            }
        } else {
            object = tl2_2.b;
            object = new HttpException((dl2_2)object2);
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

