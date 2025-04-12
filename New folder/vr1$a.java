/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class vr1$a {
    public static final Map c;
    public Map a;
    public boolean b;

    static {
        Object object;
        Object object2 = System.getProperty("http.agent");
        int n3 = TextUtils.isEmpty((CharSequence)object2);
        if (n3 == 0) {
            n3 = ((String)object2).length();
            int n4 = ((String)object2).length();
            object = new StringBuilder(n4);
            for (n4 = 0; n4 < n3; ++n4) {
                char c2;
                char c3 = ((String)object2).charAt(n4);
                if ((c3 > (c2 = '\u001f') || c3 == (c2 = '\t')) && c3 < (c2 = '\u007f')) {
                    ((StringBuilder)object).append(c3);
                    continue;
                }
                c3 = '?';
                ((StringBuilder)object).append(c3);
            }
            object2 = ((StringBuilder)object).toString();
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object = new vr1$b((String)object2);
            object2 = Collections.singletonList(object);
            object = "User-Agent";
            hashMap.put(object, object2);
        }
        c = Collections.unmodifiableMap(hashMap);
    }

    public vr1$a() {
        Map map2;
        this.a = map2 = c;
        this.b = true;
    }
}

