/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.source.j$a;
import com.google.common.base.Supplier;
import java.util.HashMap;

public final class e$a {
    public final hi0_0 a;
    public final HashMap b;
    public final HashMap c;
    public DataSource$Factory d;
    public boolean e;
    public vf3$a_0 f;

    public e$a(ll0_0 hashMap, jn0_0 jn0_02) {
        this.a = hashMap;
        this.f = jn0_02;
        this.b = hashMap = new HashMap();
        this.c = hashMap = new HashMap();
        this.e = true;
    }

    public final j$a a(int n3) {
        HashMap hashMap = this.c;
        Object object = n3;
        if ((object = (j$a)hashMap.get(object)) != null) {
            return object;
        }
        object = (j$a)this.b(n3).get();
        jn0_0 jn0_02 = (jn0_0)this.f;
        object.a(jn0_02);
        boolean bl2 = this.e;
        object.f(bl2);
        Integer n4 = n3;
        hashMap.put(n4, object);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Supplier b(int n3) {
        Object object;
        HashMap hashMap;
        block4: {
            void var8_11;
            block8: {
                Class<j$a> clazz;
                block5: {
                    block6: {
                        block7: {
                            hashMap = this.b;
                            clazz = n3;
                            if ((clazz = (Supplier)hashMap.get(clazz)) != null) {
                                return clazz;
                            }
                            clazz = this.d;
                            clazz.getClass();
                            object = j$a.class;
                            if (n3 == 0) break block5;
                            int n4 = 1;
                            if (n3 == n4) break block6;
                            n4 = 2;
                            if (n3 == n4) break block7;
                            n4 = 3;
                            if (n3 != n4) {
                                int n7 = 4;
                                if (n3 != n7) {
                                    String string2 = hj0_0.a(n3, "Unrecognized contentType: ");
                                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                                    throw illegalArgumentException;
                                }
                                object = new sm0_0(this, (DataSource$Factory)((Object)clazz));
                                break block4;
                            } else {
                                clazz = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(object);
                                object = new rm0_0(clazz);
                            }
                            break block4;
                        }
                        object = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(object);
                        qm0 qm02 = new qm0((Class)object, (DataSource$Factory)((Object)clazz));
                        break block8;
                    }
                    object = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(object);
                    pm0 pm02 = new pm0((Class)object, (DataSource$Factory)((Object)clazz));
                    break block8;
                }
                object = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(object);
                om0_0 om0_02 = new om0_0((Class)object, (DataSource$Factory)((Object)clazz));
            }
            object = var8_11;
        }
        Integer n8 = n3;
        hashMap.put(n8, object);
        return object;
    }
}

