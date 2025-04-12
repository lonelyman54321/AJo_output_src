/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

/*
 * Renamed from v62$a
 */
public final class v62$a_0
implements e62_0,
yr0_2 {
    public final e62_0 a;
    public final o60_0 b;
    public final o60_0 c;
    public final j2_0 d;
    public final j2_0 e;
    public yr0_2 f;
    public boolean g;

    public v62$a_0(e62_0 e62_02, o60_0 o60_02, o60_0 o60_03, j2_0 j2_02, j2_0 j2_03) {
        this.a = e62_02;
        this.b = o60_02;
        this.c = o60_03;
        this.d = j2_02;
        this.e = j2_03;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.f;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (bl2) {
            this.f = object;
            object = this.a;
            object.a(this);
        }
    }

    public final void b(Object object) {
        o60_0 o60_02;
        boolean bl2 = this.g;
        if (bl2) {
            return;
        }
        try {
            o60_02 = this.b;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.f.dispose();
            this.onError(throwable);
            return;
        }
        o60_02.accept(object);
        this.a.b(object);
    }

    public final void dispose() {
        this.f.dispose();
    }

    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    public final void onComplete() {
        Object object;
        boolean bl2 = this.g;
        if (bl2) {
            return;
        }
        try {
            object = this.d;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.onError(throwable);
            return;
        }
        object.run();
        this.g = bl2 = true;
        object = this.a;
        object.onComplete();
        object = this.e;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
    }

    public final void onError(Throwable object) {
        int n3 = 1;
        boolean bl2 = this.g;
        if (bl2) {
            dr2_2.b((Throwable)object);
            return;
        }
        this.g = n3;
        o60_0 o60_02 = this.c;
        try {
            o60_02.accept(object);
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            int n4 = 2;
            Throwable[] throwableArray = new Throwable[n4];
            throwableArray[0] = object;
            throwableArray[n3] = throwable;
            CompositeException compositeException = new CompositeException(throwableArray);
            object = compositeException;
        }
        e62_0 e62_02 = this.a;
        e62_02.onError((Throwable)object);
        object = this.e;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
    }
}

