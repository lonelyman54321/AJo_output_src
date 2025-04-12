/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.a$a;
import androidx.navigation.i;
import androidx.navigation.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from uT1
 */
public class ut1_0 {
    public final p a;
    public final int b;
    public final String c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final LinkedHashMap f;

    public ut1_0(p linkedHashMap, String string2) {
        String string3 = "navigator";
        Intrinsics.checkNotNullParameter(linkedHashMap, string3);
        Intrinsics.checkNotNullParameter(linkedHashMap, string3);
        this.a = linkedHashMap;
        this.b = -1;
        this.c = string2;
        linkedHashMap = new LinkedHashMap();
        this.d = linkedHashMap;
        this.e = linkedHashMap;
        this.f = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     */
    public i a() {
        int n3;
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        LinkedHashMap linkedHashMap;
        int n4;
        Object object4 = this.b();
        int n7 = 0;
        ((i)object4).c = null;
        Object object5 = this.d.entrySet().iterator();
        while (true) {
            n4 = object5.hasNext();
            linkedHashMap = ((i)object4).f;
            if (n4 == 0) break;
            object3 = object5.next();
            object2 = (String)object3.getKey();
            object3 = (androidx.navigation.b)object3.getValue();
            Intrinsics.checkNotNullParameter(object2, "argumentName");
            object = "argument";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            linkedHashMap.put(object2, object3);
        }
        object5 = this.e.iterator();
        while ((n4 = object5.hasNext()) != 0) {
            object3 = (gt1_0)((Object)object5.next());
            Intrinsics.checkNotNullParameter(object3, "navDeepLink");
            object2 = new qt1_1((gt1_0)object3);
            object2 = RS1.a(linkedHashMap, (Function1)object2);
            bl2 = ((ArrayList)object2).isEmpty();
            if (!bl2) {
                object5 = new StringBuilder("Deep link ");
                object3 = ((gt1_0)object3).a;
                ((StringBuilder)object5).append((String)object3);
                ((StringBuilder)object5).append(" can't be used to open destination ");
                ((StringBuilder)object5).append(object4);
                ((StringBuilder)object5).append(".\nFollowing required arguments are missing: ");
                ((StringBuilder)object5).append(object2);
                object4 = ((StringBuilder)object5).toString();
                object4 = object4.toString();
                object5 = new IllegalArgumentException((String)object4);
                throw object5;
            }
            object2 = ((i)object4).d;
            ((ArrayList)object2).add(object3);
        }
        object5 = this.f.entrySet().iterator();
        while ((n4 = object5.hasNext()) != 0) {
            object3 = object5.next();
            object2 = (Number)object3.getKey();
            n3 = ((Number)object2).intValue();
            object3 = (QS1)object3.getValue();
            object = "action";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            bl2 = object4 instanceof a.a ^ true;
            if (!bl2) {
                object3 = new StringBuilder("Cannot add action ");
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(" to ");
                ((StringBuilder)object3).append(object4);
                ((StringBuilder)object3).append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                object4 = ((StringBuilder)object3).toString();
                object5 = new UnsupportedOperationException((String)object4);
                throw object5;
            }
            if (n3 == 0) {
                object5 = "Cannot have an action with actionId 0".toString();
                object4 = new IllegalArgumentException((String)object5);
                throw object4;
            }
            object = ((i)object4).e;
            ((ca3)object).i(n3, object3);
        }
        object5 = this.c;
        if (object5 != null) {
            hh3_2 hh3_22;
            n4 = kotlin.text.b.k((CharSequence)object5) ^ 1;
            if (n4 == 0) {
                object5 = "Cannot have an empty route".toString();
                object4 = new IllegalArgumentException((String)object5);
                throw object4;
            }
            n4 = i.j;
            object3 = "android-app://androidx.navigation/".concat((String)object5);
            Intrinsics.checkNotNullParameter(object3, "uriPattern");
            object2 = new gt1_0((String)object3);
            object = new tt1_1((gt1_0)object2);
            ArrayList arrayList = RS1.a(linkedHashMap, (Function1)object);
            n3 = (int)(arrayList.isEmpty() ? 1 : 0);
            if (n3 == 0) {
                object3 = new StringBuilder("Cannot set route \"");
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append("\" for destination ");
                ((StringBuilder)object3).append(object4);
                ((StringBuilder)object3).append(". Following required arguments are missing: ");
                ((StringBuilder)object3).append(arrayList);
                object4 = ((StringBuilder)object3).toString();
                object4 = object4.toString();
                object5 = new IllegalArgumentException((String)object4);
                throw object5;
            }
            st1_1 st1_12 = new st1_1((String)object3);
            ((i)object4).i = hh3_22 = yr1_2.b(st1_12);
            ((i)object4).g = n4 = ((String)object3).hashCode();
            ((i)object4).h = object5;
        }
        if ((n4 = this.b) != (n7 = -1)) {
            ((i)object4).g = n4;
        }
        return object4;
    }

    public i b() {
        return this.a.a();
    }
}

