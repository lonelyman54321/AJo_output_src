/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 */
package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService$a;
import androidx.room.b;

public abstract class b$a
extends Binder
implements b {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n3, Parcel object, Parcel object2, int n4) {
        int n7;
        Object object3 = b.m0;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface((String)object3);
        }
        if (n3 == (n7 = 1598968902)) {
            object2.writeString((String)object3);
            return n8;
        }
        int n10 = 0;
        object3 = null;
        if (n3 != n8) {
            n7 = 2;
            if (n3 != n7) {
                n10 = 3;
                if (n3 != n10) {
                    return super.onTransact(n3, (Parcel)object, (Parcel)object2, n4);
                }
                n3 = object.readInt();
                object = object.createStringArray();
                object2 = this;
                object2 = (MultiInstanceInvalidationService$a)this;
                ((MultiInstanceInvalidationService$a)object2).c(n3, (String[])object);
            } else {
                IBinder iBinder = object.readStrongBinder();
                if (iBinder != null) {
                    String string2 = bc1_0.d0;
                    if ((string2 = iBinder.queryLocalInterface(string2)) != null && (n10 = string2 instanceof bc1_0) != 0) {
                        object3 = string2;
                        object3 = (bc1_0)((Object)string2);
                    } else {
                        object3 = new Object();
                        ((ac1_0)object3).a = iBinder;
                    }
                }
                n3 = object.readInt();
                object = this;
                object = (MultiInstanceInvalidationService$a)this;
                ((MultiInstanceInvalidationService$a)object).e((bc1_0)object3, n3);
                object2.writeNoException();
            }
        } else {
            Object object4 = object.readStrongBinder();
            if (object4 != null) {
                String string3 = bc1_0.d0;
                if ((string3 = object4.queryLocalInterface(string3)) != null && (n10 = string3 instanceof bc1_0) != 0) {
                    object3 = string3;
                    object3 = (bc1_0)((Object)string3);
                } else {
                    object3 = new Object();
                    ((ac1_0)object3).a = object4;
                }
            }
            object4 = object.readString();
            object = this;
            object = (MultiInstanceInvalidationService$a)this;
            n3 = ((MultiInstanceInvalidationService$a)object).d((bc1_0)object3, (String)object4);
            object2.writeNoException();
            object2.writeInt(n3);
        }
        return n8;
    }
}

