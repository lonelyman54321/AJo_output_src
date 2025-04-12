/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from vr1
 */
public final class vr1_0
implements o41 {
    public final Map b;
    public volatile Map c;

    public vr1_0(Map map2) {
        this.b = map2 = Collections.unmodifiableMap(map2);
    }

    public final HashMap a() {
        boolean bl2;
        HashMap hashMap = new HashMap();
        Iterator iterator = this.b.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object object = (List)entry.getValue();
            StringBuilder stringBuilder = new StringBuilder();
            int n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = ((ur1)object.get(i3)).a();
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                if (bl3) continue;
                stringBuilder.append(string2);
                char c2 = object.size() + -1;
                if (i3 == c2) continue;
                c2 = ',';
                stringBuilder.append(c2);
            }
            object = stringBuilder.toString();
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (bl4) continue;
            entry = entry.getKey();
            hashMap.put(entry, object);
        }
        return hashMap;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof vr1_0;
        if (bl2) {
            object = (vr1_0)object;
            Map map2 = this.b;
            object = ((vr1_0)object).b;
            return map2.equals(object);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getHeaders() {
        Map map2 = this.c;
        if (map2 != null) return this.c;
        synchronized (this) {
            try {
                map2 = this.c;
                if (map2 != null) return this.c;
                map2 = this.a();
                this.c = map2 = Collections.unmodifiableMap(map2);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LazyHeaders{headers=");
        Map map2 = this.b;
        stringBuilder.append(map2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

