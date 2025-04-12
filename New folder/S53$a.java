/*
 * Decompiled with CFR 0.152.
 */
public final class S53$a
implements t53_0 {
    public final t53_0 a;
    public final bx0_2 b;

    public S53$a(t53_0 t53_02, bx0_2 bx0_22) {
        this.a = t53_02;
        this.b = bx0_22;
    }

    public final void a(yr0_2 yr0_22) {
        this.a.a(yr0_22);
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }

    public final void onSuccess(Object object) {
        Object object2;
        try {
            object2 = this.b;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.onError(throwable);
            return;
        }
        object = object2.apply(object);
        object2 = "The mapper function returned a null value.";
        x03_0.b(object, (String)object2);
        this.a.onSuccess(object);
    }
}

