/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

public final class zC0$b
extends pv0_2 {
    public final long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zc0_2 g;

    public zC0$b(zc0_2 zc0_22, a93_0 a93_02, long l2) {
        boolean bl2;
        String string2 = "delegate";
        Intrinsics.checkNotNullParameter(a93_02, string2);
        this.g = zc0_22;
        super(a93_02);
        this.b = l2;
        this.d = bl2 = true;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            bl2 = false;
            zc0_22 = null;
            this.a(null);
        }
    }

    public final IOException a(IOException iOException) {
        boolean bl2;
        boolean bl3 = this.e;
        if (bl3) {
            return iOException;
        }
        this.e = bl3 = true;
        zc0_2 zc0_22 = this.g;
        if (iOException == null && (bl2 = this.d)) {
            this.d = false;
            zc0_22.b.getClass();
            String string2 = "call";
            RealCall realCall = zc0_22.a;
            Intrinsics.checkNotNullParameter(realCall, string2);
        }
        return zc0_22.a(bl3, false, iOException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a0(ce_2 object, long l2) {
        Object object2;
        boolean bl2;
        long l3;
        String string2 = "expected ";
        Object object3 = "sink";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n3 = this.f ^ 1;
        if (n3 == 0) {
            String string3 = "closed".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        try {
            object3 = this.a;
            l3 = object3.a0((ce_2)object, l2);
            bl2 = this.d;
            if (bl2) {
                bl2 = false;
                object2 = null;
                this.d = false;
                object2 = this.g;
                object3 = ((zc0_2)object2).b;
                object2 = ((zc0_2)object2).a;
                object3.getClass();
                object3 = "call";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
            }
        }
        catch (IOException iOException) {
            throw this.a(iOException);
        }
        bl2 = false;
        object2 = null;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object4 == false) {
            this.a(null);
            return l4;
        }
        long l8 = this.c + l3;
        long l12 = this.b;
        long l14 = l12 - l4;
        Object object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object5 != false && (n3 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1)) > 0) {
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append(l12);
            object2 = " bytes but received ";
            charSequence.append((String)object2);
            charSequence.append(l8);
            charSequence = charSequence.toString();
            object = new ProtocolException((String)charSequence);
            throw object;
        }
        this.c = l8;
        Object object6 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
        if (object6 != false) return l3;
        this.a(null);
        return l3;
    }

    public final void close() {
        boolean bl2 = this.f;
        if (bl2) {
            return;
        }
        this.f = bl2 = true;
        try {
            super.close();
            bl2 = false;
            Object var2_2 = null;
        }
        catch (IOException iOException) {
            throw this.a(iOException);
        }
        this.a(null);
    }
}

