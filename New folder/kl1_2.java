/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;
import in.juspay.hypersdk.core.JsInterface;

/*
 * Renamed from Kl1
 */
public final class kl1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kl1_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                je je2 = ((l$a)this.b).b.h;
                Object object = (Pair)this.c;
                int n4 = (Integer)object.first;
                object = (j$b)object.second;
                jm1_0 jm1_02 = (jm1_0)this.d;
                je2.J(n4, (j$b)object, jm1_02);
                return;
            }
            case 0: 
        }
        String string2 = (String)this.c;
        String string3 = (String)this.d;
        JsInterface.b((JsInterface)this.b, string2, string3);
    }
}

