/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LT1
 */
public final class lt1_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx2_0 c;
    public final /* synthetic */ d d;
    public final /* synthetic */ gr3 e;

    public lt1_2(gx2_0 gx2_02, d d2, gr3 gr32, f80_0 f80_02) {
        this.c = gx2_02;
        this.d = d2;
        this.e = gr32;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        d d2 = this.d;
        gr3 gr32 = this.e;
        gx2_0 gx2_02 = this.c;
        lt1_2 lt1_22 = new lt1_2(gx2_02, d2, gr32, f80_02);
        lt1_22.b = object;
        return lt1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lt1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lt1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != 0) {
            if (n3 != n7 && n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (i90_0)this.b;
            Object object2 = this.c;
            Object object3 = ((gx2_0)object2).c.getValue();
            d d2 = this.d;
            int n8 = Intrinsics.areEqual(object3, d2);
            if (n8 == 0) {
                this.a = n7;
                gr3 gr32 = ((gx2_0)object2).e;
                if (gr32 == null) {
                    object = Unit.a;
                } else {
                    d d5 = this.d;
                    float f6 = 0.0f;
                    Object var14_17 = null;
                    d2 = null;
                    object3 = object;
                    object = new ix2_1(null, null, (gx2_0)object2, gr32, d5);
                    object2 = ((gx2_0)object2).k;
                    if ((object = cs1_0.a((cs1_0)object2, (Function1)object, this)) != j90_02) {
                        object = Unit.a;
                    }
                }
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                gr3 gr33 = this.e;
                long l2 = gr33.g();
                long l3 = 1000000;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((gx2_0)object2).h;
                float f7 = parcelableSnapshotMutableFloatState.c();
                float f8 = parcelableSnapshotMutableFloatState.c();
                f5 = l2 /= l3;
                n7 = (int)(f8 * f5);
                n8 = 6;
                f8 = 0.0f;
                parcelableSnapshotMutableFloatState = null;
                Qs3 qs3 = Hl.c(n7, 0, null, n8);
                lt1$a_0 lt1$a_0 = new lt1$a_0((i90_0)object, (gx2_0)object2, d2);
                this.a = n4;
                Object var11_12 = null;
                int n10 = 4;
                object = mg3_0.c(f7, 0.0f, qs3, lt1$a_0, this, n10);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

