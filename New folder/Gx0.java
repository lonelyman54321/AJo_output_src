/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Gx0 {
    public ql3_0 a;
    public Xx0 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ql3_0 a(List object) {
        Object object2;
        Object object3;
        StringBuilder stringBuilder;
        Object object4;
        block10: {
            int n3;
            int n4;
            int n7 = 0;
            object4 = null;
            try {
                n4 = object.size();
                stringBuilder = null;
                object3 = null;
            }
            catch (Exception exception) {
                object3 = null;
                object4 = exception;
            }
            for (n3 = 0; n3 < n4; ++n3) {
                try {
                    object2 = object.get(n3);
                    object2 = (mx0)object2;
                }
                catch (Exception exception) {
                    break block10;
                }
                try {
                    object3 = this.b;
                    object2.a((Xx0)object3);
                    object3 = object2;
                    continue;
                }
                catch (Exception exception) {
                    object3 = object2;
                    break block10;
                }
            }
            object = this.b;
            object.getClass();
            object = ((Xx0)object).a.toString();
            Sl sl = new Sl(6, (String)object, null);
            object = this.b;
            n3 = ((Xx0)object).b;
            int n8 = ((Xx0)object).c;
            long l2 = nm3.a(n3, n8);
            object = new mm3(l2);
            object2 = this.a;
            long l3 = ((ql3_0)object2).b;
            boolean bl2 = mm3.f(l3);
            if (!bl2) {
                object4 = object;
            }
            if (object4 != null) {
                l2 = ((mm3)object4).a;
            } else {
                n8 = mm3.d(l2);
                n7 = mm3.e(l2);
                l2 = nm3.a(n8, n7);
            }
            object = this.b.c();
            this.a = object4 = new ql3_0(sl, l2, (mm3)object);
            return object4;
        }
        stringBuilder = new StringBuilder();
        object2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
        int n10 = this.b.a.a();
        ((StringBuilder)object2).append(n10);
        ((StringBuilder)object2).append(", composition=");
        Object object5 = this.b.c();
        ((StringBuilder)object2).append(object5);
        ((StringBuilder)object2).append(", selection=");
        object5 = this.b;
        int n14 = ((Xx0)object5).b;
        n10 = ((Xx0)object5).c;
        object5 = mm3.g(nm3.a(n14, n10));
        ((StringBuilder)object2).append(object5);
        ((StringBuilder)object2).append("):");
        object2 = ((StringBuilder)object2).toString();
        stringBuilder.append((String)object2);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(value)");
        stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append('\\n')");
        object = (Iterable)object;
        object2 = new fx0_1((mx0)object3, this);
        CollectionsKt.Q((Iterable)object, stringBuilder, "\n", (Function1)object2, 60);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
        RuntimeException runtimeException = new RuntimeException((String)object, (Throwable)object4);
        throw runtimeException;
    }

    public final void b(ql3_0 ql3_02, Il3 il3) {
        int n3;
        int n4;
        Object object = this.b.c();
        Object object2 = ql3_02.c;
        boolean bl2 = Intrinsics.areEqual(object2, object);
        boolean bl3 = true;
        bl2 ^= bl3;
        Object object3 = this.a.a;
        Sl sl = ql3_02.a;
        int n7 = Intrinsics.areEqual(object3, sl);
        boolean bl4 = false;
        long l2 = ql3_02.b;
        if (n7 == 0) {
            this.b = object3 = new Xx0(sl, l2);
        } else {
            object3 = this.a;
            long l3 = ((ql3_0)object3).b;
            n7 = mm3.a(l3, l2);
            if (n7 == 0) {
                object3 = this.b;
                n4 = mm3.e(l2);
                n3 = mm3.d(l2);
                ((Xx0)object3).f(n4, n3);
                bl3 = false;
                bl4 = true;
            } else {
                bl3 = false;
            }
        }
        n7 = -1;
        if (object2 == null) {
            object2 = this.b;
            ((Xx0)object2).d = n7;
            ((Xx0)object2).e = n7;
        } else {
            l2 = ((mm3)object2).a;
            boolean bl5 = mm3.b(l2);
            if (!bl5) {
                object2 = this.b;
                n4 = mm3.e(l2);
                n3 = mm3.d(l2);
                ((Xx0)object2).e(n4, n3);
            }
        }
        if (bl3 || !bl4 && bl2) {
            object = this.b;
            ((Xx0)object).d = n7;
            ((Xx0)object).e = n7;
            bl2 = false;
            object = null;
            long l4 = 0L;
            n7 = 3;
            ql3_02 = ql3_0.a(ql3_02, null, l4, n7);
        }
        object = this.a;
        this.a = ql3_02;
        if (il3 != null) {
            il3.a((ql3_0)object, ql3_02);
        }
    }
}

