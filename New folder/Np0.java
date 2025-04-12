/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class Np0 {
    public final String a;
    public Cipher b;

    public Np0(String object) {
        Intrinsics.checkNotNullParameter(object, "publicKey");
        String string2 = "versionNumber";
        String string3 = "VERSION_1";
        Intrinsics.checkNotNullParameter(string3, string2);
        this.a = object;
        int n3 = ((String)object).length();
        if (n3 > 0) {
            return;
        }
        string2 = "Public key must not be empty.".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Exception exception2;
        Object[] objectArray;
        Object[] objectArray2;
        block4: {
            Object object;
            Object object2;
            block3: {
                object2 = "";
                objectArray2 = "Cleaned Public Key: ";
                objectArray = null;
                String string2 = "RSA";
                String string3 = "RSA/ECB/PKCS1Padding";
                try {
                    String string4 = this.a;
                    CharSequence charSequence = "\\s+";
                    object = new Regex((String)charSequence);
                    string4 = ((Regex)object).replace(string4, (String)object2);
                    object = "-----BEGINPUBLICKEY-----";
                    string4 = StringsKt.U(string4, (String)object);
                    object = "-----ENDPUBLICKEY-----";
                    string4 = StringsKt.V(string4, (String)object);
                    object = yn3_0.a;
                    charSequence = new StringBuilder((String)objectArray2);
                    ((StringBuilder)charSequence).append(string4);
                    objectArray2 = ((StringBuilder)charSequence).toString();
                    charSequence = new Object[]{};
                    ((yn3$a)object).a((String)objectArray2, (Object[])charSequence);
                    objectArray2 = "publicKey";
                    Intrinsics.checkNotNullParameter(string4, (String)objectArray2);
                    objectArray2 = "\\n";
                    objectArray2 = kotlin.text.b.n(string4, (String)objectArray2, (String)object2, false);
                    string4 = "\n";
                    objectArray2 = kotlin.text.b.n((String)objectArray2, string4, (String)object2, false);
                    string4 = "\r";
                    object2 = kotlin.text.b.n((String)objectArray2, string4, (String)object2, false);
                    object2 = Base64.decode((String)object2, (int)0);
                    Intrinsics.checkNotNull(object2);
                    int n3 = ((Object)object2).length;
                    if (n3 == 0) {
                        objectArray2 = "Public key byte array cannot be empty.";
                        object2 = new IllegalArgumentException((String)objectArray2);
                        throw object2;
                    }
                    objectArray2 = new X509EncodedKeySpec((byte[])object2);
                    object2 = KeyFactory.getInstance(string2);
                    object2 = ((KeyFactory)object2).generatePublic((KeySpec)objectArray2);
                    objectArray2 = Cipher.getInstance(string3);
                    this.b = objectArray2;
                    if (objectArray2 == null) break block3;
                    int n4 = 1;
                    objectArray2.init(n4, (Key)object2);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object2 = "Cipher initialized successfully.";
            objectArray2 = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray2);
            return;
        }
        objectArray2 = yn3_0.a;
        objectArray = new Object[]{};
        objectArray2.c(exception2, "Error initializing cipher", objectArray);
        throw exception2;
    }
}

