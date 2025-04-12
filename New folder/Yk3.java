/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Yk3
extends Lambda
implements Function1 {
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ P70 d;

    public Yk3(P70 p70, Sk3 sk3) {
        this.c = sk3;
        this.d = p70;
        super(1);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke(Object object) {
        void var14_17;
        boolean bl2;
        Serializable serializable;
        boolean bl22;
        object = (M70)object;
        Sk3 sk3 = this.c;
        Object object2 = sk3.f;
        object2 = sk3.l();
        long l2 = ((ql3_0)object2).b;
        boolean bl3 = mm3.b(l2);
        boolean n3 = true;
        Object object3 = Ij3.Cut;
        Object object4 = sk3.k;
        if ((bl3 ^= n3) && (bl22 = (serializable = (Boolean)((h83_0)object4).getValue()).booleanValue())) {
            bl22 = true;
        } else {
            bl22 = false;
            serializable = null;
        }
        a80 a802 = new a80((Ij3)((Object)object3));
        P70 p70 = this.d;
        object3 = new Uk3(p70, sk3);
        M70.b((M70)object, a802, bl22, (Function0)object3);
        object3 = Ij3.Copy;
        serializable = new a80((Ij3)((Object)object3));
        object3 = new Vk3(p70, sk3);
        M70.b((M70)object, (a80)serializable, bl3, (Function0)object3);
        object2 = Ij3.Paste;
        object3 = (Boolean)((h83_0)object4).getValue();
        boolean n4 = (Boolean)object3;
        if (n4 && (object3 = sk3.g) != null && (bl2 = object3.c()) == n3) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            object3 = null;
        }
        object4 = new a80((Ij3)((Object)object2));
        object2 = new Wk3(p70, sk3);
        M70.b((M70)object, (a80)object4, (boolean)var14_17, (Function0)object2);
        object2 = Ij3.SelectAll;
        object3 = sk3.l();
        long l3 = ((ql3_0)object3).b;
        int n7 = mm3.c(l3);
        object4 = sk3.l().a.a;
        int n8 = ((String)object4).length();
        if (n7 == n8) {
            n3 = false;
        }
        object3 = new a80((Ij3)((Object)object2));
        object2 = new Xk3(0, p70, sk3);
        M70.b((M70)object, (a80)object3, n3, (Function0)object2);
        return Unit.a;
    }
}

