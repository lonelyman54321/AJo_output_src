/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import androidx.core.content.UnusedAppRestrictionsBackportService$a;

public abstract class Mc1$a
extends Binder
implements mc1_0 {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = mc1_0.f0;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel.writeString(string2);
            return n8;
        }
        if (n3 != n8) {
            return super.onTransact(n3, object, parcel, n4);
        }
        Object object2 = object.readStrongBinder();
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            boolean bl2;
            object = lc1_0.e0;
            if ((object = object2.queryLocalInterface((String)object)) != null && (bl2 = object instanceof lc1_0)) {
                object2 = object;
                object2 = (lc1_0)object;
            } else {
                object = new Object();
                object.a = object2;
                object2 = object;
            }
        }
        object = this;
        object = (UnusedAppRestrictionsBackportService$a)this;
        if (object2 != null) {
            object2 = object.a;
            ((UnusedAppRestrictionsBackportService)((Object)object2)).a();
        }
        return n8;
    }
}

