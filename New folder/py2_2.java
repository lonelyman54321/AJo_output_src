/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e$b;
import androidx.datastore.preferences.protobuf.f_0;
import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.n$f;
import androidx.datastore.preferences.protobuf.v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/*
 * Renamed from py2
 */
public final class py2_2
extends n
implements xo1_0 {
    private static final py2_2 DEFAULT_INSTANCE;
    private static volatile an2_0 PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private v preferences_;

    static {
        py2_2 py2_22;
        DEFAULT_INSTANCE = py2_22 = new py2_2();
        n.j(py2_2.class, py2_22);
    }

    public py2_2() {
        v v4;
        this.preferences_ = v4 = v.b;
    }

    public static /* synthetic */ py2_2 k() {
        return DEFAULT_INSTANCE;
    }

    public static v l(py2_2 py2_22) {
        v v4 = py2_22.preferences_;
        boolean bl2 = v4.a;
        if (!bl2) {
            py2_22.preferences_ = v4 = v4.g();
        }
        return py2_22.preferences_;
    }

    public static py2$a_0 n() {
        py2_2 py2_22 = DEFAULT_INSTANCE;
        py2_22.getClass();
        n$f n$f = n$f.NEW_BUILDER;
        return (py2$a_0)((n$a)py2_22.f(n$f));
    }

    public static py2_2 o(FileInputStream object) {
        IOException iOException2;
        Object object2;
        block15: {
            RuntimeException runtimeException2;
            block14: {
                Object object3;
                Object object4;
                block13: {
                    object2 = DEFAULT_INSTANCE;
                    e$b e$b = new e$b((FileInputStream)object);
                    object = i_0.a();
                    object4 = n$f.NEW_MUTABLE_INSTANCE;
                    object2 = (n)((n)object2).f((n$f)((Object)object4));
                    object4 = GB2.c;
                    object4.getClass();
                    object3 = object2.getClass();
                    object4 = ((GB2)object4).a((Class)object3);
                    object3 = e$b.d;
                    if (object3 != null) break block13;
                    object3 = new f_0(e$b);
                }
                object4.a(object2, (D)object3, (i_0)object);
                try {
                    object4.makeImmutable(object2);
                }
                catch (RuntimeException runtimeException2) {
                    break block14;
                }
                catch (IOException iOException2) {
                    break block15;
                }
                boolean bl2 = ((n)object2).i();
                if (bl2) {
                    return (py2_2)object2;
                }
                object = new UninitializedMessageException();
                object = ((Throwable)object).getMessage();
                object2 = new IOException((String)object);
                throw object2;
            }
            object2 = runtimeException2.getCause();
            boolean bl3 = object2 instanceof InvalidProtocolBufferException;
            if (bl3) {
                throw (InvalidProtocolBufferException)runtimeException2.getCause();
            }
            throw runtimeException2;
        }
        object2 = iOException2.getCause();
        boolean bl4 = object2 instanceof InvalidProtocolBufferException;
        if (bl4) {
            throw (InvalidProtocolBufferException)iOException2.getCause();
        }
        String string2 = iOException2.getMessage();
        object2 = new IOException(string2);
        throw object2;
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
                Class<py2_2> clazz = py2_2.class;
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
                objectArray = new Object[2];
                objectArray[0] = "preferences_";
                object = py2$b.a;
                objectArray[by2] = object;
                object = DEFAULT_INSTANCE;
                return new vE2((wo1_1)object, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", objectArray);
            }
            case 2: {
                return new py2$a_0();
            }
            case 1: 
        }
        return new py2_2();
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}

