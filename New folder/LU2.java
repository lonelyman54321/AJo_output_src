/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class LU2 {
    public AppDataBase a = null;
    public List b = null;
    public ArrayList c = null;

    public LU2() {
        this(null);
    }

    public LU2(Object object) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LU2;
        if (!bl3) {
            return false;
        }
        object = (LU2)object;
        Object object2 = this.a;
        Object object3 = ((LU2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((LU2)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((LU2)object).c;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        AppDataBase appDataBase = this.a;
        int n7 = 0;
        if (appDataBase == null) {
            n4 = 0;
            appDataBase = null;
        } else {
            n4 = appDataBase.hashCode();
        }
        n4 *= 31;
        List list = this.b;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list = this.c;
        if (list != null) {
            n7 = ((ArrayList)list).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        AppDataBase appDataBase = this.a;
        List list = this.b;
        ArrayList arrayList = this.c;
        StringBuilder stringBuilder = new StringBuilder("SearchDBData(appDataBase=");
        stringBuilder.append(appDataBase);
        stringBuilder.append(", searchEntryList=");
        stringBuilder.append(list);
        stringBuilder.append(", entryList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

