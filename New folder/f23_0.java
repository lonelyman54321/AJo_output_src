/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from f23
 */
public final class f23_0
extends jD3 {
    public Map a;
    public final ParcelableSnapshotMutableState b;
    public final ArrayList c;
    public final kb3_2 d;
    public final kb3_2 e;

    public f23_0() {
        Object object = new p83_0();
        Object object2 = new Pair("key", object);
        object = new Pair[]{object2};
        this.a = object = fh1_2.j(object);
        object2 = object;
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 131071, null);
        this.b = object = J83.g(object);
        super();
        this.c = object;
        object = Boolean.FALSE;
        this.d = object2 = lb3_2.a(object);
        this.e = object = lb3_2.a(object);
    }

    public final void b(p83_0 p83_02) {
        block4: {
            ArrayList arrayList = this.c;
            boolean bl2 = arrayList.isEmpty() ^ true;
            if (bl2 && p83_02 != null) {
                ListIterator listIterator = p83_02.listIterator();
                int n3 = 0;
                Subcomponent subcomponent = null;
                while (true) {
                    boolean bl3;
                    Object object = listIterator;
                    object = (ob3_2)listIterator;
                    int n4 = ((ob3_2)object).hasNext();
                    if (n4 == 0) break block4;
                    object = ((ob3_2)object).next();
                    n4 = n3 + 1;
                    String string2 = null;
                    if (n3 < 0) break;
                    if ((object = (Subcomponent)object) != null && (object = ((Subcomponent)object).getResources()) != null && (object = (Resource)CollectionsKt.T((List)object)) != null && (object = ((Resource)object).getPostData()) != null) {
                        string2 = ((PostData)object).getPostId();
                    }
                    if ((bl3 = arrayList.contains(string2)) && (subcomponent = (Subcomponent)CollectionsKt.N(n3, p83_02)) != null) {
                        object = Boolean.TRUE;
                        subcomponent.setSeen((Boolean)object);
                    }
                    n3 = n4;
                }
                xx_2.n();
                throw null;
            }
        }
    }
}

