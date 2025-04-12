/*
 * Decompiled with CFR 0.152.
 */
public final class J53$a
implements t53_0 {
    public final t53_0 a;
    public final o60_0 b;
    public boolean c;

    public J53$a(t53_0 t53_02, o60_0 o60_02) {
        this.a = t53_02;
        this.b = o60_02;
    }

    public final void a(yr0_2 yr0_22) {
        o60_0 o60_02;
        t53_0 t53_02 = this.a;
        try {
            o60_02 = this.b;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.c = true;
            yr0_22.dispose();
            iz0_2.error(throwable, t53_02);
            return;
        }
        o60_02.accept(yr0_22);
        t53_02.a(yr0_22);
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.c;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.a.onError(throwable);
    }

    public final void onSuccess(Object object) {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        this.a.onSuccess(object);
    }
}

