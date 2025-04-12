/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.c$c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class c$d {
    public final c$c a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public c$d(c$c set, int[] object, String[] stringArray) {
        Intrinsics.checkNotNullParameter(set, "observer");
        Intrinsics.checkNotNullParameter(object, "tableIds");
        Intrinsics.checkNotNullParameter(stringArray, "tableNames");
        this.a = set;
        this.b = object;
        this.c = stringArray;
        int n3 = stringArray.length;
        int n4 = 1;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            set = null;
        }
        set = (n3 ^= n4) != 0 ? O03.b(stringArray[0]) : vz0_2.a;
        this.d = set;
        n3 = ((int[])object).length;
        int n7 = stringArray.length;
        if (n3 == n7) {
            return;
        }
        object = "Check failed.".toString();
        set = new IllegalStateException((String)object);
        throw set;
    }

    public final void a(Set set) {
        int n3;
        Intrinsics.checkNotNullParameter(set, "invalidatedTablesIds");
        Object object = this.b;
        int n4 = ((int[])object).length;
        int n7 = 1;
        if (n4 != 0) {
            if (n4 != n7) {
                k03_0 k03_02 = new k03_0();
                int n8 = ((Object)object).length;
                int n10 = 0;
                String string2 = null;
                for (int i3 = 0; i3 < n8; ++i3) {
                    Object object2 = object[i3];
                    int n14 = n10 + 1;
                    String[] stringArray = Integer.valueOf((int)object2);
                    if ((object2 = (Object)set.contains(stringArray)) != false) {
                        stringArray = this.c;
                        string2 = stringArray[n10];
                        k03_02.add(string2);
                    }
                    n10 = n14;
                }
                set = O03.a(k03_02);
            } else {
                n3 = object[0];
                boolean bl2 = set.contains(object = Integer.valueOf(n3));
                set = bl2 ? this.d : vz0_2.a;
            }
        } else {
            set = vz0_2.a;
        }
        object = set;
        object = set;
        n3 = object.isEmpty() ^ n7;
        if (n3 != 0) {
            object = this.a;
            ((c$c)object).a(set);
        }
    }
}

