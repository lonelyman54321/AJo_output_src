/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.DecodeJob$c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Mv1 {
    public final yw2 a;
    public final List b;
    public final String c;

    public Mv1(Class object, Class object2, Class clazz, List object3, LI0$c lI0$c) {
        this.a = lI0$c;
        boolean bl2 = object3.isEmpty();
        if (!bl2) {
            this.b = object3;
            object3 = new StringBuilder("Failed LoadPath{");
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
            this.c = object = ((StringBuilder)object3).toString();
            return;
        }
        super("Must not be empty.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 a(int n3, int n4, Z92 z92, a a2, DecodeJob.c c2) {
        ArrayList arrayList;
        Mv1 mv1 = this;
        yw2 yw22 = this.a;
        Object object = yw22.b();
        dV0.c(object, "Argument must not be null");
        Object object2 = object;
        object2 = (List)object;
        try {
            arrayList = this.b;
            int n7 = arrayList.size();
            object = null;
            Object object3 = null;
            for (int i3 = 0; i3 < n7; ++i3) {
                Object object4 = object = arrayList.get(i3);
                object4 = (e)object;
                try {
                    object3 = object = ((e)object4).a(n3, n4, z92, a2, c2);
                }
                catch (GlideException glideException) {
                    object4 = glideException;
                    object2.add(glideException);
                }
                if (object3 != null) break;
            }
            if (object3 != null) {
                yw22.a(object2);
                return object3;
            }
        }
        catch (Throwable throwable) {
            yw22.a(object2);
            throw throwable;
        }
        {
            arrayList = new ArrayList(object2);
            String string2 = mv1.c;
            object = new GlideException(string2, arrayList);
            throw object;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadPath{decodePaths=");
        String string2 = Arrays.toString(this.b.toArray());
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

