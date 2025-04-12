/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.source.j$b;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from IO1
 */
public final class io1_0
extends b
implements Handler.Callback {
    public long A;
    public final AO1 r;
    public final HO1 s;
    public final Handler t;
    public final do1_2 u;
    public k0_0 v;
    public boolean w;
    public boolean x;
    public long y;
    public Metadata z;

    public io1_0(e$b object, Looper looper) {
        AO1$a aO1$a = AO1.a;
        int n3 = 5;
        super(n3);
        this.s = object;
        if (looper == null) {
            object = null;
        } else {
            super(looper, (Handler.Callback)this);
        }
        this.t = object;
        this.r = aO1$a;
        this.u = object = new DecoderInputBuffer(1);
        this.A = -9223372036854775807L;
    }

    public final void A() {
        this.z = null;
        this.v = null;
        this.A = -9223372036854775807L;
    }

    public final void C(long l2, boolean bl2) {
        this.z = null;
        this.w = false;
        this.x = false;
    }

    public final void H(d[] object, long l2, long l3, j$b object2) {
        object = object[0];
        AO1 aO1 = this.r;
        this.v = object = aO1.b((d)object);
        object = this.z;
        if (object != null) {
            l2 = this.A;
            long l4 = object.b;
            long l7 = l4 - (l2 = l2 + l4 - l3);
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 != false) {
                object = object.a;
                object2 = new Metadata(l2, (Metadata$Entry[])object);
                object = object2;
            }
            this.z = object;
        }
        this.A = l3;
    }

    public final void J(Metadata metadata, ArrayList arrayList) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((Metadata$Entry[])(object = metadata.a)).length); ++i3) {
            Object object2;
            int n4;
            Object object3 = object[i3].d();
            if (object3 != null && (n4 = (object2 = this.r).a((d)object3)) != 0) {
                object3 = object2.b((d)object3);
                object = object[i3].w();
                object.getClass();
                object2 = this.u;
                ((DecoderInputBuffer)object2).g();
                n4 = ((Object)object).length;
                ((DecoderInputBuffer)object2).i(n4);
                ByteBuffer byteBuffer = ((DecoderInputBuffer)object2).d;
                byteBuffer.put((byte[])object);
                ((DecoderInputBuffer)object2).j();
                object = ((k0_0)object3).P((do1_2)object2);
                if (object == null) continue;
                this.J((Metadata)object, arrayList);
                continue;
            }
            object = object[i3];
            arrayList.add(object);
        }
    }

    public final long K(long l2) {
        boolean bl2 = false;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        object = object != false ? (Object)1 : (Object)0;
        ct3.f((boolean)object);
        long l7 = this.A;
        long l8 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
        if (l8 != false) {
            bl2 = true;
        }
        ct3.f(bl2);
        long l12 = this.A;
        return l2 - l12;
    }

    public final int a(d d2) {
        AO1 aO1 = this.r;
        boolean bl2 = aO1.a(d2);
        if (bl2) {
            int n3 = d2.M;
            n3 = n3 == 0 ? 4 : 2;
            return tj2_0.a(n3, 0, 0, 0);
        }
        return tj2_0.a(0, 0, 0, 0);
    }

    public final boolean b() {
        return this.x;
    }

    public final boolean c() {
        return true;
    }

    public final void g(long l2, long l3) {
        int n3 = 1;
        int n4 = 1;
        while (n4 != 0) {
            long l4;
            long l7;
            long l8;
            Metadata$Entry[] metadata$EntryArray;
            n4 = this.w;
            boolean bl2 = false;
            Object object = null;
            if (n4 == 0 && (metadata$EntryArray = this.z) == null) {
                metadata$EntryArray = this.u;
                metadata$EntryArray.g();
                Object object2 = this.c;
                ((HV0)object2).a();
                int n7 = this.I((HV0)object2, (DecoderInputBuffer)metadata$EntryArray, 0);
                int n8 = -4;
                if (n7 == n8) {
                    boolean bl3 = metadata$EntryArray.f(4);
                    if (bl3) {
                        this.w = n3;
                    } else {
                        l8 = metadata$EntryArray.f;
                        l7 = this.l;
                        long l12 = l8 - l7;
                        Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                        if (object3 >= 0) {
                            metadata$EntryArray.j = l8 = this.y;
                            metadata$EntryArray.j();
                            object2 = this.v;
                            n7 = gz3.a;
                            object2 = ((k0_0)object2).P((do1_2)metadata$EntryArray);
                            if (object2 != null) {
                                Metadata$Entry[] metadata$EntryArray2 = ((Metadata)object2).a;
                                n8 = metadata$EntryArray2.length;
                                ArrayList arrayList = new ArrayList(n8);
                                this.J((Metadata)object2, arrayList);
                                bl3 = arrayList.isEmpty();
                                if (!bl3) {
                                    l7 = metadata$EntryArray.f;
                                    l7 = this.K(l7);
                                    metadata$EntryArray = new Metadata$Entry[]{};
                                    metadata$EntryArray = arrayList.toArray(metadata$EntryArray);
                                    this.z = object2 = new Metadata(l7, metadata$EntryArray);
                                }
                            }
                        }
                    }
                } else {
                    n4 = -5;
                    if (n7 == n4) {
                        metadata$EntryArray = ((HV0)object2).b;
                        metadata$EntryArray.getClass();
                        this.y = l8 = metadata$EntryArray.t;
                    }
                }
            }
            if ((metadata$EntryArray = this.z) != null && (n4 = (l4 = (l8 = metadata$EntryArray.b) - (l7 = this.K(l2))) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                metadata$EntryArray = this.z;
                object = this.t;
                if (object != null) {
                    metadata$EntryArray = object.obtainMessage(n3, (Object)metadata$EntryArray);
                    metadata$EntryArray.sendToTarget();
                } else {
                    object = this.s;
                    object.w((Metadata)metadata$EntryArray);
                }
                metadata$EntryArray = null;
                this.z = null;
                n4 = 1;
            } else {
                n4 = 0;
                metadata$EntryArray = null;
            }
            if (!(bl2 = this.w) || (object = this.z) != null) continue;
            this.x = n3;
        }
    }

    public final String getName() {
        return "MetadataRenderer";
    }

    public final boolean handleMessage(Message object) {
        int n3 = object.what;
        int n4 = 1;
        if (n3 == n4) {
            object = (Metadata)object.obj;
            this.s.w((Metadata)object);
            return n4 != 0;
        }
        object = new IllegalStateException();
        throw object;
    }
}

