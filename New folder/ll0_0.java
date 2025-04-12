/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from Ll0
 */
public final class ll0_0
implements hi0_0 {
    public static final int[] g;
    public static final Ll0$a h;
    public static final Ll0$a i;
    public final int a;
    public ImmutableList b;
    public final int c;
    public boolean d;
    public vf3$a_0 e;
    public int f;

    static {
        Object object;
        int[] nArray = object = new int[21];
        int[] nArray2 = object;
        nArray[0] = 5;
        nArray2[1] = 4;
        nArray[2] = 12;
        nArray2[3] = 8;
        nArray[4] = 3;
        nArray2[5] = 10;
        nArray[6] = 9;
        nArray2[7] = 11;
        nArray[8] = 6;
        nArray2[9] = 2;
        nArray[10] = 0;
        nArray2[11] = 1;
        nArray[12] = 7;
        nArray2[13] = 16;
        nArray[14] = 15;
        nArray2[15] = 14;
        nArray[16] = 17;
        nArray2[17] = 18;
        nArray[18] = 19;
        nArray2[19] = 20;
        nArray2[20] = 21;
        g = object;
        object = new Ll0$a;
        Ll0$a$a ll0$a$a = new Object();
        object(ll0$a$a);
        h = object;
        object = new Ll0$a;
        ll0$a$a = new Object();
        object(ll0$a$a);
        i = object;
    }

    public ll0_0() {
        jn0_0 jn0_02;
        int n3;
        this.a = n3 = 1;
        this.c = 112800;
        this.e = jn0_02;
        this.d = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hi0_0 a(jn0_0 jn0_02) {
        synchronized (this) {
            this.e = jn0_02;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hi0_0 b(boolean bl2) {
        synchronized (this) {
            this.d = bl2;
            return this;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eI0[] c(Uri var1_1, Map var2_2) {
        var3_3 = this;
        var4_4 = 14;
        var5_5 = -1;
        var6_6 = 0;
        var7_7 = 21;
        synchronized (this) {
            block72: {
                block71: {
                    try {
                        var9_9 = ll0_0.g;
                        var8_8 = new ArrayList<E>(var7_7);
                        var10_10 = "Content-Type";
                        var11_11 = var2_2;
                        var10_10 = var2_2.get(var10_10);
                        var10_10 = (List)var10_10;
                        if (var10_10 != null && (var12_12 = var10_10.isEmpty()) == 0) {
                            var10_10 = var10_10.get(0);
                            var10_10 = (String)var10_10;
                        } else {
                            var13_13 = 0;
                            var10_10 = null;
                        }
                        if (var10_10 == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var4_4 = -1;
                                break block71;
                                break;
                            }
                        }
                        var10_10 = ip1_0.l((String)var10_10);
                        var10_10.getClass();
                        var12_12 = var10_10.hashCode();
                    }
                    catch (Throwable var14_14) {
                        break block72;
                    }
                    switch (var12_12) lbl-1000:
                    // 33 sources

                    {
                        default: {
                            var13_13 = -1;
                            break;
                        }
                        case 2039520277: {
                            var11_11 = "video/x-matroska";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 31;
                            break;
                        }
                        case 1505118770: {
                            var11_11 = "audio/webm";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 30;
                            break;
                        }
                        case 1504831518: {
                            var11_11 = "audio/mpeg";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 29;
                            break;
                        }
                        case 1504824762: {
                            var11_11 = "audio/midi";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 28;
                            break;
                        }
                        case 1504619009: {
                            var11_11 = "audio/flac";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 27;
                            break;
                        }
                        case 1504578661: {
                            var11_11 = "audio/eac3";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 26;
                            break;
                        }
                        case 1503095341: {
                            var11_11 = "audio/3gpp";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 25;
                            break;
                        }
                        case 1331848029: {
                            var11_11 = "video/mp4";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 24;
                            break;
                        }
                        case 187099443: {
                            var11_11 = "audio/wav";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 23;
                            break;
                        }
                        case 187091926: {
                            var11_11 = "audio/ogg";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 22;
                            break;
                        }
                        case 187090232: {
                            var11_11 = "audio/mp4";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 21;
                            break;
                        }
                        case 187078669: {
                            var11_11 = "audio/amr";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 20;
                            break;
                        }
                        case 187078297: {
                            var11_11 = "audio/ac4";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 19;
                            break;
                        }
                        case 187078296: {
                            var11_11 = "audio/ac3";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 18;
                            break;
                        }
                        case 13915911: {
                            var11_11 = "video/x-flv";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 17;
                            break;
                        }
                        case -43467528: {
                            var11_11 = "application/webm";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 16;
                            break;
                        }
                        case -387023398: {
                            var11_11 = "audio/x-matroska";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 15;
                            break;
                        }
                        case -879258763: {
                            var11_11 = "image/png";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 14;
                            break;
                        }
                        case -879272239: {
                            var11_11 = "image/bmp";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 13;
                            break;
                        }
                        case -1004728940: {
                            var11_11 = "text/vtt";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 12;
                            break;
                        }
                        case -1079884372: {
                            var11_11 = "video/x-msvideo";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 11;
                            break;
                        }
                        case -1248337486: {
                            var11_11 = "application/mp4";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 10;
                            break;
                        }
                        case -1487018032: {
                            var11_11 = "image/webp";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 9;
                            break;
                        }
                        case -1487394660: {
                            var11_11 = "image/jpeg";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 8;
                            break;
                        }
                        case -1487464690: {
                            var11_11 = "image/heif";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 7;
                            break;
                        }
                        case -1487464693: {
                            var11_11 = "image/heic";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 6;
                            break;
                        }
                        case -1487656890: {
                            var11_11 = "image/avif";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 5;
                            break;
                        }
                        case -1606874997: {
                            var11_11 = "audio/amr-wb";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 4;
                            break;
                        }
                        case -1662095187: {
                            var11_11 = "video/webm";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 3;
                            break;
                        }
                        case -1662384007: {
                            var11_11 = "video/mp2t";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 2;
                            break;
                        }
                        case -1662384011: {
                            var11_11 = "video/mp2p";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 1;
                            break;
                        }
                        case -2123537834: {
                            var11_11 = "audio/eac3-joc";
                            var13_13 = (int)var10_10.equals(var11_11);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var13_13 = 0;
                            var10_10 = null;
                        }
                    }
                    switch (var13_13) {
                        default: {
                            ** continue;
                        }
                        case 29: {
                            var4_4 = 7;
                            break;
                        }
                        case 28: {
                            var4_4 = 15;
                            break;
                        }
                        case 27: {
                            var4_4 = 4;
                            break;
                        }
                        case 23: {
                            var4_4 = 12;
                            break;
                        }
                        case 22: {
                            var4_4 = 9;
                            break;
                        }
                        case 19: {
                            var4_4 = 1;
                            break;
                        }
                        case 17: {
                            var4_4 = 5;
                            break;
                        }
                        case 14: {
                            var4_4 = 17;
                            break;
                        }
                        case 13: {
                            var4_4 = 19;
                            break;
                        }
                        case 12: {
                            var4_4 = 13;
                            break;
                        }
                        case 11: {
                            var4_4 = 16;
                            break;
                        }
                        case 10: 
                        case 21: 
                        case 24: {
                            var4_4 = 8;
                            break;
                        }
                        case 9: {
                            var4_4 = 18;
                            break;
                        }
                        case 6: 
                        case 7: {
                            var4_4 = 20;
                            break;
                        }
                        case 5: {
                            var4_4 = 21;
                            break;
                        }
                        case 4: 
                        case 20: 
                        case 25: {
                            var4_4 = 3;
                            break;
                        }
                        case 3: 
                        case 15: 
                        case 16: 
                        case 30: 
                        case 31: {
                            var4_4 = 6;
                            break;
                        }
                        case 2: {
                            var4_4 = 11;
                            break;
                        }
                        case 1: {
                            var4_4 = 10;
                            break;
                        }
                        case 0: 
                        case 18: 
                        case 26: {
                            var4_4 = 0;
                            break;
                        }
                        case 8: 
                    }
                }
                if (var4_4 != var5_5) {
                    var3_3.d(var4_4, var8_8);
                }
                if ((var13_13 = gz0_0.b(var1_1)) != var5_5 && var13_13 != var4_4) {
                    var3_3.d(var13_13, var8_8);
                }
                while (var6_6 < var7_7) {
                    var5_5 = var9_9[var6_6];
                    if (var5_5 != var4_4 && var5_5 != var13_13) {
                        var3_3.d(var5_5, var8_8);
                    }
                    ++var6_6;
                }
                var5_5 = var8_8.size();
                var14_15 = new eI0[var5_5];
                return var8_8.toArray(var14_15);
            }
            throw var14_14;
        }
    }

    public final void d(int n3, ArrayList arrayList) {
        int n4 = 1;
        int n7 = 0;
        Object object = null;
        switch (n3) {
            default: {
                break;
            }
            case 21: {
                nu_1 nu_12 = new nu_1();
                arrayList.add(nu_12);
                break;
            }
            case 20: {
                y41 y412 = new y41();
                arrayList.add(y412);
                break;
            }
            case 19: {
                ry_1 ry_12 = new ry_1();
                arrayList.add(ry_12);
                break;
            }
            case 18: {
                GF3 gF3 = new GF3();
                arrayList.add(gF3);
                break;
            }
            case 17: {
                jv2_1 jv2_12 = new jv2_1();
                arrayList.add(jv2_12);
                break;
            }
            case 16: {
                n7 = this.d;
                object = this.e;
                ku_0 ku_02 = new ku_0(n4 ^= n7, (vf3$a_0)object);
                arrayList.add(ku_02);
                break;
            }
            case 15: {
                Object object2 = i;
                Object[] objectArray = new Object[]{};
                object2 = ((Ll0$a)object2).a(objectArray);
                if (object2 == null) break;
                arrayList.add(object2);
                break;
            }
            case 14: {
                n4 = this.f;
                il1_1 il1_12 = new il1_1(n4);
                arrayList.add(il1_12);
                break;
            }
            case 12: {
                int n8;
                long l2;
                bf3_0 bf3_02 = new Object();
                bf3_02.c = 0;
                bf3_02.d = l2 = (long)-1;
                bf3_02.f = n8 = -1;
                bf3_02.g = l2;
                arrayList.add(bf3_02);
                break;
            }
            case 11: {
                Object object3 = this.b;
                if (object3 == null) {
                    this.b = object3 = ImmutableList.of();
                }
                n7 = (int)(this.d ? 1 : 0);
                int n10 = n7 ^ 1;
                vf3$a_0 vf3$a_0 = this.e;
                long l3 = 0L;
                On3 on3 = new On3(l3);
                ImmutableList immutableList = this.b;
                qn0_0 qn0_02 = new qn0_0(immutableList);
                int n14 = this.c;
                int n15 = this.a;
                object = object3;
                object3 = new Fs3(n15, n10, vf3$a_0, on3, qn0_02, n14);
                arrayList.add(object3);
                break;
            }
            case 10: {
                TB2 tB2 = new TB2();
                arrayList.add(tB2);
                break;
            }
            case 9: {
                m72 m722 = new Object();
                arrayList.add(m722);
                break;
            }
            case 8: {
                vf3$a_0 vf3$a_0 = this.e;
                int n16 = this.d;
                n16 = n16 != 0 ? 0 : 32;
                eI0 eI02 = new PW0(n16, vf3$a_0);
                arrayList.add(eI02);
                vf3$a_0 = this.e;
                n16 = (int)(this.d ? 1 : 0);
                if (n16 == 0) {
                    n7 = 16;
                }
                eI02 = new bq1_0(n7, vf3$a_0);
                arrayList.add(eI02);
                break;
            }
            case 7: {
                yq1_1 yq1_12 = new yq1_1(0);
                arrayList.add(yq1_12);
                break;
            }
            case 6: {
                vf3$a_0 vf3$a_0 = this.e;
                boolean bl2 = this.d;
                if (!bl2) {
                    n7 = 2;
                }
                tk1_1 tk1_12 = new tk1_1(n7, vf3$a_0);
                arrayList.add(tk1_12);
                break;
            }
            case 5: {
                jt0_1 jt0_12 = new jt0_1();
                arrayList.add(jt0_12);
                break;
            }
            case 4: {
                Object object4 = 0;
                Object[] objectArray = new Object[n4];
                objectArray[0] = object4;
                object4 = h.a(objectArray);
                if (object4 != null) {
                    arrayList.add(object4);
                    break;
                }
                object4 = new zo0_0();
                arrayList.add(object4);
                break;
            }
            case 3: {
                ie ie2 = new ie();
                arrayList.add(ie2);
                break;
            }
            case 2: {
                m5 m52 = new m5();
                arrayList.add(m52);
                break;
            }
            case 1: {
                x1_0 x1_02 = new x1_0();
                arrayList.add(x1_02);
                break;
            }
            case 0: {
                u1_0 u1_02 = new u1_0();
                arrayList.add(u1_02);
            }
        }
    }
}

