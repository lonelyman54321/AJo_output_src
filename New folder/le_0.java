/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Le
 */
public final class le_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Re c;

    public le_0(Re re) {
        this.c = re;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        Object object2 = ((Re)object).l.getValue();
        if (object2 != null) return object2;
        object2 = ((Re)object).j;
        float f5 = ((D83)object2).c();
        boolean bl3 = Float.isNaN(f5);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((Re)object).g;
        if (bl3) {
            object = parcelableSnapshotMutableState.getValue();
            return object;
        }
        Object object3 = parcelableSnapshotMutableState.getValue();
        float f6 = (object = ((Re)object).d()).e(object3);
        float f7 = f6 - f5;
        Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object4 == false || (bl2 = Float.isNaN(f6))) return object3;
        if (object4 < 0) {
            bl2 = true;
            f6 = Float.MIN_VALUE;
            if ((object = object.a(f5, bl2)) == null) {
                return object3;
            }
        } else {
            bl2 = false;
            f6 = 0.0f;
            parcelableSnapshotMutableState = null;
            if ((object = object.a(f5, false)) == null) return object3;
        }
        object3 = object;
        return object3;
    }
}

