/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class Hc1$a
extends Binder
implements hc1_1 {
    public static hc1_1 c(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (iInterface != null && (bl2 = iInterface instanceof hc1_1)) {
            return (hc1_1)iInterface;
        }
        iInterface = new Object();
        iInterface.a = iBinder;
        return iInterface;
    }
}

