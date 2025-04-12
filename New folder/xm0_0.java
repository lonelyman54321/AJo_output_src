/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from Xm0
 */
public final class xm0_0
implements dU2 {
    public final Function1 a;
    public final Xm0$b b;
    public final gS1 c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;

    public xm0_0(Function1 object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.a = object;
        this.b = object = new Xm0$b(this);
        this.c = object = new gS1();
        object = Boolean.FALSE;
        this.d = parcelableSnapshotMutableState = J83.g(object);
        this.e = parcelableSnapshotMutableState = J83.g(object);
        this.f = object = J83.g(object);
    }

    public final Object a(aS1 object, Function2 object2, f80_0 f80_02) {
        Xm0$a xm0$a = new Xm0$a(this, (aS1)((Object)object), (Function2)object2, null);
        if ((object = kotlinx.coroutines.d.c(xm0$a, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final boolean b() {
        return (Boolean)this.d.getValue();
    }

    public final /* synthetic */ boolean c() {
        return true;
    }

    public final /* synthetic */ boolean d() {
        return true;
    }

    public final float e(float f5) {
        Float f6 = Float.valueOf(f5);
        return ((Number)this.a.invoke(f6)).floatValue();
    }
}

