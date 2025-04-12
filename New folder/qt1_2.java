/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import androidx.navigation.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QT1
 */
public final class qt1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ gr3 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ A20 e;

    public qt1_2(gr3 gr32, yT1 yT12, Map map2, ib3_0 ib3_02, A20 a20, f80_0 f80_02) {
        this.a = gr32;
        this.b = yT12;
        this.c = map2;
        this.d = ib3_02;
        this.e = a20;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ib3_0 ib3_02 = this.d;
        A20 a20 = this.e;
        gr3 gr32 = this.a;
        yT1 yT12 = this.b;
        Map map2 = this.c;
        object = new qt1_2(gr32, yT12, map2, ib3_02, a20, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qt1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qt1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object iterator) {
        Object object = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(iterator);
        iterator = this.a;
        object = ((gr3)((Object)iterator)).a.a();
        iterator = ((gr3)((Object)iterator)).d;
        Object object2 = ((h83_0)((Object)iterator)).getValue();
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2 && ((object2 = ((e)(object = this.b)).g()) == null || (bl2 = Intrinsics.areEqual(object2 = ((h83_0)((Object)iterator)).getValue(), object = ((e)object).g())))) {
            boolean bl3;
            Object object3;
            boolean bl4;
            object = ((Iterable)((List)this.d.getValue())).iterator();
            while (bl4 = object.hasNext()) {
                object2 = (d)object.next();
                object3 = this.e.b();
                ((kU1)object3).b((d)object2);
            }
            object = new LinkedHashMap();
            object2 = this.c;
            object3 = object2.entrySet().iterator();
            while (bl3 = object3.hasNext()) {
                String string2;
                Map.Entry entry = (Map.Entry)object3.next();
                Object k2 = entry.getKey();
                boolean bl5 = Intrinsics.areEqual(k2, string2 = ((d)((h83_0)((Object)iterator)).getValue()).f) ^ true;
                if (!bl5) continue;
                k2 = entry.getKey();
                entry = entry.getValue();
                object.put(k2, entry);
            }
            iterator = ((LinkedHashMap)object).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object = iterator.next().getKey();
                object2.remove(object);
            }
        }
        return Unit.a;
    }
}

