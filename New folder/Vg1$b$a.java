/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class Vg1$b$a
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ vg1_0 d;
    public final /* synthetic */ Ref$FloatRef e;
    public final /* synthetic */ i90_0 f;

    public Vg1$b$a(tr1_0 tr1_02, vg1_0 vg1_02, Ref$FloatRef ref$FloatRef, i90_0 i90_02) {
        this.c = tr1_02;
        this.d = vg1_02;
        this.e = ref$FloatRef;
        this.f = i90_02;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        float f6;
        float f7;
        float f8;
        float f11;
        long l2;
        long l3 = ((Number)object).longValue();
        object = (ib3_0)this.c.getValue();
        if (object != null) {
            object = (Number)object.getValue();
            l2 = ((Number)object).longValue();
        } else {
            l2 = l3;
        }
        object = this.d;
        long l4 = ((vg1_0)object).c;
        boolean bl2 = true;
        Object object5 = ((vg1_0)object).a;
        long l7 = Long.MIN_VALUE;
        Object object6 = this.f;
        int n4 = 0;
        Object object7 = this.e;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false || (f11 = (f8 = (f7 = ((Ref$FloatRef)object7).element) - (f6 = mg3_0.h((CoroutineContext)(object4 = object6.getCoroutineContext())))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) != false) {
            ((vg1_0)object).c = l3;
            n3 = ((WR1)object5).c;
            if (n3 > 0) {
                object3 = ((WR1)object5).a;
                f11 = 0.0f;
                f7 = 0.0f;
                do {
                    object4 = (Vg1$a)object3[f11];
                    ((Vg1$a)object4).h = bl2;
                } while (++f11 < n3);
            }
            object2 = object6.getCoroutineContext();
            ((Ref$FloatRef)object7).element = f5 = mg3_0.h((CoroutineContext)object2);
        }
        f5 = ((Ref$FloatRef)object7).element;
        float f12 = 0.0f;
        object3 = null;
        float f14 = f5 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (f15 == false) {
            int n7 = ((WR1)object5).c;
            if (n7 > 0) {
                object2 = ((WR1)object5).a;
                do {
                    object3 = (Vg1$a)object2[n4];
                    Object object8 = object3.f.c;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = object3.d;
                    parcelableSnapshotMutableState.setValue(object8);
                    object3.h = bl2;
                } while (++n4 < n7);
            }
        } else {
            boolean bl3;
            l4 = ((vg1_0)object).c;
            f12 = (float)(l2 -= l4) / f5;
            l3 = (long)f12;
            int n8 = ((WR1)object5).c;
            if (n8 > 0) {
                Object[] objectArray = ((WR1)object5).a;
                f11 = 0.0f;
                f7 = 0.0f;
                bl3 = true;
                f6 = Float.MIN_VALUE;
                do {
                    boolean bl4;
                    object5 = (Vg1$a)objectArray[f11];
                    boolean bl5 = ((Vg1$a)object5).g;
                    if (!bl5) {
                        Boolean bl6 = Boolean.FALSE;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((Vg1$a)object5).j.b;
                        parcelableSnapshotMutableState.setValue(bl6);
                        bl5 = ((Vg1$a)object5).h;
                        if (bl5) {
                            ((Vg1$a)object5).h = false;
                            ((Vg1$a)object5).i = l3;
                        }
                        l7 = ((Vg1$a)object5).i;
                        l7 = l3 - l7;
                        object6 = ((Vg1$a)object5).f.g(l7);
                        object7 = ((Vg1$a)object5).d;
                        ((h83_0)object7).setValue(object6);
                        object6 = ((Vg1$a)object5).f;
                        object6.getClass();
                        ((Vg1$a)object5).g = bl5 = nl_1.a((ol_1)object6, l7);
                    }
                    if (bl4 = ((Vg1$a)object5).g) continue;
                    bl3 = false;
                    f6 = 0.0f;
                    object4 = null;
                } while (++f11 < n8);
            } else {
                bl3 = true;
                f6 = Float.MIN_VALUE;
            }
            n3 = bl3 ^ true;
            object2 = n3 != 0;
            object = ((vg1_0)object).d;
            ((h83_0)object).setValue(object2);
        }
        return Unit.a;
    }
}

