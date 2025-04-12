/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
package coil.memory;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final ce1_0 a;
    public final hK2 b;

    public c(ce1_0 ce1_02, hK2 hK22) {
        this.a = ce1_02;
        this.b = hK22;
    }

    public static cg3_2 c(se2_0 se2_02, pe1_0 pe1_02, MemoryCache$Key memoryCache$Key, MemoryCache$b object) {
        cg3_2 cg3_22;
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3 = pe1_02.a.getResources();
        Object object4 = ((MemoryCache$b)object).a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources)object3, object4);
        ri0 ri02 = ri0.MEMORY_CACHE;
        object = ((MemoryCache$b)object).b;
        object3 = object.get("coil#disk_cache_key");
        boolean bl4 = object3 instanceof String;
        Object object5 = null;
        if (bl4) {
            object3 = (String)object3;
            object2 = object3;
        } else {
            object2 = null;
        }
        object3 = "coil#is_sampled";
        object = object.get(object3);
        boolean bl5 = object instanceof Boolean;
        if (bl5) {
            object5 = object;
            object5 = (Boolean)object;
        }
        object = null;
        boolean bl6 = object5 != null ? (bl5 = ((Boolean)object5).booleanValue()) : false;
        object3 = m.a;
        bl5 = se2_02 instanceof se2_0;
        if (bl5 && (bl3 = se2_02.g)) {
            bl3 = true;
            bl2 = true;
        } else {
            bl2 = false;
        }
        object3 = cg3_22;
        object4 = pe1_02;
        object5 = memoryCache$Key;
        cg3_22 = new cg3_2((Drawable)bitmapDrawable, pe1_02, ri02, memoryCache$Key, (String)object2, bl6, bl2);
        return cg3_22;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final MemoryCache$b a(pe1_0 pe1_02, MemoryCache$Key memoryCache$Key, B63 b63, WS2 wS2) {
        boolean bl2;
        Object object;
        block20: {
            block18: {
                double d2;
                int n3;
                double d5;
                int n4;
                boolean bl3;
                block22: {
                    int n7;
                    int n8;
                    int n10;
                    int n14;
                    int n15;
                    int n16;
                    block21: {
                        WS2 wS22;
                        Object object2;
                        Bitmap bitmap;
                        Object object3;
                        block19: {
                            Object object4;
                            Object object5;
                            block17: {
                                void var14_20;
                                void var14_16;
                                c c2 = this;
                                object5 = pe1_02;
                                object4 = memoryCache$Key;
                                object3 = b63;
                                object = pe1_02.t;
                                boolean bl4 = ((fj_1)((Object)object)).getReadEnabled();
                                n16 = 0;
                                Object object6 = null;
                                if (!bl4) {
                                    return null;
                                }
                                object = this.a.d();
                                if (object == null) return null;
                                object = object.b(memoryCache$Key);
                                if (object == null) return null;
                                bitmap = ((MemoryCache$b)object).a;
                                Bitmap.Config config = bitmap.getConfig();
                                if (config == null) {
                                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                                }
                                hK2 hK22 = c2.b;
                                hK22.getClass();
                                bl3 = hK2.b((pe1_0)object5, (Bitmap.Config)var14_16);
                                if (!bl3) return null;
                                object2 = ((MemoryCache$b)object).b;
                                Object v4 = object2.get("coil#is_sampled");
                                n15 = v4 instanceof Boolean;
                                if (n15 != 0) {
                                    Boolean bl5 = (Boolean)v4;
                                } else {
                                    bl3 = false;
                                    Object var14_19 = null;
                                }
                                if (var14_20 != null) {
                                    bl3 = var14_20.booleanValue();
                                } else {
                                    bl3 = false;
                                    Object var14_21 = null;
                                }
                                object2 = B63.c;
                                n15 = Intrinsics.areEqual(object3, object2);
                                n14 = 1;
                                if (n15 == 0) break block17;
                                if (bl3) {
                                    return null;
                                }
                                break block18;
                            }
                            object2 = "coil#transformation_size";
                            object4 = (String)((MemoryCache$Key)object4).b.get(object2);
                            if (object4 == null) break block19;
                            object5 = b63.toString();
                            bl2 = Intrinsics.areEqual(object4, object5);
                            break block20;
                        }
                        n4 = bitmap.getWidth();
                        n10 = bitmap.getHeight();
                        object2 = ((B63)object3).a;
                        boolean bl6 = object2 instanceof wq0$a;
                        n8 = -1 >>> 1;
                        if (bl6) {
                            object2 = (wq0$a)object2;
                            n15 = ((wq0$a)object2).a;
                        } else {
                            n15 = -1 >>> 1;
                        }
                        object3 = ((B63)object3).b;
                        boolean bl7 = object3 instanceof wq0$a;
                        if (bl7) {
                            object3 = (wq0$a)object3;
                            n7 = ((wq0$a)object3).a;
                            wS22 = wS2;
                        } else {
                            wS22 = wS2;
                            n7 = -1 >>> 1;
                        }
                        d5 = cj0_0.a(n4, n10, n15, n7, wS22);
                        n3 = j.a(pe1_02);
                        d2 = 1.0;
                        if (n3 == 0) break block21;
                        Object object7 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
                        double d7 = object7 > 0 ? d2 : d5;
                        double d9 = n15;
                        double d12 = (double)n4 * d7;
                        double d13 = (d12 = Math.abs(d9 -= d12)) - d2;
                        n4 = (int)(d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1));
                        if (n4 <= 0) break block18;
                        double d14 = n7;
                        n16 = n10;
                        d12 = n10;
                        double d15 = (d14 = Math.abs(d14 - (d7 *= d12))) - d2;
                        n16 = (int)(d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1));
                        if (n16 > 0) break block22;
                        break block18;
                    }
                    n16 = n10;
                    n10 = -1 << -1;
                    if ((n15 == n10 || n15 == n8 || (n4 = Math.abs(n15 -= n4)) <= n14) && (n7 == n10 || n7 == n8 || (n4 = Math.abs(n7 -= n16)) <= n14)) break block18;
                }
                if ((n4 = (int)(d5 == d2 ? 0 : (d5 < d2 ? -1 : 1))) != 0 && n3 == 0 || (n3 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1)) > 0 && bl3) {
                    return null;
                }
            }
            bl2 = true;
        }
        if (!bl2) return null;
        return object;
    }

    public final MemoryCache$Key b(pe1_0 object, Object map2, ba2 object2, GB0 object3) {
        Object object4;
        String string2;
        int n3;
        int n4;
        Object object5;
        block10: {
            boolean bl2;
            object3 = ((pe1_0)object).e;
            if (object3 != null) {
                return object3;
            }
            object5 = object3 = this.a.getComponents().c;
            object5 = (Collection)object3;
            n4 = object5.size();
            n3 = 0;
            string2 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                object4 = (Pair)object3.get(i3);
                ao1_0 ao1_02 = (ao1_0)((Pair)object4).a;
                object4 = (Class)((Pair)object4).b;
                Class<?> clazz = map2.getClass();
                bl2 = ((Class)object4).isAssignableFrom(clazz);
                if (!bl2) continue;
                Intrinsics.checkNotNull(ao1_02, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                object4 = ao1_02.a(map2, (ba2)object2);
                if (object4 == null) {
                    continue;
                }
                break block10;
            }
            bl2 = false;
            object4 = null;
        }
        if (object4 == null) {
            return null;
        }
        map2 = ((pe1_0)object).D.a;
        int n7 = map2.isEmpty();
        if (n7 != 0) {
            map2 = fh1_2.f();
        } else {
            object3 = new LinkedHashMap();
            map2 = map2.entrySet().iterator();
            while ((n4 = (int)(map2.hasNext() ? 1 : 0)) != 0) {
                object5 = (Hm2$b)((Map.Entry)map2.next()).getValue();
                object5.getClass();
            }
            map2 = object3;
        }
        object = ((pe1_0)object).l;
        n7 = object.isEmpty();
        if (n7 != 0 && (n7 = map2.isEmpty()) != 0) {
            map2 = fh1_2.f();
            object = new MemoryCache$Key((String)object4, map2);
            return object;
        }
        map2 = fh1_2.q(map2);
        object3 = object;
        object3 = (Collection)object;
        n4 = object3.isEmpty() ^ 1;
        if (n4 != 0) {
            n7 = object3.size();
            while (n3 < n7) {
                object5 = (Yq3)object.get(n3);
                string2 = hj0_0.a(n3, "coil#transformation_");
                object5 = object5.a();
                map2.put(string2, object5);
                ++n3;
            }
            object = ((ba2)object2).d.toString();
            object2 = "coil#transformation_size";
            map2.put((String)object2, object);
        }
        object = new MemoryCache$Key((String)object4, map2);
        return object;
    }
}

