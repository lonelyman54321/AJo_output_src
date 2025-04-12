/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.c;
import androidx.media3.common.c$a;
import java.util.Iterator;

public final class tv1
implements Handler.Callback {
    public final /* synthetic */ vv1_0 a;

    public /* synthetic */ tv1(vv1_0 vv1_02) {
        this.a = vv1_02;
    }

    public final boolean handleMessage(Message object) {
        boolean bl2;
        object = this.a;
        Iterator iterator = object.d.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2 = (vv1$c)iterator.next();
            boolean bl3 = ((vv1$c)object2).d;
            if (!bl3 && (bl3 = ((vv1$c)object2).c)) {
                c c2 = ((vv1$c)object2).b.b();
                Object object3 = new c$a();
                ((vv1$c)object2).b = object3;
                ((vv1$c)object2).c = false;
                object2 = ((vv1$c)object2).a;
                object3 = object.c;
                object3.a(object2, c2);
            }
            if (!(bl2 = (object2 = object.b).a())) continue;
        }
        return true;
    }
}

