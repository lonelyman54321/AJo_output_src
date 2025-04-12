/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vv
 */
public final class vv_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Wv c;

    public vv_1(Wv wv, f80_0 f80_02) {
        this.c = wv;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Wv wv = this.c;
        vv_1 vv_12 = new vv_1(wv, f80_02);
        vv_12.b = object;
        return vv_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (vv_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vv_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Vv$b vv$b;
        Object object3;
        int n3;
        j90_0 j90_02;
        block6: {
            block7: {
                j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n4 = this.a;
                n3 = 1;
                if (n4 != 0) {
                    if (n4 == n3) {
                        vl2_2.b(object);
                        return Unit.a;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                object = (pz2_2)this.b;
                object3 = this.c;
                vv$b = new Vv$b((Wv)object3, (pz2_2)object);
                object3 = ((Wv)object3).a;
                object3.getClass();
                Intrinsics.checkNotNullParameter(vv$b, "listener");
                object2 = ((N50)object3).c;
                // MONITORENTER : object2
                Object object4 = ((N50)object3).d;
                int n7 = ((AbstractCollection)object4).add(vv$b);
                if (n7 == 0) break block6;
                object4 = ((N50)object3).d;
                n7 = ((AbstractCollection)object4).size();
                if (n7 != n3) break block7;
                ((N50)object3).e = object4 = ((N50)object3).a();
                object4 = qx1.a();
                Object object5 = ((N50)object3).e;
                Objects.toString(object5);
                object4.getClass();
                ((N50)object3).c();
            }
            object3 = ((N50)object3).e;
            vv$b.a(object3);
        }
        object3 = Unit.a;
        // MONITOREXIT : object2
        object2 = this.c;
        object3 = new Vv$a((Wv)object2, vv$b);
        this.a = n3;
        object = lz2_1.a((pz2_2)object, (Function0)object3, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

