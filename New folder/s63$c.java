/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class s63$c
extends AtomicReference
implements t53_0 {
    private static final long serialVersionUID = 3323743579927613702L;
    public final s63$b a;
    public final int b;

    public s63$c(s63$b s63$b, int n3) {
        this.a = s63$b;
        this.b = n3;
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this, yr0_22);
    }

    public final void onError(Throwable throwable) {
        s63$b s63$b = this.a;
        int n3 = this.b;
        s63$b.a(throwable, n3);
    }

    public final void onSuccess(Object object) {
        Object object2 = this.a;
        t53_0 t53_02 = ((s63$b)object2).a;
        int n3 = this.b;
        Object[] objectArray = ((s63$b)object2).d;
        objectArray[n3] = object;
        int n4 = ((AtomicInteger)object2).decrementAndGet();
        if (n4 == 0) {
            object = ((s63$b)object2).b;
            object = object.apply(objectArray);
            object2 = "The zipper returned a null value";
            try {
                x03_0.b(object, (String)object2);
                t53_02.onSuccess(object);
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                t53_02.onError(throwable);
            }
        }
    }
}

