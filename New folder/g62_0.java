/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.sis.StoreMetaData;
import java.util.HashMap;

/*
 * Renamed from g62
 */
public final class g62_0 {
    public static final g62_0 c;
    public HashMap a;
    public HashMap b;

    static {
        HashMap hashMap;
        g62_0 g62_02 = new Object();
        g62_02.a = hashMap = new HashMap();
        g62_02.b = hashMap = new HashMap();
        c = g62_02;
    }

    public final void a(String string2, StoreMetaData storeMetaData) {
        HashMap hashMap = this.b;
        if (hashMap == null) {
            this.b = hashMap = new HashMap();
        }
        this.b.put(string2, storeMetaData);
    }

    public final void b(Object object, int n3) {
        HashMap hashMap = this.a;
        if (hashMap != null) {
            switch (n3) {
                default: {
                    break;
                }
                case 1002: {
                    Integer n4 = n3;
                    hashMap.put(n4, object);
                    break;
                }
                case 1001: {
                    Integer n7 = n3;
                    hashMap.put(n7, object);
                    break;
                }
                case 1000: {
                    Integer n8 = n3;
                    hashMap.put(n8, object);
                }
            }
        }
    }
}

