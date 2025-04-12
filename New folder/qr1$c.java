/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class qr1$c
implements gr1_0 {
    public final /* synthetic */ qr1_0 a;

    public qr1$c(qr1_0 qr1_02) {
        this.a = qr1_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList a(int n3) {
        Throwable throwable2;
        v83_0 v83_02;
        Function1 function1;
        v83_0 v83_03;
        block3: {
            Object object;
            ArrayList arrayList = new ArrayList();
            qr1_0 qr1_02 = this.a;
            v83_03 = v83$a.a();
            function1 = v83_03 != null ? v83_03.f() : null;
            v83_02 = v83$a.b(v83_03);
            try {
                Object object2 = qr1_02.c;
                object2 = ((h83_0)object2).getValue();
                object2 = (cr1_0)object2;
                object2 = ((cr1_0)object2).h;
                object = n3;
                object = object2.invoke(object);
                object = (List)object;
                int n4 = object.size();
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object3 = object.get(i3);
                    object3 = (Pair)object3;
                    xs1 xs12 = qr1_02.m;
                    Object object4 = ((Pair)object3).a;
                    object4 = (Number)object4;
                    int n7 = ((Number)object4).intValue();
                    object3 = ((Pair)object3).b;
                    object3 = (c60)object3;
                    long l2 = ((c60)object3).a;
                    object3 = xs12.a(n7, l2);
                    arrayList.add(object3);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object = Unit.a;
            v83$a.e(v83_03, v83_02, function1);
            return arrayList;
        }
        v83$a.e(v83_03, v83_02, function1);
        throw throwable2;
    }
}

