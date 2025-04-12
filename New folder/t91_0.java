/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from T91
 */
public final class t91_0
implements Closeable {
    public static final Logger g = Logger.getLogger(f91_0.class.getName());
    public final re_2 a;
    public final boolean b;
    public final ce_2 c;
    public int d;
    public boolean e;
    public final C91$b f;

    public t91_0(re_2 re_22, boolean bl2) {
        C91$b c91$b;
        Intrinsics.checkNotNullParameter(re_22, "sink");
        this.a = re_22;
        this.b = bl2;
        this.c = re_22;
        this.d = 16384;
        this.f = c91$b = new C91$b((ce_2)re_22);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(R03 objectArray) {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                Object object;
                block10: {
                    int n3;
                    int n4;
                    block11: {
                        block12: {
                            object = "peerSettings";
                            try {
                                Intrinsics.checkNotNullParameter(objectArray, (String)object);
                                Object object2 = this.e;
                                if (object2 != 0) break block10;
                                object2 = this.d;
                                int n7 = objectArray.a;
                                Object object3 = n7 & 0x20;
                                if (object3 != 0) {
                                    object = objectArray.b;
                                    object3 = 5;
                                    object2 = object[object3];
                                }
                                this.d = object2;
                                object2 = n7 & 2;
                                object3 = -1;
                                n4 = 1;
                                if (object2 != 0) {
                                    object = objectArray.b;
                                    object2 = object[n4];
                                } else {
                                    object2 = -1;
                                }
                                if (object2 == object3) break block11;
                                object = this.f;
                                if ((n7 &= 2) != 0) {
                                    objectArray = objectArray.b;
                                    object3 = objectArray[n4];
                                }
                                object.getClass();
                                n3 = 16384;
                                n3 = Math.min(object3, n3);
                                n7 = ((C91$b)object).e;
                                if (n7 == n3) break block11;
                                if (n3 < n7) {
                                    n7 = ((C91$b)object).c;
                                    ((C91$b)object).c = n7 = Math.min(n7, n3);
                                }
                                ((C91$b)object).d = n4;
                                ((C91$b)object).e = n3;
                                n7 = ((C91$b)object).i;
                                if (n3 >= n7) break block11;
                                if (n3 != 0) break block12;
                                objectArray = ((C91$b)object).f;
                                n7 = 0;
                                rp_1.o(null, objectArray);
                                objectArray = ((C91$b)object).f;
                                n3 = objectArray.length - n4;
                            }
                            catch (Throwable throwable2) {
                                break block13;
                            }
                            {
                                ((C91$b)object).g = n3;
                                ((C91$b)object).h = 0;
                                ((C91$b)object).i = 0;
                                break block11;
                            }
                        }
                        ((C91$b)object).a(n7 -= n3);
                    }
                    n3 = 4;
                    this.c(0, 0, n3, n4);
                    objectArray = this.a;
                    objectArray.flush();
                    return;
                }
                object = "closed";
                objectArray = new IOException((String)object);
                throw objectArray;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl2, int n3, ce_2 ce_22, int n4) {
        synchronized (this) {
            boolean bl3 = this.e;
            if (bl3) {
                String string2 = "closed";
                IOException iOException = new IOException(string2);
                throw iOException;
            }
            bl3 = false;
            this.c(n3, n4, 0, (int)(bl2 ? 1 : 0));
            if (n4 > 0) {
                Intrinsics.checkNotNull(ce_22);
                long l2 = n4;
                re_2 re_22 = this.a;
                re_22.s0(ce_22, l2);
            }
            return;
        }
    }

    public final void c(int n3, int n4, int n7, int n8) {
        Logger logger = g;
        Object object = Level.FINE;
        int n10 = logger.isLoggable((Level)object);
        if (n10 != 0) {
            f91_0.a.getClass();
            n10 = 0;
            object = f91_0.a(false, n3, n4, n7, n8);
            logger.fine((String)object);
        }
        if (n4 <= (n10 = this.d)) {
            n10 = -1 << -1 & n3;
            if (n10 == 0) {
                object = ez3.a;
                object = this.a;
                Intrinsics.checkNotNullParameter(object, "<this>");
                int n14 = n4 >>> 16 & 0xFF;
                object.writeByte(n14);
                n14 = n4 >>> 8 & 0xFF;
                object.writeByte(n14);
                object.writeByte(n4 &= 0xFF);
                n4 = n7 & 0xFF;
                object.writeByte(n4);
                n4 = n8 & 0xFF;
                object.writeByte(n4);
                object.writeInt(n3 &= -1 >>> 1);
                return;
            }
            String string2 = hj0_0.a(n3, "reserved bit set: ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        CharSequence charSequence = new StringBuilder("FRAME_SIZE_ERROR length > ");
        n7 = this.d;
        charSequence = Xd0.a(": ", n7, n4, (StringBuilder)charSequence);
        charSequence = ((Object)charSequence).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            boolean bl2;
            this.e = bl2 = true;
            re_2 re_22 = this.a;
            re_22.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n3, ta0_2 object, byte[] byArray) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block5: {
                    block6: {
                        re_2 re_22;
                        block7: {
                            Object object2 = "errorCode";
                            try {
                                int n4;
                                Intrinsics.checkNotNullParameter(object, (String)object2);
                                object2 = "debugData";
                                Intrinsics.checkNotNullParameter(byArray, (String)object2);
                                int n7 = this.e;
                                if (n7 != 0) break block5;
                                n7 = ((ta0_2)((Object)object)).getHttpCode();
                                if (n7 == (n4 = -1)) break block6;
                                n7 = byArray.length + 8;
                                n4 = 7;
                                int n8 = 0;
                                this.c(0, n7, n4, 0);
                                object2 = this.a;
                                object2.writeInt(n3);
                                re_22 = this.a;
                                int n10 = ((ta0_2)((Object)object)).getHttpCode();
                                re_22.writeInt(n10);
                                n3 = byArray.length;
                                n10 = 1;
                                if (n3 == 0) {
                                    n8 = 1;
                                }
                                if ((n3 = n8 ^ 1) == 0) break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                            re_22 = this.a;
                            re_22.write(byArray);
                        }
                        re_22 = this.a;
                        re_22.flush();
                        return;
                    }
                    String string2 = "errorCode.httpCode == -1";
                    string2 = string2.toString();
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                object = "closed";
                IOException iOException = new IOException((String)object);
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.e;
                    if (!bl2) {
                        re_2 re_22 = this.a;
                        re_22.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "closed";
                IOException iOException = new IOException(string2);
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(ArrayList object, int n3, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block9: {
                    Object object2 = "headerBlock";
                    try {
                        ce_2 ce_22;
                        int n4;
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        boolean bl3 = this.e;
                        if (bl3) break block8;
                        object2 = this.f;
                        ((C91$b)object2).d((ArrayList)object);
                        object = this.c;
                        long l2 = ((ce_2)object).b;
                        int n7 = this.d;
                        long l3 = n7;
                        l3 = Math.min(l3, l2);
                        n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n7 == 0) {
                            n4 = 4;
                        } else {
                            n4 = 0;
                            ce_22 = null;
                        }
                        if (bl2) {
                            n4 |= 1;
                        }
                        bl2 = (int)l3;
                        int n8 = 1;
                        this.c(n3, (int)(bl2 ? 1 : 0), n8, n4);
                        re_2 re_22 = this.a;
                        ce_22 = this.c;
                        re_22.s0(ce_22, l3);
                        if (n7 <= 0) break block9;
                        this.w(n3, l2 -= l3);
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            String string2 = "closed";
            object = new IOException(string2);
            throw object;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(int n3, int n4, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    int n7 = this.e;
                    if (n7 == 0) {
                        n7 = 8;
                        int n8 = 6;
                        this.c(0, n7, n8, (int)(bl2 ? 1 : 0));
                        re_2 re_22 = this.a;
                        re_22.writeInt(n3);
                        re_2 re_23 = this.a;
                        re_23.writeInt(n4);
                        re_23 = this.a;
                        re_23.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "closed";
                IOException iOException = new IOException(string2);
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(int n3, ta0_2 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2 = "errorCode";
                try {
                    int n4;
                    Intrinsics.checkNotNullParameter(object, string2);
                    int n7 = this.e;
                    if (n7 != 0) {
                        object = "closed";
                        IOException iOException = new IOException((String)object);
                        throw iOException;
                    }
                    n7 = ((ta0_2)((Object)object)).getHttpCode();
                    if (n7 != (n4 = -1)) {
                        n7 = 0;
                        string2 = null;
                        n4 = 4;
                        int n8 = 3;
                        this.c(n3, n4, n8, 0);
                        re_2 re_22 = this.a;
                        int n10 = ((ta0_2)((Object)object)).getHttpCode();
                        re_22.writeInt(n10);
                        re_22 = this.a;
                        re_22.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                String string3 = "Failed requirement.";
                string3 = string3.toString();
                object = new IllegalArgumentException(string3);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(R03 object) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                String string2;
                block8: {
                    int n3;
                    int n4;
                    string2 = "settings";
                    try {
                        Intrinsics.checkNotNullParameter(object, string2);
                        n4 = this.e;
                        if (n4 != 0) break block8;
                        n4 = ((R03)object).a;
                        n4 = Integer.bitCount(n4) * 6;
                        n3 = 4;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    this.c(0, n4, n3, 0);
                    n4 = 0;
                    string2 = null;
                    while (true) {
                        re_2 re_22;
                        int n7;
                        if (n4 >= (n7 = 10)) {
                            object = this.a;
                            object.flush();
                            return;
                        }
                        n7 = 1;
                        Object object2 = n7 << n4;
                        int n8 = ((R03)object).a;
                        if ((object2 &= n8) == 0) {
                            n7 = 0;
                            re_22 = null;
                        }
                        if (n7 != 0) {
                            n7 = n4 != n3 ? (n4 != (n7 = 7) ? n4 : 4) : 3;
                            Object object3 = this.a;
                            object3.writeShort(n7);
                            re_22 = this.a;
                            object3 = ((R03)object).b;
                            object2 = object3[n4];
                            re_22.writeInt((int)object2);
                        }
                        ++n4;
                    }
                }
                string2 = "closed";
                object = new IOException(string2);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(int n3, long l2) {
        String string2 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    long l3;
                    int n4 = this.e;
                    if (n4 != 0) {
                        String string3 = "closed";
                        IOException iOException = new IOException(string3);
                        throw iOException;
                    }
                    long l4 = 0L;
                    long l7 = l2 - l4;
                    Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object != false && (object = (l3 = l2 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
                        string2 = null;
                        n4 = 4;
                        int n7 = 8;
                        this.c(n3, n4, n7, 0);
                        re_2 re_22 = this.a;
                        int n8 = (int)l2;
                        re_22.writeInt(n8);
                        re_22 = this.a;
                        re_22.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                CharSequence charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(l2);
                charSequence = ((StringBuilder)charSequence).toString();
                charSequence = ((Object)charSequence).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
                throw illegalArgumentException;
            }
            throw throwable2;
        }
    }

    public final void w(int n3, long l2) {
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            re_2 re_22;
            int n4;
            l7 = this.d;
            long l8 = Math.min(l7, l2);
            int n7 = (int)l8;
            long l12 = (l2 -= l8) - l3;
            Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object == false) {
                n4 = 4;
            } else {
                n4 = 0;
                re_22 = null;
            }
            int n8 = 9;
            this.c(n3, n7, n8, n4);
            re_22 = this.a;
            ce_2 ce_22 = this.c;
            re_22.s0(ce_22, l8);
        }
    }
}

