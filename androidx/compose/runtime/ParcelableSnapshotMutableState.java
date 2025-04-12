/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState$a;
import kotlin.jvm.internal.Intrinsics;

public final class ParcelableSnapshotMutableState
extends h83_0
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSnapshotMutableState$a parcelableSnapshotMutableState$a = new Object();
        CREATOR = parcelableSnapshotMutableState$a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel object, int n3) {
        block5: {
            block3: {
                I83 i83;
                Object object2;
                block4: {
                    block2: {
                        object2 = this.getValue();
                        object.writeValue(object2);
                        J83.h();
                        object2 = wv1_0.b;
                        i83 = this.b;
                        n3 = (int)(Intrinsics.areEqual(i83, object2) ? 1 : 0);
                        if (n3 == 0) break block2;
                        n3 = 0;
                        object2 = null;
                        break block3;
                    }
                    J83.l();
                    object2 = qi_2.b;
                    n3 = (int)(Intrinsics.areEqual(i83, object2) ? 1 : 0);
                    if (n3 == 0) break block4;
                    n3 = 1;
                    break block3;
                }
                J83.i();
                object2 = vf_1.b;
                n3 = (int)(Intrinsics.areEqual(i83, object2) ? 1 : 0);
                if (n3 == 0) break block5;
                n3 = 2;
            }
            object.writeInt(n3);
            return;
        }
        object = new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        throw object;
    }
}

