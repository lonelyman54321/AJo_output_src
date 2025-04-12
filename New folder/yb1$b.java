/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

public final class yb1$b
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ dZ2$a b;
    public /* synthetic */ db1_2 c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ Long f;

    public yb1$b(Long l2, Long l3, Long l4, f80_0 f80_02) {
        this.d = l2;
        this.e = l3;
        this.f = l4;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (dZ2$a)object;
        object2 = (db1_2)object2;
        object3 = (f80_0)object3;
        Long l2 = this.d;
        Long l3 = this.e;
        Long l4 = this.f;
        yb1$b yb1$b = new yb1$b(l2, l3, l4, (f80_0)object3);
        yb1$b.b = object;
        yb1$b.c = object2;
        object = Unit.a;
        return yb1$b.invokeSuspend(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    return object;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
            return object;
        }
        vl2_2.b(object);
        object = this.b;
        db1_2 db1_22 = this.c;
        Object object2 = db1_22.a.c();
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Object object3 = ((iu3_0)object2).a;
        boolean bl3 = Intrinsics.areEqual(object3, "ws");
        if (!bl3 && !(bl2 = Intrinsics.areEqual(object2 = ((iu3_0)object2).a, object3 = "wss"))) {
            Object object4 = vb1_2.a;
            object2 = "key";
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            object3 = va1_1.a;
            e40_0 e40_02 = db1_22.f;
            Object object5 = (Map)e40_02.a((xq_2)object3);
            object5 = object5 != null ? object5.get(object4) : null;
            object5 = (wb1_2)object5;
            Object object6 = this.f;
            Object object7 = this.e;
            Object object8 = this.d;
            if (object5 == null) {
                if (object8 != null || object7 != null || object6 != null) {
                    object5 = new wb1_2();
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    Intrinsics.checkNotNullParameter(object5, "capability");
                    object2 = new Object();
                    object2 = (Map)e40_02.c((xq_2)object3, (Function0)object2);
                    object2.put(object4, object5);
                }
            }
            if (object5 != null) {
                object4 = ((wb1_2)object5).b;
                if (object4 != null) {
                    object7 = object4;
                }
                wb1_2.a((Long)object7);
                ((wb1_2)object5).b = object7;
                object4 = ((wb1_2)object5).c;
                if (object4 != null) {
                    object6 = object4;
                }
                wb1_2.a((Long)object6);
                ((wb1_2)object5).c = object6;
                object4 = ((wb1_2)object5).a;
                if (object4 != null) {
                    object8 = object4;
                }
                wb1_2.a((Long)object8);
                ((wb1_2)object5).a = object8;
                if (object8 != null) {
                    long l2 = Long.MAX_VALUE;
                    long l3 = (Long)object8;
                    long l4 = l3 - l2;
                    Object object9 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object9 != false) {
                        object4 = db1_22.e;
                        object2 = new yb1$b$a((Long)object8, db1_22, (i)object4, null);
                        n7 = 3;
                        object4 = Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
                        object2 = db1_22.e;
                        object3 = new zb1_2((mb3_2)object4);
                        object2.G((Function1)object3);
                    }
                }
            }
            this.b = null;
            this.a = n4;
            object = ((dZ2$a)object).a.a(db1_22, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        this.b = null;
        this.a = n7;
        object = ((dZ2$a)object).a.a(db1_22, this);
        if (object != j90_02) return object;
        return j90_02;
    }
}

