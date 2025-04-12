/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gq2
 */
public final class gq2_2 {
    public final String a;
    public final String b;
    public Cipher c;

    public gq2_2(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "publicKey");
        Intrinsics.checkNotNullParameter(string3, "versionNumber");
        this.a = string2;
        this.b = string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(String object) {
        Exception exception2;
        String string2;
        Object object2;
        block6: {
            String string3;
            Object object3;
            Object object4;
            int n3;
            CharSequence charSequence;
            block5: {
                object2 = "encryptedData final: ";
                charSequence = "encryptedData: ";
                string2 = null;
                if (object == null) return string2;
                n3 = object.length();
                if (n3 == 0) {
                    return string2;
                }
                try {
                    object4 = this.c;
                    if (object4 != null) break block5;
                    this.b();
                }
                catch (Exception exception2) {
                    break block6;
                }
            }
            if ((object4 = this.c) != null) {
                object3 = StandardCharsets.UTF_8;
                string3 = "UTF_8";
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                object = ((String)object).getBytes((Charset)object3);
                object3 = "getBytes(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object = ((Cipher)object4).doFinal((byte[])object);
            } else {
                object = null;
            }
            n3 = 2;
            string2 = Base64.encodeToString((byte[])object, (int)n3);
            object = yn3_0.a;
            object4 = new StringBuilder((String)charSequence);
            ((StringBuilder)object4).append(string2);
            charSequence = ((StringBuilder)object4).toString();
            n3 = 0;
            object4 = null;
            object3 = new Object[]{};
            ((yn3$a)object).a((String)charSequence, (Object[])object3);
            charSequence = this.b;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string2);
            string3 = "___";
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append((String)charSequence);
            string2 = ((StringBuilder)object3).toString();
            charSequence = new StringBuilder((String)object2);
            ((StringBuilder)charSequence).append(string2);
            object2 = ((StringBuilder)charSequence).toString();
            charSequence = new Object[]{};
            ((yn3$a)object).a((String)object2, (Object[])charSequence);
            return string2;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        block6: {
            block5: {
                block4: {
                    var1_1 = this.a;
                    var2_3 = "RSA";
                    var3_4 = "RSA/ECB/PKCS1Padding";
                    try {
                        var4_5 = var1_1.length();
                        var5_6 = var4_5 / 2;
                        var6_7 = new byte[var5_6];
                        var7_8 = 0;
lbl9:
                        // 2 sources

                        while (var7_8 < var4_5) {
                            var8_9 = var7_8 / 2;
                            var9_10 = var1_1.charAt(var7_8);
                            var10_11 = 16;
                            var9_10 = Character.digit((char)var9_10, var10_11) << 4;
                            var11_12 = var7_8 + 1;
                            var11_12 = var1_1.charAt(var11_12);
                            var10_11 = Character.digit(var11_12, var10_11);
                            break block4;
                        }
                        break block5;
                    }
                    catch (Exception var1_2) {
                        break block6;
                    }
                }
                var9_10 = (byte)(var9_10 + var10_11);
                var6_7[var8_9] = var9_10;
                var7_8 += 2;
                ** GOTO lbl9
            }
            var1_1 = new X509EncodedKeySpec(var6_7);
            var2_3 = KeyFactory.getInstance((String)var2_3);
            var1_1 = var2_3.generatePublic((KeySpec)var1_1);
            this.c = var2_3 = Cipher.getInstance(var3_4);
            if (var2_3 == null) return;
            var12_13 = 1;
            var2_3.init(var12_13, (Key)var1_1);
            return;
        }
        var2_3 = yn3_0.a;
        var2_3.e(var1_2);
    }
}

