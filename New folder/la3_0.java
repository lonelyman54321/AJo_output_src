/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

/*
 * Renamed from lA3
 */
public final class la3_0
extends iw_0 {
    public final Object i;

    public la3_0(LC1 lC1, Object object) {
        List list = Collections.emptyList();
        super(list);
        this.k(lC1);
        this.i = object;
    }

    public final float c() {
        return 1.0f;
    }

    public final Object f() {
        LC1 lC1 = this.e;
        float f5 = this.d;
        Object object = this.i;
        return lC1.b(0.0f, 0.0f, object, object, f5, f5, f5);
    }

    public final Object g(Bo1 bo1, float f5) {
        return this.f();
    }

    public final void i() {
        LC1 lC1 = this.e;
        if (lC1 != null) {
            super.i();
        }
    }

    public final void j(float f5) {
        this.d = f5;
    }
}

