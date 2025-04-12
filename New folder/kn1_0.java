/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from KN1
 */
public final class kn1_0
extends zr1_1 {
    public final CR2 l;

    public kn1_0() {
        CR2 cR2;
        this.l = cR2 = new CR2();
    }

    public final void g() {
        Iterator iterator = this.l.iterator();
        while (true) {
            Object object = iterator;
            object = (CR2$e)iterator;
            boolean bl2 = ((CR2$e)object).hasNext();
            if (!bl2) break;
            object = (KN1$a)((Map.Entry)((CR2$e)object).next()).getValue();
            LiveData liveData = ((KN1$a)object).a;
            liveData.f((F62)object);
        }
    }

    public final void h() {
        Iterator iterator = this.l.iterator();
        while (true) {
            Object object = iterator;
            object = (CR2$e)iterator;
            boolean bl2 = ((CR2$e)object).hasNext();
            if (!bl2) break;
            object = (KN1$a)((Map.Entry)((CR2$e)object).next()).getValue();
            LiveData liveData = ((KN1$a)object).a;
            liveData.j((F62)object);
        }
    }

    public final void l(LiveData object, F62 f62) {
        if (object != null) {
            F62 f622;
            KN1$a kN1$a = new KN1$a((LiveData)object, f62);
            KN1$a kN1$a2 = (KN1$a)this.l.c(object, kN1$a);
            if (kN1$a2 != null && (f622 = kN1$a2.b) != f62) {
                object = new IllegalArgumentException("This source was already added with the different observer");
                throw object;
            }
            if (kN1$a2 != null) {
                return;
            }
            int n3 = this.c;
            if (n3 > 0) {
                ((LiveData)object).f(kN1$a);
            }
            return;
        }
        object = new NullPointerException("source cannot be null");
        throw object;
    }
}

