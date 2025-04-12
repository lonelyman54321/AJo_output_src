/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.c_0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.n$f;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p$c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from qy2
 */
public final class qy2_2
extends n
implements xo1_0 {
    private static final qy2_2 DEFAULT_INSTANCE;
    private static volatile an2_0 PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private p$c strings_;

    static {
        qy2_2 qy2_22;
        DEFAULT_INSTANCE = qy2_22 = new qy2_2();
        n.j(qy2_2.class, qy2_22);
    }

    public qy2_2() {
        c_0 c_02 = c_0.d;
        this.strings_ = c_02;
    }

    public static /* synthetic */ qy2_2 k() {
        return DEFAULT_INSTANCE;
    }

    public static void l(qy2_2 object, Iterable object2) {
        int n3;
        Object object3 = ((qy2_2)object).strings_;
        int n4 = object3.isModifiable();
        if (n4 == 0) {
            object3 = ((qy2_2)object).strings_;
            n3 = object3.size();
            n3 = n3 == 0 ? 10 : (n3 *= 2);
            ((qy2_2)object).strings_ = object3 = object3.mutableCopyWithCapacity(n3);
        }
        object = ((qy2_2)object).strings_;
        object3 = p.a;
        object2.getClass();
        n4 = object2 instanceof Dt1;
        String string2 = " is null.";
        String string3 = "Element at index ";
        if (n4 != 0) {
            boolean bl2;
            object2 = ((Dt1)object2).getUnderlyingElements();
            object3 = object;
            object3 = (Dt1)object;
            int n7 = object.size();
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                Object object4 = object2.next();
                if (object4 == null) {
                    object2 = new StringBuilder(string3);
                    int n8 = object3.size() - n7;
                    ((StringBuilder)object2).append(n8);
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    for (n3 = object3.size() + -1; n3 >= n7; n3 += -1) {
                        object3.remove(n3);
                    }
                    object = new NullPointerException((String)object2);
                    throw object;
                }
                boolean bl3 = object4 instanceof DF;
                if (bl3) {
                    object4 = (DF)object4;
                    object3.n((DF)object4);
                    continue;
                }
                object4 = (String)object4;
                object3.add(object4);
            }
        } else {
            n4 = object2 instanceof xz2;
            if (n4 != 0) {
                object2 = (Collection)object2;
                object.addAll(object2);
            } else {
                int n10;
                n4 = object instanceof ArrayList;
                if (n4 != 0 && (n4 = object2 instanceof Collection) != 0) {
                    object3 = object;
                    object3 = (ArrayList)object;
                    n10 = ((List)object).size();
                    Object object5 = object2;
                    object5 = (Collection)object2;
                    int n14 = object5.size() + n10;
                    ((ArrayList)object3).ensureCapacity(n14);
                }
                n4 = ((List)object).size();
                object2 = ((Iterable)object2).iterator();
                while ((n10 = object2.hasNext()) != 0) {
                    Object t3 = object2.next();
                    if (t3 == null) {
                        object2 = new StringBuilder(string3);
                        int n15 = ((List)object).size() - n4;
                        ((StringBuilder)object2).append(n15);
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                        for (n3 = ((List)object).size() + -1; n3 >= n4; n3 += -1) {
                            ((List)object).remove(n3);
                        }
                        object = new NullPointerException((String)object2);
                        throw object;
                    }
                    ((List)object).add(t3);
                }
            }
        }
    }

    public static qy2_2 m() {
        return DEFAULT_INSTANCE;
    }

    public static qy2$a o() {
        qy2_2 qy2_22 = DEFAULT_INSTANCE;
        qy2_22.getClass();
        n$f n$f = n$f.NEW_BUILDER;
        return (qy2$a)((n$a)qy2_22.f(n$f));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f(n$f objectArray) {
        byte by2 = 1;
        Object object = oy2_0.a;
        int n3 = objectArray.ordinal();
        n3 = object[n3];
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                Class<qy2_2> clazz = qy2_2.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        PARSER = objectArray = new Object();
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[by2];
                objectArray[0] = "strings_";
                object = DEFAULT_INSTANCE;
                return new vE2((wo1_1)object, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objectArray);
            }
            case 2: {
                return new qy2$a();
            }
            case 1: 
        }
        return new qy2_2();
    }

    public final p$c n() {
        return this.strings_;
    }
}

