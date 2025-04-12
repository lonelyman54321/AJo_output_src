/*
 * Decompiled with CFR 0.152.
 */
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class E91$c
extends E91$a {
    public final ob1_1 d;
    public long e;
    public boolean f;
    public final /* synthetic */ e91_0 g;

    public E91$c(e91_0 e91_02, ob1_1 ob1_12) {
        Intrinsics.checkNotNullParameter(ob1_12, "url");
        this.g = e91_02;
        super(e91_02);
        this.d = ob1_12;
        this.e = -1;
        this.f = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a0(ce_2 object, long l2) {
        long l3;
        long l4;
        long l7;
        e91_0 e91_02;
        long l8;
        long l12;
        block12: {
            boolean bl2;
            block13: {
                long l14;
                long l15;
                Object object2;
                Object object3;
                Object object4;
                block14: {
                    NumberFormatException numberFormatException2;
                    String string2;
                    block11: {
                        object4 = "sink";
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        l12 = 0L;
                        long l16 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
                        if (l16 < 0) {
                            object = Wm2.a(l2, "byteCount < 0: ");
                            object = object.toString();
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                            throw illegalArgumentException;
                        }
                        l16 = this.b ^ 1;
                        if (l16 == false) {
                            String string3 = "closed".toString();
                            object = new IllegalStateException(string3);
                            throw object;
                        }
                        l16 = (long)this.f;
                        l8 = -1;
                        if (l16 == false) {
                            return l8;
                        }
                        long l17 = this.e;
                        e91_02 = this.g;
                        Object object5 = l17 == l12 ? 0 : (l17 < l12 ? -1 : 1);
                        if (object5 != false && (object5 = l17 == l8 ? 0 : (l17 < l8 ? -1 : 1)) != false) break block12;
                        string2 = "expected chunk size and optional extensions but was \"";
                        object3 = l17 == l8 ? 0 : (l17 < l8 ? -1 : 1);
                        if (object3 != false) {
                            object2 = e91_02.c;
                            object2.L();
                        }
                        try {
                            String string4;
                            object2 = e91_02.c;
                            this.e = l17 = object2.H0();
                            object2 = e91_02.c;
                            object2 = object2.L();
                            object2 = StringsKt.m0((CharSequence)object2);
                            object2 = object2.toString();
                            l15 = this.e;
                            l14 = l15 == l12 ? 0 : (l15 < l12 ? -1 : 1);
                            if (l14 < 0) break block11;
                            l14 = ((String)object2).length();
                            object3 = 0;
                            if (l14 > 0 && (l14 = (long)kotlin.text.b.s((String)object2, string4 = ";", false)) == false) break block11;
                        }
                        catch (NumberFormatException numberFormatException2) {}
                        l17 = this.e;
                        long l18 = l17 - l12;
                        object5 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                        if (object5 != false) break block13;
                        break block14;
                    }
                    CharSequence charSequence = new StringBuilder(string2);
                    l12 = this.e;
                    charSequence.append(l12);
                    charSequence.append((String)object2);
                    char c2 = '\"';
                    charSequence.append(c2);
                    charSequence = charSequence.toString();
                    object = new ProtocolException((String)charSequence);
                    throw object;
                    String string5 = numberFormatException2.getMessage();
                    ProtocolException protocolException = new ProtocolException(string5);
                    throw protocolException;
                }
                this.f = false;
                object4 = e91_02.f;
                object4.getClass();
                Object object6 = new m41$a_0();
                while (true) {
                    object2 = ((r41_0)object4).a;
                    long l19 = ((r41_0)object4).b;
                    object2 = object2.x(l19);
                    l19 = ((r41_0)object4).b;
                    object3 = ((String)object2).length();
                    l15 = object3;
                    ((r41_0)object4).b = l19 -= l15;
                    l14 = ((String)object2).length();
                    if (l14 == false) {
                        e91_02.g = object4 = ((m41$a_0)object6).e();
                        object4 = e91_02.a;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((x72_0)object4).j;
                        object6 = e91_02.g;
                        Intrinsics.checkNotNull(object6);
                        object2 = this.d;
                        ia1_1.b((z80_0)object4, (ob1_1)object2, (m41_0)object6);
                        this.a();
                        break;
                    }
                    ((m41$a_0)object6).b((String)object2);
                }
            }
            if (!(bl2 = this.f)) {
                return l8;
            }
        }
        if ((l7 = (l4 = (l3 = super.a0((ce_2)object, l2 = Math.min(l2, l12 = this.e))) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            this.e = l12 = this.e - l3;
            return l3;
        }
        e91_02.b.l();
        object = new ProtocolException("unexpected end of stream");
        this.a();
        throw object;
    }

    public final void close() {
        Object object;
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        bl2 = this.f;
        if (bl2 && !(bl2 = ez3.h(this, (TimeUnit)((Object)(object = TimeUnit.MILLISECONDS))))) {
            object = this.g.b;
            ((je2_2)object).l();
            this.a();
        }
        this.b = true;
    }
}

