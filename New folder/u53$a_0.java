/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

/*
 * Renamed from U53$a
 */
public final class u53$a_0
implements t53_0 {
    public final t53_0 a;
    public final /* synthetic */ u53_0 b;

    public u53$a_0(u53_0 u53_02, t53_0 t53_02) {
        this.b = u53_02;
        this.a = t53_02;
    }

    public final void a(yr0_2 yr0_22) {
        this.a.a(yr0_22);
    }

    public final void onError(Throwable throwable) {
        Object object = this.b;
        Object object2 = ((u53_0)object).b;
        t53_0 t53_02 = this.a;
        if (object2 != null) {
            try {
                object = object2.apply(throwable);
            }
            catch (Throwable throwable2) {
                mm0.h(throwable2);
                Throwable[] throwableArray = new Throwable[]{throwable, throwable2};
                object2 = new CompositeException(throwableArray);
                t53_02.onError((Throwable)object2);
                return;
            }
        } else {
            object = ((u53_0)object).c;
        }
        if (object == null) {
            object = new NullPointerException("Value supplied was null");
            ((Throwable)object).initCause(throwable);
            t53_02.onError((Throwable)object);
            return;
        }
        t53_02.onSuccess(object);
    }

    public final void onSuccess(Object object) {
        this.a.onSuccess(object);
    }
}

