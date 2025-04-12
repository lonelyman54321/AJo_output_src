/*
 * Decompiled with CFR 0.152.
 */
public final class z0$a
implements BD3 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ z0 c;

    public z0$a(z0 z02) {
        this.c = z02;
    }

    public final void a() {
        z0.a(this.c);
        this.a = false;
    }

    public final void onAnimationCancel() {
        this.a = true;
    }

    public final void onAnimationEnd() {
        boolean bl2 = this.a;
        if (bl2) {
            return;
        }
        z0 z02 = this.c;
        z02.f = null;
        int n3 = this.b;
        z0.b(z02, n3);
    }
}

