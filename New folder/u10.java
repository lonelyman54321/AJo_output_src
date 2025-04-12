/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class u10
implements Function2,
gx0_2,
hx0_2,
ix0_2,
jx0_2,
kx0_2,
lx0_2,
mx0_2,
rx0_2,
sx0_2,
ux0_2,
vx0_2,
wx0_2,
xx0_2,
yx0_2,
zx0_2,
ax0_2,
cx0_2,
dx0_2 {
    public final int a;
    public final boolean b;
    public Object c;
    public BF2 d;
    public ArrayList e;

    public u10(int n3, Object object, boolean bl2) {
        this.a = n3;
        this.b = bl2;
        this.c = object;
    }

    public final Object a(Object object, b30_0 object2, int n3) {
        int n4 = this.a;
        object2 = object2.g(n4);
        this.e((b30_0)object2);
        n4 = (int)(((j30_0)object2).J(this) ? 1 : 0);
        int n7 = 1;
        n4 = n4 != 0 ? v10.a(2, n7) : v10.a(n7, n7);
        n4 |= n3;
        Object object3 = this.c;
        String string2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>";
        Intrinsics.checkNotNull(object3, string2);
        int n8 = 3;
        object3 = (gx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, n8);
        Object object4 = n4;
        object4 = object3.invoke(object, object2, object4);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object3 = new u10$a(this, object, n3);
        }
        return object4;
    }

    public final Object b(Object object, Object object2, b30_0 object3, int n3) {
        int n4 = this.a;
        object3 = object3.g(n4);
        this.e((b30_0)object3);
        n4 = (int)(((j30_0)object3).J(this) ? 1 : 0);
        int n7 = 2;
        n4 = n4 != 0 ? v10.a(n7, n7) : v10.a(1, n7);
        n4 |= n3;
        Object object4 = this.c;
        String string2 = "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>";
        Intrinsics.checkNotNull(object4, string2);
        int n8 = 4;
        object4 = (hx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, n8);
        Object object5 = n4;
        object5 = object4.invoke(object, object2, object3, object5);
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            ((CF2)object3).d = object4 = new u10$b(this, object, object2, n3);
        }
        return object5;
    }

    public final Object c(Object object, Object object2, Object object3, b30_0 object4, int n3) {
        int n4 = this.a;
        object4 = object4.g(n4);
        this.e((b30_0)object4);
        n4 = (int)(((j30_0)object4).J(this) ? 1 : 0);
        int n7 = 3;
        n4 = n4 != 0 ? v10.a(2, n7) : v10.a(1, n7);
        Object object5 = this.c;
        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        int n8 = 5;
        object5 = (ix0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object5, n8);
        Integer n10 = n4 |= n3;
        Object object6 = object5.invoke(object, object2, object3, object4, n10);
        object4 = ((j30_0)object4).X();
        if (object4 != null) {
            u10$c u10$c;
            object5 = u10$c;
            u10$c = new u10$c(this, object, object2, object3, n3);
            ((CF2)object4).d = u10$c;
        }
        return object6;
    }

    public final Object d(Object object, Object object2, Object object3, Object object4, b30_0 object5, int n3) {
        int n4 = this.a;
        object5 = object5.g(n4);
        this.e((b30_0)object5);
        n4 = (int)(((j30_0)object5).J(this) ? 1 : 0);
        int n7 = 4;
        n4 = n4 != 0 ? v10.a(2, n7) : v10.a(1, n7);
        Object object6 = this.c;
        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        int n8 = 6;
        object6 = (jx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object6, n8);
        Integer n10 = n4 |= n3;
        Object object7 = object6.invoke(object, object2, object3, object4, object5, n10);
        object5 = ((j30_0)object5).X();
        if (object5 != null) {
            u10$d u10$d;
            object6 = u10$d;
            u10$d = new u10$d(this, object, object2, object3, object4, n3);
            ((CF2)object5).d = u10$d;
        }
        return object7;
    }

    public final void e(b30_0 arrayList) {
        CF2 cF2;
        boolean bl2 = this.b;
        if (bl2 && (cF2 = arrayList.s()) != null) {
            arrayList.B(cF2);
            arrayList = this.d;
            boolean bl3 = v10.d((BF2)((Object)arrayList), cF2);
            if (bl3) {
                this.d = cF2;
            } else {
                arrayList = this.e;
                if (arrayList == null) {
                    this.e = arrayList = new ArrayList();
                    arrayList.add(cF2);
                } else {
                    int n3 = arrayList.size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        BF2 bF2 = (BF2)arrayList.get(i3);
                        boolean bl4 = v10.d(bF2, cF2);
                        if (!bl4) continue;
                        arrayList.set(i3, cF2);
                        return;
                    }
                    arrayList.add(cF2);
                }
            }
        }
    }

    public final void f(fx0_2 object) {
        Object object2 = this.c;
        int n3 = Intrinsics.areEqual(object2, object);
        if (n3 == 0) {
            boolean bl2;
            object2 = this.c;
            int n4 = 0;
            if (object2 == null) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            this.c = object;
            if (n3 == 0 && (bl2 = this.b)) {
                object = this.d;
                if (object != null) {
                    object.invalidate();
                    bl2 = false;
                    object = null;
                    this.d = null;
                }
                if ((object = this.e) != null) {
                    n3 = ((ArrayList)object).size();
                    while (n4 < n3) {
                        BF2 bF2 = (BF2)((ArrayList)object).get(n4);
                        bF2.invalidate();
                        ++n4;
                    }
                    ((ArrayList)object).clear();
                }
            }
        }
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        int n4 = this.a;
        object = object.g(n4);
        this.e((b30_0)object);
        n4 = (int)(((j30_0)object).J(this) ? 1 : 0);
        String string2 = null;
        int n7 = 2;
        n4 = n4 != 0 ? v10.a(n7, 0) : v10.a(1, 0);
        Object object3 = this.c;
        string2 = "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>";
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, n7);
        object2 = n3 |= n4;
        object2 = object3.invoke(object, object2);
        object = ((j30_0)object).X();
        if (object != null) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            ((CF2)object).d = object3 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this, n7);
        }
        return object2;
    }
}

