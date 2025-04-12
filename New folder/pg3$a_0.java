/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pg3$a
 */
public final class pg3$a_0
implements f80_0,
k90_0 {
    public int a = -1 << -1;
    public final /* synthetic */ pg3_2 b;

    public pg3$a_0(pg3_2 pg3_22) {
        this.b = pg3_22;
    }

    public final k90_0 getCallerFrame() {
        Object object;
        int n3;
        Object object2;
        block8: {
            object2 = kb3_1.a;
            n3 = this.a;
            Object object3 = this.b;
            int n4 = -1 << -1;
            if (n3 == n4) {
                this.a = n3 = object3.f;
            }
            n3 = this.a;
            object = null;
            if (n3 < 0) {
                this.a = n4;
                object2 = null;
            } else {
                try {
                    object3 = object3.e;
                }
                catch (Throwable throwable) {}
                object3 = object3[n3];
                if (object3 == null) break block8;
                n3 += -1;
                this.a = n3;
                object2 = object3;
            }
        }
        n3 = object2 instanceof k90_0;
        if (n3 != 0) {
            object = object2;
            object = (k90_0)object2;
        }
        return object;
    }

    public final CoroutineContext getContext() {
        Object object = this.b;
        Object object2 = ((pg3_2)object).e;
        int n3 = ((pg3_2)object).f;
        if ((object2 = object2[n3]) != this && object2 != null) {
            return object2.getContext();
        }
        n3 += -1;
        while (n3 >= 0) {
            object2 = ((pg3_2)object).e;
            int n4 = n3 + -1;
            if ((object2 = object2[n3]) != this && object2 != null) {
                return object2.getContext();
            }
            n3 = n4;
        }
        object2 = "Not started".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void resumeWith(Object object) {
        boolean bl2 = object instanceof tL2$b;
        pg3_2 pg3_22 = this.b;
        if (bl2) {
            object = tl2_2.a(object);
            Intrinsics.checkNotNull(object);
            object = vl2_2.a((Throwable)object);
            pg3_22.f(object);
            return;
        }
        pg3_22.e(false);
    }
}

