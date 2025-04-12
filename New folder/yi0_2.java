/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import com.facebook.FacebookSdk;

/*
 * Renamed from yI0
 */
public final class yi0_2
implements kJ0$a {
    public static void a(Parcel parcel, int n3, Boolean bl2) {
        parcel.writeInt(n3);
        n3 = (int)(bl2.booleanValue() ? 1 : 0);
        parcel.writeInt(n3);
    }

    public void b(boolean bl2) {
        block0: {
            if (!bl2) break block0;
            FacebookSdk.q = bl2 = true;
        }
    }
}

