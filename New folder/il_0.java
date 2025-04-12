/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Il
 */
public final class il_0
implements ib3_0 {
    public final Vs3 a;
    public final ParcelableSnapshotMutableState b;
    public Ol c;
    public long d;
    public long e;
    public boolean f;

    public /* synthetic */ il_0(Vs3 vs3, Object object, Ol ol, int n3) {
        if ((n3 &= 4) != 0) {
            ol = null;
        }
        this(vs3, object, ol, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public il_0(Vs3 object, Object object2, Ol ol, long l2, long l3, boolean bl2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.a = object;
        this.b = parcelableSnapshotMutableState = J83.g(object2);
        if (ol != null) {
            object = Pl.a(ol);
        } else {
            object = (Ol)object.a().invoke(object2);
            ((Ol)object).d();
        }
        this.c = object;
        this.d = l2;
        this.e = l3;
        this.f = bl2;
    }

    public final Object d() {
        Function1 function1 = this.a.b();
        Ol ol = this.c;
        return function1.invoke(ol);
    }

    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimationState(value=");
        Object object = this.b.getValue();
        stringBuilder.append(object);
        stringBuilder.append(", velocity=");
        object = this.d();
        stringBuilder.append(object);
        stringBuilder.append(", isRunning=");
        boolean bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", lastFrameTimeNanos=");
        long l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", finishedTimeNanos=");
        l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

