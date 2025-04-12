/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class DR2$a
implements LI0$b {
    public final Object a() {
        Object object = "SHA-256";
        try {
            object = MessageDigest.getInstance((String)object);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            object = new RuntimeException(noSuchAlgorithmException);
            throw object;
        }
        DR2$b dR2$b = new DR2$b((MessageDigest)object);
        return dR2$b;
    }
}

