/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from oo0
 */
public final class oo0_0
implements b93 {
    public final Al3 a;

    public oo0_0(Al3 al3) {
        this.a = al3;
    }

    public final void hide() {
        this.a.a.e();
    }

    public final void show() {
        Object object = this.a;
        Il3 il3 = (Il3)((Al3)object).b.get();
        if (il3 != null) {
            object = ((Al3)object).a;
            object.g();
        }
    }
}

