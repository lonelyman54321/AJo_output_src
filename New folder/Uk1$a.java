/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Uk1$a
implements InvocationHandler {
    public final List a;
    public boolean b;
    public String c;

    public Uk1$a(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "protocols");
        this.a = arrayList;
    }

    public final Object invoke(Object object, Method object2, Object[] objectArray) {
        int n3;
        int n4;
        String string2 = "proxy";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "method");
        int n7 = 0;
        object = null;
        if (objectArray == null) {
            objectArray = new Object[]{};
        }
        string2 = ((Method)object2).getName();
        Object object3 = ((Method)object2).getReturnType();
        Object object4 = "supports";
        int n8 = Intrinsics.areEqual(string2, object4);
        if (n8 != 0 && (n8 = Intrinsics.areEqual(object4 = Boolean.TYPE, object3)) != 0) {
            return Boolean.TRUE;
        }
        object4 = "unsupported";
        n8 = Intrinsics.areEqual(string2, object4);
        int n10 = 1;
        if (n8 != 0 && (n8 = Intrinsics.areEqual(object4 = Void.TYPE, object3)) != 0) {
            this.b = n10;
            return null;
        }
        object4 = "protocols";
        n8 = Intrinsics.areEqual(string2, object4);
        List list = this.a;
        if (n8 != 0 && (n8 = objectArray.length) == 0) {
            return list;
        }
        object4 = "selectProtocol";
        n8 = (int)(Intrinsics.areEqual(string2, object4) ? 1 : 0);
        String string3 = "null cannot be cast to non-null type kotlin.String";
        if ((n8 != 0 || (n8 = (int)(Intrinsics.areEqual(string2, object4 = "select") ? 1 : 0)) != 0) && (n4 = Intrinsics.areEqual(object4 = String.class, object3)) != 0 && (n4 = objectArray.length) == n10 && (n8 = (object3 = objectArray[0]) instanceof List) != 0) {
            object2 = "null cannot be cast to non-null type kotlin.collections.List<*>";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = (List)object3;
            int n14 = object3.size();
            if (n14 >= 0) {
                int n15 = 0;
                objectArray = null;
                while (true) {
                    string2 = object3.get(n15);
                    Intrinsics.checkNotNull(string2, string3);
                    n8 = (int)(list.contains(string2) ? 1 : 0);
                    if (n8 != 0) {
                        this.c = string2;
                        return string2;
                    }
                    if (n15 == n14) break;
                    ++n15;
                }
            }
            this.c = object = (String)list.get(0);
            return object;
        }
        object3 = "protocolSelected";
        n4 = (int)(Intrinsics.areEqual(string2, object3) ? 1 : 0);
        if ((n4 != 0 || (n3 = (int)(Intrinsics.areEqual(string2, object3 = "selected") ? 1 : 0)) != 0) && (n3 = objectArray.length) == n10) {
            object = objectArray[0];
            Intrinsics.checkNotNull(object, string3);
            object = (String)object;
            this.c = object;
            return null;
        }
        n7 = objectArray.length;
        object = Arrays.copyOf(objectArray, n7);
        return ((Method)object2).invoke((Object)this, object);
    }
}

