/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.d$a;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

public final class d {
    public final byte[] A;
    public final int B;
    public final VX C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Metadata l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final DrmInitData s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        d$a d$a = new d$a();
        d$a.a();
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
        gz3.D(3);
        gz3.D(4);
        f4.b(5, 6, 7, 8, 9);
        f4.b(10, 11, 12, 13, 14);
        f4.b(15, 16, 17, 18, 19);
        f4.b(20, 21, 22, 23, 24);
        f4.b(25, 26, 27, 28, 29);
        gz3.D(30);
        gz3.D(31);
        gz3.D(32);
        gz3.D(33);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public d(d$a var1_1) {
        super();
        var2_2 = var1_1.a;
        this.a = var2_2;
        var2_2 = gz3.J(var1_1.d);
        this.d = var2_2;
        var3_3 = var1_1.c;
        var4_4 = var3_3.isEmpty();
        var5_5 = 1;
        var6_6 = 0;
        if (var4_4 != 0 && (var3_3 = var1_1.b) != null) {
            var7_7 = var1_1.b;
            var3_3 = new fp1_0((String)var2_2, var7_7);
            this.c = var2_2 = ImmutableList.of(var3_3);
            this.b = var2_2 = var1_1.b;
        } else {
            var3_3 = var1_1.c;
            var4_4 = var3_3.isEmpty();
            if (var4_4 == 0 && (var3_3 = var1_1.b) == null) {
                block17: {
                    this.c = var3_3 = var1_1.c;
                    var7_8 = var3_3.iterator();
                    while (var8_10 /* !! */  = var7_8.hasNext()) {
                        var9_11 = (fp1_0)var7_8.next();
                        var10_12 = var9_11.a;
                        var11_13 = TextUtils.equals((CharSequence)var10_12, (CharSequence)var2_2);
                        if (!var11_13) continue;
                        var2_2 = var9_11.b;
                        break block17;
                    }
                    var2_2 = ((fp1_0)var3_3.get((int)0)).b;
                }
                this.b = var2_2;
            } else {
                var2_2 = var1_1.c;
                var12_14 = var2_2.isEmpty();
                if (var12_14 != 0 && (var2_2 = var1_1.b) == null) {
                    while (true) {
                        var12_14 = 1;
                        break;
                    }
                } else {
                    var2_2 = null;
                    for (var12_14 = 0; var12_14 < (var4_4 = (var3_3 = var1_1.c).size()); ++var12_14) {
                        if ((var4_4 = (int)(var3_3 = ((fp1_0)var1_1.c.get((int)var12_14)).b).equals(var7_9 = var1_1.b)) != 0) ** continue;
                    }
                    var12_14 = 0;
                    var2_2 = null;
                }
                ct3.f((boolean)var12_14);
                this.c = var2_2 = var1_1.c;
                this.b = var2_2 = var1_1.b;
            }
        }
        this.e = var12_14 = var1_1.e;
        var12_14 = var1_1.g;
        if (var12_14 == 0) ** GOTO lbl-1000
        var12_14 = var1_1.f;
        var4_4 = 32768;
        var13_15 = 4.5918E-41f;
        if ((var12_14 &= var4_4) == 0) {
            var12_14 = 0;
            var2_2 = null;
        } else lbl-1000:
        // 2 sources

        {
            var12_14 = 1;
        }
        var3_3 = "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set";
        ct3.g((boolean)var12_14, (String)var3_3);
        this.f = var12_14 = var1_1.f;
        this.g = var12_14 = var1_1.g;
        this.h = var12_14 = var1_1.h;
        this.i = var4_4 = var1_1.i;
        var14_16 = -1;
        if (var4_4 != var14_16) {
            var12_14 = var4_4;
        }
        this.j = var12_14;
        this.k = var2_2 = var1_1.j;
        this.l = var2_2 = var1_1.k;
        this.m = var2_2 = var1_1.l;
        this.n = var2_2 = var1_1.m;
        this.o = var2_2 = var1_1.n;
        this.p = var12_14 = var1_1.o;
        this.q = var12_14 = var1_1.p;
        var2_2 = var1_1.q;
        if (var2_2 == null) {
            var2_2 = Collections.emptyList();
        }
        this.r = var2_2;
        this.s = var2_2 = var1_1.r;
        this.t = var15_17 = var1_1.s;
        var4_4 = (int)var1_1.t;
        this.u = var4_4;
        this.v = var4_4 = var1_1.u;
        this.w = var4_4 = var1_1.v;
        this.x = var13_15 = var1_1.w;
        var4_4 = var1_1.x;
        if (var4_4 == var14_16) {
            var4_4 = 0;
            var13_15 = 0.0f;
            var3_3 = null;
        }
        this.y = var4_4;
        var13_15 = var1_1.y;
        var17_18 = -1.0f;
        cfr_temp_0 = var13_15 - var17_18;
        var8_10 /* !! */  = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (!var8_10 /* !! */ ) {
            var4_4 = 1065353216;
            var13_15 = 1.0f;
        }
        this.z = var13_15;
        var3_3 = var1_1.z;
        this.A = (byte[])var3_3;
        this.B = var4_4 = var1_1.A;
        this.C = var3_3 = var1_1.B;
        this.D = var4_4 = var1_1.C;
        this.E = var4_4 = var1_1.D;
        this.F = var4_4 = var1_1.E;
        var4_4 = var1_1.F;
        if (var4_4 == var14_16) {
            var4_4 = 0;
            var13_15 = 0.0f;
            var3_3 = null;
        }
        this.G = var4_4;
        var4_4 = var1_1.G;
        if (var4_4 != var14_16) {
            var6_6 = var4_4;
        }
        this.H = var6_6;
        this.I = var4_4 = var1_1.H;
        this.J = var4_4 = var1_1.I;
        this.K = var4_4 = var1_1.J;
        this.L = var4_4 = var1_1.K;
        var18_19 = var1_1.L;
        this.M = var18_19 == 0 && var2_2 != null ? var5_5 : var18_19;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String d(d object) {
        StringBuilder stringBuilder;
        block52: {
            block51: {
                block53: {
                    block54: {
                        float f5;
                        double d2;
                        double d5;
                        double d7;
                        int n3;
                        float f6;
                        Object object2;
                        int n4;
                        Object object3;
                        Object object4;
                        int n7;
                        CharSequence charSequence;
                        Object object5;
                        int n8;
                        int n10;
                        Object object6;
                        int n14 = 2;
                        int n15 = 0;
                        float f7 = 0.0f;
                        Object object7 = null;
                        int n16 = 4;
                        int n17 = 1;
                        if (object == null) {
                            return "null";
                        }
                        char c2 = ',';
                        Object object8 = Joiner.on(c2);
                        stringBuilder = Ex0.a("id=");
                        ArrayList<Object> arrayList = ((d)object).a;
                        stringBuilder.append((String)((Object)arrayList));
                        stringBuilder.append(", mimeType=");
                        arrayList = ((d)object).o;
                        stringBuilder.append((String)((Object)arrayList));
                        arrayList = ((d)object).n;
                        if (arrayList != null) {
                            object6 = ", container=";
                            stringBuilder.append((String)object6);
                            stringBuilder.append((String)((Object)arrayList));
                        }
                        if ((n10 = ((d)object).j) != (n8 = -1)) {
                            object5 = ", bitrate=";
                            stringBuilder.append((String)object5);
                            stringBuilder.append(n10);
                        }
                        if ((object6 = ((d)object).k) != null) {
                            object5 = ", codecs=";
                            stringBuilder.append((String)object5);
                            stringBuilder.append((String)object6);
                        }
                        if ((object6 = ((d)object).s) != null) {
                            int n18;
                            object5 = new LinkedHashSet();
                            charSequence = null;
                            for (n7 = 0; n7 < (n18 = ((DrmInitData)object6).d); n7 += n17) {
                                object4 = ((DrmInitData)object6).a[n7].b;
                                object3 = OF.b;
                                n4 = ((UUID)object4).equals(object3);
                                if (n4 != 0) {
                                    object4 = "cenc";
                                    object5.add(object4);
                                    continue;
                                }
                                object3 = OF.c;
                                n4 = ((UUID)object4).equals(object3);
                                if (n4 != 0) {
                                    object4 = "clearkey";
                                    object5.add(object4);
                                    continue;
                                }
                                object3 = OF.e;
                                n4 = ((UUID)object4).equals(object3);
                                if (n4 != 0) {
                                    object4 = "playready";
                                    object5.add(object4);
                                    continue;
                                }
                                object3 = OF.d;
                                n4 = ((UUID)object4).equals(object3);
                                if (n4 != 0) {
                                    object4 = "widevine";
                                    object5.add(object4);
                                    continue;
                                }
                                object3 = OF.a;
                                n4 = ((UUID)object4).equals(object3);
                                if (n4 != 0) {
                                    object4 = "universal";
                                    object5.add(object4);
                                    continue;
                                }
                                object2 = "unknown (";
                                object3 = new StringBuilder((String)object2);
                                ((StringBuilder)object3).append(object4);
                                ((StringBuilder)object3).append(")");
                                object4 = ((StringBuilder)object3).toString();
                                object5.add(object4);
                            }
                            object6 = ", drm=[";
                            stringBuilder.append((String)object6);
                            ((Joiner)object8).appendTo(stringBuilder, (Iterable)object5);
                            n10 = 93;
                            f6 = 1.3E-43f;
                            stringBuilder.append((char)n10);
                        }
                        if ((n10 = ((d)object).v) != n8 && (n3 = ((d)object).w) != n8) {
                            charSequence = ", res=";
                            stringBuilder.append((String)charSequence);
                            stringBuilder.append(n10);
                            object6 = "x";
                            stringBuilder.append((String)object6);
                            stringBuilder.append(n3);
                        }
                        if ((n3 = (int)(DoubleMath.fuzzyEquals(d7 = (double)(f6 = ((d)object).z), d5 = 1.0, d2 = 0.001) ? 1 : 0)) == 0) {
                            stringBuilder.append(", par=");
                            object6 = Float.valueOf(f6);
                            object5 = new Object[n17];
                            object5[0] = object6;
                            n15 = gz3.a;
                            object7 = Locale.US;
                            object6 = "%.3f";
                            object7 = String.format((Locale)object7, (String)object6, (Object[])object5);
                            stringBuilder.append((String)object7);
                        }
                        if ((object7 = ((d)object).C) != null) {
                            n10 = ((VX)object7).f;
                            n3 = ((VX)object7).e;
                            if (n3 != n8 && n10 != n8 || (n7 = (int)(((VX)object7).d() ? 1 : 0)) != 0) {
                                charSequence = ", color=";
                                stringBuilder.append((String)charSequence);
                                n7 = (int)(((VX)object7).d() ? 1 : 0);
                                object4 = "/";
                                if (n7 != 0) {
                                    n7 = ((VX)object7).a;
                                    charSequence = VX.b(n7);
                                    n4 = ((VX)object7).b;
                                    object3 = VX.a(n4);
                                    n15 = ((VX)object7).c;
                                    object7 = VX.c(n15);
                                    object2 = Locale.US;
                                    object7 = KW.a((String)charSequence, (String)object4, (String)object3, (String)object4, (String)object7);
                                } else {
                                    object7 = "NA/NA/NA";
                                }
                                if (n3 != n8 && n10 != n8) {
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append(n3);
                                    ((StringBuilder)charSequence).append((String)object4);
                                    ((StringBuilder)charSequence).append(n10);
                                    object6 = ((StringBuilder)charSequence).toString();
                                } else {
                                    object6 = "NA/NA";
                                }
                                object5 = new StringBuilder();
                                ((StringBuilder)object5).append((String)object7);
                                ((StringBuilder)object5).append((String)object4);
                                ((StringBuilder)object5).append((String)object6);
                                object7 = ((StringBuilder)object5).toString();
                                stringBuilder.append((String)object7);
                            }
                        }
                        if ((n15 = (f5 = (f6 = ((d)object).x) - (f7 = -1.0f)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != 0) {
                            object7 = ", fps=";
                            stringBuilder.append((String)object7);
                            stringBuilder.append(f6);
                        }
                        if ((n15 = ((d)object).D) != n8) {
                            object6 = ", channels=";
                            stringBuilder.append((String)object6);
                            stringBuilder.append(n15);
                        }
                        if ((n15 = ((d)object).E) != n8) {
                            arrayList = ", sample_rate=";
                            stringBuilder.append((String)((Object)arrayList));
                            stringBuilder.append(n15);
                        }
                        if ((object7 = ((d)object).d) != null) {
                            arrayList = ", language=";
                            stringBuilder.append((String)((Object)arrayList));
                            stringBuilder.append((String)object7);
                        }
                        object7 = ((d)object).c;
                        n8 = (int)(object7.isEmpty() ? 1 : 0);
                        object6 = "]";
                        if (n8 == 0) {
                            stringBuilder.append(", labels=[");
                            arrayList = new ArrayList<Object>();
                            object7 = Lists.transform((List)object7, (Function)((Object)arrayList));
                            ((Joiner)object8).appendTo(stringBuilder, (Iterable)object7);
                            stringBuilder.append((String)object6);
                        }
                        if ((n15 = ((d)object).e) != 0) {
                            stringBuilder.append(", selectionFlags=[");
                            n8 = gz3.a;
                            arrayList = new ArrayList<Object>();
                            n3 = n15 & 4;
                            if (n3 != 0) {
                                object5 = "auto";
                                arrayList.add(object5);
                            }
                            if ((n3 = n15 & 1) != 0) {
                                object5 = "default";
                                arrayList.add(object5);
                            }
                            if ((n15 &= n14) != 0) {
                                object7 = "forced";
                                arrayList.add(object7);
                            }
                            ((Joiner)object8).appendTo(stringBuilder, arrayList);
                            stringBuilder.append((String)object6);
                        }
                        n15 = 32768;
                        f7 = 4.5918E-41f;
                        n8 = ((d)object).f;
                        if (n8 != 0) {
                            stringBuilder.append(", roleFlags=[");
                            n3 = gz3.a;
                            object5 = new ArrayList();
                            n7 = n8 & 1;
                            if (n7 != 0) {
                                charSequence = "main";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 2) != 0) {
                                charSequence = "alt";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 4) != 0) {
                                charSequence = "supplementary";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 8) != 0) {
                                charSequence = "commentary";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x10) != 0) {
                                charSequence = "dub";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x20) != 0) {
                                charSequence = "emergency";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x40) != 0) {
                                charSequence = "caption";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x80) != 0) {
                                charSequence = "subtitle";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x100) != 0) {
                                charSequence = "sign";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x200) != 0) {
                                charSequence = "describes-video";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x400) != 0) {
                                charSequence = "describes-music";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x800) != 0) {
                                charSequence = "enhanced-intelligibility";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x1000) != 0) {
                                charSequence = "transcribes-dialog";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x2000) != 0) {
                                charSequence = "easy-read";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & 0x4000) != 0) {
                                charSequence = "trick-play";
                                ((ArrayList)object5).add(charSequence);
                            }
                            if ((n7 = n8 & n15) != 0) {
                                charSequence = "auxiliary";
                                ((ArrayList)object5).add(charSequence);
                            }
                            ((Joiner)object8).appendTo(stringBuilder, (Iterable)object5);
                            stringBuilder.append((String)object6);
                        }
                        if ((object8 = ((d)object).m) != null) {
                            object6 = ", customData=";
                            stringBuilder.append((String)object6);
                            stringBuilder.append(object8);
                        }
                        if ((n15 &= n8) == 0) break block52;
                        object7 = ", auxiliaryTrackType=";
                        stringBuilder.append((String)object7);
                        n15 = gz3.a;
                        int n19 = ((d)object).g;
                        if (n19 == 0) break block53;
                        if (n19 == n17) break block54;
                        if (n19 != n14) {
                            n14 = 3;
                            if (n19 != n14) {
                                if (n19 != n16) {
                                    object = new IllegalStateException("Unsupported auxiliary track type");
                                    throw object;
                                }
                                object = "depth metadata";
                                break block51;
                            } else {
                                object = "depth-inverse";
                            }
                            break block51;
                        } else {
                            object = "depth-linear";
                        }
                        break block51;
                    }
                    object = "original";
                    break block51;
                }
                object = "undefined";
            }
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    public final d$a a() {
        float f5;
        long l2;
        int n3;
        d$a d$a = new Object();
        Object object = this.a;
        d$a.a = object;
        object = this.b;
        d$a.b = object;
        d$a.c = object = this.c;
        d$a.d = object = this.d;
        d$a.e = n3 = this.e;
        d$a.f = n3 = this.f;
        d$a.h = n3 = this.h;
        d$a.i = n3 = this.i;
        d$a.j = object = this.k;
        d$a.k = object = this.l;
        d$a.l = object = this.m;
        d$a.m = object = this.n;
        d$a.n = object = this.o;
        d$a.o = n3 = this.p;
        d$a.p = n3 = this.q;
        d$a.q = object = this.r;
        d$a.r = object = this.s;
        d$a.s = l2 = this.t;
        n3 = (int)(this.u ? 1 : 0);
        d$a.t = n3;
        d$a.u = n3 = this.v;
        d$a.v = n3 = this.w;
        d$a.w = f5 = this.x;
        d$a.x = n3 = this.y;
        d$a.y = f5 = this.z;
        object = this.A;
        d$a.z = (byte[])object;
        d$a.A = n3 = this.B;
        d$a.B = object = this.C;
        d$a.C = n3 = this.D;
        d$a.D = n3 = this.E;
        d$a.E = n3 = this.F;
        d$a.F = n3 = this.G;
        d$a.G = n3 = this.H;
        d$a.H = n3 = this.I;
        d$a.I = n3 = this.J;
        d$a.J = n3 = this.K;
        d$a.K = n3 = this.L;
        d$a.L = n3 = this.M;
        return d$a;
    }

    public final int b() {
        int n3;
        int n4 = this.v;
        int n7 = -1;
        if (n4 != n7 && (n3 = this.w) != n7) {
            n7 = n4 * n3;
        }
        return n7;
    }

    public final boolean c(d d2) {
        Object object;
        int n3;
        List list = this.r;
        int n4 = list.size();
        if (n4 != (n3 = (object = d2.r).size())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
            byte[] byArray;
            object = (byte[])list.get(n4);
            n3 = (int)(Arrays.equals((byte[])object, byArray = (byte[])d2.r.get(n4)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = d.class) == (object2 = object.getClass())) {
            boolean bl3;
            float f5;
            float f6;
            long l2;
            long l3;
            long l4;
            long l7;
            int n3;
            object = (d)object;
            int n4 = this.N;
            if (n4 != 0 && (n3 = ((d)object).N) != 0 && n4 != n3) {
                return false;
            }
            n4 = this.e;
            n3 = ((d)object).e;
            if (n4 != n3 || (n4 = this.f) != (n3 = ((d)object).f) || (n4 = this.g) != (n3 = ((d)object).g) || (n4 = this.h) != (n3 = ((d)object).h) || (n4 = this.i) != (n3 = ((d)object).i) || (n4 = this.p) != (n3 = ((d)object).p) || (l7 = (l4 = (l3 = this.t) - (l2 = ((d)object).t)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false || (n4 = this.v) != (n3 = ((d)object).v) || (n4 = this.w) != (n3 = ((d)object).w) || (n4 = this.y) != (n3 = ((d)object).y) || (n4 = this.B) != (n3 = ((d)object).B) || (n4 = this.D) != (n3 = ((d)object).D) || (n4 = this.E) != (n3 = ((d)object).E) || (n4 = this.F) != (n3 = ((d)object).F) || (n4 = this.G) != (n3 = ((d)object).G) || (n4 = this.H) != (n3 = ((d)object).H) || (n4 = this.I) != (n3 = ((d)object).I) || (n4 = this.K) != (n3 = ((d)object).K) || (n4 = this.L) != (n3 = ((d)object).L) || (n4 = this.M) != (n3 = ((d)object).M) || (n4 = Float.compare(f6 = this.x, f5 = ((d)object).x)) != 0 || (n4 = Float.compare(f6 = this.z, f5 = ((d)object).z)) != 0 || (n4 = (int)(Objects.equals(object2 = this.a, object3 = ((d)object).a) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.b, object3 = ((d)object).b) ? 1 : 0)) == 0 || (n4 = (int)((object2 = this.c).equals(object3 = ((d)object).c) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.k, object3 = ((d)object).k) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.n, object3 = ((d)object).n) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.o, object3 = ((d)object).o) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.d, object3 = ((d)object).d) ? 1 : 0)) == 0 || (n4 = (int)(Arrays.equals((byte[])(object2 = (Object)this.A), (byte[])(object3 = (Object)((d)object).A)) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.l, object3 = ((d)object).l) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.C, object3 = ((d)object).C) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.s, object3 = ((d)object).s) ? 1 : 0)) == 0 || (n4 = (int)(this.c((d)object) ? 1 : 0)) == 0 || !(bl3 = Objects.equals(object2 = this.m, object = ((d)object).m))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.N;
        if (n3 == 0) {
            int n4;
            int n7;
            n3 = 0;
            float f5 = 0.0f;
            String string2 = this.a;
            if (string2 == null) {
                n7 = 0;
                string2 = null;
            } else {
                n7 = string2.hashCode();
            }
            float f6 = 7.38E-43f;
            int n8 = 527 + n7;
            n7 = 31;
            n8 *= 31;
            Object object = this.b;
            if (object == null) {
                n4 = 0;
                object = null;
            } else {
                n4 = ((String)object).hashCode();
            }
            n8 = (n8 + n4) * 31;
            object = this.c;
            n4 = (object.hashCode() + n8) * 31;
            Object object2 = this.d;
            if (object2 == null) {
                n8 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n8 = ((String)object2).hashCode();
            }
            n4 = (n4 + n8) * 31;
            n8 = this.e;
            n4 = (n4 + n8) * 31;
            n8 = this.f;
            n4 = (n4 + n8) * 31;
            n8 = this.g;
            n4 = (n4 + n8) * 31;
            n8 = this.h;
            n4 = (n4 + n8) * 31;
            n8 = this.i;
            n4 = (n4 + n8) * 31;
            object2 = this.k;
            if (object2 == null) {
                n8 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n8 = ((String)object2).hashCode();
            }
            n4 = (n4 + n8) * 31;
            object2 = this.l;
            if (object2 == null) {
                n8 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n8 = ((Metadata)object2).hashCode();
            }
            n4 = (n4 + n8) * 31;
            object2 = this.m;
            if (object2 == null) {
                n8 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n8 = object2.hashCode();
            }
            n4 = (n4 + n8) * 31;
            object2 = this.n;
            if (object2 == null) {
                n8 = 0;
                f6 = 0.0f;
                object2 = null;
            } else {
                n8 = ((String)object2).hashCode();
            }
            n4 = (n4 + n8) * 31;
            object2 = this.o;
            if (object2 != null) {
                n3 = ((String)object2).hashCode();
            }
            n4 = (n4 + n3) * 31;
            n3 = this.p;
            n4 = (n4 + n3) * 31;
            long l2 = this.t;
            n3 = (int)l2;
            n4 = (n4 + n3) * 31;
            n3 = this.v;
            n4 = (n4 + n3) * 31;
            n3 = this.w;
            n4 = (n4 + n3) * 31;
            f5 = this.x;
            n3 = UR0.a(f5, n4, n7);
            n8 = this.y;
            n3 = (n3 + n8) * 31;
            f6 = this.z;
            n3 = UR0.a(f6, n3, n7);
            n8 = this.B;
            n3 = (n3 + n8) * 31;
            n8 = this.D;
            n3 = (n3 + n8) * 31;
            n8 = this.E;
            n3 = (n3 + n8) * 31;
            n8 = this.F;
            n3 = (n3 + n8) * 31;
            n8 = this.G;
            n3 = (n3 + n8) * 31;
            n8 = this.H;
            n3 = (n3 + n8) * 31;
            n8 = this.I;
            n3 = (n3 + n8) * 31;
            n8 = this.K;
            n3 = (n3 + n8) * 31;
            n8 = this.L;
            n3 = (n3 + n8) * 31;
            n7 = this.M;
            this.N = n3 += n7;
        }
        return this.N;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Format(");
        String string2 = this.a;
        stringBuilder.append(string2);
        string2 = ", ";
        stringBuilder.append(string2);
        Object object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        object = this.n;
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        object = this.o;
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        object = this.k;
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        int n3 = this.j;
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", [");
        n3 = this.v;
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        n3 = this.w;
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        float f5 = this.x;
        stringBuilder.append(f5);
        stringBuilder.append(string2);
        object = this.C;
        stringBuilder.append(object);
        stringBuilder.append("], [");
        n3 = this.D;
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        return g30.a(this.E, "])", stringBuilder);
    }
}

