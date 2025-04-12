/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcel
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public final class rm3
extends b
implements Handler.Callback {
    public Rf3 A;
    public int B;
    public final Handler C;
    public final jm3 D;
    public final HV0 E;
    public boolean F;
    public boolean G;
    public d H;
    public long I;
    public long J;
    public IOException K;
    public final Re0 r;
    public final DecoderInputBuffer s;
    public Ve0 t;
    public final nf3_0 u;
    public boolean v;
    public int w;
    public mf3_0 x;
    public qf3_0 y;
    public Rf3 z;

    public rm3(e$b object, Looper looper) {
        long l2;
        Nf3$a nf3$a = nf3_0.a;
        int n3 = 3;
        super(n3);
        this.D = object;
        if (looper == null) {
            object = null;
        } else {
            super(looper, (Handler.Callback)this);
        }
        this.C = object;
        this.u = nf3$a;
        this.r = object = new Object();
        this.s = object = new DecoderInputBuffer(1);
        this.E = object = new Object();
        this.J = l2 = -9223372036854775807L;
        this.I = l2;
    }

    public final void A() {
        long l2;
        this.H = null;
        this.J = l2 = -9223372036854775807L;
        this.K();
        this.I = l2;
        mf3_0 mf3_02 = this.x;
        if (mf3_02 != null) {
            this.O();
            mf3_02 = this.x;
            mf3_02.getClass();
            mf3_02.release();
            this.x = null;
            this.w = 0;
        }
    }

    public final void C(long l2, boolean bl2) {
        String string2;
        int n3;
        long l3;
        this.I = l2;
        Object object = this.t;
        if (object != null) {
            object.clear();
        }
        this.K();
        object = null;
        this.F = false;
        this.G = false;
        this.J = l3 = -9223372036854775807L;
        Object object2 = this.H;
        if (object2 != null && (n3 = Objects.equals(object2 = ((d)object2).o, string2 = "application/x-media3-cues")) == 0) {
            n3 = this.w;
            if (n3 != 0) {
                this.O();
                object2 = this.x;
                object2.getClass();
                object2.release();
                n3 = 0;
                object2 = null;
                this.x = null;
                this.w = 0;
                this.N();
            } else {
                this.O();
                object = this.x;
                object.getClass();
                object.flush();
                l3 = this.l;
                object.d(l3);
            }
        }
    }

    public final void H(d[] object, long l2, long l3, j$b j$b) {
        this.H = object = object[0];
        object = ((d)object).o;
        String string2 = "application/x-media3-cues";
        int n3 = Objects.equals(object, string2);
        int n4 = 1;
        if (n3 == 0) {
            this.J();
            object = this.x;
            if (object != null) {
                this.w = n4;
            } else {
                this.N();
            }
        } else {
            object = this.H;
            n3 = ((d)object).J;
            object = n3 == n4 ? new pO1() : new fj2_0();
            this.t = object;
        }
    }

    public final void J() {
        String string2 = this.H.o;
        CharSequence charSequence = "application/cea-608";
        boolean bl2 = Objects.equals(string2, charSequence);
        if (!(bl2 || (bl2 = Objects.equals(string2 = this.H.o, charSequence = "application/x-mp4-cea-608")) || (bl2 = Objects.equals(string2 = this.H.o, charSequence = "application/cea-708")))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        charSequence = new StringBuilder("Legacy decoding is disabled, can't handle ");
        String string3 = this.H.o;
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(" samples (expected application/x-media3-cues).");
        charSequence = ((StringBuilder)charSequence).toString();
        ct3.g(bl2, (String)charSequence);
    }

    public final void K() {
        ImmutableList immutableList = ImmutableList.of();
        long l2 = this.I;
        this.M(l2);
        Ue0 ue0 = new Ue0(immutableList);
        immutableList = this.C;
        if (immutableList != null) {
            int n3 = 1;
            ue0 = immutableList.obtainMessage(n3, ue0);
            ue0.sendToTarget();
        } else {
            immutableList = ue0.a;
            jm3 jm32 = this.D;
            jm32.l(immutableList);
            jm32.t(ue0);
        }
    }

    public final long L() {
        int n3 = this.B;
        int n4 = -1;
        long l2 = Long.MAX_VALUE;
        if (n3 == n4) {
            return l2;
        }
        Rf3 rf3 = this.z;
        rf3.getClass();
        n3 = this.B;
        Rf3 rf32 = this.z;
        n4 = rf32.d();
        if (n3 < n4) {
            rf3 = this.z;
            n4 = this.B;
            l2 = rf3.c(n4);
        }
        return l2;
    }

    public final long M(long l2) {
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        ct3.f(bl2);
        l3 = this.k;
        return l2 - l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void N() {
        Object object;
        block14: {
            boolean bl2;
            String string2;
            Object object2;
            Object object3;
            block11: {
                int n3;
                int n4;
                block12: {
                    block13: {
                        this.v = n4 = 1;
                        object3 = this.H;
                        object3.getClass();
                        object2 = (Nf3$a)this.u;
                        object2.getClass();
                        string2 = ((d)object3).o;
                        if (string2 == null) break block11;
                        n3 = ((d)object3).I;
                        int n7 = string2.hashCode();
                        switch (n7) {
                            case 1566016562: {
                                object = "application/cea-708";
                                n4 = (int)(string2.equals(object) ? 1 : 0);
                                if (n4 == 0) break;
                                n4 = 2;
                                break block12;
                            }
                            case 1566015601: {
                                String string3 = "application/cea-608";
                                n7 = (int)(string2.equals(string3) ? 1 : 0);
                                if (n7 == 0) {
                                    break;
                                }
                                break block12;
                            }
                            case 930165504: {
                                object = "application/x-mp4-cea-608";
                                n4 = (int)(string2.equals(object) ? 1 : 0);
                                if (n4 != 0) break block13;
                            }
                        }
                        n4 = -1;
                        break block12;
                    }
                    n4 = 0;
                    object = null;
                }
                switch (n4) {
                    default: {
                        break;
                    }
                    case 2: {
                        object3 = ((d)object3).r;
                        object = new er_1(n3, (List)object3);
                        break block14;
                    }
                    case 0: 
                    case 1: {
                        object = new cr_1(string2, n3);
                        break block14;
                    }
                }
            }
            if (!(bl2 = ((jn0_0)(object = ((Nf3$a)object2).b)).a((d)object3))) {
                object3 = kp1_0.c("Attempted to create decoder for unsupported MIME type: ", string2);
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
            object = ((jn0_0)object).c((d)object3);
            object2 = object.getClass().getSimpleName();
            string2 = "Decoder";
            ((String)object2).concat(string2);
            object = object3 = new po0_0((vf3_0)object);
        }
        this.x = object;
        long l2 = this.l;
        object.d(l2);
    }

    public final void O() {
        int n3;
        this.y = null;
        this.B = n3 = -1;
        Rf3 rf3 = this.z;
        if (rf3 != null) {
            rf3.h();
            this.z = null;
        }
        if ((rf3 = this.A) != null) {
            rf3.h();
            this.A = null;
        }
    }

    public final int a(d d2) {
        int n3;
        Object object = d2.o;
        boolean bl2 = Objects.equals(object, "application/x-media3-cues");
        if (!bl2) {
            String string2;
            boolean bl3;
            object = (Nf3$a)this.u;
            object.getClass();
            object = ((Nf3$a)object).b;
            bl2 = ((jn0_0)object).a(d2);
            if (!(bl2 || (bl3 = Objects.equals(object = d2.o, string2 = "application/cea-608")) || (bl3 = Objects.equals(object, string2 = "application/x-mp4-cea-608")) || (bl3 = Objects.equals(object, string2 = "application/cea-708")))) {
                boolean bl4 = ip1_0.j((String)object);
                if (bl4) {
                    return tj2_0.a(1, 0, 0, 0);
                }
                return tj2_0.a(0, 0, 0, 0);
            }
        }
        n3 = (n3 = d2.M) == 0 ? 4 : 2;
        return tj2_0.a(n3, 0, 0, 0);
    }

    public final boolean b() {
        return this.G;
    }

    public final boolean c() {
        int n3;
        block9: {
            block10: {
                long l2;
                int n4;
                long l3;
                long l4;
                Object object = this.H;
                n3 = 1;
                if (object == null) {
                    return n3 != 0;
                }
                object = this.K;
                if (object == null) {
                    try {
                        this.k();
                    }
                    catch (IOException iOException) {
                        this.K = iOException;
                    }
                }
                if ((object = this.K) == null) break block9;
                object = this.H;
                object.getClass();
                object = ((d)object).o;
                int n7 = Objects.equals(object, "application/x-media3-cues");
                if (n7 != 0) {
                    object = this.t;
                    object.getClass();
                    long l7 = this.I;
                    l7 = object.d(l7);
                    long l8 = Long.MIN_VALUE;
                    n7 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                    if (n7 == 0) {
                        n3 = 0;
                    }
                    return n3 != 0;
                }
                n7 = this.G;
                if (n7 != 0) break block10;
                n7 = this.F;
                if (n7 == 0) break block9;
                object = this.z;
                long l12 = this.I;
                if (object != null && (n7 = (l4 = (l3 = ((Rf3)object).c(n4 = ((Rf3)object).d() - n3)) - l12) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) break block9;
                object = this.A;
                l12 = this.I;
                if (object != null && (n7 = (int)((l2 = (l3 = ((Rf3)object).c(n4 = ((Rf3)object).d() - n3)) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1))) > 0 || (object = this.y) == null) break block9;
            }
            return false;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(long var1_1, long var3_2) {
        var5_3 = this;
        var6_4 = var1_1;
        var8_5 = this.n;
        var9_6 = 1;
        if (var8_5 != 0 && (var8_5 = (cfr_temp_0 = (var10_7 = this.J) - (var12_8 = -9223372036854775807L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0 && (var8_5 = var1_1 == var10_7 ? 0 : (var1_1 < var10_7 ? -1 : 1)) >= 0) {
            this.O();
            this.G = var9_6;
        }
        if ((var8_5 = var5_3.G) != 0) {
            return;
        }
        var14_9 = var5_3.H;
        var14_9.getClass();
        var14_9 = var14_9.o;
        var8_5 = (int)Objects.equals(var14_9, "application/x-media3-cues");
        var15_14 = var5_3.D;
        var16_15 = var5_3.C;
        var18_17 = null;
        var19_18 = 4;
        var20_19 = -4;
        var21_20 = var5_3.E;
        if (var8_5 != 0) {
            var14_9 = var5_3.t;
            var14_9.getClass();
            var8_5 = (int)var5_3.F;
            if (var8_5 == 0 && (var22_21 = var5_3.I((HV0)var21_20, (DecoderInputBuffer)(var14_9 = var5_3.s), 0)) == var20_19) {
                if ((var19_18 = (int)var14_9.f(var19_18)) != 0) {
                    var5_3.F = var9_6;
                } else {
                    var14_9.j();
                    var23_22 = var14_9.d;
                    var23_22.getClass();
                    var24_23 = var14_9.f;
                    var26_24 = var23_22.array();
                    var22_21 = var23_22.arrayOffset();
                    var19_18 = var23_22.limit();
                    var5_3.r.getClass();
                    var27_26 = Parcel.obtain();
                    var27_26.unmarshall((byte[])var26_24, var22_21, var19_18);
                    var27_26.setDataPosition(0);
                    var23_22 = Bundle.class.getClassLoader();
                    var23_22 = var27_26.readBundle((ClassLoader)var23_22);
                    var27_26.recycle();
                    var26_24 = var23_22.getParcelableArrayList("c");
                    var26_24.getClass();
                    var21_20 = new Object();
                    var27_26 = ImmutableList.builder();
                    for (var17_16 = 0; var17_16 < (var29_29 = var26_24.size()); ++var17_16) {
                        var30_31 /* !! */  = (Bundle)var26_24.get(var17_16);
                        var30_31 /* !! */ .getClass();
                        var30_31 /* !! */  = var21_20.apply(var30_31 /* !! */ );
                        var27_26.add(var30_31 /* !! */ );
                    }
                    var21_20 = var27_26.build();
                    var18_17 = "d";
                    var31_33 = var23_22.getLong((String)var18_17);
                    var26_24 = var28_27;
                    var28_27 = new We0((List)var21_20, var24_23, var31_33);
                    var14_9.g();
                    var14_9 = var5_3.t;
                    var17_16 = (int)var14_9.a(var28_27, var6_4);
                }
            }
            var14_9 = var5_3.t;
            var33_34 = var5_3.I;
            cfr_temp_1 = (var33_34 = var14_9.d(var33_34)) - (var35_35 = -9223372036854775808L);
            var8_5 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var8_5 == 0 && (var22_21 = (int)var5_3.F) != 0 && var17_16 == 0) {
                var5_3.G = var9_6;
            }
            if (var8_5 != 0 && (var8_5 = (int)(var33_34 == var6_4 ? 0 : (var33_34 < var6_4 ? -1 : 1))) <= 0) {
                var17_16 = 1;
            }
            if (var17_16 != 0) {
                var14_9 = var5_3.t.b(var6_4);
                var18_17 = var5_3.t;
                var12_8 = var18_17.c(var6_4);
                var26_24 = new Ue0;
                var5_3.M(var12_8);
                var26_24((List)var14_9);
                if (var16_15 != null) {
                    var14_9 = var16_15.obtainMessage(var9_6, var26_24);
                    var14_9.sendToTarget();
                } else {
                    var14_9 = var26_24.a;
                    var15_14.l((List)var14_9);
                    var15_14.t((Ue0)var26_24);
                }
                var14_9 = var5_3.t;
                var14_9.e(var12_8);
            }
            var5_3.I = var6_4;
            return;
        }
        this.J();
        var5_3.I = var6_4;
        var14_9 = var5_3.A;
        var37_36 = "Subtitle decoding failed. streamFormat=";
        if (var14_9 == null) {
            var14_9 = var5_3.x;
            var14_9.getClass();
            var14_9.a(var6_4);
            try {
                var14_9 = var5_3.x;
                var14_9.getClass();
                var14_9 = var14_9.b();
                var5_3.A = var14_9 = (Rf3)var14_9;
            }
            catch (SubtitleDecoderException var14_10) {
                var38_37 /* !! */  = new StringBuilder(var37_36);
                var39_39 = var5_3.H;
                var38_37 /* !! */ .append(var39_39);
                var38_37 /* !! */  = var38_37 /* !! */ .toString();
                Cx.d((String)var38_37 /* !! */ , var14_10);
                this.K();
                this.O();
                var14_11 = var5_3.x;
                var14_11.getClass();
                var14_11.release();
                var5_3.x = null;
                var5_3.w = 0;
                this.N();
                return;
            }
        }
        if ((var8_5 = var5_3.h) != (var40_41 = 2)) {
            return;
        }
        var14_9 = var5_3.z;
        if (var14_9 != null) {
            var41_42 = this.L();
            var8_5 = 0;
            var14_9 = null;
            while ((var43_43 /* !! */  = var41_42 == var6_4 ? 0 : (var41_42 < var6_4 ? -1 : 1)) <= 0) {
                var5_3.B = var8_5 = var5_3.B + var9_6;
                var41_42 = this.L();
                var8_5 = 1;
            }
        } else {
            var8_5 = 0;
            var14_9 = null;
        }
        if ((var30_32 = var5_3.A) == null) ** GOTO lbl159
        var44_44 = var30_32.f(var19_18);
        if (var44_44) {
            if (var8_5 == 0 && (var47_46 = (cfr_temp_2 = (var41_42 = this.L()) - (var45_45 = 0x7FFFFFFFFFFFFFFFL)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                var29_30 = var5_3.w;
                if (var29_30 == var40_41) {
                    this.O();
                    var30_32 = var5_3.x;
                    var30_32.getClass();
                    var30_32.release();
                    var5_3.x = null;
                    var5_3.w = 0;
                    this.N();
                } else {
                    this.O();
                    var5_3.G = var9_6;
                }
            }
lbl159:
            // 5 sources

            var28_28 = var21_20;
        } else {
            var28_28 = var21_20;
            var48_47 = var30_32.b;
            cfr_temp_3 = var48_47 - var6_4;
            var43_43 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
            if (var43_43 /* !! */  <= 0) {
                var14_9 = var5_3.z;
                if (var14_9 != null) {
                    var14_9.h();
                }
                var5_3.B = var8_5 = var30_32.a(var6_4);
                var5_3.z = var30_32;
                var5_3.A = null;
                var8_5 = 1;
            }
        }
        if (var8_5 != 0) {
            var5_3.z.getClass();
            var14_9 = var5_3.z;
            var8_5 = var14_9.a(var6_4);
            if (var8_5 != 0 && (var20_19 = (var26_25 = var5_3.z).d()) != 0) {
                var20_19 = -1;
                if (var8_5 == var20_19) {
                    var14_9 = var5_3.z;
                    var20_19 = var14_9.d() - var9_6;
                    var48_47 = var14_9.c(var20_19);
                } else {
                    var26_25 = var5_3.z;
                    var48_47 = var26_25.c(var8_5 -= var9_6);
                }
            } else {
                var14_9 = var5_3.z;
                var48_47 = var14_9.b;
            }
            var5_3.M(var48_47);
            var26_25 = var5_3.z;
            var38_38 = var26_25.b(var6_4);
            var14_9 = new Ue0((List)var38_38);
            if (var16_15 != null) {
                var14_9 = var16_15.obtainMessage(var9_6, var14_9);
                var14_9.sendToTarget();
            } else {
                var38_38 = var14_9.a;
                var15_14.l((List)var38_38);
                var15_14.t((Ue0)var14_9);
            }
        }
        if ((var8_5 = var5_3.w) == var40_41) {
            return;
        }
        while (true) {
            block48: {
                try {
                    var8_5 = (int)var5_3.F;
                    if (var8_5 != 0) return;
                    var14_9 = var5_3.y;
                    if (var14_9 != null) break block48;
                    var14_9 = var5_3.x;
                    var14_9.getClass();
                    var14_9 = var14_9.e();
                    var14_9 = (qf3_0)var14_9;
                    if (var14_9 == null) {
                        return;
                    }
                    var5_3.y = var14_9;
                }
                catch (SubtitleDecoderException var14_12) {
                    break;
                }
            }
            if ((var50_48 = var5_3.w) == var9_6) {
                var14_9.a = var19_18;
                var38_38 = var5_3.x;
                var38_38.getClass();
                var38_38.c((qf3_0)var14_9);
                var5_3.y = null;
                var5_3.w = var40_41;
                return;
            }
            var38_38 = var28_28;
            var51_49 = var5_3.I((HV0)var28_28, (DecoderInputBuffer)var14_9, 0);
            if (var51_49 == (var52_50 = -4)) {
                var51_49 = (int)var14_9.f(var19_18);
                if (var51_49 != 0) {
                    var5_3.F = var9_6;
                    var5_3.v = false;
                } else {
                    var39_40 = var28_28.b;
                    if (var39_40 == null) {
                        return;
                    }
                    var14_9.j = var48_47 = var39_40.t;
                    var14_9.j();
                    var51_49 = (int)var5_3.v;
                    var53_51 = var14_9.f(var9_6) ^ var9_6;
                    var5_3.v = var51_49 &= var53_51;
                }
                var51_49 = (int)var5_3.v;
                if (var51_49 == 0) {
                    var39_40 = var5_3.x;
                    var39_40.getClass();
                    var39_40.c((qf3_0)var14_9);
                    var5_3.y = null;
                }
            } else {
                var8_5 = -3;
                if (var51_49 == var8_5) {
                    return;
                }
            }
            var28_28 = var38_38;
        }
        var38_38 = new StringBuilder(var37_36);
        var39_40 = var5_3.H;
        var38_38.append(var39_40);
        var38_38 = var38_38.toString();
        Cx.d((String)var38_38, var14_12);
        this.K();
        this.O();
        var14_13 = var5_3.x;
        var14_13.getClass();
        var14_13.release();
        var5_3.x = null;
        var5_3.w = 0;
        this.N();
    }

    public final String getName() {
        return "TextRenderer";
    }

    public final boolean handleMessage(Message object) {
        int n3 = object.what;
        int n4 = 1;
        if (n3 == n4) {
            object = (Ue0)object.obj;
            ImmutableList immutableList = object.a;
            jm3 jm32 = this.D;
            jm32.l(immutableList);
            jm32.t((Ue0)object);
            return n4 != 0;
        }
        object = new IllegalStateException();
        throw object;
    }
}

