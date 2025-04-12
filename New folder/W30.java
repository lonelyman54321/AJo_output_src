/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.g;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.c$b;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.d$c;
import androidx.media3.exoplayer.source.d$d;
import androidx.media3.exoplayer.source.d$e;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.s$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public final class W30
implements Handler.Callback {
    public final /* synthetic */ d a;

    public /* synthetic */ W30(d d2) {
        this.a = d2;
    }

    public final boolean handleMessage(Message object) {
        int n3 = -1;
        int n4 = 1;
        d d2 = this.a;
        d2.getClass();
        int n7 = object.what;
        Collection<Object> collection = d2.n;
        switch (n7) {
            default: {
                object = new IllegalStateException();
                throw object;
            }
            case 6: {
                object = object.obj;
                n3 = gz3.a;
                object = (Set)object;
                d2.G((Set)object);
                break;
            }
            case 5: {
                d2.M();
                break;
            }
            case 4: {
                s s7;
                object = object.obj;
                n3 = gz3.a;
                object = (d$e)object;
                d2.t = s7 = (s)object.b;
                object = object.c;
                d2.L((d$c)object);
                break;
            }
            case 3: {
                object = object.obj;
                n3 = gz3.a;
                object = (d$e)object;
                Object object2 = d2.t;
                n7 = object.a;
                int n8 = n7 + 1;
                object2 = object2.a(n7, n8);
                d2.t = object2;
                Object object3 = (Integer)object.b;
                n8 = (Integer)object3;
                object2 = ((s$a)object2).g(n8, n4);
                d2.t = object2;
                n3 = (Integer)object3;
                n7 = object.a;
                int n10 = Math.max(n7, n3);
                d$d d$d = (d$d)((ArrayList)collection).get(n8);
                int n14 = d$d.e;
                object3 = (d$d)((ArrayList)collection).remove(n7);
                ((ArrayList)collection).add(n3, object3);
                for (n8 = Math.min(n7, n3); n8 <= n10; n8 += n4) {
                    object2 = (d$d)((ArrayList)collection).get(n8);
                    ((d$d)object2).d = n8;
                    ((d$d)object2).e = n14;
                    object2 = ((d$d)object2).a.o.b;
                    n3 = ((g)object2).p();
                    n14 += n3;
                }
                object = object.c;
                d2.L((d$c)object);
                break;
            }
            case 2: {
                Object object4;
                int n15;
                object = object.obj;
                n7 = gz3.a;
                object = (d$e)object;
                n7 = object.a;
                Integer n16 = (Integer)object.b;
                int n17 = n16;
                if (n7 == 0 && n17 == (n15 = (object4 = d2.t).getLength())) {
                    object4 = d2.t.e();
                    d2.t = object4;
                } else {
                    object4 = d2.t.a(n7, n17);
                    d2.t = object4;
                }
                n17 -= n4;
                while (n17 >= n7) {
                    object4 = (d$d)((ArrayList)collection).remove(n17);
                    Object object5 = d2.p;
                    Object object6 = ((d$d)object4).b;
                    ((HashMap)object5).remove(object6);
                    int n18 = -((d$d)object4).a.o.b.p();
                    d2.E(n17, n3, n18);
                    ((d$d)object4).f = n4;
                    object5 = ((d$d)object4).c;
                    n18 = (int)(((ArrayList)object5).isEmpty() ? 1 : 0);
                    if (n18 != 0) {
                        d2.q.remove(object4);
                        object4 = (c$b)d2.h.remove(object4);
                        object4.getClass();
                        object5 = ((c$b)object4).a;
                        object6 = ((c$b)object4).b;
                        object5.j((j$c)object6);
                        object4 = ((c$b)object4).c;
                        object5.b((k)object4);
                        object5.e((b)object4);
                    }
                    n17 += n3;
                }
                object = object.c;
                d2.L((d$c)object);
                break;
            }
            case 1: {
                object = object.obj;
                n3 = gz3.a;
                object = (d$e)object;
                s s8 = d2.t;
                n7 = object.a;
                collection = (Collection)object.b;
                int n19 = collection.size();
                d2.t = s8 = s8.g(n7, n19);
                n3 = object.a;
                d2.C(n3, collection);
                object = object.c;
                d2.L((d$c)object);
            }
        }
        return n4 != 0;
    }
}

