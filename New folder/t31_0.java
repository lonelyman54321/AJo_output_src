/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.util.Base64
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from T31
 */
public final class t31_0 {
    public static final t31_0 a;
    public static final String[] b;

    static {
        t31_0 t31_02;
        a = t31_02 = new t31_0();
        b = new String[]{"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"};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a(String object) {
        int n3;
        int n4;
        Object object2;
        Object object3;
        block5: {
            object3 = new File((String)object);
            a.getClass();
            object2 = new FileInputStream((File)object3);
            int n7 = 1024;
            object = new BufferedInputStream((InputStream)object2, n7);
            object2 = "MD5";
            try {
                object2 = MessageDigest.getInstance((String)object2);
                object3 = new byte[n7];
                break block5;
            }
            catch (Throwable throwable) {}
            try {
                throw throwable;
            }
            catch (Throwable throwable) {
                xj3_1.b((Closeable)object, throwable);
                throw throwable;
            }
        }
        do {
            if ((n4 = ((InputStream)object).read((byte[])object3)) <= 0) continue;
            n3 = 0;
            ((MessageDigest)object2).update((byte[])object3, 0, n4);
        } while (n4 != (n3 = -1));
        object2 = ((MessageDigest)object2).digest();
        n4 = 1;
        object3 = new BigInteger(n4, (byte[])object2);
        int n8 = 16;
        object3 = ((BigInteger)object3).toString(n8);
        object2 = "BigInteger(1, md.digest()).toString(16)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        xj3_1.b((Closeable)object, null);
        return object3;
    }

    public static final String b(Context context) {
        Object object;
        Object object2;
        int n3;
        int n4 = 3;
        int n7 = 2;
        int n8 = 5;
        int n10 = 1;
        Object object3 = context;
        Intrinsics.checkNotNullParameter(context, "context");
        Object object4 = CertificateFactory.getInstance("X.509");
        Object object5 = b;
        int n14 = ((String[])object5).length;
        Serializable serializable = new ArrayList(n14);
        n14 = ((String[])object5).length;
        Object object6 = null;
        for (n3 = 0; n3 < n14; n3 += n10) {
            object2 = object5[n3];
            object2 = Base64.decode((String)object2, (int)0);
            object = new ByteArrayInputStream((byte[])object2);
            object2 = ((CertificateFactory)object4).generateCertificate((InputStream)object);
            ((ArrayList)serializable).add(object2);
        }
        object4 = CollectionsKt.m0(serializable);
        serializable = new Ref$ObjectRef();
        object5 = new ReentrantLock();
        Condition condition = ((ReentrantLock)object5).newCondition();
        ((ReentrantLock)object5).lock();
        n3 = 0;
        object6 = null;
        object2 = "android.content.pm.Checksum";
        try {
            object2 = Class.forName((String)object2);
            object = "TYPE_WHOLE_MD5";
        }
        catch (Throwable throwable) {
            ((ReentrantLock)object5).unlock();
            return null;
        }
        object2 = ((Class)object2).getField((String)object);
        object = "checksumClass.getField(\"TYPE_WHOLE_MD5\")";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        object2 = ((Field)object2).get(null);
        object = "android.content.pm.PackageManager$OnChecksumsReadyListener";
        object = Class.forName((String)object);
        Class<PackageManager> clazz = t31_0.class;
        clazz = clazz.getClassLoader();
        Object object7 = new Class[n10];
        object7[0] = object;
        object6 = new s31_0(object2, (Ref$ObjectRef)serializable, (ReentrantLock)object5, condition);
        object6 = Proxy.newProxyInstance((ClassLoader)((Object)clazz), object7, (InvocationHandler)object6);
        clazz = "resultChecksum: String? \u2026       }\n              })";
        Intrinsics.checkNotNullExpressionValue(object6, (String)((Object)clazz));
        clazz = PackageManager.class;
        object7 = "requestChecksums";
        Object object8 = new Class[n8];
        Class clazz2 = String.class;
        object8[0] = clazz2;
        clazz2 = Boolean.TYPE;
        object8[n10] = clazz2;
        clazz2 = Integer.TYPE;
        object8[n7] = clazz2;
        clazz2 = List.class;
        object8[n4] = clazz2;
        int n15 = 4;
        object8[n15] = object;
        object8 = clazz.getMethod((String)object7, (Class<?>)object8);
        object = "PackageManager::class\n  \u2026ecksumReadyListenerClass)";
        Intrinsics.checkNotNullExpressionValue(object8, (String)object);
        object = context.getPackageManager();
        object3 = context.getPackageName();
        object4 = CollectionsKt.m0((Collection)object4);
        Object[] objectArray = new Object[n8];
        objectArray[0] = object3;
        object3 = Boolean.FALSE;
        objectArray[n10] = object3;
        objectArray[n7] = object2;
        objectArray[n4] = object4;
        n4 = 4;
        objectArray[n4] = object6;
        ((Method)object8).invoke(object, objectArray);
        condition.await();
        object8 = ((Ref$ObjectRef)serializable).element;
        object8 = (String)object8;
        ((ReentrantLock)object5).unlock();
        return object8;
    }
}

