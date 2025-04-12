/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.ParcelFileDescriptor
 */
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.List;

public final class Pm2
implements BK2 {
    public final vs0 a;

    public Pm2(vs0 vs02) {
        this.a = vs02;
    }

    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        block3: {
            block2: {
                long l2;
                long l3;
                long l4;
                long l7;
                object = (ParcelFileDescriptor)object;
                String string2 = "HUAWEI";
                object2 = Build.MANUFACTURER;
                boolean bl3 = string2.equalsIgnoreCase((String)object2);
                if ((bl3 || (bl2 = (string2 = "HONOR").equalsIgnoreCase((String)object2))) && (l7 = (l4 = (l3 = object.getStatSize()) - (l2 = 0x20000000L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) break block2;
                this.a.getClass();
                object = "robolectric";
                object2 = Build.FINGERPRINT;
                boolean bl4 = ((String)object).equals(object2);
                bl2 = true;
                if (bl4 ^= bl2) break block3;
            }
            bl2 = false;
            object2 = null;
        }
        return bl2;
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        object = (ParcelFileDescriptor)object;
        vs0 vs02 = this.a;
        List list = vs02.d;
        Kp kp = vs02.c;
        list = (ArrayList)list;
        ne1$c ne1$c = new ne1$c((ParcelFileDescriptor)object, (ArrayList)list, kp);
        vs0$a vs0$a = vs0.k;
        return vs02.a(ne1$c, n3, n4, z92, vs0$a);
    }
}

