/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.D;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from U02
 */
public final class u02_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u02_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                u93_0 u93_02 = (u93_0)this.b;
                Intrinsics.checkNotNullParameter(u93_02, "this$0");
                Object object = u93_0.Pa((u93_0)u93_02).j;
                int n4 = 2;
                Object object2 = new jd2_0(u93_02, n4);
                Intrinsics.checkNotNullParameter(object, "filterApplied");
                Intrinsics.checkNotNullParameter(object2, "function");
                ArrayList<Object> arrayList = new ArrayList<Object>();
                object = (Iterable)((h83_0)object).getValue();
                int n7 = yx_2.o((Iterable)object, 10);
                ArrayList<Object> arrayList2 = new ArrayList<Object>(n7);
                object = object.iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object object3 = (OO2)object.next();
                    Boolean bl2 = ((OO2)object3).b;
                    Boolean bl3 = Boolean.TRUE;
                    boolean bl4 = Intrinsics.areEqual(bl2, bl3);
                    if (bl4) {
                        object3 = StringsKt.toIntOrNull(((OO2)object3).a);
                        if (object3 != null) {
                            n7 = (Integer)object3;
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        object3 = n7;
                        arrayList.add(object3);
                    }
                    object3 = Unit.a;
                    arrayList2.add(object3);
                }
                ((jd2_0)object2).invoke(arrayList);
                object = u93_02.h;
                ((yh0_0)((D)object).getValue()).g();
                object = (yh0_0)((D)object).getValue();
                object2 = Boolean.TRUE;
                ((yh0_0)object).h.setValue(object2);
                u93_02.dismiss();
                return Unit.a;
            }
            case 0: 
        }
        e12_0 e12_02 = (e12_0)this.b;
        Intrinsics.checkNotNullParameter(e12_02, "this$0");
        e12_02 = e12_02.getApplication();
        jo_2 jo_22 = new jo_2((Context)e12_02);
        return jo_22;
    }
}

