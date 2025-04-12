/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;

public class a01
implements qn1_0 {
    public final o41 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public a01(String string2) {
        vr1_0 vr1_02 = o41.a;
        this(string2, vr1_02);
    }

    public a01(String object, vr1_0 vr1_02) {
        this.c = null;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.d = object;
            dV0.c(vr1_02, "Argument must not be null");
            this.b = vr1_02;
            return;
        }
        object = new IllegalArgumentException("Must not be null or empty");
        throw object;
    }

    public a01(URL uRL) {
        vr1_0 vr1_02 = o41.a;
        String string2 = "Argument must not be null";
        dV0.c(uRL, string2);
        this.c = uRL;
        this.d = null;
        dV0.c(vr1_02, string2);
        this.b = vr1_02;
    }

    public final void b(MessageDigest messageDigest) {
        Object object = this.g;
        if (object == null) {
            object = this.c();
            Charset charset = qn1_0.a;
            this.g = object = (Object)object.getBytes(charset);
        }
        object = this.g;
        messageDigest.update((byte[])object);
    }

    public final String c() {
        Object object = this.d;
        if (object == null) {
            object = this.c;
            String string2 = "Argument must not be null";
            dV0.c(object, string2);
            object = ((URL)object).toString();
        }
        return object;
    }

    public Map d() {
        return this.b.getHeaders();
    }

    public final String e() {
        Object object = this.e;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            String string2;
            object = this.d;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (bl3) {
                object = this.c;
                string2 = "Argument must not be null";
                dV0.c(object, string2);
                object = ((URL)object).toString();
            }
            string2 = "@#&=*+-_.,:!?()/~'%;$";
            this.e = object = Uri.encode((String)object, (String)string2);
        }
        return this.e;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof a01;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            String string2;
            object = (a01)object;
            Object object2 = this.c();
            bl2 = ((String)object2).equals(string2 = ((a01)object).c());
            if (bl2 && (bl4 = (object2 = this.b).equals(object = ((a01)object).b))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.h;
        if (n3 == 0) {
            int n4;
            String string2 = this.c();
            this.h = n3 = string2.hashCode();
            o41 o412 = this.b;
            this.h = n4 = o412.hashCode() + (n3 *= 31);
        }
        return this.h;
    }

    public final String toString() {
        return this.c();
    }
}

