/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

/*
 * Renamed from LJ$a
 */
public final class lj$a_1
implements yr0_2,
vj_2 {
    public final jj_2 a;
    public final e62_0 b;
    public volatile boolean c;
    public boolean d = false;

    public lj$a_1(jj_2 jj_22, e62_0 e62_02) {
        this.a = jj_22;
        this.b = e62_02;
    }

    public final void a(jj_2 jj_22, dl2_2 object) {
        block10: {
            int n3 = 1;
            boolean bl2 = this.c;
            if (bl2) {
                return;
            }
            e62_0 e62_02 = this.b;
            e62_02.b(object);
            boolean bl3 = this.c;
            if (bl3) break block10;
            this.d = n3;
            object = this.b;
            try {
                object.onComplete();
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                bl2 = this.d;
                if (bl2) {
                    dr2_2.b(throwable);
                    break block10;
                }
                bl2 = this.c;
                if (bl2) break block10;
                e62_02 = this.b;
                try {
                    e62_02.onError(throwable);
                }
                catch (Throwable throwable2) {
                    mm0.h(throwable2);
                    int n4 = 2;
                    Throwable[] throwableArray = new Throwable[n4];
                    throwableArray[0] = throwable;
                    throwableArray[n3] = throwable2;
                    CompositeException compositeException = new CompositeException(throwableArray);
                    dr2_2.b(compositeException);
                }
            }
        }
    }

    public final void b(jj_2 object, Throwable throwable) {
        boolean bl2 = object.a();
        if (bl2) {
            return;
        }
        object = this.b;
        try {
            object.onError(throwable);
        }
        catch (Throwable throwable2) {
            mm0.h(throwable2);
            int n3 = 2;
            Throwable[] throwableArray = new Throwable[n3];
            throwableArray[0] = throwable;
            int n4 = 1;
            throwableArray[n4] = throwable2;
            CompositeException compositeException = new CompositeException(throwableArray);
            dr2_2.b(compositeException);
        }
    }

    public final void dispose() {
        this.c = true;
        this.a.cancel();
    }

    public final boolean isDisposed() {
        return this.c;
    }
}

