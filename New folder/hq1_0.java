/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hQ1
 */
public final class hq1_0
implements gq1_0 {
    public final ParcelableSnapshotMutableFloatState a;

    public hq1_0() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState;
        this.a = parcelableSnapshotMutableFloatState = tp1_0.e(1.0f);
    }

    public final float C() {
        return this.a.c();
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return gq1$a_0.a;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

