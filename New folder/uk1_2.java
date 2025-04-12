/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uk1
 */
public final class uk1_2
extends zs2_2 {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public uk1_2(Method method, Method method2, Method method3, Class clazz, Class clazz2) {
        Intrinsics.checkNotNullParameter(method, "putMethod");
        Intrinsics.checkNotNullParameter(method2, "getMethod");
        Intrinsics.checkNotNullParameter(method3, "removeMethod");
        Intrinsics.checkNotNullParameter(clazz, "clientProviderClass");
        Intrinsics.checkNotNullParameter(clazz2, "serverProviderClass");
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = clazz;
        this.g = clazz2;
    }

    public final void a(SSLSocket sSLSocket) {
        IllegalAccessException illegalAccessException2;
        Object object;
        String string2;
        block7: {
            string2 = "failed to remove ALPN";
            object = "sslSocket";
            Intrinsics.checkNotNullParameter(sSLSocket, (String)object);
            object = this.e;
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = sSLSocket;
            sSLSocket = null;
            try {
                ((Method)object).invoke(null, objectArray);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block7;
            }
            object = new AssertionError(string2, invocationTargetException);
            throw object;
        }
        object = new AssertionError(string2, illegalAccessException2);
        throw object;
    }

    public final void d(SSLSocket sSLSocket, String object, List object2) {
        InvocationTargetException invocationTargetException2;
        String string2;
        block18: {
            Class[] classArray;
            Object object3;
            Object object4;
            int n3;
            int n4 = 1;
            int n7 = 2;
            string2 = "failed to set ALPN";
            Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
            Object object5 = "protocols";
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object2 = (Iterable)object2;
            object5 = new ArrayList();
            object2 = object2.iterator();
            while ((n3 = object2.hasNext()) != 0) {
                object3 = object4 = object2.next();
                object3 = (ib2_2)((Object)object4);
                classArray = ib2_2.HTTP_1_0;
                if (object3 == classArray) continue;
                ((ArrayList)object5).add(object4);
            }
            n3 = yx_2.o(object5, 10);
            object2 = new ArrayList(n3);
            object5 = ((ArrayList)object5).iterator();
            while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object4 = ((ib2_2)((Object)object5.next())).toString();
                ((ArrayList)object2).add(object4);
            }
            object5 = zs2_2.class;
            object5 = ((Class)object5).getClassLoader();
            object4 = this.f;
            object3 = this.g;
            classArray = new Class[n7];
            classArray[0] = object4;
            classArray[n4] = object3;
            object4 = new Object((ArrayList)object2);
            object2 = Proxy.newProxyInstance((ClassLoader)object5, classArray, object4);
            object5 = this.c;
            Object[] objectArray = new Object[n7];
            objectArray[0] = sSLSocket;
            objectArray[n4] = object2;
            sSLSocket = null;
            try {
                ((Method)object5).invoke(null, objectArray);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block18;
            }
            object = new AssertionError(string2, illegalAccessException);
            throw object;
        }
        object = new AssertionError(string2, invocationTargetException2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String f(SSLSocket object) {
        InvocationTargetException invocationTargetException2;
        Object object2;
        String string2;
        block5: {
            IllegalAccessException illegalAccessException2;
            block4: {
                int n3;
                string2 = "failed to get ALPN selected protocol";
                object2 = "sslSocket";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                try {
                    object2 = this.d;
                    n3 = 1;
                    Object object3 = new Object[n3];
                    String string3 = null;
                    object3[0] = object;
                    object = null;
                    object2 = ((Method)object2).invoke(null, object3);
                    object2 = Proxy.getInvocationHandler(object2);
                    object3 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider";
                    Intrinsics.checkNotNull(object2, (String)object3);
                    object2 = (Uk1$a)object2;
                    n3 = (int)(((Uk1$a)object2).b ? 1 : 0);
                    if (n3 == 0 && (string3 = ((Uk1$a)object2).c) == null) {
                        object2 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?";
                        n3 = 4;
                        zs2_2.i(n3, (String)object2, null);
                        return null;
                    }
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block4;
                }
                catch (InvocationTargetException invocationTargetException2) {
                    break block5;
                }
                if (n3 == 0) return ((Uk1$a)object2).c;
                return object;
            }
            object2 = new AssertionError(string2, illegalAccessException2);
            throw object2;
        }
        object2 = new AssertionError(string2, invocationTargetException2);
        throw object2;
    }
}

