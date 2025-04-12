/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

/*
 * Renamed from Z0
 */
public abstract class z0_0
implements ux1_2,
Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    public final /* synthetic */ boolean f(cu1_2 cu1_22) {
        return px1_2.a(this, cu1_22);
    }

    public final void g(String object) {
        object = cu1_2.TRACE;
        this.h((cu1_2)((Object)object));
    }

    public String getName() {
        return null;
    }

    public abstract void h(cu1_2 var1);

    public final void info(String object) {
        object = cu1_2.INFO;
        this.h((cu1_2)((Object)object));
    }

    public Object readResolve() {
        String string2 = this.getName();
        return wx1_2.b().a().a(string2);
    }
}

