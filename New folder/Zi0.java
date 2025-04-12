/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.util.Base64
 */
import android.os.Parcel;
import android.util.Base64;

public final class Zi0 {
    public final Parcel a;

    public Zi0(String object) {
        Parcel parcel;
        this.a = parcel = Parcel.obtain();
        object = Base64.decode((String)object, (int)0);
        int n3 = ((Object)object).length;
        parcel.unmarshall((byte[])object, 0, n3);
        parcel.setDataPosition(0);
    }

    public final long a() {
        long l2;
        int n3;
        Fm3[] fm3Array = this.a;
        int n4 = fm3Array.readByte();
        long l3 = n4 == (n3 = 1) ? 0x100000000L : (n4 == (n3 = 2) ? 0x200000000L : l2);
        boolean bl2 = Fm3.a(l3, l2 = 0L);
        if (bl2) {
            fm3Array = Dm3.b;
            return Dm3.c;
        }
        float f5 = fm3Array.readFloat();
        return Em3.i(l3, f5);
    }
}

