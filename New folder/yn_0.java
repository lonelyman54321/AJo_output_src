/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yn
 */
public final class yn_0 {
    public static final HashSet a;
    public static final HashSet b;
    public static Yn$a c;
    public static List d;
    public static int e;

    static {
        int n3 = 1;
        int n4 = 2;
        Integer n7 = 200;
        Integer n8 = 202;
        Object object = new Integer[n4];
        object[0] = n7;
        object[n3] = n8;
        a = p03_0.d(object);
        n7 = 503;
        n8 = 504;
        object = 429;
        Object[] objectArray = new Integer[3];
        objectArray[0] = n7;
        objectArray[n3] = n8;
        objectArray[n4] = object;
        b = p03_0.d(objectArray);
    }

    public static final void a(String string2, String arrayList, String string3) {
        Intrinsics.checkNotNullParameter(string2, "datasetID");
        Intrinsics.checkNotNullParameter(arrayList, "url");
        Intrinsics.checkNotNullParameter(string3, "accessKey");
        Object object = sx1.d;
        object = Ax1.APP_EVENTS;
        Object[] objectArray = new Object[]{string2, arrayList, string3};
        sx1$a.b((Ax1)((Object)object), "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", objectArray);
        object = new Yn$a(string2, (String)((Object)arrayList), string3);
        string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, string2);
        c = object;
        arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, string2);
        d = arrayList;
    }

    public static List b() {
        List list = d;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }
}

