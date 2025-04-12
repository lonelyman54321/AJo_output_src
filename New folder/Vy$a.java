/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import retrofit2.HttpException;

public final class Vy$a
implements e62_0 {
    public final e62_0 a;
    public boolean b;

    public Vy$a(e62_0 e62_02) {
        this.a = e62_02;
    }

    public final void a(yr0_2 yr0_22) {
        this.a.a(yr0_22);
    }

    public final void c(dl2_2 object) {
        int n3 = 1;
        Object object2 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object2).d();
        Object object3 = this.a;
        if (bl2) {
            object = ((dl2_2)object).b;
            object3.b(object);
        } else {
            this.b = n3;
            object2 = new HttpException((dl2_2)object);
            try {
                object3.onError((Throwable)object2);
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                int n4 = 2;
                Throwable[] throwableArray = new Throwable[n4];
                throwableArray[0] = object2;
                throwableArray[n3] = throwable;
                object3 = new CompositeException(throwableArray);
                dr2_2.b((Throwable)object3);
            }
        }
    }

    public final void onComplete() {
        boolean bl2 = this.b;
        if (!bl2) {
            e62_0 e62_02 = this.a;
            e62_02.onComplete();
        }
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.b;
        if (!bl2) {
            e62_0 e62_02 = this.a;
            e62_02.onError(throwable);
        } else {
            String string2 = "This should never happen! Report as a bug with the full stacktrace.";
            AssertionError assertionError = new AssertionError((Object)string2);
            ((Throwable)((Object)assertionError)).initCause(throwable);
            dr2_2.b((Throwable)((Object)assertionError));
        }
    }
}

