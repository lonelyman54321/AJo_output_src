/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from hj
 */
public class hj_2
implements y83_0 {
    public static final gj_2 f;
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    static {
        gj_2 gj_22;
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f = gj_22 = new gj_2();
    }

    public hj_2(Class genericDeclaration) {
        Class<Boolean> clazz;
        Intrinsics.checkNotNullParameter(genericDeclaration, "sslSocketClass");
        this.a = genericDeclaration;
        int n3 = 1;
        Object object = new Class[n3];
        object[0] = clazz = Boolean.TYPE;
        object = genericDeclaration.getDeclaredMethod("setUseSessionTickets", (Class<?>)object);
        Intrinsics.checkNotNullExpressionValue(object, "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)");
        this.b = object;
        object = new Class[n3];
        object[0] = String.class;
        this.c = object = genericDeclaration.getMethod("setHostname", (Class<?>)object);
        this.d = object = genericDeclaration.getMethod("getAlpnSelectedProtocol", null);
        Class[] classArray = new Class[n3];
        classArray[0] = byte[].class;
        genericDeclaration = genericDeclaration.getMethod("setAlpnProtocols", classArray);
        this.e = genericDeclaration;
    }

    public final boolean a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return this.a.isInstance(sSLSocket);
    }

    public final String b(SSLSocket object) {
        IllegalAccessException illegalAccessException2;
        Object object2;
        block14: {
            InvocationTargetException invocationTargetException2;
            block15: {
                Object object3;
                block12: {
                    object2 = "sslSocket";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    boolean bl2 = this.a((SSLSocket)object);
                    object3 = null;
                    if (!bl2) {
                        return null;
                    }
                    object2 = this.d;
                    object = ((Method)object2).invoke(object, null);
                    object = (byte[])object;
                    if (object == null) break block12;
                    Object object4 = Charsets.UTF_8;
                    try {
                        object3 = object2 = new String((byte[])object, (Charset)object4);
                        break block12;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block14;
                    }
                    object2 = invocationTargetException2.getCause();
                    boolean bl3 = object2 instanceof NullPointerException;
                    if (!bl3 || !(bl2 = Intrinsics.areEqual(object2 = ((Throwable)((NullPointerException)object2)).getMessage(), object4 = "ssl == null"))) break block15;
                }
                return object3;
            }
            object2 = new AssertionError((Object)invocationTargetException2);
            throw object2;
        }
        object2 = new AssertionError((Object)illegalAccessException2);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(SSLSocket sSLSocket, String object, List object2) {
        IllegalAccessException illegalAccessException2;
        block5: {
            InvocationTargetException invocationTargetException2;
            block4: {
                Object object3;
                int n3;
                block3: {
                    n3 = 1;
                    Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
                    object3 = "protocols";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    boolean bl2 = this.a(sSLSocket);
                    if (!bl2) return;
                    try {
                        object3 = this.b;
                        Object[] objectArray = new Object[n3];
                        Boolean bl3 = Boolean.TRUE;
                        objectArray[0] = bl3;
                        ((Method)object3).invoke((Object)sSLSocket, objectArray);
                        if (object == null) break block3;
                        object3 = this.c;
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        ((Method)object3).invoke((Object)sSLSocket, objectArray);
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block4;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block5;
                    }
                }
                object = this.e;
                object3 = zs2_2.a;
                object2 = Zs2$a.b((List)object2);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                ((Method)object).invoke((Object)sSLSocket, objectArray);
                return;
            }
            object = new AssertionError((Object)invocationTargetException2);
            throw object;
        }
        object = new AssertionError((Object)illegalAccessException2);
        throw object;
    }

    public final boolean isSupported() {
        return oi_2.e;
    }
}

