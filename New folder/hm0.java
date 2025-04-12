/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.collections.CollectionsKt;

public final class hm0
implements at1_0 {
    public final int a;
    public int b;
    public xs1$b c;
    public boolean d;

    public hm0(int n3) {
        this.a = n3;
        this.b = -1;
    }

    public final void a(mu1_0 mu1_02, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.a); ++i3) {
            n4 = n3 + i3;
            mu1_02.a(n4);
        }
    }

    public final void b(Zs1 object, float f5, Ts1 ts1) {
        Collection collection = ts1.i();
        Object object2 = collection.isEmpty();
        int n3 = 1;
        if ((object2 ^= n3) != 0) {
            int n4;
            collection = null;
            float f6 = f5 - 0.0f;
            object2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                object2 = 1;
            } else {
                object2 = 0;
                collection = null;
            }
            if (object2 != 0) {
                Js1 js1 = (Js1)CollectionsKt.S(ts1.i());
                n4 = js1.getIndex() + n3;
            } else {
                Js1 js1 = (Js1)CollectionsKt.L(ts1.i());
                n4 = js1.getIndex() - n3;
            }
            if (n4 >= 0 && n4 < (n3 = ts1.g())) {
                n3 = this.b;
                if (n4 != n3) {
                    xs1$b xs1$b;
                    n3 = (int)(this.d ? 1 : 0);
                    if (n3 != object2 && (xs1$b = this.c) != null) {
                        xs1$b.cancel();
                    }
                    this.d = object2;
                    this.b = n4;
                    this.c = object = object.a(n4);
                }
                if (object2 != 0) {
                    object = (Js1)CollectionsKt.S(ts1.i());
                    object2 = ts1.h();
                    n3 = object.getOffset();
                    int n7 = object.getSize() + n3 + object2;
                    int n8 = ts1.d();
                    float f7 = n7 - n8;
                    float f8 = f7 - (f5 = -f5);
                    if ((n7 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) < 0 && (object = this.c) != null) {
                        object.b();
                    }
                } else {
                    object = (Js1)CollectionsKt.L(ts1.i());
                    int n10 = ts1.f();
                    int n14 = object.getOffset();
                    float f11 = n10 -= n14;
                    float f12 = f11 - f5;
                    if ((n14 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1))) < 0 && (object = this.c) != null) {
                        object.b();
                    }
                }
            }
        }
    }

    public final void c(Ts1 object) {
        Collection collection;
        int n3 = this.b;
        int n4 = -1;
        if (n3 != n4 && (n3 = (collection = (Collection)object.i()).isEmpty() ^ 1) != 0) {
            int n7;
            n3 = (int)(this.d ? 1 : 0);
            if (n3 != 0) {
                object = (Js1)CollectionsKt.S(object.i());
                n7 = object.getIndex() + 1;
            } else {
                object = (Js1)CollectionsKt.L(object.i());
                n7 = object.getIndex() + -1;
            }
            n3 = this.b;
            if (n3 != n7) {
                this.b = n4;
                object = this.c;
                if (object != null) {
                    object.cancel();
                }
                n7 = 0;
                object = null;
                this.c = null;
            }
        }
    }
}

