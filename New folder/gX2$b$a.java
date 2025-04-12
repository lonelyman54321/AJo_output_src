/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class gX2$b$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ gx2_0 e;
    public final /* synthetic */ gr3 f;
    public final /* synthetic */ float g;

    public gX2$b$a(Object object, Object object2, gx2_0 gx2_02, gr3 gr32, float f5, f80_0 f80_02) {
        this.c = object;
        this.d = object2;
        this.e = gx2_02;
        this.f = gr32;
        this.g = f5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gr3 gr32 = this.f;
        float f5 = this.g;
        Object object2 = this.c;
        Object object3 = this.d;
        gx2_0 gx2_02 = this.e;
        gX2$b$a gX2$b$a = new gX2$b$a(object2, object3, gx2_02, gr32, f5, f80_02);
        gX2$b$a.b = object;
        return gX2$b$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gX2$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gX2$b$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        gx2_0 gx2_02 = this.e;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (i90_0)this.b;
            Object object2 = this.c;
            Object object3 = this.d;
            boolean bl2 = Intrinsics.areEqual(object2, object3);
            if (!bl2) {
                gx2_0.f(gx2_02);
            } else {
                gx2_02.n = null;
                Object object4 = gx2_02.c.getValue();
                bl2 = Intrinsics.areEqual(object4, object2);
                if (bl2) {
                    return Unit.a;
                }
            }
            int n7 = Intrinsics.areEqual(object2, object3);
            float f5 = this.g;
            if (n7 == 0) {
                object3 = this.f;
                ((gr3)object3).r(object2);
                long l2 = 0L;
                ((gr3)object3).p(l2);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = gx2_02.b;
                parcelableSnapshotMutableState.setValue(object2);
                ((gr3)object3).k(f5);
            }
            object2 = gx2_0.r;
            gx2_02.o(f5);
            object2 = gx2_02.m;
            n3 = ((l62)object2).b;
            if (n3 != 0) {
                object2 = new gX2$b$a$a(gx2_02, null);
                n7 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
            } else {
                long l3;
                gx2_02.l = l3 = Long.MIN_VALUE;
            }
            this.a = n4;
            object = gx2_0.j(gx2_02, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = gx2_0.r;
        gx2_02.n();
        return Unit.a;
    }
}

