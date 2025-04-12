/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Wk1
 */
public final class wk1_2
extends zs2_2 {
    public static final boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2;
        block5: {
            block6: {
                Class<SSLSocket> clazz;
                block4: {
                    int n3;
                    clazz = System.getProperty("java.specification.version");
                    int n4 = 0;
                    if (clazz != null) {
                        clazz = StringsKt.toIntOrNull((String)((Object)clazz));
                    } else {
                        n3 = 0;
                        clazz = null;
                    }
                    bl2 = false;
                    if (clazz == null) break block4;
                    n3 = (Integer)((Object)clazz);
                    if (n3 < (n4 = 9)) break block5;
                    break block6;
                }
                clazz = SSLSocket.class;
                String string2 = "getApplicationProtocol";
                try {
                    clazz.getMethod(string2, null);
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            bl2 = true;
        }
        c = bl2;
    }

    public final void d(SSLSocket sSLSocket, String stringArray, List arrayList) {
        Object object;
        int n3;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        stringArray = "protocols";
        Intrinsics.checkNotNullParameter(arrayList, (String)stringArray);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Intrinsics.checkNotNullParameter(arrayList, (String)stringArray);
        arrayList = arrayList;
        stringArray = new ArrayList();
        arrayList = arrayList.iterator();
        while ((n3 = arrayList.hasNext()) != 0) {
            Object object2 = object = arrayList.next();
            object2 = (ib2_2)((Object)object);
            ib2_2 ib2_22 = ib2_2.HTTP_1_0;
            if (object2 == ib2_22) continue;
            stringArray.add(object);
        }
        n3 = yx_2.o(stringArray, 10);
        arrayList = new ArrayList(n3);
        stringArray = stringArray.iterator();
        while ((n3 = (int)(stringArray.hasNext() ? 1 : 0)) != 0) {
            object = ((ib2_2)((Object)stringArray.next())).toString();
            arrayList.add(object);
        }
        stringArray = new String[]{};
        stringArray = arrayList.toArray(stringArray);
        ll0.b(sSLParameters, stringArray);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String f(SSLSocket object) {
        boolean bl2;
        Object object2;
        block5: {
            String string2;
            Intrinsics.checkNotNullParameter(object, "sslSocket");
            object2 = null;
            try {
                object = vk1_2.a((SSLSocket)object);
                if (object == null) {
                    bl2 = true;
                    break block5;
                }
                string2 = "";
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return object2;
            }
            bl2 = Intrinsics.areEqual(object, string2);
        }
        if (!bl2) return object;
        return object2;
    }
}

