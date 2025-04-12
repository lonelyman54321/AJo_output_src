/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.io.IOException;

/*
 * Renamed from tl0
 */
public final class tl0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tl0_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                je je2 = ((k)this.b).c;
                ImmutableCollection immutableCollection = ((ImmutableList$Builder)this.c).build();
                j$b j$b = (j$b)this.d;
                je2.X((ImmutableList)immutableCollection, j$b);
                return;
            }
            case 0: 
        }
        vl0$a vl0$a = ((vl0$a$a)this.b).b;
        Object object = vl0$a.b;
        boolean bl2 = object.a();
        vj_2 vj_22 = (vj_2)this.c;
        if (bl2) {
            String string2 = "Canceled";
            object = new IOException(string2);
            vj_22.b(vl0$a, (Throwable)object);
        } else {
            object = (dl2_2)this.d;
            vj_22.a(vl0$a, (dl2_2)object);
        }
    }
}

