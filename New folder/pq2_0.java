/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pq2
 */
public final class pq2_0
implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap a;

    public pq2_0() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    public pq2_0(HashMap hashMap) {
        HashMap hashMap2;
        Intrinsics.checkNotNullParameter(hashMap, "appEventMap");
        this.a = hashMap2 = new HashMap();
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() {
        HashMap hashMap;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            hashMap = this.a;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
        Pq2$a pq2$a = new Pq2$a(hashMap);
        return pq2$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a object, List collection) {
        Throwable throwable2;
        block6: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            Object object2 = "accessTokenAppIdPair";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = "appEvents";
                Intrinsics.checkNotNullParameter(collection, (String)object2);
                object2 = this.a;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            boolean bl3 = ((HashMap)object2).containsKey(object);
            if (!bl3) {
                collection = collection;
                collection = CollectionsKt.m0(collection);
                ((HashMap)object2).put(object, collection);
                return;
            }
            object = ((HashMap)object2).get(object);
            if ((object = (List)object) != null) {
                collection = collection;
                object.addAll(collection);
            }
            return;
        }
        td0.a(this, throwable2);
    }
}

