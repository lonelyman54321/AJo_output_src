/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Y80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ ou0_0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Sk3 g;
    public final /* synthetic */ i72 h;

    public Y80(Vt1 vt1, ou0_0 ou0_02, boolean bl2, boolean bl3, Sk3 sk3, i72 i722) {
        this.c = vt1;
        this.d = ou0_02;
        this.e = bl2;
        this.f = bl3;
        this.g = sk3;
        this.h = i722;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (e72)object;
        long l2 = ((e72)object).a;
        int n3 = this.e;
        int n4 = 1;
        n3 ^= n4;
        Vt1 vt1 = this.c;
        boolean bl2 = vt1.b();
        if (!bl2) {
            object = this.d;
            ((ou0_0)object).b();
        } else if (n3 != 0 && (object = vt1.c) != null) {
            object.show();
        }
        n3 = vt1.b();
        if (n3 != 0 && (n3 = this.f) != 0) {
            x21_0 x21_02;
            object = vt1.a();
            if (object != (x21_02 = x21_0.Selection)) {
                object = vt1.d();
                if (object != null) {
                    n3 = ((Ul3)object).b(l2, n4 != 0);
                    n3 = this.h.a(n3);
                    Object object2 = vt1.d.a;
                    long l3 = nm3.a(n3, n3);
                    bl2 = false;
                    x21_02 = null;
                    object = ql3_0.a((ql3_0)object2, null, l3, 5);
                    object2 = vt1.t;
                    ((Vt1$b)object2).invoke(object);
                    object = vt1.a.a.a;
                    n3 = ((String)object).length();
                    if (n3 > 0) {
                        object = x21_0.Cursor;
                        object2 = vt1.k;
                        ((h83_0)object2).setValue(object);
                    }
                }
            } else {
                object = new e72(l2);
                Sk3 sk3 = this.g;
                sk3.g((e72)object);
            }
        }
        return Unit.a;
    }
}

