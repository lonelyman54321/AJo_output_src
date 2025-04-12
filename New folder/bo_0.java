/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.a;
import com.facebook.appevents.d;
import com.facebook.appevents.f;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from bo
 */
public final class bo_0
implements Runnable {
    public final void run() {
        boolean bl2;
        Object object;
        Object object2 = new HashSet();
        Object object3 = f.a;
        object3 = f.class;
        boolean bl3 = td0.b(object3);
        Set set = null;
        if (!bl3) {
            object = f.c;
            try {
                set = ((d)object).e();
            }
            catch (Throwable throwable) {
                td0.a(object3, throwable);
            }
        }
        object3 = set.iterator();
        while (bl3 = object3.hasNext()) {
            object = ((a)object3.next()).a;
            ((HashSet)object2).add(object);
        }
        object2 = ((HashSet)object2).iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (String)object2.next();
            bl3 = true;
            dl0_2.k((String)object3, bl3);
        }
    }
}

