/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

/*
 * Renamed from GS1
 */
public abstract class gs1_2
implements ux1_2,
Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    public final /* synthetic */ boolean f(cu1_2 cu1_22) {
        return px1_2.a(this, cu1_22);
    }

    public String getName() {
        return null;
    }

    public Object readResolve() {
        String string2 = this.getName();
        return wx1_2.b().a().a(string2);
    }
}

