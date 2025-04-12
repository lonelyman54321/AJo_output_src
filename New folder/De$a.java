/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$FloatRef;

public final class De$a
extends qg3_2
implements hx0_2 {
    public int a;
    public /* synthetic */ be_0 b;
    public /* synthetic */ Xs0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Re e;
    public final /* synthetic */ float f;

    public De$a(Re re, float f5, f80_0 f80_02) {
        this.e = re;
        this.f = f5;
        super(4, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (be_0)object;
        object2 = (Xs0)object2;
        object4 = (f80_0)object4;
        Re re = this.e;
        float f5 = this.f;
        De$a de$a = new De$a(re, f5, (f80_0)object4);
        de$a.b = object;
        de$a.c = object2;
        de$a.d = object3;
        object = Unit.a;
        return de$a.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = this.c;
        Object object3 = this.d;
        float f5 = object2.e(object3);
        n3 = (int)(Float.isNaN(f5) ? 1 : 0);
        if (n3 != 0) return Unit.a;
        object2 = new Ref$FloatRef();
        object3 = this.e;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((Re)object3).j;
        float f6 = parcelableSnapshotMutableFloatState.c();
        boolean bl2 = Float.isNaN(f6);
        if (bl2) {
            bl2 = false;
            f6 = 0.0f;
            parcelableSnapshotMutableFloatState = null;
        } else {
            parcelableSnapshotMutableFloatState = ((Re)object3).j;
            f6 = parcelableSnapshotMutableFloatState.c();
        }
        ((Ref$FloatRef)object2).element = f6;
        De$a$a de$a$a = new De$a$a((be_0)object, (Ref$FloatRef)object2);
        this.b = null;
        this.c = null;
        this.a = n4;
        float f7 = this.f;
        Gl gl = ((Re)object3).c;
        object = mg3_0.a(f6, f5, f7, gl, de$a$a, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

