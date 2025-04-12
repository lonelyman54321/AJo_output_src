/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vB3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ dl1_1 c;
    public final /* synthetic */ vb3_1 d;
    public final /* synthetic */ Ns2 e;
    public final /* synthetic */ int f;

    public vB3$a(dl1_1 dl1_12, vb3_1 vb3_12, Ns2 ns2, int n3) {
        this.c = dl1_12;
        this.d = vb3_12;
        this.e = ns2;
        this.f = n3;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Object object2 = this.d;
        int n3 = ((vb3_1)object2).c;
        Object object3 = (Ul3)((vb3_1)object2).e.invoke();
        object3 = object3 != null ? ((Ul3)object3).a : null;
        Object object4 = object3;
        Ns2 ns2 = this.e;
        int n4 = ns2.a;
        dr3 dr32 = ((vb3_1)object2).d;
        object3 = Mk3.a(this.c, n3, dr32, (Tl3)object4, false, n4);
        pg2_0 pg2_02 = pg2_0.Vertical;
        int n7 = ns2.b;
        object2 = ((vb3_1)object2).b;
        int n8 = this.f;
        ((Pk3)object2).a(pg2_02, (aG2)object3, n8, n7);
        int n10 = Math.round(-((Pk3)object2).a.c());
        Ns2$a.f((Ns2$a)object, ns2, 0, n10);
        return Unit.a;
    }
}

