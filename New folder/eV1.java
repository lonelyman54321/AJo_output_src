/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.NetworkRequest
 *  android.os.Build$VERSION
 */
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class eV1 {
    public static final int[] a(NetworkRequest object) {
        String string2 = null;
        int n3 = 29;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        String string3 = "request";
        if (n4 >= n7) {
            Intrinsics.checkNotNullParameter(object, string3);
            object = cV1.a(object);
            string2 = "request.capabilities";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        } else {
            Object object3 = object2 = (Object)new int[n3];
            object3[0] = 17;
            object3[1] = 5;
            object3[2] = 2;
            object3[3] = 10;
            object3[4] = 29;
            object3[5] = 19;
            object3[6] = 3;
            object3[7] = 32;
            object3[8] = 7;
            object3[9] = 4;
            object3[10] = 12;
            object3[11] = 23;
            object3[12] = false;
            object3[13] = 33;
            object3[14] = 20;
            object3[15] = 11;
            object3[16] = 13;
            object3[17] = 18;
            object3[18] = 21;
            object3[19] = 15;
            object3[20] = 35;
            object3[21] = 34;
            object3[22] = 8;
            object3[23] = true;
            object3[24] = 25;
            object3[25] = 14;
            object3[26] = 16;
            object3[27] = 6;
            object3[28] = 9;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object4 = object2[i3];
                Intrinsics.checkNotNullParameter(object, string3);
                boolean bl2 = ZU1.a(object, (int)object4);
                if (!bl2) continue;
                Integer n8 = (int)object4;
                arrayList.add(n8);
            }
            object = CollectionsKt.j0(arrayList);
        }
        return object;
    }

    public static final int[] b(NetworkRequest object) {
        String string2 = null;
        int n3 = 9;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        String string3 = "request";
        if (n4 >= n7) {
            Intrinsics.checkNotNullParameter(object, string3);
            object = bV1.a(object);
            string2 = "request.transportTypes";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        } else {
            Object object3 = object2 = (Object)new int[n3];
            object3[0] = 2;
            object3[1] = false;
            object3[2] = 3;
            object3[3] = 6;
            object3[4] = 9;
            object3[5] = 8;
            object3[6] = 4;
            object3[7] = true;
            object3[8] = 5;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object4 = object2[i3];
                Intrinsics.checkNotNullParameter(object, string3);
                boolean bl2 = YU1.a(object, (int)object4);
                if (!bl2) continue;
                Integer n8 = (int)object4;
                arrayList.add(n8);
            }
            object = CollectionsKt.j0(arrayList);
        }
        return object;
    }
}

