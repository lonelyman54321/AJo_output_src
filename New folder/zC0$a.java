/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

public final class zC0$a
extends ov0_2 {
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final /* synthetic */ zc0_2 f;

    public zC0$a(zc0_2 zc0_22, y63_0 y63_02, long l2) {
        Intrinsics.checkNotNullParameter(y63_02, "delegate");
        this.f = zc0_22;
        super(y63_02);
        this.b = l2;
    }

    public final IOException a(IOException iOException) {
        boolean bl2 = this.c;
        if (bl2) {
            return iOException;
        }
        this.c = bl2 = true;
        return this.f.a(false, bl2, iOException);
    }

    public final void close() {
        long l2;
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        this.e = bl2 = true;
        long l3 = this.b;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l2 = (l4 = this.d) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            throw protocolException;
        }
        try {
            super.close();
            bl2 = false;
            Object var7_6 = null;
        }
        catch (IOException iOException) {
            throw this.a(iOException);
        }
        this.a(null);
    }

    public final void flush() {
        try {
            super.flush();
            return;
        }
        catch (IOException iOException) {
            throw this.a(iOException);
        }
    }

    public final void s0(ce_2 object, long l2) {
        CharSequence charSequence = "source";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        boolean bl2 = this.e ^ true;
        if (bl2) {
            long l3;
            long l4 = this.b;
            long l7 = -1;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false && (object2 = (l3 = (l7 = this.d + l2) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
                charSequence = D70.c(l4, "expected ", " bytes but received ");
                long l12 = this.d + l2;
                ((StringBuilder)charSequence).append(l12);
                String string2 = ((StringBuilder)charSequence).toString();
                object = new ProtocolException(string2);
                throw object;
            }
            try {
                super.s0((ce_2)object, l2);
                l7 = this.d + l2;
            }
            catch (IOException iOException) {
                throw this.a(iOException);
            }
            this.d = l7;
            return;
        }
        String string3 = "closed".toString();
        object = new IllegalStateException(string3);
        throw object;
    }
}

