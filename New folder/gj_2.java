/*
 * Decompiled with CFR 0.152.
 */
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from gj
 */
public final class gj_2
implements Xn0$a {
    public final /* synthetic */ String a;

    public gj_2() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public final boolean a(SSLSocket object) {
        Intrinsics.checkNotNullParameter(object, "sslSocket");
        object = object.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(object, "sslSocket.javaClass.name");
        CharSequence charSequence = new StringBuilder();
        String string2 = this.a;
        charSequence.append(string2);
        charSequence.append('.');
        charSequence = charSequence.toString();
        return b.s((String)object, (String)charSequence, false);
    }

    public final y83_0 b(SSLSocket object) {
        String string2;
        CharSequence charSequence;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "sslSocket");
        Object object2 = hj_2.f;
        object2 = object = object.getClass();
        while (!(bl2 = Intrinsics.areEqual(charSequence = ((Class)object2).getSimpleName(), string2 = "OpenSSLSocketImpl"))) {
            if ((object2 = ((Class)object2).getSuperclass()) != null) continue;
            charSequence = new StringBuilder("No OpenSSLSocketImpl superclass of socket of type ");
            ((StringBuilder)charSequence).append(object);
            object = ((StringBuilder)charSequence).toString();
            object2 = new AssertionError(object);
            throw object2;
        }
        Intrinsics.checkNotNull(object2);
        object = new hj_2((Class)object2);
        return object;
    }
}

