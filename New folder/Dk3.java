/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.key.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

public final class Dk3
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ Sk3 d;
    public final /* synthetic */ ql3_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ i72 h;
    public final /* synthetic */ Pv3 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;

    public Dk3(Vt1 vt1, Sk3 sk3, ql3_0 ql3_02, boolean bl2, boolean bl3, i72 i722, Pv3 pv3, Vt1$b vt1$b, int n3) {
        this.c = vt1;
        this.d = sk3;
        this.e = ql3_02;
        this.f = bl2;
        this.g = bl3;
        this.h = i722;
        this.i = pv3;
        this.j = vt1$b;
        this.k = n3;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        Dk3 dk3 = this;
        Object object5 = object;
        object5 = (LP1)object;
        object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        ((Number)object3).intValue();
        int n3 = 851809892;
        object5.K(n3);
        object6 = object5.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object6 == b30$a$a) {
            object6 = new lm3();
            object5.o(object6);
        }
        Object object7 = object6;
        object7 = (lm3)object6;
        object6 = object5.v();
        if (object6 == b30$a$a) {
            object6 = new Ni0();
            object5.o(object6);
        }
        Object object8 = object6;
        object8 = (Ni0)object6;
        Pv3 pv3 = dk3.i;
        Object object9 = object4 = dk3.j;
        object9 = (Vt1$b)object4;
        Object object10 = dk3.c;
        Sk3 sk3 = dk3.d;
        ql3_0 ql3_02 = dk3.e;
        boolean bl2 = dk3.f;
        boolean bl3 = dk3.g;
        i72 i722 = dk3.h;
        int n4 = dk3.k;
        object4 = object6;
        object6 = new Bk3((Vt1)object10, sk3, ql3_02, bl2, bl3, (lm3)object7, i722, pv3, (Ni0)object8, (Vt1$b)object9, n4);
        boolean bl4 = object5.x(object6);
        object10 = object5.v();
        if (bl4 || object10 == b30$a$a) {
            Class<Bk3> clazz = Bk3.class;
            String string2 = "process";
            n4 = 1;
            String string3 = "process-ZmokQxo(Landroid/view/KeyEvent;)Z";
            object9 = object10;
            object10 = new FunctionReferenceImpl(n4, object6, clazz, string2, string3, 0);
            object5.o(object10);
        }
        object6 = a.a((Function1)((Object)((bn1_2)object10)));
        object5.E();
        return object6;
    }
}

