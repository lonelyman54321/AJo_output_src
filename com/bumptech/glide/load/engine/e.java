/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.bumptech.glide.load.engine;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.Registry$NoResultEncoderAvailableException;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.DecodeJob$a;
import com.bumptech.glide.load.engine.DecodeJob$c;
import com.bumptech.glide.load.engine.DecodeJob$d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class e {
    public final Class a;
    public final List b;
    public final RK2 c;
    public final yw2 d;
    public final String e;

    public e(Class object, Class object2, Class clazz, List object3, RK2 rK2, yw2 yw22) {
        this.a = object;
        this.b = object3;
        this.c = rK2;
        this.d = yw22;
        object3 = new StringBuilder("Failed DecodePath{");
        object = ((Class)object).getSimpleName();
        ((StringBuilder)object3).append((String)object);
        object = "->";
        ((StringBuilder)object3).append((String)object);
        object2 = ((Class)object2).getSimpleName();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append((String)object);
        object = clazz.getSimpleName();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append("}");
        this.e = object = ((StringBuilder)object3).toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 a(int n3, int n4, Z92 z92, a a2, DecodeJob$c decodeJob$c) {
        qn1_0 qn1_02;
        int n7;
        qn1_0 qn1_03;
        Object object;
        Class<?> clazz;
        Object object2;
        Object object3;
        int n8;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        e e2;
        block15: {
            int n10;
            e2 = this;
            object8 = decodeJob$c;
            object7 = this.d;
            object6 = object7.b();
            dV0.c(object6, "Argument must not be null");
            object5 = object6;
            object5 = (List)object6;
            object6 = this;
            object4 = a2;
            n8 = n3;
            object3 = z92;
            object2 = object5;
            try {
                object6 = this.b(a2, n3, n4, z92, (List)object5);
                object7.a(object5);
            }
            catch (Throwable throwable) {
                object6 = throwable;
                object7.a(object5);
                throw throwable;
            }
            object4 = decodeJob$c.b;
            object4.getClass();
            clazz = object6.get().getClass();
            pi0_0 pi0_02 = pi0_0.RESOURCE_DISK_CACHE;
            object8 = decodeJob$c.a;
            object = ((DecodeJob)object4).a;
            object3 = null;
            if (object8 != pi0_02) {
                xq3_0 xq3_02 = ((d)object).f(clazz);
                object2 = ((DecodeJob)object4).h;
                int n14 = ((DecodeJob)object4).l;
                n10 = ((DecodeJob)object4).m;
                object2 = xq3_02.a((Context)object2, (wk2_0)object6, n14, n10);
                xq3_0 xq3_03 = xq3_02;
            } else {
                object2 = object6;
                Object var20_31 = null;
            }
            n8 = (int)(object6.equals(object2) ? 1 : 0);
            if (n8 == 0) {
                object6.a();
            }
            object6 = ((d)object).c.b().d;
            Class clazz2 = object2.c();
            if ((object6 = ((FK2)object6).a(clazz2)) != null) {
                object6 = ((d)object).c.b();
                object6.getClass();
                Class clazz3 = object2.c();
                object6 = ((Registry)object6).d;
                object3 = ((FK2)object6).a(clazz3);
                if (object3 == null) {
                    object6 = object2.c();
                    object8 = new Registry$NoResultEncoderAvailableException((Class)object6);
                    throw object8;
                }
                object6 = ((DecodeJob)object4).o;
                object6 = object3.a((Z92)object6);
            } else {
                object6 = cz0_0.NONE;
            }
            qn1_0 qn1_04 = ((DecodeJob)object4).w;
            object7 = ((d)object).b();
            n10 = ((ArrayList)object7).size();
            int n15 = 0;
            qn1_03 = null;
            while (true) {
                n7 = 1;
                if (n15 >= n10) break;
                qn1_02 = ((BP1$a)((ArrayList)object7).get((int)n15)).a;
                boolean bl2 = qn1_02.equals(qn1_04);
                if (bl2) {
                    n8 = 1;
                    break block15;
                }
                ++n15;
            }
            n8 = 0;
            Object var16_24 = null;
        }
        object7 = ((DecodeJob)object4).n;
        boolean bl3 = ((Nq0)object7).d((n8 ^= n7) != 0, (pi0_0)((Object)object8), (cz0_0)((Object)object6));
        if (bl3) {
            void var26_42;
            if (object3 == null) {
                object6 = object2.get().getClass();
                object8 = new Registry$NoResultEncoderAvailableException((Class)object6);
                throw object8;
            }
            object8 = DecodeJob$a.c;
            n8 = ((Enum)object6).ordinal();
            Object object9 = object8[n8];
            if (object9 != n7) {
                void var20_32;
                n8 = 2;
                if (object9 != n8) {
                    object4 = new StringBuilder("Unknown strategy: ");
                    ((StringBuilder)object4).append(object6);
                    object6 = ((StringBuilder)object4).toString();
                    object8 = new IllegalArgumentException((String)object6);
                    throw object8;
                }
                object5 = ((d)object).c.a;
                qn1_03 = ((DecodeJob)object4).w;
                qn1_02 = ((DecodeJob)object4).i;
                int n16 = ((DecodeJob)object4).l;
                n8 = ((DecodeJob)object4).m;
                object = ((DecodeJob)object4).o;
                object7 = object8;
                boolean bl4 = true;
                n7 = n16;
                n16 = 0;
                object6 = object8 = new yk2_2((Kp)object5, qn1_03, qn1_02, n7, n8, (xq3_0)var20_32, clazz, (Z92)object);
                n8 = 0;
                Object var16_25 = null;
            } else {
                boolean bl5 = true;
                n8 = 0;
                Object var16_26 = null;
                object = ((DecodeJob)object4).w;
                object7 = ((DecodeJob)object4).i;
                object6 = new ci0((qn1_0)object, (qn1_0)object7);
            }
            object = (dw1_0)dw1_0.e.b();
            ((dw1_0)object).d = false;
            ((dw1_0)object).c = var26_42;
            ((dw1_0)object).b = object2;
            object8 = ((DecodeJob)object4).f;
            ((DecodeJob$d)object8).a = object6;
            ((DecodeJob$d)object8).b = object3;
            ((DecodeJob$d)object8).c = object;
            object2 = object;
        }
        object8 = e2.c;
        object6 = z92;
        return object8.a((wk2_0)object2, z92);
    }

    public final wk2_0 b(a object, int n3, int n4, Z92 z92, List list) {
        List list2 = this.b;
        int n7 = list2.size();
        wk2_0 wk2_02 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            block10: {
                BK2 bK2 = (BK2)list2.get(i3);
                Object object2 = object.a();
                boolean bl2 = bK2.a(object2, z92);
                if (!bl2) break block10;
                object2 = object.a();
                try {
                    wk2_02 = bK2.b(object2, n3, n4, z92);
                    break block10;
                }
                catch (OutOfMemoryError outOfMemoryError) {
                }
                catch (RuntimeException runtimeException) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                String string2 = "DecodePath";
                int n8 = 2;
                boolean bl3 = Log.isLoggable((String)string2, (int)n8);
                if (bl3) {
                    Objects.toString(bK2);
                }
                list.add(object2);
            }
            if (wk2_02 != null) break;
        }
        if (wk2_02 != null) {
            return wk2_02;
        }
        ArrayList arrayList = new ArrayList(list);
        String string3 = this.e;
        object = new GlideException(string3, arrayList);
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecodePath{ dataClass=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", decoders=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", transcoder=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

