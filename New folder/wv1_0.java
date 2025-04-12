/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.core.CorruptionException;

/*
 * Renamed from wV1
 */
public final class wv1_0
implements I83,
T90 {
    public static final wv1_0 b;
    public final /* synthetic */ int a;

    static {
        wv1_0 wv1_02;
        b = wv1_02 = new wv1_0(0);
    }

    public /* synthetic */ wv1_0(int n3) {
        this.a = n3;
    }

    public Object a(CorruptionException corruptionException) {
        throw corruptionException;
    }

    public boolean b(Object object, Object object2) {
        return false;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 0: 
        }
        return "NeverEqualPolicy";
    }
}

