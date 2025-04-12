/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import com.facebook.FacebookSdk;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlin.text.b;

public final class s72 {
    public static final PublicKey a(String object) {
        Intrinsics.checkNotNullParameter(object, "key");
        String string2 = "";
        object = Base64.decode((String)b.n(b.n(b.n((String)object, "\n", string2, false), "-----BEGIN PUBLIC KEY-----", string2, false), "-----END PUBLIC KEY-----", string2, false), (int)0);
        Intrinsics.checkNotNullExpressionValue(object, "decode(pubKeyString, Base64.DEFAULT)");
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
        object = KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec);
        Intrinsics.checkNotNullExpressionValue(object, "kf.generatePublic(x509publicKey)");
        return object;
    }

    public static final String b(String object) {
        r72 r722;
        Intrinsics.checkNotNullParameter(object, "kid");
        Object object2 = new StringBuilder("www.");
        Object object3 = FacebookSdk.t;
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        URL uRL = new URL("https", (String)object2, "/.well-known/oauth/openid/keys/");
        object2 = new ReentrantLock();
        Condition condition = ((ReentrantLock)object2).newCondition();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Executor executor = FacebookSdk.d();
        object3 = r722;
        r722 = new r72(uRL, ref$ObjectRef, (String)object, (ReentrantLock)object2, condition);
        executor.execute(r722);
        object2.lock();
        try {
            object = TimeUnit.MILLISECONDS;
            long l2 = 5000L;
            condition.await(l2, (TimeUnit)((Object)object));
            return (String)ref$ObjectRef.element;
        }
        finally {
            object2.unlock();
        }
    }

    public static final boolean c(PublicKey object, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "publicKey");
        Intrinsics.checkNotNullParameter(string2, "data");
        Intrinsics.checkNotNullParameter(string3, "signature");
        Object object2 = "SHA256withRSA";
        try {
            object2 = Signature.getInstance((String)object2);
        }
        catch (Exception exception) {
            return false;
        }
        ((Signature)object2).initVerify((PublicKey)object);
        object = Charsets.UTF_8;
        object = string2.getBytes((Charset)object);
        string2 = "this as java.lang.String).getBytes(charset)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        ((Signature)object2).update((byte[])object);
        int n3 = 8;
        object = Base64.decode((String)string3, (int)n3);
        string2 = "decode(signature, Base64.URL_SAFE)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return ((Signature)object2).verify((byte[])object);
    }
}

