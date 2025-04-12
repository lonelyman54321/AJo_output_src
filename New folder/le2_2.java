/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from LE2
 */
public final class le2_2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ le2_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                return ((Vt1)this.d).d();
            }
            case 0: 
        }
        Iterator iterator = ((je2_2)this.d).e;
        Intrinsics.checkNotNull(iterator);
        iterator = ((k21_0)((Object)iterator)).a();
        int n4 = yx_2.o((Iterable)((Object)iterator), 10);
        ArrayList<Certificate> arrayList = new ArrayList<Certificate>(n4);
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Certificate certificate = (Certificate)iterator.next();
            String string2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
            Intrinsics.checkNotNull(certificate, string2);
            certificate = (X509Certificate)certificate;
            arrayList.add(certificate);
        }
        return arrayList;
    }
}

