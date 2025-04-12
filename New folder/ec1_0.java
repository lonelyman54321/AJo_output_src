/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eC1
 */
public final class ec1_0
implements ib3_0 {
    public final x00_0 a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final mp0 d;
    public final mp0 e;

    public ec1_0() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Object object = y00_0.b();
        this.a = object;
        this.b = parcelableSnapshotMutableState = J83.g(null);
        this.c = object = J83.g(null);
        object = new eC1$c(this);
        J83.e((Function0)object);
        object = new eC1$a(this);
        this.d = object = J83.e((Function0)object);
        object = new eC1$b(this);
        J83.e((Function0)object);
        object = new eC1$d(this);
        this.e = object = J83.e((Function0)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Throwable throwable) {
        synchronized (this) {
            Object object = "error";
            Intrinsics.checkNotNullParameter(throwable, (String)object);
            object = this.d;
            object = ((mp0)object).getValue();
            object = (Boolean)object;
            boolean bl2 = (Boolean)object;
            if (bl2) {
                return;
            }
            object = this.c;
            ((h83_0)object).setValue(throwable);
            object = this.a;
            ((x00_0)object).c(throwable);
            return;
        }
    }

    public final Object getValue() {
        return (QB1)this.b.getValue();
    }
}

