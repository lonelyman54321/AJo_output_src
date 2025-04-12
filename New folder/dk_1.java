/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;

/*
 * Renamed from dK
 */
public final class dk_1
implements bk_1 {
    public static final dK$b b;
    public static final HashMap c;
    public final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        c = hashMap = new HashMap();
    }

    public dk_1() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onActivityResult(int n3, int n4, Intent intent) {
        Object object;
        Object object2 = this.a;
        Serializable serializable = Integer.valueOf(n3);
        if ((object2 = (dk$a_0)((HashMap)object2).get(serializable)) != null) {
            return (int)(object2.a(n4, intent) ? 1 : 0) != 0;
        }
        object2 = b;
        synchronized (object2) {
            serializable = c;
            object = n3;
            object = ((HashMap)serializable).get(object);
            object = (dk$a_0)object;
        }
        if (object == null) return 0 != 0;
        return (int)(object.a(n4, intent) ? 1 : 0) != 0;
    }
}

