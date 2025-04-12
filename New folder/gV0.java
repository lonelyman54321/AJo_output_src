/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import java.util.List;

public final class gV0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public gV0(String string2, String string3, String string4, List object) {
        string2.getClass();
        this.a = string2;
        string3.getClass();
        this.b = string3;
        this.c = string4;
        object.getClass();
        this.d = object;
        object = "-";
        this.e = string2 = KW.a(string2, (String)object, string3, (String)object, string4);
    }

    public final String toString() {
        Object object;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = new StringBuilder("FontRequest {mProviderAuthority: ");
        String string2 = this.a;
        charSequence.append(string2);
        charSequence.append(", mProviderPackage: ");
        string2 = this.b;
        charSequence.append(string2);
        charSequence.append(", mQuery: ");
        string2 = this.c;
        charSequence.append(string2);
        charSequence.append(", mCertificates:");
        charSequence = charSequence.toString();
        stringBuilder.append((String)charSequence);
        charSequence = null;
        string2 = null;
        for (int i3 = 0; i3 < (n3 = (object = this.d).size()); ++i3) {
            int n4;
            stringBuilder.append(" [");
            object = (List)object.get(i3);
            for (n3 = 0; n3 < (n4 = object.size()); ++n3) {
                stringBuilder.append(" \"");
                String string3 = Base64.encodeToString((byte[])((byte[])object.get(n3)), (int)0);
                stringBuilder.append(string3);
                string3 = "\"";
                stringBuilder.append(string3);
            }
            object = " ]";
            stringBuilder.append((String)object);
        }
        stringBuilder.append("}mCertificatesArray: 0");
        return stringBuilder.toString();
    }
}

