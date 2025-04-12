/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$i
extends vx_1 {
    public final Object a(Bundle bundle, String string2) {
        return (String[])bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "string[]";
    }

    public final Object c(Object stringArray, String string2) {
        block3: {
            String string3;
            block2: {
                stringArray = stringArray;
                string3 = "value";
                Intrinsics.checkNotNullParameter(string2, string3);
                if (stringArray == null) break block2;
                Intrinsics.checkNotNullParameter(string2, string3);
                String[] stringArray2 = new String[]{string2};
                Intrinsics.checkNotNullParameter(stringArray, "<this>");
                String string4 = "elements";
                Intrinsics.checkNotNullParameter(stringArray2, string4);
                int n3 = stringArray.length;
                int n4 = n3 + 1;
                stringArray = Arrays.copyOf(stringArray, n4);
                n4 = 0;
                int n7 = 1;
                System.arraycopy(stringArray2, 0, stringArray, n3, n7);
                Intrinsics.checkNotNull(stringArray);
                if (stringArray != null) break block3;
            }
            Intrinsics.checkNotNullParameter(string2, string3);
            stringArray = new String[]{string2};
        }
        return stringArray;
    }

    public final Object d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return new String[]{string2};
    }

    public final void e(Bundle bundle, String string2, Object stringArray) {
        stringArray = stringArray;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putStringArray(string2, stringArray);
    }

    public final boolean g(Object objectArray, Object objectArray2) {
        objectArray = (String[])objectArray;
        objectArray2 = (String[])objectArray2;
        return qp_1.b(objectArray, objectArray2);
    }

    public final Object h() {
        return new String[0];
    }

    public final List i(Object stringArray) {
        List<String> list;
        if ((stringArray = (String[])stringArray) != null) {
            int n3 = stringArray.length;
            list = new List<String>(n3);
            n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = Uri.encode((String)stringArray[i3]);
                ((ArrayList)list).add(string2);
            }
        } else {
            list = mz0_2.a;
        }
        return list;
    }
}

