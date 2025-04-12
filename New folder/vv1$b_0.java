/*
 * Decompiled with CFR 0.152.
 */
import androidx.loader.content.a;

/*
 * Renamed from Vv1$b
 */
public final class vv1$b_0
implements F62 {
    public final a a;
    public final Uv1$a b;
    public boolean c = false;

    public vv1$b_0(a a2, Uv1$a uv1$a) {
        this.a = a2;
        this.b = uv1$a;
    }

    public final void onChanged(Object object) {
        Uv1$a uv1$a = this.b;
        a a2 = this.a;
        uv1$a.onLoadFinished(a2, object);
        this.c = true;
    }

    public final String toString() {
        return this.b.toString();
    }
}

