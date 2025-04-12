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

public final class rx3
implements BP1 {
    public static final Set b;
    public final BP1 a;

    static {
        List<String> list = Arrays.asList("http", "https");
        HashSet<String> hashSet = new HashSet<String>(list);
        b = Collections.unmodifiableSet(hashSet);
    }

    public rx3(BP1 bP1) {
        this.a = bP1;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        object = (Uri)object;
        object = object.toString();
        a01 a012 = new a01((String)object);
        return this.a.a(a012, n3, n4, z92);
    }

    public final boolean b(Object object) {
        object = (Uri)object;
        Set set = b;
        object = object.getScheme();
        return set.contains(object);
    }
}

