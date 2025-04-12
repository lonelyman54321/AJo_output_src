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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;
import org.json.JSONArray;

public final class w0 {
    public static final AtomicBoolean a;

    static {
        AtomicBoolean atomicBoolean;
        new w0();
        a = atomicBoolean = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a() {
        Throwable throwable2;
        Class<w0> clazz;
        block11: {
            Object object;
            int n3;
            Di1 di1;
            int n4;
            Object object2;
            Object object3;
            Object object4;
            clazz = w0.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            try {
                bl2 = lz3_0.y();
                if (bl2) {
                    return;
                }
                object4 = ii1_0.b();
                object3 = null;
                if (object4 == null) {
                    object4 = new File[]{};
                } else {
                    object2 = new Object();
                    if ((object4 = ((File)object4).listFiles((FilenameFilter)object2)) == null) {
                        object4 = new File[]{};
                    }
                }
                n4 = ((File[])object4).length;
                object2 = new ArrayList(n4);
                n4 = ((File[])object4).length;
                di1 = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    Object object5 = object4[n3];
                    object5 = Di1$a.c((File)object5);
                    object2.add(object5);
                }
            }
            catch (Throwable throwable2) {
                break block11;
            }
            object4 = new ArrayList();
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object = object2.next();
                di1 = (Di1)object;
                di1 = (Di1)object;
                n3 = (int)(di1.a() ? 1 : 0);
                if (n3 == 0) continue;
                object4.add(object);
            }
            n4 = 0;
            object = null;
            object2 = new u0(0);
            object4 = CollectionsKt.e0((Iterable)object4, (Comparator)object2);
            object2 = new JSONArray();
            n4 = object4.size();
            n3 = 5;
            n4 = Math.min(n4, n3);
            object3 = f.m(0, n4);
            object3 = object3.iterator();
            while (true) {
                if ((n4 = (int)(object3.hasNext() ? 1 : 0)) == 0) {
                    object3 = "anr_reports";
                    object = new Object((List)object4);
                    ii1_0.f((String)object3, (JSONArray)object2, (GraphRequest$b)object);
                    return;
                }
                object = object3;
                object = (mi1_2)object3;
                n4 = ((mi1_2)object).nextInt();
                object = object4.get(n4);
                object2.put(object);
            }
        }
        td0.a(clazz, throwable2);
    }
}

