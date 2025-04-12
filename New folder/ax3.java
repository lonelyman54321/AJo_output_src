/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ax3
implements BP1 {
    public static final Set b;
    public final ax3$c a;

    static {
        List<String> list = Arrays.asList("file", "content", "android.resource");
        HashSet<String> hashSet = new HashSet<String>(list);
        b = Collections.unmodifiableSet(hashSet);
    }

    public ax3(ax3$c ax3$c) {
        this.a = ax3$c;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        object = (Uri)object;
        k62 k622 = new k62(object);
        object = this.a.a((Uri)object);
        BP1$a bP1$a = new BP1$a(k622, (ei0_0)object);
        return bP1$a;
    }

    public final boolean b(Object object) {
        object = (Uri)object;
        Set set = b;
        object = object.getScheme();
        return set.contains(object);
    }
}

