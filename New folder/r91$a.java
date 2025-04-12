/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r91$a
extends Lambda
implements Function1 {
    public final /* synthetic */ dl1_1 c;
    public final /* synthetic */ r91 d;
    public final /* synthetic */ Ns2 e;
    public final /* synthetic */ int f;

    public r91$a(dl1_1 dl1_12, r91 r912, Ns2 ns2, int n3) {
        this.c = dl1_12;
        this.d = r912;
        this.e = ns2;
        this.f = n3;
        super(1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        void var4_6;
        object = (Ns2$a)object;
        Object object2 = this.d;
        int n3 = ((r91)object2).c;
        Ul3 ul3 = (Ul3)((r91)object2).e.invoke();
        if (ul3 != null) {
            Tl3 tl3 = ul3.a;
        } else {
            Object var4_7 = null;
        }
        void var5_11 = var4_6;
        bp1_0 bp1_02 = this.c.getLayoutDirection();
        bp1_0 bp1_03 = bp1_0.Rtl;
        boolean bl2 = bp1_02 == bp1_03;
        Ns2 ns2 = this.e;
        int n4 = ns2.a;
        dl1_1 dl1_12 = this.c;
        dr3 dr32 = ((r91)object2).d;
        aG2 aG22 = Mk3.a(dl1_12, n3, dr32, (Tl3)var5_11, bl2, n4);
        pg2_0 pg2_02 = pg2_0.Horizontal;
        int n7 = ns2.a;
        object2 = ((r91)object2).b;
        int n8 = this.f;
        ((Pk3)object2).a(pg2_02, aG22, n8, n7);
        int n10 = Math.round(-((Pk3)object2).a.c());
        Ns2$a.f((Ns2$a)object, ns2, n10, 0);
        return Unit.a;
    }
}

