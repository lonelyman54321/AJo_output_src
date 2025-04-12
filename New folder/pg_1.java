/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 *  android.view.contentcapture.ContentCaptureSession
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pg
 */
public final class pg_1
implements jm0_1,
View.OnAttachStateChangeListener {
    public final AndroidComposeView a;
    public final Function0 b;
    public v60 c;
    public final tr1_1 d;
    public final ur1_0 e;
    public final long f;
    public Pg$a g;
    public boolean h;
    public final Np i;
    public final le_2 j;
    public final Handler k;
    public tr1_1 l;
    public long m;
    public final tr1_1 n;
    public IY2 o;
    public boolean p;
    public final Og q;

    public pg_1(AndroidComposeView object, Function0 object2) {
        this.a = object;
        this.b = object2;
        this.d = object2 = new tr1_1();
        this.e = object2 = new ur1_0(null);
        this.f = 100;
        object2 = Pg$a.SHOW_ORIGINAL;
        this.g = object2;
        int n3 = 1;
        this.h = n3;
        Object object3 = new Np(0);
        this.i = object3;
        object2 = sr_2.a(n3, 6, null);
        this.j = object2;
        Object object4 = Looper.getMainLooper();
        object2 = new Handler(object4);
        this.k = object2;
        object2 = Ri1.a;
        object4 = "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>";
        Intrinsics.checkNotNull(object2, (String)object4);
        this.l = object2;
        this.n = object3 = new tr1_1();
        object = ((AndroidComposeView)object).getSemanticsOwner().a();
        Intrinsics.checkNotNull(object2, (String)object4);
        this.o = object3 = new IY2((GY2)object, (Qi1)object2);
        this.q = object = new Og(this, 0);
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    /*
     * Exception decompiling
     */
    public final Object b(f80_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 156->163)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Qi1 c() {
        boolean bl2 = this.h;
        if (bl2) {
            long l2;
            tr1_1 tr1_12;
            bl2 = false;
            this.h = false;
            this.l = tr1_12 = VY2.a(this.a.getSemanticsOwner());
            this.m = l2 = System.currentTimeMillis();
        }
        return this.l;
    }

    public final boolean d() {
        boolean bl2;
        v60 v602 = this.c;
        if (v602 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            v602 = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e() {
        int n3;
        long l2;
        long l3;
        long l4;
        int n4;
        int n7;
        long l7;
        int n8;
        Object object;
        int n10;
        Object[] objectArray;
        Object object2;
        View view;
        int n14;
        Object object3;
        int n15;
        Object object4;
        Object object5;
        pg_1 pg_12;
        block22: {
            block26: {
                block25: {
                    Object[] objectArray2;
                    block24: {
                        block23: {
                            block21: {
                                long[] lArray;
                                int n16;
                                block20: {
                                    Object[] objectArray3;
                                    block19: {
                                        pg_12 = this;
                                        object5 = this.c;
                                        if (object5 == null) {
                                            return;
                                        }
                                        int n17 = Build.VERSION.SDK_INT;
                                        int n18 = 29;
                                        if (n17 < n18) {
                                            return;
                                        }
                                        object4 = this.d;
                                        n15 = ((Qi1)object4).e;
                                        object3 = "TREAT_AS_VIEW_TREE_APPEARED";
                                        objectArray3 = "TREAT_AS_VIEW_TREE_APPEARING";
                                        n16 = 7;
                                        n14 = 8;
                                        view = ((v60)object5).b;
                                        object5 = ((v60)object5).a;
                                        if (n15 == 0) break block19;
                                        object2 = new ArrayList();
                                        objectArray = ((Qi1)object4).c;
                                        lArray = ((Qi1)object4).a;
                                        n10 = lArray.length + -2;
                                        if (n10 >= 0) break block20;
                                        object = object3;
                                        objectArray2 = objectArray3;
                                        break block21;
                                    }
                                    object = object3;
                                    objectArray = objectArray3;
                                    break block22;
                                }
                                n8 = 0;
                                while (true) {
                                    void var8_9;
                                    long l8 = lArray[n8];
                                    object = object3;
                                    objectArray2 = var8_9;
                                    long l12 = (l8 ^ (long)-1) << n16 & l8;
                                    l7 = -9187201950435737472L;
                                    long l14 = (l12 &= l7) - l7;
                                    Object object6 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object6 != false) {
                                        n7 = ~(n8 - n10) >>> 31;
                                        n7 = 8 - n7;
                                        Object var8_10 = null;
                                        for (n4 = 0; n4 < n7; l8 >>= n14, ++n4) {
                                            l4 = 255L;
                                            l3 = l8 & l4;
                                            l2 = 128L;
                                            long l15 = l3 - l2;
                                            Object object7 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                            if (object7 < 0) {
                                                Object object8;
                                                object6 = (n8 << 3) + n4;
                                                Object object9 = object8 = objectArray[object6];
                                                object9 = (LD3)object8;
                                                object2.add(object9);
                                            }
                                            n16 = 7;
                                        }
                                        if (n7 != n14) break;
                                    }
                                    if (n8 == n10) break;
                                    ++n8;
                                    object3 = object;
                                    Object[] objectArray4 = objectArray2;
                                    n16 = 7;
                                }
                            }
                            n4 = object2.size();
                            object3 = new ArrayList(n4);
                            n4 = object2.size();
                            objectArray = null;
                            for (int i3 = 0; i3 < n4; ++i3) {
                                ViewStructure viewStructure = u60.a(((LD3)object2.get((int)i3)).a);
                                object3.add(viewStructure);
                            }
                            n15 = Build.VERSION.SDK_INT;
                            n4 = 34;
                            if (n15 < n4) break block23;
                            object2 = t60_0.a(object5);
                            v60$c.a((ContentCaptureSession)object2, object3);
                            break block24;
                        }
                        n4 = 29;
                        if (n15 < n4) break block24;
                        object2 = v60$b.b(t60_0.a(object5), view);
                        Bundle bundle = v60$a.a((ViewStructure)object2);
                        objectArray = objectArray2;
                        n3 = 1;
                        bundle.putBoolean((String)objectArray2, n3 != 0);
                        ContentCaptureSession contentCaptureSession = t60_0.a(object5);
                        v60$b.d(contentCaptureSession, (ViewStructure)object2);
                        object2 = null;
                        for (n15 = 0; n15 < (n4 = object3.size()); ++n15) {
                            ContentCaptureSession contentCaptureSession2 = t60_0.a(object5);
                            ViewStructure viewStructure = u60.a(object3.get(n15));
                            v60$b.d(contentCaptureSession2, viewStructure);
                        }
                        break block25;
                    }
                    objectArray = objectArray2;
                    break block26;
                }
                object2 = v60$b.b(t60_0.a(object5), view);
                object3 = v60$a.a((ViewStructure)object2);
                n4 = 1;
                object3.putBoolean((String)object, n4 != 0);
                object3 = t60_0.a(object5);
                v60$b.d((ContentCaptureSession)object3, (ViewStructure)object2);
            }
            ((tr1_1)object4).d();
        }
        object4 = pg_12.e;
        n15 = ((Zi1)object4).d;
        if (n15 != 0) {
            Long l16;
            Object object10;
            object2 = new ArrayList();
            object3 = ((Zi1)object4).b;
            long[] lArray = ((Zi1)object4).a;
            n3 = lArray.length + -2;
            if (n3 < 0) {
                object10 = object;
            } else {
                n10 = 0;
                l16 = null;
                while (true) {
                    long l17 = lArray[n10];
                    object10 = object;
                    long l18 = l17 ^ (long)-1;
                    int n19 = 7;
                    l18 = l18 << n19 & l17;
                    l7 = -9187201950435737472L;
                    long l19 = (l18 &= l7) - l7;
                    Object object11 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                    if (object11 != false) {
                        n8 = ~(n10 - n3) >>> 31;
                        n8 = 8 - n8;
                        object = null;
                        for (int i8 = 0; i8 < n8; l17 >>= n14, ++i8) {
                            l4 = 255L;
                            l3 = l17 & l4;
                            l2 = 128L;
                            long l20 = l3 - l2;
                            Object object12 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                            if (object12 >= 0) continue;
                            Object object11 = (n10 << 3) + i8;
                            object11 = object3[object11];
                            Integer n20 = (int)object11;
                            object2.add(n20);
                            n14 = 8;
                        }
                        l2 = 128L;
                        l4 = 255L;
                        if (n8 != n14) break;
                    } else {
                        l2 = 128L;
                        l4 = 255L;
                    }
                    if (n10 == n3) break;
                    ++n10;
                    object = object10;
                }
            }
            n4 = object2.size();
            object3 = new ArrayList(n4);
            n4 = object2.size();
            Object var14_35 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                n10 = ((Number)object2.get(n3)).intValue();
                long l21 = n10;
                l16 = l21;
                object3.add(l16);
            }
            object2 = CollectionsKt.l0(object3);
            n7 = Build.VERSION.SDK_INT;
            n4 = 34;
            if (n7 >= n4) {
                object5 = t60_0.a(object5);
                Zs zs = FC3.a(view);
                Objects.requireNonNull(zs);
                AutofillId autofillId = g2.a(zs.a);
                v60$b.f((ContentCaptureSession)object5, autofillId, (long[])object2);
            } else {
                n4 = 29;
                if (n7 >= n4) {
                    object3 = v60$b.b(t60_0.a(object5), view);
                    Bundle bundle = v60$a.a((ViewStructure)object3);
                    n3 = 1;
                    bundle.putBoolean((String)objectArray, n3 != 0);
                    v60$b.d(t60_0.a(object5), (ViewStructure)object3);
                    object3 = t60_0.a(object5);
                    Zs zs = FC3.a(view);
                    Objects.requireNonNull(zs);
                    AutofillId autofillId = g2.a(zs.a);
                    v60$b.f((ContentCaptureSession)object3, autofillId, (long[])object2);
                    ViewStructure viewStructure = v60$b.b(t60_0.a(object5), view);
                    object2 = v60$a.a(viewStructure);
                    n7 = 1;
                    object2.putBoolean((String)object10, n7 != 0);
                    object5 = t60_0.a(object5);
                    v60$b.d((ContentCaptureSession)object5, viewStructure);
                }
            }
            ((ur1_0)object4).c();
        }
    }

    public final void f(GY2 gY2, IY2 iY2) {
        int n3;
        Object object;
        int n4;
        Object object2;
        int n7;
        pg_1 pg_12 = this;
        Object object3 = gY2;
        int n8 = 1;
        int n10 = 4;
        Object object4 = GY2.h(gY2, n8 != 0, n10);
        int n14 = object4.size();
        long[] lArray = null;
        for (n7 = 0; n7 < n14; ++n7) {
            int n15;
            GY2 gY22 = (GY2)object4.get(n7);
            object2 = this.c();
            n4 = (int)(((Qi1)object2).a(n15 = gY22.g) ? 1 : 0);
            if (n4 != 0) {
                object2 = iY2;
                ur1_0 ur1_02 = iY2.b;
                int n16 = gY22.g;
                n15 = (int)(ur1_02.a(n16) ? 1 : 0);
                if (n15 != 0) continue;
                pg_12.i(gY22);
                continue;
            }
            object2 = iY2;
        }
        object4 = pg_12.n;
        Object object5 = ((Qi1)object4).b;
        lArray = ((Qi1)object4).a;
        int n17 = lArray.length + -2;
        if (n17 >= 0) {
            n4 = 0;
            object2 = null;
            while (true) {
                long l2 = lArray[n4];
                long l3 = l2 ^ (long)-1;
                int n18 = 7;
                l3 = l3 << n18 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 != false) {
                    int n19 = ~(n4 - n17) >>> 31;
                    int n20 = 8;
                    n19 = 8 - n19;
                    for (n18 = 0; n18 < n19; ++n18) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object7 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object7 < 0) {
                            Object object8 = (n4 << 3) + n18;
                            object8 = object5[object8];
                            object = this.c();
                            n3 = (int)(((Qi1)object).a((int)object8) ? 1 : 0);
                            if (n3 == 0) {
                                object = pg_12.d;
                                boolean bl2 = ((Qi1)object).b((int)object8);
                                if (bl2) {
                                    ((tr1_1)object).h((int)object8);
                                } else {
                                    object = pg_12.e;
                                    ((ur1_0)object).b((int)object8);
                                }
                            }
                        }
                        l2 >>= n20;
                    }
                    if (n19 != n20) break;
                }
                if (n4 == n17) break;
                ++n4;
            }
        }
        object3 = GY2.h((GY2)object3, n8 != 0, n10);
        n8 = object3.size();
        object = null;
        for (n3 = 0; n3 < n8; ++n3) {
            GY2 gY23 = (GY2)object3.get(n3);
            object5 = this.c();
            n14 = (int)(((Qi1)object5).a(n7 = gY23.g) ? 1 : 0);
            if (n14 == 0 || (n7 = (int)(((Qi1)object4).a(n14 = gY23.g) ? 1 : 0)) == 0) continue;
            object5 = ((Qi1)object4).c(n14);
            if (object5 != null) {
                object5 = (IY2)object5;
                pg_12.f(gY23, (IY2)object5);
                continue;
            }
            bh1_1.d("node not present in pruned tree before this change");
            throw null;
        }
    }

    public final void g(int n3, String string2) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        if (n4 < n7) {
            return;
        }
        v60 v602 = this.c;
        if (v602 == null) {
            return;
        }
        long l2 = n3;
        AutofillId autofillId = v602.a(l2);
        if (autofillId != null) {
            if (n4 >= n7) {
                ContentCaptureSession contentCaptureSession = t60_0.a(v602.a);
                v60$b.e(contentCaptureSession, autofillId, string2);
            }
            return;
        }
        bh1_1.d("Invalid content capture ID");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(GY2 gY2, IY2 iY2) {
        ur1_0 ur1_02;
        int n3;
        xp1_0 xp1_02;
        Np np;
        le_2 le_22;
        pg_1 pg_12 = this;
        Object object = gY2;
        Object object2 = iY2;
        int n4 = 0;
        Object object3 = null;
        Object object4 = new ur1_0(null);
        int n7 = 1;
        int n8 = 4;
        Object object5 = GY2.h(gY2, n7 != 0, n8);
        int n10 = object5.size();
        int n14 = 0;
        while (true) {
            le_22 = pg_12.j;
            np = pg_12.i;
            xp1_02 = ((GY2)object).c;
            if (n14 >= n10) break;
            GY2 gY22 = (GY2)object5.get(n14);
            Qi1 qi1 = this.c();
            n3 = gY22.g;
            if ((n3 = (int)(qi1.a(n3) ? 1 : 0)) != 0) {
                ur1_02 = ((IY2)object2).b;
                int n15 = gY22.g;
                n3 = (int)(ur1_02.a(n15) ? 1 : 0);
                if (n3 == 0) {
                    boolean bl2 = np.add(xp1_02);
                    if (bl2) {
                        object = Unit.a;
                        le_22.j(object);
                    }
                    return;
                }
                ((ur1_0)object4).b(n15);
            }
            ++n14;
        }
        object2 = ((IY2)object2).b;
        object5 = ((Zi1)object2).b;
        object2 = ((Zi1)object2).a;
        n10 = ((Object)object2).length + -2;
        if (n10 >= 0) {
            n3 = 0;
            ur1_02 = null;
            while (true) {
                Object object6;
                reference var23_25 = object2[n3];
                reference var25_26 = var23_25 ^ (long)-1;
                int n16 = 7;
                var25_26 = var25_26 << n16 & var23_25;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var25_26 &= l2) - l2;
                Object object7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object7 != false) {
                    n4 = ~(n3 - n10) >>> 31;
                    n7 = 8;
                    n4 = 8 - n4;
                    for (n14 = 0; n14 < n4; var23_25 >>= n7, ++n14) {
                        l2 = (long)(var23_25 & 0xFFL);
                        long l3 = 128L;
                        long l4 = l2 - l3;
                        Object object8 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object8 < 0) {
                            n16 = (n3 << 3) + n14;
                            object6 = object5[n16];
                            if ((object6 = (Object)((Zi1)object4).a((int)object6)) == 0) {
                                boolean bl3 = np.add(xp1_02);
                                if (bl3) {
                                    object = Unit.a;
                                    le_22.j(object);
                                }
                                return;
                            }
                        }
                        object6 = 4;
                    }
                    if (n4 != n7) break;
                }
                if (n3 == n10) break;
                ++n3;
                n4 = 0;
                object3 = null;
                n7 = 1;
                object6 = 4;
            }
        }
        int n17 = 1;
        int n18 = 4;
        object = GY2.h((GY2)object, n17 != 0, n18);
        n17 = object.size();
        n3 = 0;
        ur1_02 = null;
        while (n3 < n17) {
            object4 = (GY2)object.get(n3);
            object3 = this.c();
            n4 = ((Qi1)object3).a(n7 = ((GY2)object4).g);
            if (n4 != 0) {
                object3 = pg_12.n;
                n7 = ((GY2)object4).g;
                if ((object3 = ((Qi1)object3).c(n7)) == null) {
                    bh1_1.d("node not present in pruned tree before this change");
                    throw null;
                }
                object3 = (IY2)object3;
                pg_12.h((GY2)object4, (IY2)object3);
            }
            n18 = 0;
            object4 = null;
            ++n3;
        }
        return;
    }

    public final void i(GY2 gY2) {
        int n3;
        float f5;
        int n4;
        Object object;
        int n7;
        Object object2;
        pg_1 pg_12;
        block35: {
            int n8;
            Object object3;
            block39: {
                long l2;
                Object object4;
                long l3;
                float f6;
                int n10;
                int n14;
                LD3 lD3;
                long l4;
                Object object5;
                Object object6;
                int n15;
                int n16;
                int n17;
                block36: {
                    Object object7;
                    Object object8;
                    block38: {
                        block37: {
                            boolean n18;
                            pg_12 = this;
                            object2 = gY2;
                            n7 = this.d();
                            if (n7 == 0) {
                                return;
                            }
                            object3 = gY2.d;
                            object = MY2.x;
                            object = (Boolean)AY2.a((zy2_0)object3, (TY2)object);
                            object8 = this.g;
                            Pg$a pg$a = Pg$a.SHOW_ORIGINAL;
                            if (object8 == pg$a && (n18 = Intrinsics.areEqual(object, object8 = Boolean.TRUE))) {
                                object = yY2.k;
                                if ((object3 = (H1)AY2.a((zy2_0)object3, (TY2)object)) != null && (object3 = (Function1)((H1)object3).b) != null) {
                                    object = Boolean.FALSE;
                                    object3 = (Boolean)object3.invoke(object);
                                }
                            } else {
                                object8 = pg_12.g;
                                pg$a = Pg$a.SHOW_TRANSLATED;
                                if (object8 == pg$a && (n4 = Intrinsics.areEqual(object, object8 = Boolean.FALSE)) != 0 && (object3 = (H1)AY2.a((zy2_0)object3, (TY2)(object = yY2.k))) != null && (object3 = (Function1)((H1)object3).b) != null) {
                                    object = Boolean.TRUE;
                                    object3 = (Boolean)object3.invoke(object);
                                }
                            }
                            object3 = pg_12.c;
                            n4 = 0;
                            f5 = 0.0f;
                            object = null;
                            n17 = 8;
                            n3 = 0;
                            n8 = ((GY2)object2).g;
                            if (object3 == null || (n16 = Build.VERSION.SDK_INT) < (n15 = 29) || (object6 = FC3.a((View)pg_12.a)) == null) break block36;
                            object7 = gY2.j();
                            if (object7 == null) break block37;
                            object5 = ((GY2)object7).g;
                            l4 = object5;
                            object6 = ((v60)object3).a(l4);
                            if (object6 != null) break block38;
                            break block36;
                        }
                        object6 = g2.a(((Zs)object6).a);
                    }
                    long l7 = n8;
                    if (n16 >= n15) {
                        object3 = v60$b.c(t60_0.a(((v60)object3).a), (AutofillId)object6, l7);
                        lD3 = new LD3((ViewStructure)object3);
                    } else {
                        n15 = 0;
                        lD3 = null;
                    }
                    if (lD3 != null) {
                        object3 = MY2.D;
                        object6 = ((GY2)object2).d;
                        object7 = ((zy2_0)object6).a;
                        n7 = (int)(object7.containsKey(object3) ? 1 : 0);
                        if (n7 == 0) {
                            float f7;
                            float f8;
                            int n18;
                            Object object9;
                            Object object10;
                            object3 = lD3.a;
                            n14 = 23;
                            if (n16 >= n14) {
                                object10 = LD3$a.a(u60.a(object3));
                            } else {
                                n10 = 0;
                                object10 = null;
                                f6 = 0.0f;
                            }
                            if (object10 != null) {
                                object9 = "android.view.contentcapture.EventTimestamp";
                                l3 = pg_12.m;
                                object10.putLong((String)object9, l3);
                            }
                            object10 = MY2.u;
                            if ((object10 = (String)AY2.a((zy2_0)object6, (TY2)object10)) != null && n16 >= n14) {
                                object9 = u60.a(object3);
                                LD3$a.e((ViewStructure)object9, n8, (String)object10);
                            }
                            object10 = MY2.v;
                            object10 = (List)AY2.a((zy2_0)object6, (TY2)object10);
                            int n19 = 62;
                            String string2 = "\n";
                            if (object10 != null) {
                                if (n16 >= n14) {
                                    object4 = u60.a(object3);
                                    object8 = "android.widget.TextView";
                                    LD3$a.b(object4, (String)object8);
                                }
                                object8 = jv1_0.a((List)object10, string2, null, n19);
                                if (n16 >= n14) {
                                    object10 = u60.a(object3);
                                    LD3$a.f((ViewStructure)object10, (CharSequence)object8);
                                }
                            }
                            object8 = MY2.y;
                            if ((object8 = (Sl)AY2.a((zy2_0)object6, (TY2)object8)) != null) {
                                if (n16 >= n14) {
                                    object10 = u60.a(object3);
                                    object4 = "android.widget.EditText";
                                    LD3$a.b((ViewStructure)object10, (String)object4);
                                }
                                if (n16 >= n14) {
                                    object10 = u60.a(object3);
                                    LD3$a.f((ViewStructure)object10, (CharSequence)object8);
                                }
                            }
                            object8 = MY2.b;
                            if ((object8 = (List)AY2.a((zy2_0)object6, (TY2)object8)) != null) {
                                object8 = jv1_0.a((List)object8, string2, null, n19);
                                if (n16 >= n14) {
                                    object10 = u60.a(object3);
                                    LD3$a.c((ViewStructure)object10, (CharSequence)object8);
                                }
                            }
                            object8 = MY2.t;
                            if ((object8 = (CP2)AY2.a((zy2_0)object6, (TY2)object8)) != null && (object8 = VY2.g(n18 = ((CP2)object8).a)) != null && n16 >= n14) {
                                object10 = u60.a(object3);
                                LD3$a.b((ViewStructure)object10, (String)object8);
                            }
                            if ((object8 = VY2.c((zy2_0)object6)) != null) {
                                object8 = ((Tl3)object8).a;
                                object6 = ((Sl3)object8).b.a;
                                l2 = ((S93)object6).b;
                                f8 = Dm3.c(l2);
                                object8 = ((Sl3)object8).g;
                                f6 = object8.getDensity() * f8;
                                f7 = object8.H0() * f6;
                                if (n16 >= n14) {
                                    object6 = u60.a(object3);
                                    LD3$a.g((ViewStructure)object6, f7, 0, 0, 0);
                                }
                            }
                            object8 = gY2.j();
                            object6 = aG2.e;
                            if (object8 != null && (object10 = gY2.c()) != null) {
                                object9 = ((w32_0)object10).j1();
                                n19 = (int)(((LP1$c)object9).m ? 1 : 0);
                                if (n19 != 0) {
                                    object = object10;
                                }
                                if (object != null) {
                                    object8 = go0.d(((GY2)object8).a, n17);
                                    object5 = 1;
                                    f8 = Float.MIN_VALUE;
                                    object6 = object = ((w32_0)object8).G((zp1)object, (boolean)object5);
                                }
                            }
                            f5 = ((aG2)object6).a;
                            n4 = (int)f5;
                            f7 = ((aG2)object6).b;
                            int n20 = (int)f7;
                            f6 = ((aG2)object6).d();
                            n10 = (int)f6;
                            f8 = ((aG2)object6).c();
                            object5 = (int)f8;
                            if (n16 >= n14) {
                                ViewStructure viewStructure = u60.a(object3);
                                LD3$a.d(viewStructure, n4, n20, 0, 0, n10, object5);
                            }
                            object = lD3;
                        }
                    }
                }
                if (object == null) break block35;
                object3 = pg_12.e;
                boolean bl2 = ((Zi1)object3).a(n8);
                if (!bl2) break block39;
                f5 = -8.293031E7f;
                n4 = -862048943 * n8;
                int n22 = n4 << 16;
                n22 = (n4 ^= n22) & 0x7F;
                n16 = ((Zi1)object3).c;
                n4 = n4 >>> 7 & n16;
                n15 = 0;
                lD3 = null;
                while (true) {
                    block40: {
                        long l8;
                        block34: {
                            long l12;
                            long l14;
                            object6 = ((Zi1)object3).a;
                            n14 = n4 >> 3;
                            n10 = (n4 & 7) << 3;
                            reference var40_41 = object6[n14] >>> n10;
                            int n24 = 1;
                            Object object11 = object6[n14 += n24];
                            object5 = 64 - n10;
                            l4 = (long)(object11 << object5);
                            long l15 = -((long)n10);
                            n10 = 63;
                            f6 = 8.8E-44f;
                            l15 = l15 >> n10 & l4 | var40_41;
                            l4 = n22;
                            l2 = 0x101010101010101L;
                            l4 = l4 * l2 ^ l15;
                            l2 = l4 - l2;
                            l4 = (l4 ^ (long)-1) & l2;
                            l2 = -9187201950435737472L;
                            l4 &= l2;
                            while ((l8 = (l14 = l4 - (l12 = 0L)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) {
                                object4 = ((Zi1)object3).b;
                                l8 = (Long.numberOfTrailingZeros(l4) >> 3) + n4 & n16;
                                n24 = (int)object4[l8];
                                if (n24 != n8) {
                                    l3 = l4 - 1L;
                                    l4 &= l3;
                                    continue;
                                }
                                break block34;
                            }
                            l4 = l15 ^ (long)-1;
                            l8 = 6;
                            long l16 = (l15 = l15 & (l4 <<= l8) & l2) - l12;
                            object5 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                            if (object5 == 0) break block40;
                            l8 = -1;
                        }
                        if (l8 >= 0) {
                            ((ur1_0)object3).f((int)l8);
                        }
                        break block35;
                    }
                    n17 = 8;
                    n4 = n4 + (n15 += n17) & n16;
                    n3 = 0;
                }
            }
            object3 = pg_12.d;
            ((tr1_1)object3).i(n8, object);
        }
        n4 = 1;
        f5 = Float.MIN_VALUE;
        object2 = GY2.h((GY2)object2, n4 != 0, 4);
        n7 = object2.size();
        for (n3 = 0; n3 < n7; ++n3) {
            object = (GY2)object2.get(n3);
            pg_12.i((GY2)object);
        }
    }

    public final void j(GY2 object) {
        int n3 = this.d();
        if (n3 == 0) {
            return;
        }
        Object object2 = this.d;
        n3 = ((GY2)object).g;
        boolean bl2 = ((Qi1)object2).b(n3);
        if (bl2) {
            ((tr1_1)object2).h(n3);
        } else {
            object2 = this.e;
            ((ur1_0)object2).b(n3);
        }
        object = GY2.h((GY2)object, true, 4);
        n3 = object.size();
        object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            GY2 gY2 = (GY2)object.get(i3);
            this.j(gY2);
        }
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void onStart(mu1_1 object) {
        this.c = object = (v60)this.b.invoke();
        object = this.a.getSemanticsOwner().a();
        this.i((GY2)object);
        this.e();
    }

    public final void onStop(mu1_1 object) {
        object = this.a.getSemanticsOwner().a();
        this.j((GY2)object);
        this.e();
        this.c = null;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        view = this.k;
        Og og = this.q;
        view.removeCallbacks((Runnable)og);
        this.c = null;
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

