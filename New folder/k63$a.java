/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

public final class k63$a
extends AtomicReference
implements t53_0,
yr0_2 {
    private static final long serialVersionUID = -5314538511045349925L;
    public final t53_0 a;
    public final bx0_2 b;

    public k63$a(t53_0 t53_02, bx0_2 bx0_22) {
        this.a = t53_02;
        this.b = bx0_22;
    }

    public final void a(yr0_2 object) {
        boolean bl2 = gr0_2.setOnce(this, (yr0_2)object);
        if (bl2) {
            object = this.a;
            object.a(this);
        }
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onError(Throwable object) {
        Object object2;
        Object object3;
        t53_0 t53_02 = this.a;
        try {
            object3 = this.b;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            Throwable[] throwableArray = new Throwable[]{object, throwable};
            object2 = new CompositeException(throwableArray);
            t53_02.onError((Throwable)object2);
            return;
        }
        object3 = object3.apply(object);
        object2 = "The nextFunction returned a null SingleSource.";
        x03_0.b(object3, (String)object2);
        object3 = (q63_0)object3;
        object = new wm2_2(this, t53_02);
        object3.a((t53_0)object);
    }

    public final void onSuccess(Object object) {
        this.a.onSuccess(object);
    }
}

