/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.a$a;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from HZ0
 */
public final class hz0_1 {
    public final byte[] a;
    public int b;
    public fz0_0 c;
    public ByteBuffer d;

    public hz0_1() {
        byte[] byArray = new byte[256];
        this.a = byArray;
        this.b = 0;
    }

    public final boolean a() {
        fz0_0 fz0_02 = this.c;
        int n3 = fz0_02.k;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            fz0_02 = null;
        }
        return n3 != 0;
    }

    public final fz0_0 b() {
        Object object = this.d;
        if (object != null) {
            Object object2;
            int n3;
            Object object3;
            Object object4;
            int n4;
            int n7;
            boolean bl2 = this.a();
            if (bl2) {
                return this.c;
            }
            bl2 = false;
            object = null;
            String string2 = "";
            CharSequence charSequence = string2;
            Object object5 = null;
            for (n7 = 0; n7 < (n4 = 6); ++n7) {
                charSequence = Ex0.a((String)charSequence);
                n4 = (char)this.c();
                ((StringBuilder)charSequence).append((char)n4);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            object5 = "GIF";
            n7 = (int)(((String)charSequence).startsWith((String)object5) ? 1 : 0);
            int n8 = 1;
            n4 = 2;
            if (n7 == 0) {
                object5 = this.c;
                ((fz0_0)object5).k = n8;
            } else {
                object5 = this.c;
                object4 = this.d.getShort();
                ((fz0_0)object5).l = object4;
                object5 = this.c;
                object4 = this.d.getShort();
                ((fz0_0)object5).i = object4;
                n7 = this.c();
                object3 = this.c;
                n3 = n7 & 0x80;
                if (n3 != 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                ((fz0_0)object3).g = n3;
                n7 &= 7;
                ((fz0_0)object3).h = n7 = n4 << n7;
                ((fz0_0)object3).b = n7 = this.c();
                object5 = this.c;
                this.c();
                object5.getClass();
                object5 = this.c;
                n7 = (int)(((fz0_0)object5).g ? 1 : 0);
                if (n7 != 0 && (n7 = (int)(this.a() ? 1 : 0)) == 0) {
                    object5 = this.c;
                    object4 = ((fz0_0)object5).h;
                    object3 = this.e((int)object4);
                    ((fz0_0)object5).f = (int[])object3;
                    object5 = this.c;
                    object3 = ((fz0_0)object5).f;
                    n3 = ((fz0_0)object5).b;
                    ((fz0_0)object5).a = object4 = (Object)object3[n3];
                }
            }
            n7 = (int)(this.a() ? 1 : 0);
            if (n7 == 0) {
                n7 = 0;
                object5 = null;
                while (n7 == 0 && (object4 = (Object)this.a()) == 0) {
                    Object object6;
                    int n10;
                    object3 = this.c;
                    object4 = ((fz0_0)object3).d;
                    n3 = -1 >>> 1;
                    if (object4 > n3) break;
                    object4 = this.c();
                    if (object4 != (n3 = 33)) {
                        n3 = 44;
                        if (object4 != n3) {
                            n3 = 59;
                            if (object4 != n3) {
                                object3 = this.c;
                                ((fz0_0)object3).k = n8;
                                continue;
                            }
                            n7 = 1;
                            continue;
                        }
                        object3 = this.c;
                        object2 = ((fz0_0)object3).c;
                        if (object2 == null) {
                            object2 = new bz0_2();
                            ((fz0_0)object3).c = object2;
                        }
                        object3 = this.c.c;
                        ((bz0_2)object3).e = n3 = (int)this.d.getShort();
                        object3 = this.c.c;
                        ((bz0_2)object3).f = n3 = (int)this.d.getShort();
                        object3 = this.c.c;
                        ((bz0_2)object3).g = n3 = (int)this.d.getShort();
                        object3 = this.c.c;
                        object2 = this.d;
                        ((bz0_2)object3).h = n3 = (int)((ByteBuffer)object2).getShort();
                        object4 = this.c();
                        n3 = object4 & 0x80;
                        if (n3 != 0) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        double d2 = (object4 & 7) + n8;
                        double d5 = 2.0;
                        d2 = Math.pow(d5, d2);
                        n10 = (int)d2;
                        object6 = this.c.c;
                        if ((object4 &= 0x40) != 0) {
                            object4 = 1;
                        } else {
                            object4 = 0;
                            object3 = null;
                        }
                        ((bz0_2)object6).d = object4;
                        if (n3 != 0) {
                            object3 = this.e(n10);
                            ((bz0_2)object6).i = (int[])object3;
                        } else {
                            object4 = 0;
                            object3 = null;
                            ((bz0_2)object6).i = null;
                        }
                        object3 = this.c.c;
                        object2 = this.d;
                        ((bz0_2)object3).a = n3 = ((Buffer)object2).position();
                        this.c();
                        this.g();
                        object4 = this.a();
                        if (object4 != 0) continue;
                        object3 = this.c;
                        ((fz0_0)object3).d = n3 = ((fz0_0)object3).d + n8;
                        object2 = ((fz0_0)object3).e;
                        object3 = ((fz0_0)object3).c;
                        ((ArrayList)object2).add(object3);
                        continue;
                    }
                    object4 = this.c();
                    if (object4 != n8) {
                        Object object7;
                        n3 = 249;
                        if (object4 != n3) {
                            n3 = 254;
                            if (object4 != n3) {
                                byte[] byArray;
                                n3 = 255;
                                if (object4 != n3) {
                                    this.g();
                                    continue;
                                }
                                this.d();
                                object7 = string2;
                                object4 = 0;
                                object3 = null;
                                while (true) {
                                    int n14 = 11;
                                    byArray = this.a;
                                    if (object4 >= n14) break;
                                    object7 = Ex0.a((String)object7);
                                    n14 = (char)byArray[object4];
                                    ((StringBuilder)object7).append((char)n14);
                                    object7 = ((StringBuilder)object7).toString();
                                    ++object4;
                                }
                                object3 = "NETSCAPE2.0";
                                object4 = ((String)object7).equals(object3);
                                if (object4 != 0) {
                                    do {
                                        this.d();
                                        object4 = byArray[0];
                                        if (object4 != n8) continue;
                                        object4 = byArray[n8] & n3;
                                        n10 = byArray[n4] & n3;
                                        object6 = this.c;
                                        ((fz0_0)object6).j = object4 |= (n10 <<= 8);
                                        if (object4 != 0) continue;
                                        ((fz0_0)object6).j = object4 = -1;
                                    } while ((object4 = this.b) > 0 && (object4 = (Object)this.a()) == 0);
                                    continue;
                                }
                                this.g();
                                continue;
                            }
                            this.g();
                            continue;
                        }
                        object3 = this.c;
                        object2 = new bz0_2();
                        ((fz0_0)object3).c = object2;
                        this.c();
                        object4 = this.c();
                        object2 = this.c.c;
                        ((bz0_2)object2).c = n10 = (object4 & 0x1C) >> n4;
                        if (n10 == 0) {
                            ((bz0_2)object2).c = n8;
                        }
                        if ((object4 &= 1) != 0) {
                            object4 = 1;
                        } else {
                            object4 = 0;
                            object3 = null;
                        }
                        ((bz0_2)object2).k = object4;
                        object3 = this.d;
                        object4 = ((ByteBuffer)object3).getShort();
                        n3 = 10;
                        if (object4 < n4) {
                            object4 = 10;
                        }
                        object7 = this.c.c;
                        ((bz0_2)object7).b = object4 *= 10;
                        ((bz0_2)object7).j = object4 = this.c();
                        this.c();
                        continue;
                    }
                    this.g();
                }
                object = this.c;
                int n15 = ((fz0_0)object).d;
                if (n15 < 0) {
                    ((fz0_0)object).k = n8;
                }
            }
            return this.c;
        }
        object = new IllegalStateException("You must call setData() before parseHeader()");
        throw object;
    }

    public final int c() {
        int n3;
        Object object = this.d;
        try {
            n3 = ((ByteBuffer)object).get() & 0xFF;
        }
        catch (Exception exception) {
            int n4;
            object = this.c;
            ((fz0_0)object).k = n4 = 1;
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
        this.b = n3 = this.c();
        if (n3 <= 0) return;
        n3 = 0;
        fz0_0 fz0_02 = null;
        while (true) {
            int n4;
            try {
                n4 = this.b;
                if (n3 >= n4) return;
            }
            catch (Exception exception) {
                fz0_02 = this.c;
                fz0_02.k = n4 = 1;
                return;
            }
            {
                ByteBuffer byteBuffer = this.d;
                byte[] byArray = this.a;
                byteBuffer.get(byArray, n3, n4 -= n3);
                n3 += n4;
                continue;
            }
            break;
        }
    }

    public final int[] e(int n3) {
        int n4 = 1;
        int n7 = n3 * 3;
        byte[] byArray = new byte[n7];
        int[] nArray = null;
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(byArray);
        int n8 = 256;
        nArray = new int[n8];
        n8 = 0;
        byteBuffer = null;
        int n10 = 0;
        while (n8 < n3) {
            int n14 = n10 + 1;
            int n15 = byArray[n10] & 0xFF;
            int n16 = n10 + 2;
            n14 = byArray[n14] & 0xFF;
            n10 += 3;
            n16 = byArray[n16] & 0xFF;
            int n17 = n8 + 1;
            n15 <<= 16;
            int n18 = -16777216;
            n14 = n14 << 8 | (n15 |= n18) | n16;
            try {
                nArray[n8] = n14;
                n8 = n17;
            }
            catch (BufferUnderflowException bufferUnderflowException) {
                n3 = com.clevertap.android.sdk.a.c;
                a$a.INFO.intValue();
                fz0_0 fz0_02 = this.c;
                fz0_02.k = n4;
                break;
            }
        }
        return nArray;
    }

    public final void f(byte[] object) {
        int n3 = 0;
        Object object2 = null;
        if (object != null) {
            object = ByteBuffer.wrap((byte[])object);
            this.d = null;
            Arrays.fill(this.a, (byte)0);
            object2 = new fz0_0();
            this.c = object2;
            this.b = 0;
            this.d = object = ((ByteBuffer)object).asReadOnlyBuffer();
            ((ByteBuffer)object).position(0);
            object = this.d;
            object2 = ByteOrder.LITTLE_ENDIAN;
            ((ByteBuffer)object).order((ByteOrder)object2);
        } else {
            this.d = null;
            object = this.c;
            ((fz0_0)object).k = n3 = 2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        try {
            int n3;
            do {
                n3 = this.c();
                ByteBuffer byteBuffer = this.d;
                int n4 = byteBuffer.position() + n3;
                byteBuffer.position(n4);
            } while (n3 > 0);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

