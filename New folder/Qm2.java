/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

public final class Qm2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static qB3 a(Bundle object) {
        Parcelable parcelable;
        Object object2 = "android.support.v4.media.session.SESSION_TOKEN2";
        try {
            parcelable = object.getParcelable((String)object2);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        Bundle bundle = (Bundle)parcelable;
        if (bundle == null) {
            return null;
        }
        object2 = Qm2.class;
        object2 = ((Class)object2).getClassLoader();
        bundle.setClassLoader((ClassLoader)object2);
        object2 = "a";
        Parcelable parcelable2 = bundle.getParcelable((String)object2);
        boolean bl2 = parcelable2 instanceof ParcelImpl;
        if (bl2) {
            ParcelImpl parcelImpl = (ParcelImpl)parcelable2;
            return parcelImpl.a;
        }
        object2 = "Invalid parcel";
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }
}

