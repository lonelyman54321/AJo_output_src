/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.facebook.j;

/*
 * Renamed from Zq
 */
public final class zq_0 {
    public static zq_0 f;
    public String a;
    public long b;
    public String c;
    public String d;
    public boolean e;

    public final String a() {
        String string2;
        boolean bl2 = FacebookSdk.isInitialized();
        if (bl2 && (bl2 = j.b())) {
            string2 = this.a;
        } else {
            bl2 = false;
            string2 = null;
        }
        return string2;
    }
}

