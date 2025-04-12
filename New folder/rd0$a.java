/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.facebook.GraphRequest$b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;
import org.json.JSONArray;

public final class rd0$a {
    public static void a() {
        Object e2;
        int n3;
        Object object;
        boolean bl2 = lz3_0.y();
        if (bl2) {
            return;
        }
        Object object2 = ii1_0.b();
        Object object3 = null;
        if (object2 == null) {
            object2 = new File[]{};
        } else {
            object = new Object();
            if ((object2 = ((File)object2).listFiles((FilenameFilter)object)) == null) {
                object2 = new File[]{};
            }
        }
        int n4 = ((File[])object2).length;
        object = new ArrayList(n4);
        n4 = ((File[])object2).length;
        Di1 di1 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Di1 di12 = Di1$a.c(object2[n3]);
            ((ArrayList)object).add(di12);
        }
        object2 = new ArrayList();
        object = ((ArrayList)object).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            e2 = object.next();
            di1 = (Di1)e2;
            di1 = (Di1)e2;
            n3 = (int)(di1.a() ? 1 : 0);
            if (n3 == 0) continue;
            ((ArrayList)object2).add(e2);
        }
        object = new Object();
        object2 = CollectionsKt.e0((Iterable)object2, (Comparator)object);
        object = new JSONArray();
        n4 = object2.size();
        n3 = 5;
        n4 = Math.min(n4, n3);
        object3 = f.m(0, n4).d();
        while ((n4 = (int)(((ui1_2)object3).c ? 1 : 0)) != 0) {
            n4 = ((mi1_2)object3).nextInt();
            e2 = object2.get(n4);
            object.put(e2);
        }
        object3 = new qd0((List)object2);
        ii1_0.f("crash_reports", (JSONArray)object, (GraphRequest$b)object3);
    }
}

