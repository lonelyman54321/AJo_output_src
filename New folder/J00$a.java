/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

public final class J00$a
implements h00_0,
yr0_2 {
    public final h00_0 a;
    public yr0_2 b;
    public final /* synthetic */ j00_0 c;

    public J00$a(j00_0 j00_02, h00_0 h00_02) {
        this.c = j00_02;
        this.a = h00_02;
    }

    public final void a(yr0_2 yr0_22) {
        Object object;
        h00_0 h00_02 = this.a;
        try {
            object = this.c;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            yr0_22.dispose();
            this.b = yr0_22 = gr0_2.DISPOSED;
            iz0_2.error(throwable, h00_02);
            return;
        }
        object = ((j00_0)object).b;
        object.accept(yr0_22);
        object = this.b;
        boolean bl2 = gr0_2.validate((yr0_2)object, yr0_22);
        if (bl2) {
            this.b = yr0_22;
            h00_02.a(this);
        }
    }

    public final void dispose() {
        Object object = this.c;
        object = ((j00_0)object).g;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final void onComplete() {
        Object object = this.a;
        j00_0 j00_02 = this.c;
        Object object2 = this.b;
        gr0_2 gr0_22 = gr0_2.DISPOSED;
        if (object2 == gr0_22) {
            return;
        }
        try {
            object2 = j00_02.d;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            object.onError(throwable);
            return;
        }
        object2.run();
        object2 = j00_02.e;
        object2.run();
        object.onComplete();
        object = j00_02.f;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
    }

    public final void onError(Throwable object) {
        j00_0 j00_02 = this.c;
        Object object2 = this.b;
        Object object3 = gr0_2.DISPOSED;
        if (object2 == object3) {
            dr2_2.b((Throwable)object);
            return;
        }
        object2 = j00_02.c;
        object2.accept(object);
        object2 = j00_02.e;
        try {
            object2.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            int n3 = 2;
            Throwable[] throwableArray = new Throwable[n3];
            throwableArray[0] = object;
            int n4 = 1;
            throwableArray[n4] = throwable;
            object = object3 = new CompositeException(throwableArray);
        }
        object2 = this.a;
        object2.onError((Throwable)object);
        object = j00_02.f;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
        }
    }
}

