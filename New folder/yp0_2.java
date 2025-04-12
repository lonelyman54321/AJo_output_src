/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YP0
 */
public final class yp0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (qz1_2)object;
                Intrinsics.checkNotNullParameter(object, "$viewModel");
                object.getClass();
                LinkedHashMap<Boolean, Object> linkedHashMap = new LinkedHashMap<Boolean, Object>();
                Boolean bl2 = Boolean.FALSE;
                linkedHashMap.put(bl2, null);
                ((qz1_2)object).j.setValue(linkedHashMap);
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = fq0_2.Companion;
        object = (fq0_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = (Boolean)((fq0_2)object).Qa().d.getValue();
        n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            boolean bl3;
            object2 = ((fq0_2)object).q;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                n3 = 0;
                object2 = null;
            }
            Object object3 = ((fq0_2)object).Qa().c;
            ArrayList<String> arrayList = new ArrayList<String>();
            Intrinsics.checkNotNullParameter(object3, "<this>");
            String string2 = "destination";
            Intrinsics.checkNotNullParameter(arrayList, string2);
            object3 = ((ArrayList)object3).iterator();
            while (bl3 = object3.hasNext()) {
                string2 = object3.next();
                if (string2 == null) continue;
                arrayList.add(string2);
            }
            object3 = "STORY";
            ((dr0_0)object2).f0((String)object3, (String)object3, arrayList);
            object = ((fq0_2)object).Qa();
            object2 = Boolean.FALSE;
            object = ((f23_0)object).d;
            object.getClass();
            ((kb3_2)object).k(null, object2);
        }
        return Unit.a;
    }
}

