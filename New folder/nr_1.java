/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nR
 */
public final class nr_1
extends Lambda
implements Function0 {
    public final /* synthetic */ mr_2 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ String e;

    public nr_1(mr_2 mr_22, List list, String string2) {
        this.c = mr_22;
        this.d = list;
        this.e = string2;
        super(0);
    }

    public final Object invoke() {
        Object object;
        ArrayList<Object> arrayList = this.c.b;
        Iterator iterator = this.d;
        if (arrayList != null && (arrayList = ((i0_0)((Object)arrayList)).E((String)(object = this.e), (List)((Object)iterator))) != null) {
            iterator = arrayList;
        }
        iterator = (Iterable)((Object)iterator);
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        arrayList = new ArrayList<Object>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Certificate)iterator.next();
            String string2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
            Intrinsics.checkNotNull(object, string2);
            object = (X509Certificate)object;
            arrayList.add(object);
        }
        return arrayList;
    }
}

