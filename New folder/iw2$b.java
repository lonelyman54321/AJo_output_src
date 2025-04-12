/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.MotionEvent
 */
import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

public final class iw2$b
extends tv_0 {
    public iw2$a c;
    public final /* synthetic */ iw2_1 d;

    public iw2$b(iw2_1 object) {
        this.d = object;
        object = iw2$a.Unknown;
        this.c = object;
    }

    public final void d(mv2_0 object) {
        String string2;
        Object object2;
        block13: {
            block12: {
                boolean bl2;
                iw2_1 iw2_12;
                long l2;
                object2 = ((mv2_0)object).a;
                int n3 = object2.size();
                int n4 = 0;
                iw2$b$a iw2$b$a = null;
                int n7 = 0;
                Object object3 = null;
                while (true) {
                    string2 = "layoutCoordinates not set";
                    l2 = 0L;
                    iw2_12 = this.d;
                    bl2 = true;
                    if (n7 >= n3) break;
                    aw2_0 aw2_02 = (aw2_0)object2.get(n7);
                    boolean bl3 = aw2_02.b();
                    if (bl3) {
                        object2 = this.c;
                        iw2$a iw2$a = iw2$a.Dispatching;
                        if (object2 == iw2$a) {
                            object2 = (zp1)this.b;
                            if (object2 != null) {
                                long l3 = object2.a0(l2);
                                iw2$b$a = new iw2$b$a(iw2_12);
                                bu_2.b((mv2_0)object, l3, iw2$b$a, bl2);
                            } else {
                                object2 = string2.toString();
                                object = new IllegalStateException((String)object2);
                                throw object;
                            }
                        }
                        object = iw2$a.NotDispatching;
                        this.c = object;
                        break block12;
                    }
                    ++n7;
                }
                Object object4 = (zp1)this.b;
                if (object4 == null) break block13;
                long l4 = object4.a0(l2);
                object4 = new iw2$b$b(this, iw2_12);
                bu_2.b((mv2_0)object, l4, (Function1)object4, false);
                object4 = this.c;
                object3 = iw2$a.Dispatching;
                if (object4 == object3) {
                    n3 = object2.size();
                    while (n4 < n3) {
                        object3 = (aw2_0)object2.get(n4);
                        ((aw2_0)object3).a();
                        ++n4;
                    }
                    object = ((mv2_0)object).b;
                    if (object != null) {
                        boolean bl4;
                        ((zj1)object).c = bl4 = iw2_12.d ^ bl2;
                    }
                }
            }
            return;
        }
        object2 = string2.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void e() {
        Object object = this.c;
        Object object2 = iw2$a.Dispatching;
        if (object == object2) {
            long l2 = SystemClock.uptimeMillis();
            object2 = this.d;
            object = new iw2$b$c((iw2_1)object2);
            int n3 = 3;
            MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)n3, (float)0.0f, (float)0.0f, (int)0);
            motionEvent.setSource(0);
            ((iw2$b$c)object).invoke(motionEvent);
            motionEvent.recycle();
            this.c = object = iw2$a.Unknown;
            ((iw2_1)object2).d = false;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(mv2_0 var1_1, Nv2 var2_2) {
        block11: {
            var3_3 = var1_1 /* !! */ .a;
            var4_4 = this.d;
            var5_5 = var4_4.d;
            if (var5_5 == 0) {
                var5_5 = var3_3.size();
                var7_7 = null;
                for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                    var8_8 /* !! */  = (aw2_0)var3_3.get(var6_6);
                    var9_9 = si0_2.a((aw2_0)var8_8 /* !! */ );
                    if (!var9_9 && !(var10_10 = si0_2.c((aw2_0)var8_8 /* !! */ ))) {
                        continue;
                    }
                    ** break block10
                }
                var5_5 = 0;
                var11_11 = null;
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = 1;
            }
            var7_7 = this.c;
            var8_8 /* !! */  = iw2$a.NotDispatching;
            if (var7_7 != var8_8 /* !! */ ) {
                var7_7 = Nv2.Initial;
                if (var2_2 == var7_7 && var5_5 != 0) {
                    this.d(var1_1 /* !! */ );
                }
                if (var2_2 == (var7_7 = Nv2.Final) && var5_5 == 0) {
                    this.d(var1_1 /* !! */ );
                }
            }
            if (var2_2 == (var1_1 /* !! */  = Nv2.Final)) {
                var12_12 = var3_3.size();
                var2_2 = null;
                for (var13_13 = 0; var13_13 < var12_12; ++var13_13) {
                    var11_11 = (aw2_0)var3_3.get(var13_13);
                    var5_5 = (int)si0_2.c(var11_11);
                    if (var5_5 != 0) {
                        continue;
                    }
                    break block11;
                }
                var1_1 /* !! */  = iw2$a.Unknown;
                this.c = var1_1 /* !! */ ;
                var4_4.d = false;
            }
        }
    }
}

