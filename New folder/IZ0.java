/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class IZ0 {
    public final byte[] a;
    public ByteBuffer b;
    public GZ0 c;
    public int d;

    public IZ0() {
        byte[] byArray = new byte[256];
        this.a = byArray;
        this.d = 0;
    }

    public final boolean a() {
        GZ0 gZ0 = this.c;
        int n3 = gZ0.b;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            gZ0 = null;
        }
        return n3 != 0;
    }

    public final GZ0 b() {
        Object object = this.b;
        if (object != null) {
            Object object2;
            int n3;
            Object object3;
            Object object4;
            int n4;
            int n7;
            boolean n8 = this.a();
            if (n8) {
                return this.c;
            }
            object = new StringBuilder();
            int n10 = 0;
            String string2 = null;
            for (n7 = 0; n7 < (n4 = 6); ++n7) {
                n4 = (char)this.c();
                ((StringBuilder)object).append((char)n4);
            }
            object = ((StringBuilder)object).toString();
            string2 = "GIF";
            boolean bl2 = ((String)object).startsWith(string2);
            n7 = 1;
            double d2 = 2.0;
            if (!bl2) {
                object = this.c;
                ((GZ0)object).b = n7;
            } else {
                boolean bl3;
                int n14;
                object = this.c;
                object4 = this.b.getShort();
                ((GZ0)object).f = object4;
                object = this.c;
                object4 = this.b.getShort();
                ((GZ0)object).g = object4;
                int n15 = this.c();
                object3 = this.c;
                n3 = n15 & 0x80;
                if (n3 != 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                ((GZ0)object3).h = n3;
                double d5 = (n15 & 7) + n7;
                d5 = Math.pow(d2, d5);
                ((GZ0)object3).i = n14 = (int)d5;
                object = this.c;
                ((GZ0)object).j = object4 = this.c();
                object = this.c;
                this.c();
                object.getClass();
                object = this.c;
                boolean bl4 = ((GZ0)object).h;
                if (bl4 && !(bl3 = this.a())) {
                    object = this.c;
                    object4 = ((GZ0)object).i;
                    object3 = this.e((int)object4);
                    ((GZ0)object).a = (int[])object3;
                    object = this.c;
                    object3 = ((GZ0)object).a;
                    n3 = ((GZ0)object).j;
                    ((GZ0)object).k = object4 = (Object)object3[n3];
                }
            }
            boolean bl5 = this.a();
            if (!bl5) {
                boolean bl6;
                boolean bl7 = false;
                object = null;
                while (!bl6 && (object4 = (Object)this.a()) == 0) {
                    int n16;
                    object3 = this.c;
                    object4 = ((GZ0)object3).c;
                    n3 = -1 >>> 1;
                    if (object4 > n3) break;
                    object4 = this.c();
                    if (object4 != (n3 = 33)) {
                        n3 = 44;
                        if (object4 != n3) {
                            n3 = 59;
                            if (object4 != n3) {
                                object3 = this.c;
                                ((GZ0)object3).b = n7;
                                continue;
                            }
                            bl6 = true;
                            continue;
                        }
                        object3 = this.c;
                        object2 = ((GZ0)object3).d;
                        if (object2 == null) {
                            object2 = new CZ0();
                            ((GZ0)object3).d = object2;
                        }
                        object3 = this.c.d;
                        ((CZ0)object3).a = n3 = (int)this.b.getShort();
                        object3 = this.c.d;
                        ((CZ0)object3).b = n3 = (int)this.b.getShort();
                        object3 = this.c.d;
                        ((CZ0)object3).c = n3 = (int)this.b.getShort();
                        object3 = this.c.d;
                        object2 = this.b;
                        ((CZ0)object3).d = n3 = (int)((ByteBuffer)object2).getShort();
                        object4 = this.c();
                        n3 = object4 & 0x80;
                        if (n3 != 0) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        double d7 = (object4 & 7) + n7;
                        d7 = Math.pow(d2, d7);
                        n16 = (int)d7;
                        CZ0 cZ0 = this.c.d;
                        if ((object4 &= 0x40) != 0) {
                            object4 = 1;
                        } else {
                            object4 = 0;
                            object3 = null;
                        }
                        cZ0.e = object4;
                        if (n3 != 0) {
                            object3 = this.e(n16);
                            cZ0.k = (int[])object3;
                        } else {
                            object4 = 0;
                            object3 = null;
                            cZ0.k = null;
                        }
                        object3 = this.c.d;
                        object2 = this.b;
                        ((CZ0)object3).j = n3 = ((Buffer)object2).position();
                        this.c();
                        this.f();
                        object4 = this.a();
                        if (object4 != 0) continue;
                        object3 = this.c;
                        ((GZ0)object3).c = n3 = ((GZ0)object3).c + n7;
                        object2 = ((GZ0)object3).e;
                        object3 = ((GZ0)object3).d;
                        ((ArrayList)object2).add(object3);
                        continue;
                    }
                    object4 = this.c();
                    if (object4 != n7) {
                        int n17;
                        n3 = 249;
                        n16 = 2;
                        if (object4 != n3) {
                            n3 = 254;
                            if (object4 != n3) {
                                byte[] byArray;
                                n3 = 255;
                                if (object4 != n3) {
                                    this.f();
                                    continue;
                                }
                                this.d();
                                object3 = new StringBuilder();
                                n3 = 0;
                                object2 = null;
                                while (true) {
                                    n17 = 11;
                                    byArray = this.a;
                                    if (n3 >= n17) break;
                                    n17 = (char)byArray[n3];
                                    ((StringBuilder)object3).append((char)n17);
                                    ++n3;
                                }
                                object4 = ((String)(object3 = ((StringBuilder)object3).toString())).equals(object2 = "NETSCAPE2.0");
                                if (object4 != 0) {
                                    do {
                                        this.d();
                                        object4 = byArray[0];
                                        if (object4 != n7) continue;
                                        object4 = byArray[n7];
                                        object4 = byArray[n16];
                                        object3 = this.c;
                                        object3.getClass();
                                    } while ((object4 = this.d) > 0 && (object4 = (Object)this.a()) == 0);
                                    continue;
                                }
                                this.f();
                                continue;
                            }
                            this.f();
                            continue;
                        }
                        object3 = this.c;
                        object2 = new CZ0();
                        ((GZ0)object3).d = object2;
                        this.c();
                        object4 = this.c();
                        object2 = this.c.d;
                        ((CZ0)object2).g = n17 = (object4 & 0x1C) >> n16;
                        if (n17 == 0) {
                            ((CZ0)object2).g = n7;
                        }
                        if ((object4 &= 1) != 0) {
                            object4 = 1;
                        } else {
                            object4 = 0;
                            object3 = null;
                        }
                        ((CZ0)object2).f = object4;
                        object3 = this.b;
                        object4 = ((ByteBuffer)object3).getShort();
                        n3 = 10;
                        if (object4 < n16) {
                            object4 = 10;
                        }
                        CZ0 cZ0 = this.c.d;
                        cZ0.i = object4 *= 10;
                        cZ0.h = object4 = this.c();
                        this.c();
                        continue;
                    }
                    this.f();
                }
                object = this.c;
                n10 = ((GZ0)object).c;
                if (n10 < 0) {
                    ((GZ0)object).b = n7;
                }
            }
            return this.c;
        }
        object = new IllegalStateException("You must call setData() before parseHeader()");
        throw object;
    }

    public final int c() {
        int n3;
        Object object = this.b;
        try {
            n3 = ((ByteBuffer)object).get() & 0xFF;
        }
        catch (Exception exception) {
            int n4;
            object = this.c;
            ((GZ0)object).b = n4 = 1;
            n3 = 0;
            object = null;
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        int n3;
        this.d = n3 = this.c();
        if (n3 <= 0) return;
        n3 = 0;
        GZ0 gZ0 = null;
        while (true) {
            int n4;
            try {
                n4 = this.d;
                if (n3 >= n4) return;
            }
            catch (Exception exception) {
                Log.isLoggable((String)"GifHeaderParser", (int)3);
                gZ0 = this.c;
                gZ0.b = n4 = 1;
                return;
            }
            {
                ByteBuffer byteBuffer = this.b;
                byte[] byArray = this.a;
                byteBuffer.get(byArray, n3, n4 -= n3);
                n3 += n4;
                continue;
            }
            break;
        }
    }

    public final int[] e(int n3) {
        int n4 = n3 * 3;
        byte[] byArray = new byte[n4];
        int[] nArray = null;
        ByteBuffer byteBuffer = this.b;
        byteBuffer.get(byArray);
        int n7 = 256;
        nArray = new int[n7];
        n7 = 0;
        byteBuffer = null;
        int n8 = 0;
        while (n7 < n3) {
            int n10 = n8 + 1;
            int n14 = byArray[n8] & 0xFF;
            int n15 = n8 + 2;
            n10 = byArray[n10] & 0xFF;
            n8 += 3;
            n15 = byArray[n15] & 0xFF;
            int n16 = n7 + 1;
            n14 <<= 16;
            int n17 = -16777216;
            n10 = n10 << 8 | (n14 |= n17) | n15;
            try {
                nArray[n7] = n10;
                n7 = n16;
            }
            catch (BufferUnderflowException bufferUnderflowException) {
                Log.isLoggable((String)"GifHeaderParser", (int)3);
                GZ0 gZ0 = this.c;
                gZ0.b = n4 = 1;
                break;
            }
        }
        return nArray;
    }

    public final void f() {
        int n3;
        do {
            n3 = this.c();
            ByteBuffer byteBuffer = this.b;
            int n4 = byteBuffer.position() + n3;
            int n7 = this.b.limit();
            n4 = Math.min(n4, n7);
            ByteBuffer byteBuffer2 = this.b;
            byteBuffer2.position(n4);
        } while (n3 > 0);
    }
}

